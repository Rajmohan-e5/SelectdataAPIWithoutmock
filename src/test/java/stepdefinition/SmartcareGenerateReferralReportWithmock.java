package stepdefinition;

import com.e5.platform.core.domains.FunctionBlockSandboxResponse;
import com.e5.platform.core.event.PayloadError;
import com.e5.platform.core.executionblock.functionblock.domain.FBStatus;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
import e5.selectdataapi.functionblock.generated.SmartcareGenerateReferralReportFB;
import e5.selectdataapi.functionblock.generated.SmartcareUploadBatchFileFB;
import e5.selectdataapi.model.smartcaregeneratereferralreportfb.SmartcareGenerateReferralReportFBInputPayload;
import e5.selectdataapi.model.smartcaregeneratereferralreportfb.SmartcareGenerateReferralReportFBOutputPayload;
import e5.selectdataapi.model.smartcareuploadbatchfilefb.SmartcareUploadBatchFileFBInputPayload;
import e5.selectdataapi.model.smartcareuploadbatchfilefb.SmartcareUploadBatchFileFBOutputPayload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class SmartcareGenerateReferralReportWithmock extends Payload.SmartcareGenerateReferralReportWithmock {

    FunctionBlockInput<Object> fbInput;
    FunctionBlockOutput<Object> fbOutput;
    List<PayloadError> errors;
    FunctionBlockSandbox sandbox;
    FunctionBlockSandboxResponse functionBlockSandboxResponse;
    FunctionBlockOutput functionBlockOutput;


    @Given("User build the mock function block input payload for Smartcare Generate referral report FB positive flow")
    public void user_build_the_mock_function_block_input_payload_for_smartcare_generate_referral_report_fb_positive_flow() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveinputpayload())
                .fbName("SmaercareGenerateReferralreportFB")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the mock function block output payload for Smartcare Generate referral report FB positive flow")
    public void user_build_the_mock_function_block_output_payload_for_smartcare_generate_referral_report_fb_positive_flow() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(positiveOutputPayload())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(new ArrayList<>())
                .blockName("SmartcareGenerateReferralReportFB")
                .payloadType(SmartcareGenerateReferralReportFBOutputPayload.class.getName()).build();
    }
    @When("User runs the Smartcare Generate referral report FB delegation with mock positive flow")
    public void user_runs_the_smartcare_generate_referral_report_fb_delegation_with_mock_positive_flow() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput = functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println("<========="+functionBlockOutput+"=========>");
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output for Smartcare Generate referral report FB delegation with mock positive flow")
    public void user_validate_the_output_for_smartcare_generate_referral_report_fb_delegation_with_mock_positive_flow() {
        Assert.assertEquals(fbOutput, functionBlockOutput);
    }

    @Given("User build the mock function block invalid input payload for Smartcare Generate referral report FB pre validation")
    public void user_build_the_mock_function_block_invalid_input_payload_for_smartcare_generate_referral_report_fb_pre_validation() {
        fbInput = FunctionBlockInput.builder()
                .payload(invalidInputPayload())
                .fbName("SmaercareGenerateReferralreportFB")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the mock function block output payload for Smartcare Generate referral report FB pre validation")
    public void user_build_the_mock_function_block_output_payload_for_smartcare_generate_referral_report_fb_pre_validation() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(positiveOutputPayload())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(new ArrayList<>())
                .blockName("SmartcareGenerateReferralReportFB")
                .payloadType(SmartcareGenerateReferralReportFBOutputPayload.class.getName()).build();
    }
    @When("User runs the Smartcare Generate referral report FB delegation with mock for pre validation")
    public void user_runs_the_smartcare_generate_referral_report_fb_delegation_with_mock_for_pre_validation() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput = functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println("<========="+functionBlockOutput+"=========>");
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output for Smartcare Generate referral report FB delegation with mock pre validation {string},{string} and {string}")
    public void user_validate_the_output_for_smartcare_generate_referral_report_fb_delegation_with_mock_pre_validation_and(String errorCode, String fieldName, String errorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(actualErrorCode, errorCode);
        Assert.assertEquals(actualFieldName, fieldName);
        Assert.assertEquals(actualErrorMessage, errorMessage);
    }

    @Given("User build the mock function block valid input payload for Smartcare Generate referral report FB post validation")
    public void user_build_the_mock_function_block_valid_input_payload_for_smartcare_generate_referral_report_fb_post_validation() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveinputpayload())
                .fbName("SmaercareGenerateReferralreportFB")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the mock function block invalid output payload for Smartcare Generate referral report FB post validation")
    public void user_build_the_mock_function_block_invalid_output_payload_for_smartcare_generate_referral_report_fb_post_validation() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(invalidOutputPayload())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(new ArrayList<>())
                .blockName("SmartcareGenerateReferralReportFB")
                .payloadType(SmartcareGenerateReferralReportFBOutputPayload.class.getName()).build();
    }
    @When("User runs the Smartcare Generate referral report FB delegation with mock for post validation")
    public void user_runs_the_smartcare_generate_referral_report_fb_delegation_with_mock_for_post_validation() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput = functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println("<========="+functionBlockOutput+"=========>");
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output for Smartcare Generate referral report FB delegation with mock post validation {string},{string} and {string}")
    public void user_validate_the_output_for_smartcare_generate_referral_report_fb_delegation_with_mock_post_validation_and(String errorCode, String fieldName, String errorMessage) {
        String actualErrorCode = errors.get(0).getErrorCode();
        String actualFieldName = errors.get(0).getFieldName();
        String actualErrorMessage = errors.get(0).getErrorMessage();

        Assert.assertEquals(actualErrorCode, errorCode);
        Assert.assertEquals(actualFieldName, fieldName);
        Assert.assertEquals(actualErrorMessage, errorMessage);
    }

    @Given("User build the mock function block input payload for Smartcare Generate referral report FB listed single error validation")
    public void user_build_the_mock_function_block_input_payload_for_smartcare_generate_referral_report_fb_listed_single_error_validation() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveinputpayload())
                .fbName("SmaercareGenerateReferralreportFB")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the mock function block empty output payload for Smartcare Generate referral report FB listed single error validation")
    public void user_build_the_mock_function_block_empty_output_payload_for_smartcare_generate_referral_report_fb_listed_single_error_validation() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(positiveOutputPayload())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(singleListedError())
                .blockName("SmartcareGenerateReferralReportFB")
                .payloadType(SmartcareGenerateReferralReportFBOutputPayload.class.getName()).build();
    }
    @When("User runs Smartcare Generate referral report FB with error code and output payload is empty for listed single error validation")
    public void user_runs_smartcare_generate_referral_report_fb_with_error_code_and_output_payload_is_empty_for_listed_single_error_validation() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput = functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println("<========="+functionBlockOutput+"=========>");
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output of Smartcare Generate referral report FB error code and output payload is empty for listed single error validation")
    public void user_validate_the_output_of_smartcare_generate_referral_report_fb_error_code_and_output_payload_is_empty_for_listed_single_error_validation() {
        List<PayloadError> listOfErrors= functionBlockOutput.getErrors();
        System.out.println();
        for (PayloadError errors:listOfErrors
        ) {
            if (errors.getErrorCode().equals("E5.SCHEMA.VAL.FAILED")){
                throw new RuntimeException("Failed");
            }
            System.out.println(">>>>>>>"+errors);
        }
    }

    @Given("User build the mock function block input payload for Smartcare Generate referral report FB unknown single error validation")
    public void user_build_the_mock_function_block_input_payload_for_smartcare_generate_referral_report_fb_unknown_single_error_validation() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveinputpayload())
                .fbName("SmaercareGenerateReferralreportFB")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the mock function block empty output payload for Smartcare Generate referral report FB unknown single error validation")
    public void user_build_the_mock_function_block_empty_output_payload_for_smartcare_generate_referral_report_fb_unknown_single_error_validation() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(positiveOutputPayload())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(unknownSingleError())
                .blockName("SmartcareGenerateReferralReportFB")
                .payloadType(SmartcareGenerateReferralReportFBOutputPayload.class.getName()).build();
    }
    @When("User runs Smartcare Generate referral report FB with error code and output payload is empty for unknown single error validation")
    public void user_runs_smartcare_generate_referral_report_fb_with_error_code_and_output_payload_is_empty_for_unknown_single_error_validation() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput = functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println("<========="+functionBlockOutput+"=========>");
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output of Smartcare Generate referral report FB error code and output payload is empty {string} for unknown single error validation")
    public void user_validate_the_output_of_smartcare_generate_referral_report_fb_error_code_and_output_payload_is_empty_for_unknown_single_error_validation(String expectedError) {
        List<PayloadError> listOfErrors= functionBlockOutput.getErrors();
        System.out.println();
        for (PayloadError errors:listOfErrors
        ) {
            if (errors.getErrorCode().equals("E5.SCHEMA.VAL.FAILED")){
                Assert.assertEquals(expectedError,errors.getErrorMessage());
                break;
            }
            System.out.println(">>>>>>>"+errors);
        }
    }
    @Given("User build the mock function block input payload for Smartcare Generate referral report FB multiple known fb error validation")
    public void user_build_the_mock_function_block_input_payload_for_smartcare_generate_referral_report_fb_multiple_known_fb_error_validation() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveinputpayload())
                .fbName("SmaercareGenerateReferralreportFB")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the mock function block empty output payload for Smartcare Generate referral report FB multiple known fb error validation")
    public void user_build_the_mock_function_block_empty_output_payload_for_smartcare_generate_referral_report_fb_multiple_known_fb_error_validation() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(positiveOutputPayload())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(MultipleKnownErrors())
                .blockName("SmartcareGenerateReferralReportFB")
                .payloadType(SmartcareGenerateReferralReportFBOutputPayload.class.getName()).build();
    }
    @When("User runs Smartcare Generate referral report FB with error code and output payload is empty for multiple known fb error validation")
    public void user_runs_smartcare_generate_referral_report_fb_with_error_code_and_output_payload_is_empty_for_multiple_known_fb_error_validation() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput = functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println("<========="+functionBlockOutput+"=========>");
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output of Smartcare Generate referral report FB error code and output payload is empty for multiple known fb error validation")
    public void user_validate_the_output_of_smartcare_generate_referral_report_fb_error_code_and_output_payload_is_empty_for_multiple_known_fb_error_validation() {
        List<PayloadError> listOfErrors= functionBlockOutput.getErrors();
        System.out.println();
        for (PayloadError errors:listOfErrors
        ) {
            if (errors.getErrorCode().equals("E5.SCHEMA.VAL.FAILED")){
                throw new RuntimeException("Failed");
            }
            System.out.println(">>>>>>>"+errors);
        }
    }

    @Given("User build the mock function block input payload for Smartcare Generate referral report FB multiple unknown fb error validation")
    public void user_build_the_mock_function_block_input_payload_for_smartcare_generate_referral_report_fb_multiple_unknown_fb_error_validation() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveinputpayload())
                .fbName("SmaercareGenerateReferralreportFB")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the mock function block empty output payload for Smartcare Generate referral report FB multiple unknown fb error validation")
    public void user_build_the_mock_function_block_empty_output_payload_for_smartcare_generate_referral_report_fb_multiple_unknown_fb_error_validation() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(positiveOutputPayload())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(multipleunknownErrors())
                .blockName("SmartcareGenerateReferralReportFB")
                .payloadType(SmartcareGenerateReferralReportFBOutputPayload.class.getName()).build();
    }
    @When("User runs Smartcare Generate referral report FB with error code and output payload is empty for multiple unknown fb error validation")
    public void user_runs_smartcare_generate_referral_report_fb_with_error_code_and_output_payload_is_empty_for_multiple_unknown_fb_error_validation() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput = functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println("<========="+functionBlockOutput+"=========>");
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output of Smartcare Generate referral report FB error code and output payload is empty {string} for unknown multiple error validation")
    public void user_validate_the_output_of_smartcare_generate_referral_report_fb_error_code_and_output_payload_is_empty_for_unknown_multiple_error_validation(String expectedError) {
        List<PayloadError> listOfErrors= functionBlockOutput.getErrors();
        System.out.println();
        for (PayloadError errors:listOfErrors
        ) {
            if (errors.getErrorCode().equals("E5.SCHEMA.VAL.FAILED")){
                Assert.assertEquals(expectedError,errors.getErrorMessage());
                break;
            }
            System.out.println(">>>>>>>"+errors);
        }
    }

    @Given("User build the mock function block input payload for Smartcare Generate referral report FB multiple known unknown fb error validation")
    public void user_build_the_mock_function_block_input_payload_for_smartcare_generate_referral_report_fb_multiple_known_unknown_fb_error_validation() {
        fbInput = FunctionBlockInput.builder()
                .payload(positiveinputpayload())
                .fbName("SmaercareGenerateReferralreportFB")
                .genericType(SmartcareGenerateReferralReportFBInputPayload.class.getName()).build();
        System.out.println(fbInput);
    }
    @Given("User build the mock function block empty output payload for Smartcare Generate referral report FB multiple known and unknown fb error validation")
    public void user_build_the_mock_function_block_empty_output_payload_for_smartcare_generate_referral_report_fb_multiple_known_and_unknown_fb_error_validation() {
        fbOutput = FunctionBlockOutput.builder()
                .payload(positiveOutputPayload())
                .status(FBStatus.E5_FB_SUCCESS)
                .errors(combinationofUnknownandknownerrors())
                .blockName("SmartcareGenerateReferralReportFB")
                .payloadType(SmartcareGenerateReferralReportFBOutputPayload.class.getName()).build();
    }
    @When("User runs Smartcare Generate referral report FB with error code and output payload is empty for multiple known and unknown fb error validation")
    public void user_runs_smartcare_generate_referral_report_fb_with_error_code_and_output_payload_is_empty_for_multiple_known_and_unknown_fb_error_validation() {
        sandbox = FunctionBlockSandbox.forFB(SmartcareGenerateReferralReportFB.class).withMockResponse(fbOutput);
        functionBlockSandboxResponse = sandbox.startExecution(fbInput);
        functionBlockOutput = functionBlockSandboxResponse.getFunctionBlockOutput();
        System.out.println("<========="+functionBlockOutput+"=========>");
        List events = functionBlockSandboxResponse.getEvents();
        events.forEach(System.out::println);
        System.out.println("Error is "+functionBlockOutput.getErrors());
        errors=functionBlockOutput.getErrors();
    }
    @Then("User validate the output of Smartcare Generate referral report FB error code and output payload is empty {string} for known and unknown multiple error validation")
    public void user_validate_the_output_of_smartcare_generate_referral_report_fb_error_code_and_output_payload_is_empty_for_known_and_unknown_multiple_error_validation(String expectedError) {
        List<PayloadError> listOfErrors= functionBlockOutput.getErrors();
        System.out.println();
        for (PayloadError errors:listOfErrors
        ) {
            if (errors.getErrorCode().equals("E5.SCHEMA.VAL.FAILED")){
                Assert.assertEquals(expectedError,errors.getErrorMessage());
                break;
            }
            System.out.println(">>>>>>>"+errors);
        }
    }
}
