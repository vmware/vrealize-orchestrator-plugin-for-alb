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
 * The HdrPersistenceProfile is a POJO class extends AviRestResource that used for creating
 * HdrPersistenceProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HdrPersistenceProfile")
@VsoFinder(name = Constants.FINDER_VRO_HDRPERSISTENCEPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HdrPersistenceProfile extends AviRestResource {
    @JsonProperty("prst_hdr_name")
    @JsonInclude(Include.NON_NULL)
    private String prstHdrName = null;



  /**
   * This is the getter method this will return the attribute value.
   * Header name for custom header persistence.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prstHdrName
   */
  @VsoMethod
  public String getPrstHdrName() {
    return prstHdrName;
  }

  /**
   * This is the setter method to the attribute.
   * Header name for custom header persistence.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param prstHdrName set the prstHdrName.
   */
  @VsoMethod
  public void setPrstHdrName(String  prstHdrName) {
    this.prstHdrName = prstHdrName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HdrPersistenceProfile objHdrPersistenceProfile = (HdrPersistenceProfile) o;
  return   Objects.equals(this.prstHdrName, objHdrPersistenceProfile.prstHdrName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HdrPersistenceProfile {\n");
      sb.append("    prstHdrName: ").append(toIndentedString(prstHdrName)).append("\n");
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

