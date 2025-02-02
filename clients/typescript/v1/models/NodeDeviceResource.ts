/**
 * Copyright (c) HashiCorp, Inc.
 * SPDX-License-Identifier: MPL-2.0
 */

/**
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.1.4
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Attribute } from './Attribute';
import { NodeDevice } from './NodeDevice';
import { HttpFile } from '../http/http';

export class NodeDeviceResource {
    'attributes'?: { [key: string]: Attribute; };
    'instances'?: Array<NodeDevice>;
    'name'?: string;
    'type'?: string;
    'vendor'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "attributes",
            "baseName": "Attributes",
            "type": "{ [key: string]: Attribute; }",
            "format": ""
        },
        {
            "name": "instances",
            "baseName": "Instances",
            "type": "Array<NodeDevice>",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "Name",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "Type",
            "type": "string",
            "format": ""
        },
        {
            "name": "vendor",
            "baseName": "Vendor",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return NodeDeviceResource.attributeTypeMap;
    }
    
    public constructor() {
    }
}

