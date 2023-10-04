# SigninRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EmailOrUsername** | Pointer to **string** |  | [optional] 
**Password** | Pointer to **string** |  | [optional] 

## Methods

### NewSigninRequest

`func NewSigninRequest() *SigninRequest`

NewSigninRequest instantiates a new SigninRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSigninRequestWithDefaults

`func NewSigninRequestWithDefaults() *SigninRequest`

NewSigninRequestWithDefaults instantiates a new SigninRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmailOrUsername

`func (o *SigninRequest) GetEmailOrUsername() string`

GetEmailOrUsername returns the EmailOrUsername field if non-nil, zero value otherwise.

### GetEmailOrUsernameOk

`func (o *SigninRequest) GetEmailOrUsernameOk() (*string, bool)`

GetEmailOrUsernameOk returns a tuple with the EmailOrUsername field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailOrUsername

`func (o *SigninRequest) SetEmailOrUsername(v string)`

SetEmailOrUsername sets EmailOrUsername field to given value.

### HasEmailOrUsername

`func (o *SigninRequest) HasEmailOrUsername() bool`

HasEmailOrUsername returns a boolean if a field has been set.

### GetPassword

`func (o *SigninRequest) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *SigninRequest) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *SigninRequest) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *SigninRequest) HasPassword() bool`

HasPassword returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


