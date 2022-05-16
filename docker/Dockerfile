FROM openjdk:17-jdk-slim-buster AS builder

ARG APP_NAME=webapp
ARG APP_VERSION=0.0.1

COPY ./ /app
WORKDIR /app
RUN chmod +x ./mvnw

RUN ./mvnw clean package

From eclipse-temurin:17.0.3_7-jre

ENV ARTIFACT_NAME=webapp-0.0.1 \
    JAVA_TOOL_OPTIONS=-Duser.timezone="Europe/Madrid" \
    TZ=CET-1CEST,M3.5.0,M10.5.0/3

COPY --from=builder /app/target/webapp-0.0.1.jar /app/webapp-0.0.1.jar

RUN addgroup thymeleaf \
    && adduser --system --shell /bin/sh --no-create-home --ingroup thymeleaf thymeleaf \
    && mkdir /logs \
    && chown thymeleaf:thymeleaf /logs \
    && chmod a+rw /logs

RUN chown thymeleaf:thymeleaf -R /app

USER thymeleaf

WORKDIR /app

EXPOSE 8443

ENTRYPOINT java -jar ./webapp-0.0.1.jar 