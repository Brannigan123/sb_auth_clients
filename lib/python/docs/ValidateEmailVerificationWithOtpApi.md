# authclient.ValidateEmailVerificationWithOtpApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**valilidate_email_verification_otp**](ValidateEmailVerificationWithOtpApi.md#valilidate_email_verification_otp) | **POST** /api/v1/auth/public/validate-email-verification-otp | 


# **valilidate_email_verification_otp**
> AuthResponse valilidate_email_verification_otp(email_confirmation_otp_submit_request)



### Example

```python
import time
import os
import authclient
from authclient.models.auth_response import AuthResponse
from authclient.models.email_confirmation_otp_submit_request import EmailConfirmationOtpSubmitRequest
from authclient.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = authclient.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
async with authclient.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = authclient.ValidateEmailVerificationWithOtpApi(api_client)
    email_confirmation_otp_submit_request = authclient.EmailConfirmationOtpSubmitRequest() # EmailConfirmationOtpSubmitRequest | 

    try:
        api_response = await api_instance.valilidate_email_verification_otp(email_confirmation_otp_submit_request)
        print("The response of ValidateEmailVerificationWithOtpApi->valilidate_email_verification_otp:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ValidateEmailVerificationWithOtpApi->valilidate_email_verification_otp: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email_confirmation_otp_submit_request** | [**EmailConfirmationOtpSubmitRequest**](EmailConfirmationOtpSubmitRequest.md)|  | 

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

