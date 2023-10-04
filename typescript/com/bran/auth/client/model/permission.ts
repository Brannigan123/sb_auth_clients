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


// May contain unused imports in some cases
// @ts-ignore
import { Role } from './role';

/**
 * 
 * @export
 * @interface Permission
 */
export interface Permission {
    /**
     * 
     * @type {string}
     * @memberof Permission
     */
    'id'?: string;
    /**
     * 
     * @type {string}
     * @memberof Permission
     */
    'name'?: string;
    /**
     * 
     * @type {Array<Role>}
     * @memberof Permission
     */
    'roles'?: Array<Role>;
    /**
     * 
     * @type {string}
     * @memberof Permission
     */
    'authority'?: string;
}

