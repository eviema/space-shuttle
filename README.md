# space-shuttle
Spaceshuttle is an online course management system, using SpringBoot.

## How to run

### Install Docker first

Download Docker from [here](https://www.docker.com/)

Windows 7 please use Docker Toolbox

### Run from command line

$ ./gradlew build buildDocker

docker run -p 8080:8080 -t au.com.jiangren/space-shuttle:1.0-SNAPSHOT

If you are using Intellij, you can install Docker Integration plugin and run

[![Travis](https://img.shields.io/travis/eviema/space-shuttle.svg)](https://travis-ci.org/eviema/space-shuttle)
[![Codecov](https://img.shields.io/codecov/c/github/eviema/space-shuttle/feature/custom-auth.svg)](https://codecov.io/gh/eviema/space-shuttle/branch/feature%2Fcustom-auth)

