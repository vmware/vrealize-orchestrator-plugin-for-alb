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
 * The MarathonServicePortConflict is a POJO class extends AviRestResource that used for creating
 * MarathonServicePortConflict.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MarathonServicePortConflict")
@VsoFinder(name = Constants.FINDER_VRO_MARATHONSERVICEPORTCONFLICT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MarathonServicePortConflict extends AviRestResource {
  @JsonProperty("app_name")
  @JsonInclude(Include.NON_NULL)
  private String appName = null;

  @JsonProperty("cc_id")
  @JsonInclude(Include.NON_NULL)
  private String ccId = null;

  @JsonProperty("marathon_url")
  @JsonInclude(Include.NON_NULL)
  private String marathonUrl = null;

  @JsonProperty("port")
  @JsonInclude(Include.NON_NULL)
  private Integer port = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property app_name of obj type marathonserviceportconflict field type str  type string.
   * @return appName
   */
  @VsoMethod
  public String getAppName() {
    return appName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property app_name of obj type marathonserviceportconflict field type str  type string.
   * @param appName set the appName.
   */
  @VsoMethod
  public void setAppName(String  appName) {
    this.appName = appName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cc_id of obj type marathonserviceportconflict field type str  type string.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cc_id of obj type marathonserviceportconflict field type str  type string.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property marathon_url of obj type marathonserviceportconflict field type str  type string.
   * @return marathonUrl
   */
  @VsoMethod
  public String getMarathonUrl() {
    return marathonUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property marathon_url of obj type marathonserviceportconflict field type str  type string.
   * @param marathonUrl set the marathonUrl.
   */
  @VsoMethod
  public void setMarathonUrl(String  marathonUrl) {
    this.marathonUrl = marathonUrl;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property port of obj type marathonserviceportconflict field type str  type integer.
   * @return port
   */
  @VsoMethod
  public Integer getPort() {
    return port;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property port of obj type marathonserviceportconflict field type str  type integer.
   * @param port set the port.
   */
  @VsoMethod
  public void setPort(Integer  port) {
    this.port = port;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MarathonServicePortConflict objMarathonServicePortConflict = (MarathonServicePortConflict) o;
  return   Objects.equals(this.appName, objMarathonServicePortConflict.appName)&&
  Objects.equals(this.marathonUrl, objMarathonServicePortConflict.marathonUrl)&&
  Objects.equals(this.port, objMarathonServicePortConflict.port)&&
  Objects.equals(this.ccId, objMarathonServicePortConflict.ccId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MarathonServicePortConflict {\n");
      sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    marathonUrl: ").append(toIndentedString(marathonUrl)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
