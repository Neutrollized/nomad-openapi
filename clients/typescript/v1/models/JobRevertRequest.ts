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

export class JobRevertRequest {
    'consulToken'?: string;
    'enforcePriorVersion'?: number;
    'jobID'?: string;
    'jobVersion'?: number;
    'namespace'?: string;
    'region'?: string;
    'secretID'?: string;
    'vaultToken'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "consulToken",
            "baseName": "ConsulToken",
            "type": "string",
            "format": ""
        },
        {
            "name": "enforcePriorVersion",
            "baseName": "EnforcePriorVersion",
            "type": "number",
            "format": ""
        },
        {
            "name": "jobID",
            "baseName": "JobID",
            "type": "string",
            "format": ""
        },
        {
            "name": "jobVersion",
            "baseName": "JobVersion",
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
            "name": "region",
            "baseName": "Region",
            "type": "string",
            "format": ""
        },
        {
            "name": "secretID",
            "baseName": "SecretID",
            "type": "string",
            "format": ""
        },
        {
            "name": "vaultToken",
            "baseName": "VaultToken",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return JobRevertRequest.attributeTypeMap;
    }
    
    public constructor() {
    }
}

