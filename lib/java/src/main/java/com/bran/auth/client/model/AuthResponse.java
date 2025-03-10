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
import com.bran.auth.client.model.ResponseUserDetails;
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
 * AuthResponse
 */
@JsonPropertyOrder({
  AuthResponse.JSON_PROPERTY_ERRORED,
  AuthResponse.JSON_PROPERTY_MESSAGES,
  AuthResponse.JSON_PROPERTY_TOKEN,
  AuthResponse.JSON_PROPERTY_REFRESH_TOKEN,
  AuthResponse.JSON_PROPERTY_USER_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthResponse {
  public static final String JSON_PROPERTY_ERRORED = "errored";
  private Boolean errored;

  public static final String JSON_PROPERTY_MESSAGES = "messages";
  private List<String> messages;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_REFRESH_TOKEN = "refreshToken";
  private String refreshToken;

  public static final String JSON_PROPERTY_USER_DETAILS = "userDetails";
  private ResponseUserDetails userDetails;

  public AuthResponse() {
  }

  public AuthResponse errored(Boolean errored) {
    
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


  public AuthResponse messages(List<String> messages) {
    
    this.messages = messages;
    return this;
  }

  public AuthResponse addMessagesItem(String messagesItem) {
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


  public AuthResponse token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(String token) {
    this.token = token;
  }


  public AuthResponse refreshToken(String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefreshToken() {
    return refreshToken;
  }


  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  public AuthResponse userDetails(ResponseUserDetails userDetails) {
    
    this.userDetails = userDetails;
    return this;
  }

   /**
   * Get userDetails
   * @return userDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_USER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResponseUserDetails getUserDetails() {
    return userDetails;
  }


  @JsonProperty(JSON_PROPERTY_USER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserDetails(ResponseUserDetails userDetails) {
    this.userDetails = userDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthResponse authResponse = (AuthResponse) o;
    return Objects.equals(this.errored, authResponse.errored) &&
        Objects.equals(this.messages, authResponse.messages) &&
        Objects.equals(this.token, authResponse.token) &&
        Objects.equals(this.refreshToken, authResponse.refreshToken) &&
        Objects.equals(this.userDetails, authResponse.userDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errored, messages, token, refreshToken, userDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthResponse {\n");
    sb.append("    errored: ").append(toIndentedString(errored)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    userDetails: ").append(toIndentedString(userDetails)).append("\n");
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

