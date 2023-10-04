# SigninResponse


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
from authclient.models.signin_response import SigninResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SigninResponse from a JSON string
signin_response_instance = SigninResponse.from_json(json)
# print the JSON string representation of the object
print SigninResponse.to_json()

# convert the object into a dict
signin_response_dict = signin_response_instance.to_dict()
# create an instance of SigninResponse from a dict
signin_response_form_dict = signin_response.from_dict(signin_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


