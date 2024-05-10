# CrashRiskApi

All URIs are relative to *https://api-cx.cisco.com/sandbox/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCrashAssetCrashHistory**](CrashRiskApi.md#getCrashAssetCrashHistory) | **GET** /v1/customers/{customerId}/insights/crashRisk/asset/{assetUniqueId}/crashHistory | List asset crash history incidents |
| [**getCrashRiskAssetRiskFactors**](CrashRiskApi.md#getCrashRiskAssetRiskFactors) | **GET** /v1/customers/{customerId}/insights/crashRisk/assets/{assetUniqueId}/riskFactors | List crash risk asset risk factors |
| [**getCrashRiskAssetSimilarAssets**](CrashRiskApi.md#getCrashRiskAssetSimilarAssets) | **GET** /v1/customers/{customerId}/insights/crashRisk/assets/{assetUniqueId}/similarAssets | List crash risk asset similar assets |
| [**getCrashRiskAssets**](CrashRiskApi.md#getCrashRiskAssets) | **GET** /v1/customers/{customerId}/insights/crashRisk/assets | List assets at risk of crashing |
| [**listCrashRiskAssetsCrashed**](CrashRiskApi.md#listCrashRiskAssetsCrashed) | **GET** /v1/customers/{customerId}/insights/crashRisk/assetsCrashed | List assets which have crashed |


<a id="getCrashAssetCrashHistory"></a>
# **getCrashAssetCrashHistory**
> DeviceCrashDetail getCrashAssetCrashHistory(customerId, assetUniqueId, successTrackId)

List asset crash history incidents

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CrashRiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CrashRiskApi apiInstance = new CrashRiskApi(defaultClient);
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String assetUniqueId = "assetUniqueId_example"; // String | assetId encoded as a Base64 string. This parameter is available as a response parameter of the /crashRisk/assets API
    String successTrackId = "successTrackId_example"; // String | 
    try {
      DeviceCrashDetail result = apiInstance.getCrashAssetCrashHistory(customerId, assetUniqueId, successTrackId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrashRiskApi#getCrashAssetCrashHistory");
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
| **assetUniqueId** | **String**| assetId encoded as a Base64 string. This parameter is available as a response parameter of the /crashRisk/assets API | |
| **successTrackId** | **String**|  | |

### Return type

[**DeviceCrashDetail**](DeviceCrashDetail.md)

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

<a id="getCrashRiskAssetRiskFactors"></a>
# **getCrashRiskAssetRiskFactors**
> DeviceRiskFactorsResponse getCrashRiskAssetRiskFactors(successTrackId, customerId, assetUniqueId)

List crash risk asset risk factors

List factors that contribute to an asset&#39;s crash risk score.

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CrashRiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CrashRiskApi apiInstance = new CrashRiskApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String assetUniqueId = "assetUniqueId_example"; // String | assetId encoded as a Base64 string. This parameter is available as a response parameter of the /crashRisk/assets API
    try {
      DeviceRiskFactorsResponse result = apiInstance.getCrashRiskAssetRiskFactors(successTrackId, customerId, assetUniqueId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrashRiskApi#getCrashRiskAssetRiskFactors");
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
| **assetUniqueId** | **String**| assetId encoded as a Base64 string. This parameter is available as a response parameter of the /crashRisk/assets API | |

### Return type

[**DeviceRiskFactorsResponse**](DeviceRiskFactorsResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Service Unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getCrashRiskAssetSimilarAssets"></a>
# **getCrashRiskAssetSimilarAssets**
> SimilarDevices getCrashRiskAssetSimilarAssets(customerId, assetUniqueId, successTrackId, similarityCriteria, max, offset)

List crash risk asset similar assets

List other devices in the network that are similar to a device in terms of features , product family, and hardware.

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CrashRiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CrashRiskApi apiInstance = new CrashRiskApi(defaultClient);
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String assetUniqueId = "assetUniqueId_example"; // String | assetId encoded as a Base64 string. This parameter is available as a response parameter of the /crashRisk/assets API
    String successTrackId = "successTrackId_example"; // String | 
    String similarityCriteria = "features"; // String | Criteria used to determine whether an asset is similar to the specified asset.
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    try {
      SimilarDevices result = apiInstance.getCrashRiskAssetSimilarAssets(customerId, assetUniqueId, successTrackId, similarityCriteria, max, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrashRiskApi#getCrashRiskAssetSimilarAssets");
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
| **assetUniqueId** | **String**| assetId encoded as a Base64 string. This parameter is available as a response parameter of the /crashRisk/assets API | |
| **successTrackId** | **String**|  | |
| **similarityCriteria** | **String**| Criteria used to determine whether an asset is similar to the specified asset. | [enum: features, fingerprint, software_features] |
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |

### Return type

[**SimilarDevices**](SimilarDevices.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Service Unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getCrashRiskAssets"></a>
# **getCrashRiskAssets**
> CrashRiskDevices getCrashRiskAssets(customerId, successTrackId, max, offset)

List assets at risk of crashing

List devices that have a probability of crash, including risk score rating (&#x60;High&#x60;, &#x60;Medium&#x60;, &#x60;Low&#x60;).

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CrashRiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CrashRiskApi apiInstance = new CrashRiskApi(defaultClient);
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String successTrackId = "successTrackId_example"; // String | 
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    try {
      CrashRiskDevices result = apiInstance.getCrashRiskAssets(customerId, successTrackId, max, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrashRiskApi#getCrashRiskAssets");
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
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |

### Return type

[**CrashRiskDevices**](CrashRiskDevices.md)

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

<a id="listCrashRiskAssetsCrashed"></a>
# **listCrashRiskAssetsCrashed**
> InventoryCrashDetails listCrashRiskAssetsCrashed(customerId, successTrackId, timePeriod)

List assets which have crashed

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CrashRiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CrashRiskApi apiInstance = new CrashRiskApi(defaultClient);
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String successTrackId = "successTrackId_example"; // String | 
    Integer timePeriod = 56; // Integer | Filter results by X number of days in the past - valid range 1-99.
    try {
      InventoryCrashDetails result = apiInstance.listCrashRiskAssetsCrashed(customerId, successTrackId, timePeriod);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrashRiskApi#listCrashRiskAssetsCrashed");
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
| **timePeriod** | **Integer**| Filter results by X number of days in the past - valid range 1-99. | [optional] |

### Return type

[**InventoryCrashDetails**](InventoryCrashDetails.md)

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

