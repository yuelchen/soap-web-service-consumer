# soap-web-service-consumer
A Spring Web Service application for consuming a producers SOAP API via REST API.

## Overview
This is a SOAP Web Service consumer which will use a generated WSDL file from a producer to generate the required Java classes needed for making API calls. As a consumer, you can retrieve the WSDL file directly from URL (assuming it's http) or download / save the contents within your project. The below is the dataset.wsdl url for the producer Springboot project. 
```:
http://localhost:8080/ws/dataset.wsdl
```

## The Producer Springboot Project
You can find the SOAP Web Service producer project hosted on Github [here](https://github.com/yuelchen/soap-web-service-producer).

## Code Generation
For this project, we utilize the jaxws-maven-plugin to import the WSDL file and generate our Java classes under our source directory. 
```xml:
<plugin>
  <groupId>org.codehaus.mojo</groupId>
  <artifactId>jaxws-maven-plugin</artifactId>
  <version>2.6</version>
  <executions>
    <execution>
      <goals>
        <goal>wsimport</goal>
      </goals>
    </execution>
  </executions>
  <configuration>
    <wsdlDirectory>${project.basedir}/src/main/resources/wsdl/</wsdlDirectory>
    <packageName>com.yuelchen.soap.dataset</packageName>
    <sourceDestDir>${project.basedir}/src/main/java/</sourceDestDir>
  </configuration>
</plugin>
```

## Making REST API Calls
We wrapped a REST controller around our producer SOAP API endpoint so we can send JSON formatted messaged. The Jaxb2Marshaller will transform our JSONObject to and from XML when communicating with our Producer SOAP API endpoint. 

### Sample Success Request
```:
curl -X POST -H "content-type: application/json" -d '{"datasetName":"DSET99999999","datasetDescription":"This is a test dataset","datasetFieldsCount":2}' http://localhost:8081/createDataset
```

### Sample Success Payload Response
```JSON:
{
  "isCreated":true,
  "datasetName":"DSET99999999",
  "creationDate":"2022-09-10T04:00:00.000+00:00",
  "creationIssue":[]
}
```

### Sample Failure Request
```:
curl -X POST -H "content-type: application/json" -d '{"datasetName":"DSET9999","datasetDescription":"This is a test dataset","datasetFieldsCount":0}' http://localhost:8081/createDataset 
```

### Sample Failure Payload Response
```JSON:
{
  "isCreated":false,
  "datasetName":"DSET9999",
  "creationDate":null,
  "creationIssue":[
    "Dataset name must be at least 12 characters.",
    "Dataset request must contain at least one field."
  ]
} 
```
