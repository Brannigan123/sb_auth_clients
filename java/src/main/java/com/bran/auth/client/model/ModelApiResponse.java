/*
 * API for AuthApplication
 * Bran's Auth API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bran.auth.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ModelApiResponse
 */
@JsonPropertyOrder({
  ModelApiResponse.JSON_PROPERTY_ERRORED,
  ModelApiResponse.JSON_PROPERTY_MESSAGES
})
@JsonTypeName("ApiResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-04T12:25:09.068723+03:00[Africa/Nairobi]")
public class ModelApiResponse {
  public static final String JSON_PROPERTY_ERRORED = "errored";
  private Boolean errored;

  public static final String JSON_PROPERTY_MESSAGES = "messages";
  private List<String> messages;

  public ModelApiResponse() {
  }

  public ModelApiResponse errored(Boolean errored) {
    
    this.errored = errored;
    return this;
  }

   /**
   * Get errored
   * @return errored
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ERRORED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getErrored() {
    return errored;
  }


  @JsonProperty(JSON_PROPERTY_ERRORED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrored(Boolean errored) {
    this.errored = errored;
  }


  public ModelApiResponse messages(List<String> messages) {
    
    this.messages = messages;
    return this;
  }

  public ModelApiResponse addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMessages() {
    return messages;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelApiResponse _apiResponse = (ModelApiResponse) o;
    return Objects.equals(this.errored, _apiResponse.errored) &&
        Objects.equals(this.messages, _apiResponse.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errored, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelApiResponse {\n");
    sb.append("    errored: ").append(toIndentedString(errored)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

