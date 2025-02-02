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

import { AllocatedSharedResources } from './AllocatedSharedResources';
import { AllocatedTaskResources } from './AllocatedTaskResources';
import { HttpFile } from '../http/http';

export class AllocatedResources {
    'shared'?: AllocatedSharedResources;
    'tasks'?: { [key: string]: AllocatedTaskResources; };

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "shared",
            "baseName": "Shared",
            "type": "AllocatedSharedResources",
            "format": ""
        },
        {
            "name": "tasks",
            "baseName": "Tasks",
            "type": "{ [key: string]: AllocatedTaskResources; }",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AllocatedResources.attributeTypeMap;
    }
    
    public constructor() {
    }
}

