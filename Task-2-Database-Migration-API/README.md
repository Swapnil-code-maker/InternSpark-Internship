# Task 2 - Database Integration & Flyway Migrations

## 📌 Internship Project

This project is developed as part of the **InternSpark AICTE-listed Java Internship Program**.

The project demonstrates:
- Database integration using MySQL
- Spring Data JPA implementation
- Database migrations using Flyway
- Sample data seeding
- REST API development using Spring Boot

---

# 🚀 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Flyway Migration
- Maven
- Lombok
- Postman
- IntelliJ IDEA

---

# 📂 Project Structure

```text
Task-2-Database-Migration-API
│
├── screenshots
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.swapnil.databasemigrationapi
│   │   │       ├── controller
│   │   │       ├── entity
│   │   │       ├── repository
│   │   │       └── DatabaseMigrationApiApplication.java
│   │   │
│   │   └── resources
│   │       ├── application.properties
│   │       └── db
│   │           └── migration
│   │               ├── V1__create_students_table.sql
│   │               ├── V2__insert_sample_data.sql
│   │               └── V3__add_phone_column.sql
│
├── pom.xml
└── README.md
```

---

# ⚙️ Database Configuration

## Database Used

```sql
migration_db
```

## MySQL Configuration

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/migration_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
```

---

# 🔄 Flyway Migrations

## V1 - Create Students Table

```sql
CREATE TABLE students (
    id BIGINT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    course VARCHAR(100)
);
```

---

## V2 - Insert Sample Data

```sql
INSERT INTO students (id, name, email, course)
VALUES
(1, 'Swapnil', 'swapnil@gmail.com', 'CSE'),
(2, 'Ankit', 'ankit@gmail.com', 'AI'),
(3, 'Rahul', 'rahul@gmail.com', 'ECE');
```

---

## V3 - Add Phone Column

```sql
ALTER TABLE students
ADD phone VARCHAR(15);
```

---

# 🌐 REST API Endpoint

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

# 📮 Postman Testing

The API was tested successfully using Postman.

## Response

```json
[
  {
    "id": 1,
    "name": "Swapnil",
    "email": "swapnil@gmail.com",
    "course": "CSE"
  },
  {
    "id": 2,
    "name": "Ankit",
    "email": "ankit@gmail.com",
    "course": "AI"
  },
  {
    "id": 3,
    "name": "Rahul",
    "email": "rahul@gmail.com",
    "course": "ECE"
  }
]
```

---

# 📸 Screenshots

Screenshots included:
- Project Structure
- application.properties
- Flyway Migration Files
- MySQL Tables
- flyway_schema_history
- Postman API Testing
- Console Output

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
Task-2-Database-Migration-API
```

---

## 3. Create Database

```sql
CREATE DATABASE migration_db;
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
DatabaseMigrationApiApplication.java
```

Flyway will automatically:
- create tables
- apply migrations
- seed sample data

---

# ✅ Features Implemented

- Spring Boot REST API
- MySQL Integration
- Spring Data JPA
- Flyway Database Migrations
- Schema Versioning
- Sample Data Seeding
- REST Endpoint Testing

---

# 👨‍💻 Developed By

## Swapnil Soni

B.Tech CSE Student  
VIT Bhopal University

### GitHub
https://github.com/Swapnil-code-maker

---

# 📌 Internship Task Status

✅ Task 2 Completed Successfully