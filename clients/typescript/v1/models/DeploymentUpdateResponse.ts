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

export class DeploymentUpdateResponse {
    'deploymentModifyIndex'?: number;
    'evalCreateIndex'?: number;
    'evalID'?: string;
    'lastIndex'?: number;
    'requestTime'?: number;
    'revertedJobVersion'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "deploymentModifyIndex",
            "baseName": "DeploymentModifyIndex",
            "type": "number",
            "format": ""
        },
        {
            "name": "evalCreateIndex",
            "baseName": "EvalCreateIndex",
            "type": "number",
            "format": ""
        },
        {
            "name": "evalID",
            "baseName": "EvalID",
            "type": "string",
            "format": ""
        },
        {
            "name": "lastIndex",
            "baseName": "LastIndex",
            "type": "number",
            "format": ""
        },
        {
            "name": "requestTime",
            "baseName": "RequestTime",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "revertedJobVersion",
            "baseName": "RevertedJobVersion",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return DeploymentUpdateResponse.attributeTypeMap;
    }
    
    public constructor() {
    }
}

