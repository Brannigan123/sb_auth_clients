# OtpRequestResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errored** | Pointer to **bool** |  | [optional] 
**Messages** | Pointer to **[]string** |  | [optional] 
**OtpId** | Pointer to **string** |  | [optional] 
**Email** | Pointer to **string** |  | [optional] 
**ExpiryDate** | Pointer to [**Date**](Date.md) |  | [optional] 

## Methods

### NewOtpRequestResponse

`func NewOtpRequestResponse() *OtpRequestResponse`

NewOtpRequestResponse instantiates a new OtpRequestResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOtpRequestResponseWithDefaults

`func NewOtpRequestResponseWithDefaults() *OtpRequestResponse`

NewOtpRequestResponseWithDefaults instantiates a new OtpRequestResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrored

`func (o *OtpRequestResponse) GetErrored() bool`

GetErrored returns the Errored field if non-nil, zero value otherwise.

### GetErroredOk

`func (o *OtpRequestResponse) GetErroredOk() (*bool, bool)`

GetErroredOk returns a tuple with the Errored field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrored

`func (o *OtpRequestResponse) SetErrored(v bool)`

SetErrored sets Errored field to given value.

### HasErrored

`func (o *OtpRequestResponse) HasErrored() bool`

HasErrored returns a boolean if a field has been set.

### GetMessages

`func (o *OtpRequestResponse) GetMessages() []string`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *OtpRequestResponse) GetMessagesOk() (*[]string, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *OtpRequestResponse) SetMessages(v []string)`

SetMessages sets Messages field to given value.

### HasMessages

`func (o *OtpRequestResponse) HasMessages() bool`

HasMessages returns a boolean if a field has been set.

### GetOtpId

`func (o *OtpRequestResponse) GetOtpId() string`

GetOtpId returns the OtpId field if non-nil, zero value otherwise.

### GetOtpIdOk

`func (o *OtpRequestResponse) GetOtpIdOk() (*string, bool)`

GetOtpIdOk returns a tuple with the OtpId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtpId

`func (o *OtpRequestResponse) SetOtpId(v string)`

SetOtpId sets OtpId field to given value.

### HasOtpId

`func (o *OtpRequestResponse) HasOtpId() bool`

HasOtpId returns a boolean if a field has been set.

### GetEmail

`func (o *OtpRequestResponse) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *OtpRequestResponse) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *OtpRequestResponse) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *OtpRequestResponse) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetExpiryDate

`func (o *OtpRequestResponse) GetExpiryDate() Date`

GetExpiryDate returns the ExpiryDate field if non-nil, zero value otherwise.

### GetExpiryDateOk

`func (o *OtpRequestResponse) GetExpiryDateOk() (*Date, bool)`

GetExpiryDateOk returns a tuple with the ExpiryDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiryDate

`func (o *OtpRequestResponse) SetExpiryDate(v Date)`

SetExpiryDate sets ExpiryDate field to given value.

### HasExpiryDate

`func (o *OtpRequestResponse) HasExpiryDate() bool`

HasExpiryDate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


