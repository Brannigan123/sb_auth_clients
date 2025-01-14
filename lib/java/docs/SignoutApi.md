# SignoutApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**signout**](SignoutApi.md#signout) | **POST** /api/v1/auth/authenticated/logout |  |



## signout

> AuthResponse signout(signoutRequest)



### Example

```java
// Import classes:
import com.bran.auth.client.ApiClient;
import com.bran.auth.client.ApiException;
import com.bran.auth.client.Configuration;
import com.bran.auth.client.auth.*;
import com.bran.auth.client.models.*;
import com.bran.auth.client.api.SignoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: Authentication
        HttpBearerAuth Authentication = (HttpBearerAuth) defaultClient.getAuthentication("Authentication");
        Authentication.setBearerToken("BEARER TOKEN");

        SignoutApi apiInstance = new SignoutApi(defaultClient);
        SignoutRequest signoutRequest = new SignoutRequest(); // SignoutRequest | 
        try {
            AuthResponse result = apiInstance.signout(signoutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SignoutApi#signout");
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
| **signoutRequest** | [**SignoutRequest**](SignoutRequest.md)|  | |

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |

