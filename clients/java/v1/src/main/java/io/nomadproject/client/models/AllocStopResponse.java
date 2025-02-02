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
 * AllocStopResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AllocStopResponse {
  public static final String SERIALIZED_NAME_EVAL_I_D = "EvalID";
  @SerializedName(SERIALIZED_NAME_EVAL_I_D)
  private String evalID;

  public static final String SERIALIZED_NAME_INDEX = "Index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;


  public AllocStopResponse evalID(String evalID) {
    
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


  public AllocStopResponse index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * minimum: 0
   * maximum: 384
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocStopResponse allocStopResponse = (AllocStopResponse) o;
    return Objects.equals(this.evalID, allocStopResponse.evalID) &&
        Objects.equals(this.index, allocStopResponse.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evalID, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocStopResponse {\n");
    sb.append("    evalID: ").append(toIndentedString(evalID)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

