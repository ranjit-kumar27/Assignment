# Assignment
This project is a simple WhatsApp chatbot backend simulation built using Java and Spring Boot. It exposes a REST API endpoint that receives messages (simulating WhatsApp webhook requests) and responds with predefined replies.


🎯 Features

✅REST API endpoint /webhook

✅ Accepts JSON input (simulating WhatsApp messages)

✅ Returns predefined responses

✅ Logs all incoming messages

✅ Clean layered architecture (Controller, Service, DTO)



🛠️Tech Stack

 Java
 
 Spring Boot
 
 Lombok
 
 Maven
 


Project Structure

chatbot.demo
│── controller
│   └── WebController.java
│── service
│   ├── MessageService.java
│   └── MessageServiceImpl.java
│── dto
│   ├── Message.java
│   └── MessageResponse.java


Notes

This project is created as part of an internship assignment to demonstrate.


