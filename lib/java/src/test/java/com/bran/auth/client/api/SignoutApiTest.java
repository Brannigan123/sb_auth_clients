/*
 * API for AuthApplication
 * Bran's Auth API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bran.auth.client.api;

import com.bran.auth.client.model.AuthResponse;
import com.bran.auth.client.model.SignoutRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SignoutApi
 */
@Ignore
public class SignoutApiTest {

    private final SignoutApi api = new SignoutApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void signoutTest() {
        SignoutRequest signoutRequest = null;
        AuthResponse response = api.signout(signoutRequest);

        // TODO: test validations
    }
    
}
