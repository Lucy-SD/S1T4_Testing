# Java JUnit Testing Exercises

👨‍💻 Author: Lucy Castro  
🧠 Learning Focus: JUnit Testing in Java  
🛠️ IDE: IntelliJ IDEA  
💡 Java SDK: 21  
📦 Build Tool: Maven  

## 📄 Description
This repository contains structured Java exercises focused on:

- **Library Management System** - Testing collection operations with JUnit  
- **DNI Letter Calculator** - Parameterized testing with JUnit  
- **Exception Handling** - Verifying expected exceptions  

## 💻 Technologies Used
☕ Java 21  
🧪 JUnit 5  
🛠️ Maven  
🧠 IntelliJ IDEA  

## 📋 Requirements
✅ Java JDK 21  
✅ Maven 3.8+  
✅ IntelliJ IDEA (recommended)  

## 🛠️ Installation

git clone https://github.com/Lucy-SD/S1T4_Testing

cd java-junit-exercises
mvn clean install

Open in IntelliJ:
File > Open > [select pom.xml]

## ▶️ Execution
Run tests through:

IDE: Right-click test class → Run

Command line: mvn test

## 📚 Exercise Catalog
### 📂 Level 1: JUnit Fundamentals

<details> <summary><b>Exercise 1: Library Management System</b></summary>

Create a Java class that manages a collection of books in a library. The class should allow you to add books, retrieve the list of books, get a specific book by its position, add a book at a specific position, and remove a book by title.

It implements the following functionalities:

The class must allow books to be added to the collection.
The complete list of books must be able to be retrieved
It should be possible to obtain the title of a book given a position.
It should be possible to add a book at a specific position.
It should be possible to delete a book by title.
Verify its correct operation with JUnit:

They verify that the book list is not null after creating a new object.
They confirm that the list is of expected size after inserting multiple books.
They ensure that the list contains a specific book in its correct position.
They verify that there are no duplicate book titles in the list.
They prove that the title of a book can be retrieved given a specific position.
They ensure that adding a book correctly modifies the list.
They confirm that removing a book decreases the size of the list.
They verify that the list remains alphabetically sorted after adding or removing a book.

</details>

<details> <summary><b>Exercise 2: DNI Letter Calculator</b></summary>
  
Create a class called CalculoDni that calculates the letter of the DNI when receiving the number as a parameter.
Create a jUnit class that verifies its correct operation, parameterizing it so that the test receives a wide spectrum of data and validates whether the calculation is correct for 10 predefined ID numbers.

</details>

<details> <summary><b>Exercise 3: Exception Handling</b></summary>
  
Create a class with a method that throws an ArrayIndexOutOfBoundsException.
Verify its correct operation with a jUnit test

</details>

## 🎯 Learning Goals
✅ JUnit test creation  
✅ Parameterized testing  
✅ Exception testing  
✅ Maven test lifecycle  
✅ Collection validation  

## 🤝 Contributions
⭐ Star the repository
🍴 Fork the project
📥 Create a pull request

## 🌐 Deployment
For educational purposes only.

## 🚀 Thanks for Visiting ¡!
