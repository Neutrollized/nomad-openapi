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
 * JobDeregisterResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobDeregisterResponse {
  public static final String SERIALIZED_NAME_EVAL_CREATE_INDEX = "EvalCreateIndex";
  @SerializedName(SERIALIZED_NAME_EVAL_CREATE_INDEX)
  private Integer evalCreateIndex;

  public static final String SERIALIZED_NAME_EVAL_I_D = "EvalID";
  @SerializedName(SERIALIZED_NAME_EVAL_I_D)
  private String evalID;

  public static final String SERIALIZED_NAME_JOB_MODIFY_INDEX = "JobModifyIndex";
  @SerializedName(SERIALIZED_NAME_JOB_MODIFY_INDEX)
  private Integer jobModifyIndex;

  public static final String SERIALIZED_NAME_KNOWN_LEADER = "KnownLeader";
  @SerializedName(SERIALIZED_NAME_KNOWN_LEADER)
  private Boolean knownLeader;

  public static final String SERIALIZED_NAME_LAST_CONTACT = "LastContact";
  @SerializedName(SERIALIZED_NAME_LAST_CONTACT)
  private Long lastContact;

  public static final String SERIALIZED_NAME_LAST_INDEX = "LastIndex";
  @SerializedName(SERIALIZED_NAME_LAST_INDEX)
  private Integer lastIndex;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "NextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_REQUEST_TIME = "RequestTime";
  @SerializedName(SERIALIZED_NAME_REQUEST_TIME)
  private Long requestTime;


  public JobDeregisterResponse evalCreateIndex(Integer evalCreateIndex) {
    
    this.evalCreateIndex = evalCreateIndex;
    return this;
  }

   /**
   * Get evalCreateIndex
   * minimum: 0
   * maximum: 384
   * @return evalCreateIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEvalCreateIndex() {
    return evalCreateIndex;
  }


  public void setEvalCreateIndex(Integer evalCreateIndex) {
    this.evalCreateIndex = evalCreateIndex;
  }


  public JobDeregisterResponse evalID(String evalID) {
    
    this.evalID = evalID;
    return this;
  }

   /**
   * Get evalID
   * @return evalID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEvalID() {
    return evalID;
  }


  public void setEvalID(String evalID) {
    this.evalID = evalID;
  }


  public JobDeregisterResponse jobModifyIndex(Integer jobModifyIndex) {
    
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


  public JobDeregisterResponse knownLeader(Boolean knownLeader) {
    
    this.knownLeader = knownLeader;
    return this;
  }

   /**
   * Get knownLeader
   * @return knownLeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getKnownLeader() {
    return knownLeader;
  }


  public void setKnownLeader(Boolean knownLeader) {
    this.knownLeader = knownLeader;
  }


  public JobDeregisterResponse lastContact(Long lastContact) {
    
    this.lastContact = lastContact;
    return this;
  }

   /**
   * Get lastContact
   * @return lastContact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLastContact() {
    return lastContact;
  }


  public void setLastContact(Long lastContact) {
    this.lastContact = lastContact;
  }


  public JobDeregisterResponse lastIndex(Integer lastIndex) {
    
    this.lastIndex = lastIndex;
    return this;
  }

   /**
   * Get lastIndex
   * minimum: 0
   * maximum: 384
   * @return lastIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastIndex() {
    return lastIndex;
  }


  public void setLastIndex(Integer lastIndex) {
    this.lastIndex = lastIndex;
  }


  public JobDeregisterResponse nextToken(String nextToken) {
    
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNextToken() {
    return nextToken;
  }


  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public JobDeregisterResponse requestTime(Long requestTime) {
    
    this.requestTime = requestTime;
    return this;
  }

   /**
   * Get requestTime
   * @return requestTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRequestTime() {
    return requestTime;
  }


  public void setRequestTime(Long requestTime) {
    this.requestTime = requestTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDeregisterResponse jobDeregisterResponse = (JobDeregisterResponse) o;
    return Objects.equals(this.evalCreateIndex, jobDeregisterResponse.evalCreateIndex) &&
        Objects.equals(this.evalID, jobDeregisterResponse.evalID) &&
        Objects.equals(this.jobModifyIndex, jobDeregisterResponse.jobModifyIndex) &&
        Objects.equals(this.knownLeader, jobDeregisterResponse.knownLeader) &&
        Objects.equals(this.lastContact, jobDeregisterResponse.lastContact) &&
        Objects.equals(this.lastIndex, jobDeregisterResponse.lastIndex) &&
        Objects.equals(this.nextToken, jobDeregisterResponse.nextToken) &&
        Objects.equals(this.requestTime, jobDeregisterResponse.requestTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evalCreateIndex, evalID, jobModifyIndex, knownLeader, lastContact, lastIndex, nextToken, requestTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDeregisterResponse {\n");
    sb.append("    evalCreateIndex: ").append(toIndentedString(evalCreateIndex)).append("\n");
    sb.append("    evalID: ").append(toIndentedString(evalID)).append("\n");
    sb.append("    jobModifyIndex: ").append(toIndentedString(jobModifyIndex)).append("\n");
    sb.append("    knownLeader: ").append(toIndentedString(knownLeader)).append("\n");
    sb.append("    lastContact: ").append(toIndentedString(lastContact)).append("\n");
    sb.append("    lastIndex: ").append(toIndentedString(lastIndex)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
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

