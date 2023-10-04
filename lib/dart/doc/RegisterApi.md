# authclient.api.RegisterApi

## Load the API package
```dart
import 'package:authclient/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**register**](RegisterApi.md#register) | **POST** /api/v1/auth/public/register | 


# **register**
> AuthResponse register(signupRequest)



### Example
```dart
import 'package:authclient/api.dart';

final api_instance = RegisterApi();
final signupRequest = SignupRequest(); // SignupRequest | 

try {
    final result = api_instance.register(signupRequest);
    print(result);
} catch (e) {
    print('Exception when calling RegisterApi->register: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signupRequest** | [**SignupRequest**](SignupRequest.md)|  | 

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

