package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The AlertTestEmailParams is a POJO class extends AviRestResource that used for creating
 * AlertTestEmailParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AlertTestEmailParams")
@VsoFinder(name = Constants.FINDER_VRO_ALERTTESTEMAILPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AlertTestEmailParams extends AviRestResource {
  @JsonProperty("subject")
  @JsonInclude(Include.NON_NULL)
  private String subject = null;

  @JsonProperty("text")
  @JsonInclude(Include.NON_NULL)
  private String text = null;

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * The subject line of the originating email from  avi controller.
   * @return subject
   */
  @VsoMethod
  public String getSubject() {
    return subject;
  }

  /**
   * This is the setter method to the attribute.
   * The subject line of the originating email from  avi controller.
   * @param subject set the subject.
   */
  @VsoMethod
  public void setSubject(String  subject) {
    this.subject = subject;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The email context.
   * @return text
   */
  @VsoMethod
  public String getText() {
    return text;
  }

  /**
   * This is the setter method to the attribute.
   * The email context.
   * @param text set the text.
   */
  @VsoMethod
  public void setText(String  text) {
    this.text = text;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of the object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AlertTestEmailParams objAlertTestEmailParams = (AlertTestEmailParams) o;
  return   Objects.equals(this.text, objAlertTestEmailParams.text)&&
  Objects.equals(this.uuid, objAlertTestEmailParams.uuid)&&
  Objects.equals(this.subject, objAlertTestEmailParams.subject);
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
