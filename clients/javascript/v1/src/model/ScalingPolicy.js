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
 * The ScalingPolicy model module.
 * @module model/ScalingPolicy
 * @version 1.1.4
 */
class ScalingPolicy {
    /**
     * Constructs a new <code>ScalingPolicy</code>.
     * @alias module:model/ScalingPolicy
     */
    constructor() { 
        
        ScalingPolicy.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ScalingPolicy</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ScalingPolicy} obj Optional instance to populate.
     * @return {module:model/ScalingPolicy} The populated <code>ScalingPolicy</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ScalingPolicy();

            if (data.hasOwnProperty('CreateIndex')) {
                obj['CreateIndex'] = ApiClient.convertToType(data['CreateIndex'], 'Number');
            }
            if (data.hasOwnProperty('Enabled')) {
                obj['Enabled'] = ApiClient.convertToType(data['Enabled'], 'Boolean');
            }
            if (data.hasOwnProperty('ID')) {
                obj['ID'] = ApiClient.convertToType(data['ID'], 'String');
            }
            if (data.hasOwnProperty('Max')) {
                obj['Max'] = ApiClient.convertToType(data['Max'], 'Number');
            }
            if (data.hasOwnProperty('Min')) {
                obj['Min'] = ApiClient.convertToType(data['Min'], 'Number');
            }
            if (data.hasOwnProperty('ModifyIndex')) {
                obj['ModifyIndex'] = ApiClient.convertToType(data['ModifyIndex'], 'Number');
            }
            if (data.hasOwnProperty('Namespace')) {
                obj['Namespace'] = ApiClient.convertToType(data['Namespace'], 'String');
            }
            if (data.hasOwnProperty('Policy')) {
                obj['Policy'] = ApiClient.convertToType(data['Policy'], {'String': Object});
            }
            if (data.hasOwnProperty('Target')) {
                obj['Target'] = ApiClient.convertToType(data['Target'], {'String': 'String'});
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} CreateIndex
 */
ScalingPolicy.prototype['CreateIndex'] = undefined;

/**
 * @member {Boolean} Enabled
 */
ScalingPolicy.prototype['Enabled'] = undefined;

/**
 * @member {String} ID
 */
ScalingPolicy.prototype['ID'] = undefined;

/**
 * @member {Number} Max
 */
ScalingPolicy.prototype['Max'] = undefined;

/**
 * @member {Number} Min
 */
ScalingPolicy.prototype['Min'] = undefined;

/**
 * @member {Number} ModifyIndex
 */
ScalingPolicy.prototype['ModifyIndex'] = undefined;

/**
 * @member {String} Namespace
 */
ScalingPolicy.prototype['Namespace'] = undefined;

/**
 * @member {Object.<String, Object>} Policy
 */
ScalingPolicy.prototype['Policy'] = undefined;

/**
 * @member {Object.<String, String>} Target
 */
ScalingPolicy.prototype['Target'] = undefined;

/**
 * @member {String} Type
 */
ScalingPolicy.prototype['Type'] = undefined;






export default ScalingPolicy;

