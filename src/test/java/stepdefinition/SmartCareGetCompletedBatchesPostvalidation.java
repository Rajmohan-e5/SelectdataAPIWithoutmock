package stepdefinition;

import Payload.SmartcareGetCompletedbatchesPostvalidation;
import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareGetCompletedBatchesFB;
import e5.selectdataapi.model.smartcaregetcompletedbatchesfb.SmartcareGetCompletedBatchesFBOutputPayload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

public class SmartCareGetCompletedBatchesPostvalidation extends SmartcareGetCompletedbatchesPostvalidation {

    FunctionBlockOutput<Object> fbOutput;
    List<PayloadError> errors;

    @Given("User build the function block output payload for Get Completed Batches FB positive flow")
    public void user_build_the_function_block_output_payload_for_get_completed_batches_fb_positive_flow() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(positiveFlow())
                .payloadType(SmartcareGetCompletedBatchesFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }
    @When("User runs the Get Completed Batches FB positive flow")
    public void user_runs_the_get_completed_batches_fb_positive_flow() {
        errors = FunctionBlockSandbox.forFB(SmartcareGetCompletedBatchesFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }
    @Then("User validate the output for Get Completed Batches FB positive flow")
    public void user_validate_the_output_for_get_completed_batches_fb_positive_flow() {
        Assert.assertEquals(new ArrayList<>(),errors);
    }

    @Given("User build the function block output payload for Get Completed Batches FB postvalidation")
    public void user_build_the_function_block_output_payload_for_get_completed_batches_fb_postvalidation() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(patientIDNull())
                .payloadType(SmartcareGetCompletedBatchesFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }
    @When("User runs the Get Completed Batches FB when PatientID field is null")
    public void user_runs_the_get_completed_batches_fb_when_patient_id_field_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareGetCompletedBatchesFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }
    @Then("User validate the output as {string},{string} and {string} when PatientID field is null")
    public void user_validate_the_output_as_and_when_patient_id_field_is_null(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User build the function block output payload for Get Completed Batches FB postvalidation when ID is null")
    public void user_build_the_function_block_output_payload_for_get_completed_batches_fb_postvalidation_when_id_is_null() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(IDNull())
                .payloadType(SmartcareGetCompletedBatchesFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }
    @When("User runs the Get Completed Batches FB when ID field is null")
    public void user_runs_the_get_completed_batches_fb_when_id_field_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareGetCompletedBatchesFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }
    @Then("User validate the output as {string},{string} and {string} when ID field is null")
    public void user_validate_the_output_as_and_when_id_field_is_null(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User build the function block output payload for Get Completed Batches FB postvalidation when Status ID is null")
    public void user_build_the_function_block_output_payload_for_get_completed_batches_fb_postvalidation_when_status_id_is_null() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(statusIDisNull())
                .payloadType(SmartcareGetCompletedBatchesFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }
    @When("User runs the Get Completed Batches FB when Status ID field is null")
    public void user_runs_the_get_completed_batches_fb_when_status_id_field_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareGetCompletedBatchesFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }
    @Then("User validate the output as {string},{string} and {string} when Status ID field is null")
    public void user_validate_the_output_as_and_when_status_id_field_is_null(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User build the function block output payload for Get Completed Batches FB postvalidation when id is empty")
    public void user_build_the_function_block_output_payload_for_get_completed_batches_fb_postvalidation_when_id_is_empty() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(idMinValue())
                .payloadType(SmartcareGetCompletedBatchesFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }

    @When("User runs the Get Completed Batches FB when id field is empty")
    public void user_runs_the_get_completed_batches_fb_when_id_field_is_empty() {
        errors = FunctionBlockSandbox.forFB(SmartcareGetCompletedBatchesFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }

    @Then("User validate the output as {string},{string} and {string} when id field is empty")
    public void user_validate_the_output_as_and_when_id_field_is_empty(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User build the function block output payload for Get Completed Batches FB postvalidation when Patient id is empty")
    public void user_build_the_function_block_output_payload_for_get_completed_batches_fb_postvalidation_when_patient_id_is_empty() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(patientIDisEmpty())
                .payloadType(SmartcareGetCompletedBatchesFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }
    @When("User runs the Get Completed Batches FB when Patient ID field is empty")
    public void user_runs_the_get_completed_batches_fb_when_patient_id_field_is_empty() {
        errors = FunctionBlockSandbox.forFB(SmartcareGetCompletedBatchesFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }
    @Then("User validate the output as {string},{string} and {string} when Patient ID field is empty")
    public void user_validate_the_output_as_and_when_patient_id_field_is_empty(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
