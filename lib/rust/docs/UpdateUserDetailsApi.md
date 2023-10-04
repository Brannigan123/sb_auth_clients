# \UpdateUserDetailsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**update_user_details**](UpdateUserDetailsApi.md#update_user_details) | **POST** /api/v1/auth/authenticated/update-user-details | 



## update_user_details

> crate::models::AuthResponse update_user_details(user_details_update_request)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**user_details_update_request** | [**UserDetailsUpdateRequest**](UserDetailsUpdateRequest.md) |  | [required] |

### Return type

[**crate::models::AuthResponse**](AuthResponse.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

