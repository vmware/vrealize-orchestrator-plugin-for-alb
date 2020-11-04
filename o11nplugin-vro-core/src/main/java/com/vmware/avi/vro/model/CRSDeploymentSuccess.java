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
 * The CRSDeploymentSuccess is a POJO class extends AviRestResource that used for creating
 * CRSDeploymentSuccess.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CRSDeploymentSuccess")
@VsoFinder(name = Constants.FINDER_VRO_CRSDEPLOYMENTSUCCESS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CRSDeploymentSuccess extends AviRestResource {
    @JsonProperty("crs_info")
    @JsonInclude(Include.NON_NULL)
    private List<CRSDetails> crsInfo = null;



  /**
   * This is the getter method this will return the attribute value.
   * List of all installed crs updates.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return crsInfo
   */
  @VsoMethod
  public List<CRSDetails> getCrsInfo() {
    return crsInfo;
  }

  /**
   * This is the setter method. this will set the crsInfo
   * List of all installed crs updates.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return crsInfo
   */
  @VsoMethod
  public void setCrsInfo(List<CRSDetails>  crsInfo) {
    this.crsInfo = crsInfo;
  }

  /**
   * This is the setter method this will set the crsInfo
   * List of all installed crs updates.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return crsInfo
   */
  @VsoMethod
  public CRSDeploymentSuccess addCrsInfoItem(CRSDetails crsInfoItem) {
    if (this.crsInfo == null) {
      this.crsInfo = new ArrayList<CRSDetails>();
    }
    this.crsInfo.add(crsInfoItem);
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
  CRSDeploymentSuccess objCRSDeploymentSuccess = (CRSDeploymentSuccess) o;
  return   Objects.equals(this.crsInfo, objCRSDeploymentSuccess.crsInfo);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CRSDeploymentSuccess {\n");
      sb.append("    crsInfo: ").append(toIndentedString(crsInfo)).append("\n");
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

