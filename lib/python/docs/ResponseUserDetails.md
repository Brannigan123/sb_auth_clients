# ResponseUserDetails


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_id** | **str** |  | [optional] 
**username** | **str** |  | [optional] 
**display_name** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**roles** | [**List[Role]**](Role.md) |  | [optional] 
**email_verified** | **bool** |  | [optional] 
**locked_account** | **bool** |  | [optional] 
**deleted_account** | **bool** |  | [optional] 

## Example

```python
from authclient.models.response_user_details import ResponseUserDetails

# TODO update the JSON string below
json = "{}"
# create an instance of ResponseUserDetails from a JSON string
response_user_details_instance = ResponseUserDetails.from_json(json)
# print the JSON string representation of the object
print ResponseUserDetails.to_json()

# convert the object into a dict
response_user_details_dict = response_user_details_instance.to_dict()
# create an instance of ResponseUserDetails from a dict
response_user_details_form_dict = response_user_details.from_dict(response_user_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


