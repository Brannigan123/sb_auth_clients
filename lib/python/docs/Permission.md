# Permission


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**roles** | [**List[Role]**](Role.md) |  | [optional] 
**authority** | **str** |  | [optional] 

## Example

```python
from authclient.models.permission import Permission

# TODO update the JSON string below
json = "{}"
# create an instance of Permission from a JSON string
permission_instance = Permission.from_json(json)
# print the JSON string representation of the object
print Permission.to_json()

# convert the object into a dict
permission_dict = permission_instance.to_dict()
# create an instance of Permission from a dict
permission_form_dict = permission.from_dict(permission_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


