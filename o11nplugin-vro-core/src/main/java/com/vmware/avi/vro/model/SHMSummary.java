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
 * The SHMSummary is a POJO class extends AviRestResource that used for creating
 * SHMSummary.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SHMSummary")
@VsoFinder(name = Constants.FINDER_VRO_SHMSUMMARY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SHMSummary extends AviRestResource {
    @JsonProperty("health_monitor")
    @JsonInclude(Include.NON_NULL)
    private List<ServerHealthMonitor> healthMonitor;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return healthMonitor
   */
  @VsoMethod
  public List<ServerHealthMonitor> getHealthMonitor() {
    return healthMonitor;
  }

  /**
   * This is the setter method. this will set the healthMonitor
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return healthMonitor
   */
  @VsoMethod
  public void setHealthMonitor(List<ServerHealthMonitor>  healthMonitor) {
    this.healthMonitor = healthMonitor;
  }

  /**
   * This is the setter method this will set the healthMonitor
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return healthMonitor
   */
  @VsoMethod
  public SHMSummary addHealthMonitorItem(ServerHealthMonitor healthMonitorItem) {
    if (this.healthMonitor == null) {
      this.healthMonitor = new ArrayList<ServerHealthMonitor>();
    }
    this.healthMonitor.add(healthMonitorItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SHMSummary objSHMSummary = (SHMSummary) o;
  return   Objects.equals(this.healthMonitor, objSHMSummary.healthMonitor);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SHMSummary {\n");
      sb.append("    healthMonitor: ").append(toIndentedString(healthMonitor)).append("\n");
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

