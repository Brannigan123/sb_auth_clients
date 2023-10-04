# \SignoutAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Signout**](SignoutAPI.md#Signout) | **Post** /api/v1/auth/authenticated/logout | 



## Signout

> ApiResponse Signout(ctx).SignoutRequest(signoutRequest).Execute()



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
    signoutRequest := *openapiclient.NewSignoutRequest() // SignoutRequest | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SignoutAPI.Signout(context.Background()).SignoutRequest(signoutRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SignoutAPI.Signout``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Signout`: ApiResponse
    fmt.Fprintf(os.Stdout, "Response from `SignoutAPI.Signout`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSignoutRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signoutRequest** | [**SignoutRequest**](SignoutRequest.md) |  | 

### Return type

[**ApiResponse**](ApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

