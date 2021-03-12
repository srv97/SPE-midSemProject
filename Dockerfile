FROM openjdk:8
COPY ./target/Midsem-project-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "Midsem-project-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]
