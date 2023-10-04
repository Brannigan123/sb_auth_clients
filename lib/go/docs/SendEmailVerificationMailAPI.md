# \SendEmailVerificationMailAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SendVerificationEmail**](SendEmailVerificationMailAPI.md#SendVerificationEmail) | **Post** /api/v1/auth/authenticated/send-email-verification-mail | 



## SendVerificationEmail

> ApiResponse SendVerificationEmail(ctx).Execute()



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

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.SendEmailVerificationMailAPI.SendVerificationEmail(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SendEmailVerificationMailAPI.SendVerificationEmail``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SendVerificationEmail`: ApiResponse
    fmt.Fprintf(os.Stdout, "Response from `SendEmailVerificationMailAPI.SendVerificationEmail`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiSendVerificationEmailRequest struct via the builder pattern


### Return type

[**ApiResponse**](ApiResponse.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

