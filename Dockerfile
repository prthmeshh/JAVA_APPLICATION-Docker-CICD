FROM openjdk
WORKDIR /app
COPY . /app
RUN javac soen.java
CMD ["java","soen"]