# OtpRequestResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errored** | **bool** |  | [optional] 
**messages** | **List[str]** |  | [optional] 
**otp_id** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**expiry_date** | [**ModelDate**](ModelDate.md) |  | [optional] 

## Example

```python
from authclient.models.otp_request_response import OtpRequestResponse

# TODO update the JSON string below
json = "{}"
# create an instance of OtpRequestResponse from a JSON string
otp_request_response_instance = OtpRequestResponse.from_json(json)
# print the JSON string representation of the object
print OtpRequestResponse.to_json()

# convert the object into a dict
otp_request_response_dict = otp_request_response_instance.to_dict()
# create an instance of OtpRequestResponse from a dict
otp_request_response_form_dict = otp_request_response.from_dict(otp_request_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


