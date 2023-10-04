# \RefreshTokenAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RefeshToken**](RefreshTokenAPI.md#RefeshToken) | **Post** /api/v1/auth/public/refresh-token | 



## RefeshToken

> TokenRefreshResponse RefeshToken(ctx).TokenRefreshRequest(tokenRefreshRequest).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
    tokenRefreshRequest := *openapiclient.NewTokenRefreshRequest() // TokenRefreshRequest | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.RefreshTokenAPI.RefeshToken(context.Background()).TokenRefreshRequest(tokenRefreshRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `RefreshTokenAPI.RefeshToken``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RefeshToken`: TokenRefreshResponse
    fmt.Fprintf(os.Stdout, "Response from `RefreshTokenAPI.RefeshToken`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRefeshTokenRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenRefreshRequest** | [**TokenRefreshRequest**](TokenRefreshRequest.md) |  | 

### Return type

[**TokenRefreshResponse**](TokenRefreshResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

