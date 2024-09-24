package Payload;

import e5.selectdataapi.model.smartcareuploadbatchfilefb.SmartcareUploadBatchFileFBOutputPayload;
import e5.selectdataapi.model.smartcareuploadbatchfilefb.UploadBatchFileOutputPayload;

public class SmartCareUploadBatchFilesPostvalidation {

    public SmartcareUploadBatchFileFBOutputPayload positiveFlow(){
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

    public SmartcareUploadBatchFileFBOutputPayload fileIDNull(){
        SmartcareUploadBatchFileFBOutputPayload outputPayload = SmartcareUploadBatchFileFBOutputPayload.builder()
                .uploadBatchFileOutputPayload(UploadBatchFileOutputPayload.builder()
                        .batchId("456tgf")
                        .documentTypeId(UploadBatchFileOutputPayload.DocumentTypeId.D_5)
                        .encompassId("tvr3cwxqs")
                        .fileName("vr3cq")
                        .fileStatusId(1)
                        .recommendFileType("pc.pdf")
                        .uploadedDate("2023-09-15T05:30:11.1111111+05:30")
                        .build()).build();
        return outputPayload;
    }

    public SmartcareUploadBatchFileFBOutputPayload fileIDisEmpty(){
        SmartcareUploadBatchFileFBOutputPayload outputPayload = SmartcareUploadBatchFileFBOutputPayload.builder()
                .uploadBatchFileOutputPayload(UploadBatchFileOutputPayload.builder()
                        .batchId("456tgf")
                        .fileId("")
                        .documentTypeId(UploadBatchFileOutputPayload.DocumentTypeId.D_5)
                        .encompassId("tvr3cwxqs")
                        .fileName("vr3cq")
                        .fileStatusId(1)
                        .recommendFileType("pc.pdf")
                        .uploadedDate("2023-09-15T05:30:11.1111111+05:30")
                        .build()).build();
        return outputPayload;
    }

    public SmartcareUploadBatchFileFBOutputPayload fileNameNull(){
        SmartcareUploadBatchFileFBOutputPayload outputPayload = SmartcareUploadBatchFileFBOutputPayload.builder()
                .uploadBatchFileOutputPayload(UploadBatchFileOutputPayload.builder()
                        .batchId("456tgf")
                        .fileId("123es")
                        .documentTypeId(UploadBatchFileOutputPayload.DocumentTypeId.D_5)
                        .encompassId("tvr3cwxqs")
                        .fileStatusId(1)
                        .recommendFileType("pc.pdf")
                        .uploadedDate("2023-09-15T05:30:11.1111111+05:30")
                        .build()).build();
        return outputPayload;
    }

    public SmartcareUploadBatchFileFBOutputPayload fileNameisEmpty(){
        SmartcareUploadBatchFileFBOutputPayload outputPayload = SmartcareUploadBatchFileFBOutputPayload.builder()
                .uploadBatchFileOutputPayload(UploadBatchFileOutputPayload.builder()
                        .batchId("456tgf")
                        .fileId("123es")
                        .documentTypeId(UploadBatchFileOutputPayload.DocumentTypeId.D_5)
                        .encompassId("tvr3cwxqs")
                        .fileStatusId(1)
                        .fileName("")
                        .recommendFileType("pc.pdf")
                        .uploadedDate("2023-09-15T05:30:11.1111111+05:30")
                        .build()).build();
        return outputPayload;
    }

    public SmartcareUploadBatchFileFBOutputPayload uploadedDateNull(){
        SmartcareUploadBatchFileFBOutputPayload outputPayload = SmartcareUploadBatchFileFBOutputPayload.builder()
                .uploadBatchFileOutputPayload(UploadBatchFileOutputPayload.builder()
                        .batchId("456tgf")
                        .fileId("I2233")
                        .documentTypeId(UploadBatchFileOutputPayload.DocumentTypeId.D_5)
                        .encompassId("tvr3cwxqs")
                        .fileStatusId(1)
                        .recommendFileType("pc.pdf")
                        .fileName("4sedry")
                        .build()).build();
        return outputPayload;
    }

    public SmartcareUploadBatchFileFBOutputPayload invalidUploadDate(){
        SmartcareUploadBatchFileFBOutputPayload outputPayload = SmartcareUploadBatchFileFBOutputPayload.builder()
                .uploadBatchFileOutputPayload(UploadBatchFileOutputPayload.builder()
                        .batchId("456tgf")
                        .fileId("I2233")
                        .documentTypeId(UploadBatchFileOutputPayload.DocumentTypeId.D_5)
                        .encompassId("tvr3cwxqs")
                        .uploadedDate("05/06/2023")
                        .fileStatusId(1)
                        .recommendFileType("pc.pdf")
                        .fileName("4sedry")
                        .build()).build();
        return outputPayload;
    }

    public SmartcareUploadBatchFileFBOutputPayload StatusIDNull(){
        SmartcareUploadBatchFileFBOutputPayload outputPayload = SmartcareUploadBatchFileFBOutputPayload.builder()
                .uploadBatchFileOutputPayload(UploadBatchFileOutputPayload.builder()
                        .batchId("456tgf")
                        .fileId("4tr312")
                        .documentTypeId(UploadBatchFileOutputPayload.DocumentTypeId.D_5)
                        .encompassId("tvr3cwxqs")
                        .recommendFileType("pc.pdf")
                        .uploadedDate("2023-09-15T05:30:11.1111111+05:30")
                        .fileName("4sedry")
                        .build()).build();
        return outputPayload;
    }

    public SmartcareUploadBatchFileFBOutputPayload mincharecterFileStatusID(){
        SmartcareUploadBatchFileFBOutputPayload outputPayload = SmartcareUploadBatchFileFBOutputPayload.builder()
                .uploadBatchFileOutputPayload(UploadBatchFileOutputPayload.builder()
                        .batchId("456tgf")
                        .fileId("4tr312")
                        .fileStatusId(-1)
                        .documentTypeId(UploadBatchFileOutputPayload.DocumentTypeId.D_5)
                        .encompassId("tvr3cwxqs")
                        .recommendFileType("pc.pdf")
                        .uploadedDate("2023-09-15T05:30:11.1111111+05:30")
                        .fileName("4sedry")
                        .build()).build();
        return outputPayload;
    }
}

