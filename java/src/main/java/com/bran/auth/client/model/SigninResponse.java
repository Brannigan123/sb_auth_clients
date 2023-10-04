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
import com.bran.auth.client.model.Role;
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
 * SigninResponse
 */
@JsonPropertyOrder({
  SigninResponse.JSON_PROPERTY_ERRORED,
  SigninResponse.JSON_PROPERTY_MESSAGES,
  SigninResponse.JSON_PROPERTY_TOKEN,
  SigninResponse.JSON_PROPERTY_REFRESH_TOKEN,
  SigninResponse.JSON_PROPERTY_USERNAME,
  SigninResponse.JSON_PROPERTY_DISPLAY_NAME,
  SigninResponse.JSON_PROPERTY_EMAIL,
  SigninResponse.JSON_PROPERTY_ROLES,
  SigninResponse.JSON_PROPERTY_EMAIL_VERIFIED,
  SigninResponse.JSON_PROPERTY_LOCKED_ACCOUNT,
  SigninResponse.JSON_PROPERTY_DELETED_ACCOUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-04T12:25:09.068723+03:00[Africa/Nairobi]")
public class SigninResponse {
  public static final String JSON_PROPERTY_ERRORED = "errored";
  private Boolean errored;

  public static final String JSON_PROPERTY_MESSAGES = "messages";
  private List<String> messages;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_REFRESH_TOKEN = "refreshToken";
  private String refreshToken;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<Role> roles;

  public static final String JSON_PROPERTY_EMAIL_VERIFIED = "emailVerified";
  private Boolean emailVerified;

  public static final String JSON_PROPERTY_LOCKED_ACCOUNT = "lockedAccount";
  private Boolean lockedAccount;

  public static final String JSON_PROPERTY_DELETED_ACCOUNT = "deletedAccount";
  private Boolean deletedAccount;

  public SigninResponse() {
  }

  public SigninResponse errored(Boolean errored) {
    
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


  public SigninResponse messages(List<String> messages) {
    
    this.messages = messages;
    return this;
  }

  public SigninResponse addMessagesItem(String messagesItem) {
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


  public SigninResponse token(String token) {
    
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


  public SigninResponse refreshToken(String refreshToken) {
    
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


  public SigninResponse username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  public SigninResponse displayName(String displayName) {
    
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


  public SigninResponse email(String email) {
    
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


  public SigninResponse roles(List<Role> roles) {
    
    this.roles = roles;
    return this;
  }

  public SigninResponse addRolesItem(Role rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Role> getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }


  public SigninResponse emailVerified(Boolean emailVerified) {
    
    this.emailVerified = emailVerified;
    return this;
  }

   /**
   * Get emailVerified
   * @return emailVerified
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_EMAIL_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmailVerified() {
    return emailVerified;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }


  public SigninResponse lockedAccount(Boolean lockedAccount) {
    
    this.lockedAccount = lockedAccount;
    return this;
  }

   /**
   * Get lockedAccount
   * @return lockedAccount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LOCKED_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLockedAccount() {
    return lockedAccount;
  }


  @JsonProperty(JSON_PROPERTY_LOCKED_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLockedAccount(Boolean lockedAccount) {
    this.lockedAccount = lockedAccount;
  }


  public SigninResponse deletedAccount(Boolean deletedAccount) {
    
    this.deletedAccount = deletedAccount;
    return this;
  }

   /**
   * Get deletedAccount
   * @return deletedAccount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DELETED_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeletedAccount() {
    return deletedAccount;
  }


  @JsonProperty(JSON_PROPERTY_DELETED_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeletedAccount(Boolean deletedAccount) {
    this.deletedAccount = deletedAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigninResponse signinResponse = (SigninResponse) o;
    return Objects.equals(this.errored, signinResponse.errored) &&
        Objects.equals(this.messages, signinResponse.messages) &&
        Objects.equals(this.token, signinResponse.token) &&
        Objects.equals(this.refreshToken, signinResponse.refreshToken) &&
        Objects.equals(this.username, signinResponse.username) &&
        Objects.equals(this.displayName, signinResponse.displayName) &&
        Objects.equals(this.email, signinResponse.email) &&
        Objects.equals(this.roles, signinResponse.roles) &&
        Objects.equals(this.emailVerified, signinResponse.emailVerified) &&
        Objects.equals(this.lockedAccount, signinResponse.lockedAccount) &&
        Objects.equals(this.deletedAccount, signinResponse.deletedAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errored, messages, token, refreshToken, username, displayName, email, roles, emailVerified, lockedAccount, deletedAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigninResponse {\n");
    sb.append("    errored: ").append(toIndentedString(errored)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    lockedAccount: ").append(toIndentedString(lockedAccount)).append("\n");
    sb.append("    deletedAccount: ").append(toIndentedString(deletedAccount)).append("\n");
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

