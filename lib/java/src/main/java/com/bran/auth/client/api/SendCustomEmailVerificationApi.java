package com.bran.auth.client.api;

import com.bran.auth.client.ApiClient;

import com.bran.auth.client.model.OtpRequest;
import com.bran.auth.client.model.OtpRequestResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SendCustomEmailVerificationApi {
    private ApiClient apiClient;

    public SendCustomEmailVerificationApi() {
        this(new ApiClient());
    }

    public SendCustomEmailVerificationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - Default response
     * @param otpRequest  (required)
     * @return OtpRequestResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OtpRequestResponse requestOtp(OtpRequest otpRequest) throws RestClientException {
        return requestOtpWithHttpInfo(otpRequest).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Default response
     * @param otpRequest  (required)
     * @return ResponseEntity&lt;OtpRequestResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OtpRequestResponse> requestOtpWithHttpInfo(OtpRequest otpRequest) throws RestClientException {
        Object localVarPostBody = otpRequest;
        
        // verify the required parameter 'otpRequest' is set
        if (otpRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'otpRequest' when calling requestOtp");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<OtpRequestResponse> localReturnType = new ParameterizedTypeReference<OtpRequestResponse>() {};
        return apiClient.invokeAPI("/api/v1/auth/public/request-otp", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
