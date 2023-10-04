# authclient.api.RefreshTokenApi

## Load the API package
```dart
import 'package:authclient/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**refeshToken**](RefreshTokenApi.md#refeshtoken) | **POST** /api/v1/auth/public/refresh-token | 


# **refeshToken**
> TokenRefreshResponse refeshToken(tokenRefreshRequest)



### Example
```dart
import 'package:authclient/api.dart';

final api_instance = RefreshTokenApi();
final tokenRefreshRequest = TokenRefreshRequest(); // TokenRefreshRequest | 

try {
    final result = api_instance.refeshToken(tokenRefreshRequest);
    print(result);
} catch (e) {
    print('Exception when calling RefreshTokenApi->refeshToken: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenRefreshRequest** | [**TokenRefreshRequest**](TokenRefreshRequest.md)|  | 

### Return type

[**TokenRefreshResponse**](TokenRefreshResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

