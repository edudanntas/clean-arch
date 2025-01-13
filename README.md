# Clean Architecture Project

This project is a Java-based application that follows the principles of Clean Architecture. It uses Spring Boot for building a RESTful web service and integrates with a MySQL database using Spring Data JPA.

## Getting Started

### Prerequisites

- Java 21
- Maven
- MySQL

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/edudanntas/clean_arch.git
    cd clean_arch
    ```

2. Configure the database:
    - Update the `src/main/resources/application.yaml` file with your MySQL database credentials.

3. Build the project:
    ```sh
    mvn clean install
    ```

4. Run the application:
    ```sh
    mvn spring-boot:run
    ```

### Usage

The application will start on port 8081. You can access the RESTful endpoints to interact with the application.

## Project Structure

- `src/main/java/com/edudanntas/clean_arch/core/entities`: Contains the core entities of the application.
- `src/main/resources`: Contains the configuration files.

## Dependencies

- Spring Boot Starter Data JPA
- Spring Boot Starter Validation
- Spring Boot Starter Web
- MySQL Connector
- Lombok
- MapStruct

## License

This project is licensed under the MIT License.

## Authors

- Eduardo Dantas