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
 * The SeDupipEventDetails is a POJO class extends AviRestResource that used for creating
 * SeDupipEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeDupipEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEDUPIPEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeDupipEventDetails extends AviRestResource {
    @JsonProperty("local_mac")
    @JsonInclude(Include.NON_NULL)
    private String localMac = null;

    @JsonProperty("remote_mac")
    @JsonInclude(Include.NON_NULL)
    private String remoteMac = null;

    @JsonProperty("vnic_ip")
    @JsonInclude(Include.NON_NULL)
    private String vnicIp = null;

    @JsonProperty("vnic_name")
    @JsonInclude(Include.NON_NULL)
    private String vnicName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Mac address.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return localMac
   */
  @VsoMethod
  public String getLocalMac() {
    return localMac;
  }

  /**
   * This is the setter method to the attribute.
   * Mac address.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param localMac set the localMac.
   */
  @VsoMethod
  public void setLocalMac(String  localMac) {
    this.localMac = localMac;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Mac address.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return remoteMac
   */
  @VsoMethod
  public String getRemoteMac() {
    return remoteMac;
  }

  /**
   * This is the setter method to the attribute.
   * Mac address.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param remoteMac set the remoteMac.
   */
  @VsoMethod
  public void setRemoteMac(String  remoteMac) {
    this.remoteMac = remoteMac;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vnic ip.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vnicIp
   */
  @VsoMethod
  public String getVnicIp() {
    return vnicIp;
  }

  /**
   * This is the setter method to the attribute.
   * Vnic ip.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vnicIp set the vnicIp.
   */
  @VsoMethod
  public void setVnicIp(String  vnicIp) {
    this.vnicIp = vnicIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vnic name.
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
  SeDupipEventDetails objSeDupipEventDetails = (SeDupipEventDetails) o;
  return   Objects.equals(this.vnicName, objSeDupipEventDetails.vnicName)&&
  Objects.equals(this.vnicIp, objSeDupipEventDetails.vnicIp)&&
  Objects.equals(this.remoteMac, objSeDupipEventDetails.remoteMac)&&
  Objects.equals(this.localMac, objSeDupipEventDetails.localMac);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeDupipEventDetails {\n");
      sb.append("    localMac: ").append(toIndentedString(localMac)).append("\n");
        sb.append("    remoteMac: ").append(toIndentedString(remoteMac)).append("\n");
        sb.append("    vnicIp: ").append(toIndentedString(vnicIp)).append("\n");
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

