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
 * The PortalFeatureOptIn is a POJO class extends AviRestResource that used for creating
 * PortalFeatureOptIn.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PortalFeatureOptIn")
@VsoFinder(name = Constants.FINDER_VRO_PORTALFEATUREOPTIN)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PortalFeatureOptIn extends AviRestResource {
  @JsonProperty("enable_auto_case_creation_on_se_failure")
  @JsonInclude(Include.NON_NULL)
  private Boolean enableAutoCaseCreationOnSeFailure = false;

  @JsonProperty("enable_auto_case_creation_on_system_failure")
  @JsonInclude(Include.NON_NULL)
  private Boolean enableAutoCaseCreationOnSystemFailure = false;

  @JsonProperty("enable_auto_download_waf_signatures")
  @JsonInclude(Include.NON_NULL)
  private Boolean enableAutoDownloadWafSignatures = false;

  @JsonProperty("enable_ip_reputation")
  @JsonInclude(Include.NON_NULL)
  private Boolean enableIpReputation = false;

  @JsonProperty("enable_waf_signatures_notifications")
  @JsonInclude(Include.NON_NULL)
  private Boolean enableWafSignaturesNotifications = true;



  /**
   * This is the getter method this will return the attribute value.
   * Flag to check if the user has opted in for proactive case creation on service engine failure.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableAutoCaseCreationOnSeFailure
   */
  @VsoMethod
  public Boolean getEnableAutoCaseCreationOnSeFailure() {
    return enableAutoCaseCreationOnSeFailure;
  }

  /**
   * This is the setter method to the attribute.
   * Flag to check if the user has opted in for proactive case creation on service engine failure.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableAutoCaseCreationOnSeFailure set the enableAutoCaseCreationOnSeFailure.
   */
  @VsoMethod
  public void setEnableAutoCaseCreationOnSeFailure(Boolean  enableAutoCaseCreationOnSeFailure) {
    this.enableAutoCaseCreationOnSeFailure = enableAutoCaseCreationOnSeFailure;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag to check if the user has opted in for proactive case creation on system failure.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableAutoCaseCreationOnSystemFailure
   */
  @VsoMethod
  public Boolean getEnableAutoCaseCreationOnSystemFailure() {
    return enableAutoCaseCreationOnSystemFailure;
  }

  /**
   * This is the setter method to the attribute.
   * Flag to check if the user has opted in for proactive case creation on system failure.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableAutoCaseCreationOnSystemFailure set the enableAutoCaseCreationOnSystemFailure.
   */
  @VsoMethod
  public void setEnableAutoCaseCreationOnSystemFailure(Boolean  enableAutoCaseCreationOnSystemFailure) {
    this.enableAutoCaseCreationOnSystemFailure = enableAutoCaseCreationOnSystemFailure;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag to check if the user has opted in for auto deployment of crs data on controller.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableAutoDownloadWafSignatures
   */
  @VsoMethod
  public Boolean getEnableAutoDownloadWafSignatures() {
    return enableAutoDownloadWafSignatures;
  }

  /**
   * This is the setter method to the attribute.
   * Flag to check if the user has opted in for auto deployment of crs data on controller.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableAutoDownloadWafSignatures set the enableAutoDownloadWafSignatures.
   */
  @VsoMethod
  public void setEnableAutoDownloadWafSignatures(Boolean  enableAutoDownloadWafSignatures) {
    this.enableAutoDownloadWafSignatures = enableAutoDownloadWafSignatures;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag to check if the user has opted in for automated ip reputation db sync.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableIpReputation
   */
  @VsoMethod
  public Boolean getEnableIpReputation() {
    return enableIpReputation;
  }

  /**
   * This is the setter method to the attribute.
   * Flag to check if the user has opted in for automated ip reputation db sync.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableIpReputation set the enableIpReputation.
   */
  @VsoMethod
  public void setEnableIpReputation(Boolean  enableIpReputation) {
    this.enableIpReputation = enableIpReputation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Flag to check if the user has opted in for notifications about the availability of new crs data.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enableWafSignaturesNotifications
   */
  @VsoMethod
  public Boolean getEnableWafSignaturesNotifications() {
    return enableWafSignaturesNotifications;
  }

  /**
   * This is the setter method to the attribute.
   * Flag to check if the user has opted in for notifications about the availability of new crs data.
   * Field introduced in 20.1.1.
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
  PortalFeatureOptIn objPortalFeatureOptIn = (PortalFeatureOptIn) o;
  return   Objects.equals(this.enableAutoDownloadWafSignatures, objPortalFeatureOptIn.enableAutoDownloadWafSignatures)&&
  Objects.equals(this.enableWafSignaturesNotifications, objPortalFeatureOptIn.enableWafSignaturesNotifications)&&
  Objects.equals(this.enableAutoCaseCreationOnSystemFailure, objPortalFeatureOptIn.enableAutoCaseCreationOnSystemFailure)&&
  Objects.equals(this.enableAutoCaseCreationOnSeFailure, objPortalFeatureOptIn.enableAutoCaseCreationOnSeFailure)&&
  Objects.equals(this.enableIpReputation, objPortalFeatureOptIn.enableIpReputation);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PortalFeatureOptIn {\n");
      sb.append("    enableAutoCaseCreationOnSeFailure: ").append(toIndentedString(enableAutoCaseCreationOnSeFailure)).append("\n");
        sb.append("    enableAutoCaseCreationOnSystemFailure: ").append(toIndentedString(enableAutoCaseCreationOnSystemFailure)).append("\n");
        sb.append("    enableAutoDownloadWafSignatures: ").append(toIndentedString(enableAutoDownloadWafSignatures)).append("\n");
        sb.append("    enableIpReputation: ").append(toIndentedString(enableIpReputation)).append("\n");
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

