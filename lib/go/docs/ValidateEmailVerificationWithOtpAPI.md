# \ValidateEmailVerificationWithOtpAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ValilidateEmailVerificationOtp**](ValidateEmailVerificationWithOtpAPI.md#ValilidateEmailVerificationOtp) | **Post** /api/v1/auth/public/validate-email-verification-otp | 



## ValilidateEmailVerificationOtp

> AuthResponse ValilidateEmailVerificationOtp(ctx).EmailConfirmationOtpSubmitRequest(emailConfirmationOtpSubmitRequest).Execute()



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
    emailConfirmationOtpSubmitRequest := *openapiclient.NewEmailConfirmationOtpSubmitRequest() // EmailConfirmationOtpSubmitRequest | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ValidateEmailVerificationWithOtpAPI.ValilidateEmailVerificationOtp(context.Background()).EmailConfirmationOtpSubmitRequest(emailConfirmationOtpSubmitRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ValidateEmailVerificationWithOtpAPI.ValilidateEmailVerificationOtp``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ValilidateEmailVerificationOtp`: AuthResponse
    fmt.Fprintf(os.Stdout, "Response from `ValidateEmailVerificationWithOtpAPI.ValilidateEmailVerificationOtp`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiValilidateEmailVerificationOtpRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailConfirmationOtpSubmitRequest** | [**EmailConfirmationOtpSubmitRequest**](EmailConfirmationOtpSubmitRequest.md) |  | 

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

