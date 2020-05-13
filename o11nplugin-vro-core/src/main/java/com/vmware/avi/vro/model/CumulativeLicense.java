package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SEBandwidthLimit;
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
 * CumulativeLicense
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CumulativeLicense")
@VsoFinder(name = Constants.FINDER_VRO_CUMULATIVELICENSE, idAccessor = "getObjectID()")
@Service
public class CumulativeLicense extends AviRestResource  {
  @JsonProperty("burst_cores")
  private Integer burstCores = null;

  @JsonProperty("cores")
  private Integer cores = null;

  @JsonProperty("max_ses")
  private Integer maxSes = null;

  @JsonProperty("se_bandwidth_limits")
  @Valid
  private List<SEBandwidthLimit> seBandwidthLimits = null;

  @JsonProperty("sockets")
  private Integer sockets = null;

  @JsonProperty("tier_type")
  private String tierType = null;

  
  /**
   * Total number of Service Engine cores for burst core based licenses. Field introduced in 17.2.5.
   * @return burstCores
  **/
  @ApiModelProperty(value = "Total number of Service Engine cores for burst core based licenses. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public Integer getBurstCores() {
    return burstCores;
  }
    
  @VsoMethod
  public void setBurstCores(Integer burstCores) {
    this.burstCores = burstCores;
  }

  
  /**
   * Total number of Service Engine cores for core based licenses. Field introduced in 17.2.5.
   * @return cores
  **/
  @ApiModelProperty(value = "Total number of Service Engine cores for core based licenses. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public Integer getCores() {
    return cores;
  }
    
  @VsoMethod
  public void setCores(Integer cores) {
    this.cores = cores;
  }

  
  /**
   * Total number of Service Engines for host based licenses. Field introduced in 17.2.5.
   * @return maxSes
  **/
  @ApiModelProperty(value = "Total number of Service Engines for host based licenses. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public Integer getMaxSes() {
    return maxSes;
  }
    
  @VsoMethod
  public void setMaxSes(Integer maxSes) {
    this.maxSes = maxSes;
  }

  
  public CumulativeLicense addSeBandwidthLimitsItem(SEBandwidthLimit seBandwidthLimitsItem) {
    if (this.seBandwidthLimits == null) {
      this.seBandwidthLimits = new ArrayList<SEBandwidthLimit>();
    }
    this.seBandwidthLimits.add(seBandwidthLimitsItem);
    return this;
  }
  
  /**
   * Service Engine bandwidth limits for bandwidth based licenses. Field introduced in 17.2.5.
   * @return seBandwidthLimits
  **/
  @ApiModelProperty(value = "Service Engine bandwidth limits for bandwidth based licenses. Field introduced in 17.2.5.")

  @Valid

 
  @VsoMethod  
  public List<SEBandwidthLimit> getSeBandwidthLimits() {
    return seBandwidthLimits;
  }
    
  @VsoMethod
  public void setSeBandwidthLimits(List<SEBandwidthLimit> seBandwidthLimits) {
    this.seBandwidthLimits = seBandwidthLimits;
  }

  
  /**
   * Total number of Service Engine sockets for socket based licenses. Field introduced in 17.2.5.
   * @return sockets
  **/
  @ApiModelProperty(value = "Total number of Service Engine sockets for socket based licenses. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public Integer getSockets() {
    return sockets;
  }
    
  @VsoMethod
  public void setSockets(Integer sockets) {
    this.sockets = sockets;
  }

  
  /**
   * Specifies the licensed tier. Enum options - ENTERPRISE_16, ENTERPRISE_18. Field introduced in 17.2.5.
   * @return tierType
  **/
  @ApiModelProperty(value = "Specifies the licensed tier. Enum options - ENTERPRISE_16, ENTERPRISE_18. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getTierType() {
    return tierType;
  }
    
  @VsoMethod
  public void setTierType(String tierType) {
    this.tierType = tierType;
  }

  
  public String getObjectID() {
		return "CumulativeLicense";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CumulativeLicense cumulativeLicense = (CumulativeLicense) o;
    return Objects.equals(this.burstCores, cumulativeLicense.burstCores) &&
        Objects.equals(this.cores, cumulativeLicense.cores) &&
        Objects.equals(this.maxSes, cumulativeLicense.maxSes) &&
        Objects.equals(this.seBandwidthLimits, cumulativeLicense.seBandwidthLimits) &&
        Objects.equals(this.sockets, cumulativeLicense.sockets) &&
        Objects.equals(this.tierType, cumulativeLicense.tierType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(burstCores, cores, maxSes, seBandwidthLimits, sockets, tierType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CumulativeLicense {\n");
    
    sb.append("    burstCores: ").append(toIndentedString(burstCores)).append("\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    maxSes: ").append(toIndentedString(maxSes)).append("\n");
    sb.append("    seBandwidthLimits: ").append(toIndentedString(seBandwidthLimits)).append("\n");
    sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
    sb.append("    tierType: ").append(toIndentedString(tierType)).append("\n");
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

