package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.FloatingIpSubnet;
import com.vmware.avi.vro.model.IpAddrPrefix;
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
 * VIMgrIPSubnetRuntime
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIMgrIPSubnetRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRIPSUBNETRUNTIME, idAccessor = "getObjectID()")
@Service
public class VIMgrIPSubnetRuntime extends AviRestResource  {
  @JsonProperty("fip_available")
  private Boolean fipAvailable = null;

  @JsonProperty("fip_subnet_uuids")
  @Valid
  private List<String> fipSubnetUuids = null;

  @JsonProperty("floatingip_subnets")
  @Valid
  private List<FloatingIpSubnet> floatingipSubnets = null;

  @JsonProperty("ip_subnet")
  private String ipSubnet = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("prefix")
  private IpAddrPrefix prefix = null;

  @JsonProperty("primary")
  private Boolean primary = null;

  @JsonProperty("ref_count")
  private Integer refCount = null;

  @JsonProperty("se_ref_count")
  private Integer seRefCount = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * If true, capable of floating/elastic IP association.
   * @return fipAvailable
  **/
  @ApiModelProperty(value = "If true, capable of floating/elastic IP association.")


 
  @VsoMethod  
  public Boolean isFipAvailable() {
    return fipAvailable;
  }
    
  @VsoMethod
  public void setFipAvailable(Boolean fipAvailable) {
    this.fipAvailable = fipAvailable;
  }

  
  public VIMgrIPSubnetRuntime addFipSubnetUuidsItem(String fipSubnetUuidsItem) {
    if (this.fipSubnetUuids == null) {
      this.fipSubnetUuids = new ArrayList<String>();
    }
    this.fipSubnetUuids.add(fipSubnetUuidsItem);
    return this;
  }
  
  /**
   * If fip_available is True, this is list of supported FIP subnets, possibly empty if Cloud does not support such a network list.
   * @return fipSubnetUuids
  **/
  @ApiModelProperty(value = "If fip_available is True, this is list of supported FIP subnets, possibly empty if Cloud does not support such a network list.")


 
  @VsoMethod  
  public List<String> getFipSubnetUuids() {
    return fipSubnetUuids;
  }
    
  @VsoMethod
  public void setFipSubnetUuids(List<String> fipSubnetUuids) {
    this.fipSubnetUuids = fipSubnetUuids;
  }

  
  public VIMgrIPSubnetRuntime addFloatingipSubnetsItem(FloatingIpSubnet floatingipSubnetsItem) {
    if (this.floatingipSubnets == null) {
      this.floatingipSubnets = new ArrayList<FloatingIpSubnet>();
    }
    this.floatingipSubnets.add(floatingipSubnetsItem);
    return this;
  }
  
  /**
   * If fip_available is True, the list of associated FloatingIP subnets, possibly empty if unsupported or implictly defined by the Cloud. Field introduced in 17.2.1.
   * @return floatingipSubnets
  **/
  @ApiModelProperty(value = "If fip_available is True, the list of associated FloatingIP subnets, possibly empty if unsupported or implictly defined by the Cloud. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public List<FloatingIpSubnet> getFloatingipSubnets() {
    return floatingipSubnets;
  }
    
  @VsoMethod
  public void setFloatingipSubnets(List<FloatingIpSubnet> floatingipSubnets) {
    this.floatingipSubnets = floatingipSubnets;
  }

  
  /**
   * ip_subnet of VIMgrIPSubnetRuntime.
   * @return ipSubnet
  **/
  @ApiModelProperty(value = "ip_subnet of VIMgrIPSubnetRuntime.")


 
  @VsoMethod  
  public String getIpSubnet() {
    return ipSubnet;
  }
    
  @VsoMethod
  public void setIpSubnet(String ipSubnet) {
    this.ipSubnet = ipSubnet;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the object.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Placeholder for description of property prefix of obj type VIMgrIPSubnetRuntime field type str  type object
   * @return prefix
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property prefix of obj type VIMgrIPSubnetRuntime field type str  type object")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getPrefix() {
    return prefix;
  }
    
  @VsoMethod
  public void setPrefix(IpAddrPrefix prefix) {
    this.prefix = prefix;
  }

  
  /**
   * True if prefix is primary IP on interface, else false.
   * @return primary
  **/
  @ApiModelProperty(value = "True if prefix is primary IP on interface, else false.")


 
  @VsoMethod  
  public Boolean isPrimary() {
    return primary;
  }
    
  @VsoMethod
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  
  /**
   * Number of ref_count.
   * @return refCount
  **/
  @ApiModelProperty(value = "Number of ref_count.")


 
  @VsoMethod  
  public Integer getRefCount() {
    return refCount;
  }
    
  @VsoMethod
  public void setRefCount(Integer refCount) {
    this.refCount = refCount;
  }

  
  /**
   * Number of se_ref_count.
   * @return seRefCount
  **/
  @ApiModelProperty(value = "Number of se_ref_count.")


 
  @VsoMethod  
  public Integer getSeRefCount() {
    return seRefCount;
  }
    
  @VsoMethod
  public void setSeRefCount(Integer seRefCount) {
    this.seRefCount = seRefCount;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "VIMgrIPSubnetRuntime";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIMgrIPSubnetRuntime viMgrIPSubnetRuntime = (VIMgrIPSubnetRuntime) o;
    return Objects.equals(this.fipAvailable, viMgrIPSubnetRuntime.fipAvailable) &&
        Objects.equals(this.fipSubnetUuids, viMgrIPSubnetRuntime.fipSubnetUuids) &&
        Objects.equals(this.floatingipSubnets, viMgrIPSubnetRuntime.floatingipSubnets) &&
        Objects.equals(this.ipSubnet, viMgrIPSubnetRuntime.ipSubnet) &&
        Objects.equals(this.name, viMgrIPSubnetRuntime.name) &&
        Objects.equals(this.prefix, viMgrIPSubnetRuntime.prefix) &&
        Objects.equals(this.primary, viMgrIPSubnetRuntime.primary) &&
        Objects.equals(this.refCount, viMgrIPSubnetRuntime.refCount) &&
        Objects.equals(this.seRefCount, viMgrIPSubnetRuntime.seRefCount) &&
        Objects.equals(this.uuid, viMgrIPSubnetRuntime.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fipAvailable, fipSubnetUuids, floatingipSubnets, ipSubnet, name, prefix, primary, refCount, seRefCount, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIMgrIPSubnetRuntime {\n");
    
    sb.append("    fipAvailable: ").append(toIndentedString(fipAvailable)).append("\n");
    sb.append("    fipSubnetUuids: ").append(toIndentedString(fipSubnetUuids)).append("\n");
    sb.append("    floatingipSubnets: ").append(toIndentedString(floatingipSubnets)).append("\n");
    sb.append("    ipSubnet: ").append(toIndentedString(ipSubnet)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    refCount: ").append(toIndentedString(refCount)).append("\n");
    sb.append("    seRefCount: ").append(toIndentedString(seRefCount)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

