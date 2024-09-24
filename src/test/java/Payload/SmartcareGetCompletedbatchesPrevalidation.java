package Payload;

import e5.selectdataapi.model.smartcaregetcompletedbatchesfb.GetCompletedBatchesInputPayload;
import e5.selectdataapi.model.smartcaregetcompletedbatchesfb.GetCompletedBatchesInputPayloadCriteria;
import e5.selectdataapi.model.smartcaregetcompletedbatchesfb.SmartcareGetCompletedBatchesFBInputPayload;

public class SmartcareGetCompletedbatchesPrevalidation {
    public SmartcareGetCompletedBatchesFBInputPayload positiveflow(){
            SmartcareGetCompletedBatchesFBInputPayload inputpayload = SmartcareGetCompletedBatchesFBInputPayload.builder()
                    .getCompletedBatchesInputPayloadCriteria(GetCompletedBatchesInputPayloadCriteria.builder()
                            .getCompletedBatchesInputPayload(GetCompletedBatchesInputPayload.builder()
                                    .clientId("xrt53433")
                                    .dateTime("2018-05-14T15:45:18.070Z")
                                    .minutes("12:38:45")
                                    .build()).build()).build();
            return inputpayload;
    }

    public SmartcareGetCompletedBatchesFBInputPayload clientIDEmpty(){
        SmartcareGetCompletedBatchesFBInputPayload inputpayload = SmartcareGetCompletedBatchesFBInputPayload.builder()
                .getCompletedBatchesInputPayloadCriteria(GetCompletedBatchesInputPayloadCriteria.builder()
                        .getCompletedBatchesInputPayload(GetCompletedBatchesInputPayload.builder()
                                .clientId("")
                                .dateTime("2018-05-14T15:45:18.070Z")
                                .minutes("12:38:45")
                                .build()).build()).build();
        return inputpayload;
    }

    public SmartcareGetCompletedBatchesFBInputPayload clientIDNull(){
        SmartcareGetCompletedBatchesFBInputPayload inputpayload = SmartcareGetCompletedBatchesFBInputPayload.builder()
                .getCompletedBatchesInputPayloadCriteria(GetCompletedBatchesInputPayloadCriteria.builder()
                        .getCompletedBatchesInputPayload(GetCompletedBatchesInputPayload.builder()
                                .dateTime("2018-05-14T15:45:18.070Z")
                                .minutes("12:38:45")
                                .build()).build()).build();
        return inputpayload;
    }
    public SmartcareGetCompletedBatchesFBInputPayload DateandTimeNull(){
        SmartcareGetCompletedBatchesFBInputPayload inputpayload = SmartcareGetCompletedBatchesFBInputPayload.builder()
                .getCompletedBatchesInputPayloadCriteria(GetCompletedBatchesInputPayloadCriteria.builder()
                        .getCompletedBatchesInputPayload(GetCompletedBatchesInputPayload.builder()
                                .clientId("132456ytrfds")
                                .minutes("12:38:45")
                                .build()).build()).build();
        return inputpayload;
    }

    public SmartcareGetCompletedBatchesFBInputPayload invalidDateandTimeFormat(){
        SmartcareGetCompletedBatchesFBInputPayload inputpayload = SmartcareGetCompletedBatchesFBInputPayload.builder()
                .getCompletedBatchesInputPayloadCriteria(GetCompletedBatchesInputPayloadCriteria.builder()
                        .getCompletedBatchesInputPayload(GetCompletedBatchesInputPayload.builder()
                                .clientId("132456ytrfds")
                                .dateTime("345678fcvg")
                                .minutes("12:38:45")
                                .build()).build()).build();
        return inputpayload;
    }

    public SmartcareGetCompletedBatchesFBInputPayload invalidMinutesFormat(){
        SmartcareGetCompletedBatchesFBInputPayload inputpayload = SmartcareGetCompletedBatchesFBInputPayload.builder()
                .getCompletedBatchesInputPayloadCriteria(GetCompletedBatchesInputPayloadCriteria.builder()
                        .getCompletedBatchesInputPayload(GetCompletedBatchesInputPayload.builder()
                                .clientId("132456ytrfds")
                                .dateTime("2018-05-14T15:45:18.070Z")
                                .minutes("12:3800:45")
                                .build()).build()).build();
        return inputpayload;
    }
}
