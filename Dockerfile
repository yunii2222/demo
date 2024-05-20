FROM ubuntu:latest
LABEL authors="hi"

ENTRYPOINT ["top", "-b"]