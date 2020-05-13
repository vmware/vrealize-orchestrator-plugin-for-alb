package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * LinuxConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "LinuxConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_LINUXCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class LinuxConfiguration extends AviRestResource  {
  @JsonProperty("banner")
  private String banner = null;

  @JsonProperty("cis_mode")
  private Boolean cisMode = null;

  @JsonProperty("motd")
  private String motd = null;

  
  /**
   * Banner displayed before login to ssh, and UI.
   * @return banner
  **/
  @ApiModelProperty(value = "Banner displayed before login to ssh, and UI.")


 
  @VsoMethod  
  public String getBanner() {
    return banner;
  }
    
  @VsoMethod
  public void setBanner(String banner) {
    this.banner = banner;
  }

  
  /**
   * Enforce CIS benchmark recommendations for Avi Controller and Service Engines. The enforcement is as per CIS DIL 1.0.1 level 2, for applicable controls. Field introduced in 17.2.8.
   * @return cisMode
  **/
  @ApiModelProperty(value = "Enforce CIS benchmark recommendations for Avi Controller and Service Engines. The enforcement is as per CIS DIL 1.0.1 level 2, for applicable controls. Field introduced in 17.2.8.")


 
  @VsoMethod  
  public Boolean isCisMode() {
    return cisMode;
  }
    
  @VsoMethod
  public void setCisMode(Boolean cisMode) {
    this.cisMode = cisMode;
  }

  
  /**
   * Message of the day, shown to users on login via the command line interface, web interface, or ssh.
   * @return motd
  **/
  @ApiModelProperty(value = "Message of the day, shown to users on login via the command line interface, web interface, or ssh.")


 
  @VsoMethod  
  public String getMotd() {
    return motd;
  }
    
  @VsoMethod
  public void setMotd(String motd) {
    this.motd = motd;
  }

  
  public String getObjectID() {
		return "LinuxConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinuxConfiguration linuxConfiguration = (LinuxConfiguration) o;
    return Objects.equals(this.banner, linuxConfiguration.banner) &&
        Objects.equals(this.cisMode, linuxConfiguration.cisMode) &&
        Objects.equals(this.motd, linuxConfiguration.motd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(banner, cisMode, motd);
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

