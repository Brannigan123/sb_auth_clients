# \ValidateEmailVerificationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validate_email_verification**](ValidateEmailVerificationApi.md#validate_email_verification) | **POST** /api/v1/auth/public/validate-email-verification | 



## validate_email_verification

> crate::models::AuthResponse validate_email_verification(email_confirmation_otp_submit_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**email_confirmation_otp_submit_request** | [**EmailConfirmationOtpSubmitRequest**](EmailConfirmationOtpSubmitRequest.md) |  | [required] |

### Return type

[**crate::models::AuthResponse**](AuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

