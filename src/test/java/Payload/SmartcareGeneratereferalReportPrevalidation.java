package Payload;

import e5.selectdataapi.model.smartcaregeneratereferralreportfb.GenerateReferralReportCriteria;
import e5.selectdataapi.model.smartcaregeneratereferralreportfb.GenerateReferralReportInputPayload;
import e5.selectdataapi.model.smartcaregeneratereferralreportfb.SmartcareGenerateReferralReportFBInputPayload;

public class SmartcareGeneratereferalReportPrevalidation {
    public SmartcareGenerateReferralReportFBInputPayload positiveFlow(){
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

    public SmartcareGenerateReferralReportFBInputPayload clientIDNull(){
        SmartcareGenerateReferralReportFBInputPayload inputPayload = SmartcareGenerateReferralReportFBInputPayload.builder()
                .generateReferralReportCriteria(GenerateReferralReportCriteria.builder()
                        .generateReferralReportInputPayload(GenerateReferralReportInputPayload.builder()
                                .episodeId(1)
                                .facilityCode("RDJ")
                                .recordDate("2013-05-07T05:30:15.000Z")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareGenerateReferralReportFBInputPayload clientIDminimumchar(){
        SmartcareGenerateReferralReportFBInputPayload inputPayload = SmartcareGenerateReferralReportFBInputPayload.builder()
                .generateReferralReportCriteria(GenerateReferralReportCriteria.builder()
                        .generateReferralReportInputPayload(GenerateReferralReportInputPayload.builder()
                                .clientId(-1)
                                .episodeId(1)
                                .facilityCode("RDJ")
                                .recordDate("2013-05-07T05:30:15.000Z")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareGenerateReferralReportFBInputPayload episodeIDNull(){
        SmartcareGenerateReferralReportFBInputPayload inputPayload = SmartcareGenerateReferralReportFBInputPayload.builder()
                .generateReferralReportCriteria(GenerateReferralReportCriteria.builder()
                        .generateReferralReportInputPayload(GenerateReferralReportInputPayload.builder()
                                .clientId(1)
                                .facilityCode("RDJ")
                                .recordDate("2013-05-07T05:30:15.000Z")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareGenerateReferralReportFBInputPayload episodeIDMinimumChar(){
        SmartcareGenerateReferralReportFBInputPayload inputPayload = SmartcareGenerateReferralReportFBInputPayload.builder()
                .generateReferralReportCriteria(GenerateReferralReportCriteria.builder()
                        .generateReferralReportInputPayload(GenerateReferralReportInputPayload.builder()
                                .clientId(1)
                                .facilityCode("RDJ")
                                .episodeId(-1)
                                .recordDate("2013-05-07T05:30:15.000Z")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareGenerateReferralReportFBInputPayload facilityCodeNull(){
        SmartcareGenerateReferralReportFBInputPayload inputPayload = SmartcareGenerateReferralReportFBInputPayload.builder()
                .generateReferralReportCriteria(GenerateReferralReportCriteria.builder()
                        .generateReferralReportInputPayload(GenerateReferralReportInputPayload.builder()
                                .clientId(1)
                                .episodeId(1)
                                .recordDate("2013-05-07T05:30:15.000Z")
                                .build()).build()).build();
        return inputPayload;
    }
    public SmartcareGenerateReferralReportFBInputPayload facilityCodeisEmpty(){
        SmartcareGenerateReferralReportFBInputPayload inputPayload = SmartcareGenerateReferralReportFBInputPayload.builder()
                .generateReferralReportCriteria(GenerateReferralReportCriteria.builder()
                        .generateReferralReportInputPayload(GenerateReferralReportInputPayload.builder()
                                .clientId(1)
                                .facilityCode("")
                                .episodeId(1)
                                .recordDate("2013-05-07T05:30:15.000Z")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareGenerateReferralReportFBInputPayload facilitycodemaxchar(){
        SmartcareGenerateReferralReportFBInputPayload inputPayload = SmartcareGenerateReferralReportFBInputPayload.builder()
                .generateReferralReportCriteria(GenerateReferralReportCriteria.builder()
                        .generateReferralReportInputPayload(GenerateReferralReportInputPayload.builder()
                                .clientId(1)
                                .facilityCode("RDJHF")
                                .episodeId(1)
                                .recordDate("2013-05-07T05:30:15.000Z")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareGenerateReferralReportFBInputPayload recordDateNull(){
        SmartcareGenerateReferralReportFBInputPayload inputPayload = SmartcareGenerateReferralReportFBInputPayload.builder()
                .generateReferralReportCriteria(GenerateReferralReportCriteria.builder()
                        .generateReferralReportInputPayload(GenerateReferralReportInputPayload.builder()
                                .clientId(1)
                                .facilityCode("RDJ")
                                .episodeId(1)
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareGenerateReferralReportFBInputPayload recordDateInvalidFormat(){
        SmartcareGenerateReferralReportFBInputPayload inputPayload = SmartcareGenerateReferralReportFBInputPayload.builder()
                .generateReferralReportCriteria(GenerateReferralReportCriteria.builder()
                        .generateReferralReportInputPayload(GenerateReferralReportInputPayload.builder()
                                .clientId(1)
                                .facilityCode("RDJ")
                                .episodeId(1)
                                .recordDate("qwef")
                                .build()).build()).build();
        return inputPayload;
    }
}
