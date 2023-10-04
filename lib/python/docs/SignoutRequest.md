# SignoutRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **str** |  | [optional] 

## Example

```python
from authclient.models.signout_request import SignoutRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SignoutRequest from a JSON string
signout_request_instance = SignoutRequest.from_json(json)
# print the JSON string representation of the object
print SignoutRequest.to_json()

# convert the object into a dict
signout_request_dict = signout_request_instance.to_dict()
# create an instance of SignoutRequest from a dict
signout_request_form_dict = signout_request.from_dict(signout_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


