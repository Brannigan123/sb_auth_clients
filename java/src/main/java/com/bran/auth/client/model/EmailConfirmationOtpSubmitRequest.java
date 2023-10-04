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
 * EmailConfirmationOtpSubmitRequest
 */
@JsonPropertyOrder({
  EmailConfirmationOtpSubmitRequest.JSON_PROPERTY_OTP_ID,
  EmailConfirmationOtpSubmitRequest.JSON_PROPERTY_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EmailConfirmationOtpSubmitRequest {
  public static final String JSON_PROPERTY_OTP_ID = "otpId";
  private String otpId;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public EmailConfirmationOtpSubmitRequest() {
  }

  public EmailConfirmationOtpSubmitRequest otpId(String otpId) {
    
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


  public EmailConfirmationOtpSubmitRequest code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailConfirmationOtpSubmitRequest emailConfirmationOtpSubmitRequest = (EmailConfirmationOtpSubmitRequest) o;
    return Objects.equals(this.otpId, emailConfirmationOtpSubmitRequest.otpId) &&
        Objects.equals(this.code, emailConfirmationOtpSubmitRequest.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otpId, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailConfirmationOtpSubmitRequest {\n");
    sb.append("    otpId: ").append(toIndentedString(otpId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

