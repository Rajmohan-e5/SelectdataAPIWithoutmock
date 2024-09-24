@Test
Feature: GetCompletedBatches Fb Prevalidation Testcases

  @PositiveFlow
  Scenario: Verify that GetCompleted batches fb runs successfully when user provides proper input payload
    Given User builds inputpayload for get completed batches fb
    When user runs fb using positive input file of get completed batches fb
    Then User validates the result after get completed batches fb runs successfully

  @ClientIDisEmpty
  Scenario Outline: Verify that error message is displayed when ClientID field is empty
    Given User builds the input file for SmartCare Get Completed Batches fb when ClientID is empty
    When user runs fb using input file of SmartCare Get Completed Batches fb when ClientID is empty
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when ClientID is empty
    Examples:
      | errorCode            | fieldName                                                                        | errorMessage                                             |
      | E5.SCHEMA.VAL.FAILED | getCompletedBatchesInputPayloadCriteria.getCompletedBatchesInputPayload.clientId | The 'clientId' value must have at least 1 character long |

  @ClientIDisNull
  Scenario Outline: Verify that error message is displayed when ClientID field is Null
    Given User builds the input file for SmartCare Get Completed Batches fb when ClientID is Null
    When user runs fb using input file of SmartCare Get Completed Batches fb when ClientID is Null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when ClientID is Null
    Examples:
      | errorCode            | fieldName                                                                        | errorMessage                          |
      | E5.SCHEMA.VAL.FAILED | getCompletedBatchesInputPayloadCriteria.getCompletedBatchesInputPayload.clientId | The 'clientId' value must be a string |

  @DateandTimeNull
  Scenario Outline: Verify that error message is displayed when Date and Time field is Null
    Given User builds the input file for SmartCare Get Completed Batches fb when Date and Time is Null
    When user runs fb using input file of SmartCare Get Completed Batches fb when Date and Time is Null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Date and Time is Null
    Examples:
      | errorCode            | fieldName                                                                        | errorMessage                          |
      | E5.SCHEMA.VAL.FAILED | getCompletedBatchesInputPayloadCriteria.getCompletedBatchesInputPayload.dateTime | The 'dateTime' value must be a string |

  @InvalidDateandTime
  Scenario Outline: Verify that error message is displayed when Date and Time format is invalid
    Given User builds the input file for SmartCare Get Completed Batches fb when Date and Time format is invalid
    When user runs fb using input file of SmartCare Get Completed Batches fb when Date and Time format is invalid
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Date and Time format is invalid
    Examples:
      | errorCode            | fieldName                                                                        | errorMessage                                                          |
      | E5.SCHEMA.VAL.FAILED | getCompletedBatchesInputPayloadCriteria.getCompletedBatchesInputPayload.dateTime | The 'dateTime' value must be in the format 'yyyy-mm-ddTHH:MM:SS.000Z' |

  @InvaidMinuteFormat
  Scenario Outline: Verify that error message is displayed when minutes format is invalid
    Given User builds the input file for SmartCare Get Completed Batches fb when minutes format is invalid
    When user runs fb using input file of SmartCare Get Completed Batches fb when minutes format is invalid
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when minutes format is invalid
    Examples:
      | errorCode            | fieldName                                                                       | errorMessage                                         |
      | E5.SCHEMA.VAL.FAILED | getCompletedBatchesInputPayloadCriteria.getCompletedBatchesInputPayload.minutes | The 'minutes' value must be in the format '23:59:59' |