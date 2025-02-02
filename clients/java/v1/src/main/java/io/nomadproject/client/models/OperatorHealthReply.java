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
import io.nomadproject.client.models.ServerHealth;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OperatorHealthReply
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OperatorHealthReply {
  public static final String SERIALIZED_NAME_FAILURE_TOLERANCE = "FailureTolerance";
  @SerializedName(SERIALIZED_NAME_FAILURE_TOLERANCE)
  private Integer failureTolerance;

  public static final String SERIALIZED_NAME_HEALTHY = "Healthy";
  @SerializedName(SERIALIZED_NAME_HEALTHY)
  private Boolean healthy;

  public static final String SERIALIZED_NAME_SERVERS = "Servers";
  @SerializedName(SERIALIZED_NAME_SERVERS)
  private List<ServerHealth> servers = null;


  public OperatorHealthReply failureTolerance(Integer failureTolerance) {
    
    this.failureTolerance = failureTolerance;
    return this;
  }

   /**
   * Get failureTolerance
   * @return failureTolerance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFailureTolerance() {
    return failureTolerance;
  }


  public void setFailureTolerance(Integer failureTolerance) {
    this.failureTolerance = failureTolerance;
  }


  public OperatorHealthReply healthy(Boolean healthy) {
    
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


  public OperatorHealthReply servers(List<ServerHealth> servers) {
    
    this.servers = servers;
    return this;
  }

  public OperatorHealthReply addServersItem(ServerHealth serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<ServerHealth>();
    }
    this.servers.add(serversItem);
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ServerHealth> getServers() {
    return servers;
  }


  public void setServers(List<ServerHealth> servers) {
    this.servers = servers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperatorHealthReply operatorHealthReply = (OperatorHealthReply) o;
    return Objects.equals(this.failureTolerance, operatorHealthReply.failureTolerance) &&
        Objects.equals(this.healthy, operatorHealthReply.healthy) &&
        Objects.equals(this.servers, operatorHealthReply.servers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureTolerance, healthy, servers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatorHealthReply {\n");
    sb.append("    failureTolerance: ").append(toIndentedString(failureTolerance)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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

