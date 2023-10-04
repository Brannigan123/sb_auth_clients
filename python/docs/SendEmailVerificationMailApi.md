# authclient.SendEmailVerificationMailApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**send_verification_email**](SendEmailVerificationMailApi.md#send_verification_email) | **POST** /api/v1/auth/authenticated/send-email-verification-mail | 


# **send_verification_email**
> ApiResponse send_verification_email()



### Example

```python
import time
import os
import authclient
from authclient.models.api_response import ApiResponse
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

