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
 * The ALBServicesSiteInfo is a POJO class extends AviRestResource that used for creating
 * ALBServicesSiteInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ALBServicesSiteInfo")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESSITEINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ALBServicesSiteInfo extends AviRestResource {
    @JsonProperty("site_id")
    @JsonInclude(Include.NON_NULL)
    private String siteId;

    @JsonProperty("site_name")
    @JsonInclude(Include.NON_NULL)
    private String siteName;



  /**
   * This is the getter method this will return the attribute value.
   * Site id the controller is registered with.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return siteId
   */
  @VsoMethod
  public String getSiteId() {
    return siteId;
  }

  /**
   * This is the setter method to the attribute.
   * Site id the controller is registered with.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param siteId set the siteId.
   */
  @VsoMethod
  public void setSiteId(String  siteId) {
    this.siteId = siteId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Site name the controller is registered with.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return siteName
   */
  @VsoMethod
  public String getSiteName() {
    return siteName;
  }

  /**
   * This is the setter method to the attribute.
   * Site name the controller is registered with.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param siteName set the siteName.
   */
  @VsoMethod
  public void setSiteName(String  siteName) {
    this.siteName = siteName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ALBServicesSiteInfo objALBServicesSiteInfo = (ALBServicesSiteInfo) o;
  return   Objects.equals(this.siteId, objALBServicesSiteInfo.siteId)&&
  Objects.equals(this.siteName, objALBServicesSiteInfo.siteName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ALBServicesSiteInfo {\n");
      sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
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

