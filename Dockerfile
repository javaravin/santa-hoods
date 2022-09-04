From openjdk:17
copy ./target/santa-hoods-0.0.1-SNAPSHOT.jar santa-hoods-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","santa-hoods-0.0.1-SNAPSHOT.jar"]
