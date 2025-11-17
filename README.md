# 🛍️ Fashion Retail System

## Overview

This project implements a modular Fashion Retail System in Java, emphasizing OOP principles (e.g., inheritance, abstraction) and design patterns like Factory (for payments) and Singleton (for inventory). It models key e-commerce flows: user management, product browsing, order placement, inventory tracking, and payment processing via gateways.

---

## 📁 Project Structure

```
src/
├── model/                    # Entity classes from UML
│   ├── User.java             # Abstract base (email, password)
│   ├── Customer.java         # Extends User (cart, placeOrder)
│   ├── Admin.java            # Extends User (manageInventory)
│   ├── Product.java          # Abstract base (productId, name, price, stock methods)
│   ├── Clothing.java         # Extends Product (size, color)
│   ├── Accessories.java      # Extends Product (material)
│   └── Order.java            # (customer, status, calculateTotal, updateStatus)
├── repository/               # Data access from UML
│   ├── OrderRepository.java  # (findByCustomerId, findByCategory)
│   └── ProductRepository.java # (findByCategory)
├── service/                  # Business logic from UML
│   ├── InventoryService.java # Singleton (reserveStock, releaseStock)
│   ├── PaymentService.java   # (authorizePayment, capturePayment)
│   ├── NotificationService.java # (notifyConfirmation, notifyShipment)
│   └── EmailService.java     # (sendEmail)
├── gateway/                  # Payment implementations from UML
│   ├── PaymentProcessor.java # Interface (processOrder)
│   ├── StripeGateway.java    # Implements PaymentProcessor
│   └── PayPalGateway.java    # Implements PaymentProcessor
└── MainTest.java             # Entry point for demo
```

---

## 🚀 How to Run

Ensure Java (JDK 8+) is installed.

**Compile (from src/ root)**
```bash
javac -d . model/*.java repository/*.java service/*.java gateway/*.java MainTest.java
```
**Run the demo**
```bash
java MainTest
```

---

## 📊 Expected Output
```

textCustomer placed order with total: $150.00
Inventory reserved for T-Shirt (stock: 99)
Payment authorized via Stripe: Success
Order status updated: SHIPPED
Notification sent via email.
```
---

## 🎓 OOP Principles
```
PrincipleImplementation (from UML)EncapsulationPrivate fields (e.g., email in User) with getters/settersInheritanceUser → Customer/Admin; Product → Clothing/Accessories for shared attributesPolymorphismPaymentProcessor interface with Stripe/PayPal implementations for dynamic processingAbstractionAbstract User/Product classes; repositories abstract data accessCompositionOrder contains multiple Products (via associations)AssociationCustomer uses OrderRepository; PaymentService delegates to gateways
```
---

## 🎨 Design Patterns
```
🏭 Factory Pattern (Adapted for Payments)
PaymentService uses a factory-like delegation to create/select gateways (e.g., StripeGateway) dynamically based on config.
🔐 Singleton Pattern
InventoryService as singleton for thread-safe stock management across orders.
💡 Repository Pattern
OrderRepository/ProductRepository abstract persistence (in-memory here; extensible to DB).
```

---

## 🔄 Step-by-Step Flow (Based on UML Associations)
```
Customer (extends User) browses via ProductRepository.findByCategory("Clothing").
Place Order: Customer.placeOrder() adds Products, calculates total via Order.calculateTotal().
Inventory: InventoryService.reserveStock() on selected Products.
Payment: PaymentService.authorizePayment() delegates to PaymentProcessor (e.g., StripeGateway.processOrder()).
Fulfill: Update Order.status, notify via NotificationService → EmailService.
Admin (extends User) manages via manageInventory() and OrderRepository.
```

---
