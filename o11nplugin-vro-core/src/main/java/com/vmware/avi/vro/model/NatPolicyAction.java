package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.NatAddrInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * NatPolicyAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NatPolicyAction")
@VsoFinder(name = Constants.FINDER_VRO_NATPOLICYACTION, idAccessor = "getObjectID()")
@Service
public class NatPolicyAction extends AviRestResource  {
  @JsonProperty("nat_info")
  @Valid
  private List<NatAddrInfo> natInfo = null;

  @JsonProperty("type")
  private String type = null;

  
  public NatPolicyAction addNatInfoItem(NatAddrInfo natInfoItem) {
    if (this.natInfo == null) {
      this.natInfo = new ArrayList<NatAddrInfo>();
    }
    this.natInfo.add(natInfoItem);
    return this;
  }
  
  /**
   * Pool of IP Addresses used for Nat. Field introduced in 18.2.5.
   * @return natInfo
  **/
  @ApiModelProperty(value = "Pool of IP Addresses used for Nat. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public List<NatAddrInfo> getNatInfo() {
    return natInfo;
  }
    
  @VsoMethod
  public void setNatInfo(List<NatAddrInfo> natInfo) {
    this.natInfo = natInfo;
  }

  
  /**
   * Nat Action Type. Enum options - NAT_POLICY_ACTION_TYPE_DYNAMIC_IP_PORT. Field introduced in 18.2.5.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Nat Action Type. Enum options - NAT_POLICY_ACTION_TYPE_DYNAMIC_IP_PORT. Field introduced in 18.2.5.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "NatPolicyAction";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatPolicyAction natPolicyAction = (NatPolicyAction) o;
    return Objects.equals(this.natInfo, natPolicyAction.natInfo) &&
        Objects.equals(this.type, natPolicyAction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(natInfo, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatPolicyAction {\n");
    
    sb.append("    natInfo: ").append(toIndentedString(natInfo)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

