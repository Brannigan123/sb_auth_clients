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

// checks if the ApiResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ApiResponse{}

// ApiResponse struct for ApiResponse
type ApiResponse struct {
	Errored *bool `json:"errored,omitempty"`
	Messages []string `json:"messages,omitempty"`
}

// NewApiResponse instantiates a new ApiResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewApiResponse() *ApiResponse {
	this := ApiResponse{}
	return &this
}

// NewApiResponseWithDefaults instantiates a new ApiResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewApiResponseWithDefaults() *ApiResponse {
	this := ApiResponse{}
	return &this
}

// GetErrored returns the Errored field value if set, zero value otherwise.
func (o *ApiResponse) GetErrored() bool {
	if o == nil || IsNil(o.Errored) {
		var ret bool
		return ret
	}
	return *o.Errored
}

// GetErroredOk returns a tuple with the Errored field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiResponse) GetErroredOk() (*bool, bool) {
	if o == nil || IsNil(o.Errored) {
		return nil, false
	}
	return o.Errored, true
}

// HasErrored returns a boolean if a field has been set.
func (o *ApiResponse) HasErrored() bool {
	if o != nil && !IsNil(o.Errored) {
		return true
	}

	return false
}

// SetErrored gets a reference to the given bool and assigns it to the Errored field.
func (o *ApiResponse) SetErrored(v bool) {
	o.Errored = &v
}

// GetMessages returns the Messages field value if set, zero value otherwise.
func (o *ApiResponse) GetMessages() []string {
	if o == nil || IsNil(o.Messages) {
		var ret []string
		return ret
	}
	return o.Messages
}

// GetMessagesOk returns a tuple with the Messages field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiResponse) GetMessagesOk() ([]string, bool) {
	if o == nil || IsNil(o.Messages) {
		return nil, false
	}
	return o.Messages, true
}

// HasMessages returns a boolean if a field has been set.
func (o *ApiResponse) HasMessages() bool {
	if o != nil && !IsNil(o.Messages) {
		return true
	}

	return false
}

// SetMessages gets a reference to the given []string and assigns it to the Messages field.
func (o *ApiResponse) SetMessages(v []string) {
	o.Messages = v
}

func (o ApiResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ApiResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Errored) {
		toSerialize["errored"] = o.Errored
	}
	if !IsNil(o.Messages) {
		toSerialize["messages"] = o.Messages
	}
	return toSerialize, nil
}

type NullableApiResponse struct {
	value *ApiResponse
	isSet bool
}

func (v NullableApiResponse) Get() *ApiResponse {
	return v.value
}

func (v *NullableApiResponse) Set(val *ApiResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableApiResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableApiResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableApiResponse(val *ApiResponse) *NullableApiResponse {
	return &NullableApiResponse{value: val, isSet: true}
}

func (v NullableApiResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableApiResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

