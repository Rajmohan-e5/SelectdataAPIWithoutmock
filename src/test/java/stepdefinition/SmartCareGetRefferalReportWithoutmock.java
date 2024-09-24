package stepdefinition;

import com.e5.platform.core.domains.FunctionBlockSandboxResponse;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOption;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareGetReferralReportFB;
import e5.selectdataapi.model.smartcaregetreferralreportfb.GetReferralReportCriteria;
import e5.selectdataapi.model.smartcaregetreferralreportfb.GetReferralReportInputPayload;
import e5.selectdataapi.model.smartcaregetreferralreportfb.SmartcareGetReferralReportFBInputPayload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmartCareGetRefferalReportWithoutmock {

    FunctionBlockInput<Object> fbInput;
    FunctionBlockSandboxResponse<Object> functionBlockResponse;

    FunctionBlockOutput<Object> functionBlockOutput;


    @Given("user builds the input value for Get Refferal Summary Report")
    public void user_builds_the_input_value_for_get_refferal_summary_report() {
        SmartcareGetReferralReportFBInputPayload inputPayload = SmartcareGetReferralReportFBInputPayload.builder()
                .getReferralReportCriteria(GetReferralReportCriteria.builder()
                        .getReferralReportInputPayload(GetReferralReportInputPayload.builder()
                                .clientId(1)
                                .episodeId(2532519)
                                .facilityCode("zzz")
                                .recordDate("2024-09-15T07:00:00.000Z")
                                .build())
                        .build())
                .build();
        fbInput = FunctionBlockInput.builder()
                .payload(inputPayload)
                .fbName("SmartcareGetReferralReport")
                .options(FunctionBlockOption.builder().maximumAttempts(1).build())
                .genericType(SmartcareGetReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB for Get Refferal Summary Report")
    public void user_runs_the_fb_for_get_refferal_summary_report() {
        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(SmartcareGetReferralReportFB.class);
        functionBlockResponse = sandbox.startExecution(fbInput);
    }
    @Then("user gets the Fboutput for Get Refferal Summary Report")
    public void user_gets_the_fboutput_for_get_refferal_summary_report() {
        functionBlockOutput = functionBlockResponse.getFunctionBlockOutput();
    }
    @Then("User validates the result using for Get Refferal Summary Report")
    public void user_validates_the_result_using_for_get_refferal_summary_report() {
        System.out.println(functionBlockOutput);
        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
    }
}
