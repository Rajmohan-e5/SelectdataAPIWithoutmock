package stepdefinition;

import Payload.SmartcareUploadBatchFilesPrevalidation;
import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareUploadBatchFileFB;
import e5.selectdataapi.model.smartcaregetcompletedbatchesfb.GetCompletedBatchesInputPayload;
import e5.selectdataapi.model.smartcareuploadbatchfilefb.SmartcareUploadBatchFileFBInputPayload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

public class SmartcareUploadbatchFilesPrevalidation extends SmartcareUploadBatchFilesPrevalidation {

    FunctionBlockInput<Object> fbInput;
    List<PayloadError> errors;

    @Given("User builds input payload for Smartcare Upload BatchFiles fb")
    public void user_builds_input_payload_for_smartcare_upload_batch_files_fb() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveflow())
                .fbName("SmartcareUploadBatcheFile")
                .genericType(SmartcareUploadBatchFileFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }

    @When("user runs fb using positive input file of Smartcare Upload BatchFiles fb")
    public void user_runs_fb_using_positive_input_file_of_smartcare_upload_batch_files_fb() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }

    @Then("User validates the result after Smartcare Upload BatchFiles fb runs successfully")
    public void user_validates_the_result_after_smartcare_upload_batch_files_fb_runs_successfully() {
        Assert.assertEquals(new ArrayList<PayloadError>(), errors);
    }

    @Given("User builds the input file for SmartCare Upload BatchFiles fb when BatchID is Null")
    public void user_builds_the_input_file_for_smart_care_upload_batch_files_fb_when_batch_id_is_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(BatchIdisNull())
                .fbName("SmartcareUploadBatcheFile")
                .genericType(SmartcareUploadBatchFileFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Upload BatchFiles fb fb when Batch ID is Null")
    public void user_runs_fb_using_input_file_of_upload_batch_files_fb_fb_when_batch_id_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Batch ID is Null")
    public void user_validate_the_output_as_and_when_batch_id_is_null(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Upload BatchFiles fb when BatchID is Empty")
    public void user_builds_the_input_file_for_smart_care_upload_batch_files_fb_when_batch_id_is_empty() {
        fbInput = FunctionBlockInput.builder()
                .payload(BatchIDisEmpty())
                .fbName("SmartcareUploadBatcheFile")
                .genericType(SmartcareUploadBatchFileFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Upload BatchFiles fb fb when Batch ID is Empty")
    public void user_runs_fb_using_input_file_of_upload_batch_files_fb_fb_when_batch_id_is_empty() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Batch ID is Empty")
    public void user_validate_the_output_as_and_when_batch_id_is_empty(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Upload BatchFiles fb when Document type ID is Null")
    public void user_builds_the_input_file_for_smart_care_upload_batch_files_fb_when_document_type_id_is_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(documetnTypeIDNull())
                .fbName("SmartcareUploadBatcheFile")
                .genericType(SmartcareUploadBatchFileFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Upload BatchFiles fb fb when DocumentType ID is Null")
    public void user_runs_fb_using_input_file_of_upload_batch_files_fb_fb_when_document_type_id_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when DocumentType ID is Null")
    public void user_validate_the_output_as_and_when_document_type_id_is_null(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(1).getErrorCode();
        String actualFieldName = errors.get(1).getFieldName();
        String actualErrorMessage = errors.get(1).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Upload BatchFiles fb when Encompass ID is Null")
    public void user_builds_the_input_file_for_smart_care_upload_batch_files_fb_when_encompass_id_is_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(encompassIDisNull())
                .fbName("SmartcareUploadBatcheFile")
                .genericType(SmartcareUploadBatchFileFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Upload BatchFiles fb fb when Encompass ID is Null")
    public void user_runs_fb_using_input_file_of_upload_batch_files_fb_fb_when_encompass_id_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Encompass ID is Null")
    public void user_validate_the_output_as_and_when_encompass_id_is_null(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Upload BatchFiles fb when Encompass ID is Empty")
    public void user_builds_the_input_file_for_smart_care_upload_batch_files_fb_when_encompass_id_is_empty() {
        fbInput = FunctionBlockInput.builder()
                .payload(encompassIDisEmpty())
                .fbName("SmartcareUploadBatcheFile")
                .genericType(SmartcareUploadBatchFileFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Upload BatchFiles fb fb when Encompass ID is Empty")
    public void user_runs_fb_using_input_file_of_upload_batch_files_fb_fb_when_encompass_id_is_empty() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when Encompass ID is Empty")
    public void user_validate_the_output_as_and_when_encompass_id_is_empty(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Upload BatchFiles fb when file is Null")
    public void user_builds_the_input_file_for_smart_care_upload_batch_files_fb_when_file_is_null() {
        fbInput = FunctionBlockInput.builder()
                .payload(fileisNUll())
                .fbName("SmartcareUploadBatcheFile")
                .genericType(SmartcareUploadBatchFileFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Upload BatchFiles fb fb when file is Null")
    public void user_runs_fb_using_input_file_of_upload_batch_files_fb_fb_when_file_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when file is Null")
    public void user_validate_the_output_as_and_when_file_is_null(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User builds the input file for SmartCare Upload BatchFiles fb when file is Empty")
    public void user_builds_the_input_file_for_smart_care_upload_batch_files_fb_when_file_is_empty() {
        fbInput = FunctionBlockInput.builder()
                .payload(fileisEmpty())
                .fbName("SmartcareUploadBatcheFile")
                .genericType(SmartcareUploadBatchFileFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @When("user runs fb using input file of Upload BatchFiles fb fb when file is Empty")
    public void user_runs_fb_using_input_file_of_upload_batch_files_fb_fb_when_file_is_empty() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPreValidation(fbInput).getErrors();
        System.out.println("error is " + errors);
    }
    @Then("User validate the output as {string},{string} and {string} when file is Empty")
    public void user_validate_the_output_as_and_when_file_is_empty(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
