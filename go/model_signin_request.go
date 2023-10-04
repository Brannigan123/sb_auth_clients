/*
API for AuthApplication

Bran's Auth API

API version: 1.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package authclient

import (
	"encoding/json"
)

// checks if the SigninRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &SigninRequest{}

// SigninRequest struct for SigninRequest
type SigninRequest struct {
	EmailOrUsername *string `json:"emailOrUsername,omitempty"`
	Password *string `json:"password,omitempty"`
}

// NewSigninRequest instantiates a new SigninRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSigninRequest() *SigninRequest {
	this := SigninRequest{}
	return &this
}

// NewSigninRequestWithDefaults instantiates a new SigninRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSigninRequestWithDefaults() *SigninRequest {
	this := SigninRequest{}
	return &this
}

// GetEmailOrUsername returns the EmailOrUsername field value if set, zero value otherwise.
func (o *SigninRequest) GetEmailOrUsername() string {
	if o == nil || IsNil(o.EmailOrUsername) {
		var ret string
		return ret
	}
	return *o.EmailOrUsername
}

// GetEmailOrUsernameOk returns a tuple with the EmailOrUsername field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SigninRequest) GetEmailOrUsernameOk() (*string, bool) {
	if o == nil || IsNil(o.EmailOrUsername) {
		return nil, false
	}
	return o.EmailOrUsername, true
}

// HasEmailOrUsername returns a boolean if a field has been set.
func (o *SigninRequest) HasEmailOrUsername() bool {
	if o != nil && !IsNil(o.EmailOrUsername) {
		return true
	}

	return false
}

// SetEmailOrUsername gets a reference to the given string and assigns it to the EmailOrUsername field.
func (o *SigninRequest) SetEmailOrUsername(v string) {
	o.EmailOrUsername = &v
}

// GetPassword returns the Password field value if set, zero value otherwise.
func (o *SigninRequest) GetPassword() string {
	if o == nil || IsNil(o.Password) {
		var ret string
		return ret
	}
	return *o.Password
}

// GetPasswordOk returns a tuple with the Password field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SigninRequest) GetPasswordOk() (*string, bool) {
	if o == nil || IsNil(o.Password) {
		return nil, false
	}
	return o.Password, true
}

// HasPassword returns a boolean if a field has been set.
func (o *SigninRequest) HasPassword() bool {
	if o != nil && !IsNil(o.Password) {
		return true
	}

	return false
}

// SetPassword gets a reference to the given string and assigns it to the Password field.
func (o *SigninRequest) SetPassword(v string) {
	o.Password = &v
}

func (o SigninRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o SigninRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.EmailOrUsername) {
		toSerialize["emailOrUsername"] = o.EmailOrUsername
	}
	if !IsNil(o.Password) {
		toSerialize["password"] = o.Password
	}
	return toSerialize, nil
}

type NullableSigninRequest struct {
	value *SigninRequest
	isSet bool
}

func (v NullableSigninRequest) Get() *SigninRequest {
	return v.value
}

func (v *NullableSigninRequest) Set(val *SigninRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableSigninRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableSigninRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSigninRequest(val *SigninRequest) *NullableSigninRequest {
	return &NullableSigninRequest{value: val, isSet: true}
}

func (v NullableSigninRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSigninRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

