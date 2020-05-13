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
 * AzureClusterInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AzureClusterInfo")
@VsoFinder(name = Constants.FINDER_VRO_AZURECLUSTERINFO, idAccessor = "getObjectID()")
@Service
public class AzureClusterInfo extends AviRestResource  {
  @JsonProperty("cloud_credential_ref")
  private String cloudCredentialRef = null;

  @JsonProperty("subscription_id")
  private String subscriptionId = null;

  
  /**
   *  It is a reference to an object of type CloudConnectorUser. Field introduced in 17.2.5.
   * @return cloudCredentialRef
  **/
  @ApiModelProperty(required = true, value = " It is a reference to an object of type CloudConnectorUser. Field introduced in 17.2.5.")
  @NotNull


 
  @VsoMethod  
  public String getCloudCredentialRef() {
    return cloudCredentialRef;
  }
    
  @VsoMethod
  public void setCloudCredentialRef(String cloudCredentialRef) {
    this.cloudCredentialRef = cloudCredentialRef;
  }

  
  /**
   *  Field introduced in 17.2.5.
   * @return subscriptionId
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 17.2.5.")
  @NotNull


 
  @VsoMethod  
  public String getSubscriptionId() {
    return subscriptionId;
  }
    
  @VsoMethod
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  
  public String getObjectID() {
		return "AzureClusterInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureClusterInfo azureClusterInfo = (AzureClusterInfo) o;
    return Objects.equals(this.cloudCredentialRef, azureClusterInfo.cloudCredentialRef) &&
        Objects.equals(this.subscriptionId, azureClusterInfo.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudCredentialRef, subscriptionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureClusterInfo {\n");
    
    sb.append("    cloudCredentialRef: ").append(toIndentedString(cloudCredentialRef)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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

