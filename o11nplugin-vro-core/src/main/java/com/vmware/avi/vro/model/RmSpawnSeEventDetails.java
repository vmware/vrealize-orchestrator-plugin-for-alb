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
 * The RmSpawnSeEventDetails is a POJO class extends AviRestResource that used for creating
 * RmSpawnSeEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RmSpawnSeEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_RMSPAWNSEEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RmSpawnSeEventDetails extends AviRestResource {
    @JsonProperty("availability_zone")
    @JsonInclude(Include.NON_NULL)
    private String availabilityZone = null;

    @JsonProperty("cloud_name")
    @JsonInclude(Include.NON_NULL)
    private String cloudName = null;

    @JsonProperty("cloud_uuid")
    @JsonInclude(Include.NON_NULL)
    private String cloudUuid = null;

    @JsonProperty("flavor_name")
    @JsonInclude(Include.NON_NULL)
    private String flavorName = null;

    @JsonProperty("host_name")
    @JsonInclude(Include.NON_NULL)
    private String hostName = null;

    @JsonProperty("host_uuid")
    @JsonInclude(Include.NON_NULL)
    private String hostUuid = null;

    @JsonProperty("memory")
    @JsonInclude(Include.NON_NULL)
    private Integer memory = null;

    @JsonProperty("network_names")
    @JsonInclude(Include.NON_NULL)
    private List<String> networkNames = null;

    @JsonProperty("networks")
    @JsonInclude(Include.NON_NULL)
    private List<String> networks = null;

    @JsonProperty("reason")
    @JsonInclude(Include.NON_NULL)
    private String reason = null;

    @JsonProperty("se_cookie")
    @JsonInclude(Include.NON_NULL)
    private String seCookie = null;

    @JsonProperty("se_grp_name")
    @JsonInclude(Include.NON_NULL)
    private String seGrpName = null;

    @JsonProperty("se_grp_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seGrpUuid = null;

    @JsonProperty("se_name")
    @JsonInclude(Include.NON_NULL)
    private String seName = null;

    @JsonProperty("se_uuid")
    @JsonInclude(Include.NON_NULL)
    private String seUuid = null;

    @JsonProperty("status_code")
    @JsonInclude(Include.NON_NULL)
    private Integer statusCode = null;

    @JsonProperty("vcpus")
    @JsonInclude(Include.NON_NULL)
    private Integer vcpus = null;

    @JsonProperty("vs_name")
    @JsonInclude(Include.NON_NULL)
    private String vsName = null;

    @JsonProperty("vs_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vsUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property availability_zone of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return availabilityZone
   */
  @VsoMethod
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property availability_zone of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param availabilityZone set the availabilityZone.
   */
  @VsoMethod
  public void setAvailabilityZone(String  availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cloud_name of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudName
   */
  @VsoMethod
  public String getCloudName() {
    return cloudName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property cloud_name of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudName set the cloudName.
   */
  @VsoMethod
  public void setCloudName(String  cloudName) {
    this.cloudName = cloudName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of cloud.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudUuid
   */
  @VsoMethod
  public String getCloudUuid() {
    return cloudUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of cloud.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudUuid set the cloudUuid.
   */
  @VsoMethod
  public void setCloudUuid(String  cloudUuid) {
    this.cloudUuid = cloudUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 20.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return flavorName
   */
  @VsoMethod
  public String getFlavorName() {
    return flavorName;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 20.1.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param flavorName set the flavorName.
   */
  @VsoMethod
  public void setFlavorName(String  flavorName) {
    this.flavorName = flavorName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property host_name of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostName
   */
  @VsoMethod
  public String getHostName() {
    return hostName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property host_name of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostName set the hostName.
   */
  @VsoMethod
  public void setHostName(String  hostName) {
    this.hostName = hostName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of host.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostUuid
   */
  @VsoMethod
  public String getHostUuid() {
    return hostUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of host.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostUuid set the hostUuid.
   */
  @VsoMethod
  public void setHostUuid(String  hostUuid) {
    this.hostUuid = hostUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property memory of obj type rmspawnseeventdetails field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return memory
   */
  @VsoMethod
  public Integer getMemory() {
    return memory;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property memory of obj type rmspawnseeventdetails field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param memory set the memory.
   */
  @VsoMethod
  public void setMemory(Integer  memory) {
    this.memory = memory;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property network_names of obj type rmspawnseeventdetails field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkNames
   */
  @VsoMethod
  public List<String> getNetworkNames() {
    return networkNames;
  }

  /**
   * This is the setter method. this will set the networkNames
   * Placeholder for description of property network_names of obj type rmspawnseeventdetails field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkNames
   */
  @VsoMethod
  public void setNetworkNames(List<String>  networkNames) {
    this.networkNames = networkNames;
  }

  /**
   * This is the setter method this will set the networkNames
   * Placeholder for description of property network_names of obj type rmspawnseeventdetails field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkNames
   */
  @VsoMethod
  public RmSpawnSeEventDetails addNetworkNamesItem(String networkNamesItem) {
    if (this.networkNames == null) {
      this.networkNames = new ArrayList<String>();
    }
    this.networkNames.add(networkNamesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property networks of obj type rmspawnseeventdetails field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networks
   */
  @VsoMethod
  public List<String> getNetworks() {
    return networks;
  }

  /**
   * This is the setter method. this will set the networks
   * Placeholder for description of property networks of obj type rmspawnseeventdetails field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networks
   */
  @VsoMethod
  public void setNetworks(List<String>  networks) {
    this.networks = networks;
  }

  /**
   * This is the setter method this will set the networks
   * Placeholder for description of property networks of obj type rmspawnseeventdetails field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networks
   */
  @VsoMethod
  public RmSpawnSeEventDetails addNetworksItem(String networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<String>();
    }
    this.networks.add(networksItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reason of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property reason of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_cookie of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seCookie
   */
  @VsoMethod
  public String getSeCookie() {
    return seCookie;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_cookie of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seCookie set the seCookie.
   */
  @VsoMethod
  public void setSeCookie(String  seCookie) {
    this.seCookie = seCookie;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_grp_name of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGrpName
   */
  @VsoMethod
  public String getSeGrpName() {
    return seGrpName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_grp_name of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGrpName set the seGrpName.
   */
  @VsoMethod
  public void setSeGrpName(String  seGrpName) {
    this.seGrpName = seGrpName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se_grp.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seGrpUuid
   */
  @VsoMethod
  public String getSeGrpUuid() {
    return seGrpUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of se_grp.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seGrpUuid set the seGrpUuid.
   */
  @VsoMethod
  public void setSeGrpUuid(String  seGrpUuid) {
    this.seGrpUuid = seGrpUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property se_name of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property se_name of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of se.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seUuid
   */
  @VsoMethod
  public String getSeUuid() {
    return seUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of se.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seUuid set the seUuid.
   */
  @VsoMethod
  public void setSeUuid(String  seUuid) {
    this.seUuid = seUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property status_code of obj type rmspawnseeventdetails field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return statusCode
   */
  @VsoMethod
  public Integer getStatusCode() {
    return statusCode;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property status_code of obj type rmspawnseeventdetails field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param statusCode set the statusCode.
   */
  @VsoMethod
  public void setStatusCode(Integer  statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vcpus of obj type rmspawnseeventdetails field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vcpus
   */
  @VsoMethod
  public Integer getVcpus() {
    return vcpus;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vcpus of obj type rmspawnseeventdetails field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vcpus set the vcpus.
   */
  @VsoMethod
  public void setVcpus(Integer  vcpus) {
    this.vcpus = vcpus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vs_name of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsName
   */
  @VsoMethod
  public String getVsName() {
    return vsName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vs_name of obj type rmspawnseeventdetails field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsName set the vsName.
   */
  @VsoMethod
  public void setVsName(String  vsName) {
    this.vsName = vsName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of vs.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of vs.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RmSpawnSeEventDetails objRmSpawnSeEventDetails = (RmSpawnSeEventDetails) o;
  return   Objects.equals(this.seName, objRmSpawnSeEventDetails.seName)&&
  Objects.equals(this.seCookie, objRmSpawnSeEventDetails.seCookie)&&
  Objects.equals(this.seUuid, objRmSpawnSeEventDetails.seUuid)&&
  Objects.equals(this.hostUuid, objRmSpawnSeEventDetails.hostUuid)&&
  Objects.equals(this.hostName, objRmSpawnSeEventDetails.hostName)&&
  Objects.equals(this.availabilityZone, objRmSpawnSeEventDetails.availabilityZone)&&
  Objects.equals(this.networks, objRmSpawnSeEventDetails.networks)&&
  Objects.equals(this.statusCode, objRmSpawnSeEventDetails.statusCode)&&
  Objects.equals(this.reason, objRmSpawnSeEventDetails.reason)&&
  Objects.equals(this.vsUuid, objRmSpawnSeEventDetails.vsUuid)&&
  Objects.equals(this.vsName, objRmSpawnSeEventDetails.vsName)&&
  Objects.equals(this.networkNames, objRmSpawnSeEventDetails.networkNames)&&
  Objects.equals(this.vcpus, objRmSpawnSeEventDetails.vcpus)&&
  Objects.equals(this.memory, objRmSpawnSeEventDetails.memory)&&
  Objects.equals(this.seGrpUuid, objRmSpawnSeEventDetails.seGrpUuid)&&
  Objects.equals(this.seGrpName, objRmSpawnSeEventDetails.seGrpName)&&
  Objects.equals(this.cloudUuid, objRmSpawnSeEventDetails.cloudUuid)&&
  Objects.equals(this.cloudName, objRmSpawnSeEventDetails.cloudName)&&
  Objects.equals(this.flavorName, objRmSpawnSeEventDetails.flavorName);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RmSpawnSeEventDetails {\n");
      sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    cloudName: ").append(toIndentedString(cloudName)).append("\n");
        sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
        sb.append("    flavorName: ").append(toIndentedString(flavorName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostUuid: ").append(toIndentedString(hostUuid)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    networkNames: ").append(toIndentedString(networkNames)).append("\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    seCookie: ").append(toIndentedString(seCookie)).append("\n");
        sb.append("    seGrpName: ").append(toIndentedString(seGrpName)).append("\n");
        sb.append("    seGrpUuid: ").append(toIndentedString(seGrpUuid)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

