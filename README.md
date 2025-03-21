# SOAP Web Service in Java

This repository contains a simple SOAP web service implemented in Java using JAX-WS.

## Project Structure
- `StringManipulationService.java` - Defines the web service interface.
- `StringManipulationServiceImpl.java` - Implements the web service logic.
- `StringManipulationServicePublisher.java` - Publishes the web service.

## How to Run
1. Compile the Java files:
   ```sh
   javac *.java
   ```
2. Run the publisher to start the service:
   ```sh
   java StringManipulationServicePublisher
   ```
3. Access the WSDL at:
   ```
   http://localhost:8080/StringManipulationService?wsdl
   ```

