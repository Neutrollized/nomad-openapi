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


package io.nomadproject.client.models;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.nomadproject.client.models.Affinity;
import io.nomadproject.client.models.Constraint;
import io.nomadproject.client.models.MigrateStrategy;
import io.nomadproject.client.models.Multiregion;
import io.nomadproject.client.models.ParameterizedJobConfig;
import io.nomadproject.client.models.PeriodicConfig;
import io.nomadproject.client.models.ReschedulePolicy;
import io.nomadproject.client.models.Spread;
import io.nomadproject.client.models.TaskGroup;
import io.nomadproject.client.models.UpdateStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Job
 */
public class JobTest {
    private final Job model = new Job();

    /**
     * Model tests for Job
     */
    @Test
    public void testJob() {
        // TODO: test Job
    }

    /**
     * Test the property 'affinities'
     */
    @Test
    public void affinitiesTest() {
        // TODO: test affinities
    }

    /**
     * Test the property 'allAtOnce'
     */
    @Test
    public void allAtOnceTest() {
        // TODO: test allAtOnce
    }

    /**
     * Test the property 'constraints'
     */
    @Test
    public void constraintsTest() {
        // TODO: test constraints
    }

    /**
     * Test the property 'consulNamespace'
     */
    @Test
    public void consulNamespaceTest() {
        // TODO: test consulNamespace
    }

    /**
     * Test the property 'consulToken'
     */
    @Test
    public void consulTokenTest() {
        // TODO: test consulToken
    }

    /**
     * Test the property 'createIndex'
     */
    @Test
    public void createIndexTest() {
        // TODO: test createIndex
    }

    /**
     * Test the property 'datacenters'
     */
    @Test
    public void datacentersTest() {
        // TODO: test datacenters
    }

    /**
     * Test the property 'dispatchIdempotencyToken'
     */
    @Test
    public void dispatchIdempotencyTokenTest() {
        // TODO: test dispatchIdempotencyToken
    }

    /**
     * Test the property 'dispatched'
     */
    @Test
    public void dispatchedTest() {
        // TODO: test dispatched
    }

    /**
     * Test the property 'ID'
     */
    @Test
    public void IDTest() {
        // TODO: test ID
    }

    /**
     * Test the property 'jobModifyIndex'
     */
    @Test
    public void jobModifyIndexTest() {
        // TODO: test jobModifyIndex
    }

    /**
     * Test the property 'meta'
     */
    @Test
    public void metaTest() {
        // TODO: test meta
    }

    /**
     * Test the property 'migrate'
     */
    @Test
    public void migrateTest() {
        // TODO: test migrate
    }

    /**
     * Test the property 'modifyIndex'
     */
    @Test
    public void modifyIndexTest() {
        // TODO: test modifyIndex
    }

    /**
     * Test the property 'multiregion'
     */
    @Test
    public void multiregionTest() {
        // TODO: test multiregion
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'namespace'
     */
    @Test
    public void namespaceTest() {
        // TODO: test namespace
    }

    /**
     * Test the property 'nomadTokenID'
     */
    @Test
    public void nomadTokenIDTest() {
        // TODO: test nomadTokenID
    }

    /**
     * Test the property 'parameterizedJob'
     */
    @Test
    public void parameterizedJobTest() {
        // TODO: test parameterizedJob
    }

    /**
     * Test the property 'parentID'
     */
    @Test
    public void parentIDTest() {
        // TODO: test parentID
    }

    /**
     * Test the property 'payload'
     */
    @Test
    public void payloadTest() {
        // TODO: test payload
    }

    /**
     * Test the property 'periodic'
     */
    @Test
    public void periodicTest() {
        // TODO: test periodic
    }

    /**
     * Test the property 'priority'
     */
    @Test
    public void priorityTest() {
        // TODO: test priority
    }

    /**
     * Test the property 'region'
     */
    @Test
    public void regionTest() {
        // TODO: test region
    }

    /**
     * Test the property 'reschedule'
     */
    @Test
    public void rescheduleTest() {
        // TODO: test reschedule
    }

    /**
     * Test the property 'spreads'
     */
    @Test
    public void spreadsTest() {
        // TODO: test spreads
    }

    /**
     * Test the property 'stable'
     */
    @Test
    public void stableTest() {
        // TODO: test stable
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'statusDescription'
     */
    @Test
    public void statusDescriptionTest() {
        // TODO: test statusDescription
    }

    /**
     * Test the property 'stop'
     */
    @Test
    public void stopTest() {
        // TODO: test stop
    }

    /**
     * Test the property 'submitTime'
     */
    @Test
    public void submitTimeTest() {
        // TODO: test submitTime
    }

    /**
     * Test the property 'taskGroups'
     */
    @Test
    public void taskGroupsTest() {
        // TODO: test taskGroups
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'update'
     */
    @Test
    public void updateTest() {
        // TODO: test update
    }

    /**
     * Test the property 'vaultNamespace'
     */
    @Test
    public void vaultNamespaceTest() {
        // TODO: test vaultNamespace
    }

    /**
     * Test the property 'vaultToken'
     */
    @Test
    public void vaultTokenTest() {
        // TODO: test vaultToken
    }

    /**
     * Test the property 'version'
     */
    @Test
    public void versionTest() {
        // TODO: test version
    }

}
