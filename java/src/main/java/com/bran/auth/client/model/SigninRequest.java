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
 * SigninRequest
 */
@JsonPropertyOrder({
  SigninRequest.JSON_PROPERTY_EMAIL_OR_USERNAME,
  SigninRequest.JSON_PROPERTY_PASSWORD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-04T12:25:09.068723+03:00[Africa/Nairobi]")
public class SigninRequest {
  public static final String JSON_PROPERTY_EMAIL_OR_USERNAME = "emailOrUsername";
  private String emailOrUsername;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public SigninRequest() {
  }

  public SigninRequest emailOrUsername(String emailOrUsername) {
    
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


  public SigninRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigninRequest signinRequest = (SigninRequest) o;
    return Objects.equals(this.emailOrUsername, signinRequest.emailOrUsername) &&
        Objects.equals(this.password, signinRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailOrUsername, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigninRequest {\n");
    sb.append("    emailOrUsername: ").append(toIndentedString(emailOrUsername)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

