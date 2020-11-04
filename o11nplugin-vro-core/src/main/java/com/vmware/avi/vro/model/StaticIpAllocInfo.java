package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The StaticIpAllocInfo is a POJO class extends AviRestResource that used for creating
 * StaticIpAllocInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "StaticIpAllocInfo")
@VsoFinder(name = Constants.FINDER_VRO_STATICIPALLOCINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class StaticIpAllocInfo extends AviRestResource {
    @JsonProperty("ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddr ip = null;

    @JsonProperty("obj_info")
    @JsonInclude(Include.NON_NULL)
    private String objInfo = null;

    @JsonProperty("obj_uuid")
    @JsonInclude(Include.NON_NULL)
    private String objUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Ip address.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ip
   */
  @VsoMethod
  public IpAddr getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Object metadata.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objInfo
   */
  @VsoMethod
  public String getObjInfo() {
    return objInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Object metadata.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objInfo set the objInfo.
   */
  @VsoMethod
  public void setObjInfo(String  objInfo) {
    this.objInfo = objInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Object which this ip address is allocated to.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objUuid
   */
  @VsoMethod
  public String getObjUuid() {
    return objUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Object which this ip address is allocated to.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objUuid set the objUuid.
   */
  @VsoMethod
  public void setObjUuid(String  objUuid) {
    this.objUuid = objUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  StaticIpAllocInfo objStaticIpAllocInfo = (StaticIpAllocInfo) o;
  return   Objects.equals(this.ip, objStaticIpAllocInfo.ip)&&
  Objects.equals(this.objInfo, objStaticIpAllocInfo.objInfo)&&
  Objects.equals(this.objUuid, objStaticIpAllocInfo.objUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class StaticIpAllocInfo {\n");
      sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    objInfo: ").append(toIndentedString(objInfo)).append("\n");
        sb.append("    objUuid: ").append(toIndentedString(objUuid)).append("\n");
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

