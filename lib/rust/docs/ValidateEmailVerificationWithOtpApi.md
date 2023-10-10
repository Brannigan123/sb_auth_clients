# \ValidateEmailVerificationWithOtpApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**valilidate_email_verification_otp**](ValidateEmailVerificationWithOtpApi.md#valilidate_email_verification_otp) | **POST** /api/v1/auth/public/validate-email-verification-otp | 



## valilidate_email_verification_otp

> crate::models::AuthResponse valilidate_email_verification_otp(email_confirmation_otp_submit_request)


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

