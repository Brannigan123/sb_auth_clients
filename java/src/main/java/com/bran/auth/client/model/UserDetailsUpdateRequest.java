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
 * UserDetailsUpdateRequest
 */
@JsonPropertyOrder({
  UserDetailsUpdateRequest.JSON_PROPERTY_OTP_ID,
  UserDetailsUpdateRequest.JSON_PROPERTY_OTP_CODE,
  UserDetailsUpdateRequest.JSON_PROPERTY_DISPLAY_NAME,
  UserDetailsUpdateRequest.JSON_PROPERTY_EMAIL,
  UserDetailsUpdateRequest.JSON_PROPERTY_PASSWORD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserDetailsUpdateRequest {
  public static final String JSON_PROPERTY_OTP_ID = "otpId";
  private String otpId;

  public static final String JSON_PROPERTY_OTP_CODE = "otpCode";
  private String otpCode;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public UserDetailsUpdateRequest() {
  }

  public UserDetailsUpdateRequest otpId(String otpId) {
    
    this.otpId = otpId;
    return this;
  }

   /**
   * Get otpId
   * @return otpId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_OTP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOtpId() {
    return otpId;
  }


  @JsonProperty(JSON_PROPERTY_OTP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtpId(String otpId) {
    this.otpId = otpId;
  }


  public UserDetailsUpdateRequest otpCode(String otpCode) {
    
    this.otpCode = otpCode;
    return this;
  }

   /**
   * Get otpCode
   * @return otpCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_OTP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOtpCode() {
    return otpCode;
  }


  @JsonProperty(JSON_PROPERTY_OTP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtpCode(String otpCode) {
    this.otpCode = otpCode;
  }


  public UserDetailsUpdateRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public UserDetailsUpdateRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public UserDetailsUpdateRequest password(String password) {
    
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
    UserDetailsUpdateRequest userDetailsUpdateRequest = (UserDetailsUpdateRequest) o;
    return Objects.equals(this.otpId, userDetailsUpdateRequest.otpId) &&
        Objects.equals(this.otpCode, userDetailsUpdateRequest.otpCode) &&
        Objects.equals(this.displayName, userDetailsUpdateRequest.displayName) &&
        Objects.equals(this.email, userDetailsUpdateRequest.email) &&
        Objects.equals(this.password, userDetailsUpdateRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otpId, otpCode, displayName, email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetailsUpdateRequest {\n");
    sb.append("    otpId: ").append(toIndentedString(otpId)).append("\n");
    sb.append("    otpCode: ").append(toIndentedString(otpCode)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

