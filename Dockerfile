FROM openjdk:17
ADD build/libs/exercise-kts.jar exercise-kts.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "exercise-kts.jar"]