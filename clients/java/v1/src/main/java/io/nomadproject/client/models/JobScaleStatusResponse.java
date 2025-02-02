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
import io.nomadproject.client.models.TaskGroupScaleStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JobScaleStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobScaleStatusResponse {
  public static final String SERIALIZED_NAME_JOB_CREATE_INDEX = "JobCreateIndex";
  @SerializedName(SERIALIZED_NAME_JOB_CREATE_INDEX)
  private Integer jobCreateIndex;

  public static final String SERIALIZED_NAME_JOB_I_D = "JobID";
  @SerializedName(SERIALIZED_NAME_JOB_I_D)
  private String jobID;

  public static final String SERIALIZED_NAME_JOB_MODIFY_INDEX = "JobModifyIndex";
  @SerializedName(SERIALIZED_NAME_JOB_MODIFY_INDEX)
  private Integer jobModifyIndex;

  public static final String SERIALIZED_NAME_JOB_STOPPED = "JobStopped";
  @SerializedName(SERIALIZED_NAME_JOB_STOPPED)
  private Boolean jobStopped;

  public static final String SERIALIZED_NAME_NAMESPACE = "Namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_TASK_GROUPS = "TaskGroups";
  @SerializedName(SERIALIZED_NAME_TASK_GROUPS)
  private Map<String, TaskGroupScaleStatus> taskGroups = null;


  public JobScaleStatusResponse jobCreateIndex(Integer jobCreateIndex) {
    
    this.jobCreateIndex = jobCreateIndex;
    return this;
  }

   /**
   * Get jobCreateIndex
   * minimum: 0
   * maximum: 384
   * @return jobCreateIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getJobCreateIndex() {
    return jobCreateIndex;
  }


  public void setJobCreateIndex(Integer jobCreateIndex) {
    this.jobCreateIndex = jobCreateIndex;
  }


  public JobScaleStatusResponse jobID(String jobID) {
    
    this.jobID = jobID;
    return this;
  }

   /**
   * Get jobID
   * @return jobID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobID() {
    return jobID;
  }


  public void setJobID(String jobID) {
    this.jobID = jobID;
  }


  public JobScaleStatusResponse jobModifyIndex(Integer jobModifyIndex) {
    
    this.jobModifyIndex = jobModifyIndex;
    return this;
  }

   /**
   * Get jobModifyIndex
   * minimum: 0
   * maximum: 384
   * @return jobModifyIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getJobModifyIndex() {
    return jobModifyIndex;
  }


  public void setJobModifyIndex(Integer jobModifyIndex) {
    this.jobModifyIndex = jobModifyIndex;
  }


  public JobScaleStatusResponse jobStopped(Boolean jobStopped) {
    
    this.jobStopped = jobStopped;
    return this;
  }

   /**
   * Get jobStopped
   * @return jobStopped
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getJobStopped() {
    return jobStopped;
  }


  public void setJobStopped(Boolean jobStopped) {
    this.jobStopped = jobStopped;
  }


  public JobScaleStatusResponse namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public JobScaleStatusResponse taskGroups(Map<String, TaskGroupScaleStatus> taskGroups) {
    
    this.taskGroups = taskGroups;
    return this;
  }

  public JobScaleStatusResponse putTaskGroupsItem(String key, TaskGroupScaleStatus taskGroupsItem) {
    if (this.taskGroups == null) {
      this.taskGroups = new HashMap<String, TaskGroupScaleStatus>();
    }
    this.taskGroups.put(key, taskGroupsItem);
    return this;
  }

   /**
   * Get taskGroups
   * @return taskGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, TaskGroupScaleStatus> getTaskGroups() {
    return taskGroups;
  }


  public void setTaskGroups(Map<String, TaskGroupScaleStatus> taskGroups) {
    this.taskGroups = taskGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobScaleStatusResponse jobScaleStatusResponse = (JobScaleStatusResponse) o;
    return Objects.equals(this.jobCreateIndex, jobScaleStatusResponse.jobCreateIndex) &&
        Objects.equals(this.jobID, jobScaleStatusResponse.jobID) &&
        Objects.equals(this.jobModifyIndex, jobScaleStatusResponse.jobModifyIndex) &&
        Objects.equals(this.jobStopped, jobScaleStatusResponse.jobStopped) &&
        Objects.equals(this.namespace, jobScaleStatusResponse.namespace) &&
        Objects.equals(this.taskGroups, jobScaleStatusResponse.taskGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobCreateIndex, jobID, jobModifyIndex, jobStopped, namespace, taskGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobScaleStatusResponse {\n");
    sb.append("    jobCreateIndex: ").append(toIndentedString(jobCreateIndex)).append("\n");
    sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
    sb.append("    jobModifyIndex: ").append(toIndentedString(jobModifyIndex)).append("\n");
    sb.append("    jobStopped: ").append(toIndentedString(jobStopped)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    taskGroups: ").append(toIndentedString(taskGroups)).append("\n");
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

