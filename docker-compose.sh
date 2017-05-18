#!/usr/bin/env bash

DROPWIZARD_APP_PATH=alpha/external-api-dropwizard

cd $DROPWIZARD_APP_PATH
mvn clean package
cd ../../
docker-compose up
