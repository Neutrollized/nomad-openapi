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

import { Affinity } from './Affinity';
import { Constraint } from './Constraint';
import { MigrateStrategy } from './MigrateStrategy';
import { Multiregion } from './Multiregion';
import { ParameterizedJobConfig } from './ParameterizedJobConfig';
import { PeriodicConfig } from './PeriodicConfig';
import { ReschedulePolicy } from './ReschedulePolicy';
import { Spread } from './Spread';
import { TaskGroup } from './TaskGroup';
import { UpdateStrategy } from './UpdateStrategy';
import { HttpFile } from '../http/http';

export class Job {
    'affinities'?: Array<Affinity>;
    'allAtOnce'?: boolean;
    'constraints'?: Array<Constraint>;
    'consulNamespace'?: string;
    'consulToken'?: string;
    'createIndex'?: number;
    'datacenters'?: Array<string>;
    'dispatchIdempotencyToken'?: string;
    'dispatched'?: boolean;
    'ID'?: string;
    'jobModifyIndex'?: number;
    'meta'?: { [key: string]: string; };
    'migrate'?: MigrateStrategy;
    'modifyIndex'?: number;
    'multiregion'?: Multiregion;
    'name'?: string;
    'namespace'?: string;
    'nomadTokenID'?: string;
    'parameterizedJob'?: ParameterizedJobConfig;
    'parentID'?: string;
    'payload'?: string;
    'periodic'?: PeriodicConfig;
    'priority'?: number;
    'region'?: string;
    'reschedule'?: ReschedulePolicy;
    'spreads'?: Array<Spread>;
    'stable'?: boolean;
    'status'?: string;
    'statusDescription'?: string;
    'stop'?: boolean;
    'submitTime'?: number;
    'taskGroups'?: Array<TaskGroup>;
    'type'?: string;
    'update'?: UpdateStrategy;
    'vaultNamespace'?: string;
    'vaultToken'?: string;
    'version'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "affinities",
            "baseName": "Affinities",
            "type": "Array<Affinity>",
            "format": ""
        },
        {
            "name": "allAtOnce",
            "baseName": "AllAtOnce",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "constraints",
            "baseName": "Constraints",
            "type": "Array<Constraint>",
            "format": ""
        },
        {
            "name": "consulNamespace",
            "baseName": "ConsulNamespace",
            "type": "string",
            "format": ""
        },
        {
            "name": "consulToken",
            "baseName": "ConsulToken",
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
            "name": "datacenters",
            "baseName": "Datacenters",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "dispatchIdempotencyToken",
            "baseName": "DispatchIdempotencyToken",
            "type": "string",
            "format": ""
        },
        {
            "name": "dispatched",
            "baseName": "Dispatched",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "ID",
            "baseName": "ID",
            "type": "string",
            "format": ""
        },
        {
            "name": "jobModifyIndex",
            "baseName": "JobModifyIndex",
            "type": "number",
            "format": ""
        },
        {
            "name": "meta",
            "baseName": "Meta",
            "type": "{ [key: string]: string; }",
            "format": ""
        },
        {
            "name": "migrate",
            "baseName": "Migrate",
            "type": "MigrateStrategy",
            "format": ""
        },
        {
            "name": "modifyIndex",
            "baseName": "ModifyIndex",
            "type": "number",
            "format": ""
        },
        {
            "name": "multiregion",
            "baseName": "Multiregion",
            "type": "Multiregion",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "Name",
            "type": "string",
            "format": ""
        },
        {
            "name": "namespace",
            "baseName": "Namespace",
            "type": "string",
            "format": ""
        },
        {
            "name": "nomadTokenID",
            "baseName": "NomadTokenID",
            "type": "string",
            "format": ""
        },
        {
            "name": "parameterizedJob",
            "baseName": "ParameterizedJob",
            "type": "ParameterizedJobConfig",
            "format": ""
        },
        {
            "name": "parentID",
            "baseName": "ParentID",
            "type": "string",
            "format": ""
        },
        {
            "name": "payload",
            "baseName": "Payload",
            "type": "string",
            "format": "byte"
        },
        {
            "name": "periodic",
            "baseName": "Periodic",
            "type": "PeriodicConfig",
            "format": ""
        },
        {
            "name": "priority",
            "baseName": "Priority",
            "type": "number",
            "format": ""
        },
        {
            "name": "region",
            "baseName": "Region",
            "type": "string",
            "format": ""
        },
        {
            "name": "reschedule",
            "baseName": "Reschedule",
            "type": "ReschedulePolicy",
            "format": ""
        },
        {
            "name": "spreads",
            "baseName": "Spreads",
            "type": "Array<Spread>",
            "format": ""
        },
        {
            "name": "stable",
            "baseName": "Stable",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "Status",
            "type": "string",
            "format": ""
        },
        {
            "name": "statusDescription",
            "baseName": "StatusDescription",
            "type": "string",
            "format": ""
        },
        {
            "name": "stop",
            "baseName": "Stop",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "submitTime",
            "baseName": "SubmitTime",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "taskGroups",
            "baseName": "TaskGroups",
            "type": "Array<TaskGroup>",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "Type",
            "type": "string",
            "format": ""
        },
        {
            "name": "update",
            "baseName": "Update",
            "type": "UpdateStrategy",
            "format": ""
        },
        {
            "name": "vaultNamespace",
            "baseName": "VaultNamespace",
            "type": "string",
            "format": ""
        },
        {
            "name": "vaultToken",
            "baseName": "VaultToken",
            "type": "string",
            "format": ""
        },
        {
            "name": "version",
            "baseName": "Version",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Job.attributeTypeMap;
    }
    
    public constructor() {
    }
}

