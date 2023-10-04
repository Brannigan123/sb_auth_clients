# SigninRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_or_username** | **str** |  | [optional] 
**password** | **str** |  | [optional] 

## Example

```python
from authclient.models.signin_request import SigninRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SigninRequest from a JSON string
signin_request_instance = SigninRequest.from_json(json)
# print the JSON string representation of the object
print SigninRequest.to_json()

# convert the object into a dict
signin_request_dict = signin_request_instance.to_dict()
# create an instance of SigninRequest from a dict
signin_request_form_dict = signin_request.from_dict(signin_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


