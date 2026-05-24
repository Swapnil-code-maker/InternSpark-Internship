# Task 3 - Unit Testing & Logging

## 📌 Internship Project

This project is developed as part of the **InternSpark AICTE-listed Java Internship Program**.

The project demonstrates:

- REST API development using Spring Boot
- MySQL database integration
- Unit testing using JUnit & Mockito
- Logging using SLF4J and Logback
- API testing using Postman

---

# 🚀 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- JUnit 5
- Mockito
- SLF4J / Logback
- Maven
- Lombok
- Postman
- IntelliJ IDEA

---

# 📂 Project Structure

```text
Task-3-Unit-Testing-Logging
│
├── screenshots
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.swapnil.task3unittestinglogging
│   │   │       ├── controller
│   │   │       ├── entity
│   │   │       ├── repository
│   │   │       ├── service
│   │   │       └── Task3UnitTestingLoggingApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│       └── java
│           └── com.swapnil.task3unittestinglogging
│               └── service
│                   └── StudentServiceTest.java
│
├── pom.xml
└── README.md
```

---

# ⚙️ Database Configuration

Database used:

```text
task3_db
```

MySQL configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/task3_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# 🌐 REST API Endpoints

## Get All Students

### Request

```http
GET /students
```

### URL

```text
http://localhost:8080/students
```

---

## Add Student

### Request

```http
POST /students
```

### URL

```text
http://localhost:8080/students
```

### Request Body

```json
{
  "name": "Swapnil",
  "email": "swapnil@gmail.com",
  "course": "CSE"
}
```

---

# 🧪 Unit Testing

JUnit and Mockito are used for testing service layer methods.

## Test Class

```text
StudentServiceTest.java
```

## Features Tested

- Fetch all students
- Mock repository behavior
- Validate returned data
- Verify service layer functionality

---

# 📝 Logging

SLF4J and Logback are used for logging important application events.

## Example Logs

```text
INFO --- GET request received for all students
INFO --- Fetching all students
INFO --- POST request received for student: Swapnil
INFO --- Adding student: Swapnil
```

---

# 📮 Postman Testing

The APIs were tested successfully using Postman.

---

# 📸 Screenshots

Screenshots included:

- Project Structure
- pom.xml
- application.properties
- StudentController.java
- StudentService.java
- StudentServiceTest.java
- Console Logs
- POST API Testing
- GET API Testing
- Passed Unit Test
- MySQL Database Table

---

# ▶️ How to Run the Project

## 1. Clone Repository

```bash
git clone https://github.com/Swapnil-code-maker/InternSpark-Internship.git
```

---

## 2. Open Project in IntelliJ IDEA

Open:

```text
Task-3-Unit-Testing-Logging
```

---

## 3. Create Database

```sql
CREATE DATABASE task3_db;
```

---

## 4. Configure application.properties

Update:

- MySQL username
- MySQL password

---

## 5. Run Application

Run:

```text
Task3UnitTestingLoggingApplication.java
```

---

## 6. Test APIs Using Postman

### GET Request

```http
GET /students
```

### POST Request

```http
POST /students
```

---

## 7. Run Unit Test

Run:

```text
StudentServiceTest.java
```

---

# ✅ Features Implemented

- Spring Boot REST API
- MySQL Integration
- Service Layer Architecture
- Unit Testing using JUnit & Mockito
- Logging using SLF4J
- Postman API Testing
- CRUD Operation Support

---

# 👨‍💻 Developed By

## Swapnil Soni

B.Tech CSE Student  
VIT Bhopal University

GitHub:  
https://github.com/Swapnil-code-maker