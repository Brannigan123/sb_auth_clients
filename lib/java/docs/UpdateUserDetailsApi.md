# UpdateUserDetailsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateUserDetails**](UpdateUserDetailsApi.md#updateUserDetails) | **POST** /api/v1/auth/authenticated/update-user-details |  |



## updateUserDetails

> ModelApiResponse updateUserDetails(userDetailsUpdateRequest)



### Example

```java
// Import classes:
import com.bran.auth.client.ApiClient;
import com.bran.auth.client.ApiException;
import com.bran.auth.client.Configuration;
import com.bran.auth.client.models.*;
import com.bran.auth.client.api.UpdateUserDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UpdateUserDetailsApi apiInstance = new UpdateUserDetailsApi(defaultClient);
        UserDetailsUpdateRequest userDetailsUpdateRequest = new UserDetailsUpdateRequest(); // UserDetailsUpdateRequest | 
        try {
            ModelApiResponse result = apiInstance.updateUserDetails(userDetailsUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UpdateUserDetailsApi#updateUserDetails");
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
| **userDetailsUpdateRequest** | [**UserDetailsUpdateRequest**](UserDetailsUpdateRequest.md)|  | |

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

