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
 * The AlertScriptConfig is a POJO class extends AviRestResource that used for creating
 * AlertScriptConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AlertScriptConfig")
@VsoFinder(name = Constants.FINDER_VRO_ALERTSCRIPTCONFIG, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AlertScriptConfig extends AviRestResource {
  @JsonProperty("action_script")
  @JsonInclude(Include.NON_NULL)
  private String actionScript = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * User defined alert action script.
   * Please refer to kb.avinetworks.com for more information.
   * @return actionScript
   */
  @VsoMethod
  public String getActionScript() {
    return actionScript;
  }

  /**
   * This is the setter method to the attribute.
   * User defined alert action script.
   * Please refer to kb.avinetworks.com for more information.
   * @param actionScript set the actionScript.
   */
  @VsoMethod
  public void setActionScript(String  actionScript) {
    this.actionScript = actionScript;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A user-friendly name of the script.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * A user-friendly name of the script.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
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


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AlertScriptConfig objAlertScriptConfig = (AlertScriptConfig) o;
  return   Objects.equals(this.actionScript, objAlertScriptConfig.actionScript)&&
  Objects.equals(this.tenantRef, objAlertScriptConfig.tenantRef)&&
  Objects.equals(this.uuid, objAlertScriptConfig.uuid)&&
  Objects.equals(this.name, objAlertScriptConfig.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AlertScriptConfig {\n");
      sb.append("    actionScript: ").append(toIndentedString(actionScript)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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
