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
 * The NsxtTier1SegmentManualMode is a POJO class extends AviRestResource that used for creating
 * NsxtTier1SegmentManualMode.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NsxtTier1SegmentManualMode")
@VsoFinder(name = Constants.FINDER_VRO_NSXTTIER1SEGMENTMANUALMODE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NsxtTier1SegmentManualMode extends AviRestResource {
    @JsonProperty("tier1_lrs")
    @JsonInclude(Include.NON_NULL)
    private List<Tier1LogicalRouterInfo> tier1Lrs = null;



  /**
   * This is the getter method this will return the attribute value.
   * Tier1 logical router placement information.
   * Field introduced in 20.1.1.
   * Minimum of 1 items required.
   * Maximum of 128 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tier1Lrs
   */
  @VsoMethod
  public List<Tier1LogicalRouterInfo> getTier1Lrs() {
    return tier1Lrs;
  }

  /**
   * This is the setter method. this will set the tier1Lrs
   * Tier1 logical router placement information.
   * Field introduced in 20.1.1.
   * Minimum of 1 items required.
   * Maximum of 128 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tier1Lrs
   */
  @VsoMethod
  public void setTier1Lrs(List<Tier1LogicalRouterInfo>  tier1Lrs) {
    this.tier1Lrs = tier1Lrs;
  }

  /**
   * This is the setter method this will set the tier1Lrs
   * Tier1 logical router placement information.
   * Field introduced in 20.1.1.
   * Minimum of 1 items required.
   * Maximum of 128 items allowed.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tier1Lrs
   */
  @VsoMethod
  public NsxtTier1SegmentManualMode addTier1LrsItem(Tier1LogicalRouterInfo tier1LrsItem) {
    if (this.tier1Lrs == null) {
      this.tier1Lrs = new ArrayList<Tier1LogicalRouterInfo>();
    }
    this.tier1Lrs.add(tier1LrsItem);
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
  NsxtTier1SegmentManualMode objNsxtTier1SegmentManualMode = (NsxtTier1SegmentManualMode) o;
  return   Objects.equals(this.tier1Lrs, objNsxtTier1SegmentManualMode.tier1Lrs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NsxtTier1SegmentManualMode {\n");
      sb.append("    tier1Lrs: ").append(toIndentedString(tier1Lrs)).append("\n");
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

