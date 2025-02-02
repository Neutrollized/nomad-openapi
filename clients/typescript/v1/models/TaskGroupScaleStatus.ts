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

import { ScalingEvent } from './ScalingEvent';
import { HttpFile } from '../http/http';

export class TaskGroupScaleStatus {
    'desired'?: number;
    'events'?: Array<ScalingEvent>;
    'healthy'?: number;
    'placed'?: number;
    'running'?: number;
    'unhealthy'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "desired",
            "baseName": "Desired",
            "type": "number",
            "format": ""
        },
        {
            "name": "events",
            "baseName": "Events",
            "type": "Array<ScalingEvent>",
            "format": ""
        },
        {
            "name": "healthy",
            "baseName": "Healthy",
            "type": "number",
            "format": ""
        },
        {
            "name": "placed",
            "baseName": "Placed",
            "type": "number",
            "format": ""
        },
        {
            "name": "running",
            "baseName": "Running",
            "type": "number",
            "format": ""
        },
        {
            "name": "unhealthy",
            "baseName": "Unhealthy",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return TaskGroupScaleStatus.attributeTypeMap;
    }
    
    public constructor() {
    }
}

