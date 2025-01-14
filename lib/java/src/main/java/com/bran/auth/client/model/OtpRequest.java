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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OtpRequest
 */
@JsonPropertyOrder({
  OtpRequest.JSON_PROPERTY_EMAIL_OR_USERNAME,
  OtpRequest.JSON_PROPERTY_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OtpRequest {
  public static final String JSON_PROPERTY_EMAIL_OR_USERNAME = "emailOrUsername";
  private String emailOrUsername;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public OtpRequest() {
  }

  public OtpRequest emailOrUsername(String emailOrUsername) {
    
    this.emailOrUsername = emailOrUsername;
    return this;
  }

   /**
   * Get emailOrUsername
   * @return emailOrUsername
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_EMAIL_OR_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailOrUsername() {
    return emailOrUsername;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_OR_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailOrUsername(String emailOrUsername) {
    this.emailOrUsername = emailOrUsername;
  }


  public OtpRequest message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtpRequest otpRequest = (OtpRequest) o;
    return Objects.equals(this.emailOrUsername, otpRequest.emailOrUsername) &&
        Objects.equals(this.message, otpRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailOrUsername, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtpRequest {\n");
    sb.append("    emailOrUsername: ").append(toIndentedString(emailOrUsername)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

