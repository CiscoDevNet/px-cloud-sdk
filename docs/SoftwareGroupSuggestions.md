

# SoftwareGroupSuggestions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**suggestionsInterval** | **String** | How often, in months, Cisco software release suggestions will be provided. The customer can configure this value in CX Cloud. |  [optional] |
|**suggestionUpdatedDate** | **LocalDate** | Date the machine learning suggestions were updated for the Software Group |  [optional] |
|**suggestionSelectedDate** | **LocalDate** | Date the customer selected a suggested Cisco software release in CX Cloud |  [optional] |
|**releaseSummary** | [**List&lt;ReleaseSummary&gt;**](ReleaseSummary.md) | List of the following Cisco software releases for the Software Group - • Latest release available from Cisco Software Central • Suggested releases • Cisco DNA Center golden release • Cisco DNA Center Compatibility Matrix minimum release |  [optional] |
|**suggestionSummaries** | [**List&lt;SuggestionSummary&gt;**](SuggestionSummary.md) | Information about the Cisco software releases running on, and suggested for, the assets in the Software Group |  [optional] |
|**softwareGroupRiskTrend** | [**List&lt;SoftwareGroupRisk&gt;**](SoftwareGroupRisk.md) | List of weekly risk scores for the current Cisco software releases calculated over a period of time |  [optional] |



