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
 * AlertTestEmailParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AlertTestEmailParams")
@VsoFinder(name = Constants.FINDER_VRO_ALERTTESTEMAILPARAMS, idAccessor = "getObjectID()")
@Service
public class AlertTestEmailParams extends AviRestResource  {
  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
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
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "AlertTestEmailParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertTestEmailParams alertTestEmailParams = (AlertTestEmailParams) o;
    return Objects.equals(this.subject, alertTestEmailParams.subject) &&
        Objects.equals(this.text, alertTestEmailParams.text) &&
        Objects.equals(this.uuid, alertTestEmailParams.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, text, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertTestEmailParams {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

