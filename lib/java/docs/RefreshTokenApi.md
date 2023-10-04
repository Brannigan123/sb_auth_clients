# RefreshTokenApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**refeshToken**](RefreshTokenApi.md#refeshToken) | **POST** /api/v1/auth/public/refresh-token |  |



## refeshToken

> AuthResponse refeshToken(tokenRefreshRequest)



### Example

```java
// Import classes:
import com.bran.auth.client.ApiClient;
import com.bran.auth.client.ApiException;
import com.bran.auth.client.Configuration;
import com.bran.auth.client.models.*;
import com.bran.auth.client.api.RefreshTokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RefreshTokenApi apiInstance = new RefreshTokenApi(defaultClient);
        TokenRefreshRequest tokenRefreshRequest = new TokenRefreshRequest(); // TokenRefreshRequest | 
        try {
            AuthResponse result = apiInstance.refeshToken(tokenRefreshRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefreshTokenApi#refeshToken");
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
| **tokenRefreshRequest** | [**TokenRefreshRequest**](TokenRefreshRequest.md)|  | |

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

