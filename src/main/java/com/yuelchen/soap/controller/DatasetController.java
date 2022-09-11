package com.yuelchen.soap.controller;

import com.yuelchen.soap.client.SoapClient;
import com.yuelchen.soap.dataset.DatasetRequest;
import com.yuelchen.soap.dataset.DatasetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

@RestController
public class DatasetController {

    @Autowired
    private SoapClient client;

    @PostMapping("/createDataset")
    public DatasetResponse invokeCreateDataset(@RequestBody DatasetRequest request) {
        return this.client.createDataset(request);
    }
}
