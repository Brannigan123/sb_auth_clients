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
import { SignoutRequest } from '../../../../../com/bran/auth/client/model';
/**
 * SignoutApi - axios parameter creator
 * @export
 */
export const SignoutApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @param {SignoutRequest} signoutRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        signout: async (signoutRequest: SignoutRequest, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'signoutRequest' is not null or undefined
            assertParamExists('signout', 'signoutRequest', signoutRequest)
            const localVarPath = `/api/v1/auth/authenticated/logout`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication Authentication required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(signoutRequest, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * SignoutApi - functional programming interface
 * @export
 */
export const SignoutApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = SignoutApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @param {SignoutRequest} signoutRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async signout(signoutRequest: SignoutRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<AuthResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.signout(signoutRequest, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * SignoutApi - factory interface
 * @export
 */
export const SignoutApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = SignoutApiFp(configuration)
    return {
        /**
         * 
         * @param {SignoutRequest} signoutRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        signout(signoutRequest: SignoutRequest, options?: any): AxiosPromise<AuthResponse> {
            return localVarFp.signout(signoutRequest, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * SignoutApi - object-oriented interface
 * @export
 * @class SignoutApi
 * @extends {BaseAPI}
 */
export class SignoutApi extends BaseAPI {
    /**
     * 
     * @param {SignoutRequest} signoutRequest 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SignoutApi
     */
    public signout(signoutRequest: SignoutRequest, options?: AxiosRequestConfig) {
        return SignoutApiFp(this.configuration).signout(signoutRequest, options).then((request) => request(this.axios, this.basePath));
    }
}

