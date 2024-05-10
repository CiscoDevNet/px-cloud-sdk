# FaultsApi

All URIs are relative to *https://api-cx.cisco.com/sandbox/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFaultAffectedAssets**](FaultsApi.md#getFaultAffectedAssets) | **GET** /v1/customers/{customerId}/insights/faults/{faultId}/affectedAssets | Affected Assets |
| [**getFaultHistory**](FaultsApi.md#getFaultHistory) | **GET** /v1/customers/{customerId}/insights/faults/{faultId}/affectedAssets/{assetName}/faultHistory | Fetch Assets Fault History |
| [**getFaultSummary**](FaultsApi.md#getFaultSummary) | **GET** /v1/customers/{customerId}/insights/faults/{faultId}/summary | Fault summary |
| [**getFaults**](FaultsApi.md#getFaults) | **GET** /v1/customers/{customerId}/insights/faults | Faults details |


<a id="getFaultAffectedAssets"></a>
# **getFaultAffectedAssets**
> AffectedAssetsResponse getFaultAffectedAssets(successTrackId, customerId, faultId, days, offset, max)

Affected Assets

Returns information about the customer assets affected by the fault, based on the fault signatureId and customerId provided

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.FaultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    FaultsApi apiInstance = new FaultsApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    Integer faultId = 56; // Integer | Unique identifier used in CX Cloud to identify the fault
    Integer days = 1; // Integer | The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1.
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    try {
      AffectedAssetsResponse result = apiInstance.getFaultAffectedAssets(successTrackId, customerId, faultId, days, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FaultsApi#getFaultAffectedAssets");
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
| **faultId** | **Integer**| Unique identifier used in CX Cloud to identify the fault | |
| **days** | **Integer**| The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. | [optional] [default to 1] |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |

### Return type

[**AffectedAssetsResponse**](AffectedAssetsResponse.md)

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

<a id="getFaultHistory"></a>
# **getFaultHistory**
> AssetsFaultHistoryResponse getFaultHistory(successTrackId, customerId, faultId, assetName, days)

Fetch Assets Fault History

Returns information about the occurrences of a fault on an asset based on the fault signatureId, asset name, and customerId provided

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.FaultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    FaultsApi apiInstance = new FaultsApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    Integer faultId = 56; // Integer | Unique identifier used in CX Cloud to identify the fault
    String assetName = "assetName_example"; // String | Unique asset name
    Integer days = 1; // Integer | The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1.
    try {
      AssetsFaultHistoryResponse result = apiInstance.getFaultHistory(successTrackId, customerId, faultId, assetName, days);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FaultsApi#getFaultHistory");
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
| **faultId** | **Integer**| Unique identifier used in CX Cloud to identify the fault | |
| **assetName** | **String**| Unique asset name | |
| **days** | **Integer**| The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. | [optional] [default to 1] |

### Return type

[**AssetsFaultHistoryResponse**](AssetsFaultHistoryResponse.md)

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

<a id="getFaultSummary"></a>
# **getFaultSummary**
> FaultsSummaryResponse getFaultSummary(successTrackId, customerId, faultId)

Fault summary

Returns detailed information for a fault based on the fault signatureId and customerId provided

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.FaultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    FaultsApi apiInstance = new FaultsApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    Integer faultId = 56; // Integer | Unique identifier used in CX Cloud to identify the fault
    try {
      FaultsSummaryResponse result = apiInstance.getFaultSummary(successTrackId, customerId, faultId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FaultsApi#getFaultSummary");
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
| **faultId** | **Integer**| Unique identifier used in CX Cloud to identify the fault | |

### Return type

[**FaultsSummaryResponse**](FaultsSummaryResponse.md)

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

<a id="getFaults"></a>
# **getFaults**
> FaultsResponse getFaults(successTrackId, customerId, days, max, offset)

Faults details

Returns fault information for the customerId provided.

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.FaultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    FaultsApi apiInstance = new FaultsApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    Integer days = 1; // Integer | The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1.
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    try {
      FaultsResponse result = apiInstance.getFaults(successTrackId, customerId, days, max, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FaultsApi#getFaults");
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
| **days** | **Integer**| The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. | [optional] [default to 1] |
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |

### Return type

[**FaultsResponse**](FaultsResponse.md)

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

