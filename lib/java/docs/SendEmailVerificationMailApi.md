# SendEmailVerificationMailApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sendVerificationEmail**](SendEmailVerificationMailApi.md#sendVerificationEmail) | **POST** /api/v1/auth/authenticated/send-email-verification-mail |  |



## sendVerificationEmail

> ModelApiResponse sendVerificationEmail()



### Example

```java
// Import classes:
import com.bran.auth.client.ApiClient;
import com.bran.auth.client.ApiException;
import com.bran.auth.client.Configuration;
import com.bran.auth.client.auth.*;
import com.bran.auth.client.models.*;
import com.bran.auth.client.api.SendEmailVerificationMailApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: Authentication
        HttpBearerAuth Authentication = (HttpBearerAuth) defaultClient.getAuthentication("Authentication");
        Authentication.setBearerToken("BEARER TOKEN");

        SendEmailVerificationMailApi apiInstance = new SendEmailVerificationMailApi(defaultClient);
        try {
            ModelApiResponse result = apiInstance.sendVerificationEmail();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendEmailVerificationMailApi#sendVerificationEmail");
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

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |

