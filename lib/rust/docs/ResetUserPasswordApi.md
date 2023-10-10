# \ResetUserPasswordApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reset_user_password**](ResetUserPasswordApi.md#reset_user_password) | **POST** /api/v1/auth/public/reset-password | 



## reset_user_password

> crate::models::AuthResponse reset_user_password(reset_user_password_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**reset_user_password_request** | [**ResetUserPasswordRequest**](ResetUserPasswordRequest.md) |  | [required] |

### Return type

[**crate::models::AuthResponse**](AuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

