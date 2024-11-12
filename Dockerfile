FROM ubuntu:latest
LABEL authors="Vladimir"
COPY . .
ENTRYPOINT ["top", "-b"]