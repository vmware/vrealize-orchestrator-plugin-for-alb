package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsInfo;
import com.vmware.avi.vro.model.Vip;
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
 * VsVip
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:16:52.085+05:30")

@VsoObject(create = false, name = "VsVip")
@VsoFinder(name = Constants.FINDER_VRO_VSVIP, idAccessor = "getObjectID()")
@Service
public class VsVip extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("dns_info")
  @Valid
  private List<DnsInfo> dnsInfo = null;

  @JsonProperty("east_west_placement")
  private Boolean eastWestPlacement = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("use_standard_alb")
  private Boolean useStandardAlb = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vip")
  @Valid
  private List<Vip> vip = null;

  @JsonProperty("vrf_context_ref")
  private String vrfContextRef = null;

  @JsonProperty("vsvip_cloud_config_cksum")
  private String vsvipCloudConfigCksum = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   *  It is a reference to an object of type Cloud. Field introduced in 17.1.1.
   * @return cloudRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Cloud. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getCloudRef() {
    return cloudRef;
  }
    
  @VsoMethod
  public void setCloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
  }

  
  public VsVip addDnsInfoItem(DnsInfo dnsInfoItem) {
    if (this.dnsInfo == null) {
      this.dnsInfo = new ArrayList<DnsInfo>();
    }
    this.dnsInfo.add(dnsInfoItem);
    return this;
  }
  
  /**
   * Service discovery specific data including fully qualified domain name, type and Time-To-Live of the DNS record. Field introduced in 17.1.1.
   * @return dnsInfo
  **/
  @ApiModelProperty(value = "Service discovery specific data including fully qualified domain name, type and Time-To-Live of the DNS record. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<DnsInfo> getDnsInfo() {
    return dnsInfo;
  }
    
  @VsoMethod
  public void setDnsInfo(List<DnsInfo> dnsInfo) {
    this.dnsInfo = dnsInfo;
  }

  
  /**
   * Force placement on all Service Engines in the Service Engine Group (Container clouds only). Field introduced in 17.1.1.
   * @return eastWestPlacement
  **/
  @ApiModelProperty(value = "Force placement on all Service Engines in the Service Engine Group (Container clouds only). Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isEastWestPlacement() {
    return eastWestPlacement;
  }
    
  @VsoMethod
  public void setEastWestPlacement(Boolean eastWestPlacement) {
    this.eastWestPlacement = eastWestPlacement;
  }

  
  /**
   * Name for the VsVip object. Field introduced in 17.1.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name for the VsVip object. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   *  It is a reference to an object of type Tenant. Field introduced in 17.1.1.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * This overrides the cloud level default and needs to match the SE Group value in which it will be used if the SE Group use_standard_alb value is set. This is only used when FIP is used for VS on Azure Cloud. Field introduced in 18.2.3.
   * @return useStandardAlb
  **/
  @ApiModelProperty(value = "This overrides the cloud level default and needs to match the SE Group value in which it will be used if the SE Group use_standard_alb value is set. This is only used when FIP is used for VS on Azure Cloud. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isUseStandardAlb() {
    return useStandardAlb;
  }
    
  @VsoMethod
  public void setUseStandardAlb(Boolean useStandardAlb) {
    this.useStandardAlb = useStandardAlb;
  }

  
  /**
   * UUID of the VsVip object. Field introduced in 17.1.1.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the VsVip object. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public VsVip addVipItem(Vip vipItem) {
    if (this.vip == null) {
      this.vip = new ArrayList<Vip>();
    }
    this.vip.add(vipItem);
    return this;
  }
  
  /**
   * List of Virtual Service IPs and other shareable entities. Field introduced in 17.1.1.
   * @return vip
  **/
  @ApiModelProperty(value = "List of Virtual Service IPs and other shareable entities. Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public List<Vip> getVip() {
    return vip;
  }
    
  @VsoMethod
  public void setVip(List<Vip> vip) {
    this.vip = vip;
  }

  
  /**
   * Virtual Routing Context that the Virtual Service is bound to. This is used to provide the isolation of the set of networks the application is attached to. It is a reference to an object of type VrfContext. Field introduced in 17.1.1.
   * @return vrfContextRef
  **/
  @ApiModelProperty(value = "Virtual Routing Context that the Virtual Service is bound to. This is used to provide the isolation of the set of networks the application is attached to. It is a reference to an object of type VrfContext. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getVrfContextRef() {
    return vrfContextRef;
  }
    
  @VsoMethod
  public void setVrfContextRef(String vrfContextRef) {
    this.vrfContextRef = vrfContextRef;
  }

  
  /**
   * Checksum of cloud configuration for VsVip. Internally set by cloud connector. Field introduced in 17.2.9, 18.1.2.
   * @return vsvipCloudConfigCksum
  **/
  @ApiModelProperty(value = "Checksum of cloud configuration for VsVip. Internally set by cloud connector. Field introduced in 17.2.9, 18.1.2.")


 
  @VsoMethod  
  public String getVsvipCloudConfigCksum() {
    return vsvipCloudConfigCksum;
  }
    
  @VsoMethod
  public void setVsvipCloudConfigCksum(String vsvipCloudConfigCksum) {
    this.vsvipCloudConfigCksum = vsvipCloudConfigCksum;
  }

  
  public String getObjectID() {
		return "VsVip";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsVip vsVip = (VsVip) o;
    return Objects.equals(this.lastModified, vsVip.lastModified) &&
        Objects.equals(this.cloudRef, vsVip.cloudRef) &&
        Objects.equals(this.dnsInfo, vsVip.dnsInfo) &&
        Objects.equals(this.eastWestPlacement, vsVip.eastWestPlacement) &&
        Objects.equals(this.name, vsVip.name) &&
        Objects.equals(this.tenantRef, vsVip.tenantRef) &&
        Objects.equals(this.url, vsVip.url) &&
        Objects.equals(this.useStandardAlb, vsVip.useStandardAlb) &&
        Objects.equals(this.uuid, vsVip.uuid) &&
        Objects.equals(this.vip, vsVip.vip) &&
        Objects.equals(this.vrfContextRef, vsVip.vrfContextRef) &&
        Objects.equals(this.vsvipCloudConfigCksum, vsVip.vsvipCloudConfigCksum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, cloudRef, dnsInfo, eastWestPlacement, name, tenantRef, url, useStandardAlb, uuid, vip, vrfContextRef, vsvipCloudConfigCksum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsVip {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    dnsInfo: ").append(toIndentedString(dnsInfo)).append("\n");
    sb.append("    eastWestPlacement: ").append(toIndentedString(eastWestPlacement)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useStandardAlb: ").append(toIndentedString(useStandardAlb)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
    sb.append("    vrfContextRef: ").append(toIndentedString(vrfContextRef)).append("\n");
    sb.append("    vsvipCloudConfigCksum: ").append(toIndentedString(vsvipCloudConfigCksum)).append("\n");
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

