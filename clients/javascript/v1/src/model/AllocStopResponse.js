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
 * The AllocStopResponse model module.
 * @module model/AllocStopResponse
 * @version 1.1.4
 */
class AllocStopResponse {
    /**
     * Constructs a new <code>AllocStopResponse</code>.
     * @alias module:model/AllocStopResponse
     */
    constructor() { 
        
        AllocStopResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AllocStopResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AllocStopResponse} obj Optional instance to populate.
     * @return {module:model/AllocStopResponse} The populated <code>AllocStopResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AllocStopResponse();

            if (data.hasOwnProperty('EvalID')) {
                obj['EvalID'] = ApiClient.convertToType(data['EvalID'], 'String');
            }
            if (data.hasOwnProperty('Index')) {
                obj['Index'] = ApiClient.convertToType(data['Index'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {String} EvalID
 */
AllocStopResponse.prototype['EvalID'] = undefined;

/**
 * @member {Number} Index
 */
AllocStopResponse.prototype['Index'] = undefined;






export default AllocStopResponse;

