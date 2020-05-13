package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.VIAdminCredentials;
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
 * VIDeleteSEReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIDeleteSEReq")
@VsoFinder(name = Constants.FINDER_VRO_VIDELETESEREQ, idAccessor = "getObjectID()")
@Service
public class VIDeleteSEReq extends AviRestResource  {
  @JsonProperty("cloud_uuid")
  private String cloudUuid = null;

  @JsonProperty("segroup_uuid")
  private String segroupUuid = null;

  @JsonProperty("sevm_uuid")
  private String sevmUuid = null;

  @JsonProperty("vcenter_admin")
  private VIAdminCredentials vcenterAdmin = null;

  
  /**
   * Unique object identifier of cloud.
   * @return cloudUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of cloud.")


 
  @VsoMethod  
  public String getCloudUuid() {
    return cloudUuid;
  }
    
  @VsoMethod
  public void setCloudUuid(String cloudUuid) {
    this.cloudUuid = cloudUuid;
  }

  
  /**
   * Unique object identifier of segroup.
   * @return segroupUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of segroup.")


 
  @VsoMethod  
  public String getSegroupUuid() {
    return segroupUuid;
  }
    
  @VsoMethod
  public void setSegroupUuid(String segroupUuid) {
    this.segroupUuid = segroupUuid;
  }

  
  /**
   * Unique object identifier of sevm.
   * @return sevmUuid
  **/
  @ApiModelProperty(required = true, value = "Unique object identifier of sevm.")
  @NotNull


 
  @VsoMethod  
  public String getSevmUuid() {
    return sevmUuid;
  }
    
  @VsoMethod
  public void setSevmUuid(String sevmUuid) {
    this.sevmUuid = sevmUuid;
  }

  
  /**
   * Placeholder for description of property vcenter_admin of obj type VIDeleteSEReq field type str  type object
   * @return vcenterAdmin
  **/
  @ApiModelProperty(value = "Placeholder for description of property vcenter_admin of obj type VIDeleteSEReq field type str  type object")

  @Valid

 
  @VsoMethod  
  public VIAdminCredentials getVcenterAdmin() {
    return vcenterAdmin;
  }
    
  @VsoMethod
  public void setVcenterAdmin(VIAdminCredentials vcenterAdmin) {
    this.vcenterAdmin = vcenterAdmin;
  }

  
  public String getObjectID() {
		return "VIDeleteSEReq";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIDeleteSEReq viDeleteSEReq = (VIDeleteSEReq) o;
    return Objects.equals(this.cloudUuid, viDeleteSEReq.cloudUuid) &&
        Objects.equals(this.segroupUuid, viDeleteSEReq.segroupUuid) &&
        Objects.equals(this.sevmUuid, viDeleteSEReq.sevmUuid) &&
        Objects.equals(this.vcenterAdmin, viDeleteSEReq.vcenterAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudUuid, segroupUuid, sevmUuid, vcenterAdmin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIDeleteSEReq {\n");
    
    sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
    sb.append("    segroupUuid: ").append(toIndentedString(segroupUuid)).append("\n");
    sb.append("    sevmUuid: ").append(toIndentedString(sevmUuid)).append("\n");
    sb.append("    vcenterAdmin: ").append(toIndentedString(vcenterAdmin)).append("\n");
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

