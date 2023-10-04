# authclient.api.SendEmailVerificationMailApi

## Load the API package
```dart
import 'package:authclient/api.dart';
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendVerificationEmail**](SendEmailVerificationMailApi.md#sendverificationemail) | **POST** /api/v1/auth/authenticated/send-email-verification-mail | 


# **sendVerificationEmail**
> OtpRequestResponse sendVerificationEmail()



### Example
```dart
import 'package:authclient/api.dart';
// TODO Configure HTTP Bearer authorization: Authentication
// Case 1. Use String Token
//defaultApiClient.getAuthentication<HttpBearerAuth>('Authentication').setAccessToken('YOUR_ACCESS_TOKEN');
// Case 2. Use Function which generate token.
// String yourTokenGeneratorFunction() { ... }
//defaultApiClient.getAuthentication<HttpBearerAuth>('Authentication').setAccessToken(yourTokenGeneratorFunction);

final api_instance = SendEmailVerificationMailApi();

try {
    final result = api_instance.sendVerificationEmail();
    print(result);
} catch (e) {
    print('Exception when calling SendEmailVerificationMailApi->sendVerificationEmail: $e\n');
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OtpRequestResponse**](OtpRequestResponse.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

