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


// UpdateUserDetailsAPIService UpdateUserDetailsAPI service
type UpdateUserDetailsAPIService service

type ApiUpdateUserDetailsRequest struct {
	ctx context.Context
	ApiService *UpdateUserDetailsAPIService
	userDetailsUpdateRequest *UserDetailsUpdateRequest
}

func (r ApiUpdateUserDetailsRequest) UserDetailsUpdateRequest(userDetailsUpdateRequest UserDetailsUpdateRequest) ApiUpdateUserDetailsRequest {
	r.userDetailsUpdateRequest = &userDetailsUpdateRequest
	return r
}

func (r ApiUpdateUserDetailsRequest) Execute() (*AuthResponse, *http.Response, error) {
	return r.ApiService.UpdateUserDetailsExecute(r)
}

/*
UpdateUserDetails Method for UpdateUserDetails

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiUpdateUserDetailsRequest
*/
func (a *UpdateUserDetailsAPIService) UpdateUserDetails(ctx context.Context) ApiUpdateUserDetailsRequest {
	return ApiUpdateUserDetailsRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return AuthResponse
func (a *UpdateUserDetailsAPIService) UpdateUserDetailsExecute(r ApiUpdateUserDetailsRequest) (*AuthResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *AuthResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "UpdateUserDetailsAPIService.UpdateUserDetails")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/v1/auth/authenticated/update-user-details"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.userDetailsUpdateRequest == nil {
		return localVarReturnValue, nil, reportError("userDetailsUpdateRequest is required and must be specified")
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
	localVarPostBody = r.userDetailsUpdateRequest
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
