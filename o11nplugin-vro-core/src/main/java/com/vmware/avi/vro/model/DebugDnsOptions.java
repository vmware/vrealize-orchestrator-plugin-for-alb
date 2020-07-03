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
 * The DebugDnsOptions is a POJO class extends AviRestResource that used for creating
 * DebugDnsOptions.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DebugDnsOptions")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGDNSOPTIONS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DebugDnsOptions extends AviRestResource {
  @JsonProperty("domain_name")
  @JsonInclude(Include.NON_NULL)
  private List<String> domainName = null;

  @JsonProperty("gslb_service_name")
  @JsonInclude(Include.NON_NULL)
  private List<String> gslbServiceName = null;



  /**
   * This is the getter method this will return the attribute value.
   * This field filters the fqdn for dns debug.
   * Field introduced in 18.2.1.
   * @return domainName
   */
  @VsoMethod
  public List<String> getDomainName() {
    return domainName;
  }

  /**
   * This is the setter method. this will set the domainName
   * This field filters the fqdn for dns debug.
   * Field introduced in 18.2.1.
   * @return domainName
   */
  @VsoMethod
  public void setDomainName(List<String>  domainName) {
    this.domainName = domainName;
  }

  /**
   * This is the setter method this will set the domainName
   * This field filters the fqdn for dns debug.
   * Field introduced in 18.2.1.
   * @return domainName
   */
  @VsoMethod
  public DebugDnsOptions addDomainNameItem(String domainNameItem) {
    if (this.domainName == null) {
      this.domainName = new ArrayList<String>();
    }
    this.domainName.add(domainNameItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * This field filters the gslb service for dns debug.
   * Field introduced in 18.2.1.
   * @return gslbServiceName
   */
  @VsoMethod
  public List<String> getGslbServiceName() {
    return gslbServiceName;
  }

  /**
   * This is the setter method. this will set the gslbServiceName
   * This field filters the gslb service for dns debug.
   * Field introduced in 18.2.1.
   * @return gslbServiceName
   */
  @VsoMethod
  public void setGslbServiceName(List<String>  gslbServiceName) {
    this.gslbServiceName = gslbServiceName;
  }

  /**
   * This is the setter method this will set the gslbServiceName
   * This field filters the gslb service for dns debug.
   * Field introduced in 18.2.1.
   * @return gslbServiceName
   */
  @VsoMethod
  public DebugDnsOptions addGslbServiceNameItem(String gslbServiceNameItem) {
    if (this.gslbServiceName == null) {
      this.gslbServiceName = new ArrayList<String>();
    }
    this.gslbServiceName.add(gslbServiceNameItem);
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
  DebugDnsOptions objDebugDnsOptions = (DebugDnsOptions) o;
  return   Objects.equals(this.domainName, objDebugDnsOptions.domainName)&&
  Objects.equals(this.gslbServiceName, objDebugDnsOptions.gslbServiceName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DebugDnsOptions {\n");
      sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    gslbServiceName: ").append(toIndentedString(gslbServiceName)).append("\n");
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
