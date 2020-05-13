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
 * SingleLicense
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SingleLicense")
@VsoFinder(name = Constants.FINDER_VRO_SINGLELICENSE, idAccessor = "getObjectID()")
@Service
public class SingleLicense extends AviRestResource  {
  @JsonProperty("burst_cores")
  private Integer burstCores = null;

  @JsonProperty("cores")
  private Integer cores = null;

  @JsonProperty("created_on")
  private String createdOn = null;

  @JsonProperty("customer_name")
  private String customerName = null;

  @JsonProperty("enforced_params")
  @Valid
  private List<String> enforcedParams = null;

  @JsonProperty("last_update")
  private String lastUpdate = null;

  @JsonProperty("license_id")
  private String licenseId = null;

  @JsonProperty("license_name")
  private String licenseName = null;

  @JsonProperty("license_string")
  private String licenseString = null;

  @JsonProperty("license_tier")
  @Valid
  private List<String> licenseTier = null;

  @JsonProperty("license_type")
  private String licenseType = null;

  @JsonProperty("max_ses")
  private Integer maxSes = null;

  @JsonProperty("se_bandwidth_limits")
  @Valid
  private List<SEBandwidthLimit> seBandwidthLimits = null;

  @JsonProperty("serial_key")
  private String serialKey = null;

  @JsonProperty("sockets")
  private Integer sockets = null;

  @JsonProperty("start_on")
  private String startOn = null;

  @JsonProperty("tier_type")
  private String tierType = null;

  @JsonProperty("valid_until")
  private String validUntil = null;

  @JsonProperty("version")
  private String version = null;

  
  /**
   * Total number of Service Engine burst cores for core based licenses. Field introduced in 17.2.5.
   * @return burstCores
  **/
  @ApiModelProperty(value = "Total number of Service Engine burst cores for core based licenses. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public Integer getBurstCores() {
    return burstCores;
  }
    
  @VsoMethod
  public void setBurstCores(Integer burstCores) {
    this.burstCores = burstCores;
  }

  
  /**
   * Number of Service Engine cores in non-container clouds.
   * @return cores
  **/
  @ApiModelProperty(value = "Number of Service Engine cores in non-container clouds.")


 
  @VsoMethod  
  public Integer getCores() {
    return cores;
  }
    
  @VsoMethod
  public void setCores(Integer cores) {
    this.cores = cores;
  }

  
  /**
   * created_on of SingleLicense.
   * @return createdOn
  **/
  @ApiModelProperty(value = "created_on of SingleLicense.")


 
  @VsoMethod  
  public String getCreatedOn() {
    return createdOn;
  }
    
  @VsoMethod
  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  
  /**
   * customer_name of SingleLicense.
   * @return customerName
  **/
  @ApiModelProperty(required = true, value = "customer_name of SingleLicense.")
  @NotNull


 
  @VsoMethod  
  public String getCustomerName() {
    return customerName;
  }
    
  @VsoMethod
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  
  public SingleLicense addEnforcedParamsItem(String enforcedParamsItem) {
    if (this.enforcedParams == null) {
      this.enforcedParams = new ArrayList<String>();
    }
    this.enforcedParams.add(enforcedParamsItem);
    return this;
  }
  
  /**
   * enforced_params of SingleLicense.
   * @return enforcedParams
  **/
  @ApiModelProperty(value = "enforced_params of SingleLicense.")


 
  @VsoMethod  
  public List<String> getEnforcedParams() {
    return enforcedParams;
  }
    
  @VsoMethod
  public void setEnforcedParams(List<String> enforcedParams) {
    this.enforcedParams = enforcedParams;
  }

  
  /**
   * last_update of SingleLicense.
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "last_update of SingleLicense.")


 
  @VsoMethod  
  public String getLastUpdate() {
    return lastUpdate;
  }
    
  @VsoMethod
  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  
  /**
   * license_id of SingleLicense.
   * @return licenseId
  **/
  @ApiModelProperty(value = "license_id of SingleLicense.")


 
  @VsoMethod  
  public String getLicenseId() {
    return licenseId;
  }
    
  @VsoMethod
  public void setLicenseId(String licenseId) {
    this.licenseId = licenseId;
  }

  
  /**
   * license_name of SingleLicense.
   * @return licenseName
  **/
  @ApiModelProperty(required = true, value = "license_name of SingleLicense.")
  @NotNull


 
  @VsoMethod  
  public String getLicenseName() {
    return licenseName;
  }
    
  @VsoMethod
  public void setLicenseName(String licenseName) {
    this.licenseName = licenseName;
  }

  
  /**
   * license_string of SingleLicense.
   * @return licenseString
  **/
  @ApiModelProperty(value = "license_string of SingleLicense.")


 
  @VsoMethod  
  public String getLicenseString() {
    return licenseString;
  }
    
  @VsoMethod
  public void setLicenseString(String licenseString) {
    this.licenseString = licenseString;
  }

  
  public SingleLicense addLicenseTierItem(String licenseTierItem) {
    if (this.licenseTier == null) {
      this.licenseTier = new ArrayList<String>();
    }
    this.licenseTier.add(licenseTierItem);
    return this;
  }
  
  /**
   * license_tier of SingleLicense.
   * @return licenseTier
  **/
  @ApiModelProperty(value = "license_tier of SingleLicense.")


 
  @VsoMethod  
  public List<String> getLicenseTier() {
    return licenseTier;
  }
    
