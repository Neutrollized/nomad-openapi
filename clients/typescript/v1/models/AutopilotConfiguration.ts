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

export class AutopilotConfiguration {
    'cleanupDeadServers'?: boolean;
    'createIndex'?: number;
    'disableUpgradeMigration'?: boolean;
    'enableCustomUpgrades'?: boolean;
    'enableRedundancyZones'?: boolean;
    'lastContactThreshold'?: string;
    'maxTrailingLogs'?: number;
    'minQuorum'?: number;
    'modifyIndex'?: number;
    'serverStabilizationTime'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "cleanupDeadServers",
            "baseName": "CleanupDeadServers",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "createIndex",
            "baseName": "CreateIndex",
            "type": "number",
            "format": ""
        },
        {
            "name": "disableUpgradeMigration",
            "baseName": "DisableUpgradeMigration",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "enableCustomUpgrades",
            "baseName": "EnableCustomUpgrades",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "enableRedundancyZones",
            "baseName": "EnableRedundancyZones",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "lastContactThreshold",
            "baseName": "LastContactThreshold",
            "type": "string",
            "format": ""
        },
        {
            "name": "maxTrailingLogs",
            "baseName": "MaxTrailingLogs",
            "type": "number",
            "format": ""
        },
        {
            "name": "minQuorum",
            "baseName": "MinQuorum",
            "type": "number",
            "format": ""
        },
        {
            "name": "modifyIndex",
            "baseName": "ModifyIndex",
            "type": "number",
            "format": ""
        },
        {
            "name": "serverStabilizationTime",
            "baseName": "ServerStabilizationTime",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AutopilotConfiguration.attributeTypeMap;
    }
    
    public constructor() {
    }
}

