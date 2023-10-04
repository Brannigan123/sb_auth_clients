# EmailConfirmationOtpSubmitRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**otp_id** | **str** |  | [optional] 
**code** | **str** |  | [optional] 

## Example

```python
from authclient.models.email_confirmation_otp_submit_request import EmailConfirmationOtpSubmitRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EmailConfirmationOtpSubmitRequest from a JSON string
email_confirmation_otp_submit_request_instance = EmailConfirmationOtpSubmitRequest.from_json(json)
# print the JSON string representation of the object
print EmailConfirmationOtpSubmitRequest.to_json()

# convert the object into a dict
email_confirmation_otp_submit_request_dict = email_confirmation_otp_submit_request_instance.to_dict()
# create an instance of EmailConfirmationOtpSubmitRequest from a dict
email_confirmation_otp_submit_request_form_dict = email_confirmation_otp_submit_request.from_dict(email_confirmation_otp_submit_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


