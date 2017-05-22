//package com.kainos.external.services;
//
//import RequestObject;
//import ResponseObject;
//import ValueCheckerService;
//import IValueCheckerService;
//import com.kainos.apvs.example.enums.ClaimProcessingType;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class RequestObjectCheckerServiceTest {
//    IValueCheckerService claimChecker = new ValueCheckerService();
//
//    @Test
//    public void checkClaim50ShouldReturnAutomaticTest() {
//        RequestObject requestObject = new RequestObject(50);
//        ResponseObject processingTypeResponse = claimChecker.checkClaim(requestObject);
//
//        assertEquals(ClaimProcessingType.AUTOMATIC.toString(), processingTypeResponse.getProcessingType());
//    }
//
//    @Test
//    public void checkClaim100ShouldReturnManualTest() {
//        RequestObject requestObject = new RequestObject(100);
//        ResponseObject processingTypeResponse = claimChecker.checkClaim(requestObject);
//
//        assertEquals(ClaimProcessingType.MANUAL.toString(), processingTypeResponse.getProcessingType());
//    }
//
//    @Test
//    public void checkClaimDecimalShouldReturnManualTest() {
//        RequestObject requestObject = new RequestObject(100.5);
//        ResponseObject processingTypeResponse = claimChecker.checkClaim(requestObject);
//
//        assertEquals(ClaimProcessingType.MANUAL.toString(), processingTypeResponse.getProcessingType());
//    }
//}
