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
 * IpamDnsOCIProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpamDnsOCIProfile")
@VsoFinder(name = Constants.FINDER_VRO_IPAMDNSOCIPROFILE, idAccessor = "getObjectID()")
@Service
public class IpamDnsOCIProfile extends AviRestResource  {
  @JsonProperty("cloud_credentials_ref")
  private String cloudCredentialsRef = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("tenancy")
  private String tenancy = null;

  @JsonProperty("vcn_compartment_id")
  private String vcnCompartmentId = null;

  @JsonProperty("vcn_id")
  private String vcnId = null;

  
  /**
   * Credentials to access oracle cloud. It is a reference to an object of type CloudConnectorUser. Field introduced in 18.2.1,18.1.3.
   * @return cloudCredentialsRef
  **/
  @ApiModelProperty(value = "Credentials to access oracle cloud. It is a reference to an object of type CloudConnectorUser. Field introduced in 18.2.1,18.1.3.")


 
  @VsoMethod  
  public String getCloudCredentialsRef() {
    return cloudCredentialsRef;
  }
    
  @VsoMethod
  public void setCloudCredentialsRef(String cloudCredentialsRef) {
    this.cloudCredentialsRef = cloudCredentialsRef;
  }

  
  /**
   * Region in which Oracle cloud resource resides. Field introduced in 18.2.1,18.1.3.
   * @return region
  **/
  @ApiModelProperty(value = "Region in which Oracle cloud resource resides. Field introduced in 18.2.1,18.1.3.")


 
  @VsoMethod  
  public String getRegion() {
    return region;
  }
    
  @VsoMethod
  public void setRegion(String region) {
    this.region = region;
  }

  
  /**
   * Oracle Cloud Id for tenant aka root compartment. Field introduced in 18.2.1,18.1.3.
   * @return tenancy
  **/
  @ApiModelProperty(value = "Oracle Cloud Id for tenant aka root compartment. Field introduced in 18.2.1,18.1.3.")


 
  @VsoMethod  
  public String getTenancy() {
    return tenancy;
  }
    
  @VsoMethod
  public void setTenancy(String tenancy) {
    this.tenancy = tenancy;
  }

  
  /**
   * Oracle cloud compartment id in which VCN resides. Field introduced in 18.2.1,18.1.3.
   * @return vcnCompartmentId
  **/
  @ApiModelProperty(value = "Oracle cloud compartment id in which VCN resides. Field introduced in 18.2.1,18.1.3.")


 
  @VsoMethod  
  public String getVcnCompartmentId() {
    return vcnCompartmentId;
  }
    
  @VsoMethod
  public void setVcnCompartmentId(String vcnCompartmentId) {
    this.vcnCompartmentId = vcnCompartmentId;
  }

  
  /**
   * Virtual Cloud network id where virtual ip will belong. Field introduced in 18.2.1,18.1.3.
   * @return vcnId
  **/
  @ApiModelProperty(value = "Virtual Cloud network id where virtual ip will belong. Field introduced in 18.2.1,18.1.3.")


 
  @VsoMethod  
  public String getVcnId() {
    return vcnId;
  }
    
  @VsoMethod
  public void setVcnId(String vcnId) {
    this.vcnId = vcnId;
  }

  
  public String getObjectID() {
		return "IpamDnsOCIProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpamDnsOCIProfile ipamDnsOCIProfile = (IpamDnsOCIProfile) o;
    return Objects.equals(this.cloudCredentialsRef, ipamDnsOCIProfile.cloudCredentialsRef) &&
        Objects.equals(this.region, ipamDnsOCIProfile.region) &&
        Objects.equals(this.tenancy, ipamDnsOCIProfile.tenancy) &&
        Objects.equals(this.vcnCompartmentId, ipamDnsOCIProfile.vcnCompartmentId) &&
        Objects.equals(this.vcnId, ipamDnsOCIProfile.vcnId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudCredentialsRef, region, tenancy, vcnCompartmentId, vcnId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpamDnsOCIProfile {\n");
    
    sb.append("    cloudCredentialsRef: ").append(toIndentedString(cloudCredentialsRef)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
    sb.append("    vcnCompartmentId: ").append(toIndentedString(vcnCompartmentId)).append("\n");
    sb.append("    vcnId: ").append(toIndentedString(vcnId)).append("\n");
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

