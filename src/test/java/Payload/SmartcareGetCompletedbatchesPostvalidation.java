package Payload;

import e5.selectdataapi.model.smartcarecreatebatchfb.CreateBatchOutputPayload;
import e5.selectdataapi.model.smartcarecreatebatchfb.SmartcareCreateBatchFBOutputPayload;
import e5.selectdataapi.model.smartcaregetcompletedbatchesfb.GetCompletedBatchesOutputPayload;
import e5.selectdataapi.model.smartcaregetcompletedbatchesfb.SmartcareGetCompletedBatchesFBOutputPayload;

import java.util.ArrayList;
import java.util.List;

public class SmartcareGetCompletedbatchesPostvalidation {
    public SmartcareGetCompletedBatchesFBOutputPayload positiveFlow() {
        List<GetCompletedBatchesOutputPayload> getCompletedBatchesOutputPayloadList = new ArrayList<>();
        getCompletedBatchesOutputPayloadList.add(GetCompletedBatchesOutputPayload.builder()
                .version("0.3.1")
                .statusId(1)
                .statusDate("2021-01-30T11:11:11.1111111+05:30")
                .recordDate("2021-01-30T11:11:11.1111111+05:30")
                .patientId("I224341")
                .firstName("Dead")
                .lastName("Pool")
                .id(1)
                .facilityCode("2345678uys")
                .build());
        SmartcareGetCompletedBatchesFBOutputPayload outputPayload = SmartcareGetCompletedBatchesFBOutputPayload.builder()
                .getCompletedBatchesOutputPayload(getCompletedBatchesOutputPayloadList).build();
    return outputPayload;

    }

    public SmartcareGetCompletedBatchesFBOutputPayload patientIDNull() {
        List<GetCompletedBatchesOutputPayload> getCompletedBatchesOutputPayloadList = new ArrayList<>();
        getCompletedBatchesOutputPayloadList.add(GetCompletedBatchesOutputPayload.builder()
                .version("0.3.1")
                .statusId(1)
                .statusDate("2021-01-30T11:11:11.1111111+05:30")
                .recordDate("2021-01-30T11:11:11.1111111+05:30")
                .firstName("Dead")
                .lastName("Pool")
                .id(1)
                .facilityCode("tre345")
                .build());
        SmartcareGetCompletedBatchesFBOutputPayload outputPayload = SmartcareGetCompletedBatchesFBOutputPayload.builder()
                .getCompletedBatchesOutputPayload(getCompletedBatchesOutputPayloadList).build();
        return outputPayload;

    }

    public SmartcareGetCompletedBatchesFBOutputPayload patientIDisEmpty() {
        List<GetCompletedBatchesOutputPayload> getCompletedBatchesOutputPayloadList = new ArrayList<>();
        getCompletedBatchesOutputPayloadList.add(GetCompletedBatchesOutputPayload.builder()
                .patientId("")
                .version("0.3.1")
                .statusId(1)
                .statusDate("2021-01-30T11:11:11.1111111+05:30")
                .recordDate("2021-01-30T11:11:11.1111111+05:30")
                .firstName("Dead")
                .lastName("Pool")
                .id(1)
                .facilityCode("tre345")
                .build());
        SmartcareGetCompletedBatchesFBOutputPayload outputPayload = SmartcareGetCompletedBatchesFBOutputPayload.builder()
                .getCompletedBatchesOutputPayload(getCompletedBatchesOutputPayloadList).build();
        return outputPayload;

    }

    public SmartcareGetCompletedBatchesFBOutputPayload IDNull() {
        List<GetCompletedBatchesOutputPayload> getCompletedBatchesOutputPayloadList = new ArrayList<>();
        getCompletedBatchesOutputPayloadList.add(GetCompletedBatchesOutputPayload.builder()
                .version("0.3.1")
                .statusId(1)
                .statusDate("2021-01-30T11:11:11.1111111+05:30")
                .recordDate("2021-01-30T11:11:11.1111111+05:30")
                .firstName("Dead")
                .lastName("Pool")
                .patientId("345678yuf")
                .facilityCode("tre345")
                .build());
        SmartcareGetCompletedBatchesFBOutputPayload outputPayload = SmartcareGetCompletedBatchesFBOutputPayload.builder()
                .getCompletedBatchesOutputPayload(getCompletedBatchesOutputPayloadList).build();
        return outputPayload;

    }

    public SmartcareGetCompletedBatchesFBOutputPayload idMinValue() {
        List<GetCompletedBatchesOutputPayload> getCompletedBatchesOutputPayloadList = new ArrayList<>();
        getCompletedBatchesOutputPayloadList.add(GetCompletedBatchesOutputPayload.builder()
                .version("0.3.1")
                .id(-1)
                .statusId(1)
                .statusDate("2021-01-30T11:11:11.1111111+05:30")
                .recordDate("2021-01-30T11:11:11.1111111+05:30")
                .firstName("Dead")
                .lastName("Pool")
                .patientId("345678yuf")
                .facilityCode("tre345")
                .build());
        SmartcareGetCompletedBatchesFBOutputPayload outputPayload = SmartcareGetCompletedBatchesFBOutputPayload.builder()
                .getCompletedBatchesOutputPayload(getCompletedBatchesOutputPayloadList).build();
        return outputPayload;

    }

    public SmartcareGetCompletedBatchesFBOutputPayload statusIDisNull() {
        List<GetCompletedBatchesOutputPayload> getCompletedBatchesOutputPayloadList = new ArrayList<>();
        getCompletedBatchesOutputPayloadList.add(GetCompletedBatchesOutputPayload.builder()
                .version("0.3.1")
                .statusDate("2021-01-30T11:11:11.1111111+05:30")
                .recordDate("2021-01-30T11:11:11.1111111+05:30")
                .firstName("Dead")
                .lastName("Pool")
                .patientId("345678yuf")
                .id(1)
                .facilityCode("tre345")
                .build());
        SmartcareGetCompletedBatchesFBOutputPayload outputPayload = SmartcareGetCompletedBatchesFBOutputPayload.builder()
                .getCompletedBatchesOutputPayload(getCompletedBatchesOutputPayloadList).build();
        return outputPayload;

    }
}