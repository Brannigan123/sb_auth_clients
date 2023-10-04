package com.bran.auth.client.api;

import com.bran.auth.client.ApiClient;

import com.bran.auth.client.model.SigninRequest;
import com.bran.auth.client.model.SigninResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-04T12:25:09.068723+03:00[Africa/Nairobi]")
public class AuthenticateApi {
    private ApiClient apiClient;

    public AuthenticateApi() {
        this(new ApiClient());
    }

    public AuthenticateApi(ApiClient apiClient) {
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
     * @param signinRequest  (required)
     * @return SigninResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SigninResponse authenticate(SigninRequest signinRequest) throws RestClientException {
        return authenticateWithHttpInfo(signinRequest).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Default response
     * @param signinRequest  (required)
     * @return ResponseEntity&lt;SigninResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SigninResponse> authenticateWithHttpInfo(SigninRequest signinRequest) throws RestClientException {
        Object localVarPostBody = signinRequest;
        
        // verify the required parameter 'signinRequest' is set
        if (signinRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'signinRequest' when calling authenticate");
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

        ParameterizedTypeReference<SigninResponse> localReturnType = new ParameterizedTypeReference<SigninResponse>() {};
        return apiClient.invokeAPI("/api/v1/auth/public/authenticate", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
