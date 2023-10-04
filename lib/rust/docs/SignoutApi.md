# \SignoutApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**signout**](SignoutApi.md#signout) | **POST** /api/v1/auth/authenticated/logout | 



## signout

> crate::models::AuthResponse signout(signout_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**signout_request** | [**SignoutRequest**](SignoutRequest.md) |  | [required] |

### Return type

[**crate::models::AuthResponse**](AuthResponse.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

