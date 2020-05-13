package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * OpenStackVipNetwork
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "OpenStackVipNetwork")
@VsoFinder(name = Constants.FINDER_VRO_OPENSTACKVIPNETWORK, idAccessor = "getObjectID()")
@Service
public class OpenStackVipNetwork extends AviRestResource  {
  @JsonProperty("os_network_uuid")
  private String osNetworkUuid = null;

  @JsonProperty("os_tenant_uuids")
  @Valid
  private List<String> osTenantUuids = null;

  
  /**
   * Neutron network UUID. Field introduced in 18.1.2.
   * @return osNetworkUuid
  **/
  @ApiModelProperty(value = "Neutron network UUID. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public String getOsNetworkUuid() {
    return osNetworkUuid;
  }
    
  @VsoMethod
  public void setOsNetworkUuid(String osNetworkUuid) {
    this.osNetworkUuid = osNetworkUuid;
  }

  
  public OpenStackVipNetwork addOsTenantUuidsItem(String osTenantUuidsItem) {
    if (this.osTenantUuids == null) {
      this.osTenantUuids = new ArrayList<String>();
    }
    this.osTenantUuids.add(osTenantUuidsItem);
    return this;
  }
  
  /**
   * UUIDs of OpenStack tenants that should be allowed to use the specified Neutron network for VIPs. Use '*' to make this network available to all tenants. Field introduced in 18.1.2.
   * @return osTenantUuids
  **/
  @ApiModelProperty(value = "UUIDs of OpenStack tenants that should be allowed to use the specified Neutron network for VIPs. Use '*' to make this network available to all tenants. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public List<String> getOsTenantUuids() {
    return osTenantUuids;
  }
    
  @VsoMethod
  public void setOsTenantUuids(List<String> osTenantUuids) {
    this.osTenantUuids = osTenantUuids;
  }

  
  public String getObjectID() {
		return "OpenStackVipNetwork";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenStackVipNetwork openStackVipNetwork = (OpenStackVipNetwork) o;
    return Objects.equals(this.osNetworkUuid, openStackVipNetwork.osNetworkUuid) &&
        Objects.equals(this.osTenantUuids, openStackVipNetwork.osTenantUuids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osNetworkUuid, osTenantUuids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenStackVipNetwork {\n");
    
    sb.append("    osNetworkUuid: ").append(toIndentedString(osNetworkUuid)).append("\n");
    sb.append("    osTenantUuids: ").append(toIndentedString(osTenantUuids)).append("\n");
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

