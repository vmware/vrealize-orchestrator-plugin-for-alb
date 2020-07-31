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
 * The LicenseExpiryDetails is a POJO class extends AviRestResource that used for creating
 * LicenseExpiryDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LicenseExpiryDetails")
@VsoFinder(name = Constants.FINDER_VRO_LICENSEEXPIRYDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LicenseExpiryDetails extends AviRestResource {
  @JsonProperty("backend_servers")
  @JsonInclude(Include.NON_NULL)
  private Integer backendServers = null;

  @JsonProperty("burst_cores")
  @JsonInclude(Include.NON_NULL)
  private Integer burstCores = null;

  @JsonProperty("cores")
  @JsonInclude(Include.NON_NULL)
  private Integer cores = null;

  @JsonProperty("cpu_cores")
  @JsonInclude(Include.NON_NULL)
  private Float cpuCores = null;

  @JsonProperty("expiry_at")
  @JsonInclude(Include.NON_NULL)
  private String expiryAt = null;

  @JsonProperty("license_id")
  @JsonInclude(Include.NON_NULL)
  private String licenseId = null;

  @JsonProperty("license_tier")
  @JsonInclude(Include.NON_NULL)
  private List<String> licenseTier = null;

  @JsonProperty("license_type")
  @JsonInclude(Include.NON_NULL)
  private String licenseType = null;

  @JsonProperty("max_apps")
  @JsonInclude(Include.NON_NULL)
  private Integer maxApps = null;

  @JsonProperty("max_ses")
  @JsonInclude(Include.NON_NULL)
  private Integer maxSes = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("service_cores")
  @JsonInclude(Include.NON_NULL)
  private Float serviceCores = null;

  @JsonProperty("sockets")
  @JsonInclude(Include.NON_NULL)
  private Integer sockets = null;

  @JsonProperty("throughput")
  @JsonInclude(Include.NON_NULL)
  private Integer throughput = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property backend_servers of obj type licenseexpirydetails field type str  type integer.
   * @return backendServers
   */
  @VsoMethod
  public Integer getBackendServers() {
    return backendServers;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property backend_servers of obj type licenseexpirydetails field type str  type integer.
   * @param backendServers set the backendServers.
   */
  @VsoMethod
  public void setBackendServers(Integer  backendServers) {
    this.backendServers = backendServers;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property burst_cores of obj type licenseexpirydetails field type str  type integer.
   * @return burstCores
   */
  @VsoMethod
  public Integer getBurstCores() {
    return burstCores;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property burst_cores of obj type licenseexpirydetails field type str  type integer.
   * @param burstCores set the burstCores.
   */
  @VsoMethod
  public void setBurstCores(Integer  burstCores) {
    this.burstCores = burstCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cores of obj type licenseexpirydetails field type str  type integer.
   * @return cores
   */
  @VsoMethod
  public Integer getCores() {
    return cores;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cores of obj type licenseexpirydetails field type str  type integer.
   * @param cores set the cores.
   */
  @VsoMethod
  public void setCores(Integer  cores) {
    this.cores = cores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cpu_cores of obj type licenseexpirydetails field type str  type float.
   * @return cpuCores
   */
  @VsoMethod
  public Float getCpuCores() {
    return cpuCores;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cpu_cores of obj type licenseexpirydetails field type str  type float.
   * @param cpuCores set the cpuCores.
   */
  @VsoMethod
  public void setCpuCores(Float  cpuCores) {
    this.cpuCores = cpuCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property expiry_at of obj type licenseexpirydetails field type str  type string.
   * @return expiryAt
   */
  @VsoMethod
  public String getExpiryAt() {
    return expiryAt;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property expiry_at of obj type licenseexpirydetails field type str  type string.
   * @param expiryAt set the expiryAt.
   */
  @VsoMethod
  public void setExpiryAt(String  expiryAt) {
    this.expiryAt = expiryAt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property license_id of obj type licenseexpirydetails field type str  type string.
   * @return licenseId
   */
  @VsoMethod
  public String getLicenseId() {
    return licenseId;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property license_id of obj type licenseexpirydetails field type str  type string.
   * @param licenseId set the licenseId.
   */
  @VsoMethod
  public void setLicenseId(String  licenseId) {
    this.licenseId = licenseId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property license_tier of obj type licenseexpirydetails field type str  type array.
   * @return licenseTier
   */
  @VsoMethod
  public List<String> getLicenseTier() {
    return licenseTier;
  }

  /**
   * This is the setter method. this will set the licenseTier
   * Placeholder for description of property license_tier of obj type licenseexpirydetails field type str  type array.
   * @return licenseTier
   */
  @VsoMethod
  public void setLicenseTier(List<String>  licenseTier) {
    this.licenseTier = licenseTier;
  }

  /**
   * This is the setter method this will set the licenseTier
   * Placeholder for description of property license_tier of obj type licenseexpirydetails field type str  type array.
   * @return licenseTier
   */
  @VsoMethod
  public LicenseExpiryDetails addLicenseTierItem(String licenseTierItem) {
    if (this.licenseTier == null) {
      this.licenseTier = new ArrayList<String>();
    }
    this.licenseTier.add(licenseTierItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property license_type of obj type licenseexpirydetails field type str  type string.
   * @return licenseType
   */
  @VsoMethod
  public String getLicenseType() {
    return licenseType;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property license_type of obj type licenseexpirydetails field type str  type string.
   * @param licenseType set the licenseType.
   */
  @VsoMethod
  public void setLicenseType(String  licenseType) {
    this.licenseType = licenseType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property max_apps of obj type licenseexpirydetails field type str  type integer.
   * @return maxApps
   */
  @VsoMethod
  public Integer getMaxApps() {
    return maxApps;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property max_apps of obj type licenseexpirydetails field type str  type integer.
   * @param maxApps set the maxApps.
   */
  @VsoMethod
  public void setMaxApps(Integer  maxApps) {
    this.maxApps = maxApps;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property max_ses of obj type licenseexpirydetails field type str  type integer.
   * @return maxSes
   */
  @VsoMethod
  public Integer getMaxSes() {
    return maxSes;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property max_ses of obj type licenseexpirydetails field type str  type integer.
   * @param maxSes set the maxSes.
   */
  @VsoMethod
  public void setMaxSes(Integer  maxSes) {
    this.maxSes = maxSes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property service_cores of obj type licenseexpirydetails field type str  type float.
   * @return serviceCores
   */
  @VsoMethod
  public Float getServiceCores() {
    return serviceCores;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property service_cores of obj type licenseexpirydetails field type str  type float.
   * @param serviceCores set the serviceCores.
   */
  @VsoMethod
  public void setServiceCores(Float  serviceCores) {
    this.serviceCores = serviceCores;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property sockets of obj type licenseexpirydetails field type str  type integer.
   * @return sockets
   */
  @VsoMethod
  public Integer getSockets() {
    return sockets;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property sockets of obj type licenseexpirydetails field type str  type integer.
   * @param sockets set the sockets.
   */
  @VsoMethod
  public void setSockets(Integer  sockets) {
    this.sockets = sockets;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property throughput of obj type licenseexpirydetails field type str  type integer.
   * @return throughput
   */
  @VsoMethod
  public Integer getThroughput() {
    return throughput;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property throughput of obj type licenseexpirydetails field type str  type integer.
   * @param throughput set the throughput.
   */
  @VsoMethod
  public void setThroughput(Integer  throughput) {
    this.throughput = throughput;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LicenseExpiryDetails objLicenseExpiryDetails = (LicenseExpiryDetails) o;
  return   Objects.equals(this.name, objLicenseExpiryDetails.name)&&
  Objects.equals(this.expiryAt, objLicenseExpiryDetails.expiryAt)&&
  Objects.equals(this.throughput, objLicenseExpiryDetails.throughput)&&
  Objects.equals(this.cores, objLicenseExpiryDetails.cores)&&
  Objects.equals(this.maxSes, objLicenseExpiryDetails.maxSes)&&
  Objects.equals(this.backendServers, objLicenseExpiryDetails.backendServers)&&
  Objects.equals(this.maxApps, objLicenseExpiryDetails.maxApps)&&
  Objects.equals(this.licenseTier, objLicenseExpiryDetails.licenseTier)&&
  Objects.equals(this.licenseId, objLicenseExpiryDetails.licenseId)&&
  Objects.equals(this.licenseType, objLicenseExpiryDetails.licenseType)&&
  Objects.equals(this.sockets, objLicenseExpiryDetails.sockets)&&
  Objects.equals(this.burstCores, objLicenseExpiryDetails.burstCores)&&
  Objects.equals(this.serviceCores, objLicenseExpiryDetails.serviceCores)&&
  Objects.equals(this.cpuCores, objLicenseExpiryDetails.cpuCores);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LicenseExpiryDetails {\n");
      sb.append("    backendServers: ").append(toIndentedString(backendServers)).append("\n");
        sb.append("    burstCores: ").append(toIndentedString(burstCores)).append("\n");
        sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
        sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
        sb.append("    expiryAt: ").append(toIndentedString(expiryAt)).append("\n");
        sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
        sb.append("    licenseTier: ").append(toIndentedString(licenseTier)).append("\n");
        sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
        sb.append("    maxApps: ").append(toIndentedString(maxApps)).append("\n");
        sb.append("    maxSes: ").append(toIndentedString(maxSes)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serviceCores: ").append(toIndentedString(serviceCores)).append("\n");
        sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
        sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
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

