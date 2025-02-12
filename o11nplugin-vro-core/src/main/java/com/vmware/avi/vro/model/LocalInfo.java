package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GslbDnsGsStatus;
import com.vmware.avi.vro.model.GslbObjInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The LocalInfo is a POJO class extends AviRestResource that used for creating
 * LocalInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LocalInfo")
@VsoFinder(name = Constants.FINDER_VRO_LOCALINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LocalInfo extends AviRestResource {
    @JsonProperty("gs_status")
    @JsonInclude(Include.NON_NULL)
    private GslbDnsGsStatus gsStatus;

    @JsonProperty("gslb_info")
    @JsonInclude(Include.NON_NULL)
    private GslbObjInfo gslbInfo;



  /**
   * This is the getter method this will return the attribute value.
   * This field encapsulates the gs-status edge-triggered framework.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gsStatus
   */
  @VsoMethod
  public GslbDnsGsStatus getGsStatus() {
    return gsStatus;
  }

  /**
   * This is the setter method to the attribute.
   * This field encapsulates the gs-status edge-triggered framework.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gsStatus set the gsStatus.
   */
  @VsoMethod
  public void setGsStatus(GslbDnsGsStatus gsStatus) {
    this.gsStatus = gsStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * This field keeps track of gslb object's information.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gslbInfo
   */
  @VsoMethod
  public GslbObjInfo getGslbInfo() {
    return gslbInfo;
  }

  /**
   * This is the setter method to the attribute.
   * This field keeps track of gslb object's information.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gslbInfo set the gslbInfo.
   */
  @VsoMethod
  public void setGslbInfo(GslbObjInfo gslbInfo) {
    this.gslbInfo = gslbInfo;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LocalInfo objLocalInfo = (LocalInfo) o;
  return   Objects.equals(this.gslbInfo, objLocalInfo.gslbInfo)&&
  Objects.equals(this.gsStatus, objLocalInfo.gsStatus);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LocalInfo {\n");
      sb.append("    gsStatus: ").append(toIndentedString(gsStatus)).append("\n");
        sb.append("    gslbInfo: ").append(toIndentedString(gslbInfo)).append("\n");
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

