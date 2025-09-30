# Spring Boot Portfolio API's

This is a simple **Spring Boot application** built using **Spring Tool Suite (STS)**.  
It demonstrates how to create REST APIs using Spring Boot and how to run the application locally or deploy it on a server.

---

##  Project Structure
portfolioBackend/      ← root directory
├─ .gitignore          ← Git ignore rules
├─ README.md           ← project description
├─ pom.xml             ← Maven project file
├─ mvnw                ← Maven wrapper script (optional)
├─ mvnw.cmd            ← Windows Maven wrapper script (optional)
├─ src/                ← source code
│   ├─ main/
│   │   ├─ java/
│   │   └─ resources/
│   └─ test/
├─ target/             ← build output (ignored in Git)
└─ .mvn/               ← Maven wrapper (usually ignored)



## ⚙️ Tech Stack

-  **Java 17+**
-  **Spring Boot 3.x**
-  **Maven** (Build tool)
-  **MySQL** (Database)
-  **JUnit** (Testing)


##  How to Run the Project Locally

### 1. Clone the repository
```bash
git clone https://github.com/yourusername/spring-boot-demo.git
cd spring-boot-demo

# 2. Build the project
          mvn clean install

### 3. Run the application
         mvn spring-boot:run  OR  java -jar target/spring-boot-demo-0.0.1-SNAPSHOT.jar

### 4. Access the application
          http://localhost:8080
