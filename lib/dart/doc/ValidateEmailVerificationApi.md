# authclient.api.ValidateEmailVerificationApi

## Load the API package
```dart
import 'package:authclient/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validateEmailVerification**](ValidateEmailVerificationApi.md#validateemailverification) | **POST** /api/v1/auth/public/validate-email-verification | 


# **validateEmailVerification**
> ApiResponse validateEmailVerification(emailConfirmationOtpSubmitRequest)



### Example
```dart
import 'package:authclient/api.dart';

final api_instance = ValidateEmailVerificationApi();
final emailConfirmationOtpSubmitRequest = EmailConfirmationOtpSubmitRequest(); // EmailConfirmationOtpSubmitRequest | 

try {
    final result = api_instance.validateEmailVerification(emailConfirmationOtpSubmitRequest);
    print(result);
} catch (e) {
    print('Exception when calling ValidateEmailVerificationApi->validateEmailVerification: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailConfirmationOtpSubmitRequest** | [**EmailConfirmationOtpSubmitRequest**](EmailConfirmationOtpSubmitRequest.md)|  | 

### Return type

[**ApiResponse**](ApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

