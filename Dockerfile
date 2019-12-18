FROM java:8
COPY . .
CMD ["javac","Solution.java"]
ENTRYPOINT ["java", "Solution"]
