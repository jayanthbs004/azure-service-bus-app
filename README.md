# Azure Service Bus Application

This project demonstrates the use of Azure Service Bus in a Java application. It includes functionality for sending and receiving messages using Azure Service Bus queues.

## Project Structure

```
azure-service-bus-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── App.java
│   │   └── resources
│   │       └── application.properties
├── pom.xml
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven 3.6 or higher
- Azure account with an active Service Bus namespace

## Setup Instructions

1. Clone the repository:
   ```
   git clone <repository-url>
   cd azure-service-bus-app
   ```

2. Update the `src/main/resources/application.properties` file with your Azure Service Bus connection string and queue name:
   ```
   azure.servicebus.connection-string=<Your_Connection_String>
   azure.servicebus.queue-name=<Your_Queue_Name>
   ```

3. Build the project using Maven:
   ```
   mvn clean install
   ```

## Usage

To run the application, execute the following command:
```
mvn exec:java -Dexec.mainClass="com.example.App"
```

This will start the application, which will send a message to the specified Azure Service Bus queue and then receive messages from it.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.