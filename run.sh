#!/bin/sh

if [ $# -eq 1 ] ; then
	./mvnw install
elif [ $# -eq 2 ] ; then
	./mvnw clean install
fi
./mvnw spring-boot:run -pl WebApi
