package Payload;

import com.e5.platform.core.event.PayloadError;
import e5.selectdataapi.model.smartcaregeneratereferralreportfb.*;

import java.util.ArrayList;
import java.util.List;

public class SmartcareGenerateReferralReportWithmock {

    public SmartcareGenerateReferralReportFBInputPayload positiveinputpayload() {
        SmartcareGenerateReferralReportFBInputPayload inputPayload = SmartcareGenerateReferralReportFBInputPayload.builder()
                .generateReferralReportCriteria(GenerateReferralReportCriteria.builder()
                        .generateReferralReportInputPayload(GenerateReferralReportInputPayload.builder()
                                .clientId(1)
                                .episodeId(1)
                                .facilityCode("RDJ")
                                .recordDate("2013-05-07T05:30:15.000Z")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareGenerateReferralReportFBOutputPayload positiveOutputPayload() {

        SmartcareGenerateReferralReportFBOutputPayload outputPayload = SmartcareGenerateReferralReportFBOutputPayload.builder()
                .generateReferralReportOutputPayload(GenerateReferralReportOutputPayload.builder()
                        .status(GenerateReferralReportOutputPayload.Status.FAILED).build()).build();
        return outputPayload;

    }

    public SmartcareGenerateReferralReportFBInputPayload invalidInputPayload() {
        SmartcareGenerateReferralReportFBInputPayload inputPayload = SmartcareGenerateReferralReportFBInputPayload.builder()
                .generateReferralReportCriteria(GenerateReferralReportCriteria.builder()
                        .generateReferralReportInputPayload(GenerateReferralReportInputPayload.builder()
                                .episodeId(1)
                                .facilityCode("RDJ")
                                .recordDate("2013-05-07T05:30:15.000Z")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareGenerateReferralReportFBOutputPayload invalidOutputPayload() {

        SmartcareGenerateReferralReportFBOutputPayload outputPayload = SmartcareGenerateReferralReportFBOutputPayload.builder()
                .generateReferralReportOutputPayload(GenerateReferralReportOutputPayload.builder()
                        .build()).build();
        return outputPayload;

    }
    public List<PayloadError> singleListedError() {
        List<PayloadError> payloadKnownError = new ArrayList<>();
        PayloadError error01 = PayloadError.builder()
                .errorCode("SE_001").errorMessage("Request timeout - Generate referral").errSrc("Delegation")
                .build();
        payloadKnownError.add(error01);
        return payloadKnownError;
    }
    public List<PayloadError> unknownSingleError() {
        List<PayloadError> payloadKnownError = new ArrayList<>();
        PayloadError error01 = PayloadError.builder()
                .errorCode("SE_131").errorMessage("Request timeout - Generate referral").errSrc("Delegation")
                .build();
        payloadKnownError.add(error01);
        return payloadKnownError;
    }

    public List<PayloadError> MultipleKnownErrors() {
        List<PayloadError> payloadErrorList = new ArrayList<>();

        payloadErrorList.add(PayloadError.builder().errorCode("BE_001").errorMessage("Username is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_002").errorMessage("Password is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_003").errorMessage("App hostname is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_004").errorMessage("Bad request - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_005").errorMessage("Unauthorized access - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_006").errorMessage("Forbidden access - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_007").errorMessage("Resource not found - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_008").errorMessage("Internal server - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_009").errorMessage("Bad gateway - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_010").errorMessage("Service unavailable - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_011").errorMessage("Request failed - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_012").errorMessage("User id is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_013").errorMessage("Username is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_014").errorMessage("Home url is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_015").errorMessage("Cookie is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_016").errorMessage("Invalid response payload - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_017").errorMessage("Client id is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_018").errorMessage("Facility code is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_019").errorMessage("Episode id is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_020").errorMessage("Record date is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_021").errorMessage("Cookie is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_022").errorMessage("Bad request - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_023").errorMessage("Unauthorized access - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_024").errorMessage("Forbidden access - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_025").errorMessage("Resource not found - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_026").errorMessage("Internal server - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_027").errorMessage("Bad gateway - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_028").errorMessage("Service unavailable - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_029").errorMessage("Request failed - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_030").errorMessage("Invalid response payload - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_001").errorMessage("Request timeout - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_002").errorMessage("Unknown error occurred - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_003").errorMessage("Request timeout - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_004").errorMessage("Unknown error occurred - Generate referral").errSrc("Delegation").build());

        return payloadErrorList;
    }

    public List<PayloadError> multipleunknownErrors() {
        List<PayloadError> payloadErrorList = new ArrayList<>();

        payloadErrorList.add(PayloadError.builder().errorCode("BE_111").errorMessage("Username is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_222").errorMessage("Password is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_333").errorMessage("App hostname is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_444").errorMessage("Bad request - Generate referral").errSrc("Delegation").build());
        return payloadErrorList;
      }

    public List<PayloadError> combinationofUnknownandknownerrors() {
        List<PayloadError> payloadErrorList = new ArrayList<>();

        payloadErrorList.add(PayloadError.builder().errorCode("BE_001").errorMessage("Username is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_002").errorMessage("Password is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_333").errorMessage("App hostname is invalid - Generate referral").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_444").errorMessage("Bad request - Generate referral").errSrc("Delegation").build());
        return payloadErrorList;
    }
}