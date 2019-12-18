FROM java:8
COPY . .
RUN ["javac","Solution.java"]
ENTRYPOINT ["java", "Solution"]
