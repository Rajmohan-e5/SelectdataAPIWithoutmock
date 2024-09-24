package stepdefinition;

import Payload.SmartCareGenerateReferralReportPostvalidation;
import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareGenerateReferralReportFB;
import e5.selectdataapi.functionblock.generated.SmartcareUploadBatchFileFB;
import e5.selectdataapi.model.smartcaregeneratereferralreportfb.SmartcareGenerateReferralReportFBOutputPayload;
import e5.selectdataapi.model.smartcareuploadbatchfilefb.SmartcareUploadBatchFileFBOutputPayload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

public class SmartcareGenerateReferralReportPostvalidation extends SmartCareGenerateReferralReportPostvalidation {

    FunctionBlockOutput<Object> fbOutput;
    List<PayloadError> errors;

    @Given("User build the function block output payload for Smartcare Generate Referral Summary Report FB positive flow")
    public void user_build_the_function_block_output_payload_for_smartcare_generate_referral_summary_report_fb_positive_flow() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(positiveFlow())
                .payloadType(SmartcareGenerateReferralReportFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }

    @When("User runs the Smartcare Generate Referral Summary Report FB positive flow")
    public void user_runs_the_smartcare_generate_referral_summary_report_fb_positive_flow() {
        errors = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }

    @Then("User validate the output for Smartcare Generate Referral Summary Report FB positive flow")
    public void user_validate_the_output_for_smartcare_generate_referral_summary_report_fb_positive_flow() {
        Assert.assertEquals(new ArrayList<>(),errors);
    }

    @Given("User build the function block output payload for Generate Referral Summary Report FB FB postvalidation")
    public void user_build_the_function_block_output_payload_for_generate_referral_summary_report_fb_fb_postvalidation() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(statusNull())
                .payloadType(SmartcareGenerateReferralReportFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }
    @When("User runs the Generate Referral Summary Report FB FB when file Status field is null")
    public void user_runs_the_generate_referral_summary_report_fb_fb_when_file_status_field_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }
    @Then("User validate the output as {string},{string} and {string} when file Status field is null in Generate Referral Summary Report FB")
    public void user_validate_the_output_as_and_when_file_status_field_is_null_in_generate_referral_summary_report_fb(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

}
