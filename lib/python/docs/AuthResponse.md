# AuthResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errored** | **bool** |  | [optional] 
**messages** | **List[str]** |  | [optional] 
**token** | **str** |  | [optional] 
**refresh_token** | **str** |  | [optional] 
**user_details** | [**ResponseUserDetails**](ResponseUserDetails.md) |  | [optional] 

## Example

```python
from authclient.models.auth_response import AuthResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AuthResponse from a JSON string
auth_response_instance = AuthResponse.from_json(json)
# print the JSON string representation of the object
print AuthResponse.to_json()

# convert the object into a dict
auth_response_dict = auth_response_instance.to_dict()
# create an instance of AuthResponse from a dict
auth_response_form_dict = auth_response.from_dict(auth_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


