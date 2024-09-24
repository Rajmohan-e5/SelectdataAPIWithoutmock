package stepdefinition;

import Payload.SmartcareGetCompletedbatchesPrevalidation;
import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareGetCompletedBatchesFB;
import e5.selectdataapi.model.smartcaregetcompletedbatchesfb.GetCompletedBatchesInputPayload;
//import e5.selectdataapi.functionblock.generated.Sma
import e5.selectdataapi.model.smartcaregetcompletedbatchesfb.SmartcareGetCompletedBatchesFBInputPayload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

public class SmartcareGetCompletedBatchesPrevalidation extends SmartcareGetCompletedbatchesPrevalidation {

    FunctionBlockInput<Object> fbInput;
    List<PayloadError> errors;

    @Given("User builds inputpayload for get completed batches fb")
    public void user_builds_inputpayload_for_get_completed_batches_fb() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveflow())
                .fbName("SmartcareGetCompletedBatches")
                .genericType(SmartcareGetCompletedBatchesFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }

    @When("user runs fb using positive input file of get completed batches fb")
    public void user_runs_fb_using_positive_input_file_of_get_completed_batches_fb() {
        errors = FunctionBlockSandbox.forFB(SmartcareGetCompletedBatchesFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }

    @Then("User validates the result after get completed batches fb runs successfully")
    public void user_validates_the_result_after_get_completed_batches_fb_runs_successfully() {
        {
            Assert.assertEquals(new ArrayList<PayloadError>(), errors);
        }
    }

    @Given("User builds the input file for SmartCare Get Completed Batches fb when ClientID is empty")
    public void user_builds_the_input_file_for_smart_care_get_completed_batches_fb_when_client_id_is_empty() {
        fbInput = FunctionBlockInput.builder()
                .payload(clientIDEmpty())
                .fbName("SmartcareGetCompletedBatches")
                .genericType(SmartcareGetCompletedBatchesFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of SmartCare Get Completed Batches fb when ClientID is empty")
    public void user_runs_fb_using_input_file_of_smart_care_get_completed_batches_fb_when_client_id_is_empty() {
        errors = FunctionBlockSandbox.forFB(SmartcareGetCompletedBatchesFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when ClientID is empty")
    public void user_validate_the_output_as_and_when_client_id_is_empty(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Get Completed Batches fb when ClientID is Null")
    public void user_builds_the_input_file_for_smart_care_get_completed_batches_fb_when_client_id_is_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(clientIDNull())
                .fbName("SmartcareGetCompletedBatches")
                .genericType(SmartcareGetCompletedBatchesFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of SmartCare Get Completed Batches fb when ClientID is Null")
    public void user_runs_fb_using_input_file_of_smart_care_get_completed_batches_fb_when_client_id_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareGetCompletedBatchesFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when ClientID is Null")
    public void user_validate_the_output_as_and_when_client_id_is_null(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Get Completed Batches fb when Date and Time is Null")
    public void user_builds_the_input_file_for_smart_care_get_completed_batches_fb_when_date_and_time_is_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(DateandTimeNull())
                .fbName("SmartcareGetCompletedBatches")
                .genericType(SmartcareGetCompletedBatchesFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of SmartCare Get Completed Batches fb when Date and Time is Null")
    public void user_runs_fb_using_input_file_of_smart_care_get_completed_batches_fb_when_date_and_time_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareGetCompletedBatchesFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Date and Time is Null")
    public void user_validate_the_output_as_and_when_date_and_time_is_null(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Get Completed Batches fb when Date and Time format is invalid")
    public void user_builds_the_input_file_for_smart_care_get_completed_batches_fb_when_date_and_time_format_is_invalid() {
        fbInput = FunctionBlockInput.builder()
                .payload(invalidDateandTimeFormat())
                .fbName("SmartcareGetCompletedBatches")
                .genericType(SmartcareGetCompletedBatchesFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of SmartCare Get Completed Batches fb when Date and Time format is invalid")
    public void user_runs_fb_using_input_file_of_smart_care_get_completed_batches_fb_when_date_and_time_format_is_invalid() {
        errors = FunctionBlockSandbox.forFB(SmartcareGetCompletedBatchesFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Date and Time format is invalid")
    public void user_validate_the_output_as_and_when_date_and_time_format_is_invalid(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Get Completed Batches fb when minutes format is invalid")
    public void user_builds_the_input_file_for_smart_care_get_completed_batches_fb_when_minutes_format_is_invalid() {
       fbInput = FunctionBlockInput.builder()
               .payload(invalidMinutesFormat())
               .fbName("SmartcareGetCompletedBatches")
               .genericType(SmartcareGetCompletedBatchesFBInputPayload.class.getName()).build();
    }
    @When("user runs fb using input file of SmartCare Get Completed Batches fb when minutes format is invalid")
    public void user_runs_fb_using_input_file_of_smart_care_get_completed_batches_fb_when_minutes_format_is_invalid() {
        errors = FunctionBlockSandbox.forFB(SmartcareGetCompletedBatchesFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is" + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when minutes format is invalid")
    public void user_validate_the_output_as_and_when_minutes_format_is_invalid(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

}


