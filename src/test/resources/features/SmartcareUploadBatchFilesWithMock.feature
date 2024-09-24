Feature: Delegation with mock validation test cases for Smartcare Upload Files as batch FB

  @PositiveFlow
  Scenario: Verify Positive flow runs successfully in delegation with mock input and output payload
    Given User build the mock function block input payload for Smartcare Upload Files as batch FB positive flow
    And User build the mock function block output payload for Smartcare Upload Files as batch FB positive flow
    When User runs the Smartcare Upload Files as batch FB delegation with mock positive flow
    Then User validate the output for Smartcare Upload Files as batch FB delegation with mock positive flow

  @InvalidInputPayload
  Scenario Outline: Verify user provide invalid input payload and valid output payload for pre validation
    Given User build the mock function block invalid input payload for Smartcare Upload Files as batch FB pre validation
    And User build the mock function block output payload for Smartcare Upload Files as batch FB pre validation
    When User runs the Smartcare Upload Files as batch FB delegation with mock for pre validation
    Then User validate the output for Smartcare Upload Files as batch FB delegation with mock pre validation "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                                               | errorMessage                          |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileInputPayloadCriteria.uploadBatchFileInputPayload.batchId | The 'batchId' value must be an string |

  @InvalidOutputPayload
  Scenario Outline: Verify user provide invalid output payload and valid input payload for the post validation
    Given User build the mock function block valid input payload for Smartcare Upload Files as batch FB post validation
    And User build the mock function block invalid output payload for Smartcare Upload Files as batch FB post validation
    When User runs the Smartcare Upload Files as batch FB delegation with mock for post validation
    Then User validate the output for Smartcare Upload Files as batch FB delegation with mock post validation "<errorCode>","<fieldName>" and "<errorMessage>"
    Examples:
      | errorCode            | fieldName                                 | errorMessage                                |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileOutputPayload.fileStatusId | The 'fileStatusId' value must be an integer |

  @KnownSingleError
  Scenario: Verify that Smartcare Upload Files as batch FB schema validation should not fail when listed fb error occurred
    Given User build the mock function block input payload for Smartcare Upload Files as batch FB listed single error validation
    And User build the mock function block empty output payload for Smartcare Upload Files as batch FB listed single error validation
    When User runs Smartcare Upload Files as batch FB with error code and output payload is empty for listed single error validation
    Then User validate the output of Smartcare Upload Files as batch FB error code and output payload is empty for listed single error validation

  @UnknownSingleError
  Scenario Outline: Verify that add denial reasons schema validation error should be thrown when unknown fb error occurred
    Given User build the mock function block input payload for Smartcare Upload Files as batch FB unknown single error validation
    And User build the mock function block empty output payload for Smartcare Upload Files as batch FB unknown single error validation
    When User runs Smartcare Upload Files as batch FB with error code and output payload is empty for unknown single error validation
    Then User validate the output of Smartcare Upload Files as batch FB error code and output payload is empty "<expectedError>" for unknown single error validation
    Examples:
      | expectedError                                                                                                                                                                                                                                                                                                                                                     |
      | does not have a value in the enumeration [BE_001, BE_002, BE_003, BE_004, BE_005, BE_006, BE_007, BE_008, BE_009, BE_010, BE_011, BE_012, BE_013, BE_014, BE_015, BE_016, BE_017, BE_018, BE_019, BE_020, BE_021, BE_022, BE_023, BE_024, BE_025, BE_026, BE_027, BE_028, BE_029, BE_030, BE_031, BE_032, BE_033, BE_036, SE_001, SE_002, SE_003, SE_004, SE_005] |

  @MultipleKnownError
  Scenario: Verify that Smartcare Upload Files as batch FB schema validation should not fail when multiple known fb error occur
    Given User build the mock function block input payload for Smartcare Upload Files as batch FB multiple known fb error validation
    And User build the mock function block empty output payload for Smartcare Upload Files as batch FB multiple known fb error validation
    When User runs Smartcare Upload Files as batch FB FB with error code and output payload is empty for multiple known fb error validation
    Then User validate the output of Smartcare Upload Files as batch FB error code and output payload is empty for multiple known fb error validation

  @UnknownMultipleError
  Scenario Outline: Verify that Smartcare Upload Files as batch FB schema validation error should be thrown when multiple unknown fb error occurred
    Given User build the mock function block input payload for Smartcare Upload Files as batch FB multiple unknown fb error validation
    And User build the mock function block empty output payload for Smartcare Upload Files as batch FB multiple unknown fb error validation
    When User runs Smartcare Upload Files as batch FB with error code and output payload is empty for multiple unknown fb error validation
    Then User validate the output of Smartcare Upload Files as batch FB error code and output payload is empty "<expectedError>" for unknown multiple error validation
    Examples:
      | expectedError                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
      |does not have a value in the enumeration [BE_001, BE_002, BE_003, BE_004, BE_005, BE_006, BE_007, BE_008, BE_009, BE_010, BE_011, BE_012, BE_013, BE_014, BE_015, BE_016, BE_017, BE_018, BE_019, BE_020, BE_021, BE_022, BE_023, BE_024, BE_025, BE_026, BE_027, BE_028, BE_029, BE_030, BE_031, BE_032, BE_033, BE_036, SE_001, SE_002, SE_003, SE_004, SE_005]|

  @CombinationOfknownAndUnknownErrors
  Scenario Outline: Verify that Smartcare Upload Files as batch FB schema validation error should be thrown when multiple known and unknown fb error occurred
    Given User build the mock function block input payload for Smartcare Upload Files as batch FB multiple known unknown fb error validation
    And User build the mock function block empty output payload for Smartcare Upload Files as batch FB multiple known and unknown fb error validation
    When User runs Smartcare Upload Files as batch FB with error code and output payload is empty for multiple known and unknown fb error validation
    Then User validate the output of Smartcare Upload Files as batch FB error code and output payload is empty "<expectedError>" for known and unknown multiple error validation
    Examples:
      | expectedError                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
      |does not have a value in the enumeration [BE_001, BE_002, BE_003, BE_004, BE_005, BE_006, BE_007, BE_008, BE_009, BE_010, BE_011, BE_012, BE_013, BE_014, BE_015, BE_016, BE_017, BE_018, BE_019, BE_020, BE_021, BE_022, BE_023, BE_024, BE_025, BE_026, BE_027, BE_028, BE_029, BE_030, BE_031, BE_032, BE_033, BE_036, SE_001, SE_002, SE_003, SE_004, SE_005]|


