//package Base;
//
//import e5.model.ErrorHandlingConfig;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class EditLockBase {
//
//
//    public List<ErrorHandlingConfig> positiveList(){
//        List<ErrorHandlingConfig> popups = new ArrayList<>();
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.MEDICARE_OR_MEDICAID_PAYMENT_ANSWERS)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        return popups;
//    }
//    public List<ErrorHandlingConfig> multiplePopupListValue(){
//        List<ErrorHandlingConfig> popups = new ArrayList<>();
//        popups.add(ErrorHandlingConfig.builder().popupName(ErrorHandlingConfig.PopupName.MEDICARE_OR_MEDICAID_PAYMENT_ANSWERS)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder()
//                .popupName(ErrorHandlingConfig.PopupName.MEDICARE_OR_MEDICAID_PAYMENT_ANSWERS)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.BLANK_SSN_IN_M_0064)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.DIAGNOSIS_DM)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.DIAGNOSIS_NOA)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.DIAGNOSIS_PVD_PAD)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.ERROR_SENDING_REQUEST)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.INTERNAL_SERVER_ERROR)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.INVALID_ASSESSMENT_STATUS)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.INVALID_DATE_DIFFERENCE)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.INVALID_FUNCTIONAL_IMPAIRMENT_HOSPITALIZATION_RISK)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.INVALID_PRIMARY_DIAGNOSIS_SEVERITY_RATING)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.ISSUE_IN_GROUPING_OASIS)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.NO_CLINICAL_GROUP_FOR_PDX)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.NO_MEDIA_TYPE_FORMATTER)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.OASIS_ASSESSMENT_WITH_PENDING_CHANGE)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.OASIS_VALIDATION_ERRORS)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        popups.add(ErrorHandlingConfig.builder().
//                popupName(ErrorHandlingConfig.PopupName.PRINCIPAL_DIAGNOSIS_NOT_ASSIGNED)
//                .action(ErrorHandlingConfig.Action.OK).order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        return popups;
//
//    }
//    public List<ErrorHandlingConfig> popupNameNull(){
//        List<ErrorHandlingConfig> popups = new ArrayList<>();
//        popups.add(ErrorHandlingConfig.builder()
//                .action(ErrorHandlingConfig.Action.OK)
//                .order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        return popups;
//    }
//
//    public List<ErrorHandlingConfig> actionNull(){
//        List<ErrorHandlingConfig> popups = new ArrayList<>();
//        popups.add(ErrorHandlingConfig.builder()
//                .popupName(ErrorHandlingConfig.PopupName.MEDICARE_OR_MEDICAID_PAYMENT_ANSWERS)
//                        .order("1")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        return popups;
//    }
//
//    public List<ErrorHandlingConfig> orderNull(){
//        List<ErrorHandlingConfig> popups = new ArrayList<>();
//        popups.add(ErrorHandlingConfig.builder()
//                .popupName(ErrorHandlingConfig.PopupName.MEDICARE_OR_MEDICAID_PAYMENT_ANSWERS)
//                .action(ErrorHandlingConfig.Action.OK)
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        return popups;
//    }
//
//    public List<ErrorHandlingConfig> orderEmpty(){
//        List<ErrorHandlingConfig> popups = new ArrayList<>();
//        popups.add(ErrorHandlingConfig.builder()
//                .popupName(ErrorHandlingConfig.PopupName.MEDICARE_OR_MEDICAID_PAYMENT_ANSWERS)
//                .action(ErrorHandlingConfig.Action.OK)
//                .order("")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        return popups;
//    }
//
//    public List<ErrorHandlingConfig> proceedToLockNull(){
//        List<ErrorHandlingConfig> popups = new ArrayList<>();
//        popups.add(ErrorHandlingConfig.builder()
//                .popupName(ErrorHandlingConfig.PopupName.MEDICARE_OR_MEDICAID_PAYMENT_ANSWERS)
//                .action(ErrorHandlingConfig.Action.OK)
//                .order("2")
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .processingTime("09:30pm").build());
//        return popups;
//    }
//
//    public List<ErrorHandlingConfig> popuptypeNull(){
//        List<ErrorHandlingConfig> popups = new ArrayList<>();
//        popups.add(ErrorHandlingConfig.builder()
//                .popupName(ErrorHandlingConfig.PopupName.MEDICARE_OR_MEDICAID_PAYMENT_ANSWERS)
//                .action(ErrorHandlingConfig.Action.OK)
//                .order("2")
//                .proceedToLock(Boolean.TRUE)
//                .processingTime("09:30pm").build());
//        return popups;
//    }
//
//    public List<ErrorHandlingConfig> processedTimeNull(){
//        List<ErrorHandlingConfig> popups = new ArrayList<>();
//        popups.add(ErrorHandlingConfig.builder()
//                .popupName(ErrorHandlingConfig.PopupName.MEDICARE_OR_MEDICAID_PAYMENT_ANSWERS)
//                .action(ErrorHandlingConfig.Action.OK)
//                .order("2")
//                .proceedToLock(Boolean.TRUE)
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//               .build());
//        return popups;
//    }
//
//    public List<ErrorHandlingConfig> processedTimeEmpty(){
//        List<ErrorHandlingConfig> popups = new ArrayList<>();
//        popups.add(ErrorHandlingConfig.builder()
//                .popupName(ErrorHandlingConfig.PopupName.MEDICARE_OR_MEDICAID_PAYMENT_ANSWERS)
//                .action(ErrorHandlingConfig.Action.OK)
//                .order("2")
//                .proceedToLock(Boolean.TRUE)
//                .popupType(ErrorHandlingConfig.PopupType.OASIS_ALERTS)
//                .processingTime("")
//                .build());
//        return popups;
//    }
//}
