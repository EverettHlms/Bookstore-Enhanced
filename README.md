# Bookstore Management Enhanced

A simple yet robust command-line application for managing a bookstore's inventory and sales, now upgraded with a modular architecture and dynamic file-based inventory loading.

## Key Features

This upgraded system includes the following core functionalities:

1.  **Dynamic Inventory Management**:
    * The inventory is now loaded dynamically at runtime from an `inventory_items.txt` file, allowing for easy updates without changing the code.
    * The `InventoryMgnt` class provides centralized control for all inventory operations, including adding, retrieving, and updating items.
    * Tracks stock levels and provides real-time availability checks with `isAvailable()`.

2.  **Modular Product System**:
    * Inventory items are broken down into distinct components: `ProductInfo`, `PricingInfo`, and `QuantityInfo`. This improved object-oriented design makes the system more scalable and easier to maintain.
    * Maintains a clear pricing for each product.

3.  **Sales Processing**:
    * The `Sales` module validates inventory stock before processing any transaction to prevent overselling.
    * Automatically decrements stock levels upon a successful sale.
    * Utilizes the static `SalesCounter` class to track total sales revenue and the total number of units sold across all transactions.

4.  **Reporting and Simulation**:
    * The main application class (`App.java`) runs a complete simulation.
    * It displays the initial inventory loaded from the file, showing product name, availability, and price.
    * Processes a series of sample sales and clearly reports the outcome of each transaction.


  The project is organized into logical packages to ensure a clean and modular architecture:

* **`bookstoreproject`**: The main package containing the `App` class.
* **`bookstoreproject.inventory`**: Contains classes for managing the inventory (`InventoryMgnt`, `InventoryItem`).
* **`bookstoreproject.sales`**: Includes classes responsible for handling sales (`Sales`, `SalesCounter`).
* **`bookstoreproject.io`**: Manages data input, specifically reading the inventory file (`ItemEntry`).
* **`bookstoreproject.product`**, **`.pricing`**, **`.quantity`**: Contain the data classes that define the core attributes of an inventory item.