  @VsoMethod
  public void setLicenseTier(List<String> licenseTier) {
    this.licenseTier = licenseTier;
  }

  
  /**
   * license_type of SingleLicense.
   * @return licenseType
  **/
  @ApiModelProperty(value = "license_type of SingleLicense.")


 
  @VsoMethod  
  public String getLicenseType() {
    return licenseType;
  }
    
  @VsoMethod
  public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
  }

  
  /**
   * Number of Service Engines hosts in container clouds.
   * @return maxSes
  **/
  @ApiModelProperty(value = "Number of Service Engines hosts in container clouds.")


 
  @VsoMethod  
  public Integer getMaxSes() {
    return maxSes;
  }
    
  @VsoMethod
  public void setMaxSes(Integer maxSes) {
    this.maxSes = maxSes;
  }

  
  public SingleLicense addSeBandwidthLimitsItem(SEBandwidthLimit seBandwidthLimitsItem) {
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
   * Serial key (Hyphen separated 25 char wide alphanumeric key Ex  AA123-23BAS-383AS-383UD-FHSFG). Field introduced in 20.1.1.
   * @return serialKey
  **/
  @ApiModelProperty(value = "Serial key (Hyphen separated 25 char wide alphanumeric key Ex  AA123-23BAS-383AS-383UD-FHSFG). Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getSerialKey() {
    return serialKey;
  }
    
  @VsoMethod
  public void setSerialKey(String serialKey) {
    this.serialKey = serialKey;
  }

  
  /**
   * Number of physical cpu sockets across Service Engines in no access and linux server clouds.
   * @return sockets
  **/
  @ApiModelProperty(value = "Number of physical cpu sockets across Service Engines in no access and linux server clouds.")


 
  @VsoMethod  
  public Integer getSockets() {
    return sockets;
  }
    
  @VsoMethod
  public void setSockets(Integer sockets) {
    this.sockets = sockets;
  }

  
  /**
   * start_on of SingleLicense.
   * @return startOn
  **/
  @ApiModelProperty(value = "start_on of SingleLicense.")


 
  @VsoMethod  
  public String getStartOn() {
    return startOn;
  }
    
  @VsoMethod
  public void setStartOn(String startOn) {
    this.startOn = startOn;
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

  
  /**
   * valid_until of SingleLicense.
   * @return validUntil
  **/
  @ApiModelProperty(required = true, value = "valid_until of SingleLicense.")
  @NotNull


 
  @VsoMethod  
  public String getValidUntil() {
    return validUntil;
  }
    
  @VsoMethod
  public void setValidUntil(String validUntil) {
    this.validUntil = validUntil;
  }

  
  /**
   * version of SingleLicense.
   * @return version
  **/
  @ApiModelProperty(value = "version of SingleLicense.")


 
  @VsoMethod  
  public String getVersion() {
    return version;
  }
    
  @VsoMethod
  public void setVersion(String version) {
    this.version = version;
  }

  
  public String getObjectID() {
		return "SingleLicense";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleLicense singleLicense = (SingleLicense) o;
    return Objects.equals(this.burstCores, singleLicense.burstCores) &&
        Objects.equals(this.cores, singleLicense.cores) &&
        Objects.equals(this.createdOn, singleLicense.createdOn) &&
        Objects.equals(this.customerName, singleLicense.customerName) &&
        Objects.equals(this.enforcedParams, singleLicense.enforcedParams) &&
        Objects.equals(this.lastUpdate, singleLicense.lastUpdate) &&
        Objects.equals(this.licenseId, singleLicense.licenseId) &&
        Objects.equals(this.licenseName, singleLicense.licenseName) &&
        Objects.equals(this.licenseString, singleLicense.licenseString) &&
        Objects.equals(this.licenseTier, singleLicense.licenseTier) &&
        Objects.equals(this.licenseType, singleLicense.licenseType) &&
        Objects.equals(this.maxSes, singleLicense.maxSes) &&
        Objects.equals(this.seBandwidthLimits, singleLicense.seBandwidthLimits) &&
        Objects.equals(this.serialKey, singleLicense.serialKey) &&
        Objects.equals(this.sockets, singleLicense.sockets) &&
        Objects.equals(this.startOn, singleLicense.startOn) &&
        Objects.equals(this.tierType, singleLicense.tierType) &&
        Objects.equals(this.validUntil, singleLicense.validUntil) &&
        Objects.equals(this.version, singleLicense.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(burstCores, cores, createdOn, customerName, enforcedParams, lastUpdate, licenseId, licenseName, licenseString, licenseTier, licenseType, maxSes, seBandwidthLimits, serialKey, sockets, startOn, tierType, validUntil, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleLicense {\n");
    
    sb.append("    burstCores: ").append(toIndentedString(burstCores)).append("\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    enforcedParams: ").append(toIndentedString(enforcedParams)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    licenseName: ").append(toIndentedString(licenseName)).append("\n");
    sb.append("    licenseString: ").append(toIndentedString(licenseString)).append("\n");
    sb.append("    licenseTier: ").append(toIndentedString(licenseTier)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    maxSes: ").append(toIndentedString(maxSes)).append("\n");
    sb.append("    seBandwidthLimits: ").append(toIndentedString(seBandwidthLimits)).append("\n");
    sb.append("    serialKey: ").append(toIndentedString(serialKey)).append("\n");
    sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    tierType: ").append(toIndentedString(tierType)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

