FROM ubuntu
RUN apt update
RUN apt install default-jdk -y
COPY . .
RUN javac Hello.java
CMD ["java","Hello"]