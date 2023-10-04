# \AuthenticateAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Authenticate**](AuthenticateAPI.md#Authenticate) | **Post** /api/v1/auth/public/authenticate | 



## Authenticate

> SigninResponse Authenticate(ctx).SigninRequest(signinRequest).Execute()



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
    signinRequest := *openapiclient.NewSigninRequest() // SigninRequest | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AuthenticateAPI.Authenticate(context.Background()).SigninRequest(signinRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticateAPI.Authenticate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Authenticate`: SigninResponse
    fmt.Fprintf(os.Stdout, "Response from `AuthenticateAPI.Authenticate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAuthenticateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signinRequest** | [**SigninRequest**](SigninRequest.md) |  | 

### Return type

[**SigninResponse**](SigninResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

