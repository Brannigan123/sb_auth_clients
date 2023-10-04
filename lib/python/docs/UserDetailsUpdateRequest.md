# UserDetailsUpdateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**otp_id** | **str** |  | [optional] 
**otp_code** | **str** |  | [optional] 
**display_name** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**password** | **str** |  | [optional] 

## Example

```python
from authclient.models.user_details_update_request import UserDetailsUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UserDetailsUpdateRequest from a JSON string
user_details_update_request_instance = UserDetailsUpdateRequest.from_json(json)
# print the JSON string representation of the object
print UserDetailsUpdateRequest.to_json()

# convert the object into a dict
user_details_update_request_dict = user_details_update_request_instance.to_dict()
# create an instance of UserDetailsUpdateRequest from a dict
user_details_update_request_form_dict = user_details_update_request.from_dict(user_details_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


