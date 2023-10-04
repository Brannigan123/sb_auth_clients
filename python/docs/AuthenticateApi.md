# authclient.AuthenticateApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](AuthenticateApi.md#authenticate) | **POST** /api/v1/auth/public/authenticate | 


# **authenticate**
> SigninResponse authenticate(signin_request)



### Example

```python
import time
import os
import authclient
from authclient.models.signin_request import SigninRequest
from authclient.models.signin_response import SigninResponse
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
    api_instance = authclient.AuthenticateApi(api_client)
    signin_request = authclient.SigninRequest() # SigninRequest | 

    try:
        api_response = await api_instance.authenticate(signin_request)
        print("The response of AuthenticateApi->authenticate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthenticateApi->authenticate: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signin_request** | [**SigninRequest**](SigninRequest.md)|  | 

### Return type

[**SigninResponse**](SigninResponse.md)

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

