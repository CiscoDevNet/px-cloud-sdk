# CxMetaDataApi

All URIs are relative to *https://api-cx.cisco.com/sandbox/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSuccessTracks**](CxMetaDataApi.md#getSuccessTracks) | **GET** /v1/successTracks | List success tracks |


<a id="getSuccessTracks"></a>
# **getSuccessTracks**
> SuccessTracksResponse getSuccessTracks()

List success tracks

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CxMetaDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CxMetaDataApi apiInstance = new CxMetaDataApi(defaultClient);
    try {
      SuccessTracksResponse result = apiInstance.getSuccessTracks();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CxMetaDataApi#getSuccessTracks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SuccessTracksResponse**](SuccessTracksResponse.md)

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

