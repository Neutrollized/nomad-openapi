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
import TaskEvent from './TaskEvent';
import TaskHandle from './TaskHandle';

/**
 * The TaskState model module.
 * @module model/TaskState
 * @version 1.1.4
 */
class TaskState {
    /**
     * Constructs a new <code>TaskState</code>.
     * @alias module:model/TaskState
     */
    constructor() { 
        
        TaskState.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TaskState</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TaskState} obj Optional instance to populate.
     * @return {module:model/TaskState} The populated <code>TaskState</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TaskState();

            if (data.hasOwnProperty('Events')) {
                obj['Events'] = ApiClient.convertToType(data['Events'], [TaskEvent]);
            }
            if (data.hasOwnProperty('Failed')) {
                obj['Failed'] = ApiClient.convertToType(data['Failed'], 'Boolean');
            }
            if (data.hasOwnProperty('FinishedAt')) {
                obj['FinishedAt'] = ApiClient.convertToType(data['FinishedAt'], 'Date');
            }
            if (data.hasOwnProperty('LastRestart')) {
                obj['LastRestart'] = ApiClient.convertToType(data['LastRestart'], 'Date');
            }
            if (data.hasOwnProperty('Restarts')) {
                obj['Restarts'] = ApiClient.convertToType(data['Restarts'], 'Number');
            }
            if (data.hasOwnProperty('StartedAt')) {
                obj['StartedAt'] = ApiClient.convertToType(data['StartedAt'], 'Date');
            }
            if (data.hasOwnProperty('State')) {
                obj['State'] = ApiClient.convertToType(data['State'], 'String');
            }
            if (data.hasOwnProperty('TaskHandle')) {
                obj['TaskHandle'] = TaskHandle.constructFromObject(data['TaskHandle']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/TaskEvent>} Events
 */
TaskState.prototype['Events'] = undefined;

/**
 * @member {Boolean} Failed
 */
TaskState.prototype['Failed'] = undefined;

/**
 * @member {Date} FinishedAt
 */
TaskState.prototype['FinishedAt'] = undefined;

/**
 * @member {Date} LastRestart
 */
TaskState.prototype['LastRestart'] = undefined;

/**
 * @member {Number} Restarts
 */
TaskState.prototype['Restarts'] = undefined;

/**
 * @member {Date} StartedAt
 */
TaskState.prototype['StartedAt'] = undefined;

/**
 * @member {String} State
 */
TaskState.prototype['State'] = undefined;

/**
 * @member {module:model/TaskHandle} TaskHandle
 */
TaskState.prototype['TaskHandle'] = undefined;






export default TaskState;

