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
 * The NsxtT1SegDetails is a POJO class extends AviRestResource that used for creating
 * NsxtT1SegDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NsxtT1SegDetails")
@VsoFinder(name = Constants.FINDER_VRO_NSXTT1SEGDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NsxtT1SegDetails extends AviRestResource {
    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId;

    @JsonProperty("error_string")
    @JsonInclude(Include.NON_NULL)
    private String errorString;

    @JsonProperty("t1seg")
    @JsonInclude(Include.NON_NULL)
    private List<NsxtT1Seg> t1seg;



  /**
   * This is the getter method this will return the attribute value.
   * Nsx-t cloud id.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Nsx-t cloud id.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error message.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Error message.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Nsx-t tier1(s) segment(s).
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return t1seg
   */
  @VsoMethod
  public List<NsxtT1Seg> getT1Seg() {
    return t1seg;
  }

  /**
   * This is the setter method. this will set the t1seg
   * Nsx-t tier1(s) segment(s).
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return t1seg
   */
  @VsoMethod
  public void setT1Seg(List<NsxtT1Seg>  t1seg) {
    this.t1seg = t1seg;
  }

  /**
   * This is the setter method this will set the t1seg
   * Nsx-t tier1(s) segment(s).
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return t1seg
   */
  @VsoMethod
  public NsxtT1SegDetails addT1SegItem(NsxtT1Seg t1segItem) {
    if (this.t1seg == null) {
      this.t1seg = new ArrayList<NsxtT1Seg>();
    }
    this.t1seg.add(t1segItem);
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
  NsxtT1SegDetails objNsxtT1SegDetails = (NsxtT1SegDetails) o;
  return   Objects.equals(this.ccId, objNsxtT1SegDetails.ccId)&&
  Objects.equals(this.t1seg, objNsxtT1SegDetails.t1seg)&&
  Objects.equals(this.errorString, objNsxtT1SegDetails.errorString);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NsxtT1SegDetails {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    t1seg: ").append(toIndentedString(t1seg)).append("\n");
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

