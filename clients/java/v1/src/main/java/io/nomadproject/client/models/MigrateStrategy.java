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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MigrateStrategy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MigrateStrategy {
  public static final String SERIALIZED_NAME_HEALTH_CHECK = "HealthCheck";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK)
  private String healthCheck;

  public static final String SERIALIZED_NAME_HEALTHY_DEADLINE = "HealthyDeadline";
  @SerializedName(SERIALIZED_NAME_HEALTHY_DEADLINE)
  private Long healthyDeadline;

  public static final String SERIALIZED_NAME_MAX_PARALLEL = "MaxParallel";
  @SerializedName(SERIALIZED_NAME_MAX_PARALLEL)
  private Integer maxParallel;

  public static final String SERIALIZED_NAME_MIN_HEALTHY_TIME = "MinHealthyTime";
  @SerializedName(SERIALIZED_NAME_MIN_HEALTHY_TIME)
  private Long minHealthyTime;


  public MigrateStrategy healthCheck(String healthCheck) {
    
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHealthCheck() {
    return healthCheck;
  }


  public void setHealthCheck(String healthCheck) {
    this.healthCheck = healthCheck;
  }


  public MigrateStrategy healthyDeadline(Long healthyDeadline) {
    
    this.healthyDeadline = healthyDeadline;
    return this;
  }

   /**
   * Get healthyDeadline
   * @return healthyDeadline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getHealthyDeadline() {
    return healthyDeadline;
  }


  public void setHealthyDeadline(Long healthyDeadline) {
    this.healthyDeadline = healthyDeadline;
  }


  public MigrateStrategy maxParallel(Integer maxParallel) {
    
    this.maxParallel = maxParallel;
    return this;
  }

   /**
   * Get maxParallel
   * @return maxParallel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxParallel() {
    return maxParallel;
  }


  public void setMaxParallel(Integer maxParallel) {
    this.maxParallel = maxParallel;
  }


  public MigrateStrategy minHealthyTime(Long minHealthyTime) {
    
    this.minHealthyTime = minHealthyTime;
    return this;
  }

   /**
   * Get minHealthyTime
   * @return minHealthyTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMinHealthyTime() {
    return minHealthyTime;
  }


  public void setMinHealthyTime(Long minHealthyTime) {
    this.minHealthyTime = minHealthyTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrateStrategy migrateStrategy = (MigrateStrategy) o;
    return Objects.equals(this.healthCheck, migrateStrategy.healthCheck) &&
        Objects.equals(this.healthyDeadline, migrateStrategy.healthyDeadline) &&
        Objects.equals(this.maxParallel, migrateStrategy.maxParallel) &&
        Objects.equals(this.minHealthyTime, migrateStrategy.minHealthyTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthCheck, healthyDeadline, maxParallel, minHealthyTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateStrategy {\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    healthyDeadline: ").append(toIndentedString(healthyDeadline)).append("\n");
    sb.append("    maxParallel: ").append(toIndentedString(maxParallel)).append("\n");
    sb.append("    minHealthyTime: ").append(toIndentedString(minHealthyTime)).append("\n");
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

