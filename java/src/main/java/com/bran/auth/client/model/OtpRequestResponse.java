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
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OtpRequestResponse
 */
@JsonPropertyOrder({
  OtpRequestResponse.JSON_PROPERTY_ERRORED,
  OtpRequestResponse.JSON_PROPERTY_MESSAGES,
  OtpRequestResponse.JSON_PROPERTY_OTP_ID,
  OtpRequestResponse.JSON_PROPERTY_EMAIL,
  OtpRequestResponse.JSON_PROPERTY_EXPIRY_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-04T12:25:09.068723+03:00[Africa/Nairobi]")
public class OtpRequestResponse {
  public static final String JSON_PROPERTY_ERRORED = "errored";
  private Boolean errored;

  public static final String JSON_PROPERTY_MESSAGES = "messages";
  private List<String> messages;

  public static final String JSON_PROPERTY_OTP_ID = "otpId";
  private String otpId;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_EXPIRY_DATE = "expiryDate";
  private Date expiryDate;

  public OtpRequestResponse() {
  }

  public OtpRequestResponse errored(Boolean errored) {
    
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


  public OtpRequestResponse messages(List<String> messages) {
    
    this.messages = messages;
    return this;
  }

  public OtpRequestResponse addMessagesItem(String messagesItem) {
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


  public OtpRequestResponse otpId(String otpId) {
    
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


  public OtpRequestResponse email(String email) {
    
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


  public OtpRequestResponse expiryDate(Date expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getExpiryDate() {
    return expiryDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryDate(Date expiryDate) {
    this.expiryDate = expiryDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtpRequestResponse otpRequestResponse = (OtpRequestResponse) o;
    return Objects.equals(this.errored, otpRequestResponse.errored) &&
        Objects.equals(this.messages, otpRequestResponse.messages) &&
        Objects.equals(this.otpId, otpRequestResponse.otpId) &&
        Objects.equals(this.email, otpRequestResponse.email) &&
        Objects.equals(this.expiryDate, otpRequestResponse.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errored, messages, otpId, email, expiryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtpRequestResponse {\n");
    sb.append("    errored: ").append(toIndentedString(errored)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    otpId: ").append(toIndentedString(otpId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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

