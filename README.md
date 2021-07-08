# General info
This is the repository for the course of java testing with Platzi, here you will see what I consider to be the most used topics and some examples.

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Summary](#summary)
> * [Unitary](#unitary)
> * [Integration](#integration)
> * [Functinoal](#functional)
> * [End_to_end](#end_to_end)
> * [Stress](#stress)

Project is created with:
* IntelliJ IDEA
> * With openJDK 1.8 

	
## Setup
Install [IntelliJ](https://www.jetbrains.com/es-es/idea/download/#section=windows) in your computer.

Then in the extensions tab search for **Java Extension Pack** and install it.

Start your proyect creating your files with **.java**  

## Summary
In this course talk about all what can be done and some benefits from using Test it is recommended to use automated test rather than manual testing, there are severals kinds of thest the [Unitary](#unitary), [Integration](#integration), [Functinoal](#functional), [End_to_end](#end_to_end) and [Stress](#stress) test next I will talk more about them.

### Unitary
> **Classes** A class is the model that you define to create objects it contains, an identifier, properties and methods.
```java
public class Main {
    public static void main(String[] args) {
        showMenu();
    }//end of main
}//end of Main class
```
### Integration
An abstraction is when you recognize that you need a specific properties that you will used repeatedly in your code, so you abstract them and create a class
```java
public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
```
### Functional
> **Classes** A class is the model that you define to create objects it contains, an identifier, properties and methods.
```java
public class Main {
    public static void main(String[] args) {
        showMenu();
    }//end of main
}//end of Main class
```
### End_to_end
> **Classes** A class is the model that you define to create objects it contains, an identifier, properties and methods.
```java
public class Main {
    public static void main(String[] args) {
        showMenu();
    }//end of main
}//end of Main class
```
### Stress
> **Classes** A class is the model that you define to create objects it contains, an identifier, properties and methods.
```java
public class Main {
    public static void main(String[] args) {
        showMenu();
    }//end of main
}//end of Main class
```
