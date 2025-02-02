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

export class DesiredUpdates {
    'canary'?: number;
    'destructiveUpdate'?: number;
    'ignore'?: number;
    'inPlaceUpdate'?: number;
    'migrate'?: number;
    'place'?: number;
    'preemptions'?: number;
    'stop'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "canary",
            "baseName": "Canary",
            "type": "number",
            "format": ""
        },
        {
            "name": "destructiveUpdate",
            "baseName": "DestructiveUpdate",
            "type": "number",
            "format": ""
        },
        {
            "name": "ignore",
            "baseName": "Ignore",
            "type": "number",
            "format": ""
        },
        {
            "name": "inPlaceUpdate",
            "baseName": "InPlaceUpdate",
            "type": "number",
            "format": ""
        },
        {
            "name": "migrate",
            "baseName": "Migrate",
            "type": "number",
            "format": ""
        },
        {
            "name": "place",
            "baseName": "Place",
            "type": "number",
            "format": ""
        },
        {
            "name": "preemptions",
            "baseName": "Preemptions",
            "type": "number",
            "format": ""
        },
        {
            "name": "stop",
            "baseName": "Stop",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return DesiredUpdates.attributeTypeMap;
    }
    
    public constructor() {
    }
}

