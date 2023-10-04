# TokenRefreshResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errored** | **bool** |  | [optional] 
**messages** | **List[str]** |  | [optional] 
**token** | **str** |  | [optional] 
**refresh_token** | **str** |  | [optional] 
**username** | **str** |  | [optional] 
**display_name** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**roles** | [**List[Role]**](Role.md) |  | [optional] 
**email_verified** | **bool** |  | [optional] 
**locked_account** | **bool** |  | [optional] 
**deleted_account** | **bool** |  | [optional] 

## Example

```python
from authclient.models.token_refresh_response import TokenRefreshResponse

# TODO update the JSON string below
json = "{}"
# create an instance of TokenRefreshResponse from a JSON string
token_refresh_response_instance = TokenRefreshResponse.from_json(json)
# print the JSON string representation of the object
print TokenRefreshResponse.to_json()

# convert the object into a dict
token_refresh_response_dict = token_refresh_response_instance.to_dict()
# create an instance of TokenRefreshResponse from a dict
token_refresh_response_form_dict = token_refresh_response.from_dict(token_refresh_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


