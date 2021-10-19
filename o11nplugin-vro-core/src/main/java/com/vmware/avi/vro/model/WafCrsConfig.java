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
 * The WafCrsConfig is a POJO class extends AviRestResource that used for creating
 * WafCrsConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafCrsConfig")
@VsoFinder(name = Constants.FINDER_VRO_WAFCRSCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafCrsConfig extends AviRestResource {
    @JsonProperty("enable_auto_download_waf_signatures")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableAutoDownloadWafSignatures = false;

    @JsonProperty("enable_waf_signatures_notifications")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableWafSignaturesNotifications = true;



  /**
   * This is the getter method this will return the attribute value.
   * Enable to automatically download new waf signatures/crs version to the controller.
   * Field introduced in 21.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableAutoDownloadWafSignatures
   */
  @VsoMethod
  public Boolean getEnableAutoDownloadWafSignatures() {
    return enableAutoDownloadWafSignatures;
  }

  /**
   * This is the setter method to the attribute.
   * Enable to automatically download new waf signatures/crs version to the controller.
   * Field introduced in 21.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableAutoDownloadWafSignatures set the enableAutoDownloadWafSignatures.
   */
  @VsoMethod
  public void setEnableAutoDownloadWafSignatures(Boolean  enableAutoDownloadWafSignatures) {
    this.enableAutoDownloadWafSignatures = enableAutoDownloadWafSignatures;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable event notifications when new waf signatures/crs versions are available.
   * Field introduced in 21.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Special default for basic edition is false, essentials edition is false, enterprise is true.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enableWafSignaturesNotifications
   */
  @VsoMethod
  public Boolean getEnableWafSignaturesNotifications() {
    return enableWafSignaturesNotifications;
  }

  /**
   * This is the setter method to the attribute.
   * Enable event notifications when new waf signatures/crs versions are available.
   * Field introduced in 21.1.1.
   * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
   * Special default for basic edition is false, essentials edition is false, enterprise is true.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enableWafSignaturesNotifications set the enableWafSignaturesNotifications.
   */
  @VsoMethod
  public void setEnableWafSignaturesNotifications(Boolean  enableWafSignaturesNotifications) {
    this.enableWafSignaturesNotifications = enableWafSignaturesNotifications;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WafCrsConfig objWafCrsConfig = (WafCrsConfig) o;
  return   Objects.equals(this.enableAutoDownloadWafSignatures, objWafCrsConfig.enableAutoDownloadWafSignatures)&&
  Objects.equals(this.enableWafSignaturesNotifications, objWafCrsConfig.enableWafSignaturesNotifications);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafCrsConfig {\n");
      sb.append("    enableAutoDownloadWafSignatures: ").append(toIndentedString(enableAutoDownloadWafSignatures)).append("\n");
        sb.append("    enableWafSignaturesNotifications: ").append(toIndentedString(enableWafSignaturesNotifications)).append("\n");
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

