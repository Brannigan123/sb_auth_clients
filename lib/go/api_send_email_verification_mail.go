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


// SendEmailVerificationMailAPIService SendEmailVerificationMailAPI service
type SendEmailVerificationMailAPIService service

type ApiSendVerificationEmailRequest struct {
	ctx context.Context
	ApiService *SendEmailVerificationMailAPIService
}

func (r ApiSendVerificationEmailRequest) Execute() (*OtpRequestResponse, *http.Response, error) {
	return r.ApiService.SendVerificationEmailExecute(r)
}

/*
SendVerificationEmail Method for SendVerificationEmail

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiSendVerificationEmailRequest
*/
func (a *SendEmailVerificationMailAPIService) SendVerificationEmail(ctx context.Context) ApiSendVerificationEmailRequest {
	return ApiSendVerificationEmailRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return OtpRequestResponse
func (a *SendEmailVerificationMailAPIService) SendVerificationEmailExecute(r ApiSendVerificationEmailRequest) (*OtpRequestResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *OtpRequestResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "SendEmailVerificationMailAPIService.SendVerificationEmail")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/api/v1/auth/authenticated/send-email-verification-mail"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

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
