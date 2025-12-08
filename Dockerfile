# Используем официальный образ Amazon Corretto 21 (JDK 21 на базе Alpine Linux)
FROM amazoncorretto:21-alpine

# Устанавливаем рабочую директорию внутри контейнера
# Все последующие команды (COPY, RUN и т.д.) будут выполняться относительно этой папки
WORKDIR /app

# Копируем собранный jar-файл приложения в контейнер
# target/covenant-code-landing-service-0.0.1-SNAPSHOT.jar — это результат сборки Spring Boot
# В контейнере файл будет доступен как app.jar
COPY target/covenant-code-landing-service-0.0.1-SNAPSHOT.jar app.jar

# Открываем порт 8082, чтобы приложение было доступно извне контейнера
EXPOSE 8082

# Указываем команду, которая будет выполняться при старте контейнера
# java -jar app.jar — запускает Spring Boot приложение
ENTRYPOINT ["java", "-jar", "app.jar"]