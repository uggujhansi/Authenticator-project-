 # Authenticator-project-
# Authentication_Proj1 🔐

A simple authentication system built using the **MVC architecture** with Java Servlets (Controller), JDBC (Model), HTML (View), and MySQL (Database). The project allows users to register and log in with credentials stored in a relational database.

---

## 📌 Features

- User Registration
- User Login Authentication
- Basic MVC Separation (Servlets as Controller, Java classes as Model, HTML pages as View)
- Redirect on success/failure
- Input validation using HTML5

---

## 🛠 Technologies Used

- **Java Servlet API**
- **JDBC (Java Database Connectivity)**
- **MySQL**
- **HTML5 & CSS3**
- **Apache Tomcat** (tested on port 9090)

---

## 🗂 Project Structure
- Authentication_Proj1/
- ├── src/
- │ ├── AuthModel.java # Database logic (Model)
- │ ├── Register.java # Handles user registration (Controller)
- │ ├── Login.java # Handles user login (Controller)
- ├── WebContent/
- │ ├── register.html # Registration form (View)
- │ ├── login.html # Login form (View)
- │ ├── dashboard.html # Successful login landing page
- │ ├── regfail.html # Registration failed
- │ ├── loginfail.html # Login failed
- │ ├── WEB-INF/
- │ └── web.xml # Servlet mapping and deployment descriptor

---


---

## 🧰 Database Setup

1. **Create the Database:**
   ```sql
   CREATE DATABASE august;

## 🚀 Getting Started
# Prerequisites
- JDK 8 or above
- Apache Tomcat (e.g., v9 or v10)
- MySQL Server
- Any Java IDE (Eclipse, IntelliJ IDEA, etc.)

---
## 📌 Notes
- Ensure your JDBC driver (mysql-connector-j.jar) is added to your project’s build path.

- Store passwords securely (e.g., hash them) in production-level applications.

- Validate inputs thoroughly in production using both frontend and backend checks.
---
## 📜 License
- This project is open-source and free to use under the MIT License.

## ✨ Author
- Jhansi – https://github.com/uggujhansi

- Feel free to star ⭐ the repository if you find it helpful!
---
## here is the code output reference
![Screenshot 2025-05-29 091735](https://github.com/user-attachments/assets/8af15d20-6103-49d3-a69d-54f861ae9846)




