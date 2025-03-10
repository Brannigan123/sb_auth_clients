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

// checks if the EmailConfirmationOtpSubmitRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &EmailConfirmationOtpSubmitRequest{}

// EmailConfirmationOtpSubmitRequest struct for EmailConfirmationOtpSubmitRequest
type EmailConfirmationOtpSubmitRequest struct {
	OtpId *string `json:"otpId,omitempty"`
	Code *string `json:"code,omitempty"`
}

// NewEmailConfirmationOtpSubmitRequest instantiates a new EmailConfirmationOtpSubmitRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEmailConfirmationOtpSubmitRequest() *EmailConfirmationOtpSubmitRequest {
	this := EmailConfirmationOtpSubmitRequest{}
	return &this
}

// NewEmailConfirmationOtpSubmitRequestWithDefaults instantiates a new EmailConfirmationOtpSubmitRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEmailConfirmationOtpSubmitRequestWithDefaults() *EmailConfirmationOtpSubmitRequest {
	this := EmailConfirmationOtpSubmitRequest{}
	return &this
}

// GetOtpId returns the OtpId field value if set, zero value otherwise.
func (o *EmailConfirmationOtpSubmitRequest) GetOtpId() string {
	if o == nil || IsNil(o.OtpId) {
		var ret string
		return ret
	}
	return *o.OtpId
}

// GetOtpIdOk returns a tuple with the OtpId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EmailConfirmationOtpSubmitRequest) GetOtpIdOk() (*string, bool) {
	if o == nil || IsNil(o.OtpId) {
		return nil, false
	}
	return o.OtpId, true
}

// HasOtpId returns a boolean if a field has been set.
func (o *EmailConfirmationOtpSubmitRequest) HasOtpId() bool {
	if o != nil && !IsNil(o.OtpId) {
		return true
	}

	return false
}

// SetOtpId gets a reference to the given string and assigns it to the OtpId field.
func (o *EmailConfirmationOtpSubmitRequest) SetOtpId(v string) {
	o.OtpId = &v
}

// GetCode returns the Code field value if set, zero value otherwise.
func (o *EmailConfirmationOtpSubmitRequest) GetCode() string {
	if o == nil || IsNil(o.Code) {
		var ret string
		return ret
	}
	return *o.Code
}

// GetCodeOk returns a tuple with the Code field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EmailConfirmationOtpSubmitRequest) GetCodeOk() (*string, bool) {
	if o == nil || IsNil(o.Code) {
		return nil, false
	}
	return o.Code, true
}

// HasCode returns a boolean if a field has been set.
func (o *EmailConfirmationOtpSubmitRequest) HasCode() bool {
	if o != nil && !IsNil(o.Code) {
		return true
	}

	return false
}

// SetCode gets a reference to the given string and assigns it to the Code field.
func (o *EmailConfirmationOtpSubmitRequest) SetCode(v string) {
	o.Code = &v
}

func (o EmailConfirmationOtpSubmitRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o EmailConfirmationOtpSubmitRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.OtpId) {
		toSerialize["otpId"] = o.OtpId
	}
	if !IsNil(o.Code) {
		toSerialize["code"] = o.Code
	}
	return toSerialize, nil
}

type NullableEmailConfirmationOtpSubmitRequest struct {
	value *EmailConfirmationOtpSubmitRequest
	isSet bool
}

func (v NullableEmailConfirmationOtpSubmitRequest) Get() *EmailConfirmationOtpSubmitRequest {
	return v.value
}

func (v *NullableEmailConfirmationOtpSubmitRequest) Set(val *EmailConfirmationOtpSubmitRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableEmailConfirmationOtpSubmitRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableEmailConfirmationOtpSubmitRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEmailConfirmationOtpSubmitRequest(val *EmailConfirmationOtpSubmitRequest) *NullableEmailConfirmationOtpSubmitRequest {
	return &NullableEmailConfirmationOtpSubmitRequest{value: val, isSet: true}
}

func (v NullableEmailConfirmationOtpSubmitRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEmailConfirmationOtpSubmitRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


