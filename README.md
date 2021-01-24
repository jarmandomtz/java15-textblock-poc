# Textblock Poc

Parsing a text from https://lipsum.com with many paragraphs, get just the first one and print in the console  

URL:   
  [https://github.com/jarmandomtz/java15-textblock-poc](https://github.com/jarmandomtz/java15-textblock-poc)

## Paragraphs

[content](docs/file.txt)

## POM.XML modifications

- Generate executable JAR file, add ***maven-jar-plugin*** plugin to maven
```
   <build>
        <plugins>
          <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-jar-plugin</artifactId>
            <version>3.2.0</version>
              <configuration>
                  <archive>
                      <manifest>
                          <addClasspath>true</addClasspath>
                          <mainClass>com.esausi.poc.textbloc.TextBlockMain</mainClass>
                      </manifest>
                  </archive>
              </configuration>
          </plugin>
        </plugins>
  </build>
```

## Execute example

```
% apt install sdk
% sdk list java
% sdk install java 15.0.2.hs-adpt
% sdk use java 15.0.2.hs-adpt
% java -version
% mvn package
% java -jar ./target/java15-texblock-poc-1.0-SNAPSHOT.jar 
```


