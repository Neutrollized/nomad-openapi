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

import { NamespaceCapabilities } from './NamespaceCapabilities';
import { HttpFile } from '../http/http';

export class Namespace {
    'capabilities'?: NamespaceCapabilities;
    'createIndex'?: number;
    'description'?: string;
    'meta'?: { [key: string]: string; };
    'modifyIndex'?: number;
    'name'?: string;
    'quota'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "capabilities",
            "baseName": "Capabilities",
            "type": "NamespaceCapabilities",
            "format": ""
        },
        {
            "name": "createIndex",
            "baseName": "CreateIndex",
            "type": "number",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "Description",
            "type": "string",
            "format": ""
        },
        {
            "name": "meta",
            "baseName": "Meta",
            "type": "{ [key: string]: string; }",
            "format": ""
        },
        {
            "name": "modifyIndex",
            "baseName": "ModifyIndex",
            "type": "number",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "Name",
            "type": "string",
            "format": ""
        },
        {
            "name": "quota",
            "baseName": "Quota",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Namespace.attributeTypeMap;
    }
    
    public constructor() {
    }
}

