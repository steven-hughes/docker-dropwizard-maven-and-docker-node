//package com.kainos.external.resources;
//
//import RequestObject;
//import ResponseObject;
//import ValueCheckerResource;
//import IValueCheckerService;
//import com.kainos.apvs.example.enums.ClaimProcessingType;
//import io.dropwizard.testing.junit.ResourceTestRule;
//import org.junit.ClassRule;
//import org.junit.Test;
//
//import static org.mockito.Matchers.*;
//import static org.mockito.Mockito.mock;
//
//import javax.ws.rs.client.Entity;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.when;
//
//public class RequestObjectCheckerResourceTest {
//    static IValueCheckerService claimCheckerService = mock(IValueCheckerService.class);
//    final String CHECK_FOR_AUTOMATIC_PROCESSING = "/check-value";
//
//    @ClassRule
//    public static final ResourceTestRule resources = ResourceTestRule.builder()
//            .addResource(new ValueCheckerResource(claimCheckerService))
//            .build();
//
//    @Test
//    public void postCheckForAutomaticProcessing50ShouldReturnAutomaticTest() throws Exception {
//        RequestObject requestObject = new RequestObject(50);
//        when(claimCheckerService.checkClaim(any(RequestObject.class)))
//                .thenReturn(new ResponseObject(ClaimProcessingType.AUTOMATIC.toString(), null));
//
//        ResponseObject processingTypeResponse = resources.client()
//                .target(CHECK_FOR_AUTOMATIC_PROCESSING)
//                .request()
//                .post(Entity.json(requestObject), ResponseObject.class);
//
//        assertEquals(ClaimProcessingType.AUTOMATIC.toString(), processingTypeResponse.getProcessingType());
//    }
//
//    @Test
//    public void postCheckForAutomaticProcessing100ShouldReturnManual() throws Exception {
//        RequestObject requestObject = new RequestObject(100);
//        when(claimCheckerService.checkClaim(any(RequestObject.class)))
//                .thenReturn(new ResponseObject(ClaimProcessingType.MANUAL.toString(), null));
//
//        ResponseObject processingTypeResponse = resources.client()
//                .target(CHECK_FOR_AUTOMATIC_PROCESSING)
//                .request()
//                .post(Entity.json(requestObject), ResponseObject.class);
//
//        assertEquals(ClaimProcessingType.MANUAL.toString(), processingTypeResponse.getProcessingType());
//    }
//
//    @Test
//    public void postCheckForAutomaticProcessingDecimalShouldReturnManual() throws Exception {
//        RequestObject requestObject = new RequestObject(100.5);
//        when(claimCheckerService.checkClaim(any(RequestObject.class)))
//                .thenReturn(new ResponseObject(ClaimProcessingType.MANUAL.toString(), null));
//
//        ResponseObject processingTypeResponse = resources.client()
//                .target(CHECK_FOR_AUTOMATIC_PROCESSING)
//                .request()
//                .post(Entity.json(requestObject), ResponseObject.class);
//
//        assertEquals(ClaimProcessingType.MANUAL.toString(), processingTypeResponse.getProcessingType());
//    }
//}
