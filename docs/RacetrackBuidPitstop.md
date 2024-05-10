

# RacetrackBuidPitstop


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**NameEnum**](#NameEnum) |  |  |
|**description** | **String** | Brief description of the pitstop |  |
|**isComplete** | **Boolean** | When set to &#x60;true&#x60; it indicates that the pre-requisites for advancing to the next pitstop have been met by the customer. This determination may be done through manual input (customer) or automated (LifecycleJourney). |  |
|**pitstopActions** | [**List&lt;RacetrackBuidPitstopAction&gt;**](RacetrackBuidPitstopAction.md) |  |  |
|**completionPercentage** | **Integer** | Percentage completed checklist actions. |  [optional] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| ONBOARD | &quot;onboard&quot; |
| IMPLEMENT | &quot;implement&quot; |
| USE | &quot;use&quot; |
| ENGAGE | &quot;engage&quot; |
| ADOPT | &quot;adopt&quot; |
| OPTIMIZE | &quot;optimize&quot; |



