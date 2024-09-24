package stepdefinition;

import com.e5.platform.core.domains.FunctionBlockSandboxResponse;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOption;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareUpdateBatchStatusFB;
import e5.selectdataapi.model.smartcareupdatebatchstatusfb.SmartcareUpdateBatchStatusFBInputPayload;
import e5.selectdataapi.model.smartcareupdatebatchstatusfb.UpdateBatchStatusCriteria;
import e5.selectdataapi.model.smartcareupdatebatchstatusfb.UpdateBatchStatusInputPayload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmartcareUpdateBatchStatusWithoutmock {


    FunctionBlockInput<Object> fbInput;
    FunctionBlockSandboxResponse<Object> functionBlockResponse;

    FunctionBlockOutput<Object> functionBlockOutput;

    @Given("user builds the input value for update batch status fb")
    public void user_builds_the_input_value_for_update_batch_status_fb() {
        SmartcareUpdateBatchStatusFBInputPayload inputPayload = SmartcareUpdateBatchStatusFBInputPayload.builder()
                .updateBatchStatusCriteria(UpdateBatchStatusCriteria.builder()
                        .updateBatchStatusInputPayload(UpdateBatchStatusInputPayload.builder()
                                .recordDate("2024-09-13T10:00:00.000Z")
                                .batchStatusId(255)
                                .facilityCode("zzz")
                                .episodeId(2532519)
                                .clientId(1)
                                .build())
                        .build())
                .build();
        fbInput = FunctionBlockInput.builder()
                .payload(inputPayload)
                .fbName("SmartcareCreateBatch")
                .options(FunctionBlockOption.builder().maximumAttempts(1).build())
                .genericType(SmartcareUpdateBatchStatusFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB for update batch status fb")
    public void user_runs_the_fb_for_update_batch_status_fb() {
        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(SmartcareUpdateBatchStatusFB.class);
        functionBlockResponse = sandbox.startExecution(fbInput);
    }
    @Then("user gets the Fboutput for update batch status fb")
    public void user_gets_the_fboutput_for_update_batch_status_fb() {
        functionBlockOutput = functionBlockResponse.getFunctionBlockOutput();
    }
    @Then("User validates the result using for update batch status fb")
    public void user_validates_the_result_using_for_update_batch_status_fb() {
        System.out.println(functionBlockOutput);
        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
    }
}
