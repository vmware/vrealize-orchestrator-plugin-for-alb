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
 * The BotClassMatcher is a POJO class extends AviRestResource that used for creating
 * BotClassMatcher.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BotClassMatcher")
@VsoFinder(name = Constants.FINDER_VRO_BOTCLASSMATCHER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BotClassMatcher extends AviRestResource {
    @JsonProperty("client_classes")
    @JsonInclude(Include.NON_NULL)
    private List<String> clientClasses = null;

    @JsonProperty("op")
    @JsonInclude(Include.NON_NULL)
    private String op = "IS_IN";



  /**
   * This is the getter method this will return the attribute value.
   * The list of client classes.
   * Enum options - UNDETERMINED_CLIENT, HUMAN_CLIENT, BOT_CLIENT.
   * Field introduced in 21.1.1.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientClasses
   */
  @VsoMethod
  public List<String> getClientClasses() {
    return clientClasses;
  }

  /**
   * This is the setter method. this will set the clientClasses
   * The list of client classes.
   * Enum options - UNDETERMINED_CLIENT, HUMAN_CLIENT, BOT_CLIENT.
   * Field introduced in 21.1.1.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientClasses
   */
  @VsoMethod
  public void setClientClasses(List<String>  clientClasses) {
    this.clientClasses = clientClasses;
  }

  /**
   * This is the setter method this will set the clientClasses
   * The list of client classes.
   * Enum options - UNDETERMINED_CLIENT, HUMAN_CLIENT, BOT_CLIENT.
   * Field introduced in 21.1.1.
   * Minimum of 1 items required.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientClasses
   */
  @VsoMethod
  public BotClassMatcher addClientClassesItem(String clientClassesItem) {
    if (this.clientClasses == null) {
      this.clientClasses = new ArrayList<String>();
    }
    this.clientClasses.add(clientClassesItem);
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
  BotClassMatcher objBotClassMatcher = (BotClassMatcher) o;
  return   Objects.equals(this.op, objBotClassMatcher.op)&&
  Objects.equals(this.clientClasses, objBotClassMatcher.clientClasses);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BotClassMatcher {\n");
      sb.append("    clientClasses: ").append(toIndentedString(clientClasses)).append("\n");
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

