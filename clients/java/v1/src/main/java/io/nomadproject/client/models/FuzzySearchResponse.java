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
import io.nomadproject.client.models.FuzzyMatch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FuzzySearchResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FuzzySearchResponse {
  public static final String SERIALIZED_NAME_KNOWN_LEADER = "KnownLeader";
  @SerializedName(SERIALIZED_NAME_KNOWN_LEADER)
  private Boolean knownLeader;

  public static final String SERIALIZED_NAME_LAST_CONTACT = "LastContact";
  @SerializedName(SERIALIZED_NAME_LAST_CONTACT)
  private Long lastContact;

  public static final String SERIALIZED_NAME_LAST_INDEX = "LastIndex";
  @SerializedName(SERIALIZED_NAME_LAST_INDEX)
  private Integer lastIndex;

  public static final String SERIALIZED_NAME_MATCHES = "Matches";
  @SerializedName(SERIALIZED_NAME_MATCHES)
  private Map<String, List<FuzzyMatch>> matches = null;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "NextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_REQUEST_TIME = "RequestTime";
  @SerializedName(SERIALIZED_NAME_REQUEST_TIME)
  private Long requestTime;

  public static final String SERIALIZED_NAME_TRUNCATIONS = "Truncations";
  @SerializedName(SERIALIZED_NAME_TRUNCATIONS)
  private Map<String, Boolean> truncations = null;


  public FuzzySearchResponse knownLeader(Boolean knownLeader) {
    
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


  public FuzzySearchResponse lastContact(Long lastContact) {
    
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


  public FuzzySearchResponse lastIndex(Integer lastIndex) {
    
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


  public FuzzySearchResponse matches(Map<String, List<FuzzyMatch>> matches) {
    
    this.matches = matches;
    return this;
  }

  public FuzzySearchResponse putMatchesItem(String key, List<FuzzyMatch> matchesItem) {
    if (this.matches == null) {
      this.matches = new HashMap<String, List<FuzzyMatch>>();
    }
    this.matches.put(key, matchesItem);
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<FuzzyMatch>> getMatches() {
    return matches;
  }


  public void setMatches(Map<String, List<FuzzyMatch>> matches) {
    this.matches = matches;
  }


  public FuzzySearchResponse nextToken(String nextToken) {
    
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


  public FuzzySearchResponse requestTime(Long requestTime) {
    
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


  public FuzzySearchResponse truncations(Map<String, Boolean> truncations) {
    
    this.truncations = truncations;
    return this;
  }

  public FuzzySearchResponse putTruncationsItem(String key, Boolean truncationsItem) {
    if (this.truncations == null) {
      this.truncations = new HashMap<String, Boolean>();
    }
    this.truncations.put(key, truncationsItem);
    return this;
  }

   /**
   * Get truncations
   * @return truncations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Boolean> getTruncations() {
    return truncations;
  }


  public void setTruncations(Map<String, Boolean> truncations) {
    this.truncations = truncations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FuzzySearchResponse fuzzySearchResponse = (FuzzySearchResponse) o;
    return Objects.equals(this.knownLeader, fuzzySearchResponse.knownLeader) &&
        Objects.equals(this.lastContact, fuzzySearchResponse.lastContact) &&
        Objects.equals(this.lastIndex, fuzzySearchResponse.lastIndex) &&
        Objects.equals(this.matches, fuzzySearchResponse.matches) &&
        Objects.equals(this.nextToken, fuzzySearchResponse.nextToken) &&
        Objects.equals(this.requestTime, fuzzySearchResponse.requestTime) &&
        Objects.equals(this.truncations, fuzzySearchResponse.truncations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knownLeader, lastContact, lastIndex, matches, nextToken, requestTime, truncations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FuzzySearchResponse {\n");
    sb.append("    knownLeader: ").append(toIndentedString(knownLeader)).append("\n");
    sb.append("    lastContact: ").append(toIndentedString(lastContact)).append("\n");
    sb.append("    lastIndex: ").append(toIndentedString(lastIndex)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    truncations: ").append(toIndentedString(truncations)).append("\n");
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

