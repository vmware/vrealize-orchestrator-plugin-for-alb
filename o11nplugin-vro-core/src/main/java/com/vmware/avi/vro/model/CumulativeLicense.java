package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The CumulativeLicense is a POJO class extends AviRestResource that used for creating
 * CumulativeLicense.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CumulativeLicense")
@VsoFinder(name = Constants.FINDER_VRO_CUMULATIVELICENSE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CumulativeLicense extends AviRestResource {
  @JsonProperty("burst_cores")
  @JsonInclude(Include.NON_NULL)
  private Integer burstCores = null;

  @JsonProperty("cores")
  @JsonInclude(Include.NON_NULL)
  private Integer cores = null;

  @JsonProperty("max_ses")
  @JsonInclude(Include.NON_NULL)
  private Integer maxSes = null;

  @JsonProperty("se_bandwidth_limits")
  @JsonInclude(Include.NON_NULL)
  private List<SEBandwidthLimit> seBandwidthLimits = null;

  @JsonProperty("service_cores")
  @JsonInclude(Include.NON_NULL)
  private Float serviceCores = null;

  @JsonProperty("sockets")
  @JsonInclude(Include.NON_NULL)
  private Integer sockets = null;

  @JsonProperty("tier_type")
  @JsonInclude(Include.NON_NULL)
  private String tierType = null;



  /**
   * This is the getter method this will return the attribute value.
   * Total number of service engine cores for burst core based licenses.
   * Field introduced in 17.2.5.
   * @return burstCores
   */
  @VsoMethod
  public Integer getBurstCores() {
    return burstCores;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of service engine cores for burst core based licenses.
   * Field introduced in 17.2.5.
   * @param burstCores set the burstCores.
   */
  @VsoMethod
  public void setBurstCores(Integer  burstCores) {
    this.burstCores = burstCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of service engine cores for core based licenses.
   * Field introduced in 17.2.5.
   * @return cores
   */
  @VsoMethod
  public Integer getCores() {
    return cores;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of service engine cores for core based licenses.
   * Field introduced in 17.2.5.
   * @param cores set the cores.
   */
  @VsoMethod
  public void setCores(Integer  cores) {
    this.cores = cores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of service engines for host based licenses.
   * Field introduced in 17.2.5.
   * @return maxSes
   */
  @VsoMethod
  public Integer getMaxSes() {
    return maxSes;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of service engines for host based licenses.
   * Field introduced in 17.2.5.
   * @param maxSes set the maxSes.
   */
  @VsoMethod
  public void setMaxSes(Integer  maxSes) {
    this.maxSes = maxSes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine bandwidth limits for bandwidth based licenses.
   * Field introduced in 17.2.5.
   * @return seBandwidthLimits
   */
  @VsoMethod
  public List<SEBandwidthLimit> getSeBandwidthLimits() {
    return seBandwidthLimits;
  }

  /**
   * This is the setter method. this will set the seBandwidthLimits
   * Service engine bandwidth limits for bandwidth based licenses.
   * Field introduced in 17.2.5.
   * @return seBandwidthLimits
   */
  @VsoMethod
  public void setSeBandwidthLimits(List<SEBandwidthLimit>  seBandwidthLimits) {
    this.seBandwidthLimits = seBandwidthLimits;
  }

  /**
   * This is the setter method this will set the seBandwidthLimits
   * Service engine bandwidth limits for bandwidth based licenses.
   * Field introduced in 17.2.5.
   * @return seBandwidthLimits
   */
  @VsoMethod
  public CumulativeLicense addSeBandwidthLimitsItem(SEBandwidthLimit seBandwidthLimitsItem) {
    if (this.seBandwidthLimits == null) {
      this.seBandwidthLimits = new ArrayList<SEBandwidthLimit>();
    }
    this.seBandwidthLimits.add(seBandwidthLimitsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Total number of service engine cores.
   * Field introduced in 20.1.1.
   * @return serviceCores
   */
  @VsoMethod
  public Float getServiceCores() {
    return serviceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of service engine cores.
   * Field introduced in 20.1.1.
   * @param serviceCores set the serviceCores.
   */
  @VsoMethod
  public void setServiceCores(Float  serviceCores) {
    this.serviceCores = serviceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Total number of service engine sockets for socket based licenses.
   * Field introduced in 17.2.5.
   * @return sockets
   */
  @VsoMethod
  public Integer getSockets() {
    return sockets;
  }

  /**
   * This is the setter method to the attribute.
   * Total number of service engine sockets for socket based licenses.
   * Field introduced in 17.2.5.
   * @param sockets set the sockets.
   */
  @VsoMethod
  public void setSockets(Integer  sockets) {
    this.sockets = sockets;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Specifies the licensed tier.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC.
   * Field introduced in 17.2.5.
   * @return tierType
   */
  @VsoMethod
  public String getTierType() {
    return tierType;
  }

  /**
   * This is the setter method to the attribute.
   * Specifies the licensed tier.
   * Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC.
   * Field introduced in 17.2.5.
   * @param tierType set the tierType.
   */
  @VsoMethod
  public void setTierType(String  tierType) {
    this.tierType = tierType;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CumulativeLicense objCumulativeLicense = (CumulativeLicense) o;
  return   Objects.equals(this.tierType, objCumulativeLicense.tierType)&&
  Objects.equals(this.maxSes, objCumulativeLicense.maxSes)&&
  Objects.equals(this.serviceCores, objCumulativeLicense.serviceCores)&&
  Objects.equals(this.burstCores, objCumulativeLicense.burstCores)&&
  Objects.equals(this.cores, objCumulativeLicense.cores)&&
  Objects.equals(this.sockets, objCumulativeLicense.sockets)&&
  Objects.equals(this.seBandwidthLimits, objCumulativeLicense.seBandwidthLimits);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CumulativeLicense {\n");
      sb.append("    burstCores: ").append(toIndentedString(burstCores)).append("\n");
        sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
        sb.append("    maxSes: ").append(toIndentedString(maxSes)).append("\n");
        sb.append("    seBandwidthLimits: ").append(toIndentedString(seBandwidthLimits)).append("\n");
        sb.append("    serviceCores: ").append(toIndentedString(serviceCores)).append("\n");
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
