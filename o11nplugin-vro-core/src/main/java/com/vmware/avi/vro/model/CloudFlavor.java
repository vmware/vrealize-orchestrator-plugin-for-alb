package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.CloudMeta;
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
 * CloudFlavor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CloudFlavor")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDFLAVOR, idAccessor = "getObjectID()")
@Service
public class CloudFlavor extends AviRestResource  {
  @JsonProperty("cost")
  private String cost = null;

  @JsonProperty("disk_gb")
  private Integer diskGb = null;

  @JsonProperty("enhanced_nw")
  private Boolean enhancedNw = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("is_recommended")
  private Boolean isRecommended = null;

  @JsonProperty("max_ip6s_per_nic")
  private Integer maxIp6sPerNic = null;

  @JsonProperty("max_ips_per_nic")
  private Integer maxIpsPerNic = null;

  @JsonProperty("max_nics")
  private Integer maxNics = null;

  @JsonProperty("meta")
  @Valid
  private List<CloudMeta> meta = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("public")
  private Boolean _public = true;

  @JsonProperty("ram_mb")
  private Integer ramMb = null;

  @JsonProperty("vcpus")
  private Integer vcpus = null;

  
  /**
   * cost of CloudFlavor.
   * @return cost
  **/
  @ApiModelProperty(value = "cost of CloudFlavor.")


 
  @VsoMethod  
  public String getCost() {
    return cost;
  }
    
  @VsoMethod
  public void setCost(String cost) {
    this.cost = cost;
  }

  
  /**
   * Number of disk_gb.
   * @return diskGb
  **/
  @ApiModelProperty(value = "Number of disk_gb.")


 
  @VsoMethod  
  public Integer getDiskGb() {
    return diskGb;
  }
    
  @VsoMethod
  public void setDiskGb(Integer diskGb) {
    this.diskGb = diskGb;
  }

  
  /**
   * Placeholder for description of property enhanced_nw of obj type CloudFlavor field type str  type boolean
   * @return enhancedNw
  **/
  @ApiModelProperty(value = "Placeholder for description of property enhanced_nw of obj type CloudFlavor field type str  type boolean")


 
  @VsoMethod  
  public Boolean isEnhancedNw() {
    return enhancedNw;
  }
    
  @VsoMethod
  public void setEnhancedNw(Boolean enhancedNw) {
    this.enhancedNw = enhancedNw;
  }

  
  /**
   * id of CloudFlavor.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "id of CloudFlavor.")
  @NotNull


 
  @VsoMethod  
  public String getId() {
    return id;
  }
    
  @VsoMethod
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * If a vm flavor is recommended for requested se_usage_type.Set to True if the chosen VM flavor is recommended for requested se_usage_type.Else set to False. Field introduced in 18.1.4, 18.2.1.
   * @return isRecommended
  **/
  @ApiModelProperty(value = "If a vm flavor is recommended for requested se_usage_type.Set to True if the chosen VM flavor is recommended for requested se_usage_type.Else set to False. Field introduced in 18.1.4, 18.2.1.")


 
  @VsoMethod  
  public Boolean isIsRecommended() {
    return isRecommended;
  }
    
  @VsoMethod
  public void setIsRecommended(Boolean isRecommended) {
    this.isRecommended = isRecommended;
  }

  
  /**
   * Maximum number of IPv6 addresses that can be configured per NIC. Field introduced in 18.1.1.
   * @return maxIp6sPerNic
  **/
  @ApiModelProperty(value = "Maximum number of IPv6 addresses that can be configured per NIC. Field introduced in 18.1.1.")


 
  @VsoMethod  
  public Integer getMaxIp6sPerNic() {
    return maxIp6sPerNic;
  }
    
  @VsoMethod
  public void setMaxIp6sPerNic(Integer maxIp6sPerNic) {
    this.maxIp6sPerNic = maxIp6sPerNic;
  }

  
  /**
   * Number of max_ips_per_nic.
   * @return maxIpsPerNic
  **/
  @ApiModelProperty(value = "Number of max_ips_per_nic.")


 
  @VsoMethod  
  public Integer getMaxIpsPerNic() {
    return maxIpsPerNic;
  }
    
