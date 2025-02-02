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
    instance = new nomad-client.DeploymentState();
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

  describe('DeploymentState', function() {
    it('should create an instance of DeploymentState', function() {
      // uncomment below and update the code to test DeploymentState
      //var instane = new nomad-client.DeploymentState();
      //expect(instance).to.be.a(nomad-client.DeploymentState);
    });

    it('should have the property autoRevert (base name: "AutoRevert")', function() {
      // uncomment below and update the code to test the property autoRevert
      //var instance = new nomad-client.DeploymentState();
      //expect(instance).to.be();
    });

    it('should have the property desiredCanaries (base name: "DesiredCanaries")', function() {
      // uncomment below and update the code to test the property desiredCanaries
      //var instance = new nomad-client.DeploymentState();
      //expect(instance).to.be();
    });

    it('should have the property desiredTotal (base name: "DesiredTotal")', function() {
      // uncomment below and update the code to test the property desiredTotal
      //var instance = new nomad-client.DeploymentState();
      //expect(instance).to.be();
    });

    it('should have the property healthyAllocs (base name: "HealthyAllocs")', function() {
      // uncomment below and update the code to test the property healthyAllocs
      //var instance = new nomad-client.DeploymentState();
      //expect(instance).to.be();
    });

    it('should have the property placedAllocs (base name: "PlacedAllocs")', function() {
      // uncomment below and update the code to test the property placedAllocs
      //var instance = new nomad-client.DeploymentState();
      //expect(instance).to.be();
    });

    it('should have the property placedCanaries (base name: "PlacedCanaries")', function() {
      // uncomment below and update the code to test the property placedCanaries
      //var instance = new nomad-client.DeploymentState();
      //expect(instance).to.be();
    });

    it('should have the property progressDeadline (base name: "ProgressDeadline")', function() {
      // uncomment below and update the code to test the property progressDeadline
      //var instance = new nomad-client.DeploymentState();
      //expect(instance).to.be();
    });

    it('should have the property promoted (base name: "Promoted")', function() {
      // uncomment below and update the code to test the property promoted
      //var instance = new nomad-client.DeploymentState();
      //expect(instance).to.be();
    });

    it('should have the property requireProgressBy (base name: "RequireProgressBy")', function() {
      // uncomment below and update the code to test the property requireProgressBy
      //var instance = new nomad-client.DeploymentState();
      //expect(instance).to.be();
    });

    it('should have the property unhealthyAllocs (base name: "UnhealthyAllocs")', function() {
      // uncomment below and update the code to test the property unhealthyAllocs
      //var instance = new nomad-client.DeploymentState();
      //expect(instance).to.be();
    });

  });

}));
