package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SeResources;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbDnsInfo is a POJO class extends AviRestResource that used for creating
 * GslbDnsInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbDnsInfo")
@VsoFinder(name = Constants.FINDER_VRO_GSLBDNSINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbDnsInfo extends AviRestResource {
    @JsonProperty("dns_active")
    @JsonInclude(Include.NON_NULL)
    private Boolean dnsActive;

    @JsonProperty("dns_se_resource")
    @JsonInclude(Include.NON_NULL)
    private SeResources dnsSeResource;

    @JsonProperty("dns_vs_states")
    @JsonInclude(Include.NON_NULL)
    private List<GslbPerDnsState> dnsVsStates;



  /**
   * This is the getter method this will return the attribute value.
   * This field indicates that atleast one dns is active at the site.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsActive
   */
  @VsoMethod
  public Boolean getDnsActive() {
    return dnsActive;
  }

  /**
   * This is the setter method to the attribute.
   * This field indicates that atleast one dns is active at the site.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dnsActive set the dnsActive.
   */
  @VsoMethod
  public void setDnsActive(Boolean  dnsActive) {
    this.dnsActive = dnsActive;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field tracks the service engine resource hosting the dns virtual service.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsSeResource
   */
  @VsoMethod
  public SeResources getDnsSeResource() {
    return dnsSeResource;
  }

  /**
   * This is the setter method to the attribute.
   * This field tracks the service engine resource hosting the dns virtual service.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dnsSeResource set the dnsSeResource.
   */
  @VsoMethod
  public void setDnsSeResource(SeResources dnsSeResource) {
    this.dnsSeResource = dnsSeResource;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsVsStates
   */
  @VsoMethod
  public List<GslbPerDnsState> getDnsVsStates() {
    return dnsVsStates;
  }

  /**
   * This is the setter method. this will set the dnsVsStates
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsVsStates
   */
  @VsoMethod
  public void setDnsVsStates(List<GslbPerDnsState>  dnsVsStates) {
    this.dnsVsStates = dnsVsStates;
  }

  /**
   * This is the setter method this will set the dnsVsStates
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsVsStates
   */
  @VsoMethod
  public GslbDnsInfo addDnsVsStatesItem(GslbPerDnsState dnsVsStatesItem) {
    if (this.dnsVsStates == null) {
      this.dnsVsStates = new ArrayList<GslbPerDnsState>();
    }
    this.dnsVsStates.add(dnsVsStatesItem);
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
  GslbDnsInfo objGslbDnsInfo = (GslbDnsInfo) o;
  return   Objects.equals(this.dnsActive, objGslbDnsInfo.dnsActive)&&
  Objects.equals(this.dnsVsStates, objGslbDnsInfo.dnsVsStates)&&
  Objects.equals(this.dnsSeResource, objGslbDnsInfo.dnsSeResource);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbDnsInfo {\n");
      sb.append("    dnsActive: ").append(toIndentedString(dnsActive)).append("\n");
        sb.append("    dnsSeResource: ").append(toIndentedString(dnsSeResource)).append("\n");
        sb.append("    dnsVsStates: ").append(toIndentedString(dnsVsStates)).append("\n");
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

