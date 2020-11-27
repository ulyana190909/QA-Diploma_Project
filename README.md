**Автоматизация тестирования сервиса покупки тура.**  
Инструкция по запуску тестов.
---
_Предварительная подготовка к тестированию:_
1. Установить IntelliJ Idea. Скачать и ознакомиться с документацией можно на официальном сайте https://www.jetbrains.com/ru-ru/idea/.
2. Установить Docker Desktop. Скачать и ознакомиться с документацией можно на официальном сайте https://www.docker.com/get-started.
___
_Для запуска тестов необходимо:_
1. Скачать проект с удаленного репозитория на свой локальный, с помощью команды `git clone https://github.com/ulyana190909/QA-Diploma_Project`
2. Открыть проект на установленной заранее IntelliJ Idea
3. Развернуть контейнеры с помощью команды `docker-compose up` в терминале
4. В соседней вкладке запустить само приложение либо командой  
`java -Dserver.port=8090 -Dspring.datasource.url=jdbc:postgresql://localhost:5432/app -jar artifacts/aqa-shop.jar` -БД Postgresql  
либо `java -Dserver.port=8090 -Dspring.datasource.url=jdbc:mysql://localhost:3306/app -jar artifacts/aqa-shop.jar` -БД MysSQL  
5. Убедиться в том, что приложение запустилось, в логах будет строка `INFO 10688--- [  main] ru.netology.shop.ShopApplication  : Starting ShopApplication v0.0.1-SNAPSHOT on LAPTOP-NF0QCEOC with PID 10688`
6. Запустить тесты командой `gradlew test allureReport`
7. Открыть отчет о прохождении тестов командой `gradlew allureServe`
___
Если потребуется преждевременно завершить прохождение тестов, набрать команду Ctrl+C, далее Y.