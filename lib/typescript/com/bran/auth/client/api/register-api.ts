/* tslint:disable */
/* eslint-disable */
/**
 * API for AuthApplication
 * Bran\'s Auth API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import type { Configuration } from '../../../../../configuration';
import type { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import globalAxios from 'axios';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from '../../../../../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../../../../../base';
// @ts-ignore
import { AuthResponse } from '../../../../../com/bran/auth/client/model';
// @ts-ignore
import { SignupRequest } from '../../../../../com/bran/auth/client/model';
/**
 * RegisterApi - axios parameter creator
 * @export
 */
export const RegisterApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @param {SignupRequest} signupRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        register: async (signupRequest: SignupRequest, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'signupRequest' is not null or undefined
            assertParamExists('register', 'signupRequest', signupRequest)
            const localVarPath = `/api/v1/auth/public/register`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(signupRequest, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * RegisterApi - functional programming interface
 * @export
 */
export const RegisterApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = RegisterApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @param {SignupRequest} signupRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async register(signupRequest: SignupRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<AuthResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.register(signupRequest, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * RegisterApi - factory interface
 * @export
 */
export const RegisterApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = RegisterApiFp(configuration)
    return {
        /**
         * 
         * @param {SignupRequest} signupRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        register(signupRequest: SignupRequest, options?: any): AxiosPromise<AuthResponse> {
            return localVarFp.register(signupRequest, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * RegisterApi - object-oriented interface
 * @export
 * @class RegisterApi
 * @extends {BaseAPI}
 */
export class RegisterApi extends BaseAPI {
    /**
     * 
     * @param {SignupRequest} signupRequest 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RegisterApi
     */
    public register(signupRequest: SignupRequest, options?: AxiosRequestConfig) {
        return RegisterApiFp(this.configuration).register(signupRequest, options).then((request) => request(this.axios, this.basePath));
    }
}

