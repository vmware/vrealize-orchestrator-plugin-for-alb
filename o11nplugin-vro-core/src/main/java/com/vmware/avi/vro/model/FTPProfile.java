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
 * The FTPProfile is a POJO class extends AviRestResource that used for creating
 * FTPProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "FTPProfile")
@VsoFinder(name = Constants.FINDER_VRO_FTPPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class FTPProfile extends AviRestResource {
    @JsonProperty("deactivate_active")
    @JsonInclude(Include.NON_NULL)
    private Boolean deactivateActive = false;

    @JsonProperty("deactivate_passive")
    @JsonInclude(Include.NON_NULL)
    private Boolean deactivatePassive = false;



  /**
   * This is the getter method this will return the attribute value.
   * Deactivate active ftp mode.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return deactivateActive
   */
  @VsoMethod
  public Boolean getDeactivateActive() {
    return deactivateActive;
  }

  /**
   * This is the setter method to the attribute.
   * Deactivate active ftp mode.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param deactivateActive set the deactivateActive.
   */
  @VsoMethod
  public void setDeactivateActive(Boolean  deactivateActive) {
    this.deactivateActive = deactivateActive;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Deactivate passive ftp mode.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return deactivatePassive
   */
  @VsoMethod
  public Boolean getDeactivatePassive() {
    return deactivatePassive;
  }

  /**
   * This is the setter method to the attribute.
   * Deactivate passive ftp mode.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param deactivatePassive set the deactivatePassive.
   */
  @VsoMethod
  public void setDeactivatePassive(Boolean  deactivatePassive) {
    this.deactivatePassive = deactivatePassive;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  FTPProfile objFTPProfile = (FTPProfile) o;
  return   Objects.equals(this.deactivateActive, objFTPProfile.deactivateActive)&&
  Objects.equals(this.deactivatePassive, objFTPProfile.deactivatePassive);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class FTPProfile {\n");
      sb.append("    deactivateActive: ").append(toIndentedString(deactivateActive)).append("\n");
        sb.append("    deactivatePassive: ").append(toIndentedString(deactivatePassive)).append("\n");
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

