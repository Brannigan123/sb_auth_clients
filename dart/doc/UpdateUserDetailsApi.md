# authclient.api.UpdateUserDetailsApi

## Load the API package
```dart
import 'package:authclient/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateUserDetails**](UpdateUserDetailsApi.md#updateuserdetails) | **POST** /api/v1/auth/authenticated/update-user-details | 


# **updateUserDetails**
> ApiResponse updateUserDetails(userDetailsUpdateRequest)



### Example
```dart
import 'package:authclient/api.dart';

final api_instance = UpdateUserDetailsApi();
final userDetailsUpdateRequest = UserDetailsUpdateRequest(); // UserDetailsUpdateRequest | 

try {
    final result = api_instance.updateUserDetails(userDetailsUpdateRequest);
    print(result);
} catch (e) {
    print('Exception when calling UpdateUserDetailsApi->updateUserDetails: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userDetailsUpdateRequest** | [**UserDetailsUpdateRequest**](UserDetailsUpdateRequest.md)|  | 

### Return type

[**ApiResponse**](ApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

