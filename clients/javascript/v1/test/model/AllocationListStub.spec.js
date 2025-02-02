/**
 * Copyright (c) HashiCorp, Inc.
 * SPDX-License-Identifier: MPL-2.0
 */

/**
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.3
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.nomad-client);
  }
}(this, function(expect, nomad-client) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new nomad-client.AllocationListStub();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('AllocationListStub', function() {
    it('should create an instance of AllocationListStub', function() {
      // uncomment below and update the code to test AllocationListStub
      //var instane = new nomad-client.AllocationListStub();
      //expect(instance).to.be.a(nomad-client.AllocationListStub);
    });

    it('should have the property allocatedResources (base name: "AllocatedResources")', function() {
      // uncomment below and update the code to test the property allocatedResources
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property clientDescription (base name: "ClientDescription")', function() {
      // uncomment below and update the code to test the property clientDescription
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property clientStatus (base name: "ClientStatus")', function() {
      // uncomment below and update the code to test the property clientStatus
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property createIndex (base name: "CreateIndex")', function() {
      // uncomment below and update the code to test the property createIndex
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property createTime (base name: "CreateTime")', function() {
      // uncomment below and update the code to test the property createTime
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property deploymentStatus (base name: "DeploymentStatus")', function() {
      // uncomment below and update the code to test the property deploymentStatus
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property desiredDescription (base name: "DesiredDescription")', function() {
      // uncomment below and update the code to test the property desiredDescription
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property desiredStatus (base name: "DesiredStatus")', function() {
      // uncomment below and update the code to test the property desiredStatus
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property evalID (base name: "EvalID")', function() {
      // uncomment below and update the code to test the property evalID
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property followupEvalID (base name: "FollowupEvalID")', function() {
      // uncomment below and update the code to test the property followupEvalID
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property ID (base name: "ID")', function() {
      // uncomment below and update the code to test the property ID
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property jobID (base name: "JobID")', function() {
      // uncomment below and update the code to test the property jobID
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property jobType (base name: "JobType")', function() {
      // uncomment below and update the code to test the property jobType
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property jobVersion (base name: "JobVersion")', function() {
      // uncomment below and update the code to test the property jobVersion
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property modifyIndex (base name: "ModifyIndex")', function() {
      // uncomment below and update the code to test the property modifyIndex
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property modifyTime (base name: "ModifyTime")', function() {
      // uncomment below and update the code to test the property modifyTime
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "Name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property namespace (base name: "Namespace")', function() {
      // uncomment below and update the code to test the property namespace
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property nodeID (base name: "NodeID")', function() {
      // uncomment below and update the code to test the property nodeID
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property nodeName (base name: "NodeName")', function() {
      // uncomment below and update the code to test the property nodeName
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property preemptedAllocations (base name: "PreemptedAllocations")', function() {
      // uncomment below and update the code to test the property preemptedAllocations
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property preemptedByAllocation (base name: "PreemptedByAllocation")', function() {
      // uncomment below and update the code to test the property preemptedByAllocation
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property rescheduleTracker (base name: "RescheduleTracker")', function() {
      // uncomment below and update the code to test the property rescheduleTracker
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property taskGroup (base name: "TaskGroup")', function() {
      // uncomment below and update the code to test the property taskGroup
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

    it('should have the property taskStates (base name: "TaskStates")', function() {
      // uncomment below and update the code to test the property taskStates
      //var instance = new nomad-client.AllocationListStub();
      //expect(instance).to.be();
    });

  });

}));
