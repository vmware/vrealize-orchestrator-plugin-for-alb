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
 * The SecurityMgrRuntime is a POJO class extends AviRestResource that used for creating
 * SecurityMgrRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SecurityMgrRuntime")
@VsoFinder(name = Constants.FINDER_VRO_SECURITYMGRRUNTIME)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SecurityMgrRuntime extends AviRestResource {
  @JsonProperty("thresholds")
  @JsonInclude(Include.NON_NULL)
  private List<SecMgrThreshold> thresholds = null;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.5.
   * @return thresholds
   */
  @VsoMethod
  public List<SecMgrThreshold> getThresholds() {
    return thresholds;
  }

  /**
   * This is the setter method. this will set the thresholds
   * Field introduced in 18.2.5.
   * @return thresholds
   */
  @VsoMethod
  public void setThresholds(List<SecMgrThreshold>  thresholds) {
    this.thresholds = thresholds;
  }

  /**
   * This is the setter method this will set the thresholds
   * Field introduced in 18.2.5.
   * @return thresholds
   */
  @VsoMethod
  public SecurityMgrRuntime addThresholdsItem(SecMgrThreshold thresholdsItem) {
    if (this.thresholds == null) {
      this.thresholds = new ArrayList<SecMgrThreshold>();
    }
    this.thresholds.add(thresholdsItem);
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
  SecurityMgrRuntime objSecurityMgrRuntime = (SecurityMgrRuntime) o;
  return   Objects.equals(this.thresholds, objSecurityMgrRuntime.thresholds);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SecurityMgrRuntime {\n");
      sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
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
