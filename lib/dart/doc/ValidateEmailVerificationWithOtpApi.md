# authclient.api.ValidateEmailVerificationWithOtpApi

## Load the API package
```dart
import 'package:authclient/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**valilidateEmailVerificationOtp**](ValidateEmailVerificationWithOtpApi.md#valilidateemailverificationotp) | **POST** /api/v1/auth/public/validate-email-verification-otp | 


# **valilidateEmailVerificationOtp**
> AuthResponse valilidateEmailVerificationOtp(emailConfirmationOtpSubmitRequest)



### Example
```dart
import 'package:authclient/api.dart';

final api_instance = ValidateEmailVerificationWithOtpApi();
final emailConfirmationOtpSubmitRequest = EmailConfirmationOtpSubmitRequest(); // EmailConfirmationOtpSubmitRequest | 

try {
    final result = api_instance.valilidateEmailVerificationOtp(emailConfirmationOtpSubmitRequest);
    print(result);
} catch (e) {
    print('Exception when calling ValidateEmailVerificationWithOtpApi->valilidateEmailVerificationOtp: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailConfirmationOtpSubmitRequest** | [**EmailConfirmationOtpSubmitRequest**](EmailConfirmationOtpSubmitRequest.md)|  | 

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

