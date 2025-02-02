/**
 * Copyright (c) HashiCorp, Inc.
 * SPDX-License-Identifier: MPL-2.0
 */

/**
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import NodeScoreMeta from './NodeScoreMeta';
import Resources from './Resources';

/**
 * The AllocationMetric model module.
 * @module model/AllocationMetric
 * @version 1.1.4
 */
class AllocationMetric {
    /**
     * Constructs a new <code>AllocationMetric</code>.
     * @alias module:model/AllocationMetric
     */
    constructor() { 
        
        AllocationMetric.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AllocationMetric</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AllocationMetric} obj Optional instance to populate.
     * @return {module:model/AllocationMetric} The populated <code>AllocationMetric</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AllocationMetric();

            if (data.hasOwnProperty('AllocationTime')) {
                obj['AllocationTime'] = ApiClient.convertToType(data['AllocationTime'], 'Number');
            }
            if (data.hasOwnProperty('ClassExhausted')) {
                obj['ClassExhausted'] = ApiClient.convertToType(data['ClassExhausted'], {'String': 'Number'});
            }
            if (data.hasOwnProperty('ClassFiltered')) {
                obj['ClassFiltered'] = ApiClient.convertToType(data['ClassFiltered'], {'String': 'Number'});
            }
            if (data.hasOwnProperty('CoalescedFailures')) {
                obj['CoalescedFailures'] = ApiClient.convertToType(data['CoalescedFailures'], 'Number');
            }
            if (data.hasOwnProperty('ConstraintFiltered')) {
                obj['ConstraintFiltered'] = ApiClient.convertToType(data['ConstraintFiltered'], {'String': 'Number'});
            }
            if (data.hasOwnProperty('DimensionExhausted')) {
                obj['DimensionExhausted'] = ApiClient.convertToType(data['DimensionExhausted'], {'String': 'Number'});
            }
            if (data.hasOwnProperty('NodesAvailable')) {
                obj['NodesAvailable'] = ApiClient.convertToType(data['NodesAvailable'], {'String': 'Number'});
            }
            if (data.hasOwnProperty('NodesEvaluated')) {
                obj['NodesEvaluated'] = ApiClient.convertToType(data['NodesEvaluated'], 'Number');
            }
            if (data.hasOwnProperty('NodesExhausted')) {
                obj['NodesExhausted'] = ApiClient.convertToType(data['NodesExhausted'], 'Number');
            }
            if (data.hasOwnProperty('NodesFiltered')) {
                obj['NodesFiltered'] = ApiClient.convertToType(data['NodesFiltered'], 'Number');
            }
            if (data.hasOwnProperty('QuotaExhausted')) {
                obj['QuotaExhausted'] = ApiClient.convertToType(data['QuotaExhausted'], ['String']);
            }
            if (data.hasOwnProperty('ResourcesExhausted')) {
                obj['ResourcesExhausted'] = ApiClient.convertToType(data['ResourcesExhausted'], {'String': Resources});
            }
            if (data.hasOwnProperty('ScoreMetaData')) {
                obj['ScoreMetaData'] = ApiClient.convertToType(data['ScoreMetaData'], [NodeScoreMeta]);
            }
            if (data.hasOwnProperty('Scores')) {
                obj['Scores'] = ApiClient.convertToType(data['Scores'], {'String': 'Number'});
            }
        }
        return obj;
    }


}

/**
 * @member {Number} AllocationTime
 */
AllocationMetric.prototype['AllocationTime'] = undefined;

/**
 * @member {Object.<String, Number>} ClassExhausted
 */
AllocationMetric.prototype['ClassExhausted'] = undefined;

/**
 * @member {Object.<String, Number>} ClassFiltered
 */
AllocationMetric.prototype['ClassFiltered'] = undefined;

/**
 * @member {Number} CoalescedFailures
 */
AllocationMetric.prototype['CoalescedFailures'] = undefined;

/**
 * @member {Object.<String, Number>} ConstraintFiltered
 */
AllocationMetric.prototype['ConstraintFiltered'] = undefined;

/**
 * @member {Object.<String, Number>} DimensionExhausted
 */
AllocationMetric.prototype['DimensionExhausted'] = undefined;

/**
 * @member {Object.<String, Number>} NodesAvailable
 */
AllocationMetric.prototype['NodesAvailable'] = undefined;

/**
 * @member {Number} NodesEvaluated
 */
AllocationMetric.prototype['NodesEvaluated'] = undefined;

/**
 * @member {Number} NodesExhausted
 */
AllocationMetric.prototype['NodesExhausted'] = undefined;

/**
 * @member {Number} NodesFiltered
 */
AllocationMetric.prototype['NodesFiltered'] = undefined;

/**
 * @member {Array.<String>} QuotaExhausted
 */
AllocationMetric.prototype['QuotaExhausted'] = undefined;

/**
 * @member {Object.<String, module:model/Resources>} ResourcesExhausted
 */
AllocationMetric.prototype['ResourcesExhausted'] = undefined;

/**
 * @member {Array.<module:model/NodeScoreMeta>} ScoreMetaData
 */
AllocationMetric.prototype['ScoreMetaData'] = undefined;

/**
 * @member {Object.<String, Number>} Scores
 */
AllocationMetric.prototype['Scores'] = undefined;






export default AllocationMetric;

