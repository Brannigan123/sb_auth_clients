# SignupRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **str** |  | [optional] 
**display_name** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**password** | **str** |  | [optional] 

## Example

```python
from authclient.models.signup_request import SignupRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SignupRequest from a JSON string
signup_request_instance = SignupRequest.from_json(json)
# print the JSON string representation of the object
print SignupRequest.to_json()

# convert the object into a dict
signup_request_dict = signup_request_instance.to_dict()
# create an instance of SignupRequest from a dict
signup_request_form_dict = signup_request.from_dict(signup_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


