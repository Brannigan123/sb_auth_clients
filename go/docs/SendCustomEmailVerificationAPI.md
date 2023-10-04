# \SendCustomEmailVerificationAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PostMethodName**](SendCustomEmailVerificationAPI.md#PostMethodName) | **Post** /api/v1/auth/public/request-otp | 



## PostMethodName

> OtpRequestResponse PostMethodName(ctx).OtpRequest(otpRequest).Execute()



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
    otpRequest := *openapiclient.NewOtpRequest() // OtpRequest | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SendCustomEmailVerificationAPI.PostMethodName(context.Background()).OtpRequest(otpRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SendCustomEmailVerificationAPI.PostMethodName``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PostMethodName`: OtpRequestResponse
    fmt.Fprintf(os.Stdout, "Response from `SendCustomEmailVerificationAPI.PostMethodName`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostMethodNameRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **otpRequest** | [**OtpRequest**](OtpRequest.md) |  | 

### Return type

[**OtpRequestResponse**](OtpRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

