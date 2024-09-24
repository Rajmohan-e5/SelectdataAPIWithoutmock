//package stepdefinition;
//
//import com.e5.platform.core.domains.FunctionBlockSandboxResponse;
//import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockInput;
//import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOption;
//import com.e5.platform.core.executionblock.functionblock.domain.FunctionBlockOutput;
//import com.e5.platform.core.wre.sandbox.FunctionBlockSandbox;
//import e5.hchb.functionblock.generated.LockOasisAssessmentsFB;
//import e5.model.*;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import java.util.*;
//
//public class withoutMock {
//    FunctionBlockInput<Object> fbInput;
//    FunctionBlockSandboxResponse<Object> functionBlockResponse;
//
//    FunctionBlockOutput<Object> functionBlockOutput;
//
//
//
//
//
//    @Given("user builds the input value for edit lock")
//    public void user_builds_the_input_value_for_edit_lock() {
//        Set<String> StageValue = new HashSet<String>(Arrays.asList("Edit/Lock OASIS"));
//        Set<String> EventValue = new HashSet<String>(Arrays.asList("SOC/RECERT"));
//        List<ErrorHandlingConfig> popups = new ArrayList<>();
//        popups.add(ErrorHandlingConfig.builder().popupName(ErrorHandlingConfig.PopupName.MEDICARE_OR_MEDICAID_PAYMENT_ANSWERS)
//                .action(ErrorHandlingConfig.Action.OK)
//                .proceedToLock(Boolean.FALSE)
//                .build());
//        popups.add(ErrorHandlingConfig.builder()
//                .popupName(ErrorHandlingConfig.PopupName.MEDICARE_OR_MEDICAID_PAYMENT_ANSWERS)
//                .action(ErrorHandlingConfig.Action.OK)
//
//                .proceedToLock(Boolean.FALSE)
//
//                .build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.BLANK_SSN_IN_M_0064)
//                .action(ErrorHandlingConfig.Action.OK)
//                .proceedToLock(Boolean.FALSE)
//
//                .build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.DIAGNOSIS_DM)
//                .action(ErrorHandlingConfig.Action.OK)
//                .proceedToLock(Boolean.FALSE)
//
//                .build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.DIAGNOSIS_NOA)
//                .action(ErrorHandlingConfig.Action.OK)
//                .proceedToLock(Boolean.FALSE)
//
//                .build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.DIAGNOSIS_PVD_PAD)
//                .action(ErrorHandlingConfig.Action.OK)
//                .proceedToLock(Boolean.FALSE)
//
//                .build());
//
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.INVALID_DATE_DIFFERENCE)
//                .action(ErrorHandlingConfig.Action.OK)
//                .proceedToLock(Boolean.FALSE)
//
//                .build());
//
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.INVALID_PRIMARY_DIAGNOSIS_SEVERITY_RATING)
//                .action(ErrorHandlingConfig.Action.OK)
//                .proceedToLock(Boolean.FALSE)
//
//                .build());
//
//
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.OASIS_VALIDATION_ERRORS)
//                .action(ErrorHandlingConfig.Action.DO_NOT_LOCK_WITH_ERRORS)
//                .proceedToLock(Boolean.TRUE)
//
//                .build());
//
//
//
//        LockOasisAssessmentsFBInputPayload inputPayload = LockOasisAssessmentsFBInputPayload.builder()
//
//                .lockOasisAssessmentsCriteria(LockOasisAssessmentsCriteria.builder()
//                        .workflowConsoleType(LockOasisAssessmentsCriteria.WorkflowConsoleType.PATIENT_RELATED_TASKS)
//                        .workflowConsolePanelFilter(WorkflowConsolePanelFilter.builder()
//                                .workflowConsoleEvents(WorkflowConsoleEvents.builder()
//                                        .value(EventValue)
//                                        .status(WorkflowConsoleEvents.Status.ACTIVE)
////                                        .searchBy("SOC/RECERT")
//                                        .build())
//                                .workflowConsoleStages(WorkflowConsoleStages.builder()
//                                        .value(StageValue)
//                                        .status(WorkflowConsoleStages.Status.ACTIVE)
////                                        .searchBy("Edit/Lock OASIS")
//                                        .build()).build())
//                        .workflowConsoleGridFilter(WorkflowConsoleGridFilter.builder()
//                                .workflowConsoleArrived(WorkflowConsoleArrived.builder()
//                                        .value("04/25/2024 02:10 PM").build())
//                                .workflowConsolePatientName(WorkflowConsolePatientName.builder()
//                                        .value("ACOZZZSTA").build())
//                                .workflowConsoleMrNo(WorkflowConsoleMrNo.builder()
//                                        .value("BWO00061983701").build())
////                                .workflowConsoleTask(WorkflowConsoleTask.builder()
////                                        .value("EDIT/LOCK OASIS ASSESSMENT")
////                                        .build())
//                                .build()).build())
//
//                .lockOasisAssessmentsBehaviors(LockOasisAssessmentsBehaviors.builder()
//                        .errorHandlingConfig(popups).build()).build();
//        fbInput = FunctionBlockInput.builder()
//                .payload(inputPayload)
//                .fbName("Editlock")
//                .options(FunctionBlockOption.builder().maximumAttempts(1).build())
//                .genericType(LockOasisAssessmentsFBInputPayload.class.getName()).build();
//        System.out.println(fbInput);
//    }
//    @When("user runs the FB for edit lock")
//    public void user_runs_the_fb_for_edit_lock() {
//        FunctionBlockSandbox sandbox = FunctionBlockSandbox.forFB(LockOasisAssessmentsFB.class);
//        functionBlockResponse = sandbox.startExecution(fbInput);
//    }
//    @Then("user gets the Fboutput for edit lock")
//    public void user_gets_the_fboutput_for_edit_lock() {
//        functionBlockOutput = functionBlockResponse.getFunctionBlockOutput();
//    }
//    @Then("User validates the result using for edit lock")
//    public void user_validates_the_result_using_for_edit_lock() {
//        System.out.println(functionBlockOutput);
//        System.out.println("Status Error Message"+functionBlockOutput.getStatus());
//    }
//}
