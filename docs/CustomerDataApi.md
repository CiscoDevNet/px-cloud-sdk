# CustomerDataApi

All URIs are relative to *https://api-cx.cisco.com/sandbox/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCustomers**](CustomerDataApi.md#getCustomers) | **GET** /v1/customers | List customers |
| [**getReportStatus**](CustomerDataApi.md#getReportStatus) | **GET** /v1/customers/{customerId}/reports/{reportId} | Get report status and location |
| [**postReports**](CustomerDataApi.md#postReports) | **POST** /v1/customers/{customerId}/reports | Request customer data report |


<a id="getCustomers"></a>
# **getCustomers**
> CustomerResponse getCustomers(max, offset)

List customers

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CustomerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomerDataApi apiInstance = new CustomerDataApi(defaultClient);
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    try {
      CustomerResponse result = apiInstance.getCustomers(max, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerDataApi#getCustomers");
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
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Link - URLs for previous (&#x60;rel&#x3D;\&quot;prev\&quot;&#x60;) and/or next (&#x60;rel&#x3D;\&quot;next\&quot;&#x60;) page of items <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Service Unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="getReportStatus"></a>
# **getReportStatus**
> ReportStatus getReportStatus(customerId, reportId)

Get report status and location

If report is in-progress (&#x60;200 OK&#x60;), body will include status description and suggested poll/retry interval.  If ready (&#x60;303 See Other&#x60;), &#x60;Location&#x60; header will contain the final report download URL.

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CustomerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomerDataApi apiInstance = new CustomerDataApi(defaultClient);
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String reportId = "reportId_example"; // String | reportId returned by a report generation request.
    try {
      ReportStatus result = apiInstance.getReportStatus(customerId, reportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerDataApi#getReportStatus");
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
| **reportId** | **String**| reportId returned by a report generation request. | |

### Return type

[**ReportStatus**](ReportStatus.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **303** | See Other |  * Location - Final report download URL. <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Service Unavailable |  -  |
| **504** | Gateway timeout |  -  |

<a id="postReports"></a>
# **postReports**
> postReports(customerId, report)

Request customer data report

Report generation is asynchronous. The response &#x60;Location&#x60; header will contain the report status URL.

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CustomerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomerDataApi apiInstance = new CustomerDataApi(defaultClient);
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    Report report = new Report(); // Report | Report request details.
    try {
      apiInstance.postReports(customerId, report);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerDataApi#postReports");
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
| **report** | [**Report**](Report.md)| Report request details. | [optional] |

### Return type

null (empty response body)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Location - Final report download URL. <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |
| **503** | Service Unavailable |  -  |
| **504** | Gateway timeout |  -  |

