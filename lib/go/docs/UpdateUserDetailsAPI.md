# \UpdateUserDetailsAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UpdateUserDetails**](UpdateUserDetailsAPI.md#UpdateUserDetails) | **Post** /api/v1/auth/authenticated/update-user-details | 



## UpdateUserDetails

> AuthResponse UpdateUserDetails(ctx).UserDetailsUpdateRequest(userDetailsUpdateRequest).Execute()



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
    userDetailsUpdateRequest := *openapiclient.NewUserDetailsUpdateRequest() // UserDetailsUpdateRequest | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UpdateUserDetailsAPI.UpdateUserDetails(context.Background()).UserDetailsUpdateRequest(userDetailsUpdateRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UpdateUserDetailsAPI.UpdateUserDetails``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateUserDetails`: AuthResponse
    fmt.Fprintf(os.Stdout, "Response from `UpdateUserDetailsAPI.UpdateUserDetails`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUpdateUserDetailsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userDetailsUpdateRequest** | [**UserDetailsUpdateRequest**](UserDetailsUpdateRequest.md) |  | 

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