  @VsoMethod
  public void setMaxIpsPerNic(Integer maxIpsPerNic) {
    this.maxIpsPerNic = maxIpsPerNic;
  }

  
  /**
   * Number of max_nics.
   * @return maxNics
  **/
  @ApiModelProperty(value = "Number of max_nics.")


 
  @VsoMethod  
  public Integer getMaxNics() {
    return maxNics;
  }
    
  @VsoMethod
  public void setMaxNics(Integer maxNics) {
    this.maxNics = maxNics;
  }

  
  public CloudFlavor addMetaItem(CloudMeta metaItem) {
    if (this.meta == null) {
      this.meta = new ArrayList<CloudMeta>();
    }
    this.meta.add(metaItem);
    return this;
  }
  
  /**
   * Placeholder for description of property meta of obj type CloudFlavor field type str  type object
   * @return meta
  **/
  @ApiModelProperty(value = "Placeholder for description of property meta of obj type CloudFlavor field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<CloudMeta> getMeta() {
    return meta;
  }
    
  @VsoMethod
  public void setMeta(List<CloudMeta> meta) {
    this.meta = meta;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
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
   * Placeholder for description of property public of obj type CloudFlavor field type str  type boolean
   * @return _public
  **/
  @ApiModelProperty(value = "Placeholder for description of property public of obj type CloudFlavor field type str  type boolean")


 
  @VsoMethod  
  public Boolean isPublic() {
    return _public;
  }
    
  @VsoMethod
  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  
  /**
   * Number of ram_mb.
   * @return ramMb
  **/
  @ApiModelProperty(value = "Number of ram_mb.")


 
  @VsoMethod  
  public Integer getRamMb() {
    return ramMb;
  }
    
  @VsoMethod
  public void setRamMb(Integer ramMb) {
    this.ramMb = ramMb;
  }

  
  /**
   * Number of vcpus.
   * @return vcpus
  **/
  @ApiModelProperty(value = "Number of vcpus.")


 
  @VsoMethod  
  public Integer getVcpus() {
    return vcpus;
  }
    
  @VsoMethod
  public void setVcpus(Integer vcpus) {
    this.vcpus = vcpus;
  }

  
  public String getObjectID() {
		return "CloudFlavor";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudFlavor cloudFlavor = (CloudFlavor) o;
    return Objects.equals(this.cost, cloudFlavor.cost) &&
        Objects.equals(this.diskGb, cloudFlavor.diskGb) &&
        Objects.equals(this.enhancedNw, cloudFlavor.enhancedNw) &&
        Objects.equals(this.id, cloudFlavor.id) &&
        Objects.equals(this.isRecommended, cloudFlavor.isRecommended) &&
        Objects.equals(this.maxIp6sPerNic, cloudFlavor.maxIp6sPerNic) &&
        Objects.equals(this.maxIpsPerNic, cloudFlavor.maxIpsPerNic) &&
        Objects.equals(this.maxNics, cloudFlavor.maxNics) &&
        Objects.equals(this.meta, cloudFlavor.meta) &&
        Objects.equals(this.name, cloudFlavor.name) &&
        Objects.equals(this._public, cloudFlavor._public) &&
        Objects.equals(this.ramMb, cloudFlavor.ramMb) &&
        Objects.equals(this.vcpus, cloudFlavor.vcpus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, diskGb, enhancedNw, id, isRecommended, maxIp6sPerNic, maxIpsPerNic, maxNics, meta, name, _public, ramMb, vcpus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudFlavor {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    diskGb: ").append(toIndentedString(diskGb)).append("\n");
    sb.append("    enhancedNw: ").append(toIndentedString(enhancedNw)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isRecommended: ").append(toIndentedString(isRecommended)).append("\n");
    sb.append("    maxIp6sPerNic: ").append(toIndentedString(maxIp6sPerNic)).append("\n");
    sb.append("    maxIpsPerNic: ").append(toIndentedString(maxIpsPerNic)).append("\n");
    sb.append("    maxNics: ").append(toIndentedString(maxNics)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    ramMb: ").append(toIndentedString(ramMb)).append("\n");
    sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
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

