FROM openjdk:17
COPY target/ /tmp
WORKDIR /temp
CMD java -jar EmployeeExam-1.0-SNAPSHOT.jar