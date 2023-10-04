# ValidateEmailVerificationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**validateEmailVerification**](ValidateEmailVerificationApi.md#validateEmailVerification) | **POST** /api/v1/auth/public/validate-email-verification |  |



## validateEmailVerification

> ModelApiResponse validateEmailVerification(emailConfirmationOtpSubmitRequest)



### Example

```java
// Import classes:
import com.bran.auth.client.ApiClient;
import com.bran.auth.client.ApiException;
import com.bran.auth.client.Configuration;
import com.bran.auth.client.models.*;
import com.bran.auth.client.api.ValidateEmailVerificationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ValidateEmailVerificationApi apiInstance = new ValidateEmailVerificationApi(defaultClient);
        EmailConfirmationOtpSubmitRequest emailConfirmationOtpSubmitRequest = new EmailConfirmationOtpSubmitRequest(); // EmailConfirmationOtpSubmitRequest | 
        try {
            ModelApiResponse result = apiInstance.validateEmailVerification(emailConfirmationOtpSubmitRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ValidateEmailVerificationApi#validateEmailVerification");
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
| **emailConfirmationOtpSubmitRequest** | [**EmailConfirmationOtpSubmitRequest**](EmailConfirmationOtpSubmitRequest.md)|  | |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |

