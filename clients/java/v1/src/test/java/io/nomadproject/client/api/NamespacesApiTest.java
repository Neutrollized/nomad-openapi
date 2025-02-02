/*
 * Copyright (c) HashiCorp, Inc.
 * SPDX-License-Identifier: MPL-2.0
 */

/*
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.nomadproject.client.api;

import io.nomadproject.client.ApiException;
import io.nomadproject.client.models.Namespace;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NamespacesApi
 */
@Ignore
public class NamespacesApiTest {

    private final NamespacesApi api = new NamespacesApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespaceTest() throws ApiException {
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        api.createNamespace(region, namespace, xNomadToken, idempotencyToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespaceTest() throws ApiException {
        String namespaceName = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        api.deleteNamespace(namespaceName, region, namespace, xNomadToken, idempotencyToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNamespaceTest() throws ApiException {
        String namespaceName = null;
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        Namespace response = api.getNamespace(namespaceName, region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNamespacesTest() throws ApiException {
        String region = null;
        String namespace = null;
        Integer index = null;
        String wait = null;
        String stale = null;
        String prefix = null;
        String xNomadToken = null;
        Integer perPage = null;
        String nextToken = null;
        List<Namespace> response = api.getNamespaces(region, namespace, index, wait, stale, prefix, xNomadToken, perPage, nextToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNamespaceTest() throws ApiException {
        String namespaceName = null;
        Namespace namespace2 = null;
        String region = null;
        String namespace = null;
        String xNomadToken = null;
        String idempotencyToken = null;
        api.postNamespace(namespaceName, namespace2, region, namespace, xNomadToken, idempotencyToken);

        // TODO: test validations
    }
    
}
