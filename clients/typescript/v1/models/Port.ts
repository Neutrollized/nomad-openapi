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

import { HttpFile } from '../http/http';

export class Port {
    'hostNetwork'?: string;
    'label'?: string;
    'to'?: number;
    'value'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "hostNetwork",
            "baseName": "HostNetwork",
            "type": "string",
            "format": ""
        },
        {
            "name": "label",
            "baseName": "Label",
            "type": "string",
            "format": ""
        },
        {
            "name": "to",
            "baseName": "To",
            "type": "number",
            "format": ""
        },
        {
            "name": "value",
            "baseName": "Value",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Port.attributeTypeMap;
    }
    
    public constructor() {
    }
}

