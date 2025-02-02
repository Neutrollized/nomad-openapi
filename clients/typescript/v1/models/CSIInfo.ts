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

import { CSIControllerInfo } from './CSIControllerInfo';
import { CSINodeInfo } from './CSINodeInfo';
import { HttpFile } from '../http/http';

export class CSIInfo {
    'allocID'?: string;
    'controllerInfo'?: CSIControllerInfo;
    'healthDescription'?: string;
    'healthy'?: boolean;
    'nodeInfo'?: CSINodeInfo;
    'pluginID'?: string;
    'requiresControllerPlugin'?: boolean;
    'requiresTopologies'?: boolean;
    'updateTime'?: Date;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "allocID",
            "baseName": "AllocID",
            "type": "string",
            "format": ""
        },
        {
            "name": "controllerInfo",
            "baseName": "ControllerInfo",
            "type": "CSIControllerInfo",
            "format": ""
        },
        {
            "name": "healthDescription",
            "baseName": "HealthDescription",
            "type": "string",
            "format": ""
        },
        {
            "name": "healthy",
            "baseName": "Healthy",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "nodeInfo",
            "baseName": "NodeInfo",
            "type": "CSINodeInfo",
            "format": ""
        },
        {
            "name": "pluginID",
            "baseName": "PluginID",
            "type": "string",
            "format": ""
        },
        {
            "name": "requiresControllerPlugin",
            "baseName": "RequiresControllerPlugin",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "requiresTopologies",
            "baseName": "RequiresTopologies",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "updateTime",
            "baseName": "UpdateTime",
            "type": "Date",
            "format": "date-time"
        }    ];

    static getAttributeTypeMap() {
        return CSIInfo.attributeTypeMap;
    }
    
    public constructor() {
    }
}

