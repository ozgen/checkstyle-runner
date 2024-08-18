#!/bin/bash

# Check if the correct number of arguments was provided
if [ "$#" -ne 1 ]; then
    echo "Usage: $0 <path-to-check>"
    exit 1
fi

# Define the path to the Checkstyle JAR
CHECKSTYLE_JAR="target/checkstyle-runner.jar"

# Run the Checkstyle JAR with the provided directory
java -jar "$CHECKSTYLE_JAR" "$1"
