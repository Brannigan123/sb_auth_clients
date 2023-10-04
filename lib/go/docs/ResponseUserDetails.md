# ResponseUserDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserId** | Pointer to **string** |  | [optional] 
**Username** | Pointer to **string** |  | [optional] 
**DisplayName** | Pointer to **string** |  | [optional] 
**Email** | Pointer to **string** |  | [optional] 
**Roles** | Pointer to [**[]Role**](Role.md) |  | [optional] 
**EmailVerified** | Pointer to **bool** |  | [optional] 
**LockedAccount** | Pointer to **bool** |  | [optional] 
**DeletedAccount** | Pointer to **bool** |  | [optional] 

## Methods

### NewResponseUserDetails

`func NewResponseUserDetails() *ResponseUserDetails`

NewResponseUserDetails instantiates a new ResponseUserDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewResponseUserDetailsWithDefaults

`func NewResponseUserDetailsWithDefaults() *ResponseUserDetails`

NewResponseUserDetailsWithDefaults instantiates a new ResponseUserDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUserId

`func (o *ResponseUserDetails) GetUserId() string`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *ResponseUserDetails) GetUserIdOk() (*string, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *ResponseUserDetails) SetUserId(v string)`

SetUserId sets UserId field to given value.

### HasUserId

`func (o *ResponseUserDetails) HasUserId() bool`

HasUserId returns a boolean if a field has been set.

### GetUsername

`func (o *ResponseUserDetails) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *ResponseUserDetails) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *ResponseUserDetails) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *ResponseUserDetails) HasUsername() bool`

HasUsername returns a boolean if a field has been set.

### GetDisplayName

`func (o *ResponseUserDetails) GetDisplayName() string`

GetDisplayName returns the DisplayName field if non-nil, zero value otherwise.

### GetDisplayNameOk

`func (o *ResponseUserDetails) GetDisplayNameOk() (*string, bool)`

GetDisplayNameOk returns a tuple with the DisplayName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayName

`func (o *ResponseUserDetails) SetDisplayName(v string)`

SetDisplayName sets DisplayName field to given value.

### HasDisplayName

`func (o *ResponseUserDetails) HasDisplayName() bool`

HasDisplayName returns a boolean if a field has been set.

### GetEmail

`func (o *ResponseUserDetails) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *ResponseUserDetails) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *ResponseUserDetails) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *ResponseUserDetails) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetRoles

`func (o *ResponseUserDetails) GetRoles() []Role`

GetRoles returns the Roles field if non-nil, zero value otherwise.

### GetRolesOk

`func (o *ResponseUserDetails) GetRolesOk() (*[]Role, bool)`

GetRolesOk returns a tuple with the Roles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoles

`func (o *ResponseUserDetails) SetRoles(v []Role)`

SetRoles sets Roles field to given value.

### HasRoles

`func (o *ResponseUserDetails) HasRoles() bool`

HasRoles returns a boolean if a field has been set.

### GetEmailVerified

`func (o *ResponseUserDetails) GetEmailVerified() bool`

GetEmailVerified returns the EmailVerified field if non-nil, zero value otherwise.

### GetEmailVerifiedOk

`func (o *ResponseUserDetails) GetEmailVerifiedOk() (*bool, bool)`

GetEmailVerifiedOk returns a tuple with the EmailVerified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailVerified

`func (o *ResponseUserDetails) SetEmailVerified(v bool)`

SetEmailVerified sets EmailVerified field to given value.

### HasEmailVerified

`func (o *ResponseUserDetails) HasEmailVerified() bool`

HasEmailVerified returns a boolean if a field has been set.

### GetLockedAccount

`func (o *ResponseUserDetails) GetLockedAccount() bool`

GetLockedAccount returns the LockedAccount field if non-nil, zero value otherwise.

### GetLockedAccountOk

`func (o *ResponseUserDetails) GetLockedAccountOk() (*bool, bool)`

GetLockedAccountOk returns a tuple with the LockedAccount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLockedAccount

`func (o *ResponseUserDetails) SetLockedAccount(v bool)`

SetLockedAccount sets LockedAccount field to given value.

### HasLockedAccount

`func (o *ResponseUserDetails) HasLockedAccount() bool`

HasLockedAccount returns a boolean if a field has been set.

### GetDeletedAccount

`func (o *ResponseUserDetails) GetDeletedAccount() bool`

GetDeletedAccount returns the DeletedAccount field if non-nil, zero value otherwise.

### GetDeletedAccountOk

`func (o *ResponseUserDetails) GetDeletedAccountOk() (*bool, bool)`

GetDeletedAccountOk returns a tuple with the DeletedAccount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeletedAccount

`func (o *ResponseUserDetails) SetDeletedAccount(v bool)`

SetDeletedAccount sets DeletedAccount field to given value.

### HasDeletedAccount

`func (o *ResponseUserDetails) HasDeletedAccount() bool`

HasDeletedAccount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


