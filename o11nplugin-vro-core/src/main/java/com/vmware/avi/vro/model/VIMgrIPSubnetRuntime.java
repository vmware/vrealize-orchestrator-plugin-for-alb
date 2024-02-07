package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The VIMgrIPSubnetRuntime is a POJO class extends AviRestResource that used for creating
 * VIMgrIPSubnetRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VIMgrIPSubnetRuntime")
@VsoFinder(name = Constants.FINDER_VRO_VIMGRIPSUBNETRUNTIME)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VIMgrIPSubnetRuntime extends AviRestResource {
    @JsonProperty("fip_available")
    @JsonInclude(Include.NON_NULL)
    private Boolean fipAvailable = false;

    @JsonProperty("fip_subnet_uuids")
    @JsonInclude(Include.NON_NULL)
    private List<String> fipSubnetUuids;

    @JsonProperty("floatingip_subnets")
    @JsonInclude(Include.NON_NULL)
    private List<FloatingIpSubnet> floatingipSubnets;

    @JsonProperty("ip_subnet")
    @JsonInclude(Include.NON_NULL)
    private String ipSubnet;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("prefix")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix prefix;

    @JsonProperty("primary")
    @JsonInclude(Include.NON_NULL)
    private Boolean primary = false;

    @JsonProperty("ref_count")
    @JsonInclude(Include.NON_NULL)
    private Integer refCount;

    @JsonProperty("se_ref_count")
    @JsonInclude(Include.NON_NULL)
    private Integer seRefCount = 0;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * If true, capable of floating/elastic ip association.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return fipAvailable
   */
  @VsoMethod
  public Boolean getFipAvailable() {
    return fipAvailable;
  }

  /**
   * This is the setter method to the attribute.
   * If true, capable of floating/elastic ip association.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param fipAvailable set the fipAvailable.
   */
  @VsoMethod
  public void setFipAvailable(Boolean  fipAvailable) {
    this.fipAvailable = fipAvailable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * If fip_available is true, this is list of supported fip subnets, possibly empty if cloud does not support such a network list.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fipSubnetUuids
   */
  @VsoMethod
  public List<String> getFipSubnetUuids() {
    return fipSubnetUuids;
  }

  /**
   * This is the setter method. this will set the fipSubnetUuids
   * If fip_available is true, this is list of supported fip subnets, possibly empty if cloud does not support such a network list.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fipSubnetUuids
   */
  @VsoMethod
  public void setFipSubnetUuids(List<String>  fipSubnetUuids) {
    this.fipSubnetUuids = fipSubnetUuids;
  }

  /**
   * This is the setter method this will set the fipSubnetUuids
   * If fip_available is true, this is list of supported fip subnets, possibly empty if cloud does not support such a network list.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fipSubnetUuids
   */
  @VsoMethod
  public VIMgrIPSubnetRuntime addFipSubnetUuidsItem(String fipSubnetUuidsItem) {
    if (this.fipSubnetUuids == null) {
      this.fipSubnetUuids = new ArrayList<String>();
    }
    this.fipSubnetUuids.add(fipSubnetUuidsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * If fip_available is true, the list of associated floatingip subnets, possibly empty if unsupported or implictly defined by the cloud.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingipSubnets
   */
  @VsoMethod
  public List<FloatingIpSubnet> getFloatingipSubnets() {
    return floatingipSubnets;
  }

  /**
   * This is the setter method. this will set the floatingipSubnets
   * If fip_available is true, the list of associated floatingip subnets, possibly empty if unsupported or implictly defined by the cloud.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingipSubnets
   */
  @VsoMethod
  public void setFloatingipSubnets(List<FloatingIpSubnet>  floatingipSubnets) {
    this.floatingipSubnets = floatingipSubnets;
  }

  /**
   * This is the setter method this will set the floatingipSubnets
   * If fip_available is true, the list of associated floatingip subnets, possibly empty if unsupported or implictly defined by the cloud.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return floatingipSubnets
   */
  @VsoMethod
  public VIMgrIPSubnetRuntime addFloatingipSubnetsItem(FloatingIpSubnet floatingipSubnetsItem) {
    if (this.floatingipSubnets == null) {
      this.floatingipSubnets = new ArrayList<FloatingIpSubnet>();
    }
    this.floatingipSubnets.add(floatingipSubnetsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ipSubnet
   */
  @VsoMethod
  public String getIpSubnet() {
    return ipSubnet;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ipSubnet set the ipSubnet.
   */
  @VsoMethod
  public void setIpSubnet(String  ipSubnet) {
    this.ipSubnet = ipSubnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prefix
   */
  @VsoMethod
  public IpAddrPrefix getPrefix() {
    return prefix;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param prefix set the prefix.
   */
  @VsoMethod
  public void setPrefix(IpAddrPrefix prefix) {
    this.prefix = prefix;
  }

  /**
   * This is the getter method this will return the attribute value.
   * True if prefix is primary ip on interface, else false.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return primary
   */
  @VsoMethod
  public Boolean getPrimary() {
    return primary;
  }

  /**
   * This is the setter method to the attribute.
   * True if prefix is primary ip on interface, else false.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param primary set the primary.
   */
  @VsoMethod
  public void setPrimary(Boolean  primary) {
    this.primary = primary;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return refCount
   */
  @VsoMethod
  public Integer getRefCount() {
    return refCount;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param refCount set the refCount.
   */
  @VsoMethod
  public void setRefCount(Integer  refCount) {
    this.refCount = refCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return seRefCount
   */
  @VsoMethod
  public Integer getSeRefCount() {
    return seRefCount;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param seRefCount set the seRefCount.
   */
  @VsoMethod
  public void setSeRefCount(Integer  seRefCount) {
    this.seRefCount = seRefCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VIMgrIPSubnetRuntime objVIMgrIPSubnetRuntime = (VIMgrIPSubnetRuntime) o;
  return   Objects.equals(this.prefix, objVIMgrIPSubnetRuntime.prefix)&&
  Objects.equals(this.refCount, objVIMgrIPSubnetRuntime.refCount)&&
  Objects.equals(this.ipSubnet, objVIMgrIPSubnetRuntime.ipSubnet)&&
  Objects.equals(this.seRefCount, objVIMgrIPSubnetRuntime.seRefCount)&&
  Objects.equals(this.name, objVIMgrIPSubnetRuntime.name)&&
  Objects.equals(this.uuid, objVIMgrIPSubnetRuntime.uuid)&&
  Objects.equals(this.fipAvailable, objVIMgrIPSubnetRuntime.fipAvailable)&&
  Objects.equals(this.fipSubnetUuids, objVIMgrIPSubnetRuntime.fipSubnetUuids)&&
  Objects.equals(this.primary, objVIMgrIPSubnetRuntime.primary)&&
  Objects.equals(this.floatingipSubnets, objVIMgrIPSubnetRuntime.floatingipSubnets);
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

