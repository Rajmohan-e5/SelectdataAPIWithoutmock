package Payload;

import e5.selectdataapi.model.smartcareuploadbatchfilefb.SmartcareUploadBatchFileFBInputPayload;
import e5.selectdataapi.model.smartcareuploadbatchfilefb.UploadBatchFileInputPayload;
import e5.selectdataapi.model.smartcareuploadbatchfilefb.UploadBatchFileInputPayloadCriteria;

public class SmartcareUploadBatchFilesPrevalidation {
    public SmartcareUploadBatchFileFBInputPayload positiveflow(){
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

    public SmartcareUploadBatchFileFBInputPayload BatchIdisNull(){
        SmartcareUploadBatchFileFBInputPayload inputPayload = SmartcareUploadBatchFileFBInputPayload.builder()
                .uploadBatchFileInputPayloadCriteria(UploadBatchFileInputPayloadCriteria.builder()
                        .uploadBatchFileInputPayload(UploadBatchFileInputPayload.builder()
                                .documentTypeId(UploadBatchFileInputPayload.DocumentTypeId.D_5)
                                .encompassId("45678uygfc")
                                .file("rtcdw")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareUploadBatchFileFBInputPayload BatchIDisEmpty(){
        SmartcareUploadBatchFileFBInputPayload inputPayload = SmartcareUploadBatchFileFBInputPayload.builder()
                .uploadBatchFileInputPayloadCriteria(UploadBatchFileInputPayloadCriteria.builder()
                        .uploadBatchFileInputPayload(UploadBatchFileInputPayload.builder()
                                .batchId("")
                                .documentTypeId(UploadBatchFileInputPayload.DocumentTypeId.D_5)
                                .encompassId("45678uygfc")
                                .file("56788uyg")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareUploadBatchFileFBInputPayload documetnTypeIDNull(){
        SmartcareUploadBatchFileFBInputPayload inputPayload = SmartcareUploadBatchFileFBInputPayload.builder()
                .uploadBatchFileInputPayloadCriteria(UploadBatchFileInputPayloadCriteria.builder()
                        .uploadBatchFileInputPayload(UploadBatchFileInputPayload.builder()
                                .batchId("4578uyf")
                                .encompassId("45678uygfc")
                                .file("56788uyg")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareUploadBatchFileFBInputPayload encompassIDisNull(){
        SmartcareUploadBatchFileFBInputPayload inputPayload = SmartcareUploadBatchFileFBInputPayload.builder()
                .uploadBatchFileInputPayloadCriteria(UploadBatchFileInputPayloadCriteria.builder()
                        .uploadBatchFileInputPayload(UploadBatchFileInputPayload.builder()
                                .batchId("465789oigf")
                                .documentTypeId(UploadBatchFileInputPayload.DocumentTypeId.D_5)
                                .file("56788uyg")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareUploadBatchFileFBInputPayload encompassIDisEmpty(){
        SmartcareUploadBatchFileFBInputPayload inputPayload = SmartcareUploadBatchFileFBInputPayload.builder()
                .uploadBatchFileInputPayloadCriteria(UploadBatchFileInputPayloadCriteria.builder()
                        .uploadBatchFileInputPayload(UploadBatchFileInputPayload.builder()
                                .batchId("465789oigf")
                                .encompassId("")
                                .documentTypeId(UploadBatchFileInputPayload.DocumentTypeId.D_5)
                                .file("56788uyg")
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareUploadBatchFileFBInputPayload fileisNUll(){
        SmartcareUploadBatchFileFBInputPayload inputPayload = SmartcareUploadBatchFileFBInputPayload.builder()
                .uploadBatchFileInputPayloadCriteria(UploadBatchFileInputPayloadCriteria.builder()
                        .uploadBatchFileInputPayload(UploadBatchFileInputPayload.builder()
                                .batchId("465789oigf")
                                .encompassId("r809oh")
                                .documentTypeId(UploadBatchFileInputPayload.DocumentTypeId.D_5)
                                .build()).build()).build();
        return inputPayload;
    }

    public SmartcareUploadBatchFileFBInputPayload fileisEmpty(){
        SmartcareUploadBatchFileFBInputPayload inputPayload = SmartcareUploadBatchFileFBInputPayload.builder()
                .uploadBatchFileInputPayloadCriteria(UploadBatchFileInputPayloadCriteria.builder()
                        .uploadBatchFileInputPayload(UploadBatchFileInputPayload.builder()
                                .batchId("465789oigf")
                                .file("")
                                .encompassId("r809oh")
                                .documentTypeId(UploadBatchFileInputPayload.DocumentTypeId.D_5)
                                .build()).build()).build();
        return inputPayload;
    }

}
