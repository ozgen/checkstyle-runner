
# Checkstyle Runner

This project is designed to provide a custom Checkstyle runner that can be used to execute code style checks on Java projects using a specified set of Checkstyle rules.

## Getting Started

These instructions will help you get your copy of the Checkstyle runner set up and running on your local machine for development and testing purposes.

### Prerequisites

You need to have the following installed on your machine:
- Java JDK 21 or higher
- Maven 3.8 or higher

### Installation

1. **Clone the Repository**

   Clone this repository to your local machine using the following command:

   ```bash
   git clone https://github.com/ozgen/checkstyle-runner.git
   cd checkstyle-runner
   ```

2. **Build the Project**

   Navigate to the project directory and run the following Maven command to build the executable JAR:

   ```bash
   mvn clean install
   ```

   This will create a `checkstyle-runner.jar` in the `target` directory.

### Usage

To run the Checkstyle checks using the built JAR, you can either use the provided bash script or run the JAR directly.

1. **Using the Bash Script**

   Ensure the `check-style.sh` script is executable:

   ```bash
   chmod +x check-style.sh
   ```

   Execute the script by passing the directory you want to check:

   ```bash
   ./check-style.sh /path/to/project
   ```

2. **Using the JAR Directly**

   Alternatively, you can run the JAR file directly from the command line:

   ```bash
   java -jar target/checkstyle-runner.jar /path/to/project
   ```

### Checkstyle Configuration

The Checkstyle configurations are located in the `src/main/resources/checkstyle.xml` file. This file contains all the rules and configurations that Checkstyle will use to assess your Java code.
