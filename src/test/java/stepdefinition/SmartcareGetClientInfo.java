package stepdefinition;

import com.e5.platform.core.domains.FunctionBlockSandboxResponse;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOption;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareGenerateReferralReportFB;
import e5.selectdataapi.functionblock.generated.SmartcareGetClientsFB;
import e5.selectdataapi.model.smartcaregeneratereferralreportfb.SmartcareGenerateReferralReportFBInputPayload;
import e5.selectdataapi.model.smartcaregetclientsfb.SmartcareGetClientsFBInputPayload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmartcareGetClientInfo {

    FunctionBlockInput<Object> fbInput;
    FunctionBlockSandboxResponse<Object> functionBlockResponse;

    FunctionBlockOutput<Object> functionBlockOutput;

    @Given("user builds the input value for Get clients fb")
    public void user_builds_the_input_value_for_get_clients_fb() {
        SmartcareGetClientsFBInputPayload inputPayload = SmartcareGetClientsFBInputPayload.builder()
                .getClientsInputPayload(null)
                .build();
        fbInput = FunctionBlockInput.builder()
                .payload(inputPayload)
                .fbName("SmartcareGetClients")
                .options(FunctionBlockOption.builder().maximumAttempts(1).build())
                .genericType(SmartcareGetClientsFBInputPayload.class.getName()).build();
        System.out.println(fbInput);

    }
    @When("user runs the FB for get clients fb")
    public void user_runs_the_fb_for_get_clients_fb() {
        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(SmartcareGetClientsFB.class);
        functionBlockResponse = sandbox.startExecution(fbInput);
    }
    @Then("user gets the Fboutput for get clients fb")
    public void user_gets_the_fboutput_for_get_clients_fb() {
        functionBlockOutput = functionBlockResponse.getFunctionBlockOutput();
    }
    @Then("User validates the result using for get cleints fb")
    public void user_validates_the_result_using_for_get_cleints_fb() {
        System.out.println(functionBlockOutput);
        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
    }
}
