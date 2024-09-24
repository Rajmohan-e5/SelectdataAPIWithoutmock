package Payload;

import com.e5.platform.core.event.PayloadError;
import e5.selectdataapi.model.smartcareuploadbatchfilefb.*;

import java.util.ArrayList;
import java.util.List;

public class SmartcareUploadBatchFilesWithMock {

    public SmartcareUploadBatchFileFBInputPayload positiveInputPayload() {
        SmartcareUploadBatchFileFBInputPayload inputPayload = SmartcareUploadBatchFileFBInputPayload.builder()
                .uploadBatchFileInputPayloadCriteria(UploadBatchFileInputPayloadCriteria.builder()
                        .uploadBatchFileInputPayload(UploadBatchFileInputPayload.builder()
                                .batchId("1")
                                .documentTypeId(UploadBatchFileInputPayload.DocumentTypeId.D_5)
                                .encompassId("45678uygfc")
                                .file("tvefda")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareUploadBatchFileFBOutputPayload positiveOutputPayload() {
        SmartcareUploadBatchFileFBOutputPayload outputPayload = SmartcareUploadBatchFileFBOutputPayload.builder()
                .uploadBatchFileOutputPayload(UploadBatchFileOutputPayload.builder()
                        .batchId("23re1qw")
                        .documentTypeId(UploadBatchFileOutputPayload.DocumentTypeId.D_5)
                        .fileId("dfghjh")
                        .encompassId("tvr3cwxqs")
                        .fileName("szrxdtcfyvuybi")
                        .fileStatusId(1)
                        .recommendFileType("pc.pdf")
                        .uploadedDate("2023-09-15T05:30:11.1111111+05:30")
                        .build()).build();
        return outputPayload;
    }

    public SmartcareUploadBatchFileFBInputPayload invalidInputPayload() {
        SmartcareUploadBatchFileFBInputPayload inputPayload = SmartcareUploadBatchFileFBInputPayload.builder()
                .uploadBatchFileInputPayloadCriteria(UploadBatchFileInputPayloadCriteria.builder()
                        .uploadBatchFileInputPayload(UploadBatchFileInputPayload.builder()
                                .documentTypeId(UploadBatchFileInputPayload.DocumentTypeId.D_5)
                                .encompassId("45678uygfc")
                                .file("tvefda")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareUploadBatchFileFBOutputPayload invalidOutputPayload() {
        SmartcareUploadBatchFileFBOutputPayload outputPayload = SmartcareUploadBatchFileFBOutputPayload.builder()
                .uploadBatchFileOutputPayload(UploadBatchFileOutputPayload.builder()
                        .batchId("23re1qw")
                        .documentTypeId(UploadBatchFileOutputPayload.DocumentTypeId.D_5)
                        .fileId("dfghjh")
                        .encompassId("tvr3cwxqs")
                        .fileName("szrxdtcfyvuybi")
                        .recommendFileType("pc.pdf")
                        .uploadedDate("2023-09-15T05:30:11.1111111+05:30")
                        .build()).build();
        return outputPayload;
    }

    public List<PayloadError> singleListedError() {
        List<PayloadError> payloadKnownError = new ArrayList<>();
        PayloadError error01 = PayloadError.builder()
                .errorCode("SE_001").errorMessage("Request timeout - Upload file").errSrc("Delegation")
                .build();
        payloadKnownError.add(error01);
        return payloadKnownError;
    }

    public List<PayloadError> unknownSingelError() {
        List<PayloadError> payloadKnownError = new ArrayList<>();
        PayloadError error01 = PayloadError.builder()
                .errorCode("SE_020").errorMessage("error message").errSrc("Delegation")
                .build();
        payloadKnownError.add(error01);
        return payloadKnownError;
    }

    public List<PayloadError> MultipleknownErrors() {
        List<PayloadError> payloadErrorList = new ArrayList<>();

        payloadErrorList.add(PayloadError.builder().errorCode("BE_001").errorMessage("Username is invalid  - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_002").errorMessage("Password is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_003").errorMessage("App hostname is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_004").errorMessage("Bad request - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_005").errorMessage("Unauthorized access - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_006").errorMessage("Forbidden access - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_007").errorMessage("Resource not found - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_008").errorMessage("Internal server - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_009").errorMessage("Bad gateway - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_010").errorMessage("Service unavailable - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_011").errorMessage("Request failed - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_012").errorMessage("User id is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_013").errorMessage("Username is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_014").errorMessage("Home url is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_015").errorMessage("Cookie is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_016").errorMessage("Invalid response payload - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_017").errorMessage("Document type id is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_018").errorMessage("Batch id is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_019").errorMessage("Encompass id is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_020").errorMessage("Cookie is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_021").errorMessage("Batch id invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_022").errorMessage("File name invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_023").errorMessage("File status id invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_024").errorMessage("Uploaded date invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_025").errorMessage("Invalid response payload - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_026").errorMessage("Bad request - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_027").errorMessage("Unauthorized access - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_028").errorMessage("Forbidden access - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_029").errorMessage("Resource not found - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_030").errorMessage("Internal server - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_031").errorMessage("Bad gateway - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_032").errorMessage("Service unavailable - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_033").errorMessage("Request failed - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_036").errorMessage("File not available in system to upload - Upload File").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_001").errorMessage("Request timeout - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_002").errorMessage("Unknown error occured - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_003").errorMessage("Unknown error occured - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_004").errorMessage("Request timeout - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("SE_005").errorMessage("Error while downloading the File from E5 cloud storage - Upload File").errSrc("Delegation").build());

        return payloadErrorList;
    }

    public List<PayloadError> unknownMultipleErrors() {
        List<PayloadError> payloadErrorList = new ArrayList<>();

        payloadErrorList.add(PayloadError.builder().errorCode("BE_100").errorMessage("Username is invalid  - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_332").errorMessage("Password is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_233").errorMessage("App hostname is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_454").errorMessage("Bad request - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_555").errorMessage("Unauthorized access - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_666").errorMessage("Forbidden access - Upload file").errSrc("Delegation").build());
        return payloadErrorList;
    }
    public List<PayloadError> combinationOfKnownAndUnknownErrors() {
        List<PayloadError> payloadErrorList = new ArrayList<>();

        payloadErrorList.add(PayloadError.builder().errorCode("BE_100").errorMessage("Username is invalid  - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_332").errorMessage("Password is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_233").errorMessage("App hostname is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_454").errorMessage("Bad request - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_555").errorMessage("Unauthorized access - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_666").errorMessage("Forbidden access - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_001").errorMessage("Username is invalid  - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_002").errorMessage("Password is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_003").errorMessage("App hostname is invalid - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_004").errorMessage("Bad request - Upload file").errSrc("Delegation").build());
        payloadErrorList.add(PayloadError.builder().errorCode("BE_005").errorMessage("Unauthorized access - Upload file").errSrc("Delegation").build());
        return payloadErrorList;
    }
}
