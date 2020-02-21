FROM openjdk:12
ADD target/eksamenpgr301.jar eksamenpgr301.jar
EXPOSE 8085
ENTRYPOINT ["java" , "-jar" , "eksamenpgr301.jar"]