# jpa-issues

This is a Maven3 / JPA 2.1 project that demonstrates JPA peformance issues and JPA 2.1 specific approaches. It uses Hibernate or EclipseLink as JPA 2.1 provider. To buid-it, just run:


Hibernate version:
```sh
$ mvn clean install -Djpa.provider=hibernate
```

EclipseLink version:
```sh
$ mvn clean install -Djpa.provider=eclipseLink
```

