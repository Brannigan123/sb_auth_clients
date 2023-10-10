# ResetUserPasswordRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**otp_id** | **str** |  | [optional] 
**otp_code** | **str** |  | [optional] 
**email_or_username** | **str** |  | [optional] 
**password** | **str** |  | [optional] 

## Example

```python
from authclient.models.reset_user_password_request import ResetUserPasswordRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ResetUserPasswordRequest from a JSON string
reset_user_password_request_instance = ResetUserPasswordRequest.from_json(json)
# print the JSON string representation of the object
print ResetUserPasswordRequest.to_json()

# convert the object into a dict
reset_user_password_request_dict = reset_user_password_request_instance.to_dict()
# create an instance of ResetUserPasswordRequest from a dict
reset_user_password_request_form_dict = reset_user_password_request.from_dict(reset_user_password_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


