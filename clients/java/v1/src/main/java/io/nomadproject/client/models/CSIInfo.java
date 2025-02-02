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
import io.nomadproject.client.models.CSIControllerInfo;
import io.nomadproject.client.models.CSINodeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * CSIInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CSIInfo {
  public static final String SERIALIZED_NAME_ALLOC_I_D = "AllocID";
  @SerializedName(SERIALIZED_NAME_ALLOC_I_D)
  private String allocID;

  public static final String SERIALIZED_NAME_CONTROLLER_INFO = "ControllerInfo";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_INFO)
  private CSIControllerInfo controllerInfo;

  public static final String SERIALIZED_NAME_HEALTH_DESCRIPTION = "HealthDescription";
  @SerializedName(SERIALIZED_NAME_HEALTH_DESCRIPTION)
  private String healthDescription;

  public static final String SERIALIZED_NAME_HEALTHY = "Healthy";
  @SerializedName(SERIALIZED_NAME_HEALTHY)
  private Boolean healthy;

  public static final String SERIALIZED_NAME_NODE_INFO = "NodeInfo";
  @SerializedName(SERIALIZED_NAME_NODE_INFO)
  private CSINodeInfo nodeInfo;

  public static final String SERIALIZED_NAME_PLUGIN_I_D = "PluginID";
  @SerializedName(SERIALIZED_NAME_PLUGIN_I_D)
  private String pluginID;

  public static final String SERIALIZED_NAME_REQUIRES_CONTROLLER_PLUGIN = "RequiresControllerPlugin";
  @SerializedName(SERIALIZED_NAME_REQUIRES_CONTROLLER_PLUGIN)
  private Boolean requiresControllerPlugin;

  public static final String SERIALIZED_NAME_REQUIRES_TOPOLOGIES = "RequiresTopologies";
  @SerializedName(SERIALIZED_NAME_REQUIRES_TOPOLOGIES)
  private Boolean requiresTopologies;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "UpdateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private OffsetDateTime updateTime;


  public CSIInfo allocID(String allocID) {
    
    this.allocID = allocID;
    return this;
  }

   /**
   * Get allocID
   * @return allocID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllocID() {
    return allocID;
  }


  public void setAllocID(String allocID) {
    this.allocID = allocID;
  }


  public CSIInfo controllerInfo(CSIControllerInfo controllerInfo) {
    
    this.controllerInfo = controllerInfo;
    return this;
  }

   /**
   * Get controllerInfo
   * @return controllerInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CSIControllerInfo getControllerInfo() {
    return controllerInfo;
  }


  public void setControllerInfo(CSIControllerInfo controllerInfo) {
    this.controllerInfo = controllerInfo;
  }


  public CSIInfo healthDescription(String healthDescription) {
    
    this.healthDescription = healthDescription;
    return this;
  }

   /**
   * Get healthDescription
   * @return healthDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHealthDescription() {
    return healthDescription;
  }


  public void setHealthDescription(String healthDescription) {
    this.healthDescription = healthDescription;
  }


  public CSIInfo healthy(Boolean healthy) {
    
    this.healthy = healthy;
    return this;
  }

   /**
   * Get healthy
   * @return healthy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHealthy() {
    return healthy;
  }


  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }


  public CSIInfo nodeInfo(CSINodeInfo nodeInfo) {
    
    this.nodeInfo = nodeInfo;
    return this;
  }

   /**
   * Get nodeInfo
   * @return nodeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CSINodeInfo getNodeInfo() {
    return nodeInfo;
  }


  public void setNodeInfo(CSINodeInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
  }


  public CSIInfo pluginID(String pluginID) {
    
    this.pluginID = pluginID;
    return this;
  }

   /**
   * Get pluginID
   * @return pluginID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPluginID() {
    return pluginID;
  }


  public void setPluginID(String pluginID) {
    this.pluginID = pluginID;
  }


  public CSIInfo requiresControllerPlugin(Boolean requiresControllerPlugin) {
    
    this.requiresControllerPlugin = requiresControllerPlugin;
    return this;
  }

   /**
   * Get requiresControllerPlugin
   * @return requiresControllerPlugin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequiresControllerPlugin() {
    return requiresControllerPlugin;
  }


  public void setRequiresControllerPlugin(Boolean requiresControllerPlugin) {
    this.requiresControllerPlugin = requiresControllerPlugin;
  }


  public CSIInfo requiresTopologies(Boolean requiresTopologies) {
    
    this.requiresTopologies = requiresTopologies;
    return this;
  }

   /**
   * Get requiresTopologies
   * @return requiresTopologies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequiresTopologies() {
    return requiresTopologies;
  }


  public void setRequiresTopologies(Boolean requiresTopologies) {
    this.requiresTopologies = requiresTopologies;
  }


  public CSIInfo updateTime(OffsetDateTime updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSIInfo csIInfo = (CSIInfo) o;
    return Objects.equals(this.allocID, csIInfo.allocID) &&
        Objects.equals(this.controllerInfo, csIInfo.controllerInfo) &&
        Objects.equals(this.healthDescription, csIInfo.healthDescription) &&
        Objects.equals(this.healthy, csIInfo.healthy) &&
        Objects.equals(this.nodeInfo, csIInfo.nodeInfo) &&
        Objects.equals(this.pluginID, csIInfo.pluginID) &&
        Objects.equals(this.requiresControllerPlugin, csIInfo.requiresControllerPlugin) &&
        Objects.equals(this.requiresTopologies, csIInfo.requiresTopologies) &&
        Objects.equals(this.updateTime, csIInfo.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocID, controllerInfo, healthDescription, healthy, nodeInfo, pluginID, requiresControllerPlugin, requiresTopologies, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSIInfo {\n");
    sb.append("    allocID: ").append(toIndentedString(allocID)).append("\n");
    sb.append("    controllerInfo: ").append(toIndentedString(controllerInfo)).append("\n");
    sb.append("    healthDescription: ").append(toIndentedString(healthDescription)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
    sb.append("    pluginID: ").append(toIndentedString(pluginID)).append("\n");
    sb.append("    requiresControllerPlugin: ").append(toIndentedString(requiresControllerPlugin)).append("\n");
    sb.append("    requiresTopologies: ").append(toIndentedString(requiresTopologies)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

