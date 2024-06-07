# Use the official OpenJDK image as a base image
FROM openjdk:11

# Copy the application code to the container
COPY . /usr/src/pollinator

EXPOSE 5005

# Set the working directory
WORKDIR /usr/src/pollinator

# Compile the Java source file
RUN javac Main.java

# Define the command to run the application
CMD ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=127.0.0.1:5005", "Main"]