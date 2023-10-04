# OtpRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EmailOrUsername** | Pointer to **string** |  | [optional] 
**Message** | Pointer to **string** |  | [optional] 

## Methods

### NewOtpRequest

`func NewOtpRequest() *OtpRequest`

NewOtpRequest instantiates a new OtpRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOtpRequestWithDefaults

`func NewOtpRequestWithDefaults() *OtpRequest`

NewOtpRequestWithDefaults instantiates a new OtpRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmailOrUsername

`func (o *OtpRequest) GetEmailOrUsername() string`

GetEmailOrUsername returns the EmailOrUsername field if non-nil, zero value otherwise.

### GetEmailOrUsernameOk

`func (o *OtpRequest) GetEmailOrUsernameOk() (*string, bool)`

GetEmailOrUsernameOk returns a tuple with the EmailOrUsername field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailOrUsername

`func (o *OtpRequest) SetEmailOrUsername(v string)`

SetEmailOrUsername sets EmailOrUsername field to given value.

### HasEmailOrUsername

`func (o *OtpRequest) HasEmailOrUsername() bool`

HasEmailOrUsername returns a boolean if a field has been set.

### GetMessage

`func (o *OtpRequest) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *OtpRequest) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *OtpRequest) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *OtpRequest) HasMessage() bool`

HasMessage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


