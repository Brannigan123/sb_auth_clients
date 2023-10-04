# authclient.api.AuthenticateApi

## Load the API package
```dart
import 'package:authclient/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](AuthenticateApi.md#authenticate) | **POST** /api/v1/auth/public/authenticate | 


# **authenticate**
> SigninResponse authenticate(signinRequest)



### Example
```dart
import 'package:authclient/api.dart';

final api_instance = AuthenticateApi();
final signinRequest = SigninRequest(); // SigninRequest | 

try {
    final result = api_instance.authenticate(signinRequest);
    print(result);
} catch (e) {
    print('Exception when calling AuthenticateApi->authenticate: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signinRequest** | [**SigninRequest**](SigninRequest.md)|  | 

### Return type

[**SigninResponse**](SigninResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

