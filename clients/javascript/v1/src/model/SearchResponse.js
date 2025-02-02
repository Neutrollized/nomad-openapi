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
 * The SearchResponse model module.
 * @module model/SearchResponse
 * @version 1.1.4
 */
class SearchResponse {
    /**
     * Constructs a new <code>SearchResponse</code>.
     * @alias module:model/SearchResponse
     */
    constructor() { 
        
        SearchResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SearchResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SearchResponse} obj Optional instance to populate.
     * @return {module:model/SearchResponse} The populated <code>SearchResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SearchResponse();

            if (data.hasOwnProperty('KnownLeader')) {
                obj['KnownLeader'] = ApiClient.convertToType(data['KnownLeader'], 'Boolean');
            }
            if (data.hasOwnProperty('LastContact')) {
                obj['LastContact'] = ApiClient.convertToType(data['LastContact'], 'Number');
            }
            if (data.hasOwnProperty('LastIndex')) {
                obj['LastIndex'] = ApiClient.convertToType(data['LastIndex'], 'Number');
            }
            if (data.hasOwnProperty('Matches')) {
                obj['Matches'] = ApiClient.convertToType(data['Matches'], {'String': ['String']});
            }
            if (data.hasOwnProperty('NextToken')) {
                obj['NextToken'] = ApiClient.convertToType(data['NextToken'], 'String');
            }
            if (data.hasOwnProperty('RequestTime')) {
                obj['RequestTime'] = ApiClient.convertToType(data['RequestTime'], 'Number');
            }
            if (data.hasOwnProperty('Truncations')) {
                obj['Truncations'] = ApiClient.convertToType(data['Truncations'], {'String': 'Boolean'});
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} KnownLeader
 */
SearchResponse.prototype['KnownLeader'] = undefined;

/**
 * @member {Number} LastContact
 */
SearchResponse.prototype['LastContact'] = undefined;

/**
 * @member {Number} LastIndex
 */
SearchResponse.prototype['LastIndex'] = undefined;

/**
 * @member {Object.<String, Array.<String>>} Matches
 */
SearchResponse.prototype['Matches'] = undefined;

/**
 * @member {String} NextToken
 */
SearchResponse.prototype['NextToken'] = undefined;

/**
 * @member {Number} RequestTime
 */
SearchResponse.prototype['RequestTime'] = undefined;

/**
 * @member {Object.<String, Boolean>} Truncations
 */
SearchResponse.prototype['Truncations'] = undefined;






export default SearchResponse;

