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
 * The SensitiveLogProfile is a POJO class extends AviRestResource that used for creating
 * SensitiveLogProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SensitiveLogProfile")
@VsoFinder(name = Constants.FINDER_VRO_SENSITIVELOGPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SensitiveLogProfile extends AviRestResource {
  @JsonProperty("header_field_rules")
  @JsonInclude(Include.NON_NULL)
  private List<SensitiveFieldRule> headerFieldRules = null;

  @JsonProperty("waf_field_rules")
  @JsonInclude(Include.NON_NULL)
  private List<SensitiveFieldRule> wafFieldRules = null;



  /**
   * This is the getter method this will return the attribute value.
   * Match sensitive header fields in http application log.
   * Field introduced in 17.2.10, 18.1.2.
   * @return headerFieldRules
   */
  @VsoMethod
  public List<SensitiveFieldRule> getHeaderFieldRules() {
    return headerFieldRules;
  }

  /**
   * This is the setter method. this will set the headerFieldRules
   * Match sensitive header fields in http application log.
   * Field introduced in 17.2.10, 18.1.2.
   * @return headerFieldRules
   */
  @VsoMethod
  public void setHeaderFieldRules(List<SensitiveFieldRule>  headerFieldRules) {
    this.headerFieldRules = headerFieldRules;
  }

  /**
   * This is the setter method this will set the headerFieldRules
   * Match sensitive header fields in http application log.
   * Field introduced in 17.2.10, 18.1.2.
   * @return headerFieldRules
   */
  @VsoMethod
  public SensitiveLogProfile addHeaderFieldRulesItem(SensitiveFieldRule headerFieldRulesItem) {
    if (this.headerFieldRules == null) {
      this.headerFieldRules = new ArrayList<SensitiveFieldRule>();
    }
    this.headerFieldRules.add(headerFieldRulesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Match sensitive waf log fields in http application log.
   * Field introduced in 17.2.13, 18.1.3.
   * @return wafFieldRules
   */
  @VsoMethod
  public List<SensitiveFieldRule> getWafFieldRules() {
    return wafFieldRules;
  }

  /**
   * This is the setter method. this will set the wafFieldRules
   * Match sensitive waf log fields in http application log.
   * Field introduced in 17.2.13, 18.1.3.
   * @return wafFieldRules
   */
  @VsoMethod
  public void setWafFieldRules(List<SensitiveFieldRule>  wafFieldRules) {
    this.wafFieldRules = wafFieldRules;
  }

  /**
   * This is the setter method this will set the wafFieldRules
   * Match sensitive waf log fields in http application log.
   * Field introduced in 17.2.13, 18.1.3.
   * @return wafFieldRules
   */
  @VsoMethod
  public SensitiveLogProfile addWafFieldRulesItem(SensitiveFieldRule wafFieldRulesItem) {
    if (this.wafFieldRules == null) {
      this.wafFieldRules = new ArrayList<SensitiveFieldRule>();
    }
    this.wafFieldRules.add(wafFieldRulesItem);
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
  SensitiveLogProfile objSensitiveLogProfile = (SensitiveLogProfile) o;
  return   Objects.equals(this.headerFieldRules, objSensitiveLogProfile.headerFieldRules)&&
  Objects.equals(this.wafFieldRules, objSensitiveLogProfile.wafFieldRules);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SensitiveLogProfile {\n");
      sb.append("    headerFieldRules: ").append(toIndentedString(headerFieldRules)).append("\n");
        sb.append("    wafFieldRules: ").append(toIndentedString(wafFieldRules)).append("\n");
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
