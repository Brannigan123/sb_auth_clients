# authclient.api.SignoutApi

## Load the API package
```dart
import 'package:authclient/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**signout**](SignoutApi.md#signout) | **POST** /api/v1/auth/authenticated/logout | 


# **signout**
> AuthResponse signout(signoutRequest)



### Example
```dart
import 'package:authclient/api.dart';
// TODO Configure HTTP Bearer authorization: Authentication
// Case 1. Use String Token
//defaultApiClient.getAuthentication<HttpBearerAuth>('Authentication').setAccessToken('YOUR_ACCESS_TOKEN');
// Case 2. Use Function which generate token.
// String yourTokenGeneratorFunction() { ... }
//defaultApiClient.getAuthentication<HttpBearerAuth>('Authentication').setAccessToken(yourTokenGeneratorFunction);

final api_instance = SignoutApi();
final signoutRequest = SignoutRequest(); // SignoutRequest | 

try {
    final result = api_instance.signout(signoutRequest);
    print(result);
} catch (e) {
    print('Exception when calling SignoutApi->signout: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signoutRequest** | [**SignoutRequest**](SignoutRequest.md)|  | 

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

