#  Microservices Communication - Spring Boot Project

This project demonstrates inter-service communication in a microservices architecture using three different approaches in Spring Boot:

- `RestTemplate` (Synchronous HTTP client)
- `WebClient` (Reactive HTTP client from Spring WebFlux)
- `Spring Cloud OpenFeign` (Declarative HTTP client)

---

##  Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Spring WebFlux
- Spring Cloud OpenFeign
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

---


