# E-Commerce Application

## Overview
This project is an e-commerce application built using Java Spring Boot, designed with microservices architecture to ensure scalability, flexibility, and resilience. It consists of four core microservices: Products, Orders, Inventory, and Notification, each serving a unique function within the application ecosystem.

## Architecture
The application leverages a microservices architecture, enabling independent development, deployment, and scaling of each service. Asynchronous communication is handled via Kafka, ensuring efficient data flow between services without direct dependencies.

### Microservices
- **Products**: Manages product listings, details, and categories.
- **Orders**: Handles order placement, tracking, and history.
- **Inventory**: Keeps track of stock levels, restocking, and inventory management.
- **Notification**: Sends notifications to users about order status, promotions, and updates.

## Technologies Used
- **Java Spring Boot**: For building the microservices.
- **Kafka**: For asynchronous inter-service communication.
- **Grafana**: For monitoring application performance and metrics.
- **Docker**: To containerize and manage application deployment.
- **Spring Cloud API Gateway**: For routing and API gateway services.
- **Netflix Eureka**: Used for service discovery to dynamically manage the microservices.
- **Zipkin**: For distributed tracing, enabling monitoring and troubleshooting the application flow across services.