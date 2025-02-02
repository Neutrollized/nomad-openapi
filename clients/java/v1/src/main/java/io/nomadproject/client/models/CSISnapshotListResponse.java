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
import io.nomadproject.client.models.CSISnapshot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CSISnapshotListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CSISnapshotListResponse {
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

  public static final String SERIALIZED_NAME_SNAPSHOTS = "Snapshots";
  @SerializedName(SERIALIZED_NAME_SNAPSHOTS)
  private List<CSISnapshot> snapshots = null;


  public CSISnapshotListResponse knownLeader(Boolean knownLeader) {
    
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


  public CSISnapshotListResponse lastContact(Long lastContact) {
    
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


  public CSISnapshotListResponse lastIndex(Integer lastIndex) {
    
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


  public CSISnapshotListResponse nextToken(String nextToken) {
    
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


  public CSISnapshotListResponse requestTime(Long requestTime) {
    
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


  public CSISnapshotListResponse snapshots(List<CSISnapshot> snapshots) {
    
    this.snapshots = snapshots;
    return this;
  }

  public CSISnapshotListResponse addSnapshotsItem(CSISnapshot snapshotsItem) {
    if (this.snapshots == null) {
      this.snapshots = new ArrayList<CSISnapshot>();
    }
    this.snapshots.add(snapshotsItem);
    return this;
  }

   /**
   * Get snapshots
   * @return snapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CSISnapshot> getSnapshots() {
    return snapshots;
  }


  public void setSnapshots(List<CSISnapshot> snapshots) {
    this.snapshots = snapshots;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSISnapshotListResponse csISnapshotListResponse = (CSISnapshotListResponse) o;
    return Objects.equals(this.knownLeader, csISnapshotListResponse.knownLeader) &&
        Objects.equals(this.lastContact, csISnapshotListResponse.lastContact) &&
        Objects.equals(this.lastIndex, csISnapshotListResponse.lastIndex) &&
        Objects.equals(this.nextToken, csISnapshotListResponse.nextToken) &&
        Objects.equals(this.requestTime, csISnapshotListResponse.requestTime) &&
        Objects.equals(this.snapshots, csISnapshotListResponse.snapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knownLeader, lastContact, lastIndex, nextToken, requestTime, snapshots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSISnapshotListResponse {\n");
    sb.append("    knownLeader: ").append(toIndentedString(knownLeader)).append("\n");
    sb.append("    lastContact: ").append(toIndentedString(lastContact)).append("\n");
    sb.append("    lastIndex: ").append(toIndentedString(lastIndex)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
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

