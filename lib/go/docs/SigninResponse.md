# SigninResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errored** | Pointer to **bool** |  | [optional] 
**Messages** | Pointer to **[]string** |  | [optional] 
**Token** | Pointer to **string** |  | [optional] 
**RefreshToken** | Pointer to **string** |  | [optional] 
**Username** | Pointer to **string** |  | [optional] 
**DisplayName** | Pointer to **string** |  | [optional] 
**Email** | Pointer to **string** |  | [optional] 
**Roles** | Pointer to [**[]Role**](Role.md) |  | [optional] 
**EmailVerified** | Pointer to **bool** |  | [optional] 
**LockedAccount** | Pointer to **bool** |  | [optional] 
**DeletedAccount** | Pointer to **bool** |  | [optional] 

## Methods

### NewSigninResponse

`func NewSigninResponse() *SigninResponse`

NewSigninResponse instantiates a new SigninResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSigninResponseWithDefaults

`func NewSigninResponseWithDefaults() *SigninResponse`

NewSigninResponseWithDefaults instantiates a new SigninResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrored

`func (o *SigninResponse) GetErrored() bool`

GetErrored returns the Errored field if non-nil, zero value otherwise.

### GetErroredOk

`func (o *SigninResponse) GetErroredOk() (*bool, bool)`

GetErroredOk returns a tuple with the Errored field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrored

`func (o *SigninResponse) SetErrored(v bool)`

SetErrored sets Errored field to given value.

### HasErrored

`func (o *SigninResponse) HasErrored() bool`

HasErrored returns a boolean if a field has been set.

### GetMessages

`func (o *SigninResponse) GetMessages() []string`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *SigninResponse) GetMessagesOk() (*[]string, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *SigninResponse) SetMessages(v []string)`

SetMessages sets Messages field to given value.

### HasMessages

`func (o *SigninResponse) HasMessages() bool`

HasMessages returns a boolean if a field has been set.

### GetToken

`func (o *SigninResponse) GetToken() string`

GetToken returns the Token field if non-nil, zero value otherwise.

### GetTokenOk

`func (o *SigninResponse) GetTokenOk() (*string, bool)`

GetTokenOk returns a tuple with the Token field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToken

`func (o *SigninResponse) SetToken(v string)`

SetToken sets Token field to given value.

### HasToken

`func (o *SigninResponse) HasToken() bool`

HasToken returns a boolean if a field has been set.

### GetRefreshToken

`func (o *SigninResponse) GetRefreshToken() string`

GetRefreshToken returns the RefreshToken field if non-nil, zero value otherwise.

### GetRefreshTokenOk

`func (o *SigninResponse) GetRefreshTokenOk() (*string, bool)`

GetRefreshTokenOk returns a tuple with the RefreshToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshToken

`func (o *SigninResponse) SetRefreshToken(v string)`

SetRefreshToken sets RefreshToken field to given value.

### HasRefreshToken

`func (o *SigninResponse) HasRefreshToken() bool`

HasRefreshToken returns a boolean if a field has been set.

### GetUsername

`func (o *SigninResponse) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *SigninResponse) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *SigninResponse) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *SigninResponse) HasUsername() bool`

HasUsername returns a boolean if a field has been set.

### GetDisplayName

`func (o *SigninResponse) GetDisplayName() string`

GetDisplayName returns the DisplayName field if non-nil, zero value otherwise.

### GetDisplayNameOk

`func (o *SigninResponse) GetDisplayNameOk() (*string, bool)`

GetDisplayNameOk returns a tuple with the DisplayName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayName

`func (o *SigninResponse) SetDisplayName(v string)`

SetDisplayName sets DisplayName field to given value.

### HasDisplayName

`func (o *SigninResponse) HasDisplayName() bool`

HasDisplayName returns a boolean if a field has been set.

### GetEmail

`func (o *SigninResponse) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *SigninResponse) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *SigninResponse) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *SigninResponse) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetRoles

`func (o *SigninResponse) GetRoles() []Role`

GetRoles returns the Roles field if non-nil, zero value otherwise.

### GetRolesOk

`func (o *SigninResponse) GetRolesOk() (*[]Role, bool)`

GetRolesOk returns a tuple with the Roles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoles

`func (o *SigninResponse) SetRoles(v []Role)`

SetRoles sets Roles field to given value.

### HasRoles

`func (o *SigninResponse) HasRoles() bool`

HasRoles returns a boolean if a field has been set.

### GetEmailVerified

`func (o *SigninResponse) GetEmailVerified() bool`

GetEmailVerified returns the EmailVerified field if non-nil, zero value otherwise.

### GetEmailVerifiedOk

`func (o *SigninResponse) GetEmailVerifiedOk() (*bool, bool)`

GetEmailVerifiedOk returns a tuple with the EmailVerified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailVerified

`func (o *SigninResponse) SetEmailVerified(v bool)`

SetEmailVerified sets EmailVerified field to given value.

### HasEmailVerified

`func (o *SigninResponse) HasEmailVerified() bool`

HasEmailVerified returns a boolean if a field has been set.

### GetLockedAccount

`func (o *SigninResponse) GetLockedAccount() bool`

GetLockedAccount returns the LockedAccount field if non-nil, zero value otherwise.

### GetLockedAccountOk

`func (o *SigninResponse) GetLockedAccountOk() (*bool, bool)`

GetLockedAccountOk returns a tuple with the LockedAccount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLockedAccount

`func (o *SigninResponse) SetLockedAccount(v bool)`

SetLockedAccount sets LockedAccount field to given value.

### HasLockedAccount

`func (o *SigninResponse) HasLockedAccount() bool`

HasLockedAccount returns a boolean if a field has been set.

### GetDeletedAccount

`func (o *SigninResponse) GetDeletedAccount() bool`

GetDeletedAccount returns the DeletedAccount field if non-nil, zero value otherwise.

### GetDeletedAccountOk

`func (o *SigninResponse) GetDeletedAccountOk() (*bool, bool)`

GetDeletedAccountOk returns a tuple with the DeletedAccount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeletedAccount

`func (o *SigninResponse) SetDeletedAccount(v bool)`

SetDeletedAccount sets DeletedAccount field to given value.

### HasDeletedAccount

`func (o *SigninResponse) HasDeletedAccount() bool`

HasDeletedAccount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


