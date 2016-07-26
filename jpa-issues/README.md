# jpa-issues

This is a Maven3 / JPA 2.1 project that demonstrates JPA peformance issues and JPA 2.1 specific approaches. It uses Hibernate or EclipseLink as JPA 2.1 provider. 

Provider specific JPA persistence.xml files are located into:

  - EclipseLink -> /tools/orm/eclipseLink/persistence.xml
  - Hibernate   -> /tools/orm/hibernate/persistence.xml
  
To buid-it, be sure you have JDK 8 / Maven 3 properly configured; then, just open a terminal and run:


Hibernate version:
```sh
$ mvn clean install -Djpa.provider=hibernate
```

EclipseLink version:
```sh
$ mvn clean install -Djpa.provider=eclipseLink
```

