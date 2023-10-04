/*
API for AuthApplication

Bran's Auth API

API version: 1.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package authclient

import (
	"bytes"
	"context"
	"io"
	"net/http"
	"net/url"
)


// RegisterAPIService RegisterAPI service
type RegisterAPIService service

type ApiRegisterRequest struct {
	ctx context.Context
	ApiService *RegisterAPIService
	signupRequest *SignupRequest
}

func (r ApiRegisterRequest) SignupRequest(signupRequest SignupRequest) ApiRegisterRequest {
	r.signupRequest = &signupRequest
	return r
}

func (r ApiRegisterRequest) Execute() (*SignupResponse, *http.Response, error) {
	return r.ApiService.RegisterExecute(r)
}

/*
Register Method for Register

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiRegisterRequest
*/
func (a *RegisterAPIService) Register(ctx context.Context) ApiRegisterRequest {
	return ApiRegisterRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return SignupResponse
func (a *RegisterAPIService) RegisterExecute(r ApiRegisterRequest) (*SignupResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *SignupResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "RegisterAPIService.Register")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/v1/auth/public/register"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.signupRequest == nil {
		return localVarReturnValue, nil, reportError("signupRequest is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"*/*"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.signupRequest
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
