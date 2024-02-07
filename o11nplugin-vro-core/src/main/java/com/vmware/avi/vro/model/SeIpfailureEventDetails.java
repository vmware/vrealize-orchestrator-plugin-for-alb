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
 * The SeIpfailureEventDetails is a POJO class extends AviRestResource that used for creating
 * SeIpfailureEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeIpfailureEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEIPFAILUREEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeIpfailureEventDetails extends AviRestResource {
    @JsonProperty("mac")
    @JsonInclude(Include.NON_NULL)
    private String mac;

    @JsonProperty("network_uuid")
    @JsonInclude(Include.NON_NULL)
    private String networkUuid;

    @JsonProperty("se_ref")
    @JsonInclude(Include.NON_NULL)
    private String seRef;

    @JsonProperty("vnic_name")
    @JsonInclude(Include.NON_NULL)
    private String vnicName;



  /**
   * This is the getter method this will return the attribute value.
   * Mac address.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mac
   */
  @VsoMethod
  public String getMac() {
    return mac;
  }

  /**
   * This is the setter method to the attribute.
   * Mac address.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mac set the mac.
   */
  @VsoMethod
  public void setMac(String  mac) {
    this.mac = mac;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Network uuid.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkUuid
   */
  @VsoMethod
  public String getNetworkUuid() {
    return networkUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Network uuid.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param networkUuid set the networkUuid.
   */
  @VsoMethod
  public void setNetworkUuid(String  networkUuid) {
    this.networkUuid = networkUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seRef
   */
  @VsoMethod
  public String getSeRef() {
    return seRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the se responsible for this event.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seRef set the seRef.
   */
  @VsoMethod
  public void setSeRef(String  seRef) {
    this.seRef = seRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vnic name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vnicName
   */
  @VsoMethod
  public String getVnicName() {
    return vnicName;
  }

  /**
   * This is the setter method to the attribute.
   * Vnic name.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vnicName set the vnicName.
   */
  @VsoMethod
  public void setVnicName(String  vnicName) {
    this.vnicName = vnicName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeIpfailureEventDetails objSeIpfailureEventDetails = (SeIpfailureEventDetails) o;
  return   Objects.equals(this.seRef, objSeIpfailureEventDetails.seRef)&&
  Objects.equals(this.vnicName, objSeIpfailureEventDetails.vnicName)&&
  Objects.equals(this.networkUuid, objSeIpfailureEventDetails.networkUuid)&&
  Objects.equals(this.mac, objSeIpfailureEventDetails.mac);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeIpfailureEventDetails {\n");
      sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
        sb.append("    networkUuid: ").append(toIndentedString(networkUuid)).append("\n");
        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
        sb.append("    vnicName: ").append(toIndentedString(vnicName)).append("\n");
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

