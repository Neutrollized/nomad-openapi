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
import SchedulerConfiguration from './SchedulerConfiguration';

/**
 * The SchedulerConfigurationResponse model module.
 * @module model/SchedulerConfigurationResponse
 * @version 1.1.4
 */
class SchedulerConfigurationResponse {
    /**
     * Constructs a new <code>SchedulerConfigurationResponse</code>.
     * @alias module:model/SchedulerConfigurationResponse
     */
    constructor() { 
        
        SchedulerConfigurationResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SchedulerConfigurationResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SchedulerConfigurationResponse} obj Optional instance to populate.
     * @return {module:model/SchedulerConfigurationResponse} The populated <code>SchedulerConfigurationResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SchedulerConfigurationResponse();

            if (data.hasOwnProperty('KnownLeader')) {
                obj['KnownLeader'] = ApiClient.convertToType(data['KnownLeader'], 'Boolean');
            }
            if (data.hasOwnProperty('LastContact')) {
                obj['LastContact'] = ApiClient.convertToType(data['LastContact'], 'Number');
            }
            if (data.hasOwnProperty('LastIndex')) {
                obj['LastIndex'] = ApiClient.convertToType(data['LastIndex'], 'Number');
            }
            if (data.hasOwnProperty('NextToken')) {
                obj['NextToken'] = ApiClient.convertToType(data['NextToken'], 'String');
            }
            if (data.hasOwnProperty('RequestTime')) {
                obj['RequestTime'] = ApiClient.convertToType(data['RequestTime'], 'Number');
            }
            if (data.hasOwnProperty('SchedulerConfig')) {
                obj['SchedulerConfig'] = SchedulerConfiguration.constructFromObject(data['SchedulerConfig']);
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} KnownLeader
 */
SchedulerConfigurationResponse.prototype['KnownLeader'] = undefined;

/**
 * @member {Number} LastContact
 */
SchedulerConfigurationResponse.prototype['LastContact'] = undefined;

/**
 * @member {Number} LastIndex
 */
SchedulerConfigurationResponse.prototype['LastIndex'] = undefined;

/**
 * @member {String} NextToken
 */
SchedulerConfigurationResponse.prototype['NextToken'] = undefined;

/**
 * @member {Number} RequestTime
 */
SchedulerConfigurationResponse.prototype['RequestTime'] = undefined;

/**
 * @member {module:model/SchedulerConfiguration} SchedulerConfig
 */
SchedulerConfigurationResponse.prototype['SchedulerConfig'] = undefined;






export default SchedulerConfigurationResponse;

