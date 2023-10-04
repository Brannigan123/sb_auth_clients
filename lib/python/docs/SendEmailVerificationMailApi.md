# authclient.SendEmailVerificationMailApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**send_verification_email**](SendEmailVerificationMailApi.md#send_verification_email) | **POST** /api/v1/auth/authenticated/send-email-verification-mail | 


# **send_verification_email**
> OtpRequestResponse send_verification_email()



### Example

* Bearer (JWT) Authentication (Authentication):
```python
import time
import os
import authclient
from authclient.models.otp_request_response import OtpRequestResponse
from authclient.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = authclient.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): Authentication
configuration = authclient.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with authclient.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = authclient.SendEmailVerificationMailApi(api_client)

    try:
        api_response = await api_instance.send_verification_email()
        print("The response of SendEmailVerificationMailApi->send_verification_email:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SendEmailVerificationMailApi->send_verification_email: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

