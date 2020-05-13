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
 * PortalFeatureOptIn
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PortalFeatureOptIn")
@VsoFinder(name = Constants.FINDER_VRO_PORTALFEATUREOPTIN, idAccessor = "getObjectID()")
@Service
public class PortalFeatureOptIn extends AviRestResource  {
  @JsonProperty("enable_auto_case_creation_on_se_failure")
  private Boolean enableAutoCaseCreationOnSeFailure = null;

  @JsonProperty("enable_auto_case_creation_on_system_failure")
  private Boolean enableAutoCaseCreationOnSystemFailure = null;

  @JsonProperty("enable_auto_download_waf_signatures")
  private Boolean enableAutoDownloadWafSignatures = null;

  @JsonProperty("enable_waf_signatures_notifications")
  private Boolean enableWafSignaturesNotifications = true;

  
  /**
   * Flag to check if the user has opted in for proactive case creation on service engine failure. Field introduced in 20.1.1.
   * @return enableAutoCaseCreationOnSeFailure
  **/
  @ApiModelProperty(value = "Flag to check if the user has opted in for proactive case creation on service engine failure. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isEnableAutoCaseCreationOnSeFailure() {
    return enableAutoCaseCreationOnSeFailure;
  }
    
  @VsoMethod
  public void setEnableAutoCaseCreationOnSeFailure(Boolean enableAutoCaseCreationOnSeFailure) {
    this.enableAutoCaseCreationOnSeFailure = enableAutoCaseCreationOnSeFailure;
  }

  
  /**
   * Flag to check if the user has opted in for proactive case creation on system failure. Field introduced in 20.1.1.
   * @return enableAutoCaseCreationOnSystemFailure
  **/
  @ApiModelProperty(value = "Flag to check if the user has opted in for proactive case creation on system failure. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isEnableAutoCaseCreationOnSystemFailure() {
    return enableAutoCaseCreationOnSystemFailure;
  }
    
  @VsoMethod
  public void setEnableAutoCaseCreationOnSystemFailure(Boolean enableAutoCaseCreationOnSystemFailure) {
    this.enableAutoCaseCreationOnSystemFailure = enableAutoCaseCreationOnSystemFailure;
  }

  
  /**
   * Flag to check if the user has opted in for auto deployment of CRS data on controller. Field introduced in 20.1.1.
   * @return enableAutoDownloadWafSignatures
  **/
  @ApiModelProperty(value = "Flag to check if the user has opted in for auto deployment of CRS data on controller. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isEnableAutoDownloadWafSignatures() {
    return enableAutoDownloadWafSignatures;
  }
    
  @VsoMethod
  public void setEnableAutoDownloadWafSignatures(Boolean enableAutoDownloadWafSignatures) {
    this.enableAutoDownloadWafSignatures = enableAutoDownloadWafSignatures;
  }

  
  /**
   * Flag to check if the user has opted in for notifications about the availability of new CRS data. Field introduced in 20.1.1.
   * @return enableWafSignaturesNotifications
  **/
  @ApiModelProperty(value = "Flag to check if the user has opted in for notifications about the availability of new CRS data. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isEnableWafSignaturesNotifications() {
    return enableWafSignaturesNotifications;
  }
    
  @VsoMethod
  public void setEnableWafSignaturesNotifications(Boolean enableWafSignaturesNotifications) {
    this.enableWafSignaturesNotifications = enableWafSignaturesNotifications;
  }

  
  public String getObjectID() {
		return "PortalFeatureOptIn";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortalFeatureOptIn portalFeatureOptIn = (PortalFeatureOptIn) o;
    return Objects.equals(this.enableAutoCaseCreationOnSeFailure, portalFeatureOptIn.enableAutoCaseCreationOnSeFailure) &&
        Objects.equals(this.enableAutoCaseCreationOnSystemFailure, portalFeatureOptIn.enableAutoCaseCreationOnSystemFailure) &&
        Objects.equals(this.enableAutoDownloadWafSignatures, portalFeatureOptIn.enableAutoDownloadWafSignatures) &&
        Objects.equals(this.enableWafSignaturesNotifications, portalFeatureOptIn.enableWafSignaturesNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableAutoCaseCreationOnSeFailure, enableAutoCaseCreationOnSystemFailure, enableAutoDownloadWafSignatures, enableWafSignaturesNotifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortalFeatureOptIn {\n");
    
    sb.append("    enableAutoCaseCreationOnSeFailure: ").append(toIndentedString(enableAutoCaseCreationOnSeFailure)).append("\n");
    sb.append("    enableAutoCaseCreationOnSystemFailure: ").append(toIndentedString(enableAutoCaseCreationOnSystemFailure)).append("\n");
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

