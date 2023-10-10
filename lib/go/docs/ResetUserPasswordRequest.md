# ResetUserPasswordRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OtpId** | Pointer to **string** |  | [optional] 
**OtpCode** | Pointer to **string** |  | [optional] 
**EmailOrUsername** | Pointer to **string** |  | [optional] 
**Password** | Pointer to **string** |  | [optional] 

## Methods

### NewResetUserPasswordRequest

`func NewResetUserPasswordRequest() *ResetUserPasswordRequest`

NewResetUserPasswordRequest instantiates a new ResetUserPasswordRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewResetUserPasswordRequestWithDefaults

`func NewResetUserPasswordRequestWithDefaults() *ResetUserPasswordRequest`

NewResetUserPasswordRequestWithDefaults instantiates a new ResetUserPasswordRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOtpId

`func (o *ResetUserPasswordRequest) GetOtpId() string`

GetOtpId returns the OtpId field if non-nil, zero value otherwise.

### GetOtpIdOk

`func (o *ResetUserPasswordRequest) GetOtpIdOk() (*string, bool)`

GetOtpIdOk returns a tuple with the OtpId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtpId

`func (o *ResetUserPasswordRequest) SetOtpId(v string)`

SetOtpId sets OtpId field to given value.

### HasOtpId

`func (o *ResetUserPasswordRequest) HasOtpId() bool`

HasOtpId returns a boolean if a field has been set.

### GetOtpCode

`func (o *ResetUserPasswordRequest) GetOtpCode() string`

GetOtpCode returns the OtpCode field if non-nil, zero value otherwise.

### GetOtpCodeOk

`func (o *ResetUserPasswordRequest) GetOtpCodeOk() (*string, bool)`

GetOtpCodeOk returns a tuple with the OtpCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtpCode

`func (o *ResetUserPasswordRequest) SetOtpCode(v string)`

SetOtpCode sets OtpCode field to given value.

### HasOtpCode

`func (o *ResetUserPasswordRequest) HasOtpCode() bool`

HasOtpCode returns a boolean if a field has been set.

### GetEmailOrUsername

`func (o *ResetUserPasswordRequest) GetEmailOrUsername() string`

GetEmailOrUsername returns the EmailOrUsername field if non-nil, zero value otherwise.

### GetEmailOrUsernameOk

`func (o *ResetUserPasswordRequest) GetEmailOrUsernameOk() (*string, bool)`

GetEmailOrUsernameOk returns a tuple with the EmailOrUsername field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailOrUsername

`func (o *ResetUserPasswordRequest) SetEmailOrUsername(v string)`

SetEmailOrUsername sets EmailOrUsername field to given value.

### HasEmailOrUsername

`func (o *ResetUserPasswordRequest) HasEmailOrUsername() bool`

HasEmailOrUsername returns a boolean if a field has been set.

### GetPassword

`func (o *ResetUserPasswordRequest) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *ResetUserPasswordRequest) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *ResetUserPasswordRequest) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *ResetUserPasswordRequest) HasPassword() bool`

HasPassword returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


