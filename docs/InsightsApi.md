# InsightsApi

All URIs are relative to *https://api-cx.cisco.com/sandbox/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSoftwareGroupAssets**](InsightsApi.md#getSoftwareGroupAssets) | **GET** /v1/customers/{customerId}/insights/software/softwareGroups/assets | List Asset information in the Software Group |
| [**getSoftwareGroupFieldNotices**](InsightsApi.md#getSoftwareGroupFieldNotices) | **GET** /v1/customers/{customerId}/insights/software/softwareGroups/suggestions/fieldNotices | List info on Software Group - Suggestions Field Notices |
| [**getSoftwareGroupSecurityAdvisories**](InsightsApi.md#getSoftwareGroupSecurityAdvisories) | **GET** /v1/customers/{customerId}/insights/software/softwareGroups/suggestions/securityAdvisories | List info on Software Group - Suggestions Security Advisories |
| [**getSoftwareGroupSuggestions**](InsightsApi.md#getSoftwareGroupSuggestions) | **GET** /v1/customers/{customerId}/insights/software/softwareGroups/suggestions | List Software Group Suggestions |
| [**getSoftwareGroupSuggestionsBugs**](InsightsApi.md#getSoftwareGroupSuggestionsBugs) | **GET** /v1/customers/{customerId}/insights/software/softwareGroups/suggestions/bugs | List info on Software Group - Suggestions Bugs |
| [**getSoftwareGroups**](InsightsApi.md#getSoftwareGroups) | **GET** /v1/customers/{customerId}/insights/software/softwareGroups | fetch Software Group Information |


<a id="getSoftwareGroupAssets"></a>
# **getSoftwareGroupAssets**
> AssetResponse getSoftwareGroupAssets(customerId, successTrackId, softwareGroupId, offset, max)

List Asset information in the Software Group

Returns information about assets in the Software Group based on the customerId and softwareGroupId provided

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String successTrackId = "successTrackId_example"; // String | 
    String softwareGroupId = "softwareGroupId_example"; // String | Unique identifier used in CX Cloud to identify the Software Group
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    try {
      AssetResponse result = apiInstance.getSoftwareGroupAssets(customerId, successTrackId, softwareGroupId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getSoftwareGroupAssets");
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
| **customerId** | **String**| Unique identifier of the customer | |
| **successTrackId** | **String**|  | |
| **softwareGroupId** | **String**| Unique identifier used in CX Cloud to identify the Software Group | |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |

### Return type

[**AssetResponse**](AssetResponse.md)

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

<a id="getSoftwareGroupFieldNotices"></a>
# **getSoftwareGroupFieldNotices**
> SoftwareGroupFieldNoticesResponse getSoftwareGroupFieldNotices(customerId, successTrackId, machineSuggestionId, offset, max)

List info on Software Group - Suggestions Field Notices

Returns field notice information, including ID number, title, and publish date.

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String successTrackId = "successTrackId_example"; // String | 
    String machineSuggestionId = "machineSuggestionId_example"; // String | 
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    try {
      SoftwareGroupFieldNoticesResponse result = apiInstance.getSoftwareGroupFieldNotices(customerId, successTrackId, machineSuggestionId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getSoftwareGroupFieldNotices");
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
| **customerId** | **String**| Unique identifier of the customer | |
| **successTrackId** | **String**|  | |
| **machineSuggestionId** | **String**|  | |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |

### Return type

[**SoftwareGroupFieldNoticesResponse**](SoftwareGroupFieldNoticesResponse.md)

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

<a id="getSoftwareGroupSecurityAdvisories"></a>
# **getSoftwareGroupSecurityAdvisories**
> SoftwareGroupFieldNoticesResponse getSoftwareGroupSecurityAdvisories(customerId, successTrackId, machineSuggestionId, offset, max)

List info on Software Group - Suggestions Security Advisories

Returns software advisory information, including ID number, version number, and severity level.

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String successTrackId = "successTrackId_example"; // String | 
    String machineSuggestionId = "machineSuggestionId_example"; // String | 
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    try {
      SoftwareGroupFieldNoticesResponse result = apiInstance.getSoftwareGroupSecurityAdvisories(customerId, successTrackId, machineSuggestionId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getSoftwareGroupSecurityAdvisories");
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
| **customerId** | **String**| Unique identifier of the customer | |
| **successTrackId** | **String**|  | |
| **machineSuggestionId** | **String**|  | |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |

### Return type

[**SoftwareGroupFieldNoticesResponse**](SoftwareGroupFieldNoticesResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSoftwareGroupSuggestions"></a>
# **getSoftwareGroupSuggestions**
> SoftwareGroupSuggestions getSoftwareGroupSuggestions(successTrackId, customerId, suggestionId)

List Software Group Suggestions

Returns Software Group suggestions, including detailed information about Cisco software release recommendations and current Cisco software releases running on assets in the Software Group

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String suggestionId = "suggestionId_example"; // String | 
    try {
      SoftwareGroupSuggestions result = apiInstance.getSoftwareGroupSuggestions(successTrackId, customerId, suggestionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getSoftwareGroupSuggestions");
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
| **suggestionId** | **String**|  | |

### Return type

[**SoftwareGroupSuggestions**](SoftwareGroupSuggestions.md)

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

<a id="getSoftwareGroupSuggestionsBugs"></a>
# **getSoftwareGroupSuggestionsBugs**
> SoftwareGroupBugsResponse getSoftwareGroupSuggestionsBugs(customerId, successTrackId, machineSuggestionId, offset, max)

List info on Software Group - Suggestions Bugs

Returns information on bugs, including ID, description, and affected software releases.

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String successTrackId = "successTrackId_example"; // String | 
    String machineSuggestionId = "machineSuggestionId_example"; // String | 
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    try {
      SoftwareGroupBugsResponse result = apiInstance.getSoftwareGroupSuggestionsBugs(customerId, successTrackId, machineSuggestionId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getSoftwareGroupSuggestionsBugs");
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
| **customerId** | **String**| Unique identifier of the customer | |
| **successTrackId** | **String**|  | |
| **machineSuggestionId** | **String**|  | |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |

### Return type

[**SoftwareGroupBugsResponse**](SoftwareGroupBugsResponse.md)

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

<a id="getSoftwareGroups"></a>
# **getSoftwareGroups**
> SoftwareGroupResponse getSoftwareGroups(successTrackId, customerId, max, offset)

fetch Software Group Information

Returns Software Group information for the customerId provided

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    try {
      SoftwareGroupResponse result = apiInstance.getSoftwareGroups(successTrackId, customerId, max, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getSoftwareGroups");
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
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |

### Return type

[**SoftwareGroupResponse**](SoftwareGroupResponse.md)

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

