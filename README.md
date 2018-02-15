# spring-boot-ltw
# Example of AspectJ load-time weaving in a Spring Boot application.
This project contains a solution to a problem that occurs when you inject a service into an Aspect and it just throws a NPE. Spring documentation doesn't cover that, so I hope this hello-world project will come useful to someone.
Also, it solves the problem of having to add java agents to VM options in the applications' run configuration. Just use the command below and you'll be good to go.

Run the app by using
./gradlew bootRun
in the terminal.
