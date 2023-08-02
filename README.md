# Carnival Ride Management System

## Introduction

The Carnival Ride Management System is a Java-based application that simulates various carnival rides. The system includes a base class `CarnivalRide` and two subclasses, `Rollercoaster` and `WaterRide`, representing different types of carnival rides. The project demonstrates inheritance, polymorphism, and abstraction concepts in object-oriented programming.

## Class Descriptions

### CarnivalRide

The `CarnivalRide` class is an abstract superclass that represents a generic carnival ride. It includes attributes for ride type, duration, and name. The class provides methods to get and set these attributes, as well as abstract methods `fearFactor()` and `aboutRide()`.

### Rollercoaster

The `Rollercoaster` class is a subclass of `CarnivalRide` representing a rollercoaster ride. It includes an additional attribute for the number of loops. The class implements the `fearFactor()` method to determine the level of fear based on ride duration and loops, and `aboutRide()` method to provide information about the ride.

### WaterRide

The `WaterRide` class is a subclass of `CarnivalRide` representing a water ride. It includes an additional attribute for the waterdrop height. The class implements the `fearFactor()` method to determine the thrill level based on ride duration and waterdrop height, and `aboutRide()` method to provide information about the ride.

## How to Use

1. Instantiate objects for `Rollercoaster` and `WaterRide`, providing relevant details such as ride duration, name (optional), loops (for rollercoaster), and waterdrop height (for water ride).
2. Use the `aboutRide()` method to get information about each ride, including its name, type, duration, loops (if applicable), and waterdrop height (if applicable).
3. Use the `fearFactor()` method to get the fear and thrill level of each ride based on its attributes.

## Contributors

- Sameer Shaligram (https://github.com/s-shaligram) - Lead Developer
