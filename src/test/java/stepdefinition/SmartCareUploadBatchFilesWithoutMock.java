package stepdefinition;

import com.e5.platform.core.domains.FunctionBlockSandboxResponse;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOption;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareCreateBatchFB;
import e5.selectdataapi.functionblock.generated.SmartcareUploadBatchFileFB;
import e5.selectdataapi.model.smartcarecreatebatchfb.SmartcareCreateBatchFBInputPayload;
import e5.selectdataapi.model.smartcareuploadbatchfilefb.SmartcareUploadBatchFileFBInputPayload;
import e5.selectdataapi.model.smartcareuploadbatchfilefb.UploadBatchFileInputPayload;
import e5.selectdataapi.model.smartcareuploadbatchfilefb.UploadBatchFileInputPayloadCriteria;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmartCareUploadBatchFilesWithoutMock {

    FunctionBlockInput<Object> fbInput;
    FunctionBlockSandboxResponse<Object> functionBlockResponse;

    FunctionBlockOutput<Object> functionBlockOutput;

    @Given("user builds the input value for Upload Batch Files FB")
    public void user_builds_the_input_value_for_upload_batch_files_fb() {
        SmartcareUploadBatchFileFBInputPayload inputPayload = SmartcareUploadBatchFileFBInputPayload.builder()
                .uploadBatchFileInputPayloadCriteria(UploadBatchFileInputPayloadCriteria.builder()
                        .uploadBatchFileInputPayload(UploadBatchFileInputPayload.builder()
                                .batchId("1172220")
                                .documentTypeId(UploadBatchFileInputPayload.DocumentTypeId.D_5)
                                .encompassId("1172220")
                                .file("eyJ2IjogIjEuMSIsICJzdG9yYWdlSW5mbyI6IHsia2V5IjogIjA5MTMyMDI0L0Q6L0VYVFJBQ1RFRF9aSVAvQUJaWlpFTCwgSk9FL1BERi0yLlBERiIsICJyZWdpb24iOiAidXMtZWFzdC0xIiwgImJ1Y2tldF9uYW1lIjogImU1LW5vbnByb2QtcGxhdGZvcm0tcmYtc2NyZWVuLXJlY29yZGluZ3MifSwgInN0b3JhZ2VUeXBlIjogIlMzIn0=")
                                .build()).build()).build();
        fbInput = FunctionBlockInput.builder()
                .payload(inputPayload)
                .fbName("SmartcareCreateBatch")
                .options(FunctionBlockOption.builder().maximumAttempts(1).build())
                .genericType(SmartcareUploadBatchFileFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB for Upload Batch Files FB")
    public void user_runs_the_fb_for_upload_batch_files_fb() {
        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class);
        functionBlockResponse = sandbox.startExecution(fbInput);
    }
    @Then("user gets the Fboutput for Upload Bathc Files FB")
    public void user_gets_the_fboutput_for_upload_bathc_files_fb() {
        functionBlockOutput = functionBlockResponse.getFunctionBlockOutput();
    }
    @Then("User validates the result using for Upload Batch Files FB")
    public void user_validates_the_result_using_for_upload_batch_files_fb() {
        System.out.println(functionBlockOutput);
        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
    }
}
