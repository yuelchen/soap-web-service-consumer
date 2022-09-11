package com.yuelchen.soap.client;

import com.yuelchen.soap.dataset.DatasetRequest;
import com.yuelchen.soap.dataset.DatasetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClient {

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    private WebServiceTemplate webServiceTemplate;

    public DatasetResponse createDataset(DatasetRequest request) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        DatasetResponse response = (DatasetResponse) webServiceTemplate
                .marshalSendAndReceive("http://localhost:8080/ws", request);
        return response;
    }
}