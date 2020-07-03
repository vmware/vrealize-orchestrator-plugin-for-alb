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
 * The AttackMetaData is a POJO class extends AviRestResource that used for creating
 * AttackMetaData.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AttackMetaData")
@VsoFinder(name = Constants.FINDER_VRO_ATTACKMETADATA, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AttackMetaData extends AviRestResource {
  @JsonProperty("ip")
  @JsonInclude(Include.NON_NULL)
  private String ip = null;

  @JsonProperty("max_resp_time")
  @JsonInclude(Include.NON_NULL)
  private Integer maxRespTime = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property ip of obj type attackmetadata field type str  type string.
   * @return ip
   */
  @VsoMethod
  public String getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property ip of obj type attackmetadata field type str  type string.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(String  ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property max_resp_time of obj type attackmetadata field type str  type integer.
   * @return maxRespTime
   */
  @VsoMethod
  public Integer getMaxRespTime() {
    return maxRespTime;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property max_resp_time of obj type attackmetadata field type str  type integer.
   * @param maxRespTime set the maxRespTime.
   */
  @VsoMethod
  public void setMaxRespTime(Integer  maxRespTime) {
    this.maxRespTime = maxRespTime;
  }
/**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property url of obj type attackmetadata field type str  type string.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Placeholder for description of property url of obj type attackmetadata field type str  type string.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AttackMetaData objAttackMetaData = (AttackMetaData) o;
  return   Objects.equals(this.ip, objAttackMetaData.ip)&&
  Objects.equals(this.maxRespTime, objAttackMetaData.maxRespTime);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AttackMetaData {\n");
      sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    maxRespTime: ").append(toIndentedString(maxRespTime)).append("\n");
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
