# Full-Stack Todo Application

This repository contains a full-stack Todo application built with Spring Boot and React. The application supports CRUD operations with a robust back-end, a dynamic front-end, and secure API integrations. It is an ideal project for managing tasks efficiently while showcasing modern development practices.

## Features

### Back-End:
- Built using Spring Boot.
- Implements CRUD operations for task management.
- Database integration with JPA and Hibernate.
- Secures REST APIs with Spring Security and JWT:
  - Role-based access control (RBAC).
  - Token-based authentication.

### Front-End:
- Built with React.
- Utilizes Formik for seamless form validation.
- Efficient API requests using Axios.
- Responsive design for an enhanced user experience.

## Technologies Used

### Back-End:
- Spring Boot
- Spring Security
- JWT (JSON Web Tokens)
- Hibernate
- JPA

### Front-End:
- React
- Formik
- Axios

### Database:
- H2 (or your preferred RDBMS)

## Setup and Installation

### Prerequisites:
- Java Development Kit (JDK 11 or above).
- Node.js and npm.
- A database of your choice (e.g., H2, MySQL, or PostgreSQL).

### Back-End Setup:
1. Clone the repository and navigate to the backend folder.
2. Configure the database connection in the `application.properties` file.
3. Run the application using:
   ```bash
   ./mvnw spring-boot:run
4. The application will start on `http://localhost:8080`.

### API Endpoints
| HTTP Method | Endpoint          | Description              | Authorization Required |
|-------------|-------------------|--------------------------|-------------------------|
| POST        | `/api/login`      | Login and obtain JWT     | No                      |
| GET         | `/api/todos`      | Fetch all todos          | Yes                     |
| POST        | `/api/todos`      | Create a new todo        | Yes                     |
| PUT         | `/api/todos/{id}` | Update an existing todo  | Yes                     |
| DELETE      | `/api/todos/{id}` | Delete a todo            | Yes                     |

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgments

- [Spring Boot Documentation](https://spring.io/projects/spring-boot) for back-end guidance.
- [React Documentation](https://react.dev) for front-end insights.
- The developers of [Formik](https://formik.org/), [Axios](https://axios-http.com/), and other dependencies.
