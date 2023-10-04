# OtpRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_or_username** | **str** |  | [optional] 
**message** | **str** |  | [optional] 

## Example

```python
from authclient.models.otp_request import OtpRequest

# TODO update the JSON string below
json = "{}"
# create an instance of OtpRequest from a JSON string
otp_request_instance = OtpRequest.from_json(json)
# print the JSON string representation of the object
print OtpRequest.to_json()

# convert the object into a dict
otp_request_dict = otp_request_instance.to_dict()
# create an instance of OtpRequest from a dict
otp_request_form_dict = otp_request.from_dict(otp_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


