/**
 * Copyright (c) HashiCorp, Inc.
 * SPDX-License-Identifier: MPL-2.0
 */

/**
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Job from './Job';

/**
 * The JobValidateRequest model module.
 * @module model/JobValidateRequest
 * @version 1.1.4
 */
class JobValidateRequest {
    /**
     * Constructs a new <code>JobValidateRequest</code>.
     * @alias module:model/JobValidateRequest
     */
    constructor() { 
        
        JobValidateRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>JobValidateRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/JobValidateRequest} obj Optional instance to populate.
     * @return {module:model/JobValidateRequest} The populated <code>JobValidateRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new JobValidateRequest();

            if (data.hasOwnProperty('Job')) {
                obj['Job'] = Job.constructFromObject(data['Job']);
            }
            if (data.hasOwnProperty('Namespace')) {
                obj['Namespace'] = ApiClient.convertToType(data['Namespace'], 'String');
            }
            if (data.hasOwnProperty('Region')) {
                obj['Region'] = ApiClient.convertToType(data['Region'], 'String');
            }
            if (data.hasOwnProperty('SecretID')) {
                obj['SecretID'] = ApiClient.convertToType(data['SecretID'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Job} Job
 */
JobValidateRequest.prototype['Job'] = undefined;

/**
 * @member {String} Namespace
 */
JobValidateRequest.prototype['Namespace'] = undefined;

/**
 * @member {String} Region
 */
JobValidateRequest.prototype['Region'] = undefined;

/**
 * @member {String} SecretID
 */
JobValidateRequest.prototype['SecretID'] = undefined;






export default JobValidateRequest;

