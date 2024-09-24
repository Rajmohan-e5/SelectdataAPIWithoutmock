@Test
Feature: Smartcare Upload BatchFiles Fb Prevalidation Testcases

  @PositiveFlow
  Scenario: Verify that Smartcare Upload BatchFiles  fb runs successfully when user provides proper input payload
    Given User builds input payload for Smartcare Upload BatchFiles fb
    When user runs fb using positive input file of Smartcare Upload BatchFiles fb
    Then User validates the result after Smartcare Upload BatchFiles fb runs successfully

  @BatchIdNull
  Scenario Outline: Verify that error message is displayed when batch ID field is Null
    Given User builds the input file for SmartCare Upload BatchFiles fb when BatchID is Null
    When user runs fb using input file of Upload BatchFiles fb fb when Batch ID is Null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Batch ID is Null
    Examples:
      | errorCode            | fieldName                                                               | errorMessage                          |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileInputPayloadCriteria.uploadBatchFileInputPayload.batchId | The 'batchId' value must be an string |

  @BatchIdisEmpty
  Scenario Outline: Verify that error message is displayed when batch ID field is Empty
    Given User builds the input file for SmartCare Upload BatchFiles fb when BatchID is Empty
    When user runs fb using input file of Upload BatchFiles fb fb when Batch ID is Empty
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Batch ID is Empty
    Examples:
      | errorCode            | fieldName                                                               | errorMessage                                           |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileInputPayloadCriteria.uploadBatchFileInputPayload.batchId | The 'batchId' value must have atleast 1 character long|

  @DocumentTypeIDNull
  Scenario Outline: Verify that error message is displayed when DocumentType ID field is Null
    Given User builds the input file for SmartCare Upload BatchFiles fb when Document type ID is Null
    When user runs fb using input file of Upload BatchFiles fb fb when DocumentType ID is Null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when DocumentType ID is Null
    Examples:
      | errorCode            | fieldName                                                                      | errorMessage                                 |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileInputPayloadCriteria.uploadBatchFileInputPayload.documentTypeId | The 'documentTypeId' value must be an string |

  @EncompassIDisNull
  Scenario Outline: Verify that error message is displayed when Encompass ID field is Null
    Given User builds the input file for SmartCare Upload BatchFiles fb when Encompass ID is Null
    When user runs fb using input file of Upload BatchFiles fb fb when Encompass ID is Null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Encompass ID is Null
    Examples:
      | errorCode            | fieldName                                                                   | errorMessage                              |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileInputPayloadCriteria.uploadBatchFileInputPayload.encompassId | The 'encompassId' value must be an string |

  @EncompassIDisEmpty
  Scenario Outline: Verify that error message is displayed when Encompass ID field is Empty
    Given User builds the input file for SmartCare Upload BatchFiles fb when Encompass ID is Empty
    When user runs fb using input file of Upload BatchFiles fb fb when Encompass ID is Empty
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Encompass ID is Empty
    Examples:
      | errorCode            | fieldName                                                                   | errorMessage                                               |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileInputPayloadCriteria.uploadBatchFileInputPayload.encompassId | The 'encompassId' value must have atleast 1 character long|

  @FileNull
  Scenario Outline: Verify that error message is displayed when file field is Null
    Given User builds the input file for SmartCare Upload BatchFiles fb when file is Null
    When user runs fb using input file of Upload BatchFiles fb fb when file is Null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when file is Null
    Examples:
      | errorCode            | fieldName                                                            | errorMessage                      |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileInputPayloadCriteria.uploadBatchFileInputPayload.file | The 'file' value must be a string |

  @FileisEmpty
  Scenario Outline: Verify that error message is displayed when file field is Empty
    Given User builds the input file for SmartCare Upload BatchFiles fb when file is Empty
    When user runs fb using input file of Upload BatchFiles fb fb when file is Empty
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when file is Empty
    Examples:
      | errorCode            | fieldName                                                         | errorMessage                                        |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileInputPayloadCriteria.uploadBatchFileInputPayload.file | The 'file' value must have atleast 1 character long |
