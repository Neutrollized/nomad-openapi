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

/**
 * The TaskEvent model module.
 * @module model/TaskEvent
 * @version 1.1.4
 */
class TaskEvent {
    /**
     * Constructs a new <code>TaskEvent</code>.
     * @alias module:model/TaskEvent
     */
    constructor() { 
        
        TaskEvent.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TaskEvent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TaskEvent} obj Optional instance to populate.
     * @return {module:model/TaskEvent} The populated <code>TaskEvent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TaskEvent();

            if (data.hasOwnProperty('Details')) {
                obj['Details'] = ApiClient.convertToType(data['Details'], {'String': 'String'});
            }
            if (data.hasOwnProperty('DiskLimit')) {
                obj['DiskLimit'] = ApiClient.convertToType(data['DiskLimit'], 'Number');
            }
            if (data.hasOwnProperty('DiskSize')) {
                obj['DiskSize'] = ApiClient.convertToType(data['DiskSize'], 'Number');
            }
            if (data.hasOwnProperty('DisplayMessage')) {
                obj['DisplayMessage'] = ApiClient.convertToType(data['DisplayMessage'], 'String');
            }
            if (data.hasOwnProperty('DownloadError')) {
                obj['DownloadError'] = ApiClient.convertToType(data['DownloadError'], 'String');
            }
            if (data.hasOwnProperty('DriverError')) {
                obj['DriverError'] = ApiClient.convertToType(data['DriverError'], 'String');
            }
            if (data.hasOwnProperty('DriverMessage')) {
                obj['DriverMessage'] = ApiClient.convertToType(data['DriverMessage'], 'String');
            }
            if (data.hasOwnProperty('ExitCode')) {
                obj['ExitCode'] = ApiClient.convertToType(data['ExitCode'], 'Number');
            }
            if (data.hasOwnProperty('FailedSibling')) {
                obj['FailedSibling'] = ApiClient.convertToType(data['FailedSibling'], 'String');
            }
            if (data.hasOwnProperty('FailsTask')) {
                obj['FailsTask'] = ApiClient.convertToType(data['FailsTask'], 'Boolean');
            }
            if (data.hasOwnProperty('GenericSource')) {
                obj['GenericSource'] = ApiClient.convertToType(data['GenericSource'], 'String');
            }
            if (data.hasOwnProperty('KillError')) {
                obj['KillError'] = ApiClient.convertToType(data['KillError'], 'String');
            }
            if (data.hasOwnProperty('KillReason')) {
                obj['KillReason'] = ApiClient.convertToType(data['KillReason'], 'String');
            }
            if (data.hasOwnProperty('KillTimeout')) {
                obj['KillTimeout'] = ApiClient.convertToType(data['KillTimeout'], 'Number');
            }
            if (data.hasOwnProperty('Message')) {
                obj['Message'] = ApiClient.convertToType(data['Message'], 'String');
            }
            if (data.hasOwnProperty('RestartReason')) {
                obj['RestartReason'] = ApiClient.convertToType(data['RestartReason'], 'String');
            }
            if (data.hasOwnProperty('SetupError')) {
                obj['SetupError'] = ApiClient.convertToType(data['SetupError'], 'String');
            }
            if (data.hasOwnProperty('Signal')) {
                obj['Signal'] = ApiClient.convertToType(data['Signal'], 'Number');
            }
            if (data.hasOwnProperty('StartDelay')) {
                obj['StartDelay'] = ApiClient.convertToType(data['StartDelay'], 'Number');
            }
            if (data.hasOwnProperty('TaskSignal')) {
                obj['TaskSignal'] = ApiClient.convertToType(data['TaskSignal'], 'String');
            }
            if (data.hasOwnProperty('TaskSignalReason')) {
                obj['TaskSignalReason'] = ApiClient.convertToType(data['TaskSignalReason'], 'String');
            }
            if (data.hasOwnProperty('Time')) {
                obj['Time'] = ApiClient.convertToType(data['Time'], 'Number');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('ValidationError')) {
                obj['ValidationError'] = ApiClient.convertToType(data['ValidationError'], 'String');
            }
            if (data.hasOwnProperty('VaultError')) {
                obj['VaultError'] = ApiClient.convertToType(data['VaultError'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, String>} Details
 */
TaskEvent.prototype['Details'] = undefined;

/**
 * @member {Number} DiskLimit
 */
TaskEvent.prototype['DiskLimit'] = undefined;

/**
 * @member {Number} DiskSize
 */
TaskEvent.prototype['DiskSize'] = undefined;

/**
 * @member {String} DisplayMessage
 */
TaskEvent.prototype['DisplayMessage'] = undefined;

/**
 * @member {String} DownloadError
 */
TaskEvent.prototype['DownloadError'] = undefined;

/**
 * @member {String} DriverError
 */
TaskEvent.prototype['DriverError'] = undefined;

/**
 * @member {String} DriverMessage
 */
TaskEvent.prototype['DriverMessage'] = undefined;

/**
 * @member {Number} ExitCode
 */
TaskEvent.prototype['ExitCode'] = undefined;

/**
 * @member {String} FailedSibling
 */
TaskEvent.prototype['FailedSibling'] = undefined;

/**
 * @member {Boolean} FailsTask
 */
TaskEvent.prototype['FailsTask'] = undefined;

/**
 * @member {String} GenericSource
 */
TaskEvent.prototype['GenericSource'] = undefined;

/**
 * @member {String} KillError
 */
TaskEvent.prototype['KillError'] = undefined;

/**
 * @member {String} KillReason
 */
TaskEvent.prototype['KillReason'] = undefined;

/**
 * @member {Number} KillTimeout
 */
TaskEvent.prototype['KillTimeout'] = undefined;

/**
 * @member {String} Message
 */
TaskEvent.prototype['Message'] = undefined;

/**
 * @member {String} RestartReason
 */
TaskEvent.prototype['RestartReason'] = undefined;

/**
 * @member {String} SetupError
 */
TaskEvent.prototype['SetupError'] = undefined;

/**
 * @member {Number} Signal
 */
TaskEvent.prototype['Signal'] = undefined;

/**
 * @member {Number} StartDelay
 */
TaskEvent.prototype['StartDelay'] = undefined;

/**
 * @member {String} TaskSignal
 */
TaskEvent.prototype['TaskSignal'] = undefined;

/**
 * @member {String} TaskSignalReason
 */
TaskEvent.prototype['TaskSignalReason'] = undefined;

/**
 * @member {Number} Time
 */
TaskEvent.prototype['Time'] = undefined;

/**
 * @member {String} Type
 */
TaskEvent.prototype['Type'] = undefined;

/**
 * @member {String} ValidationError
 */
TaskEvent.prototype['ValidationError'] = undefined;

/**
 * @member {String} VaultError
 */
TaskEvent.prototype['VaultError'] = undefined;






export default TaskEvent;

