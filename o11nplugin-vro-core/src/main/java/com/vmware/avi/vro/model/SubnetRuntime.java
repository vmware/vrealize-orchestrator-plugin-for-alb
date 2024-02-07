package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SubnetRuntime is a POJO class extends AviRestResource that used for creating
 * SubnetRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SubnetRuntime")
@VsoFinder(name = Constants.FINDER_VRO_SUBNETRUNTIME)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SubnetRuntime extends AviRestResource {
    @JsonProperty("ip_range_runtimes")
    @JsonInclude(Include.NON_NULL)
    private List<StaticIpRangeRuntime> ipRangeRuntimes;

    @JsonProperty("prefix")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix prefix;



  /**
   * This is the getter method this will return the attribute value.
   * Static ip range runtime.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipRangeRuntimes
   */
  @VsoMethod
  public List<StaticIpRangeRuntime> getIpRangeRuntimes() {
    return ipRangeRuntimes;
  }

  /**
   * This is the setter method. this will set the ipRangeRuntimes
   * Static ip range runtime.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipRangeRuntimes
   */
  @VsoMethod
  public void setIpRangeRuntimes(List<StaticIpRangeRuntime>  ipRangeRuntimes) {
    this.ipRangeRuntimes = ipRangeRuntimes;
  }

  /**
   * This is the setter method this will set the ipRangeRuntimes
   * Static ip range runtime.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipRangeRuntimes
   */
  @VsoMethod
  public SubnetRuntime addIpRangeRuntimesItem(StaticIpRangeRuntime ipRangeRuntimesItem) {
    if (this.ipRangeRuntimes == null) {
      this.ipRangeRuntimes = new ArrayList<StaticIpRangeRuntime>();
    }
    this.ipRangeRuntimes.add(ipRangeRuntimesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prefix
   */
  @VsoMethod
  public IpAddrPrefix getPrefix() {
    return prefix;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param prefix set the prefix.
   */
  @VsoMethod
  public void setPrefix(IpAddrPrefix prefix) {
    this.prefix = prefix;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SubnetRuntime objSubnetRuntime = (SubnetRuntime) o;
  return   Objects.equals(this.prefix, objSubnetRuntime.prefix)&&
  Objects.equals(this.ipRangeRuntimes, objSubnetRuntime.ipRangeRuntimes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SubnetRuntime {\n");
      sb.append("    ipRangeRuntimes: ").append(toIndentedString(ipRangeRuntimes)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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

