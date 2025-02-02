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
 * The JobPlanRequest model module.
 * @module model/JobPlanRequest
 * @version 1.1.4
 */
class JobPlanRequest {
    /**
     * Constructs a new <code>JobPlanRequest</code>.
     * @alias module:model/JobPlanRequest
     */
    constructor() { 
        
        JobPlanRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>JobPlanRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/JobPlanRequest} obj Optional instance to populate.
     * @return {module:model/JobPlanRequest} The populated <code>JobPlanRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new JobPlanRequest();

            if (data.hasOwnProperty('Diff')) {
                obj['Diff'] = ApiClient.convertToType(data['Diff'], 'Boolean');
            }
            if (data.hasOwnProperty('Job')) {
                obj['Job'] = Job.constructFromObject(data['Job']);
            }
            if (data.hasOwnProperty('Namespace')) {
                obj['Namespace'] = ApiClient.convertToType(data['Namespace'], 'String');
            }
            if (data.hasOwnProperty('PolicyOverride')) {
                obj['PolicyOverride'] = ApiClient.convertToType(data['PolicyOverride'], 'Boolean');
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
 * @member {Boolean} Diff
 */
JobPlanRequest.prototype['Diff'] = undefined;

/**
 * @member {module:model/Job} Job
 */
JobPlanRequest.prototype['Job'] = undefined;

/**
 * @member {String} Namespace
 */
JobPlanRequest.prototype['Namespace'] = undefined;

/**
 * @member {Boolean} PolicyOverride
 */
JobPlanRequest.prototype['PolicyOverride'] = undefined;

/**
 * @member {String} Region
 */
JobPlanRequest.prototype['Region'] = undefined;

/**
 * @member {String} SecretID
 */
JobPlanRequest.prototype['SecretID'] = undefined;






export default JobPlanRequest;

