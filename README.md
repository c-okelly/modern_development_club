## First set of sessions for the Modern development club.

This repository will contains the main code base for the first project in the Modern development club.

The aim is to build a modern web-stack using a verity of technologies. We initial goal of the project will be to build a slack like chat app that we can all use. This will change and adapt over the course of the project.

## Project layout

The project will be split in two separate sections to begin along the lines of frontend and backend code.

## Running the backend application

``` bash
cd backend/rest-service
./gradlew bootRun
```

To access the swagger page for the rest service visit: http://localhost:9000/swagger-ui.html

### To enable reload on update

Open a new terminal window and leave running
``` bash
cd backend/rest-service
./gradlew -t build
```

## Running the frontend application

``` bash
cd frontend/frontend-angular
npm install
ng serve --open
```

## Resources

Some project resources will be located under the resources folder. This file "Resources on modern full stack development" contains some links to start with.
