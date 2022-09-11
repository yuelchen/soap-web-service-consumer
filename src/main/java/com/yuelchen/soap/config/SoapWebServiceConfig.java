package com.yuelchen.soap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Used for converting from our Java objects to XML.
 * The Java objects we will be converting are the ones created from the WSDL file.
 */
@Configuration
public class SoapWebServiceConfig {

    /**
     * Used for scanning the binding classes which was generated from WSDL file.
     *
     * @return Jaxb2Marshaller      A Jaxb2Marshaller class that is configured
     *                              with our Java objects for SOAP API.
     */
    @Bean
    public Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.yuelchen.soap.dataset");
        return marshaller;
    }
}
