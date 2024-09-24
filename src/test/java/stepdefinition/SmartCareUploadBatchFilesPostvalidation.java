package stepdefinition;

import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareGetCompletedBatchesFB;
import e5.selectdataapi.functionblock.generated.SmartcareUploadBatchFileFB;
import e5.selectdataapi.model.smartcaregetcompletedbatchesfb.SmartcareGetCompletedBatchesFBOutputPayload;
import e5.selectdataapi.model.smartcareuploadbatchfilefb.SmartcareUploadBatchFileFBOutputPayload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

public class SmartCareUploadBatchFilesPostvalidation extends Payload.SmartCareUploadBatchFilesPostvalidation {

    FunctionBlockOutput<Object> fbOutput;
    List<PayloadError> errors;

    @Given("User build the function block output payload for Upload Batch Files FB positive flow")
    public void user_build_the_function_block_output_payload_for_upload_batch_files_fb_positive_flow() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(positiveFlow())
                .payloadType(SmartcareUploadBatchFileFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }

    @When("User runs the Upload Batch Files FB positive flow")
    public void user_runs_the_upload_batch_files_fb_positive_flow() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }

    @Then("User validate the output for Upload Batch Files FB positive flow")
    public void user_validate_the_output_for_upload_batch_files_fb_positive_flow() {
        Assert.assertEquals(new ArrayList<>(),errors);
    }

    @Given("User build the function block output payload for Upload Batch Files FB postvalidation")
    public void user_build_the_function_block_output_payload_for_upload_batch_files_fb_postvalidation() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(fileIDNull())
                .payloadType(SmartcareUploadBatchFileFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }
    @When("User runs the Upload Batch Files FB when file ID field is null")
    public void user_runs_the_upload_batch_files_fb_when_file_id_field_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }
    @Then("User validate the output as {string},{string} and {string} when file ID field is null in Upload Batch Files")
    public void user_validate_the_output_as_and_when_file_id_field_is_null_in_upload_batch_files(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage ) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User build the function block output payload for Upload Batch Files FB postvalidation when file id is empty")
    public void user_build_the_function_block_output_payload_for_upload_batch_files_fb_postvalidation_when_file_id_is_empty() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(fileIDisEmpty())
                .payloadType(SmartcareUploadBatchFileFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }
    @When("User runs the Upload Batch Files FB when file ID field is empty")
    public void user_runs_the_upload_batch_files_fb_when_file_id_field_is_empty() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }
    @Then("User validate the output as {string},{string} and {string} when file ID field is empty in Upload Batch Files")
    public void user_validate_the_output_as_and_when_file_id_field_is_empty_in_upload_batch_files(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User build the function block output payload for Upload Batch Files FB postvalidation When File Name is NUll")
    public void user_build_the_function_block_output_payload_for_upload_batch_files_fb_postvalidation_when_file_name_is_n_ull() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(fileNameNull())
                .payloadType(SmartcareUploadBatchFileFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }
    @When("User runs the Upload Batch Files FB when File Name field is null")
    public void user_runs_the_upload_batch_files_fb_when_file_name_field_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }
    @Then("User validate the output as {string},{string} and {string} when File Name field is null in Upload Batch Files")
    public void user_validate_the_output_as_and_when_file_name_field_is_null_in_upload_batch_files(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User build the function block output payload for Upload Batch Files FB postvalidation when file name is empty")
    public void user_build_the_function_block_output_payload_for_upload_batch_files_fb_postvalidation_when_file_name_is_empty() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(fileNameisEmpty())
                .payloadType(SmartcareUploadBatchFileFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }
    @When("User runs the Upload Batch Files FB when file name field is empty")
    public void user_runs_the_upload_batch_files_fb_when_file_name_field_is_empty() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }
    @Then("User validate the output as {string},{string} and {string} when file name field is empty in Upload Batch Files")
    public void user_validate_the_output_as_and_when_file_name_field_is_empty_in_upload_batch_files(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User build the function block output payload for Upload Batch Files FB postvalidation When Uploaded Date is NUll")
    public void user_build_the_function_block_output_payload_for_upload_batch_files_fb_postvalidation_when_uploaded_date_is_n_ull() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(uploadedDateNull())
                .payloadType(SmartcareUploadBatchFileFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }
    @When("User runs the Upload Batch Files FB when UploadedDate field is null")
    public void user_runs_the_upload_batch_files_fb_when_uploaded_date_field_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }
    @Then("User validate the output as {string},{string} and {string} when Uploaded Date field is null in Upload Batch Files")
    public void user_validate_the_output_as_and_when_uploaded_date_field_is_null_in_upload_batch_files(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User build the function block output payload for Upload Batch Files FB postvalidation When Uploaded Date is in invalid format")
    public void user_build_the_function_block_output_payload_for_upload_batch_files_fb_postvalidation_when_uploaded_date_is_in_invalid_format() {
        fbOutput=FunctionBlockOutput.builder()
                .payload(invalidUploadDate())
                .payloadType(SmartcareUploadBatchFileFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }
    @When("User runs the Upload Batch Files FB when UploadedDate field is in invalid format")
    public void user_runs_the_upload_batch_files_fb_when_uploaded_date_field_is_in_invalid_format() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }
    @Then("User validate the output as {string},{string} and {string} when Uploaded Date field is in invalid format in Upload Batch Files")
    public void user_validate_the_output_as_and_when_uploaded_date_field_is_in_invalid_format_in_upload_batch_files(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User build the function block output payload for Upload Batch Files FB postvalidation When Status ID is Null")
    public void user_build_the_function_block_output_payload_for_upload_batch_files_fb_postvalidation_when_status_id_is_null() {
       fbOutput=FunctionBlockOutput.builder()
               .payload(StatusIDNull())
               .payloadType(SmartcareUploadBatchFileFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }
    @When("User runs the Upload Batch Files FB when Status ID field is null")
    public void user_runs_the_upload_batch_files_fb_when_status_id_field_is_null() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }
    @Then("User validate the output as {string},{string} and {string} when Status ID field is null in Upload Batch Files")
    public void user_validate_the_output_as_and_when_status_id_field_is_null_in_upload_batch_files(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("User build the function block output payload for Upload Batch Files FB postvalidation When file Status ID is below its minumum charecter length")
    public void user_build_the_function_block_output_payload_for_upload_batch_files_fb_postvalidation_when_file_status_id_is_below_its_minumum_charecter_length() {
        fbOutput=FunctionBlockOutput.builder()
                .payload(mincharecterFileStatusID())
                .payloadType(SmartcareUploadBatchFileFBOutputPayload.class.getName()).build();
        System.out.println(fbOutput);
    }
    @When("User runs the Upload Batch Files FB when Status ID field is below its minumum charecter length")
    public void user_runs_the_upload_batch_files_fb_when_status_id_field_is_below_its_minumum_charecter_length() {
        errors = FunctionBlockSandbox.forFB(SmartcareUploadBatchFileFB.class).performPostValidation(fbOutput).getErrors();
        System.out.println(errors + "...............................");
    }
    @Then("User validate the output as {string},{string} and {string} when Status ID field is below its minumum charecter length in Upload Batch Files")
    public void user_validate_the_output_as_and_when_status_id_field_is_below_its_minumum_charecter_length_in_upload_batch_files(String expectedErrorCode, String expectedFieldName, String expectedErrorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(expectedErrorCode, actualErrorCode);
        Assert.assertEquals(expectedFieldName, actualFieldName);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}


