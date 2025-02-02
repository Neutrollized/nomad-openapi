# Copyright (c) HashiCorp, Inc.
# SPDX-License-Identifier: MPL-2.0

"""
    Nomad

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1.1.4
    Contact: support@hashicorp.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from nomad_client.api_client import ApiClient, Endpoint as _Endpoint
from nomad_client.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from nomad_client.model.quota_spec import QuotaSpec


class EnterpriseApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        def __create_quota_spec(
            self,
            quota_spec,
            **kwargs
        ):
            """create_quota_spec  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.create_quota_spec(quota_spec, async_req=True)
            >>> result = thread.get()

            Args:
                quota_spec (QuotaSpec):

            Keyword Args:
                region (str): Filters results based on the specified region.. [optional]
                namespace (str): Filters results based on the specified namespace.. [optional]
                x_nomad_token (str): A Nomad ACL token.. [optional]
                idempotency_token (str): Can be used to ensure operations are only run once.. [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (int/float/tuple): timeout setting for this request. If
                    one number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                None
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['quota_spec'] = \
                quota_spec
            return self.call_with_http_info(**kwargs)

        self.create_quota_spec = _Endpoint(
            settings={
                'response_type': None,
                'auth': [
                    'X-Nomad-Token'
                ],
                'endpoint_path': '/quota',
                'operation_id': 'create_quota_spec',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'quota_spec',
                    'region',
                    'namespace',
                    'x_nomad_token',
                    'idempotency_token',
                ],
                'required': [
                    'quota_spec',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'quota_spec':
                        (QuotaSpec,),
                    'region':
                        (str,),
                    'namespace':
                        (str,),
                    'x_nomad_token':
                        (str,),
                    'idempotency_token':
                        (str,),
                },
                'attribute_map': {
                    'region': 'region',
                    'namespace': 'namespace',
                    'x_nomad_token': 'X-Nomad-Token',
                    'idempotency_token': 'idempotency_token',
                },
                'location_map': {
                    'quota_spec': 'body',
                    'region': 'query',
                    'namespace': 'query',
                    'x_nomad_token': 'header',
                    'idempotency_token': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [],
                'content_type': [
                    'application/json'
                ]
            },
            api_client=api_client,
            callable=__create_quota_spec
        )

        def __delete_quota_spec(
            self,
            spec_name,
            **kwargs
        ):
            """delete_quota_spec  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.delete_quota_spec(spec_name, async_req=True)
            >>> result = thread.get()

            Args:
                spec_name (str): The quota spec identifier.

            Keyword Args:
                region (str): Filters results based on the specified region.. [optional]
                namespace (str): Filters results based on the specified namespace.. [optional]
                x_nomad_token (str): A Nomad ACL token.. [optional]
                idempotency_token (str): Can be used to ensure operations are only run once.. [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (int/float/tuple): timeout setting for this request. If
                    one number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                None
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['spec_name'] = \
                spec_name
            return self.call_with_http_info(**kwargs)

        self.delete_quota_spec = _Endpoint(
            settings={
                'response_type': None,
                'auth': [
                    'X-Nomad-Token'
                ],
                'endpoint_path': '/quota/{specName}',
                'operation_id': 'delete_quota_spec',
                'http_method': 'DELETE',
                'servers': None,
            },
            params_map={
                'all': [
                    'spec_name',
                    'region',
                    'namespace',
                    'x_nomad_token',
                    'idempotency_token',
                ],
                'required': [
                    'spec_name',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'spec_name':
                        (str,),
                    'region':
                        (str,),
                    'namespace':
                        (str,),
                    'x_nomad_token':
                        (str,),
                    'idempotency_token':
                        (str,),
                },
                'attribute_map': {
                    'spec_name': 'specName',
                    'region': 'region',
                    'namespace': 'namespace',
                    'x_nomad_token': 'X-Nomad-Token',
                    'idempotency_token': 'idempotency_token',
                },
                'location_map': {
                    'spec_name': 'path',
                    'region': 'query',
                    'namespace': 'query',
                    'x_nomad_token': 'header',
                    'idempotency_token': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [],
                'content_type': [],
            },
            api_client=api_client,
            callable=__delete_quota_spec
        )

        def __get_quota_spec(
            self,
            spec_name,
            **kwargs
        ):
            """get_quota_spec  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_quota_spec(spec_name, async_req=True)
            >>> result = thread.get()

            Args:
                spec_name (str): The quota spec identifier.

            Keyword Args:
                region (str): Filters results based on the specified region.. [optional]
                namespace (str): Filters results based on the specified namespace.. [optional]
                index (int): If set, wait until query exceeds given index. Must be provided with WaitParam.. [optional]
                wait (str): Provided with IndexParam to wait for change.. [optional]
                stale (str): If present, results will include stale reads.. [optional]
                prefix (str): Constrains results to jobs that start with the defined prefix. [optional]
                x_nomad_token (str): A Nomad ACL token.. [optional]
                per_page (int): Maximum number of results to return.. [optional]
                next_token (str): Indicates where to start paging for queries that support pagination.. [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (int/float/tuple): timeout setting for this request. If
                    one number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                QuotaSpec
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['spec_name'] = \
                spec_name
            return self.call_with_http_info(**kwargs)

        self.get_quota_spec = _Endpoint(
            settings={
                'response_type': (QuotaSpec,),
                'auth': [
                    'X-Nomad-Token'
                ],
                'endpoint_path': '/quota/{specName}',
                'operation_id': 'get_quota_spec',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'spec_name',
                    'region',
                    'namespace',
                    'index',
                    'wait',
                    'stale',
                    'prefix',
                    'x_nomad_token',
                    'per_page',
                    'next_token',
                ],
                'required': [
                    'spec_name',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'spec_name':
                        (str,),
                    'region':
                        (str,),
                    'namespace':
                        (str,),
                    'index':
                        (int,),
                    'wait':
                        (str,),
                    'stale':
                        (str,),
                    'prefix':
                        (str,),
                    'x_nomad_token':
                        (str,),
                    'per_page':
                        (int,),
                    'next_token':
                        (str,),
                },
                'attribute_map': {
                    'spec_name': 'specName',
                    'region': 'region',
                    'namespace': 'namespace',
                    'index': 'index',
                    'wait': 'wait',
                    'stale': 'stale',
                    'prefix': 'prefix',
                    'x_nomad_token': 'X-Nomad-Token',
                    'per_page': 'per_page',
                    'next_token': 'next_token',
                },
                'location_map': {
                    'spec_name': 'path',
                    'region': 'query',
                    'namespace': 'query',
                    'index': 'header',
                    'wait': 'query',
                    'stale': 'query',
                    'prefix': 'query',
                    'x_nomad_token': 'header',
                    'per_page': 'query',
                    'next_token': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_quota_spec
        )

        def __get_quotas(
            self,
            **kwargs
        ):
            """get_quotas  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.get_quotas(async_req=True)
            >>> result = thread.get()


            Keyword Args:
                region (str): Filters results based on the specified region.. [optional]
                namespace (str): Filters results based on the specified namespace.. [optional]
                index (int): If set, wait until query exceeds given index. Must be provided with WaitParam.. [optional]
                wait (str): Provided with IndexParam to wait for change.. [optional]
                stale (str): If present, results will include stale reads.. [optional]
                prefix (str): Constrains results to jobs that start with the defined prefix. [optional]
                x_nomad_token (str): A Nomad ACL token.. [optional]
                per_page (int): Maximum number of results to return.. [optional]
                next_token (str): Indicates where to start paging for queries that support pagination.. [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (int/float/tuple): timeout setting for this request. If
                    one number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                [bool, date, datetime, dict, float, int, list, str, none_type]
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            return self.call_with_http_info(**kwargs)

        self.get_quotas = _Endpoint(
            settings={
                'response_type': ([bool, date, datetime, dict, float, int, list, str, none_type],),
                'auth': [
                    'X-Nomad-Token'
                ],
                'endpoint_path': '/quotas',
                'operation_id': 'get_quotas',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'region',
                    'namespace',
                    'index',
                    'wait',
                    'stale',
                    'prefix',
                    'x_nomad_token',
                    'per_page',
                    'next_token',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'region':
                        (str,),
                    'namespace':
                        (str,),
                    'index':
                        (int,),
                    'wait':
                        (str,),
                    'stale':
                        (str,),
                    'prefix':
                        (str,),
                    'x_nomad_token':
                        (str,),
                    'per_page':
                        (int,),
                    'next_token':
                        (str,),
                },
                'attribute_map': {
                    'region': 'region',
                    'namespace': 'namespace',
                    'index': 'index',
                    'wait': 'wait',
                    'stale': 'stale',
                    'prefix': 'prefix',
                    'x_nomad_token': 'X-Nomad-Token',
                    'per_page': 'per_page',
                    'next_token': 'next_token',
                },
                'location_map': {
                    'region': 'query',
                    'namespace': 'query',
                    'index': 'header',
                    'wait': 'query',
                    'stale': 'query',
                    'prefix': 'query',
                    'x_nomad_token': 'header',
                    'per_page': 'query',
                    'next_token': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_quotas
        )

        def __post_quota_spec(
            self,
            spec_name,
            quota_spec,
            **kwargs
        ):
            """post_quota_spec  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True

            >>> thread = api.post_quota_spec(spec_name, quota_spec, async_req=True)
            >>> result = thread.get()

            Args:
                spec_name (str): The quota spec identifier.
                quota_spec (QuotaSpec):

            Keyword Args:
                region (str): Filters results based on the specified region.. [optional]
                namespace (str): Filters results based on the specified namespace.. [optional]
                x_nomad_token (str): A Nomad ACL token.. [optional]
                idempotency_token (str): Can be used to ensure operations are only run once.. [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (int/float/tuple): timeout setting for this request. If
                    one number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int/None): specifies the index of the server
                    that we want to use.
                    Default is read from the configuration.
                async_req (bool): execute request asynchronously

            Returns:
                None
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index')
            kwargs['spec_name'] = \
                spec_name
            kwargs['quota_spec'] = \
                quota_spec
            return self.call_with_http_info(**kwargs)

        self.post_quota_spec = _Endpoint(
            settings={
                'response_type': None,
                'auth': [
                    'X-Nomad-Token'
                ],
                'endpoint_path': '/quota/{specName}',
                'operation_id': 'post_quota_spec',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'spec_name',
                    'quota_spec',
                    'region',
                    'namespace',
                    'x_nomad_token',
                    'idempotency_token',
                ],
                'required': [
                    'spec_name',
                    'quota_spec',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'spec_name':
                        (str,),
                    'quota_spec':
                        (QuotaSpec,),
                    'region':
                        (str,),
                    'namespace':
                        (str,),
                    'x_nomad_token':
                        (str,),
                    'idempotency_token':
                        (str,),
                },
                'attribute_map': {
                    'spec_name': 'specName',
                    'region': 'region',
                    'namespace': 'namespace',
                    'x_nomad_token': 'X-Nomad-Token',
                    'idempotency_token': 'idempotency_token',
                },
                'location_map': {
                    'spec_name': 'path',
                    'quota_spec': 'body',
                    'region': 'query',
                    'namespace': 'query',
                    'x_nomad_token': 'header',
                    'idempotency_token': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [],
                'content_type': [
                    'application/json'
                ]
            },
            api_client=api_client,
            callable=__post_quota_spec
        )
