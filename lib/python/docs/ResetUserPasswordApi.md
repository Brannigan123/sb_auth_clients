# authclient.ResetUserPasswordApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reset_user_password**](ResetUserPasswordApi.md#reset_user_password) | **POST** /api/v1/auth/public/reset-password | 


# **reset_user_password**
> AuthResponse reset_user_password(reset_user_password_request)



### Example

```python
import time
import os
import authclient
from authclient.models.auth_response import AuthResponse
from authclient.models.reset_user_password_request import ResetUserPasswordRequest
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
    api_instance = authclient.ResetUserPasswordApi(api_client)
    reset_user_password_request = authclient.ResetUserPasswordRequest() # ResetUserPasswordRequest | 

    try:
        api_response = await api_instance.reset_user_password(reset_user_password_request)
        print("The response of ResetUserPasswordApi->reset_user_password:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResetUserPasswordApi->reset_user_password: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reset_user_password_request** | [**ResetUserPasswordRequest**](ResetUserPasswordRequest.md)|  | 

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

