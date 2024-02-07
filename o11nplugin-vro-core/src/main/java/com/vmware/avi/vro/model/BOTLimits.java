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
 * The BOTLimits is a POJO class extends AviRestResource that used for creating
 * BOTLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BOTLimits")
@VsoFinder(name = Constants.FINDER_VRO_BOTLIMITS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BOTLimits extends AviRestResource {
    @JsonProperty("allow_rules")
    @JsonInclude(Include.NON_NULL)
    private Integer allowRules;

    @JsonProperty("hdrs")
    @JsonInclude(Include.NON_NULL)
    private Integer hdrs;

    @JsonProperty("mapping_rules")
    @JsonInclude(Include.NON_NULL)
    private Integer mappingRules;



  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of rules to control which requests undergo bot detection.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowRules
   */
  @VsoMethod
  public Integer getAllowRules() {
    return allowRules;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of rules to control which requests undergo bot detection.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param allowRules set the allowRules.
   */
  @VsoMethod
  public void setAllowRules(Integer  allowRules) {
    this.allowRules = allowRules;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of configurable http header(s).
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hdrs
   */
  @VsoMethod
  public Integer getHdrs() {
    return hdrs;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of configurable http header(s).
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hdrs set the hdrs.
   */
  @VsoMethod
  public void setHdrs(Integer  hdrs) {
    this.hdrs = hdrs;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of rules in a botmapping object.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mappingRules
   */
  @VsoMethod
  public Integer getMappingRules() {
    return mappingRules;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of rules in a botmapping object.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mappingRules set the mappingRules.
   */
  @VsoMethod
  public void setMappingRules(Integer  mappingRules) {
    this.mappingRules = mappingRules;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  BOTLimits objBOTLimits = (BOTLimits) o;
  return   Objects.equals(this.mappingRules, objBOTLimits.mappingRules)&&
  Objects.equals(this.allowRules, objBOTLimits.allowRules)&&
  Objects.equals(this.hdrs, objBOTLimits.hdrs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BOTLimits {\n");
      sb.append("    allowRules: ").append(toIndentedString(allowRules)).append("\n");
        sb.append("    hdrs: ").append(toIndentedString(hdrs)).append("\n");
        sb.append("    mappingRules: ").append(toIndentedString(mappingRules)).append("\n");
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

