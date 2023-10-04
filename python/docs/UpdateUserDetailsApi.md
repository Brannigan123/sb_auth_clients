# authclient.UpdateUserDetailsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**update_user_details**](UpdateUserDetailsApi.md#update_user_details) | **POST** /api/v1/auth/authenticated/update-user-details | 


# **update_user_details**
> ApiResponse update_user_details(user_details_update_request)



### Example

```python
import time
import os
import authclient
from authclient.models.api_response import ApiResponse
from authclient.models.user_details_update_request import UserDetailsUpdateRequest
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
    api_instance = authclient.UpdateUserDetailsApi(api_client)
    user_details_update_request = authclient.UserDetailsUpdateRequest() # UserDetailsUpdateRequest | 

    try:
        api_response = await api_instance.update_user_details(user_details_update_request)
        print("The response of UpdateUserDetailsApi->update_user_details:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UpdateUserDetailsApi->update_user_details: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_details_update_request** | [**UserDetailsUpdateRequest**](UserDetailsUpdateRequest.md)|  | 

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

