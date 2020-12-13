[![Build Status](https://secure.travis-ci.org/dpaukov/combinatoricslib-example.png)](http://travis-ci.org/dpaukov/combinatoricslib-example)

# combinatoricslib-example
This project contains code examples of how to use [java combinatorics library](https://github.com/dpaukov/combinatoricslib)


## How to build and execute the examples

```
mvn package exec:java -Dexec.mainClass="org.paukov.combinatoricslibexample.Main"
```


## See more examples on the project page
[https://github.com/dpaukov/combinatoricslib](https://github.com/dpaukov/combinatoricslib)


## pom.xml
Include the following section into your pom.xml file if you want to use this library.
```
<dependency>
  <groupId>com.googlecode.combinatoricslib</groupId>
  <artifactId>combinatoricslib</artifactId>
  <version>2.3</version>
  <scope>compile</scope>
</dependency>
```