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
import io.nomadproject.client.models.ConsulLinkedService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ConsulTerminatingConfigEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConsulTerminatingConfigEntry {
  public static final String SERIALIZED_NAME_SERVICES = "Services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private List<ConsulLinkedService> services = null;


  public ConsulTerminatingConfigEntry services(List<ConsulLinkedService> services) {
    
    this.services = services;
    return this;
  }

  public ConsulTerminatingConfigEntry addServicesItem(ConsulLinkedService servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<ConsulLinkedService>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ConsulLinkedService> getServices() {
    return services;
  }


  public void setServices(List<ConsulLinkedService> services) {
    this.services = services;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsulTerminatingConfigEntry consulTerminatingConfigEntry = (ConsulTerminatingConfigEntry) o;
    return Objects.equals(this.services, consulTerminatingConfigEntry.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsulTerminatingConfigEntry {\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

