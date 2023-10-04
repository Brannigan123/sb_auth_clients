# authclient.SignoutApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**signout**](SignoutApi.md#signout) | **POST** /api/v1/auth/authenticated/logout | 


# **signout**
> ApiResponse signout(signout_request)



### Example

```python
import time
import os
import authclient
from authclient.models.api_response import ApiResponse
from authclient.models.signout_request import SignoutRequest
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
    api_instance = authclient.SignoutApi(api_client)
    signout_request = authclient.SignoutRequest() # SignoutRequest | 

    try:
        api_response = await api_instance.signout(signout_request)
        print("The response of SignoutApi->signout:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SignoutApi->signout: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signout_request** | [**SignoutRequest**](SignoutRequest.md)|  | 

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

