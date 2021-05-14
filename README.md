### Autor: NanoRoss  https://github.com/NanoRoss
# Serenity Cucumber Framework

### Implemented technology:

```
Java
Selenium
Cucumber
Junit
Serenity
Page Object Model 
Two Reports
```

### Sample usage with Maven

```
mvn clean verify
mvn verify -Dcucumber.options="--tags @smoke2"
mvn verify -Dcucumber.options="--tags  '@smoke1 or @smoke2'"
```

### Reports:

```
src/test/resources/reports/SerenityReport (Serenity Clasic)
And
src/test/resources/reports/ExtentReporter (Extra Extent)
```