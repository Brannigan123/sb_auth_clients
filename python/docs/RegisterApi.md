# authclient.RegisterApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**register**](RegisterApi.md#register) | **POST** /api/v1/auth/public/register | 


# **register**
> SignupResponse register(signup_request)



### Example

```python
import time
import os
import authclient
from authclient.models.signup_request import SignupRequest
from authclient.models.signup_response import SignupResponse
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
    api_instance = authclient.RegisterApi(api_client)
    signup_request = authclient.SignupRequest() # SignupRequest | 

    try:
        api_response = await api_instance.register(signup_request)
        print("The response of RegisterApi->register:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RegisterApi->register: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signup_request** | [**SignupRequest**](SignupRequest.md)|  | 

### Return type

[**SignupResponse**](SignupResponse.md)

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

