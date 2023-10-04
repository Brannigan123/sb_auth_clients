# ApiResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errored** | Pointer to **bool** |  | [optional] 
**Messages** | Pointer to **[]string** |  | [optional] 

## Methods

### NewApiResponse

`func NewApiResponse() *ApiResponse`

NewApiResponse instantiates a new ApiResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewApiResponseWithDefaults

`func NewApiResponseWithDefaults() *ApiResponse`

NewApiResponseWithDefaults instantiates a new ApiResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrored

`func (o *ApiResponse) GetErrored() bool`

GetErrored returns the Errored field if non-nil, zero value otherwise.

### GetErroredOk

`func (o *ApiResponse) GetErroredOk() (*bool, bool)`

GetErroredOk returns a tuple with the Errored field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrored

`func (o *ApiResponse) SetErrored(v bool)`

SetErrored sets Errored field to given value.

### HasErrored

`func (o *ApiResponse) HasErrored() bool`

HasErrored returns a boolean if a field has been set.

### GetMessages

`func (o *ApiResponse) GetMessages() []string`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *ApiResponse) GetMessagesOk() (*[]string, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *ApiResponse) SetMessages(v []string)`

SetMessages sets Messages field to given value.

### HasMessages

`func (o *ApiResponse) HasMessages() bool`

HasMessages returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


