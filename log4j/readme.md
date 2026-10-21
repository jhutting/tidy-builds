Run build with local demo-repository:
```shell
mvn -s ../settings.xml spring-boot:run
```
This will contain a vulnerable log4j, however, this does not display it:
```shell
mvn -s ../settings.xml dependency:tree
```
