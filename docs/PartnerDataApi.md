# PartnerDataApi

All URIs are relative to *https://api-cx.cisco.com/sandbox/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getContractDetails**](PartnerDataApi.md#getContractDetails) | **GET** /v1/contract/details | Get customer contract details |
| [**getContractLicenses**](PartnerDataApi.md#getContractLicenses) | **GET** /v1/contract/licenses | List of Licenses for the selected Contract |
| [**getContracts**](PartnerDataApi.md#getContracts) | **GET** /v1/contracts | List customer contracts |
| [**getContractsWithCustomers**](PartnerDataApi.md#getContractsWithCustomers) | **GET** /v1/contractsWithCustomers | List contracts with customer details |
| [**getPartnerOffers**](PartnerDataApi.md#getPartnerOffers) | **GET** /v1/partnerOffers | List partner offers |
| [**getPartnerOffersSessions**](PartnerDataApi.md#getPartnerOffersSessions) | **GET** /v1/partnerOffersSessions | Get partner offers session details |
| [**getUniqueContractsWithCustomers**](PartnerDataApi.md#getUniqueContractsWithCustomers) | **GET** /v1/uniqueContractsWithCustomers | List of Unique Contracts With Customers |


<a id="getContractDetails"></a>
# **getContractDetails**
> ContractDetailsResponse getContractDetails(contractNumber, successTrackId, max, offset, componentType, contractLineItemType, customerId)

Get customer contract details

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.PartnerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartnerDataApi apiInstance = new PartnerDataApi(defaultClient);
    Integer contractNumber = 56; // Integer | 
    String successTrackId = "successTrackId_example"; // String | 
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    String componentType = "componentType_example"; // String | Deprecated, use `contractLineItemType`.
    String contractLineItemType = "PARENT"; // String | 
    String customerId = "customerId_example"; // String | 
    try {
      ContractDetailsResponse result = apiInstance.getContractDetails(contractNumber, successTrackId, max, offset, componentType, contractLineItemType, customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerDataApi#getContractDetails");
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
| **contractNumber** | **Integer**|  | |
| **successTrackId** | **String**|  | |
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **componentType** | **String**| Deprecated, use &#x60;contractLineItemType&#x60;. | [optional] |
| **contractLineItemType** | **String**|  | [optional] [enum: PARENT, CHILD, STANDALONE] |
| **customerId** | **String**|  | [optional] |

### Return type

[**ContractDetailsResponse**](ContractDetailsResponse.md)

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

<a id="getContractLicenses"></a>
# **getContractLicenses**
> LicensesPaginationResponse getContractLicenses(contractNumber, max, offset)

List of Licenses for the selected Contract

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.PartnerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartnerDataApi apiInstance = new PartnerDataApi(defaultClient);
    String contractNumber = "contractNumber_example"; // String | contractNumber
    Integer max = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      LicensesPaginationResponse result = apiInstance.getContractLicenses(contractNumber, max, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerDataApi#getContractLicenses");
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
| **contractNumber** | **String**| contractNumber | |
| **max** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |

### Return type

[**LicensesPaginationResponse**](LicensesPaginationResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully Fetched Contract Details |  -  |
| **400** | Bad Input |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Entity Not Found |  -  |
| **500** | Error during fetch |  -  |

<a id="getContracts"></a>
# **getContracts**
> ContractResponse getContracts(max, offset)

List customer contracts

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.PartnerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartnerDataApi apiInstance = new PartnerDataApi(defaultClient);
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    try {
      ContractResponse result = apiInstance.getContracts(max, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerDataApi#getContracts");
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

[**ContractResponse**](ContractResponse.md)

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

<a id="getContractsWithCustomers"></a>
# **getContractsWithCustomers**
> ContractsV2Response getContractsWithCustomers(successTrackId, max, offset, customerGUName, customerId)

List contracts with customer details

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.PartnerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartnerDataApi apiInstance = new PartnerDataApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    String customerGUName = "customerGUName_example"; // String | customerGUName
    String customerId = "customerId_example"; // String | 
    try {
      ContractsV2Response result = apiInstance.getContractsWithCustomers(successTrackId, max, offset, customerGUName, customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerDataApi#getContractsWithCustomers");
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
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **customerGUName** | **String**| customerGUName | [optional] |
| **customerId** | **String**|  | [optional] |

### Return type

[**ContractsV2Response**](ContractsV2Response.md)

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

<a id="getPartnerOffers"></a>
# **getPartnerOffers**
> PartnerAssetResponse getPartnerOffers(successTrackId, max, offset, customerId, offerStatus, offerType)

List partner offers

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.PartnerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartnerDataApi apiInstance = new PartnerDataApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    String customerId = "customerId_example"; // String | 
    String offerStatus = "Idle"; // String | 
    String offerType = "Accelerator"; // String | 
    try {
      PartnerAssetResponse result = apiInstance.getPartnerOffers(successTrackId, max, offset, customerId, offerStatus, offerType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerDataApi#getPartnerOffers");
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
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **customerId** | **String**|  | [optional] |
| **offerStatus** | **String**|  | [optional] [enum: Idle, Published, Unpublished] |
| **offerType** | **String**|  | [optional] [enum: Accelerator, Ask the Experts] |

### Return type

[**PartnerAssetResponse**](PartnerAssetResponse.md)

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

<a id="getPartnerOffersSessions"></a>
# **getPartnerOffersSessions**
> PartnerOfferWithSessions getPartnerOffersSessions(successTrackId, max, offset, customerId, offerId, offerStatus, offerType)

Get partner offers session details

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.PartnerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartnerDataApi apiInstance = new PartnerDataApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    String customerId = "customerId_example"; // String | 
    String offerId = "offerId_example"; // String | 
    String offerStatus = "Idle"; // String | 
    String offerType = "Accelerator"; // String | 
    try {
      PartnerOfferWithSessions result = apiInstance.getPartnerOffersSessions(successTrackId, max, offset, customerId, offerId, offerStatus, offerType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerDataApi#getPartnerOffersSessions");
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
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **customerId** | **String**|  | [optional] |
| **offerId** | **String**|  | [optional] |
| **offerStatus** | **String**|  | [optional] [enum: Idle, Published, Unpublished] |
| **offerType** | **String**|  | [optional] [enum: Accelerator, Ask the Experts] |

### Return type

[**PartnerOfferWithSessions**](PartnerOfferWithSessions.md)

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

<a id="getUniqueContractsWithCustomers"></a>
# **getUniqueContractsWithCustomers**
> UniqueContractsResponse getUniqueContractsWithCustomers(max, offset, customerId, customerGUName, successTrackId)

List of Unique Contracts With Customers

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.PartnerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/sandbox/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartnerDataApi apiInstance = new PartnerDataApi(defaultClient);
    Integer max = 56; // Integer | 
    Integer offset = 56; // Integer | 
    String customerId = "customerId_example"; // String | customerId
    String customerGUName = "customerGUName_example"; // String | customerGUName
    Long successTrackId = 56L; // Long | successTrackId
    try {
      UniqueContractsResponse result = apiInstance.getUniqueContractsWithCustomers(max, offset, customerId, customerGUName, successTrackId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerDataApi#getUniqueContractsWithCustomers");
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
| **max** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |
| **customerId** | **String**| customerId | [optional] |
| **customerGUName** | **String**| customerGUName | [optional] |
| **successTrackId** | **Long**| successTrackId | [optional] |

### Return type

[**UniqueContractsResponse**](UniqueContractsResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully Fetched Contract Details |  -  |
| **400** | Bad Input |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Entity Not Found |  -  |
| **500** | Error during fetch |  -  |

