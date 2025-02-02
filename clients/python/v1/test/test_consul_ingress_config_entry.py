# Copyright (c) HashiCorp, Inc.
# SPDX-License-Identifier: MPL-2.0

"""
    Nomad

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1.1.3
    Contact: support@hashicorp.com
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import nomad_client
from nomad_client.model.consul_gateway_tls_config import ConsulGatewayTLSConfig
from nomad_client.model.consul_ingress_listener import ConsulIngressListener
globals()['ConsulGatewayTLSConfig'] = ConsulGatewayTLSConfig
globals()['ConsulIngressListener'] = ConsulIngressListener
from nomad_client.model.consul_ingress_config_entry import ConsulIngressConfigEntry


class TestConsulIngressConfigEntry(unittest.TestCase):
    """ConsulIngressConfigEntry unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testConsulIngressConfigEntry(self):
        """Test ConsulIngressConfigEntry"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ConsulIngressConfigEntry()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
