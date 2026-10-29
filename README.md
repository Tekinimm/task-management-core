# Task Management System

A lightweight, Java-based task management backend inspired by Jira and Trello. Currently in Phase 1, this project focuses on clean architecture, object-oriented programming (OOP), and SOLID principles without relying on external frameworks.

## Features
* **Task & Project Management:** Create projects, add tasks, and assign priorities.
* **Status Tracking:** Move tasks through workflows (TODO, IN_PROGRESS, IN_REVIEW, DONE).
* **User Assignment:** Assign tasks to specific developers or users.
* **In-Memory Storage:** Fast data retrieval using `HashMap` to simulate database operations.

## Tech Stack
* Java (Core)
* No external dependencies

## How to Run
1. Clone the repository to your local machine.
2. Open the project folder in IntelliJ IDEA (or your preferred Java IDE).
3. Navigate to `src/main/Application.java`.
4. Run the `main` method to see the task execution in the console.

## Roadmap
- [x] Phase 1: Core OOP Architecture and In-Memory Service
- [ ] Phase 2: Relational Database (PostgreSQL) & Hibernate/JPA Integration
- [ ] Phase 3: Spring Boot REST API Migration
- [ ] Phase 4: Spring Security & JWT Authentication
