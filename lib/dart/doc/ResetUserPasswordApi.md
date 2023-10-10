# authclient.api.ResetUserPasswordApi

## Load the API package
```dart
import 'package:authclient/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resetUserPassword**](ResetUserPasswordApi.md#resetuserpassword) | **POST** /api/v1/auth/public/reset-password | 


# **resetUserPassword**
> AuthResponse resetUserPassword(resetUserPasswordRequest)



### Example
```dart
import 'package:authclient/api.dart';

final api_instance = ResetUserPasswordApi();
final resetUserPasswordRequest = ResetUserPasswordRequest(); // ResetUserPasswordRequest | 

try {
    final result = api_instance.resetUserPassword(resetUserPasswordRequest);
    print(result);
} catch (e) {
    print('Exception when calling ResetUserPasswordApi->resetUserPassword: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resetUserPasswordRequest** | [**ResetUserPasswordRequest**](ResetUserPasswordRequest.md)|  | 

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

