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
 * The SampledValue model module.
 * @module model/SampledValue
 * @version 1.1.4
 */
class SampledValue {
    /**
     * Constructs a new <code>SampledValue</code>.
     * @alias module:model/SampledValue
     */
    constructor() { 
        
        SampledValue.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SampledValue</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SampledValue} obj Optional instance to populate.
     * @return {module:model/SampledValue} The populated <code>SampledValue</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SampledValue();

            if (data.hasOwnProperty('Count')) {
                obj['Count'] = ApiClient.convertToType(data['Count'], 'Number');
            }
            if (data.hasOwnProperty('Labels')) {
                obj['Labels'] = ApiClient.convertToType(data['Labels'], {'String': 'String'});
            }
            if (data.hasOwnProperty('Max')) {
                obj['Max'] = ApiClient.convertToType(data['Max'], 'Number');
            }
            if (data.hasOwnProperty('Mean')) {
                obj['Mean'] = ApiClient.convertToType(data['Mean'], 'Number');
            }
            if (data.hasOwnProperty('Min')) {
                obj['Min'] = ApiClient.convertToType(data['Min'], 'Number');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Rate')) {
                obj['Rate'] = ApiClient.convertToType(data['Rate'], 'Number');
            }
            if (data.hasOwnProperty('Stddev')) {
                obj['Stddev'] = ApiClient.convertToType(data['Stddev'], 'Number');
            }
            if (data.hasOwnProperty('Sum')) {
                obj['Sum'] = ApiClient.convertToType(data['Sum'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} Count
 */
SampledValue.prototype['Count'] = undefined;

/**
 * @member {Object.<String, String>} Labels
 */
SampledValue.prototype['Labels'] = undefined;

/**
 * @member {Number} Max
 */
SampledValue.prototype['Max'] = undefined;

/**
 * @member {Number} Mean
 */
SampledValue.prototype['Mean'] = undefined;

/**
 * @member {Number} Min
 */
SampledValue.prototype['Min'] = undefined;

/**
 * @member {String} Name
 */
SampledValue.prototype['Name'] = undefined;

/**
 * @member {Number} Rate
 */
SampledValue.prototype['Rate'] = undefined;

/**
 * @member {Number} Stddev
 */
SampledValue.prototype['Stddev'] = undefined;

/**
 * @member {Number} Sum
 */
SampledValue.prototype['Sum'] = undefined;






export default SampledValue;

