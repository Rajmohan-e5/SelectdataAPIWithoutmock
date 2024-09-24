package stepdefinition;

import com.e5.platform.core.domains.FunctionBlockSandboxResponse;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOption;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareCreateBatchFB;
import e5.selectdataapi.model.smartcarecreatebatchfb.CreateBatchCriteria;
import e5.selectdataapi.model.smartcarecreatebatchfb.CreateBatchInputPayload;
import e5.selectdataapi.model.smartcarecreatebatchfb.SmartcareCreateBatchFBInputPayload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmartcareCreateBatchFBWithouMock {

    FunctionBlockInput<Object> fbInput;
    FunctionBlockSandboxResponse<Object> functionBlockResponse;

    FunctionBlockOutput<Object> functionBlockOutput;

    @Given("user builds the input value for Create batch fb")
    public void user_builds_the_input_value_for_create_batch_fb() {
        SmartcareCreateBatchFBInputPayload inputpayload = SmartcareCreateBatchFBInputPayload.builder()
                .createBatchCriteria(CreateBatchCriteria.builder()
                        .createBatchInputPayload(CreateBatchInputPayload.builder()
                                .clientId(1)
                                .facilityCode("zzz")
                                .firstName("WILKZZZINSON")
                                .lastName("A")
                                .episodeId(2532519)
                                .recordDate("2024-09-10T10:00:00.000Z").build())
                        .build()).build();
        fbInput = FunctionBlockInput.builder()
                .payload(inputpayload)
                .fbName("SmartcareCreateBatch")
                .options(FunctionBlockOption.builder().maximumAttempts(1).build())
                .genericType(SmartcareCreateBatchFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }

    @When("user runs the FB for Create batch fb")
    public void user_runs_the_fb_for_create_batch_fb() {
        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(SmartcareCreateBatchFB.class);
        functionBlockResponse = sandbox.startExecution(fbInput);
    }

    @Then("user gets the Fboutput for Create batchs fb")
    public void user_gets_the_fboutput_for_create_batchs_fb() {
        functionBlockOutput = functionBlockResponse.getFunctionBlockOutput();
    }

    @Then("User validates the result using for Create batch fb")
    public void user_validates_the_result_using_for_create_batch_fb() {
        System.out.println(functionBlockOutput);
        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
    }
}
