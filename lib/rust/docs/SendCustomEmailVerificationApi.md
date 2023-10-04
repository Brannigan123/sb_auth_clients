# \SendCustomEmailVerificationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**request_otp**](SendCustomEmailVerificationApi.md#request_otp) | **POST** /api/v1/auth/public/request-otp | 



## request_otp

> crate::models::OtpRequestResponse request_otp(otp_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**otp_request** | [**OtpRequest**](OtpRequest.md) |  | [required] |

### Return type

[**crate::models::OtpRequestResponse**](OtpRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

