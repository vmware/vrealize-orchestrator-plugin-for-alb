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
 * The NsxtTier1SegmentAutomaticMode is a POJO class extends AviRestResource that used for creating
 * NsxtTier1SegmentAutomaticMode.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NsxtTier1SegmentAutomaticMode")
@VsoFinder(name = Constants.FINDER_VRO_NSXTTIER1SEGMENTAUTOMATICMODE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NsxtTier1SegmentAutomaticMode extends AviRestResource {
  @JsonProperty("nsxt_segment_subnet")
  @JsonInclude(Include.NON_NULL)
  private IpAddrPrefix nsxtSegmentSubnet = null;

  @JsonProperty("num_se_per_segment")
  @JsonInclude(Include.NON_NULL)
  private Integer numSePerSegment = 16;

  @JsonProperty("tier1_lr_ids")
  @JsonInclude(Include.NON_NULL)
  private List<String> tier1LrIds = null;



  /**
   * This is the getter method this will return the attribute value.
   * Uber ip subnet for the logical segments created automatically by avi controller.
   * Field introduced in 20.1.1.
   * @return nsxtSegmentSubnet
   */
  @VsoMethod
  public IpAddrPrefix getNsxtSegmentSubnet() {
    return nsxtSegmentSubnet;
  }

  /**
   * This is the setter method to the attribute.
   * Uber ip subnet for the logical segments created automatically by avi controller.
   * Field introduced in 20.1.1.
   * @param nsxtSegmentSubnet set the nsxtSegmentSubnet.
   */
  @VsoMethod
  public void setNsxtSegmentSubnet(IpAddrPrefix nsxtSegmentSubnet) {
    this.nsxtSegmentSubnet = nsxtSegmentSubnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The number of se data vnic's that can be connected to the avi logical segment.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 16.
   * @return numSePerSegment
   */
  @VsoMethod
  public Integer getNumSePerSegment() {
    return numSePerSegment;
  }

  /**
   * This is the setter method to the attribute.
   * The number of se data vnic's that can be connected to the avi logical segment.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as 16.
   * @param numSePerSegment set the numSePerSegment.
   */
  @VsoMethod
  public void setNumSePerSegment(Integer  numSePerSegment) {
    this.numSePerSegment = numSePerSegment;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tier1 logical router ids.
   * Field introduced in 20.1.1.
   * @return tier1LrIds
   */
  @VsoMethod
  public List<String> getTier1LrIds() {
    return tier1LrIds;
  }

  /**
   * This is the setter method. this will set the tier1LrIds
   * Tier1 logical router ids.
   * Field introduced in 20.1.1.
   * @return tier1LrIds
   */
  @VsoMethod
  public void setTier1LrIds(List<String>  tier1LrIds) {
    this.tier1LrIds = tier1LrIds;
  }

  /**
   * This is the setter method this will set the tier1LrIds
   * Tier1 logical router ids.
   * Field introduced in 20.1.1.
   * @return tier1LrIds
   */
  @VsoMethod
  public NsxtTier1SegmentAutomaticMode addTier1LrIdsItem(String tier1LrIdsItem) {
    if (this.tier1LrIds == null) {
      this.tier1LrIds = new ArrayList<String>();
    }
    this.tier1LrIds.add(tier1LrIdsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NsxtTier1SegmentAutomaticMode objNsxtTier1SegmentAutomaticMode = (NsxtTier1SegmentAutomaticMode) o;
  return   Objects.equals(this.tier1LrIds, objNsxtTier1SegmentAutomaticMode.tier1LrIds)&&
  Objects.equals(this.nsxtSegmentSubnet, objNsxtTier1SegmentAutomaticMode.nsxtSegmentSubnet)&&
  Objects.equals(this.numSePerSegment, objNsxtTier1SegmentAutomaticMode.numSePerSegment);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NsxtTier1SegmentAutomaticMode {\n");
      sb.append("    nsxtSegmentSubnet: ").append(toIndentedString(nsxtSegmentSubnet)).append("\n");
        sb.append("    numSePerSegment: ").append(toIndentedString(numSePerSegment)).append("\n");
        sb.append("    tier1LrIds: ").append(toIndentedString(tier1LrIds)).append("\n");
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

