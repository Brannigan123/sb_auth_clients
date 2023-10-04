# SignupResponse


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
from authclient.models.signup_response import SignupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SignupResponse from a JSON string
signup_response_instance = SignupResponse.from_json(json)
# print the JSON string representation of the object
print SignupResponse.to_json()

# convert the object into a dict
signup_response_dict = signup_response_instance.to_dict()
# create an instance of SignupResponse from a dict
signup_response_form_dict = signup_response.from_dict(signup_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


