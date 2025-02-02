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


import ApiClient from "../ApiClient";
import QuotaSpec from '../model/QuotaSpec';

/**
* Enterprise service.
* @module api/EnterpriseApi
* @version 1.1.4
*/
export default class EnterpriseApi {

    /**
    * Constructs a new EnterpriseApi. 
    * @alias module:api/EnterpriseApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the createQuotaSpec operation.
     * @callback module:api/EnterpriseApi~createQuotaSpecCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/QuotaSpec} quotaSpec 
     * @param {Object} opts Optional parameters
     * @param {String} opts.region Filters results based on the specified region.
     * @param {String} opts.namespace Filters results based on the specified namespace.
     * @param {String} opts.xNomadToken A Nomad ACL token.
     * @param {String} opts.idempotencyToken Can be used to ensure operations are only run once.
     * @param {module:api/EnterpriseApi~createQuotaSpecCallback} callback The callback function, accepting three arguments: error, data, response
     */
    createQuotaSpec(quotaSpec, opts, callback) {
      opts = opts || {};
      let postBody = quotaSpec;
      // verify the required parameter 'quotaSpec' is set
      if (quotaSpec === undefined || quotaSpec === null) {
        throw new Error("Missing the required parameter 'quotaSpec' when calling createQuotaSpec");
      }

      let pathParams = {
      };
      let queryParams = {
        'region': opts['region'],
        'namespace': opts['namespace'],
        'idempotency_token': opts['idempotencyToken']
      };
      let headerParams = {
        'X-Nomad-Token': opts['xNomadToken']
      };
      let formParams = {
      };

      let authNames = ['X-Nomad-Token'];
      let contentTypes = ['application/json'];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/quota', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteQuotaSpec operation.
     * @callback module:api/EnterpriseApi~deleteQuotaSpecCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} specName The quota spec identifier.
     * @param {Object} opts Optional parameters
     * @param {String} opts.region Filters results based on the specified region.
     * @param {String} opts.namespace Filters results based on the specified namespace.
     * @param {String} opts.xNomadToken A Nomad ACL token.
     * @param {String} opts.idempotencyToken Can be used to ensure operations are only run once.
     * @param {module:api/EnterpriseApi~deleteQuotaSpecCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteQuotaSpec(specName, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'specName' is set
      if (specName === undefined || specName === null) {
        throw new Error("Missing the required parameter 'specName' when calling deleteQuotaSpec");
      }

      let pathParams = {
        'specName': specName
      };
      let queryParams = {
        'region': opts['region'],
        'namespace': opts['namespace'],
        'idempotency_token': opts['idempotencyToken']
      };
      let headerParams = {
        'X-Nomad-Token': opts['xNomadToken']
      };
      let formParams = {
      };

      let authNames = ['X-Nomad-Token'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/quota/{specName}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getQuotaSpec operation.
     * @callback module:api/EnterpriseApi~getQuotaSpecCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QuotaSpec} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} specName The quota spec identifier.
     * @param {Object} opts Optional parameters
     * @param {String} opts.region Filters results based on the specified region.
     * @param {String} opts.namespace Filters results based on the specified namespace.
     * @param {Number} opts.index If set, wait until query exceeds given index. Must be provided with WaitParam.
     * @param {String} opts.wait Provided with IndexParam to wait for change.
     * @param {String} opts.stale If present, results will include stale reads.
     * @param {String} opts.prefix Constrains results to jobs that start with the defined prefix
     * @param {String} opts.xNomadToken A Nomad ACL token.
     * @param {Number} opts.perPage Maximum number of results to return.
     * @param {String} opts.nextToken Indicates where to start paging for queries that support pagination.
     * @param {module:api/EnterpriseApi~getQuotaSpecCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QuotaSpec}
     */
    getQuotaSpec(specName, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'specName' is set
      if (specName === undefined || specName === null) {
        throw new Error("Missing the required parameter 'specName' when calling getQuotaSpec");
      }

      let pathParams = {
        'specName': specName
      };
      let queryParams = {
        'region': opts['region'],
        'namespace': opts['namespace'],
        'wait': opts['wait'],
        'stale': opts['stale'],
        'prefix': opts['prefix'],
        'per_page': opts['perPage'],
        'next_token': opts['nextToken']
      };
      let headerParams = {
        'index': opts['index'],
        'X-Nomad-Token': opts['xNomadToken']
      };
      let formParams = {
      };

      let authNames = ['X-Nomad-Token'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = QuotaSpec;
      return this.apiClient.callApi(
        '/quota/{specName}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getQuotas operation.
     * @callback module:api/EnterpriseApi~getQuotasCallback
     * @param {String} error Error message, if any.
     * @param {Array.<Object>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {String} opts.region Filters results based on the specified region.
     * @param {String} opts.namespace Filters results based on the specified namespace.
     * @param {Number} opts.index If set, wait until query exceeds given index. Must be provided with WaitParam.
     * @param {String} opts.wait Provided with IndexParam to wait for change.
     * @param {String} opts.stale If present, results will include stale reads.
     * @param {String} opts.prefix Constrains results to jobs that start with the defined prefix
     * @param {String} opts.xNomadToken A Nomad ACL token.
     * @param {Number} opts.perPage Maximum number of results to return.
     * @param {String} opts.nextToken Indicates where to start paging for queries that support pagination.
     * @param {module:api/EnterpriseApi~getQuotasCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<Object>}
     */
    getQuotas(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'region': opts['region'],
        'namespace': opts['namespace'],
        'wait': opts['wait'],
        'stale': opts['stale'],
        'prefix': opts['prefix'],
        'per_page': opts['perPage'],
        'next_token': opts['nextToken']
      };
      let headerParams = {
        'index': opts['index'],
        'X-Nomad-Token': opts['xNomadToken']
      };
      let formParams = {
      };

      let authNames = ['X-Nomad-Token'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [Object];
      return this.apiClient.callApi(
        '/quotas', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the postQuotaSpec operation.
     * @callback module:api/EnterpriseApi~postQuotaSpecCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} specName The quota spec identifier.
     * @param {module:model/QuotaSpec} quotaSpec 
     * @param {Object} opts Optional parameters
     * @param {String} opts.region Filters results based on the specified region.
     * @param {String} opts.namespace Filters results based on the specified namespace.
     * @param {String} opts.xNomadToken A Nomad ACL token.
     * @param {String} opts.idempotencyToken Can be used to ensure operations are only run once.
     * @param {module:api/EnterpriseApi~postQuotaSpecCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postQuotaSpec(specName, quotaSpec, opts, callback) {
      opts = opts || {};
      let postBody = quotaSpec;
      // verify the required parameter 'specName' is set
      if (specName === undefined || specName === null) {
        throw new Error("Missing the required parameter 'specName' when calling postQuotaSpec");
      }
      // verify the required parameter 'quotaSpec' is set
      if (quotaSpec === undefined || quotaSpec === null) {
        throw new Error("Missing the required parameter 'quotaSpec' when calling postQuotaSpec");
      }

      let pathParams = {
        'specName': specName
      };
      let queryParams = {
        'region': opts['region'],
        'namespace': opts['namespace'],
        'idempotency_token': opts['idempotencyToken']
      };
      let headerParams = {
        'X-Nomad-Token': opts['xNomadToken']
      };
      let formParams = {
      };

      let authNames = ['X-Nomad-Token'];
      let contentTypes = ['application/json'];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/quota/{specName}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
