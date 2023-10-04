# authclient.RefreshTokenApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**refesh_token**](RefreshTokenApi.md#refesh_token) | **POST** /api/v1/auth/public/refresh-token | 


# **refesh_token**
> TokenRefreshResponse refesh_token(token_refresh_request)



### Example

```python
import time
import os
import authclient
from authclient.models.token_refresh_request import TokenRefreshRequest
from authclient.models.token_refresh_response import TokenRefreshResponse
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
    api_instance = authclient.RefreshTokenApi(api_client)
    token_refresh_request = authclient.TokenRefreshRequest() # TokenRefreshRequest | 

    try:
        api_response = await api_instance.refesh_token(token_refresh_request)
        print("The response of RefreshTokenApi->refesh_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RefreshTokenApi->refesh_token: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_refresh_request** | [**TokenRefreshRequest**](TokenRefreshRequest.md)|  | 

### Return type

[**TokenRefreshResponse**](TokenRefreshResponse.md)

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

