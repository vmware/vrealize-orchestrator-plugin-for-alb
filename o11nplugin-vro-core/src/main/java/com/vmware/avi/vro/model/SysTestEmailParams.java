package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * SysTestEmailParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SysTestEmailParams")
@VsoFinder(name = Constants.FINDER_VRO_SYSTESTEMAILPARAMS, idAccessor = "getObjectID()")
@Service
public class SysTestEmailParams extends AviRestResource  {
  @JsonProperty("cc_emails")
  private String ccEmails = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("to_emails")
  private String toEmails = null;

  
  /**
   * Alerts are copied to the comma separated list of  email recipients.
   * @return ccEmails
  **/
  @ApiModelProperty(value = "Alerts are copied to the comma separated list of  email recipients.")


 
  @VsoMethod  
  public String getCcEmails() {
    return ccEmails;
  }
    
  @VsoMethod
  public void setCcEmails(String ccEmails) {
    this.ccEmails = ccEmails;
  }

  
  /**
   * The Subject line of the originating email from  Avi Controller.
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "The Subject line of the originating email from  Avi Controller.")
  @NotNull


 
  @VsoMethod  
  public String getSubject() {
    return subject;
  }
    
  @VsoMethod
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   * The email context.
   * @return text
  **/
  @ApiModelProperty(required = true, value = "The email context.")
  @NotNull


 
  @VsoMethod  
  public String getText() {
    return text;
  }
    
  @VsoMethod
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Alerts are sent to the comma separated list of  email recipients.
   * @return toEmails
  **/
  @ApiModelProperty(required = true, value = "Alerts are sent to the comma separated list of  email recipients.")
  @NotNull


 
  @VsoMethod  
  public String getToEmails() {
    return toEmails;
  }
    
  @VsoMethod
  public void setToEmails(String toEmails) {
    this.toEmails = toEmails;
  }

  
  public String getObjectID() {
		return "SysTestEmailParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SysTestEmailParams sysTestEmailParams = (SysTestEmailParams) o;
    return Objects.equals(this.ccEmails, sysTestEmailParams.ccEmails) &&
        Objects.equals(this.subject, sysTestEmailParams.subject) &&
        Objects.equals(this.text, sysTestEmailParams.text) &&
        Objects.equals(this.toEmails, sysTestEmailParams.toEmails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccEmails, subject, text, toEmails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SysTestEmailParams {\n");
    
    sb.append("    ccEmails: ").append(toIndentedString(ccEmails)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    toEmails: ").append(toIndentedString(toEmails)).append("\n");
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

