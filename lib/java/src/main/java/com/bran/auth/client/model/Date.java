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
 * Date
 */
@JsonPropertyOrder({
  Date.JSON_PROPERTY_TIME,
  Date.JSON_PROPERTY_SECONDS,
  Date.JSON_PROPERTY_DATE,
  Date.JSON_PROPERTY_MONTH,
  Date.JSON_PROPERTY_HOURS,
  Date.JSON_PROPERTY_MINUTES,
  Date.JSON_PROPERTY_YEAR,
  Date.JSON_PROPERTY_DAY,
  Date.JSON_PROPERTY_TIMEZONE_OFFSET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Date {
  public static final String JSON_PROPERTY_TIME = "time";
  private Long time;

  public static final String JSON_PROPERTY_SECONDS = "seconds";
  private Integer seconds;

  public static final String JSON_PROPERTY_DATE = "date";
  private Integer date;

  public static final String JSON_PROPERTY_MONTH = "month";
  private Integer month;

  public static final String JSON_PROPERTY_HOURS = "hours";
  private Integer hours;

  public static final String JSON_PROPERTY_MINUTES = "minutes";
  private Integer minutes;

  public static final String JSON_PROPERTY_YEAR = "year";
  private Integer year;

  public static final String JSON_PROPERTY_DAY = "day";
  private Integer day;

  public static final String JSON_PROPERTY_TIMEZONE_OFFSET = "timezoneOffset";
  private Integer timezoneOffset;

  public Date() {
  }

  public Date time(Long time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(Long time) {
    this.time = time;
  }


  public Date seconds(Integer seconds) {
    
    this.seconds = seconds;
    return this;
  }

   /**
   * Get seconds
   * @return seconds
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSeconds() {
    return seconds;
  }


  @JsonProperty(JSON_PROPERTY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }


  public Date date(Integer date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(Integer date) {
    this.date = date;
  }


  public Date month(Integer month) {
    
    this.month = month;
    return this;
  }

   /**
   * Get month
   * @return month
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMonth() {
    return month;
  }


  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonth(Integer month) {
    this.month = month;
  }


  public Date hours(Integer hours) {
    
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHours() {
    return hours;
  }


  @JsonProperty(JSON_PROPERTY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHours(Integer hours) {
    this.hours = hours;
  }


  public Date minutes(Integer minutes) {
    
    this.minutes = minutes;
    return this;
  }

   /**
   * Get minutes
   * @return minutes
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinutes() {
    return minutes;
  }


  @JsonProperty(JSON_PROPERTY_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinutes(Integer minutes) {
    this.minutes = minutes;
  }


  public Date year(Integer year) {
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getYear() {
    return year;
  }


  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(Integer year) {
    this.year = year;
  }


  public Date day(Integer day) {
    
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDay() {
    return day;
  }


  @JsonProperty(JSON_PROPERTY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDay(Integer day) {
    this.day = day;
  }


  public Date timezoneOffset(Integer timezoneOffset) {
    
    this.timezoneOffset = timezoneOffset;
    return this;
  }

   /**
   * Get timezoneOffset
   * @return timezoneOffset
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TIMEZONE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimezoneOffset() {
    return timezoneOffset;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezoneOffset(Integer timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Date date = (Date) o;
    return Objects.equals(this.time, date.time) &&
        Objects.equals(this.seconds, date.seconds) &&
        Objects.equals(this.date, date.date) &&
        Objects.equals(this.month, date.month) &&
        Objects.equals(this.hours, date.hours) &&
        Objects.equals(this.minutes, date.minutes) &&
        Objects.equals(this.year, date.year) &&
        Objects.equals(this.day, date.day) &&
        Objects.equals(this.timezoneOffset, date.timezoneOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, seconds, date, month, hours, minutes, year, day, timezoneOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Date {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
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

