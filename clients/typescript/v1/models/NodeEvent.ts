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

export class NodeEvent {
    'createIndex'?: number;
    'details'?: { [key: string]: string; };
    'message'?: string;
    'subsystem'?: string;
    'timestamp'?: Date;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "createIndex",
            "baseName": "CreateIndex",
            "type": "number",
            "format": ""
        },
        {
            "name": "details",
            "baseName": "Details",
            "type": "{ [key: string]: string; }",
            "format": ""
        },
        {
            "name": "message",
            "baseName": "Message",
            "type": "string",
            "format": ""
        },
        {
            "name": "subsystem",
            "baseName": "Subsystem",
            "type": "string",
            "format": ""
        },
        {
            "name": "timestamp",
            "baseName": "Timestamp",
            "type": "Date",
            "format": "date-time"
        }    ];

    static getAttributeTypeMap() {
        return NodeEvent.attributeTypeMap;
    }
    
    public constructor() {
    }
}

