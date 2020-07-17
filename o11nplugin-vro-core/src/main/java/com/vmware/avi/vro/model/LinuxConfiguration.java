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
 * The LinuxConfiguration is a POJO class extends AviRestResource that used for creating
 * LinuxConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LinuxConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_LINUXCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LinuxConfiguration extends AviRestResource {
  @JsonProperty("banner")
  @JsonInclude(Include.NON_NULL)
  private String banner = null;

  @JsonProperty("cis_mode")
  @JsonInclude(Include.NON_NULL)
  private Boolean cisMode = false;

  @JsonProperty("motd")
  @JsonInclude(Include.NON_NULL)
  private String motd = null;



  /**
   * This is the getter method this will return the attribute value.
   * Banner displayed before login to ssh, and ui.
   * @return banner
   */
  @VsoMethod
  public String getBanner() {
    return banner;
  }

  /**
   * This is the setter method to the attribute.
   * Banner displayed before login to ssh, and ui.
   * @param banner set the banner.
   */
  @VsoMethod
  public void setBanner(String  banner) {
    this.banner = banner;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enforce cis benchmark recommendations for avi controller and service engines.
   * The enforcement is as per cis dil 1.0.1 level 2, for applicable controls.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return cisMode
   */
  @VsoMethod
  public Boolean getCisMode() {
    return cisMode;
  }

  /**
   * This is the setter method to the attribute.
   * Enforce cis benchmark recommendations for avi controller and service engines.
   * The enforcement is as per cis dil 1.0.1 level 2, for applicable controls.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param cisMode set the cisMode.
   */
  @VsoMethod
  public void setCisMode(Boolean  cisMode) {
    this.cisMode = cisMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Message of the day, shown to users on login via the command line interface, web interface, or ssh.
   * @return motd
   */
  @VsoMethod
  public String getMotd() {
    return motd;
  }

  /**
   * This is the setter method to the attribute.
   * Message of the day, shown to users on login via the command line interface, web interface, or ssh.
   * @param motd set the motd.
   */
  @VsoMethod
  public void setMotd(String  motd) {
    this.motd = motd;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LinuxConfiguration objLinuxConfiguration = (LinuxConfiguration) o;
  return   Objects.equals(this.banner, objLinuxConfiguration.banner)&&
  Objects.equals(this.cisMode, objLinuxConfiguration.cisMode)&&
  Objects.equals(this.motd, objLinuxConfiguration.motd);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LinuxConfiguration {\n");
      sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
        sb.append("    cisMode: ").append(toIndentedString(cisMode)).append("\n");
        sb.append("    motd: ").append(toIndentedString(motd)).append("\n");
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

