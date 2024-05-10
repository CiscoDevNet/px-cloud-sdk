

# RacetrackBuidPitstopAction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A label identifying the action to be completed by the customer.  A set of actions identifies the exit criteria that must be met before proceeding to the next stage |  |
|**description** | **String** | A brief description of the action to be taken by the customer |  |
|**isManualCheckAllowed** | **Boolean** | When set to &#x60;true&#x60; it indicates that this action may be manually checked as completed/met. Otherwise completion must be automatically determined via analysis of collected data |  |
|**isComplete** | **Boolean** | When set to &#x60;true&#x60; it indicates that this action has been completed by the customer.  This is the reported status and it is set from one of &#x60;isActionCompleteAuto&#x60; (auto determined) or &#x60;isActionCompleteManual&#x60; (manually determined). Manual input takes precedence over the automated means and once set to manual it cannot be changed by automated means. It requires manual input |  |
|**updateMethod** | [**UpdateMethodEnum**](#UpdateMethodEnum) | The method by which the the completion status was updated (&#x60;MANUAL&#x60; user input, &#x60;AUTO&#x60; Lifecycle Journey). This value must be set when &#x60;isActionComplete&#x60; is set to &#x60;true&#x60; and cleared if &#x60;isActionComplte&#x60; is set to &#x60;false&#x60; |  |
|**isCompleteAuto** | **Boolean** | When set to &#x60;true&#x60; it indicates that this action was found to be completed/met through automated means.  An action manually set to completion takes precedence over the automated means.  An action set to completion via automated means may be manually overridden |  |
|**isCompleteManual** | **Boolean** | When set to &#x60;true&#x60; it indicates that action was manually set to completed / met |  |
|**isManaualOverride** | **Boolean** | When set to &#x60;true&#x60; it indicates that the automated result was overriden manually by a user |  |
|**tooltips** | [**List&lt;RacetrackTooltip&gt;**](RacetrackTooltip.md) |  |  |



## Enum: UpdateMethodEnum

| Name | Value |
|---- | -----|
| NA | &quot;NA&quot; |
| MANUAL | &quot;MANUAL&quot; |
| AUTO | &quot;AUTO&quot; |



