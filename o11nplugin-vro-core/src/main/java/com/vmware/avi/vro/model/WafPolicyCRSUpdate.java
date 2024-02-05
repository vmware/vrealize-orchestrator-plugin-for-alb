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
 * The WafPolicyCRSUpdate is a POJO class extends AviRestResource that used for creating
 * WafPolicyCRSUpdate.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafPolicyCRSUpdate")
@VsoFinder(name = Constants.FINDER_VRO_WAFPOLICYCRSUPDATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafPolicyCRSUpdate extends AviRestResource {
    @JsonProperty("commit")
    @JsonInclude(Include.NON_NULL)
    private Boolean commit = false;

    @JsonProperty("waf_crs_ref")
    @JsonInclude(Include.NON_NULL)
    private String wafCrsRef;



  /**
   * This is the getter method this will return the attribute value.
   * Set this to true if you want to update the policy.
   * The default value of false will only analyse what would be changed if this flag would be set to true.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return commit
   */
  @VsoMethod
  public Boolean getCommit() {
    return commit;
  }

  /**
   * This is the setter method to the attribute.
   * Set this to true if you want to update the policy.
   * The default value of false will only analyse what would be changed if this flag would be set to true.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param commit set the commit.
   */
  @VsoMethod
  public void setCommit(Boolean  commit) {
    this.commit = commit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Crs object to which this policy should be updated to.
   * To disable crs for this policy, the special crs object crs-version-not-applicable can be used.
   * It is a reference to an object of type wafcrs.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return wafCrsRef
   */
  @VsoMethod
  public String getWafCrsRef() {
    return wafCrsRef;
  }

  /**
   * This is the setter method to the attribute.
   * Crs object to which this policy should be updated to.
   * To disable crs for this policy, the special crs object crs-version-not-applicable can be used.
   * It is a reference to an object of type wafcrs.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param wafCrsRef set the wafCrsRef.
   */
  @VsoMethod
  public void setWafCrsRef(String  wafCrsRef) {
    this.wafCrsRef = wafCrsRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WafPolicyCRSUpdate objWafPolicyCRSUpdate = (WafPolicyCRSUpdate) o;
  return   Objects.equals(this.wafCrsRef, objWafPolicyCRSUpdate.wafCrsRef)&&
  Objects.equals(this.commit, objWafPolicyCRSUpdate.commit);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafPolicyCRSUpdate {\n");
      sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    wafCrsRef: ").append(toIndentedString(wafCrsRef)).append("\n");
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

