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
 * The JsonParsingLimits is a POJO class extends AviRestResource that used for creating
 * JsonParsingLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "JsonParsingLimits")
@VsoFinder(name = Constants.FINDER_VRO_JSONPARSINGLIMITS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class JsonParsingLimits extends AviRestResource {
    @JsonProperty("max_nesting_level")
    @JsonInclude(Include.NON_NULL)
    private Integer maxNestingLevel = 0;

    @JsonProperty("max_subelements")
    @JsonInclude(Include.NON_NULL)
    private Integer maxSubelements = 0;

    @JsonProperty("max_total_elements")
    @JsonInclude(Include.NON_NULL)
    private Integer maxTotalElements = 0;

    @JsonProperty("max_value_length")
    @JsonInclude(Include.NON_NULL)
    private Integer maxValueLength = 0;



  /**
   * This is the getter method this will return the attribute value.
   * Maximum nesting level of a json document.
   * 0 means no restriction.
   * Allowed values are 0-256.
   * Special values are 0- do not apply this restriction.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxNestingLevel
   */
  @VsoMethod
  public Integer getMaxNestingLevel() {
    return maxNestingLevel;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum nesting level of a json document.
   * 0 means no restriction.
   * Allowed values are 0-256.
   * Special values are 0- do not apply this restriction.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxNestingLevel set the maxNestingLevel.
   */
  @VsoMethod
  public void setMaxNestingLevel(Integer  maxNestingLevel) {
    this.maxNestingLevel = maxNestingLevel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of elements in an array or object.
   * 0 means no restriction.
   * Allowed values are 0-1048576.
   * Special values are 0- do not apply this restriction.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxSubelements
   */
  @VsoMethod
  public Integer getMaxSubelements() {
    return maxSubelements;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of elements in an array or object.
   * 0 means no restriction.
   * Allowed values are 0-1048576.
   * Special values are 0- do not apply this restriction.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxSubelements set the maxSubelements.
   */
  @VsoMethod
  public void setMaxSubelements(Integer  maxSubelements) {
    this.maxSubelements = maxSubelements;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of all elements in the whole document.
   * 0 means no restriction.
   * Allowed values are 0-1048576.
   * Special values are 0- do not apply this restriction.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxTotalElements
   */
  @VsoMethod
  public Integer getMaxTotalElements() {
    return maxTotalElements;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of all elements in the whole document.
   * 0 means no restriction.
   * Allowed values are 0-1048576.
   * Special values are 0- do not apply this restriction.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxTotalElements set the maxTotalElements.
   */
  @VsoMethod
  public void setMaxTotalElements(Integer  maxTotalElements) {
    this.maxTotalElements = maxTotalElements;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum length of a single value (string).
   * 0 means no restriction.
   * Allowed values are 0-1048576.
   * Special values are 0- do not apply this restriction.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return maxValueLength
   */
  @VsoMethod
  public Integer getMaxValueLength() {
    return maxValueLength;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum length of a single value (string).
   * 0 means no restriction.
   * Allowed values are 0-1048576.
   * Special values are 0- do not apply this restriction.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param maxValueLength set the maxValueLength.
   */
  @VsoMethod
  public void setMaxValueLength(Integer  maxValueLength) {
    this.maxValueLength = maxValueLength;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  JsonParsingLimits objJsonParsingLimits = (JsonParsingLimits) o;
  return   Objects.equals(this.maxNestingLevel, objJsonParsingLimits.maxNestingLevel)&&
  Objects.equals(this.maxValueLength, objJsonParsingLimits.maxValueLength)&&
  Objects.equals(this.maxSubelements, objJsonParsingLimits.maxSubelements)&&
  Objects.equals(this.maxTotalElements, objJsonParsingLimits.maxTotalElements);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class JsonParsingLimits {\n");
      sb.append("    maxNestingLevel: ").append(toIndentedString(maxNestingLevel)).append("\n");
        sb.append("    maxSubelements: ").append(toIndentedString(maxSubelements)).append("\n");
        sb.append("    maxTotalElements: ").append(toIndentedString(maxTotalElements)).append("\n");
        sb.append("    maxValueLength: ").append(toIndentedString(maxValueLength)).append("\n");
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

