package stepdefinition;

import com.e5.platform.core.domains.FunctionBlockSandboxResponse;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOption;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareGenerateReferralReportFB;
import e5.selectdataapi.model.smartcaregeneratereferralreportfb.GenerateReferralReportCriteria;
import e5.selectdataapi.model.smartcaregeneratereferralreportfb.GenerateReferralReportInputPayload;
import e5.selectdataapi.model.smartcaregeneratereferralreportfb.SmartcareGenerateReferralReportFBInputPayload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmaerCareGenerateRefferalSummaryReportWithoutMock {

    FunctionBlockInput<Object> fbInput;
    FunctionBlockSandboxResponse<Object> functionBlockResponse;

    FunctionBlockOutput<Object> functionBlockOutput;

    @Given("user builds the input value for Generate Refferal Summary Report")
    public void user_builds_the_input_value_for_generate_refferal_summary_report() {
        SmartcareGenerateReferralReportFBInputPayload inputPayload = SmartcareGenerateReferralReportFBInputPayload.builder()
                .generateReferralReportCriteria(GenerateReferralReportCriteria.builder()
                        .generateReferralReportInputPayload(GenerateReferralReportInputPayload.builder()
                                .clientId(1)
                                .episodeId(2532519)
                                .facilityCode("zzz")
                                .recordDate("2024-09-19T07:00:00.000Z")
                                .build()).build()).build();
        fbInput = FunctionBlockInput.builder()
                .payload(inputPayload)
                .fbName("SmartcareGenerateReferralReport")
                .options(FunctionBlockOption.builder().maximumAttempts(1).build())
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs the FB for Generate Refferal Summary Report")
    public void user_runs_the_fb_for_generate_refferal_summary_report() {
        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class);
        functionBlockResponse = sandbox.startExecution(fbInput);
    }
    @Then("user gets the Fboutput for Generate Refferal Summary Report")
    public void user_gets_the_fboutput_for_generate_refferal_summary_report() {
        functionBlockOutput = functionBlockResponse.getFunctionBlockOutput();
    }
    @Then("User validates the result using for Generate Refferal Summary Report")
    public void user_validates_the_result_using_for_generate_refferal_summary_report() {
        System.out.println(functionBlockOutput);
        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
    }



}




