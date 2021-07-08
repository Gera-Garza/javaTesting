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
In this course talk about all what can be done and some benefits from using Test it is recommended to use automated test rather than manual testing, there are severals kinds of thest the [Unitary](#unitary), [Integration](#integration), [Functinoal](#functional), [End_to_end](#end_to_end) and [Stress](#stress) test next I will talk more about them. Some benefits that have doing testing are for example, checking that we really complete the requirements, it helps with the documentation, improves our confidence and well its a tool that adds value as a developer.

### Unitary
This kind of test are focus on testing a single class in the program/proyect 
```java
public class Main {
    public static void main(String[] args) {
        showMenu();
    }//end of main
}//end of Main class
```
### Integration
Integration test are for example when in a class your are trying to connect to a Data Base or an API you are testing that integration. or maybe when you are testing how they connect with diferent modules in your app.
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
Test a specific function in your system.
```java
public class Main {
    public static void main(String[] args) {
        showMenu();
    }//end of main
}//end of Main class
```
### End_to_end
This are the kind of test that are focus in testing a full user history from the begining to end.
```java
public class Main {
    public static void main(String[] args) {
        showMenu();
    }//end of main
}//end of Main class
```
### Stress
This is a common test by testing the capacity of the program by supporting many scenarios.
```java
public class Main {
    public static void main(String[] args) {
        showMenu();
    }//end of main
}//end of Main class
```
