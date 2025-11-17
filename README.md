%%{init: {'theme':'dark'}}%%
classDiagram
    %% Abstract Classes and Interfaces
    class User {
        <<abstract>>
        -email : String
        -password : String
    }
    class PaymentProcessor {
        <<interface>>
        +processOrder(Order) PaymentResult
    }
    class Product {
        <<abstract>>
        -productId : String
        -name : String
        -price : Money
        +inStock : Boolean
        +decrementStock() boolean
        +incrementStock() void
    }

    %% Concrete Classes Extending/Inheriting
    class Customer {
        <<extends User>>
        -cart : List~Order~
        +placeOrder(Order) void
    }
    class Admin {
        <<extends User>>
        +manageInventory() void
    }
    class Clothing {
        <<extends Product>>
        -size : String
        -color : String
    }
    class Accessories {
        <<extends Product>>
        -material : String
    }

    %% Repositories
    class OrderRepository {
        +findByCustomerId(String) List~Order~
        +findByCategory(String) List
    }
    class ProductRepository {
        +findByCategory(String) List
    }

    %% Services
    class EmailService {
        +sendEmail(EmailService) void
        +notifyShipment(Order) void
    }
    class InventoryService {
        +reserveStock(Product) void
        +commitReservation(String) void
        +releaseStock(String) void
    }
    class NotificationService {
        +notifyConfirmation(Order) void
    }
    class PaymentService {
        +authorizePayment(String) PaymentResult
        +capturePayment(Order) PaymentResult
    }
    class RefundService {
        +refund(String, Money) PaymentResult
    }

    %% Order Class
    class Order {
        -customer : String
        -status : OrderStatus
        +calculateTotal() Money
        +updateStatus() void
        +cancelOrder(String) OrderStatus
    }

    %% Payment Gateways Implementing Interface
    class StripeGateway {
        <<implements PaymentProcessor>>
        +capturePayment(String) PaymentResult
    }
    class PayPalGateway {
        <<implements PaymentProcessor>>
        +capturePayment(String) PaymentResult
    }

    %% PaymentGateway
    class PaymentGateway {
        +process(Order) PaymentResult
    }

    %% Inheritance Relationships
    User <|-- Customer
    User <|-- Admin
    Product <|-- Clothing
    Product <|-- Accessories
    PaymentProcessor <|.. StripeGateway : implements
    PaymentProcessor <|.. PayPalGateway : implements

    %% Associations/Dependencies (matching UML flows)
    Customer --> OrderRepository : uses
    Admin --> OrderRepository : uses
    OrderRepository --> Order : manages
    ProductRepository --> Product : manages
    Customer --> Order : places
    Order --> Product : contains
    Order ..> PaymentProcessor : processes via
    InventoryService --> Product : manages stock
    EmailService --> Order : notifies
    NotificationService --> Order : notifies
    PaymentService --> PaymentGateway : uses
    RefundService --> PaymentGateway : uses
    PaymentGateway --> StripeGateway
    PaymentGateway --> PayPalGateway
