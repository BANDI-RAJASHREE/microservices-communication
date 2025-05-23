#  Microservices Communication - Spring Boot Project

This project demonstrates inter-service communication in a microservices architecture using three different approaches in Spring Boot:

- `RestTemplate` (Synchronous HTTP client)
- `WebClient` (Reactive HTTP client from Spring WebFlux)
- `Spring Cloud OpenFeign` (Declarative HTTP client)
- `Service Registry and Discovery using Spring Cloud Netflix Eureka Server`
- `Spring Cloud Gateway` (API Gateway for routing and filtering)



---

##  Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Spring WebFlux
- Spring Cloud OpenFeign
- Spring Cloud Gateway
- Spring Boot DevTools
- Maven

---

##  Modules Overview

### 1. `employee-service`

- Manages employee data.
- Communicates with `department-service` to fetch department details.
- Demonstrates all three communication methods.

### 2. `department-service`

- Provides REST APIs to manage department data.
- Acts as the downstream service.

---

## 🔗 Communication Approaches

###  1. RestTemplate (Blocking)
- Configured as a Spring Bean.
- Used in `EmployeeServiceImpl` to call department service manually.

###  2. WebClient (Reactive)
- Requires `spring-boot-starter-webflux` dependency.
- Configured as a Bean and used for non-blocking HTTP requests.

###  3. Spring Cloud OpenFeign (Declarative)
- Simplifies inter-service calls with interfaces and annotations.
- Requires `spring-cloud-starter-openfeign`.
- Uses `@FeignClient` to declare remote API.

### 4.Service Registry and Discovery using Spring Cloud Netflix Eureka Server
- Spring Cloud Netflix Eureka provides a Service Registry where microservices can register themselves and discover other services without hardcoding IPs or ports.
- It integrates with load balancers (Spring Cloud LoadBalancer) to distribute traffic among multiple instances of a service.
![image](https://github.com/user-attachments/assets/3068fb72-9bfa-45ab-8289-de5d4fed7231)

### 5.api-gateway
- Acts as a reverse proxy and central entry point for all services.
- Uses Spring Cloud Gateway to route requests to backend services.
- Handles dynamic routing, load balancing (with Eureka), and request filtering.
![image](https://github.com/user-attachments/assets/ee9a346c-1fd9-4a18-82ee-b667371ce608)

### 6.config-server
- Whenever there is change in configuration file of 1 microservice we need to restart the microservice as well as the instances
- This problem can be addressed by spring cloud config server
- If we use spring cloud config server no need to restart again microservices and its instance
- Externalise the configuration files of all microservices in centralised repo-git repository

![image](https://github.com/user-attachments/assets/b40a266e-38db-4f42-b9d6-d3296c5a465e)


