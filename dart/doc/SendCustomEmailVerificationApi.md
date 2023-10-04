# authclient.api.SendCustomEmailVerificationApi

## Load the API package
```dart
import 'package:authclient/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postMethodName**](SendCustomEmailVerificationApi.md#postmethodname) | **POST** /api/v1/auth/public/request-otp | 


# **postMethodName**
> OtpRequestResponse postMethodName(otpRequest)



### Example
```dart
import 'package:authclient/api.dart';

final api_instance = SendCustomEmailVerificationApi();
final otpRequest = OtpRequest(); // OtpRequest | 

try {
    final result = api_instance.postMethodName(otpRequest);
    print(result);
} catch (e) {
    print('Exception when calling SendCustomEmailVerificationApi->postMethodName: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **otpRequest** | [**OtpRequest**](OtpRequest.md)|  | 

### Return type

[**OtpRequestResponse**](OtpRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
