/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

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
 * ResourcePathDTO
 */

public class ResourcePathDTO {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("resourcePath")
  private String resourcePath = null;

  @SerializedName("httpVerb")
  private String httpVerb = null;

  public ResourcePathDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ResourcePathDTO resourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
    return this;
  }

   /**
   * Get resourcePath
   * @return resourcePath
  **/
  @ApiModelProperty(example = "/menu", value = "")
  public String getResourcePath() {
    return resourcePath;
  }

  public void setResourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
  }

  public ResourcePathDTO httpVerb(String httpVerb) {
    this.httpVerb = httpVerb;
    return this;
  }

   /**
   * Get httpVerb
   * @return httpVerb
  **/
  @ApiModelProperty(example = "GET", value = "")
  public String getHttpVerb() {
    return httpVerb;
  }

  public void setHttpVerb(String httpVerb) {
    this.httpVerb = httpVerb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourcePathDTO resourcePath = (ResourcePathDTO) o;
    return Objects.equals(this.id, resourcePath.id) &&
        Objects.equals(this.resourcePath, resourcePath.resourcePath) &&
        Objects.equals(this.httpVerb, resourcePath.httpVerb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourcePath, httpVerb);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcePathDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourcePath: ").append(toIndentedString(resourcePath)).append("\n");
    sb.append("    httpVerb: ").append(toIndentedString(httpVerb)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

