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

/**
 * The PreemptionConfig model module.
 * @module model/PreemptionConfig
 * @version 1.1.4
 */
class PreemptionConfig {
    /**
     * Constructs a new <code>PreemptionConfig</code>.
     * @alias module:model/PreemptionConfig
     */
    constructor() { 
        
        PreemptionConfig.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PreemptionConfig</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PreemptionConfig} obj Optional instance to populate.
     * @return {module:model/PreemptionConfig} The populated <code>PreemptionConfig</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PreemptionConfig();

            if (data.hasOwnProperty('BatchSchedulerEnabled')) {
                obj['BatchSchedulerEnabled'] = ApiClient.convertToType(data['BatchSchedulerEnabled'], 'Boolean');
            }
            if (data.hasOwnProperty('ServiceSchedulerEnabled')) {
                obj['ServiceSchedulerEnabled'] = ApiClient.convertToType(data['ServiceSchedulerEnabled'], 'Boolean');
            }
            if (data.hasOwnProperty('SysBatchSchedulerEnabled')) {
                obj['SysBatchSchedulerEnabled'] = ApiClient.convertToType(data['SysBatchSchedulerEnabled'], 'Boolean');
            }
            if (data.hasOwnProperty('SystemSchedulerEnabled')) {
                obj['SystemSchedulerEnabled'] = ApiClient.convertToType(data['SystemSchedulerEnabled'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} BatchSchedulerEnabled
 */
PreemptionConfig.prototype['BatchSchedulerEnabled'] = undefined;

/**
 * @member {Boolean} ServiceSchedulerEnabled
 */
PreemptionConfig.prototype['ServiceSchedulerEnabled'] = undefined;

/**
 * @member {Boolean} SysBatchSchedulerEnabled
 */
PreemptionConfig.prototype['SysBatchSchedulerEnabled'] = undefined;

/**
 * @member {Boolean} SystemSchedulerEnabled
 */
PreemptionConfig.prototype['SystemSchedulerEnabled'] = undefined;






export default PreemptionConfig;

