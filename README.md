# 🔌 Smart Devices Control System

A Java-based Object-Oriented Programming (OOP) project that demonstrates the power of **Interfaces**, **Polymorphism**, and **Custom Exception Handling**. The system simulates a centralized controller for various smart home devices, ensuring each device operates according to its specific state and constraints.

## 🚀 Key Features

- **Common Interface:** Utilizes a `Controllable` interface to establish a standard contract (`turnOn`, `turnOff`, `getStatus`) for all devices.
- **Polymorphism in Action:** Manages different object types (`SmartPhone`, `SmartWatch`, `Microwave`) uniformly through an array of `Controllable` units.
- **Custom Exception Handling:** Implements robust error handling using custom runtime exceptions to prevent invalid operations:
  - `InvalidStatus`: Thrown when trying to turn on an already-on device, or turn off an already-off device.
  - `LowBattery`: Prevents the `SmartWatch` from turning on if the battery is below 10%.
  - `OpenDoor`: Prevents the `Microwave` from turning on if its door is open.
- **Dynamic State Management:** Simulates real-world conditions (e.g., randomized battery levels for the SmartWatch).

## 🛠️ Technologies & Concepts

- **Language:** Java
- **Core OOP Concepts:** Interfaces, Inheritance, Polymorphism, Encapsulation.
- **Error Handling:** Custom `RuntimeException` classes & `try-catch` blocks.

## 💻 Code Structure

- `Controllable.java`: The core interface.
- `SmartPhone.java`, `SmartWatch.java`, `Microwave.java`: Concrete classes implementing the interface with unique internal states and logic.
- `Main.java`: The driver class that tests all devices polymorphically and catches exceptions gracefully.

## 👤 Author

** Rowan Ezzat** 
Software Engineer & Data Science Student  
- GitHub: [@rowanezzat37-dev](https://github.com/rowanezzat37-dev)
