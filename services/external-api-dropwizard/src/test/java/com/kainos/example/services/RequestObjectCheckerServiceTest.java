package com.kainos.example.services;

import com.kainos.example.api.RequestObject;
import com.kainos.example.api.ResponseObject;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RequestObjectCheckerServiceTest {
    IValueCheckerService valueCheckerService = new ValueCheckerService();

    @Test
    public void checkClaim50ShouldReturnAutomaticTest() {
        RequestObject requestObject = new RequestObject(50);
        ResponseObject responseObject = valueCheckerService.checkValue(requestObject);

        assertTrue(responseObject.getMessages().contains("Great - less than 100"));
    }

    @Test
    public void checkClaim100ShouldReturnManualTest() {
        RequestObject requestObject = new RequestObject(100);
        ResponseObject responseObject = valueCheckerService.checkValue(requestObject);

        assertTrue(responseObject.getMessages().contains("Cool beans - 100 or more"));
    }
}
