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
 * The BotTypeMatcher is a POJO class extends AviRestResource that used for creating
 * BotTypeMatcher.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BotTypeMatcher")
@VsoFinder(name = Constants.FINDER_VRO_BOTTYPEMATCHER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BotTypeMatcher extends AviRestResource {
    @JsonProperty("client_types")
    @JsonInclude(Include.NON_NULL)
    private List<String> clientTypes = null;

    @JsonProperty("op")
    @JsonInclude(Include.NON_NULL)
    private String op = "IS_IN";



  /**
   * This is the getter method this will return the attribute value.
   * The list of client types.
   * Enum options - UNDETERMINED_CLIENT_TYPE, WEB_BROWSER, IN_APP_BROWSER, SEARCH_ENGINE, IMPERSONATOR, SPAM_SOURCE, WEB_ATTACKS, BOTNET, SCANNER,
   * DENIAL_OF_SERVICE, CLOUD_SOURCE, SECURITY_SCANNER, SITE_MONITOR, GENERIC_APPLICATION.
   * Field introduced in 21.1.1.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientTypes
   */
  @VsoMethod
  public List<String> getClientTypes() {
    return clientTypes;
  }

  /**
   * This is the setter method. this will set the clientTypes
   * The list of client types.
   * Enum options - UNDETERMINED_CLIENT_TYPE, WEB_BROWSER, IN_APP_BROWSER, SEARCH_ENGINE, IMPERSONATOR, SPAM_SOURCE, WEB_ATTACKS, BOTNET, SCANNER,
   * DENIAL_OF_SERVICE, CLOUD_SOURCE, SECURITY_SCANNER, SITE_MONITOR, GENERIC_APPLICATION.
   * Field introduced in 21.1.1.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientTypes
   */
  @VsoMethod
  public void setClientTypes(List<String>  clientTypes) {
    this.clientTypes = clientTypes;
  }

  /**
   * This is the setter method this will set the clientTypes
   * The list of client types.
   * Enum options - UNDETERMINED_CLIENT_TYPE, WEB_BROWSER, IN_APP_BROWSER, SEARCH_ENGINE, IMPERSONATOR, SPAM_SOURCE, WEB_ATTACKS, BOTNET, SCANNER,
   * DENIAL_OF_SERVICE, CLOUD_SOURCE, SECURITY_SCANNER, SITE_MONITOR, GENERIC_APPLICATION.
   * Field introduced in 21.1.1.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientTypes
   */
  @VsoMethod
  public BotTypeMatcher addClientTypesItem(String clientTypesItem) {
    if (this.clientTypes == null) {
      this.clientTypes = new ArrayList<String>();
    }
    this.clientTypes.add(clientTypesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The match operation.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as "IS_IN".
   * @return op
   */
  @VsoMethod
  public String getOp() {
    return op;
  }

  /**
   * This is the setter method to the attribute.
   * The match operation.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as "IS_IN".
   * @param op set the op.
   */
  @VsoMethod
  public void setOp(String  op) {
    this.op = op;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  BotTypeMatcher objBotTypeMatcher = (BotTypeMatcher) o;
  return   Objects.equals(this.op, objBotTypeMatcher.op)&&
  Objects.equals(this.clientTypes, objBotTypeMatcher.clientTypes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BotTypeMatcher {\n");
      sb.append("    clientTypes: ").append(toIndentedString(clientTypes)).append("\n");
        sb.append("    op: ").append(toIndentedString(op)).append("\n");
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

