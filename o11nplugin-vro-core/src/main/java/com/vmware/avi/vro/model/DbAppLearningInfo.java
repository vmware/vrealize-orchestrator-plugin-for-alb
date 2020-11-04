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
 * The DbAppLearningInfo is a POJO class extends AviRestResource that used for creating
 * DbAppLearningInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DbAppLearningInfo")
@VsoFinder(name = Constants.FINDER_VRO_DBAPPLEARNINGINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DbAppLearningInfo extends AviRestResource {
    @JsonProperty("app_id")
    @JsonInclude(Include.NON_NULL)
    private String appId = null;

    @JsonProperty("uri_info")
    @JsonInclude(Include.NON_NULL)
    private List<URIInfo> uriInfo = null;

    @JsonProperty("vs_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vsUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Application uuid.
   * Combination of virtualservice uuid and waf policy uuid.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return appId
   */
  @VsoMethod
  public String getAppId() {
    return appId;
  }

  /**
   * This is the setter method to the attribute.
   * Application uuid.
   * Combination of virtualservice uuid and waf policy uuid.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param appId set the appId.
   */
  @VsoMethod
  public void setAppId(String  appId) {
    this.appId = appId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Information about various uris under a application.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uriInfo
   */
  @VsoMethod
  public List<URIInfo> getUriInfo() {
    return uriInfo;
  }

  /**
   * This is the setter method. this will set the uriInfo
   * Information about various uris under a application.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uriInfo
   */
  @VsoMethod
  public void setUriInfo(List<URIInfo>  uriInfo) {
    this.uriInfo = uriInfo;
  }

  /**
   * This is the setter method this will set the uriInfo
   * Information about various uris under a application.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uriInfo
   */
  @VsoMethod
  public DbAppLearningInfo addUriInfoItem(URIInfo uriInfoItem) {
    if (this.uriInfo == null) {
      this.uriInfo = new ArrayList<URIInfo>();
    }
    this.uriInfo.add(uriInfoItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Virtualserivce uuid.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Virtualserivce uuid.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DbAppLearningInfo objDbAppLearningInfo = (DbAppLearningInfo) o;
  return   Objects.equals(this.vsUuid, objDbAppLearningInfo.vsUuid)&&
  Objects.equals(this.appId, objDbAppLearningInfo.appId)&&
  Objects.equals(this.uriInfo, objDbAppLearningInfo.uriInfo);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DbAppLearningInfo {\n");
      sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    uriInfo: ").append(toIndentedString(uriInfo)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

