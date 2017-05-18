# Docker-Node / Docker-Dropwizard-Maven
A bare bones implementation of Dockerized Node and Dropwizard REST APIs

## Requirements

* docker (with docker-compose)
* Node 6 (including npm)

## Run

Use docker-compose.sh to build and launch the containers for the solution.

Run the application:
```
docker-compose up

# Force a rebuild of the containers if package.json has changed to get new dependencies
#docker-compose up --build
```

When running in development, volumes are mapped from the containers to the host so changes to host files trigger the application to restart ([nodemon](http://nodemon.io/)) and node_modules dependencies are cached so they don't need to be retrieved each time.

## Configuration
Optional configuration for the prototype.
