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
 * The WafRuleMatchData is a POJO class extends AviRestResource that used for creating
 * WafRuleMatchData.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafRuleMatchData")
@VsoFinder(name = Constants.FINDER_VRO_WAFRULEMATCHDATA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafRuleMatchData extends AviRestResource {
    @JsonProperty("is_internal")
    @JsonInclude(Include.NON_NULL)
    private Boolean isInternal = false;

    @JsonProperty("match_element")
    @JsonInclude(Include.NON_NULL)
    private String matchElement = null;

    @JsonProperty("match_value")
    @JsonInclude(Include.NON_NULL)
    private String matchValue = null;

    @JsonProperty("match_value_offset")
    @JsonInclude(Include.NON_NULL)
    private Integer matchValueOffset = 0;



  /**
   * This is the getter method this will return the attribute value.
   * The match_element is an internal variable.
   * It is not possible to add exclusions for this element.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isInternal
   */
  @VsoMethod
  public Boolean getIsInternal() {
    return isInternal;
  }

  /**
   * This is the setter method to the attribute.
   * The match_element is an internal variable.
   * It is not possible to add exclusions for this element.
   * Field introduced in 17.2.4.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isInternal set the isInternal.
   */
  @VsoMethod
  public void setIsInternal(Boolean  isInternal) {
    this.isInternal = isInternal;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field from a transaction that matches the rule, for instance if the request parameter is password=foobar, then match_element is args password.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchElement
   */
  @VsoMethod
  public String getMatchElement() {
    return matchElement;
  }

  /**
   * This is the setter method to the attribute.
   * Field from a transaction that matches the rule, for instance if the request parameter is password=foobar, then match_element is args password.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchElement set the matchElement.
   */
  @VsoMethod
  public void setMatchElement(String  matchElement) {
    this.matchElement = matchElement;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Value of the field from a transaction that matches the rule.
   * For instance, if the request parameter is password=foo, then match_value is foo.
   * The value can be truncated if it is too long.
   * In this case, this field starts at the position where the actual match started inside the value, and that position is stored in
   * match_value_offset.
   * This is done to ensure the relevant part is shown.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchValue
   */
  @VsoMethod
  public String getMatchValue() {
    return matchValue;
  }

  /**
   * This is the setter method to the attribute.
   * Value of the field from a transaction that matches the rule.
   * For instance, if the request parameter is password=foo, then match_value is foo.
   * The value can be truncated if it is too long.
   * In this case, this field starts at the position where the actual match started inside the value, and that position is stored in
   * match_value_offset.
   * This is done to ensure the relevant part is shown.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchValue set the matchValue.
   */
  @VsoMethod
  public void setMatchValue(String  matchValue) {
    this.matchValue = matchValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The starting index of the first character of match_value field with respect to original match value.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return matchValueOffset
   */
  @VsoMethod
  public Integer getMatchValueOffset() {
    return matchValueOffset;
  }

  /**
   * This is the setter method to the attribute.
   * The starting index of the first character of match_value field with respect to original match value.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param matchValueOffset set the matchValueOffset.
   */
  @VsoMethod
  public void setMatchValueOffset(Integer  matchValueOffset) {
    this.matchValueOffset = matchValueOffset;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WafRuleMatchData objWafRuleMatchData = (WafRuleMatchData) o;
  return   Objects.equals(this.matchElement, objWafRuleMatchData.matchElement)&&
  Objects.equals(this.matchValue, objWafRuleMatchData.matchValue)&&
  Objects.equals(this.isInternal, objWafRuleMatchData.isInternal)&&
  Objects.equals(this.matchValueOffset, objWafRuleMatchData.matchValueOffset);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafRuleMatchData {\n");
      sb.append("    isInternal: ").append(toIndentedString(isInternal)).append("\n");
        sb.append("    matchElement: ").append(toIndentedString(matchElement)).append("\n");
        sb.append("    matchValue: ").append(toIndentedString(matchValue)).append("\n");
        sb.append("    matchValueOffset: ").append(toIndentedString(matchValueOffset)).append("\n");
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

