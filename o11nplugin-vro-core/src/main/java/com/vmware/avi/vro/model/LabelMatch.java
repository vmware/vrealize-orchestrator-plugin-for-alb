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
 * The LabelMatch is a POJO class extends AviRestResource that used for creating
 * LabelMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LabelMatch")
@VsoFinder(name = Constants.FINDER_VRO_LABELMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LabelMatch extends AviRestResource {
    @JsonProperty("match_criteria")
    @JsonInclude(Include.NON_NULL)
    private String matchCriteria = "IS_IN";

    @JsonProperty("values")
    @JsonInclude(Include.NON_NULL)
    private List<String> values;



  /**
   * This is the getter method this will return the attribute value.
   * Criterion to use for matching the labels.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "IS_IN".
   * @return matchCriteria
   */
  @VsoMethod
  public String getMatchCriteria() {
    return matchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Criterion to use for matching the labels.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "IS_IN".
   * @param matchCriteria set the matchCriteria.
   */
  @VsoMethod
  public void setMatchCriteria(String  matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Labels to be matched against the api endpoint labels.
   * Field introduced in 32.2.1.
   * Minimum of 1 items required.
   * Maximum of 10 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return values
   */
  @VsoMethod
  public List<String> getValues() {
    return values;
  }

  /**
   * This is the setter method. this will set the values
   * Labels to be matched against the api endpoint labels.
   * Field introduced in 32.2.1.
   * Minimum of 1 items required.
   * Maximum of 10 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return values
   */
  @VsoMethod
  public void setValues(List<String>  values) {
    this.values = values;
  }

  /**
   * This is the setter method this will set the values
   * Labels to be matched against the api endpoint labels.
   * Field introduced in 32.2.1.
   * Minimum of 1 items required.
   * Maximum of 10 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return values
   */
  @VsoMethod
  public LabelMatch addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
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
  LabelMatch objLabelMatch = (LabelMatch) o;
  return   Objects.equals(this.matchCriteria, objLabelMatch.matchCriteria)&&
  Objects.equals(this.values, objLabelMatch.values);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LabelMatch {\n");
      sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

