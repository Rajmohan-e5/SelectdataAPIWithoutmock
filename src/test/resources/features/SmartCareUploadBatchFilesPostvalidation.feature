Feature:Post validation test cases for Smartcare Upload Batch Files FB

  @PostValidationPositive
  Scenario: Verify that user provide proper output payload for post validation in Upload Batch Files FB
    Given User build the function block output payload for Upload Batch Files FB positive flow
    When User runs the Upload Batch Files FB positive flow
    Then User validate the output for Upload Batch Files FB positive flow

  @FileIDNUll
  Scenario Outline: Verify that Schema validation error should thrown when ID is Null in Upload Batch Files FB
    Given User build the function block output payload for Upload Batch Files FB postvalidation
    When User runs the Upload Batch Files FB when file ID field is null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when file ID field is null in Upload Batch Files
    Examples:
      | errorCode            | fieldName                           | errorMessage                         |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileOutputPayload.fileId | The 'fileId' value must be an string |

  @FileIDisEmpty
  Scenario Outline: Verify that Schema validation error should thrown when file ID is empty in Upload Batch Files FB
    Given User build the function block output payload for Upload Batch Files FB postvalidation when file id is empty
    When User runs the Upload Batch Files FB when file ID field is empty
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when file ID field is empty in Upload Batch Files
    Examples:
      | errorCode            | fieldName                           | errorMessage                                     |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileOutputPayload.fileId | The 'fileId' must have at least 1 character long |

  @FileNameNUll
  Scenario Outline: Verify that Schema validation error should thrown when File Name is Null in Upload Batch Files FB
    Given User build the function block output payload for Upload Batch Files FB postvalidation When File Name is NUll
    When User runs the Upload Batch Files FB when File Name field is null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when File Name field is null in Upload Batch Files
    Examples:
      | errorCode            | fieldName                             | errorMessage                          |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileOutputPayload.fileName | The 'fileName' value must be a string |

  @FileNameisEmpty
  Scenario Outline: Verify that Schema validation error should thrown when file name is empty in Upload Batch Files FB
    Given User build the function block output payload for Upload Batch Files FB postvalidation when file name is empty
    When User runs the Upload Batch Files FB when file name field is empty
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when file name field is empty in Upload Batch Files
    Examples:
      | errorCode            | fieldName                           | errorMessage                                       |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileOutputPayload.fileName | The 'fileName' must have at least 1 character long |

  @UploadedDateNUll
  Scenario Outline: Verify that Schema validation error should thrown when Uploaded Date is Null in Upload Batch Files FB
    Given User build the function block output payload for Upload Batch Files FB postvalidation When Uploaded Date is NUll
    When User runs the Upload Batch Files FB when UploadedDate field is null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Uploaded Date field is null in Upload Batch Files
    Examples:
      | errorCode            | fieldName                                 | errorMessage                              |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileOutputPayload.uploadedDate | The 'uploadedDate' value must be a string |

  @UploadedDateisinvalidFormat
  Scenario Outline: Verify that Schema validation error should thrown when Uploaded Date is in invalid format in Upload Batch Files FB
    Given User build the function block output payload for Upload Batch Files FB postvalidation When Uploaded Date is in invalid format
    When User runs the Upload Batch Files FB when UploadedDate field is in invalid format
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Uploaded Date field is in invalid format in Upload Batch Files
    Examples:
      | errorCode            | fieldName                                 | errorMessage                                                                              |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileOutputPayload.uploadedDate | The 'uploadedDate' value must be in the format of 'yyyy-MM-ddTHH:mm:ss.SSSSSSS(+/-)HH:mm' |

  @StatusIDNUll
  Scenario Outline: Verify that Schema validation error should thrown when Status ID is Null in Upload Batch Files FB
    Given User build the function block output payload for Upload Batch Files FB postvalidation When Status ID is Null
    When User runs the Upload Batch Files FB when Status ID field is null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Status ID field is null in Upload Batch Files
    Examples:
      | errorCode            | fieldName                                 | errorMessage                                |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileOutputPayload.fileStatusId | The 'fileStatusId' value must be an integer |

  @FileStatusIDMincharectervalidation
  Scenario Outline: Verify that Schema validation error should thrown when Status ID is not in minimum charecters Upload Batch Files FB
    Given User build the function block output payload for Upload Batch Files FB postvalidation When file Status ID is below its minumum charecter length
    When User runs the Upload Batch Files FB when Status ID field is below its minumum charecter length
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Status ID field is below its minumum charecter length in Upload Batch Files
    Examples:
      | errorCode            | fieldName                                 | errorMessage                                          |
      | E5.SCHEMA.VAL.FAILED | uploadBatchFileOutputPayload.fileStatusId | The 'fileStatusId' value must have minimum value of 0 |