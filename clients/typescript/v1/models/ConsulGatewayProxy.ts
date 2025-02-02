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

import { AnyType } from './AnyType';
import { ConsulGatewayBindAddress } from './ConsulGatewayBindAddress';
import { HttpFile } from '../http/http';

export class ConsulGatewayProxy {
    'config'?: { [key: string]: AnyType; };
    'connectTimeout'?: number;
    'envoyDNSDiscoveryType'?: string;
    'envoyGatewayBindAddresses'?: { [key: string]: ConsulGatewayBindAddress; };
    'envoyGatewayBindTaggedAddresses'?: boolean;
    'envoyGatewayNoDefaultBind'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "config",
            "baseName": "Config",
            "type": "{ [key: string]: AnyType; }",
            "format": ""
        },
        {
            "name": "connectTimeout",
            "baseName": "ConnectTimeout",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "envoyDNSDiscoveryType",
            "baseName": "EnvoyDNSDiscoveryType",
            "type": "string",
            "format": ""
        },
        {
            "name": "envoyGatewayBindAddresses",
            "baseName": "EnvoyGatewayBindAddresses",
            "type": "{ [key: string]: ConsulGatewayBindAddress; }",
            "format": ""
        },
        {
            "name": "envoyGatewayBindTaggedAddresses",
            "baseName": "EnvoyGatewayBindTaggedAddresses",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "envoyGatewayNoDefaultBind",
            "baseName": "EnvoyGatewayNoDefaultBind",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ConsulGatewayProxy.attributeTypeMap;
    }
    
    public constructor() {
    }
}

