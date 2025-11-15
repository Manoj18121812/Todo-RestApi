# 📌 Simple Task Manager REST API (Spring Boot)

A lightweight 🚀 Spring Boot REST API for managing tasks. Supports full CRUD operations without using a database.

---

## 🔥 Features

* ➕ Add a new task
* 📄 Fetch all tasks
* 🔍 Get task by ID
* ✏️ Update an existing task
* ❌ Delete a task
* 🧪 Test all endpoints in Postman

---

## 🛠 Tech Stack

* ☕ **Java**
* 🌱 **Spring Boot**
* 📡 **REST API**

---

## 📂 Project Structure

```
src/main/java/com/example/todo
 ├── controller
 │     └── TaskController.java
 ├── service
 │     └── TaskService.java
 ├── entity
 │     └── Task.java
```

---

## 📡 API Endpoints

### ➕ Add Task

```
POST /api/tasks
```

**Body:**

```json
{
  "title": "Learn Spring Boot",
  "description": "Build REST API"
}
```

### 📄 Get All Tasks

```
GET /api/tasks
```

### 🔍 Get Task by ID

```
GET /api/tasks/{id}
```

### ✏️ Update Task

```
PUT /api/tasks/{id}
```

**Body:**

```json
{
  "title": "Updated Title",
  "description": "Updated Description"
}
```

### ❌ Delete Task

```
DELETE /api/tasks/{id}
```

---

## 🚀 Run the Project

```
mvn spring-boot:run
```

App runs on:

```
http://localhost:8080
```

---

## 🙌 Contribution

Feel free to fork, improve, and submit PRs!

---

## ⭐ Show Support

If you like this project, give it a ⭐ on GitHub!
