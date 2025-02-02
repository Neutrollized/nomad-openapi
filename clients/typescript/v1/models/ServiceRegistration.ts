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

export class ServiceRegistration {
    'address'?: string;
    'allocID'?: string;
    'createIndex'?: number;
    'datacenter'?: string;
    'ID'?: string;
    'jobID'?: string;
    'modifyIndex'?: number;
    'namespace'?: string;
    'nodeID'?: string;
    'port'?: number;
    'serviceName'?: string;
    'tags'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "address",
            "baseName": "Address",
            "type": "string",
            "format": ""
        },
        {
            "name": "allocID",
            "baseName": "AllocID",
            "type": "string",
            "format": ""
        },
        {
            "name": "createIndex",
            "baseName": "CreateIndex",
            "type": "number",
            "format": ""
        },
        {
            "name": "datacenter",
            "baseName": "Datacenter",
            "type": "string",
            "format": ""
        },
        {
            "name": "ID",
            "baseName": "ID",
            "type": "string",
            "format": ""
        },
        {
            "name": "jobID",
            "baseName": "JobID",
            "type": "string",
            "format": ""
        },
        {
            "name": "modifyIndex",
            "baseName": "ModifyIndex",
            "type": "number",
            "format": ""
        },
        {
            "name": "namespace",
            "baseName": "Namespace",
            "type": "string",
            "format": ""
        },
        {
            "name": "nodeID",
            "baseName": "NodeID",
            "type": "string",
            "format": ""
        },
        {
            "name": "port",
            "baseName": "Port",
            "type": "number",
            "format": ""
        },
        {
            "name": "serviceName",
            "baseName": "ServiceName",
            "type": "string",
            "format": ""
        },
        {
            "name": "tags",
            "baseName": "Tags",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ServiceRegistration.attributeTypeMap;
    }
    
    public constructor() {
    }
}

