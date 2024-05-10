# ComplianceApi

All URIs are relative to *https://api-cx.cisco.com/sandbox/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAssetViolations**](ComplianceApi.md#getAssetViolations) | **GET** /v1/customers/{customerId}/insights/compliance/assetViolations | List the violations of the asset |
| [**getAssetsWithViolations**](ComplianceApi.md#getAssetsWithViolations) | **GET** /v1/customers/{customerId}/insights/compliance/assetsWithViolations | Fetch the asset summary |
| [**getOptIn**](ComplianceApi.md#getOptIn) | **GET** /v1/customers/{customerId}/insights/compliance/optIn | Fetch optIn status |
| [**getPolicyRuleDetails**](ComplianceApi.md#getPolicyRuleDetails) | **GET** /v1/customers/{customerId}/insights/compliance/policyRuleDetails | Fetch information about the policy the rule belongs to |
| [**getSuggestions**](ComplianceApi.md#getSuggestions) | **GET** /v1/customers/{customerId}/insights/compliance/suggestions | Get the Suggestions filtered upon Severity (if given), for summary tab |
| [**getViolations**](ComplianceApi.md#getViolations) | **GET** /v1/customers/{customerId}/insights/compliance/violations | Fetch the violation summary of a customer |
| [**getViolationsAssets**](ComplianceApi.md#getViolationsAssets) | **GET** /v1/customers/{customerId}/insights/compliance/violations/assets | Fetch the violation details of impacted assets for the customer, and selected policy Group, Policy and Rule |


<a id="getAssetViolations"></a>
# **getAssetViolations**
> AssetViolationsResponse getAssetViolations(successTrackId, sourceSystemId, customerId, assetId, offset, max)

List the violations of the asset

Returns information about the rules violated by an asset based on the customer and asset information provided. Default is ruleSeverityId(desc)

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String sourceSystemId = "sourceSystemId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String assetId = "assetId_example"; // String | 
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    try {
      AssetViolationsResponse result = apiInstance.getAssetViolations(successTrackId, sourceSystemId, customerId, assetId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getAssetViolations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **successTrackId** | **String**|  | |
| **sourceSystemId** | **String**|  | |
| **customerId** | **String**| Unique identifier of the customer | |
| **assetId** | **String**|  | |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |

### Return type

[**AssetViolationsResponse**](AssetViolationsResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Service Unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getAssetsWithViolations"></a>
# **getAssetsWithViolations**
> AssetsWithViolationsResponse getAssetsWithViolations(successTrackId, customerId, offset, max)

Fetch the asset summary

Returns information about assets that have at least one rule violation based on the customerId provided. Default is severityId(desc), violationCount(desc)

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    try {
      AssetsWithViolationsResponse result = apiInstance.getAssetsWithViolations(successTrackId, customerId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getAssetsWithViolations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **successTrackId** | **String**|  | |
| **customerId** | **String**| Unique identifier of the customer | |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |

### Return type

[**AssetsWithViolationsResponse**](AssetsWithViolationsResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Service Unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getOptIn"></a>
# **getOptIn**
> OptInResponse getOptIn(successTrackId, customerId)

Fetch optIn status

Returns information about whether the customer has successfully configured the regulatory compliance feature and has assets that are qualified to be checked.

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    try {
      OptInResponse result = apiInstance.getOptIn(successTrackId, customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getOptIn");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **successTrackId** | **String**|  | |
| **customerId** | **String**| Unique identifier of the customer | |

### Return type

[**OptInResponse**](OptInResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Service Unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getPolicyRuleDetails"></a>
# **getPolicyRuleDetails**
> PolicyRuleDetails getPolicyRuleDetails(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity)

Fetch information about the policy the rule belongs to

Returns information about the policy the rule belongs to.

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String policyCategory = "policyCategory_example"; // String | 
    String policyGroupId = "policyGroupId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    String ruleId = "ruleId_example"; // String | 
    String severity = "severity_example"; // String | 
    try {
      PolicyRuleDetails result = apiInstance.getPolicyRuleDetails(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getPolicyRuleDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **successTrackId** | **String**|  | |
| **customerId** | **String**| Unique identifier of the customer | |
| **policyCategory** | **String**|  | |
| **policyGroupId** | **String**|  | |
| **policyId** | **String**|  | |
| **ruleId** | **String**|  | |
| **severity** | **String**|  | |

### Return type

[**PolicyRuleDetails**](PolicyRuleDetails.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Service Unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getSuggestions"></a>
# **getSuggestions**
> SuggestionsResponse getSuggestions(policyCategory, successTrackId, customerId, policyGroupId, policyId, ruleId, offset, max)

Get the Suggestions filtered upon Severity (if given), for summary tab

Returns information about the violated rule conditions, including suggested remediation steps, based on the customer, policy, and rule information provided. Default sorting is severityId(desc)

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String policyCategory = "policyCategory_example"; // String | 
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String policyGroupId = "policyGroupId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    String ruleId = "ruleId_example"; // String | 
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    try {
      SuggestionsResponse result = apiInstance.getSuggestions(policyCategory, successTrackId, customerId, policyGroupId, policyId, ruleId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getSuggestions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyCategory** | **String**|  | |
| **successTrackId** | **String**|  | |
| **customerId** | **String**| Unique identifier of the customer | |
| **policyGroupId** | **String**|  | |
| **policyId** | **String**|  | |
| **ruleId** | **String**|  | |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |

### Return type

[**SuggestionsResponse**](SuggestionsResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Service Unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getViolations"></a>
# **getViolations**
> ViolationSummaryResponse getViolations(successTrackId, customerId, offset, max)

Fetch the violation summary of a customer

Returns information about the rules violated for the customerId provided Default sorting is, severityId(asc), violationCount(desc)

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    try {
      ViolationSummaryResponse result = apiInstance.getViolations(successTrackId, customerId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getViolations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **successTrackId** | **String**|  | |
| **customerId** | **String**| Unique identifier of the customer | |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |

### Return type

[**ViolationSummaryResponse**](ViolationSummaryResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Service Unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getViolationsAssets"></a>
# **getViolationsAssets**
> AssetsViolationsResponse getViolationsAssets(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity, offset, max)

Fetch the violation details of impacted assets for the customer, and selected policy Group, Policy and Rule

Returns information about the customer assets in violation of the rule based on the customer, policy, and rule information provided. Default sorting is, assetName(asc)

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String policyCategory = "policyCategory_example"; // String | 
    String policyGroupId = "policyGroupId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    String ruleId = "ruleId_example"; // String | 
    String severity = "severity_example"; // String | 
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    try {
      AssetsViolationsResponse result = apiInstance.getViolationsAssets(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getViolationsAssets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **successTrackId** | **String**|  | |
| **customerId** | **String**| Unique identifier of the customer | |
| **policyCategory** | **String**|  | |
| **policyGroupId** | **String**|  | |
| **policyId** | **String**|  | |
| **ruleId** | **String**|  | |
| **severity** | **String**|  | |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |

### Return type

[**AssetsViolationsResponse**](AssetsViolationsResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Service Unavailable |  -  |
| **504** | Gateway timeout |  -  |

