package Payload;

import e5.selectdataapi.model.smartcaregeneratereferralreportfb.GenerateReferralReportOutputPayload;
import e5.selectdataapi.model.smartcaregeneratereferralreportfb.SmartcareGenerateReferralReportFBOutputPayload;

import java.util.ArrayList;
import java.util.List;

public class SmartCareGenerateReferralReportPostvalidation {

    public SmartcareGenerateReferralReportFBOutputPayload positiveFlow(){

        SmartcareGenerateReferralReportFBOutputPayload outputPayload = SmartcareGenerateReferralReportFBOutputPayload.builder()
                .generateReferralReportOutputPayload(GenerateReferralReportOutputPayload.builder()
                        .status(GenerateReferralReportOutputPayload.Status.FAILED).build()).build();
        return outputPayload;

    }

    public SmartcareGenerateReferralReportFBOutputPayload statusNull(){

        SmartcareGenerateReferralReportFBOutputPayload outputPayload = SmartcareGenerateReferralReportFBOutputPayload.builder()
                .generateReferralReportOutputPayload(GenerateReferralReportOutputPayload.builder()
                .build()).build();
        return outputPayload;

    }
}
