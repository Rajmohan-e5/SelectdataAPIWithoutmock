package stepdefinition;

import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareGenerateReferralReportFB;
import e5.selectdataapi.functionblock.generated.SmartcareUploadBatchFileFB;
import e5.selectdataapi.model.smartcaregeneratereferralreportfb.SmartcareGenerateReferralReportFBInputPayload;
import e5.selectdataapi.model.smartcareuploadbatchfilefb.SmartcareUploadBatchFileFBInputPayload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

public class SmartcareGeneratereferalReportPrevalidation extends Payload.SmartcareGeneratereferalReportPrevalidation {

    FunctionBlockInput<Object> fbInput;
    List<PayloadError> errors;

    @Given("User builds inputpayload for Generate Referral summary report fb")
    public void user_builds_inputpayload_for_generate_referral_summary_report_fb() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveFlow())
                .fbName("SmartcareGenerateReferralReport")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using positive input file of Generate Referral summary report fb")
    public void user_runs_fb_using_positive_input_file_of_generate_referral_summary_report_fb() {
        errors = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validates the result after Generate Referral summary report fb runs successfully")
    public void user_validates_the_result_after_generate_referral_summary_report_fb_runs_successfully() {
        Assert.assertEquals(new ArrayList<PayloadError>(), errors);
    }

    @Given("User builds the input file for SmartCare Generate Referral summary report fb when ClientID is Null")
    public void user_builds_the_input_file_for_smart_care_generate_referral_summary_report_fb_when_client_id_is_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(clientIDNull())
                .fbName("SmartcareGenerateReferralReport")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Generate Referral summary report fb fb when Client ID is Null")
    public void user_runs_fb_using_input_file_of_generate_referral_summary_report_fb_fb_when_client_id_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Client ID is Null")
    public void user_validate_the_output_as_and_when_client_id_is_null(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Generate Referral summary report fb when ClientID is lower then minimum charecter")
    public void user_builds_the_input_file_for_smart_care_generate_referral_summary_report_fb_when_client_id_is_lower_then_minimum_charecter() {
        fbInput = FunctionBlockInput.builder()
                .payload(clientIDminimumchar())
                .fbName("SmartcareGenerateReferralReport")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Generate Referral summary report fb fb when Client ID is lower then minimum charecter")
    public void user_runs_fb_using_input_file_of_generate_referral_summary_report_fb_fb_when_client_id_is_lower_then_minimum_charecter() {
        errors = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Client ID is lower then minimum charecter")
    public void user_validate_the_output_as_and_when_client_id_is_lower_then_minimum_charecter(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Generate Referral summary report fb when Episode ID is Null")
    public void user_builds_the_input_file_for_smart_care_generate_referral_summary_report_fb_when_episode_id_is_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(episodeIDNull())
                .fbName("SmartcareGenerateReferralReport")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Generate Referral summary report fb fb when Episode ID is Null")
    public void user_runs_fb_using_input_file_of_generate_referral_summary_report_fb_fb_when_episode_id_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Episode ID is Null")
    public void user_validate_the_output_as_and_when_episode_id_is_null(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @Given("User builds the input file for SmartCare Generate Referral summary report fb when EpisodeID is lower then minimum charecter")
    public void user_builds_the_input_file_for_smart_care_generate_referral_summary_report_fb_when_episode_id_is_lower_then_minimum_charecter() {
        fbInput = FunctionBlockInput.builder()
                .payload(episodeIDMinimumChar())
                .fbName("SmartcareGenerateReferralReport")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Generate Referral summary report fb fb when Episode ID is lower then minimum charecter")
    public void user_runs_fb_using_input_file_of_generate_referral_summary_report_fb_fb_when_episode_id_is_lower_then_minimum_charecter() {
        errors = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Episode ID is lower then minimum charecter")
    public void user_validate_the_output_as_and_when_episode_id_is_lower_then_minimum_charecter(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Generate Referral summary report fb when Facility code is Null")
    public void user_builds_the_input_file_for_smart_care_generate_referral_summary_report_fb_when_facility_code_is_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(facilityCodeNull())
                .fbName("SmartcareGenerateReferralReport")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Generate Referral summary report fb fb when Facility code is Null")
    public void user_runs_fb_using_input_file_of_generate_referral_summary_report_fb_fb_when_facility_code_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Facility code is Null")
    public void user_validate_the_output_as_and_when_facility_code_is_null(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Generate Referral summary report fb when Facility code is empty")
    public void user_builds_the_input_file_for_smart_care_generate_referral_summary_report_fb_when_facility_code_is_empty() {
        fbInput = FunctionBlockInput.builder()
                .payload(facilityCodeisEmpty())
                .fbName("SmartcareGenerateReferralReport")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Generate Referral summary report fb fb when Facility code is empty")
    public void user_runs_fb_using_input_file_of_generate_referral_summary_report_fb_fb_when_facility_code_is_empty() {
        errors = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Facility code is empty")
    public void user_validate_the_output_as_and_when_facility_code_is_empty(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Generate Referral summary report fb when Facility code exceeds maximum charecters")
    public void user_builds_the_input_file_for_smart_care_generate_referral_summary_report_fb_when_facility_code_exceeds_maximum_charecters() {
        fbInput = FunctionBlockInput.builder()
                .payload(facilitycodemaxchar())
                .fbName("SmartcareGenerateReferralReport")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Generate Referral summary report fb fb when Facility code exceeds maximum charecters")
    public void user_runs_fb_using_input_file_of_generate_referral_summary_report_fb_fb_when_facility_code_exceeds_maximum_charecters() {
        errors = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Facility code exceeds maximum charecters")
    public void user_validate_the_output_as_and_when_facility_code_exceeds_maximum_charecters(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Generate Referral summary report fb when Record Date is Null")
    public void user_builds_the_input_file_for_smart_care_generate_referral_summary_report_fb_when_record_date_is_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(recordDateNull())
                .fbName("SmartcareGenerateReferralReport")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Generate Referral summary report fb fb when Record Date is Null")
    public void user_runs_fb_using_input_file_of_generate_referral_summary_report_fb_fb_when_record_date_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Record Date is Null")
    public void user_validate_the_output_as_and_when_record_date_is_null(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Generate Referral summary report fb when Record Date is invalid format")
    public void user_builds_the_input_file_for_smart_care_generate_referral_summary_report_fb_when_record_date_is_invalid_format() {
        fbInput = FunctionBlockInput.builder()
                .payload(recordDateInvalidFormat())
                .fbName("SmartcareGenerateReferralReport")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Generate Referral summary report fb fb when Record Date is in invalid format")
    public void user_runs_fb_using_input_file_of_generate_referral_summary_report_fb_fb_when_record_date_is_in_invalid_format() {
        errors = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Record Date is invalid format")
    public void user_validate_the_output_as_and_when_record_date_is_invalid_format(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
