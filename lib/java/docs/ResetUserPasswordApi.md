# ResetUserPasswordApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resetUserPassword**](ResetUserPasswordApi.md#resetUserPassword) | **POST** /api/v1/auth/public/reset-password |  |



## resetUserPassword

> AuthResponse resetUserPassword(resetUserPasswordRequest)



### Example

```java
// Import classes:
import com.bran.auth.client.ApiClient;
import com.bran.auth.client.ApiException;
import com.bran.auth.client.Configuration;
import com.bran.auth.client.models.*;
import com.bran.auth.client.api.ResetUserPasswordApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ResetUserPasswordApi apiInstance = new ResetUserPasswordApi(defaultClient);
        ResetUserPasswordRequest resetUserPasswordRequest = new ResetUserPasswordRequest(); // ResetUserPasswordRequest | 
        try {
            AuthResponse result = apiInstance.resetUserPassword(resetUserPasswordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResetUserPasswordApi#resetUserPassword");
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
| **resetUserPasswordRequest** | [**ResetUserPasswordRequest**](ResetUserPasswordRequest.md)|  | |

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |

