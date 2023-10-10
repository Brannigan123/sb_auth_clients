# ModelDate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **int** |  | [optional] 
**year** | **int** |  | [optional] 
**seconds** | **int** |  | [optional] 
**month** | **int** |  | [optional] 
**var_date** | **int** |  | [optional] 
**hours** | **int** |  | [optional] 
**minutes** | **int** |  | [optional] 
**day** | **int** |  | [optional] 
**timezone_offset** | **int** |  | [optional] 

## Example

```python
from authclient.models.model_date import ModelDate

# TODO update the JSON string below
json = "{}"
# create an instance of ModelDate from a JSON string
model_date_instance = ModelDate.from_json(json)
# print the JSON string representation of the object
print ModelDate.to_json()

# convert the object into a dict
model_date_dict = model_date_instance.to_dict()
# create an instance of ModelDate from a dict
model_date_form_dict = model_date.from_dict(model_date_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


