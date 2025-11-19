# 🛍️ Fashion Retail System

## Overview

This project implements a modular Fashion Retail System in Java, emphasizing OOP principles (e.g., inheritance, abstraction) and design patterns like Factory (for payments) and Singleton (for inventory). It models key e-commerce flows: user management, product browsing, order placement, inventory tracking, and payment processing via gateways.

---

## 📁 Project Structure

```
src/
├── model/                    
│   ├── User.java             
│   ├── Customer.java       
│   ├── Admin.java            
│   ├── Product.java          
│   ├── Clothing.java        
│   ├── Accessories.java     
│   └── Order.java            
├── repository/
│   └── ProductRepository.java 
├── service/                 
│   ├── InventoryService.java 
│   ├── PaymentService.java      
├── gateway/                 
│   ├── PaymentProcessor.java               
```

---

## 🚀 How to Run


**Compile (from src/ root)**
```bash
```
**Run the demo**
```bash
java MainTest
```

---

## 📊 Expected Output
```

Customer placed order with total: $700.00
Inventory for Dress (stock: 43)
Payment authorized via Paypal : Success
Order status updated: Shipement successful
Confirmation sent via email.
```
---

---
```

---

## 🔄 Step-by-Step Flow
```
Customer browses via ProductRepository.
Place Order: They add dresses or items, calculates total of the order.
Inventory: Inventory has the stock on selected Products.
Payment: Authorise the payment.
Confirmation: Updating the order and getting the mail.
```

---
