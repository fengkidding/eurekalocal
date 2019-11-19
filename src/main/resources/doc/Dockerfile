FROM java:8

MAINTAINER root

COPY eurekalocal.jar /app.jar

# ENV JAVA_OPTS="\
# -server \
# -Xmx2g \
# -Xms2g "

EXPOSE 10000
ENTRYPOINT ["java","-jar","/app.jar"]