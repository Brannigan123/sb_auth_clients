# authclient.SendCustomEmailVerificationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_method_name**](SendCustomEmailVerificationApi.md#post_method_name) | **POST** /api/v1/auth/public/request-otp | 


# **post_method_name**
> OtpRequestResponse post_method_name(otp_request)



### Example

```python
import time
import os
import authclient
from authclient.models.otp_request import OtpRequest
from authclient.models.otp_request_response import OtpRequestResponse
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
    api_instance = authclient.SendCustomEmailVerificationApi(api_client)
    otp_request = authclient.OtpRequest() # OtpRequest | 

    try:
        api_response = await api_instance.post_method_name(otp_request)
        print("The response of SendCustomEmailVerificationApi->post_method_name:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SendCustomEmailVerificationApi->post_method_name: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **otp_request** | [**OtpRequest**](OtpRequest.md)|  | 

### Return type

[**OtpRequestResponse**](OtpRequestResponse.md)

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

