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
 * The BotIdentification is a POJO class extends AviRestResource that used for creating
 * BotIdentification.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BotIdentification")
@VsoFinder(name = Constants.FINDER_VRO_BOTIDENTIFICATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BotIdentification extends AviRestResource {
    @JsonProperty("class")
    private String classStr;

    @JsonProperty("identifier")
    @JsonInclude(Include.NON_NULL)
    private String identifier;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type;



  /**
   * This is the getter method this will return the attribute value.
   * The bot client class of this identification.
   * Enum options - UNDETERMINED_CLIENT, HUMAN_CLIENT, BOT_CLIENT.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return classStr
   */
  @VsoMethod
  public String getClassStr() {
    return classStr;
  }

  /**
   * This is the setter method to the attribute.
   * The bot client class of this identification.
   * Enum options - UNDETERMINED_CLIENT, HUMAN_CLIENT, BOT_CLIENT.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param classStr set the classStr.
   */
  @VsoMethod
  public void setClassStr(String  classStr) {
    this.classStr = classStr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A free-form string to identify the client.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return identifier
   */
  @VsoMethod
  public String getIdentifier() {
    return identifier;
  }

  /**
   * This is the setter method to the attribute.
   * A free-form string to identify the client.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param identifier set the identifier.
   */
  @VsoMethod
  public void setIdentifier(String  identifier) {
    this.identifier = identifier;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The bot client type of this identification.
   * Enum options - UNDETERMINED_CLIENT_TYPE, WEB_BROWSER, IN_APP_BROWSER, SEARCH_ENGINE, IMPERSONATOR, SPAM_SOURCE, WEB_ATTACKS, BOTNET, SCANNER,
   * DENIAL_OF_SERVICE, CLOUD_SOURCE, SECURITY_SCANNER, SITE_MONITOR, GENERIC_APPLICATION, SUSPICIOUS_APPLICATION.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * The bot client type of this identification.
   * Enum options - UNDETERMINED_CLIENT_TYPE, WEB_BROWSER, IN_APP_BROWSER, SEARCH_ENGINE, IMPERSONATOR, SPAM_SOURCE, WEB_ATTACKS, BOTNET, SCANNER,
   * DENIAL_OF_SERVICE, CLOUD_SOURCE, SECURITY_SCANNER, SITE_MONITOR, GENERIC_APPLICATION, SUSPICIOUS_APPLICATION.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  BotIdentification objBotIdentification = (BotIdentification) o;
  return   Objects.equals(this.classStr, objBotIdentification.classStr)&&
  Objects.equals(this.type, objBotIdentification.type)&&
  Objects.equals(this.identifier, objBotIdentification.identifier);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BotIdentification {\n");
      sb.append("    classStr: ").append(toIndentedString(classStr)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

