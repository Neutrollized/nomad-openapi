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
 * CSIVolumeCapability
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CSIVolumeCapability {
  public static final String SERIALIZED_NAME_ACCESS_MODE = "AccessMode";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODE)
  private String accessMode;

  public static final String SERIALIZED_NAME_ATTACHMENT_MODE = "AttachmentMode";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_MODE)
  private String attachmentMode;


  public CSIVolumeCapability accessMode(String accessMode) {
    
    this.accessMode = accessMode;
    return this;
  }

   /**
   * Get accessMode
   * @return accessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessMode() {
    return accessMode;
  }


  public void setAccessMode(String accessMode) {
    this.accessMode = accessMode;
  }


  public CSIVolumeCapability attachmentMode(String attachmentMode) {
    
    this.attachmentMode = attachmentMode;
    return this;
  }

   /**
   * Get attachmentMode
   * @return attachmentMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAttachmentMode() {
    return attachmentMode;
  }


  public void setAttachmentMode(String attachmentMode) {
    this.attachmentMode = attachmentMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSIVolumeCapability csIVolumeCapability = (CSIVolumeCapability) o;
    return Objects.equals(this.accessMode, csIVolumeCapability.accessMode) &&
        Objects.equals(this.attachmentMode, csIVolumeCapability.attachmentMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, attachmentMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSIVolumeCapability {\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    attachmentMode: ").append(toIndentedString(attachmentMode)).append("\n");
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

