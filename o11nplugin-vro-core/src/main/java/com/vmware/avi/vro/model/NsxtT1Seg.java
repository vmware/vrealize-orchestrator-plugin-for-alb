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
 * The NsxtT1Seg is a POJO class extends AviRestResource that used for creating
 * NsxtT1Seg.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NsxtT1Seg")
@VsoFinder(name = Constants.FINDER_VRO_NSXTT1SEG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NsxtT1Seg extends AviRestResource {
    @JsonProperty("segment")
    @JsonInclude(Include.NON_NULL)
    private String segment = null;

    @JsonProperty("tier1")
    @JsonInclude(Include.NON_NULL)
    private String tier1 = null;



  /**
   * This is the getter method this will return the attribute value.
   * Nsx-t segment.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return segment
   */
  @VsoMethod
  public String getSegment() {
    return segment;
  }

  /**
   * This is the setter method to the attribute.
   * Nsx-t segment.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param segment set the segment.
   */
  @VsoMethod
  public void setSegment(String  segment) {
    this.segment = segment;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Nsx-t tier1.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tier1
   */
  @VsoMethod
  public String getTier1() {
    return tier1;
  }

  /**
   * This is the setter method to the attribute.
   * Nsx-t tier1.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tier1 set the tier1.
   */
  @VsoMethod
  public void setTier1(String  tier1) {
    this.tier1 = tier1;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NsxtT1Seg objNsxtT1Seg = (NsxtT1Seg) o;
  return   Objects.equals(this.tier1, objNsxtT1Seg.tier1)&&
  Objects.equals(this.segment, objNsxtT1Seg.segment);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NsxtT1Seg {\n");
      sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
        sb.append("    tier1: ").append(toIndentedString(tier1)).append("\n");
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

