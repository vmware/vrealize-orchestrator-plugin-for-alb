package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HealthMonitorSSLAttributes;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HealthMonitorSmtp is a POJO class extends AviRestResource that used for creating
 * HealthMonitorSmtp.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HealthMonitorSmtp")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORSMTP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HealthMonitorSmtp extends AviRestResource {
    @JsonProperty("domainname")
    @JsonInclude(Include.NON_NULL)
    private String domainname;

    @JsonProperty("mail_data")
    @JsonInclude(Include.NON_NULL)
    private String mailData;

    @JsonProperty("recipients_ids")
    @JsonInclude(Include.NON_NULL)
    private List<String> recipientsIds;

    @JsonProperty("sender_id")
    @JsonInclude(Include.NON_NULL)
    private String senderId;

    @JsonProperty("ssl_attributes")
    @JsonInclude(Include.NON_NULL)
    private HealthMonitorSSLAttributes sslAttributes;



  /**
   * This is the getter method this will return the attribute value.
   * Sender domain name.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return domainname
   */
  @VsoMethod
  public String getDomainname() {
    return domainname;
  }

  /**
   * This is the setter method to the attribute.
   * Sender domain name.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param domainname set the domainname.
   */
  @VsoMethod
  public void setDomainname(String  domainname) {
    this.domainname = domainname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mail data.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mailData
   */
  @VsoMethod
  public String getMailData() {
    return mailData;
  }

  /**
   * This is the setter method to the attribute.
   * Mail data.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mailData set the mailData.
   */
  @VsoMethod
  public void setMailData(String  mailData) {
    this.mailData = mailData;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mail recipients.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return recipientsIds
   */
  @VsoMethod
  public List<String> getRecipientsIds() {
    return recipientsIds;
  }

  /**
   * This is the setter method. this will set the recipientsIds
   * Mail recipients.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return recipientsIds
   */
  @VsoMethod
  public void setRecipientsIds(List<String>  recipientsIds) {
    this.recipientsIds = recipientsIds;
  }

  /**
   * This is the setter method this will set the recipientsIds
   * Mail recipients.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return recipientsIds
   */
  @VsoMethod
  public HealthMonitorSmtp addRecipientsIdsItem(String recipientsIdsItem) {
    if (this.recipientsIds == null) {
      this.recipientsIds = new ArrayList<String>();
    }
    this.recipientsIds.add(recipientsIdsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Mail sender.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return senderId
   */
  @VsoMethod
  public String getSenderId() {
    return senderId;
  }

  /**
   * This is the setter method to the attribute.
   * Mail sender.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param senderId set the senderId.
   */
  @VsoMethod
  public void setSenderId(String  senderId) {
    this.senderId = senderId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ssl attributes for smtps monitor.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslAttributes
   */
  @VsoMethod
  public HealthMonitorSSLAttributes getSslAttributes() {
    return sslAttributes;
  }

  /**
   * This is the setter method to the attribute.
   * Ssl attributes for smtps monitor.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sslAttributes set the sslAttributes.
   */
  @VsoMethod
  public void setSslAttributes(HealthMonitorSSLAttributes sslAttributes) {
    this.sslAttributes = sslAttributes;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HealthMonitorSmtp objHealthMonitorSmtp = (HealthMonitorSmtp) o;
  return   Objects.equals(this.senderId, objHealthMonitorSmtp.senderId)&&
  Objects.equals(this.recipientsIds, objHealthMonitorSmtp.recipientsIds)&&
  Objects.equals(this.mailData, objHealthMonitorSmtp.mailData)&&
  Objects.equals(this.domainname, objHealthMonitorSmtp.domainname)&&
  Objects.equals(this.sslAttributes, objHealthMonitorSmtp.sslAttributes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HealthMonitorSmtp {\n");
      sb.append("    domainname: ").append(toIndentedString(domainname)).append("\n");
        sb.append("    mailData: ").append(toIndentedString(mailData)).append("\n");
        sb.append("    recipientsIds: ").append(toIndentedString(recipientsIds)).append("\n");
        sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
        sb.append("    sslAttributes: ").append(toIndentedString(sslAttributes)).append("\n");
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

