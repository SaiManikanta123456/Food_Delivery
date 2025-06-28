✅This is a microservices-based food delivery system developed using Spring Boot. The system is designed for scalability, asynchronous communication, and fault tolerance. 

✅It leverages Kafka and RabbitMQ for efficient inter-service messaging and implements API Gateway and service discovery for dynamic routing.

✅The project also integrates distributed tracing using Zipkin and uses Resilience4j to handle circuit breaking and service failures gracefully.

💡Currently, I am exploring Spring AI to build a menu recommendation system based on user preferences such as calorie intake and local weather conditions.


🛠️ **Tech Stack**

**Backend**: Spring Boot, Spring Cloud

**Messaging**: Kafka, RabbitMQ

**Resilience**: Resilience4j, Zipkin (distributed tracing)

**API Management**: API Gateway, Service Registry (Eureka/Consul)

**Future Integration**: Spring AI for recommendation engine



📂 **Project Structure**

├── api-gateway
├── service-registry
├── order-service
├── payment-service
├── food-service
├── review-service
├── notification-service
├── README.md



⚙️ **Features**

✅ Microservices Architecture

✅ Asynchronous Communication using Kafka and RabbitMQ

✅ Load Balancing via API Gateway

✅ Service Discovery via Registry

✅ Distributed Tracing with Zipkin

✅ Circuit Breaking with Resilience4j

🔄 Menu Recommendation Engine using Spring AI (In Progress)



📈 **Future Enhancements**

✅Integrate Spring AI for personalized menu recommendations.

✅Add user authentication and authorization (JWT or OAuth2).

✅Build a lightweight React frontend for better user interaction.
