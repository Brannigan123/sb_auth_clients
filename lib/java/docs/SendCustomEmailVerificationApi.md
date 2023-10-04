# SendCustomEmailVerificationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**requestOtp**](SendCustomEmailVerificationApi.md#requestOtp) | **POST** /api/v1/auth/public/request-otp |  |



## requestOtp

> OtpRequestResponse requestOtp(otpRequest)



### Example

```java
// Import classes:
import com.bran.auth.client.ApiClient;
import com.bran.auth.client.ApiException;
import com.bran.auth.client.Configuration;
import com.bran.auth.client.models.*;
import com.bran.auth.client.api.SendCustomEmailVerificationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SendCustomEmailVerificationApi apiInstance = new SendCustomEmailVerificationApi(defaultClient);
        OtpRequest otpRequest = new OtpRequest(); // OtpRequest | 
        try {
            OtpRequestResponse result = apiInstance.requestOtp(otpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendCustomEmailVerificationApi#requestOtp");
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
| **otpRequest** | [**OtpRequest**](OtpRequest.md)|  | |

### Return type

[**OtpRequestResponse**](OtpRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |

