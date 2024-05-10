

# Faults


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**severity** | **String** | Severity value assigned by CX Cloud |  [optional] |
|**title** | **String** | Title of the fault |  [optional] |
|**lastOccurence** | **OffsetDateTime** | Date the fault last occurred |  [optional] |
|**condition** | **String** | The facility, condition severity, and mnemonic portion of the fault message |  [optional] |
|**caseAutomation** | [**CaseAutomationEnum**](#CaseAutomationEnum) | Indicates whether support case automation has been enabled for the fault |  [optional] |
|**faultId** | **Integer** | Unique identifier used in CX Cloud to identify the fault |  [optional] |
|**category** | **String** | The category assigned to the fault by CX Cloud, for example System, CPU-Memory, Services, and Environment |  [optional] |
|**openCases** | **Integer** | Number of Cisco support cases automatically created for the fault |  [optional] |
|**affectedAssets** | **Integer** | Number of assets affected by the fault |  [optional] |
|**occurences** | **Integer** | Number of times the fault occurred |  [optional] |
|**ignoredAssets** | **Integer** | Number of assets the fault is ignored for |  [optional] |
|**mgmtSystemType** | **String** |  |  [optional] |
|**mgmtSystemAddr** | **String** |  |  [optional] |
|**mgmtSystemHostname** | **String** |  |  [optional] |



## Enum: CaseAutomationEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;enabled&quot; |
| DISABLED | &quot;disabled&quot; |



