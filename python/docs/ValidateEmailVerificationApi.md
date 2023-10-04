# authclient.ValidateEmailVerificationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validate_email_verification**](ValidateEmailVerificationApi.md#validate_email_verification) | **POST** /api/v1/auth/public/validate-email-verification | 


# **validate_email_verification**
> ApiResponse validate_email_verification(email_confirmation_otp_submit_request)



### Example

```python
import time
import os
import authclient
from authclient.models.api_response import ApiResponse
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
    api_instance = authclient.ValidateEmailVerificationApi(api_client)
    email_confirmation_otp_submit_request = authclient.EmailConfirmationOtpSubmitRequest() # EmailConfirmationOtpSubmitRequest | 

    try:
        api_response = await api_instance.validate_email_verification(email_confirmation_otp_submit_request)
        print("The response of ValidateEmailVerificationApi->validate_email_verification:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ValidateEmailVerificationApi->validate_email_verification: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email_confirmation_otp_submit_request** | [**EmailConfirmationOtpSubmitRequest**](EmailConfirmationOtpSubmitRequest.md)|  | 

### Return type

[**ApiResponse**](ApiResponse.md)

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

