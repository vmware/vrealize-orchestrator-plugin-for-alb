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
 * The VcenterHosts is a POJO class extends AviRestResource that used for creating
 * VcenterHosts.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VcenterHosts")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERHOSTS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VcenterHosts extends AviRestResource {
    @JsonProperty("host_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> hostRefs = null;

    @JsonProperty("include")
    @JsonInclude(Include.NON_NULL)
    private Boolean include = false;



  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type vimgrhostruntime.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostRefs
   */
  @VsoMethod
  public List<String> getHostRefs() {
    return hostRefs;
  }

  /**
   * This is the setter method. this will set the hostRefs
   * It is a reference to an object of type vimgrhostruntime.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostRefs
   */
  @VsoMethod
  public void setHostRefs(List<String>  hostRefs) {
    this.hostRefs = hostRefs;
  }

  /**
   * This is the setter method this will set the hostRefs
   * It is a reference to an object of type vimgrhostruntime.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostRefs
   */
  @VsoMethod
  public VcenterHosts addHostRefsItem(String hostRefsItem) {
    if (this.hostRefs == null) {
      this.hostRefs = new ArrayList<String>();
    }
    this.hostRefs.add(hostRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property include of obj type vcenterhosts field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return include
   */
  @VsoMethod
  public Boolean getInclude() {
    return include;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property include of obj type vcenterhosts field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param include set the include.
   */
  @VsoMethod
  public void setInclude(Boolean  include) {
    this.include = include;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VcenterHosts objVcenterHosts = (VcenterHosts) o;
  return   Objects.equals(this.hostRefs, objVcenterHosts.hostRefs)&&
  Objects.equals(this.include, objVcenterHosts.include);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VcenterHosts {\n");
      sb.append("    hostRefs: ").append(toIndentedString(hostRefs)).append("\n");
        sb.append("    include: ").append(toIndentedString(include)).append("\n");
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

