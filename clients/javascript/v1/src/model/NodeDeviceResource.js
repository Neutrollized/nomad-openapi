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
import Attribute from './Attribute';
import NodeDevice from './NodeDevice';

/**
 * The NodeDeviceResource model module.
 * @module model/NodeDeviceResource
 * @version 1.1.4
 */
class NodeDeviceResource {
    /**
     * Constructs a new <code>NodeDeviceResource</code>.
     * @alias module:model/NodeDeviceResource
     */
    constructor() { 
        
        NodeDeviceResource.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NodeDeviceResource</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NodeDeviceResource} obj Optional instance to populate.
     * @return {module:model/NodeDeviceResource} The populated <code>NodeDeviceResource</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NodeDeviceResource();

            if (data.hasOwnProperty('Attributes')) {
                obj['Attributes'] = ApiClient.convertToType(data['Attributes'], {'String': Attribute});
            }
            if (data.hasOwnProperty('Instances')) {
                obj['Instances'] = ApiClient.convertToType(data['Instances'], [NodeDevice]);
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('Vendor')) {
                obj['Vendor'] = ApiClient.convertToType(data['Vendor'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, module:model/Attribute>} Attributes
 */
NodeDeviceResource.prototype['Attributes'] = undefined;

/**
 * @member {Array.<module:model/NodeDevice>} Instances
 */
NodeDeviceResource.prototype['Instances'] = undefined;

/**
 * @member {String} Name
 */
NodeDeviceResource.prototype['Name'] = undefined;

/**
 * @member {String} Type
 */
NodeDeviceResource.prototype['Type'] = undefined;

/**
 * @member {String} Vendor
 */
NodeDeviceResource.prototype['Vendor'] = undefined;






export default NodeDeviceResource;

