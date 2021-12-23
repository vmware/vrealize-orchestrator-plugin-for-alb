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
 * The NsxtSIEndpointDetails is a POJO class extends AviRestResource that used for creating
 * NsxtSIEndpointDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NsxtSIEndpointDetails")
@VsoFinder(name = Constants.FINDER_VRO_NSXTSIENDPOINTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NsxtSIEndpointDetails extends AviRestResource {
    @JsonProperty("endpoint")
    @JsonInclude(Include.NON_NULL)
    private String endpoint = null;

    @JsonProperty("error_string")
    @JsonInclude(Include.NON_NULL)
    private String errorString = null;

    @JsonProperty("segroup")
    @JsonInclude(Include.NON_NULL)
    private String segroup = null;

    @JsonProperty("services")
    @JsonInclude(Include.NON_NULL)
    private List<String> services = null;

    @JsonProperty("targetIps")
    @JsonInclude(Include.NON_NULL)
    private List<String> targetIps = null;

    @JsonProperty("tier1")
    @JsonInclude(Include.NON_NULL)
    private String tier1 = null;



  /**
   * This is the getter method this will return the attribute value.
   * Virtualendpoint path.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return endpoint
   */
  @VsoMethod
  public String getEndpoint() {
    return endpoint;
  }

  /**
   * This is the setter method to the attribute.
   * Virtualendpoint path.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param endpoint set the endpoint.
   */
  @VsoMethod
  public void setEndpoint(String  endpoint) {
    this.endpoint = endpoint;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error message.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Error message.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Serviceenginegroup name.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return segroup
   */
  @VsoMethod
  public String getSegroup() {
    return segroup;
  }

  /**
   * This is the setter method to the attribute.
   * Serviceenginegroup name.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param segroup set the segroup.
   */
  @VsoMethod
  public void setSegroup(String  segroup) {
    this.segroup = segroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Services where endpoint refers.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return services
   */
  @VsoMethod
  public List<String> getServices() {
    return services;
  }

  /**
   * This is the setter method. this will set the services
   * Services where endpoint refers.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return services
   */
  @VsoMethod
  public void setServices(List<String>  services) {
    this.services = services;
  }

  /**
   * This is the setter method this will set the services
   * Services where endpoint refers.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return services
   */
  @VsoMethod
  public NsxtSIEndpointDetails addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<String>();
    }
    this.services.add(servicesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Endpoint target ips.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return targetIps
   */
  @VsoMethod
  public List<String> getTargetips() {
    return targetIps;
  }

  /**
   * This is the setter method. this will set the targetIps
   * Endpoint target ips.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return targetIps
   */
  @VsoMethod
  public void setTargetips(List<String>  targetIps) {
    this.targetIps = targetIps;
  }

  /**
   * This is the setter method this will set the targetIps
   * Endpoint target ips.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return targetIps
   */
  @VsoMethod
  public NsxtSIEndpointDetails addTargetipsItem(String targetIpsItem) {
    if (this.targetIps == null) {
      this.targetIps = new ArrayList<String>();
    }
    this.targetIps.add(targetIpsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Tier1 path.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tier1
   */
  @VsoMethod
  public String getTier1() {
    return tier1;
  }

  /**
   * This is the setter method to the attribute.
   * Tier1 path.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tier1 set the tier1.
   */
  @VsoMethod
  public void setTier1(String  tier1) {
    this.tier1 = tier1;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NsxtSIEndpointDetails objNsxtSIEndpointDetails = (NsxtSIEndpointDetails) o;
  return   Objects.equals(this.segroup, objNsxtSIEndpointDetails.segroup)&&
  Objects.equals(this.tier1, objNsxtSIEndpointDetails.tier1)&&
  Objects.equals(this.errorString, objNsxtSIEndpointDetails.errorString)&&
  Objects.equals(this.endpoint, objNsxtSIEndpointDetails.endpoint)&&
  Objects.equals(this.services, objNsxtSIEndpointDetails.services)&&
  Objects.equals(this.targetIps, objNsxtSIEndpointDetails.targetIps);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NsxtSIEndpointDetails {\n");
      sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    segroup: ").append(toIndentedString(segroup)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
        sb.append("    targetIps: ").append(toIndentedString(targetIps)).append("\n");
        sb.append("    tier1: ").append(toIndentedString(tier1)).append("\n");
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

