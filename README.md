 🎫 Online Ticket Booking System (Console-Based)

A simple console-based **Core Java** application for booking tickets.  
This project uses **OOP principles**, **File I/O**, **Multithreading**, **JDBC**, and **PostgreSQL**, structured using **Maven**.
Multithreading is used to simulate concurrent ticket bookings.


 ✅ Prerequisites

- Any Java IDE (e.g., IntelliJ, VS Code, Eclipse). 
- Maven  
- PostgreSQL installed and running  



 🗃️ Database Setup (PostgreSQL)

1. Open your PostgreSQL terminal or pgAdmin  
2. Create database and table:


CREATE DATABASE ticketdb;

CREATE TABLE tickets (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    destination VARCHAR(100),
    price DOUBLE PRECISION
);
