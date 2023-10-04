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
> ApiResponse sendVerificationEmail()



### Example
```dart
import 'package:authclient/api.dart';

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

[**ApiResponse**](ApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

