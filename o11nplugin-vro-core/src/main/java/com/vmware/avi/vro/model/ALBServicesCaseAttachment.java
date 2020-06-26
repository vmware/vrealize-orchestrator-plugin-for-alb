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
 * The ALBServicesCaseAttachment is a POJO class extends AviRestResource that used for creating
 * ALBServicesCaseAttachment.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ALBServicesCaseAttachment")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESCASEATTACHMENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ALBServicesCaseAttachment extends AviRestResource {
  @JsonProperty("attachment_name")
  @JsonInclude(Include.NON_NULL)
  private String attachmentName = null;

  @JsonProperty("attachment_size")
  @JsonInclude(Include.NON_NULL)
  private String attachmentSize = null;

  @JsonProperty("attachment_url")
  @JsonInclude(Include.NON_NULL)
  private String attachmentUrl = null;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * @return attachmentName
   */
  @VsoMethod
  public String getAttachmentName() {
    return attachmentName;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * @param attachmentName set the attachmentName.
   */
  @VsoMethod
  public void setAttachmentName(String  attachmentName) {
    this.attachmentName = attachmentName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * @return attachmentSize
   */
  @VsoMethod
  public String getAttachmentSize() {
    return attachmentSize;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * @param attachmentSize set the attachmentSize.
   */
  @VsoMethod
  public void setAttachmentSize(String  attachmentSize) {
    this.attachmentSize = attachmentSize;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * @return attachmentUrl
   */
  @VsoMethod
  public String getAttachmentUrl() {
    return attachmentUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * @param attachmentUrl set the attachmentUrl.
   */
  @VsoMethod
  public void setAttachmentUrl(String  attachmentUrl) {
    this.attachmentUrl = attachmentUrl;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ALBServicesCaseAttachment objALBServicesCaseAttachment = (ALBServicesCaseAttachment) o;
  return   Objects.equals(this.attachmentName, objALBServicesCaseAttachment.attachmentName)&&
  Objects.equals(this.attachmentSize, objALBServicesCaseAttachment.attachmentSize)&&
  Objects.equals(this.attachmentUrl, objALBServicesCaseAttachment.attachmentUrl);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ALBServicesCaseAttachment {\n");
      sb.append("    attachmentName: ").append(toIndentedString(attachmentName)).append("\n");
        sb.append("    attachmentSize: ").append(toIndentedString(attachmentSize)).append("\n");
        sb.append("    attachmentUrl: ").append(toIndentedString(attachmentUrl)).append("\n");
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
