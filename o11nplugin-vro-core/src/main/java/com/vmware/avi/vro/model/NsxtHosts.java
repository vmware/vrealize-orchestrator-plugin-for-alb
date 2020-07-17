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
 * The NsxtHosts is a POJO class extends AviRestResource that used for creating
 * NsxtHosts.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NsxtHosts")
@VsoFinder(name = Constants.FINDER_VRO_NSXTHOSTS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NsxtHosts extends AviRestResource {
  @JsonProperty("host_ids")
  @JsonInclude(Include.NON_NULL)
  private List<String> hostIds = null;

  @JsonProperty("include")
  @JsonInclude(Include.NON_NULL)
  private Boolean include = false;



  /**
   * This is the getter method this will return the attribute value.
   * List of transport nodes.
   * Field introduced in 20.1.1.
   * @return hostIds
   */
  @VsoMethod
  public List<String> getHostIds() {
    return hostIds;
  }

  /**
   * This is the setter method. this will set the hostIds
   * List of transport nodes.
   * Field introduced in 20.1.1.
   * @return hostIds
   */
  @VsoMethod
  public void setHostIds(List<String>  hostIds) {
    this.hostIds = hostIds;
  }

  /**
   * This is the setter method this will set the hostIds
   * List of transport nodes.
   * Field introduced in 20.1.1.
   * @return hostIds
   */
  @VsoMethod
  public NsxtHosts addHostIdsItem(String hostIdsItem) {
    if (this.hostIds == null) {
      this.hostIds = new ArrayList<String>();
    }
    this.hostIds.add(hostIdsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Include or exclude.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return include
   */
  @VsoMethod
  public Boolean getInclude() {
    return include;
  }

  /**
   * This is the setter method to the attribute.
   * Include or exclude.
   * Field introduced in 20.1.1.
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
  NsxtHosts objNsxtHosts = (NsxtHosts) o;
  return   Objects.equals(this.hostIds, objNsxtHosts.hostIds)&&
  Objects.equals(this.include, objNsxtHosts.include);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NsxtHosts {\n");
      sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
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

