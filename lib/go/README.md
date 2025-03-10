# Go API client for authclient

Bran's Auth API

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [OpenAPI-spec](https://www.openapis.org/) from a remote server, you can easily generate an API client.

- API version: 1.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.GoClientCodegen

## Installation

Install the following dependencies:

```shell
go get github.com/stretchr/testify/assert
go get golang.org/x/net/context
```

Put the package under your project folder and add the following in import:

```golang
import authclient "github.com/GIT_USER_ID/GIT_REPO_ID"
```

To use a proxy, set the environment variable `HTTP_PROXY`:

```golang
os.Setenv("HTTP_PROXY", "http://proxy_name:proxy_port")
```

## Configuration of Server URL

Default configuration comes with `Servers` field that contains server objects as defined in the OpenAPI specification.

### Select Server Configuration

For using other server than the one defined on index 0 set context value `sw.ContextServerIndex` of type `int`.

```golang
ctx := context.WithValue(context.Background(), authclient.ContextServerIndex, 1)
```

### Templated Server URL

Templated server URL is formatted using default variables from configuration or from context value `sw.ContextServerVariables` of type `map[string]string`.

```golang
ctx := context.WithValue(context.Background(), authclient.ContextServerVariables, map[string]string{
	"basePath": "v2",
})
```

Note, enum values are always validated and all unused variables are silently ignored.

### URLs Configuration per Operation

Each operation can use different server URL defined using `OperationServers` map in the `Configuration`.
An operation is uniquely identified by `"{classname}Service.{nickname}"` string.
Similar rules for overriding default operation server index and variables applies by using `sw.ContextOperationServerIndices` and `sw.ContextOperationServerVariables` context maps.

```golang
ctx := context.WithValue(context.Background(), authclient.ContextOperationServerIndices, map[string]int{
	"{classname}Service.{nickname}": 2,
})
ctx = context.WithValue(context.Background(), authclient.ContextOperationServerVariables, map[string]map[string]string{
	"{classname}Service.{nickname}": {
		"port": "8443",
	},
})
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticateAPI* | [**Authenticate**](docs/AuthenticateAPI.md#authenticate) | **Post** /api/v1/auth/public/authenticate | 
*RefreshTokenAPI* | [**RefeshToken**](docs/RefreshTokenAPI.md#refeshtoken) | **Post** /api/v1/auth/public/refresh-token | 
*RegisterAPI* | [**Register**](docs/RegisterAPI.md#register) | **Post** /api/v1/auth/public/register | 
*ResetUserPasswordAPI* | [**ResetUserPassword**](docs/ResetUserPasswordAPI.md#resetuserpassword) | **Post** /api/v1/auth/public/reset-password | 
*SendCustomEmailVerificationAPI* | [**RequestOtp**](docs/SendCustomEmailVerificationAPI.md#requestotp) | **Post** /api/v1/auth/public/request-otp | 
*SendEmailVerificationMailAPI* | [**SendVerificationEmail**](docs/SendEmailVerificationMailAPI.md#sendverificationemail) | **Post** /api/v1/auth/authenticated/send-email-verification-mail | 
*SignoutAPI* | [**Signout**](docs/SignoutAPI.md#signout) | **Post** /api/v1/auth/authenticated/logout | 
*UpdateUserDetailsAPI* | [**UpdateUserDetails**](docs/UpdateUserDetailsAPI.md#updateuserdetails) | **Post** /api/v1/auth/authenticated/update-user-details | 
*ValidateEmailVerificationWithOtpAPI* | [**ValilidateEmailVerificationOtp**](docs/ValidateEmailVerificationWithOtpAPI.md#valilidateemailverificationotp) | **Post** /api/v1/auth/public/validate-email-verification-otp | 


## Documentation For Models

 - [AuthResponse](docs/AuthResponse.md)
 - [Date](docs/Date.md)
 - [EmailConfirmationOtpSubmitRequest](docs/EmailConfirmationOtpSubmitRequest.md)
 - [OtpRequest](docs/OtpRequest.md)
 - [OtpRequestResponse](docs/OtpRequestResponse.md)
 - [Permission](docs/Permission.md)
 - [ResetUserPasswordRequest](docs/ResetUserPasswordRequest.md)
 - [ResponseUserDetails](docs/ResponseUserDetails.md)
 - [Role](docs/Role.md)
 - [SigninRequest](docs/SigninRequest.md)
 - [SignoutRequest](docs/SignoutRequest.md)
 - [SignupRequest](docs/SignupRequest.md)
 - [TokenRefreshRequest](docs/TokenRefreshRequest.md)
 - [UserDetailsUpdateRequest](docs/UserDetailsUpdateRequest.md)


## Documentation For Authorization


Authentication schemes defined for the API:
### Authentication

- **Type**: HTTP Bearer token authentication

Example

```golang
auth := context.WithValue(context.Background(), sw.ContextAccessToken, "BEARER_TOKEN_STRING")
r, err := client.Service.Operation(auth, args)
```


## Documentation for Utility Methods

Due to the fact that model structure members are all pointers, this package contains
a number of utility functions to easily obtain pointers to values of basic types.
Each of these functions takes a value of the given basic type and returns a pointer to it:

* `PtrBool`
* `PtrInt`
* `PtrInt32`
* `PtrInt64`
* `PtrFloat`
* `PtrFloat32`
* `PtrFloat64`
* `PtrString`
* `PtrTime`

## Author



