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
import org.wso2.am.integration.clients.publisher.api.v1.dto.GraphQLValidationResponseGraphQLInfoDTO;

/**
 * GraphQLValidationResponseDTO
 */

public class GraphQLValidationResponseDTO {
  @SerializedName("isValid")
  private Boolean isValid = null;

  @SerializedName("errorMessage")
  private String errorMessage = null;

  @SerializedName("graphQLInfo")
  private GraphQLValidationResponseGraphQLInfoDTO graphQLInfo = null;

  public GraphQLValidationResponseDTO isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * This attribute declares whether this definition is valid or not. 
   * @return isValid
  **/
  @ApiModelProperty(example = "true", required = true, value = "This attribute declares whether this definition is valid or not. ")
  public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public GraphQLValidationResponseDTO errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * This attribute declares the validation error message 
   * @return errorMessage
  **/
  @ApiModelProperty(required = true, value = "This attribute declares the validation error message ")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public GraphQLValidationResponseDTO graphQLInfo(GraphQLValidationResponseGraphQLInfoDTO graphQLInfo) {
    this.graphQLInfo = graphQLInfo;
    return this;
  }

   /**
   * Get graphQLInfo
   * @return graphQLInfo
  **/
  @ApiModelProperty(value = "")
  public GraphQLValidationResponseGraphQLInfoDTO getGraphQLInfo() {
    return graphQLInfo;
  }

  public void setGraphQLInfo(GraphQLValidationResponseGraphQLInfoDTO graphQLInfo) {
    this.graphQLInfo = graphQLInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphQLValidationResponseDTO graphQLValidationResponse = (GraphQLValidationResponseDTO) o;
    return Objects.equals(this.isValid, graphQLValidationResponse.isValid) &&
        Objects.equals(this.errorMessage, graphQLValidationResponse.errorMessage) &&
        Objects.equals(this.graphQLInfo, graphQLValidationResponse.graphQLInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isValid, errorMessage, graphQLInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphQLValidationResponseDTO {\n");
    
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    graphQLInfo: ").append(toIndentedString(graphQLInfo)).append("\n");
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

