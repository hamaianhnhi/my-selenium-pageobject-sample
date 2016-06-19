# Selenium page objects


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisities

```
Maven

```

### Installing

Clone project to your local machine

```
Git clone https://github.com/hamaianhnhi/my-selenium-pageobject-sample
```

then Download chrome driver by following command

```
mvn antrun:run@download-chrome-driver
```

## Running the tests

```
maven clean test [options]
```
available options:
browser-name: firefox, chrome, default is firefox
timeout: test timeout in seconds, default is 15
run-test-parallel-type: methods is supported, others kinds is NOT
run-test-thread-count: number of running thread at same time, use this to parallel tests, default is 1

## Built With

* Maven

