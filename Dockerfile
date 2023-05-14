FROM openjdk:17
ADD build/libs/preference-service-0.1-all.jar preference-service-0.1-all.jar
ENTRYPOINT ["java", "-jar", "preference-service-0.1-all.jar"]
EXPOSE 8081