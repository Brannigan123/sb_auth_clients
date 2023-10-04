# \SendCustomEmailVerificationAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RequestOtp**](SendCustomEmailVerificationAPI.md#RequestOtp) | **Post** /api/v1/auth/public/request-otp | 



## RequestOtp

> OtpRequestResponse RequestOtp(ctx).OtpRequest(otpRequest).Execute()



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
    resp, r, err := apiClient.SendCustomEmailVerificationAPI.RequestOtp(context.Background()).OtpRequest(otpRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SendCustomEmailVerificationAPI.RequestOtp``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RequestOtp`: OtpRequestResponse
    fmt.Fprintf(os.Stdout, "Response from `SendCustomEmailVerificationAPI.RequestOtp`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRequestOtpRequest struct via the builder pattern


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

