
# Overview

### The system should have the following specifications:

1. **Inheritance and Structure**:
   - `Product` is the parent class, providing shared attributes and methods.
   - `Fruit` and `Juice` extend `Product` and add their own specific behavior (e.g., equality checks, additional properties like volume).

2. **Vending Machine Management**:
   - `VendingMachine` interacts with both `Fruit` and `Juice`, using their shared `Product` interface to handle them generically.

3. **Functionality Highlights**:
   - Adding and removing products respects the vending machine's capacity.
   - Products have descriptive representations for easy debugging or display.

Create each of the following files: `Product.scala`, `Fruit.scala`, `Juice.scala`, `VendingMachine.scala` & `TestSuite.scala`.

---

### **1. `Product.scala`**

#### Purpose:
This should be the base class from where other classes like `Fruit` and `Juice` inherit. This class standardizes the basic properties (like name and type) that all products (e.g., fruits, juices) in the vending machine share.

#### Key Points:
- **Abstract Class**: 
  - `Product` is designed to serve as a template or base class.
  - It has two private attributes: `name_` (name of the product) and `type_` (type of product, like "Fruit" or "Juice").
- **Functionality**:
  - Provides a getter method (`name`) to access the product's name.
  - Overrides `toString` to return a string representation of the product in the format: `<type>: <name>`.

---

### **2. `Fruit.scala`**

#### Purpose:
This class should represent a specific type of product: fruit. This class should allow handling fruit-specific behavior (if needed later), while adhering to the general structure defined by `Product`. 

#### Key Points:
- **Inheritance**:
  - `Fruit` extends `Product`, so it inherits the properties and methods of the `Product` class.
  - Sets the type as `"Fruit"` during initialization by calling the `Product` constructor.
- **Equality Operators**:
  - Implements `==` and `!=` methods to compare fruits based on their names.
- **Functionality**:
  - Fruits are compared by their `name_`. For example, `new Fruit("Apple")` is considered equal to another `Fruit` with the same name.

---

### **3. `Juice.scala`**

#### Purpose:
This class should represent another type of product: juice. This class should handle juice-specific behavior, such as incorporating volume into comparisons and representations.

#### Key Points:
- **Inheritance**:
  - `Juice` extends `Product`, inheriting properties like name and type.
  - Sets the type as `"Juice"` during initialization.
- **Additional Properties**:
  - Adds a `volume_` attribute to represent the volume (in milliliters) of the juice.
- **Equality Operators**:
  - Implements `==` and `!=` to compare juices based on both their `name_` and `volume_`.
- **Overrides `toString`**:
  - Provides a more descriptive representation: `Juice: <name> (<volume>)`.

---

### **4. `VendingMachine.scala`**
This should be the main class that simulates the storage and lifecycle management of products in a vending machine:
- Ensuring capacity constraints are respected
- Allowing addition and removal of products
- Displaying the current state of the machine

#### Key Points:
- **Attributes**:
  - `capacity_`: Maximum capacity of the vending machine (in arbitrary units).
  - `products_`: List to store the products currently in the vending machine.
  - `quantity_`: Tracks the cumulative quantity of all products in the machine.

- **Methods**:
  1. **`add_update_quantity_`**:
     - Determines if a product can be added based on the remaining capacity.
     - Adds `1` for `Fruit` and `2` for `Juice` to `quantity_`.
  2. **`add`**:
     - Adds a product to the vending machine if there's enough space.
     - Updates the `products_` list and adjusts the `quantity_`.
  3. **`remove_update_quantity_`**:
     - Decreases the `quantity_` when a product is removed.
  4. **`remove`**:
     - Removes a product from the machine if it exists in the list.
     - If the product is not found, it prints a message indicating that.
  5. **`toString`**:
     - Describes the current state of the vending machine, including its remaining space and the products it contains.


---

### **5. `TestSuite.scala`**

#### **Purpose:**
The purpose of `TestSuite.scala` should be to provide a comprehensive testing framework for validating the functionality of the `Fruit`, `Juice`, and `VendingMachine` classes. It ensures that their methods, equality checks, and interactions behave as expected in a controlled test environment.

#### **Key Points:**
- **Attributes**:
  - This file does not declare attributes but uses several local variables in the `main` method for testing:
    - `apple`, `banana`: Instances of the `Fruit` class.
    - `orangeJuice`, `appleJuice`: Instances of the `Juice` class.
    - `vendingMachine`: An instance of the `VendingMachine` class.

- **Methods**:
  - **`main(args: Array[String]): Unit`**:
    - This is the entry point of the `TestSuite` object and contains all the test logic.
    - Organizes tests into three main sections:
      1. **Fruit Class Tests**:
         - Verifies equality (`==`) and inequality (`!=`) methods for the `Fruit` class.
      2. **Juice Class Tests**:
         - Tests the `==` and `!=` methods for the `Juice` class.
      3. **VendingMachine Class Tests**:
         - Validates the `add`, `remove`, and `toString` methods of the `VendingMachine`.
         - Checks vending machine behavior with assertions and direct outputs.