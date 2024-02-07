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
 * The NsxtSegmentRuntime is a POJO class extends AviRestResource that used for creating
 * NsxtSegmentRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NsxtSegmentRuntime")
@VsoFinder(name = Constants.FINDER_VRO_NSXTSEGMENTRUNTIME, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NsxtSegmentRuntime extends AviRestResource {
    @JsonProperty("cloud_ref")
    @JsonInclude(Include.NON_NULL)
    private String cloudRef;

    @JsonProperty("dhcp6_ranges")
    @JsonInclude(Include.NON_NULL)
    private List<String> dhcp6Ranges;

    @JsonProperty("dhcp_enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean dhcpEnabled = true;

    @JsonProperty("dhcp_ranges")
    @JsonInclude(Include.NON_NULL)
    private List<String> dhcpRanges;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("nw_name")
    @JsonInclude(Include.NON_NULL)
    private String nwName;

    @JsonProperty("nw_ref")
    @JsonInclude(Include.NON_NULL)
    private String nwRef;

    @JsonProperty("opaque_network_id")
    @JsonInclude(Include.NON_NULL)
    private String opaqueNetworkId;

    @JsonProperty("origin_id")
    @JsonInclude(Include.NON_NULL)
    private String originId;

    @JsonProperty("security_only_nsxt")
    @JsonInclude(Include.NON_NULL)
    private Boolean securityOnlyNsxt = false;

    @JsonProperty("segment_gw")
    @JsonInclude(Include.NON_NULL)
    private String segmentGw;

    @JsonProperty("segment_gw6")
    @JsonInclude(Include.NON_NULL)
    private String segmentGw6;

    @JsonProperty("segment_id")
    @JsonInclude(Include.NON_NULL)
    private String segmentId;

    @JsonProperty("segname")
    @JsonInclude(Include.NON_NULL)
    private String segname;

    @JsonProperty("subnet")
    @JsonInclude(Include.NON_NULL)
    private String subnet;

    @JsonProperty("subnet6")
    @JsonInclude(Include.NON_NULL)
    private String subnet6;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("tier1_id")
    @JsonInclude(Include.NON_NULL)
    private String tier1Id;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("vlan_ids")
    @JsonInclude(Include.NON_NULL)
    private List<String> vlanIds;

    @JsonProperty("vrf_context_ref")
    @JsonInclude(Include.NON_NULL)
    private String vrfContextRef;



  /**
   * This is the getter method this will return the attribute value.
   * Nsxt segment belongs to cloud.
   * It is a reference to an object of type cloud.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * Nsxt segment belongs to cloud.
   * It is a reference to an object of type cloud.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudRef set the cloudRef.
   */
  @VsoMethod
  public void setCloudRef(String  cloudRef) {
    this.cloudRef = cloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * V6 dhcp ranges configured in nsxt.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dhcp6Ranges
   */
  @VsoMethod
  public List<String> getDhcp6Ranges() {
    return dhcp6Ranges;
  }

  /**
   * This is the setter method. this will set the dhcp6Ranges
   * V6 dhcp ranges configured in nsxt.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dhcp6Ranges
   */
  @VsoMethod
  public void setDhcp6Ranges(List<String>  dhcp6Ranges) {
    this.dhcp6Ranges = dhcp6Ranges;
  }

  /**
   * This is the setter method this will set the dhcp6Ranges
   * V6 dhcp ranges configured in nsxt.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dhcp6Ranges
   */
  @VsoMethod
  public NsxtSegmentRuntime addDhcp6RangesItem(String dhcp6RangesItem) {
    if (this.dhcp6Ranges == null) {
      this.dhcp6Ranges = new ArrayList<String>();
    }
    this.dhcp6Ranges.add(dhcp6RangesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Ip address management scheme for this segment associated network.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return dhcpEnabled
   */
  @VsoMethod
  public Boolean getDhcpEnabled() {
    return dhcpEnabled;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address management scheme for this segment associated network.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param dhcpEnabled set the dhcpEnabled.
   */
  @VsoMethod
  public void setDhcpEnabled(Boolean  dhcpEnabled) {
    this.dhcpEnabled = dhcpEnabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dhcp ranges configured in nsxt.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dhcpRanges
   */
  @VsoMethod
  public List<String> getDhcpRanges() {
    return dhcpRanges;
  }

  /**
   * This is the setter method. this will set the dhcpRanges
   * Dhcp ranges configured in nsxt.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dhcpRanges
   */
  @VsoMethod
  public void setDhcpRanges(List<String>  dhcpRanges) {
    this.dhcpRanges = dhcpRanges;
  }

  /**
   * This is the setter method this will set the dhcpRanges
   * Dhcp ranges configured in nsxt.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dhcpRanges
   */
  @VsoMethod
  public NsxtSegmentRuntime addDhcpRangesItem(String dhcpRangesItem) {
    if (this.dhcpRanges == null) {
      this.dhcpRanges = new ArrayList<String>();
    }
    this.dhcpRanges.add(dhcpRangesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Segment object name.
   * Field introduced in 20.1.1.
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
   * Segment object name.
   * Field introduced in 20.1.1.
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
   * Network name.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nwName
   */
  @VsoMethod
  public String getNwName() {
    return nwName;
  }

  /**
   * This is the setter method to the attribute.
   * Network name.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nwName set the nwName.
   */
  @VsoMethod
  public void setNwName(String  nwName) {
    this.nwName = nwName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Corresponding network object in avi.
   * It is a reference to an object of type network.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nwRef
   */
  @VsoMethod
  public String getNwRef() {
    return nwRef;
  }

  /**
   * This is the setter method to the attribute.
   * Corresponding network object in avi.
   * It is a reference to an object of type network.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nwRef set the nwRef.
   */
  @VsoMethod
  public void setNwRef(String  nwRef) {
    this.nwRef = nwRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Opaque network id.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return opaqueNetworkId
   */
  @VsoMethod
  public String getOpaqueNetworkId() {
    return opaqueNetworkId;
  }

  /**
   * This is the setter method to the attribute.
   * Opaque network id.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param opaqueNetworkId set the opaqueNetworkId.
   */
  @VsoMethod
  public void setOpaqueNetworkId(String  opaqueNetworkId) {
    this.opaqueNetworkId = opaqueNetworkId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Origin id applicable to security only cloud.
   * Field introduced in 22.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return originId
   */
  @VsoMethod
  public String getOriginId() {
    return originId;
  }

  /**
   * This is the setter method to the attribute.
   * Origin id applicable to security only cloud.
   * Field introduced in 22.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param originId set the originId.
   */
  @VsoMethod
  public void setOriginId(String  originId) {
    this.originId = originId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Nsxt segment belongs to security only cloud.
   * Field introduced in 22.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return securityOnlyNsxt
   */
  @VsoMethod
  public Boolean getSecurityOnlyNsxt() {
    return securityOnlyNsxt;
  }

  /**
   * This is the setter method to the attribute.
   * Nsxt segment belongs to security only cloud.
   * Field introduced in 22.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param securityOnlyNsxt set the securityOnlyNsxt.
   */
  @VsoMethod
  public void setSecurityOnlyNsxt(Boolean  securityOnlyNsxt) {
    this.securityOnlyNsxt = securityOnlyNsxt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Segment gateway.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return segmentGw
   */
  @VsoMethod
  public String getSegmentGw() {
    return segmentGw;
  }

  /**
   * This is the setter method to the attribute.
   * Segment gateway.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param segmentGw set the segmentGw.
   */
  @VsoMethod
  public void setSegmentGw(String  segmentGw) {
    this.segmentGw = segmentGw;
  }

  /**
   * This is the getter method this will return the attribute value.
   * V6 segment gateway.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return segmentGw6
   */
  @VsoMethod
  public String getSegmentGw6() {
    return segmentGw6;
  }

  /**
   * This is the setter method to the attribute.
   * V6 segment gateway.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param segmentGw6 set the segmentGw6.
   */
  @VsoMethod
  public void setSegmentGw6(String  segmentGw6) {
    this.segmentGw6 = segmentGw6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Segment id.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return segmentId
   */
  @VsoMethod
  public String getSegmentId() {
    return segmentId;
  }

  /**
   * This is the setter method to the attribute.
   * Segment id.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param segmentId set the segmentId.
   */
  @VsoMethod
  public void setSegmentId(String  segmentId) {
    this.segmentId = segmentId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Segment name.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return segname
   */
  @VsoMethod
  public String getSegname() {
    return segname;
  }

  /**
   * This is the setter method to the attribute.
   * Segment name.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param segname set the segname.
   */
  @VsoMethod
  public void setSegname(String  segname) {
    this.segname = segname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Segment cidr.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnet
   */
  @VsoMethod
  public String getSubnet() {
    return subnet;
  }

  /**
   * This is the setter method to the attribute.
   * Segment cidr.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subnet set the subnet.
   */
  @VsoMethod
  public void setSubnet(String  subnet) {
    this.subnet = subnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * V6 segment cidr.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnet6
   */
  @VsoMethod
  public String getSubnet6() {
    return subnet6;
  }

  /**
   * This is the setter method to the attribute.
   * V6 segment cidr.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subnet6 set the subnet6.
   */
  @VsoMethod
  public void setSubnet6(String  subnet6) {
    this.subnet6 = subnet6;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Nsxt segment belongs to tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Nsxt segment belongs to tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tier1 router id.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tier1Id
   */
  @VsoMethod
  public String getTier1Id() {
    return tier1Id;
  }

  /**
   * This is the setter method to the attribute.
   * Tier1 router id.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tier1Id set the tier1Id.
   */
  @VsoMethod
  public void setTier1Id(String  tier1Id) {
    this.tier1Id = tier1Id;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid.
   * Field introduced in 20.1.1.
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
   * Uuid.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Segment vlan ids.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vlanIds
   */
  @VsoMethod
  public List<String> getVlanIds() {
    return vlanIds;
  }

  /**
   * This is the setter method. this will set the vlanIds
   * Segment vlan ids.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vlanIds
   */
  @VsoMethod
  public void setVlanIds(List<String>  vlanIds) {
    this.vlanIds = vlanIds;
  }

  /**
   * This is the setter method this will set the vlanIds
   * Segment vlan ids.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vlanIds
   */
  @VsoMethod
  public NsxtSegmentRuntime addVlanIdsItem(String vlanIdsItem) {
    if (this.vlanIds == null) {
      this.vlanIds = new ArrayList<String>();
    }
    this.vlanIds.add(vlanIdsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Corresponding vrf context object in avi.
   * It is a reference to an object of type vrfcontext.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vrfContextRef
   */
  @VsoMethod
  public String getVrfContextRef() {
    return vrfContextRef;
  }

  /**
   * This is the setter method to the attribute.
   * Corresponding vrf context object in avi.
   * It is a reference to an object of type vrfcontext.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vrfContextRef set the vrfContextRef.
   */
  @VsoMethod
  public void setVrfContextRef(String  vrfContextRef) {
    this.vrfContextRef = vrfContextRef;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NsxtSegmentRuntime objNsxtSegmentRuntime = (NsxtSegmentRuntime) o;
  return   Objects.equals(this.uuid, objNsxtSegmentRuntime.uuid)&&
  Objects.equals(this.segmentId, objNsxtSegmentRuntime.segmentId)&&
  Objects.equals(this.name, objNsxtSegmentRuntime.name)&&
  Objects.equals(this.subnet, objNsxtSegmentRuntime.subnet)&&
  Objects.equals(this.dhcpEnabled, objNsxtSegmentRuntime.dhcpEnabled)&&
  Objects.equals(this.nwRef, objNsxtSegmentRuntime.nwRef)&&
  Objects.equals(this.nwName, objNsxtSegmentRuntime.nwName)&&
  Objects.equals(this.vrfContextRef, objNsxtSegmentRuntime.vrfContextRef)&&
  Objects.equals(this.tier1Id, objNsxtSegmentRuntime.tier1Id)&&
  Objects.equals(this.opaqueNetworkId, objNsxtSegmentRuntime.opaqueNetworkId)&&
  Objects.equals(this.segmentGw, objNsxtSegmentRuntime.segmentGw)&&
  Objects.equals(this.dhcpRanges, objNsxtSegmentRuntime.dhcpRanges)&&
  Objects.equals(this.segname, objNsxtSegmentRuntime.segname)&&
  Objects.equals(this.subnet6, objNsxtSegmentRuntime.subnet6)&&
  Objects.equals(this.segmentGw6, objNsxtSegmentRuntime.segmentGw6)&&
  Objects.equals(this.dhcp6Ranges, objNsxtSegmentRuntime.dhcp6Ranges)&&
  Objects.equals(this.vlanIds, objNsxtSegmentRuntime.vlanIds)&&
  Objects.equals(this.tenantRef, objNsxtSegmentRuntime.tenantRef)&&
  Objects.equals(this.cloudRef, objNsxtSegmentRuntime.cloudRef)&&
  Objects.equals(this.securityOnlyNsxt, objNsxtSegmentRuntime.securityOnlyNsxt)&&
  Objects.equals(this.originId, objNsxtSegmentRuntime.originId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NsxtSegmentRuntime {\n");
      sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    dhcp6Ranges: ").append(toIndentedString(dhcp6Ranges)).append("\n");
        sb.append("    dhcpEnabled: ").append(toIndentedString(dhcpEnabled)).append("\n");
        sb.append("    dhcpRanges: ").append(toIndentedString(dhcpRanges)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nwName: ").append(toIndentedString(nwName)).append("\n");
        sb.append("    nwRef: ").append(toIndentedString(nwRef)).append("\n");
        sb.append("    opaqueNetworkId: ").append(toIndentedString(opaqueNetworkId)).append("\n");
        sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
        sb.append("    securityOnlyNsxt: ").append(toIndentedString(securityOnlyNsxt)).append("\n");
        sb.append("    segmentGw: ").append(toIndentedString(segmentGw)).append("\n");
        sb.append("    segmentGw6: ").append(toIndentedString(segmentGw6)).append("\n");
        sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
        sb.append("    segname: ").append(toIndentedString(segname)).append("\n");
        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
        sb.append("    subnet6: ").append(toIndentedString(subnet6)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    tier1Id: ").append(toIndentedString(tier1Id)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vlanIds: ").append(toIndentedString(vlanIds)).append("\n");
        sb.append("    vrfContextRef: ").append(toIndentedString(vrfContextRef)).append("\n");
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

