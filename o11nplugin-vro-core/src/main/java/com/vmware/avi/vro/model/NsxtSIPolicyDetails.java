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
 * The NsxtSIPolicyDetails is a POJO class extends AviRestResource that used for creating
 * NsxtSIPolicyDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NsxtSIPolicyDetails")
@VsoFinder(name = Constants.FINDER_VRO_NSXTSIPOLICYDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NsxtSIPolicyDetails extends AviRestResource {
    @JsonProperty("error_string")
    @JsonInclude(Include.NON_NULL)
    private String errorString = null;

    @JsonProperty("policy")
    @JsonInclude(Include.NON_NULL)
    private String policy = null;

    @JsonProperty("redirectTo")
    @JsonInclude(Include.NON_NULL)
    private List<String> redirectTo = null;

    @JsonProperty("scope")
    @JsonInclude(Include.NON_NULL)
    private String scope = null;

    @JsonProperty("segroup")
    @JsonInclude(Include.NON_NULL)
    private String segroup = null;

    @JsonProperty("tier1")
    @JsonInclude(Include.NON_NULL)
    private String tier1 = null;



  /**
   * This is the getter method this will return the attribute value.
   * Error message.
   * Field introduced in 21.1.3.
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
   * Field introduced in 21.1.3.
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
   * Redirectpolicy path.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return policy
   */
  @VsoMethod
  public String getPolicy() {
    return policy;
  }

  /**
   * This is the setter method to the attribute.
   * Redirectpolicy path.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param policy set the policy.
   */
  @VsoMethod
  public void setPolicy(String  policy) {
    this.policy = policy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Traffic is redirected to this endpoints.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return redirectTo
   */
  @VsoMethod
  public List<String> getRedirectto() {
    return redirectTo;
  }

  /**
   * This is the setter method. this will set the redirectTo
   * Traffic is redirected to this endpoints.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return redirectTo
   */
  @VsoMethod
  public void setRedirectto(List<String>  redirectTo) {
    this.redirectTo = redirectTo;
  }

  /**
   * This is the setter method this will set the redirectTo
   * Traffic is redirected to this endpoints.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return redirectTo
   */
  @VsoMethod
  public NsxtSIPolicyDetails addRedirecttoItem(String redirectToItem) {
    if (this.redirectTo == null) {
      this.redirectTo = new ArrayList<String>();
    }
    this.redirectTo.add(redirectToItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Policy scope.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scope
   */
  @VsoMethod
  public String getScope() {
    return scope;
  }

  /**
   * This is the setter method to the attribute.
   * Policy scope.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param scope set the scope.
   */
  @VsoMethod
  public void setScope(String  scope) {
    this.scope = scope;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Serviceenginegroup name.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return segroup
   */
  @VsoMethod
  public String getSegroup() {
    return segroup;
  }

  /**
   * This is the setter method to the attribute.
   * Serviceenginegroup name.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param segroup set the segroup.
   */
  @VsoMethod
  public void setSegroup(String  segroup) {
    this.segroup = segroup;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tier1 path.
   * Field introduced in 21.1.3.
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
   * Tier1 path.
   * Field introduced in 21.1.3.
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
  NsxtSIPolicyDetails objNsxtSIPolicyDetails = (NsxtSIPolicyDetails) o;
  return   Objects.equals(this.segroup, objNsxtSIPolicyDetails.segroup)&&
  Objects.equals(this.tier1, objNsxtSIPolicyDetails.tier1)&&
  Objects.equals(this.errorString, objNsxtSIPolicyDetails.errorString)&&
  Objects.equals(this.policy, objNsxtSIPolicyDetails.policy)&&
  Objects.equals(this.redirectTo, objNsxtSIPolicyDetails.redirectTo)&&
  Objects.equals(this.scope, objNsxtSIPolicyDetails.scope);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NsxtSIPolicyDetails {\n");
      sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    redirectTo: ").append(toIndentedString(redirectTo)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    segroup: ").append(toIndentedString(segroup)).append("\n");
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

