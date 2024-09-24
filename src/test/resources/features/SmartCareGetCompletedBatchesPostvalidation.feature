Feature:Post validation test cases for Smartcare Get Completed Batches FB

  @PostValidationPositive
  Scenario: Verify that user provide proper output payload for post validation in Get Completed Batches FB
    Given User build the function block output payload for Get Completed Batches FB positive flow
    When User runs the Get Completed Batches FB positive flow
    Then User validate the output for Get Completed Batches FB positive flow

  @PatientIDNull
  Scenario Outline: Verify that Schema validation error should thrown when Patient ID is Null
    Given User build the function block output payload for Get Completed Batches FB postvalidation
    When User runs the Get Completed Batches FB when PatientID field is null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when PatientID field is null
    Examples:
      | errorCode            | fieldName                                     | errorMessage                     |
      | E5.SCHEMA.VAL.FAILED | getCompletedBatchesOutputPayload[0].patientId | The 'patientId' must be a string |

  @IDNull
  Scenario Outline: Verify that Schema validation error should thrown when  ID is Null
    Given User build the function block output payload for Get Completed Batches FB postvalidation when ID is null
    When User runs the Get Completed Batches FB when ID field is null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when ID field is null
    Examples:
      | errorCode            | fieldName                              | errorMessage              |
      | E5.SCHEMA.VAL.FAILED | getCompletedBatchesOutputPayload[0].id |The 'id' must be a integer |

  @StatusIDNull
  Scenario Outline: Verify that Schema validation error should thrown when Status ID is Null
    Given User build the function block output payload for Get Completed Batches FB postvalidation when Status ID is null
    When User runs the Get Completed Batches FB when Status ID field is null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Status ID field is null
    Examples:
      | errorCode            | fieldName                                    | errorMessage                     |
      | E5.SCHEMA.VAL.FAILED | getCompletedBatchesOutputPayload[0].statusId | The 'statusId' must be a integer |

  @IDMinimumValueValidation
  Scenario Outline: Verify that Schema validation error should thrown when ID is empty
    Given User build the function block output payload for Get Completed Batches FB postvalidation when id is empty
    When User runs the Get Completed Batches FB when id field is empty
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when id field is empty
    Examples:
      | errorCode            | fieldName                              | errorMessage                          |
      | E5.SCHEMA.VAL.FAILED | getCompletedBatchesOutputPayload[0].id | The 'id' must have minimum value of 0 |

  @PatientIDisEmpty
  Scenario Outline: Verify that Schema validation error should thrown when Patient ID is empty
    Given User build the function block output payload for Get Completed Batches FB postvalidation when Patient id is empty
    When User runs the Get Completed Batches FB when Patient ID field is empty
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when PatientID field is empty
    Examples:
      | errorCode            | fieldName                              | errorMessage                          |
      | E5.SCHEMA.VAL.FAILED | getCompletedBatchesOutputPayload[0].id | The 'id' must have minimum value of 0 |