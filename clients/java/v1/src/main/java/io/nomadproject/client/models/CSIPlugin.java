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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.nomadproject.client.models.AllocationListStub;
import io.nomadproject.client.models.CSIInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CSIPlugin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CSIPlugin {
  public static final String SERIALIZED_NAME_ALLOCATIONS = "Allocations";
  @SerializedName(SERIALIZED_NAME_ALLOCATIONS)
  private List<AllocationListStub> allocations = null;

  public static final String SERIALIZED_NAME_CONTROLLER_REQUIRED = "ControllerRequired";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_REQUIRED)
  private Boolean controllerRequired;

  public static final String SERIALIZED_NAME_CONTROLLERS = "Controllers";
  @SerializedName(SERIALIZED_NAME_CONTROLLERS)
  private Map<String, CSIInfo> controllers = null;

  public static final String SERIALIZED_NAME_CONTROLLERS_EXPECTED = "ControllersExpected";
  @SerializedName(SERIALIZED_NAME_CONTROLLERS_EXPECTED)
  private Integer controllersExpected;

  public static final String SERIALIZED_NAME_CONTROLLERS_HEALTHY = "ControllersHealthy";
  @SerializedName(SERIALIZED_NAME_CONTROLLERS_HEALTHY)
  private Integer controllersHealthy;

  public static final String SERIALIZED_NAME_CREATE_INDEX = "CreateIndex";
  @SerializedName(SERIALIZED_NAME_CREATE_INDEX)
  private Integer createIndex;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_MODIFY_INDEX = "ModifyIndex";
  @SerializedName(SERIALIZED_NAME_MODIFY_INDEX)
  private Integer modifyIndex;

  public static final String SERIALIZED_NAME_NODES = "Nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private Map<String, CSIInfo> nodes = null;

  public static final String SERIALIZED_NAME_NODES_EXPECTED = "NodesExpected";
  @SerializedName(SERIALIZED_NAME_NODES_EXPECTED)
  private Integer nodesExpected;

  public static final String SERIALIZED_NAME_NODES_HEALTHY = "NodesHealthy";
  @SerializedName(SERIALIZED_NAME_NODES_HEALTHY)
  private Integer nodesHealthy;

  public static final String SERIALIZED_NAME_PROVIDER = "Provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public CSIPlugin allocations(List<AllocationListStub> allocations) {
    
    this.allocations = allocations;
    return this;
  }

  public CSIPlugin addAllocationsItem(AllocationListStub allocationsItem) {
    if (this.allocations == null) {
      this.allocations = new ArrayList<AllocationListStub>();
    }
    this.allocations.add(allocationsItem);
    return this;
  }

   /**
   * Get allocations
   * @return allocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AllocationListStub> getAllocations() {
    return allocations;
  }


  public void setAllocations(List<AllocationListStub> allocations) {
    this.allocations = allocations;
  }


  public CSIPlugin controllerRequired(Boolean controllerRequired) {
    
    this.controllerRequired = controllerRequired;
    return this;
  }

   /**
   * Get controllerRequired
   * @return controllerRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getControllerRequired() {
    return controllerRequired;
  }


  public void setControllerRequired(Boolean controllerRequired) {
    this.controllerRequired = controllerRequired;
  }


  public CSIPlugin controllers(Map<String, CSIInfo> controllers) {
    
    this.controllers = controllers;
    return this;
  }

  public CSIPlugin putControllersItem(String key, CSIInfo controllersItem) {
    if (this.controllers == null) {
      this.controllers = new HashMap<String, CSIInfo>();
    }
    this.controllers.put(key, controllersItem);
    return this;
  }

   /**
   * Get controllers
   * @return controllers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, CSIInfo> getControllers() {
    return controllers;
  }


  public void setControllers(Map<String, CSIInfo> controllers) {
    this.controllers = controllers;
  }


  public CSIPlugin controllersExpected(Integer controllersExpected) {
    
    this.controllersExpected = controllersExpected;
    return this;
  }

   /**
   * Get controllersExpected
   * @return controllersExpected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getControllersExpected() {
    return controllersExpected;
  }


  public void setControllersExpected(Integer controllersExpected) {
    this.controllersExpected = controllersExpected;
  }


  public CSIPlugin controllersHealthy(Integer controllersHealthy) {
    
    this.controllersHealthy = controllersHealthy;
    return this;
  }

   /**
   * Get controllersHealthy
   * @return controllersHealthy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getControllersHealthy() {
    return controllersHealthy;
  }


  public void setControllersHealthy(Integer controllersHealthy) {
    this.controllersHealthy = controllersHealthy;
  }


  public CSIPlugin createIndex(Integer createIndex) {
    
    this.createIndex = createIndex;
    return this;
  }

   /**
   * Get createIndex
   * minimum: 0
   * maximum: 384
   * @return createIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreateIndex() {
    return createIndex;
  }


  public void setCreateIndex(Integer createIndex) {
    this.createIndex = createIndex;
  }


  public CSIPlugin ID(String ID) {
    
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getID() {
    return ID;
  }


  public void setID(String ID) {
    this.ID = ID;
  }


  public CSIPlugin modifyIndex(Integer modifyIndex) {
    
    this.modifyIndex = modifyIndex;
    return this;
  }

   /**
   * Get modifyIndex
   * minimum: 0
   * maximum: 384
   * @return modifyIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getModifyIndex() {
    return modifyIndex;
  }


  public void setModifyIndex(Integer modifyIndex) {
    this.modifyIndex = modifyIndex;
  }


  public CSIPlugin nodes(Map<String, CSIInfo> nodes) {
    
    this.nodes = nodes;
    return this;
  }

  public CSIPlugin putNodesItem(String key, CSIInfo nodesItem) {
    if (this.nodes == null) {
      this.nodes = new HashMap<String, CSIInfo>();
    }
    this.nodes.put(key, nodesItem);
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, CSIInfo> getNodes() {
    return nodes;
  }


  public void setNodes(Map<String, CSIInfo> nodes) {
    this.nodes = nodes;
  }


  public CSIPlugin nodesExpected(Integer nodesExpected) {
    
    this.nodesExpected = nodesExpected;
    return this;
  }

   /**
   * Get nodesExpected
   * @return nodesExpected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNodesExpected() {
    return nodesExpected;
  }


  public void setNodesExpected(Integer nodesExpected) {
    this.nodesExpected = nodesExpected;
  }


  public CSIPlugin nodesHealthy(Integer nodesHealthy) {
    
    this.nodesHealthy = nodesHealthy;
    return this;
  }

   /**
   * Get nodesHealthy
   * @return nodesHealthy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNodesHealthy() {
    return nodesHealthy;
  }


  public void setNodesHealthy(Integer nodesHealthy) {
    this.nodesHealthy = nodesHealthy;
  }


  public CSIPlugin provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  public CSIPlugin version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSIPlugin csIPlugin = (CSIPlugin) o;
    return Objects.equals(this.allocations, csIPlugin.allocations) &&
        Objects.equals(this.controllerRequired, csIPlugin.controllerRequired) &&
        Objects.equals(this.controllers, csIPlugin.controllers) &&
        Objects.equals(this.controllersExpected, csIPlugin.controllersExpected) &&
        Objects.equals(this.controllersHealthy, csIPlugin.controllersHealthy) &&
        Objects.equals(this.createIndex, csIPlugin.createIndex) &&
        Objects.equals(this.ID, csIPlugin.ID) &&
        Objects.equals(this.modifyIndex, csIPlugin.modifyIndex) &&
        Objects.equals(this.nodes, csIPlugin.nodes) &&
        Objects.equals(this.nodesExpected, csIPlugin.nodesExpected) &&
        Objects.equals(this.nodesHealthy, csIPlugin.nodesHealthy) &&
        Objects.equals(this.provider, csIPlugin.provider) &&
        Objects.equals(this.version, csIPlugin.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocations, controllerRequired, controllers, controllersExpected, controllersHealthy, createIndex, ID, modifyIndex, nodes, nodesExpected, nodesHealthy, provider, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSIPlugin {\n");
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
    sb.append("    controllerRequired: ").append(toIndentedString(controllerRequired)).append("\n");
    sb.append("    controllers: ").append(toIndentedString(controllers)).append("\n");
    sb.append("    controllersExpected: ").append(toIndentedString(controllersExpected)).append("\n");
    sb.append("    controllersHealthy: ").append(toIndentedString(controllersHealthy)).append("\n");
    sb.append("    createIndex: ").append(toIndentedString(createIndex)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    modifyIndex: ").append(toIndentedString(modifyIndex)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    nodesExpected: ").append(toIndentedString(nodesExpected)).append("\n");
    sb.append("    nodesHealthy: ").append(toIndentedString(nodesHealthy)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

