# RegisterApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**register**](RegisterApi.md#register) | **POST** /api/v1/auth/public/register |  |



## register

> SignupResponse register(signupRequest)



### Example

```java
// Import classes:
import com.bran.auth.client.ApiClient;
import com.bran.auth.client.ApiException;
import com.bran.auth.client.Configuration;
import com.bran.auth.client.models.*;
import com.bran.auth.client.api.RegisterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RegisterApi apiInstance = new RegisterApi(defaultClient);
        SignupRequest signupRequest = new SignupRequest(); // SignupRequest | 
        try {
            SignupResponse result = apiInstance.register(signupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegisterApi#register");
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
| **signupRequest** | [**SignupRequest**](SignupRequest.md)|  | |

### Return type

[**SignupResponse**](SignupResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |

