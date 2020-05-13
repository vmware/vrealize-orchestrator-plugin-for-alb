package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.BurstResource;
import com.vmware.avi.vro.model.CumulativeLicense;
import com.vmware.avi.vro.model.SEBandwidthLimit;
import com.vmware.avi.vro.model.SingleLicense;
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
 * ControllerLicense
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ControllerLicense")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERLICENSE, idAccessor = "getObjectID()")
@Service
public class ControllerLicense extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("active_burst_resources")
  @Valid
  private List<BurstResource> activeBurstResources = null;

  @JsonProperty("burst_cores")
  private Integer burstCores = null;

  @JsonProperty("cores")
  private Integer cores = null;

  @JsonProperty("customer_name")
  private String customerName = null;

  @JsonProperty("disable_enforcement")
  private Boolean disableEnforcement = null;

  @JsonProperty("expired_burst_resources")
  @Valid
  private List<BurstResource> expiredBurstResources = null;

  @JsonProperty("license_id")
  private String licenseId = null;

  @JsonProperty("license_tier")
  @Valid
  private List<String> licenseTier = null;

  @JsonProperty("license_tiers")
  @Valid
  private List<CumulativeLicense> licenseTiers = null;

  @JsonProperty("licenses")
  @Valid
  private List<SingleLicense> licenses = null;

  @JsonProperty("max_ses")
  private Integer maxSes = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("se_bandwidth_limits")
  @Valid
  private List<SEBandwidthLimit> seBandwidthLimits = null;

  @JsonProperty("sockets")
  private Integer sockets = null;

  @JsonProperty("start_on")
  private String startOn = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("valid_until")
  private String validUntil = null;

  
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

  
  public ControllerLicense addActiveBurstResourcesItem(BurstResource activeBurstResourcesItem) {
    if (this.activeBurstResources == null) {
      this.activeBurstResources = new ArrayList<BurstResource>();
    }
    this.activeBurstResources.add(activeBurstResourcesItem);
    return this;
  }
  
  /**
   * List of active burst core license in use. Field introduced in 17.2.5.
   * @return activeBurstResources
  **/
  @ApiModelProperty(value = "List of active burst core license in use. Field introduced in 17.2.5.")

  @Valid

 
  @VsoMethod  
  public List<BurstResource> getActiveBurstResources() {
    return activeBurstResources;
  }
    
  @VsoMethod
  public void setActiveBurstResources(List<BurstResource> activeBurstResources) {
    this.activeBurstResources = activeBurstResources;
  }

  
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
   * customer_name of ControllerLicense.
   * @return customerName
  **/
  @ApiModelProperty(required = true, value = "customer_name of ControllerLicense.")
  @NotNull


 
  @VsoMethod  
  public String getCustomerName() {
    return customerName;
  }
    
  @VsoMethod
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  
  /**
   *  Field introduced in 17.2.5.
   * @return disableEnforcement
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.5.")


 
  @VsoMethod  
  public Boolean isDisableEnforcement() {
    return disableEnforcement;
  }
    
  @VsoMethod
  public void setDisableEnforcement(Boolean disableEnforcement) {
    this.disableEnforcement = disableEnforcement;
  }

  
  public ControllerLicense addExpiredBurstResourcesItem(BurstResource expiredBurstResourcesItem) {
    if (this.expiredBurstResources == null) {
      this.expiredBurstResources = new ArrayList<BurstResource>();
    }
    this.expiredBurstResources.add(expiredBurstResourcesItem);
    return this;
  }
  
  /**
   * List of used or expired burst core licenses. Field introduced in 17.2.5.
   * @return expiredBurstResources
  **/
  @ApiModelProperty(value = "List of used or expired burst core licenses. Field introduced in 17.2.5.")

  @Valid

 
  @VsoMethod  
  public List<BurstResource> getExpiredBurstResources() {
    return expiredBurstResources;
  }
    
  @VsoMethod
  public void setExpiredBurstResources(List<BurstResource> expiredBurstResources) {
    this.expiredBurstResources = expiredBurstResources;
  }

  
  /**
   *  Field introduced in 17.2.5.
   * @return licenseId
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.5.")


 
  @VsoMethod  
  public String getLicenseId() {
    return licenseId;
  }
    
  @VsoMethod
  public void setLicenseId(String licenseId) {
    this.licenseId = licenseId;
  }

  
  public ControllerLicense addLicenseTierItem(String licenseTierItem) {
    if (this.licenseTier == null) {
      this.licenseTier = new ArrayList<String>();
    }
    this.licenseTier.add(licenseTierItem);
    return this;
  }
  
  /**
   * license_tier of ControllerLicense.
   * @return licenseTier
  **/
  @ApiModelProperty(value = "license_tier of ControllerLicense.")


 
  @VsoMethod  
  public List<String> getLicenseTier() {
    return licenseTier;
  }
    
  @VsoMethod
  public void setLicenseTier(List<String> licenseTier) {
    this.licenseTier = licenseTier;
  }

  
  public ControllerLicense addLicenseTiersItem(CumulativeLicense licenseTiersItem) {
    if (this.licenseTiers == null) {
      this.licenseTiers = new ArrayList<CumulativeLicense>();
    }
    this.licenseTiers.add(licenseTiersItem);
    return this;
  }
  
  /**
   *  Field introduced in 17.2.5.
   * @return licenseTiers
  **/
  @ApiModelProperty(value = " Field introduced in 17.2.5.")

  @Valid

 
  @VsoMethod  
  public List<CumulativeLicense> getLicenseTiers() {
    return licenseTiers;
  }
    
  @VsoMethod
  public void setLicenseTiers(List<CumulativeLicense> licenseTiers) {
    this.licenseTiers = licenseTiers;
  }

  
  public ControllerLicense addLicensesItem(SingleLicense licensesItem) {
    if (this.licenses == null) {
      this.licenses = new ArrayList<SingleLicense>();
    }
    this.licenses.add(licensesItem);
    return this;
  }
  
  /**
   * Placeholder for description of property licenses of obj type ControllerLicense field type str  type object
   * @return licenses
  **/
  @ApiModelProperty(value = "Placeholder for description of property licenses of obj type ControllerLicense field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<SingleLicense> getLicenses() {
    return licenses;
  }
    
  @VsoMethod
  public void setLicenses(List<SingleLicense> licenses) {
    this.licenses = licenses;
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

  
  public ControllerLicense addSeBandwidthLimitsItem(SEBandwidthLimit seBandwidthLimitsItem) {
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
   * start_on of ControllerLicense.
   * @return startOn
  **/
  @ApiModelProperty(value = "start_on of ControllerLicense.")


 
  @VsoMethod  
  public String getStartOn() {
    return startOn;
  }
    
  @VsoMethod
  public void setStartOn(String startOn) {
    this.startOn = startOn;
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

  
  /**
   * valid_until of ControllerLicense.
   * @return validUntil
  **/
  @ApiModelProperty(required = true, value = "valid_until of ControllerLicense.")
  @NotNull


 
  @VsoMethod  
  public String getValidUntil() {
    return validUntil;
  }
    
  @VsoMethod
  public void setValidUntil(String validUntil) {
    this.validUntil = validUntil;
  }

  
  public String getObjectID() {
		return "ControllerLicense";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerLicense controllerLicense = (ControllerLicense) o;
    return Objects.equals(this.lastModified, controllerLicense.lastModified) &&
        Objects.equals(this.activeBurstResources, controllerLicense.activeBurstResources) &&
        Objects.equals(this.burstCores, controllerLicense.burstCores) &&
        Objects.equals(this.cores, controllerLicense.cores) &&
        Objects.equals(this.customerName, controllerLicense.customerName) &&
        Objects.equals(this.disableEnforcement, controllerLicense.disableEnforcement) &&
        Objects.equals(this.expiredBurstResources, controllerLicense.expiredBurstResources) &&
        Objects.equals(this.licenseId, controllerLicense.licenseId) &&
        Objects.equals(this.licenseTier, controllerLicense.licenseTier) &&
        Objects.equals(this.licenseTiers, controllerLicense.licenseTiers) &&
        Objects.equals(this.licenses, controllerLicense.licenses) &&
        Objects.equals(this.maxSes, controllerLicense.maxSes) &&
        Objects.equals(this.name, controllerLicense.name) &&
        Objects.equals(this.seBandwidthLimits, controllerLicense.seBandwidthLimits) &&
        Objects.equals(this.sockets, controllerLicense.sockets) &&
        Objects.equals(this.startOn, controllerLicense.startOn) &&
        Objects.equals(this.url, controllerLicense.url) &&
        Objects.equals(this.uuid, controllerLicense.uuid) &&
        Objects.equals(this.validUntil, controllerLicense.validUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, activeBurstResources, burstCores, cores, customerName, disableEnforcement, expiredBurstResources, licenseId, licenseTier, licenseTiers, licenses, maxSes, name, seBandwidthLimits, sockets, startOn, url, uuid, validUntil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerLicense {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    activeBurstResources: ").append(toIndentedString(activeBurstResources)).append("\n");
    sb.append("    burstCores: ").append(toIndentedString(burstCores)).append("\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    disableEnforcement: ").append(toIndentedString(disableEnforcement)).append("\n");
    sb.append("    expiredBurstResources: ").append(toIndentedString(expiredBurstResources)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    licenseTier: ").append(toIndentedString(licenseTier)).append("\n");
    sb.append("    licenseTiers: ").append(toIndentedString(licenseTiers)).append("\n");
    sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
    sb.append("    maxSes: ").append(toIndentedString(maxSes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seBandwidthLimits: ").append(toIndentedString(seBandwidthLimits)).append("\n");
    sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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

