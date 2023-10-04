# \AuthenticateApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](AuthenticateApi.md#authenticate) | **POST** /api/v1/auth/public/authenticate | 



## authenticate

> crate::models::SigninResponse authenticate(signin_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**signin_request** | [**SigninRequest**](SigninRequest.md) |  | [required] |

### Return type

[**crate::models::SigninResponse**](SigninResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

