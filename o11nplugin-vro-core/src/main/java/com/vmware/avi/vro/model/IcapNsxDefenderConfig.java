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
 * The IcapNsxDefenderConfig is a POJO class extends AviRestResource that used for creating
 * IcapNsxDefenderConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "IcapNsxDefenderConfig")
@VsoFinder(name = Constants.FINDER_VRO_ICAPNSXDEFENDERCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class IcapNsxDefenderConfig extends AviRestResource {
    @JsonProperty("status_url")
    @JsonInclude(Include.NON_NULL)
    private String statusUrl = "https://user.lastline.com/portal#/analyst/task/$uuid/overview";



  /**
   * This is the getter method this will return the attribute value.
   * Url to get details from nsxdefender using task_uuid for a particular request.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as
   * "https://user.lastline.com/portal#/analyst/task/$uuid/overview".
   * @return statusUrl
   */
  @VsoMethod
  public String getStatusUrl() {
    return statusUrl;
  }

  /**
   * This is the setter method to the attribute.
   * Url to get details from nsxdefender using task_uuid for a particular request.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as
   * "https://user.lastline.com/portal#/analyst/task/$uuid/overview".
   * @param statusUrl set the statusUrl.
   */
  @VsoMethod
  public void setStatusUrl(String  statusUrl) {
    this.statusUrl = statusUrl;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  IcapNsxDefenderConfig objIcapNsxDefenderConfig = (IcapNsxDefenderConfig) o;
  return   Objects.equals(this.statusUrl, objIcapNsxDefenderConfig.statusUrl);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class IcapNsxDefenderConfig {\n");
      sb.append("    statusUrl: ").append(toIndentedString(statusUrl)).append("\n");
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

