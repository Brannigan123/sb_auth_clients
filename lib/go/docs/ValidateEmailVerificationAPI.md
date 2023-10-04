# \ValidateEmailVerificationAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ValidateEmailVerification**](ValidateEmailVerificationAPI.md#ValidateEmailVerification) | **Post** /api/v1/auth/public/validate-email-verification | 



## ValidateEmailVerification

> ApiResponse ValidateEmailVerification(ctx).EmailConfirmationOtpSubmitRequest(emailConfirmationOtpSubmitRequest).Execute()



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
    resp, r, err := apiClient.ValidateEmailVerificationAPI.ValidateEmailVerification(context.Background()).EmailConfirmationOtpSubmitRequest(emailConfirmationOtpSubmitRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ValidateEmailVerificationAPI.ValidateEmailVerification``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ValidateEmailVerification`: ApiResponse
    fmt.Fprintf(os.Stdout, "Response from `ValidateEmailVerificationAPI.ValidateEmailVerification`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiValidateEmailVerificationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailConfirmationOtpSubmitRequest** | [**EmailConfirmationOtpSubmitRequest**](EmailConfirmationOtpSubmitRequest.md) |  | 

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

