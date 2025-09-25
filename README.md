# E-Commerce Backend API

A robust backend service for a modern e-commerce platform built with Java and Spring Boot. This project provides a complete set of RESTful APIs for managing users, products, and orders.

---

### 🔑 Key Features

* **User Authentication:** Secure user registration and login using Spring Security and JWT.
* **Product Management:** Full CRUD (Create, Read, Update, Delete) functionality for products and categories.
* **Shopping Cart:** Add, view, update, and remove items from the shopping cart.
* **Order Processing:** Logic to handle customer orders and checkout.
* **RESTful API:** Well-defined endpoints for easy integration with any frontend application.

---

### 🛠️ Built With

* **Java 17**
* **Spring Boot**
* **Spring Security:** For authentication and authorization.
* **Spring Data JPA:** For database interaction.
* **MySQL:** As the relational database.
* **Maven:** For project management and dependencies.
* **JSON Web Tokens (JWT):** For securing the API.

---

### 🚀 Getting Started

To get a local copy up and running, follow these simple steps.

1.  **Clone the repository:**
    ```sh
    git clone [https://github.com/RajpootRipu321/ecommerce-backend-project.git](https://github.com/RajpootRipu321/ecommerce-backend-project.git)
    ```
2.  **Configure the database:**
    * Open `src/main/resources/application.properties`.
    * Update the `spring.datasource.username` and `spring.datasource.password` with your MySQL credentials.
3.  **Run the application:**
    * You can run the main application class `EcommerceApiApplication.java` from your IDE.
