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

// checks if the OtpRequestResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OtpRequestResponse{}

// OtpRequestResponse struct for OtpRequestResponse
type OtpRequestResponse struct {
	Errored *bool `json:"errored,omitempty"`
	Messages []string `json:"messages,omitempty"`
	OtpId *string `json:"otpId,omitempty"`
	Email *string `json:"email,omitempty"`
	ExpiryDate *Date `json:"expiryDate,omitempty"`
}

// NewOtpRequestResponse instantiates a new OtpRequestResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOtpRequestResponse() *OtpRequestResponse {
	this := OtpRequestResponse{}
	return &this
}

// NewOtpRequestResponseWithDefaults instantiates a new OtpRequestResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOtpRequestResponseWithDefaults() *OtpRequestResponse {
	this := OtpRequestResponse{}
	return &this
}

// GetErrored returns the Errored field value if set, zero value otherwise.
func (o *OtpRequestResponse) GetErrored() bool {
	if o == nil || IsNil(o.Errored) {
		var ret bool
		return ret
	}
	return *o.Errored
}

// GetErroredOk returns a tuple with the Errored field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OtpRequestResponse) GetErroredOk() (*bool, bool) {
	if o == nil || IsNil(o.Errored) {
		return nil, false
	}
	return o.Errored, true
}

// HasErrored returns a boolean if a field has been set.
func (o *OtpRequestResponse) HasErrored() bool {
	if o != nil && !IsNil(o.Errored) {
		return true
	}

	return false
}

// SetErrored gets a reference to the given bool and assigns it to the Errored field.
func (o *OtpRequestResponse) SetErrored(v bool) {
	o.Errored = &v
}

// GetMessages returns the Messages field value if set, zero value otherwise.
func (o *OtpRequestResponse) GetMessages() []string {
	if o == nil || IsNil(o.Messages) {
		var ret []string
		return ret
	}
	return o.Messages
}

// GetMessagesOk returns a tuple with the Messages field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OtpRequestResponse) GetMessagesOk() ([]string, bool) {
	if o == nil || IsNil(o.Messages) {
		return nil, false
	}
	return o.Messages, true
}

// HasMessages returns a boolean if a field has been set.
func (o *OtpRequestResponse) HasMessages() bool {
	if o != nil && !IsNil(o.Messages) {
		return true
	}

	return false
}

// SetMessages gets a reference to the given []string and assigns it to the Messages field.
func (o *OtpRequestResponse) SetMessages(v []string) {
	o.Messages = v
}

// GetOtpId returns the OtpId field value if set, zero value otherwise.
func (o *OtpRequestResponse) GetOtpId() string {
	if o == nil || IsNil(o.OtpId) {
		var ret string
		return ret
	}
	return *o.OtpId
}

// GetOtpIdOk returns a tuple with the OtpId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OtpRequestResponse) GetOtpIdOk() (*string, bool) {
	if o == nil || IsNil(o.OtpId) {
		return nil, false
	}
	return o.OtpId, true
}

// HasOtpId returns a boolean if a field has been set.
func (o *OtpRequestResponse) HasOtpId() bool {
	if o != nil && !IsNil(o.OtpId) {
		return true
	}

	return false
}

// SetOtpId gets a reference to the given string and assigns it to the OtpId field.
func (o *OtpRequestResponse) SetOtpId(v string) {
	o.OtpId = &v
}

// GetEmail returns the Email field value if set, zero value otherwise.
func (o *OtpRequestResponse) GetEmail() string {
	if o == nil || IsNil(o.Email) {
		var ret string
		return ret
	}
	return *o.Email
}

// GetEmailOk returns a tuple with the Email field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OtpRequestResponse) GetEmailOk() (*string, bool) {
	if o == nil || IsNil(o.Email) {
		return nil, false
	}
	return o.Email, true
}

// HasEmail returns a boolean if a field has been set.
func (o *OtpRequestResponse) HasEmail() bool {
	if o != nil && !IsNil(o.Email) {
		return true
	}

	return false
}

// SetEmail gets a reference to the given string and assigns it to the Email field.
func (o *OtpRequestResponse) SetEmail(v string) {
	o.Email = &v
}

// GetExpiryDate returns the ExpiryDate field value if set, zero value otherwise.
func (o *OtpRequestResponse) GetExpiryDate() Date {
	if o == nil || IsNil(o.ExpiryDate) {
		var ret Date
		return ret
	}
	return *o.ExpiryDate
}

// GetExpiryDateOk returns a tuple with the ExpiryDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OtpRequestResponse) GetExpiryDateOk() (*Date, bool) {
	if o == nil || IsNil(o.ExpiryDate) {
		return nil, false
	}
	return o.ExpiryDate, true
}

// HasExpiryDate returns a boolean if a field has been set.
func (o *OtpRequestResponse) HasExpiryDate() bool {
	if o != nil && !IsNil(o.ExpiryDate) {
		return true
	}

	return false
}

// SetExpiryDate gets a reference to the given Date and assigns it to the ExpiryDate field.
func (o *OtpRequestResponse) SetExpiryDate(v Date) {
	o.ExpiryDate = &v
}

func (o OtpRequestResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OtpRequestResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Errored) {
		toSerialize["errored"] = o.Errored
	}
	if !IsNil(o.Messages) {
		toSerialize["messages"] = o.Messages
	}
	if !IsNil(o.OtpId) {
		toSerialize["otpId"] = o.OtpId
	}
	if !IsNil(o.Email) {
		toSerialize["email"] = o.Email
	}
	if !IsNil(o.ExpiryDate) {
		toSerialize["expiryDate"] = o.ExpiryDate
	}
	return toSerialize, nil
}

type NullableOtpRequestResponse struct {
	value *OtpRequestResponse
	isSet bool
}

func (v NullableOtpRequestResponse) Get() *OtpRequestResponse {
	return v.value
}

func (v *NullableOtpRequestResponse) Set(val *OtpRequestResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableOtpRequestResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableOtpRequestResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOtpRequestResponse(val *OtpRequestResponse) *NullableOtpRequestResponse {
	return &NullableOtpRequestResponse{value: val, isSet: true}
}

func (v NullableOtpRequestResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOtpRequestResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


