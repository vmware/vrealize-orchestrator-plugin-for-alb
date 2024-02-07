package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.RoleFilterMatchLabel;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The RoleMatchOperationMatchLabel is a POJO class extends AviRestResource that used for creating
 * RoleMatchOperationMatchLabel.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RoleMatchOperationMatchLabel")
@VsoFinder(name = Constants.FINDER_VRO_ROLEMATCHOPERATIONMATCHLABEL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RoleMatchOperationMatchLabel extends AviRestResource {
    @JsonProperty("match_label")
    @JsonInclude(Include.NON_NULL)
    private RoleFilterMatchLabel matchLabel;

    @JsonProperty("match_operation")
    @JsonInclude(Include.NON_NULL)
    private String matchOperation = "ROLE_FILTER_EQUALS";



  /**
   * This is the getter method this will return the attribute value.
   * List of labels allowed for the tenant.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchLabel
   */
  @VsoMethod
  public RoleFilterMatchLabel getMatchLabel() {
    return matchLabel;
  }

  /**
   * This is the setter method to the attribute.
   * List of labels allowed for the tenant.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchLabel set the matchLabel.
   */
  @VsoMethod
  public void setMatchLabel(RoleFilterMatchLabel matchLabel) {
    this.matchLabel = matchLabel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Label match operation criteria.
   * Enum options - ROLE_FILTER_EQUALS, ROLE_FILTER_DOES_NOT_EQUAL, ROLE_FILTER_GLOB_MATCH, ROLE_FILTER_GLOB_DOES_NOT_MATCH.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ROLE_FILTER_EQUALS".
   * @return matchOperation
   */
  @VsoMethod
  public String getMatchOperation() {
    return matchOperation;
  }

  /**
   * This is the setter method to the attribute.
   * Label match operation criteria.
   * Enum options - ROLE_FILTER_EQUALS, ROLE_FILTER_DOES_NOT_EQUAL, ROLE_FILTER_GLOB_MATCH, ROLE_FILTER_GLOB_DOES_NOT_MATCH.
   * Field introduced in 20.1.5.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ROLE_FILTER_EQUALS".
   * @param matchOperation set the matchOperation.
   */
  @VsoMethod
  public void setMatchOperation(String  matchOperation) {
    this.matchOperation = matchOperation;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RoleMatchOperationMatchLabel objRoleMatchOperationMatchLabel = (RoleMatchOperationMatchLabel) o;
  return   Objects.equals(this.matchOperation, objRoleMatchOperationMatchLabel.matchOperation)&&
  Objects.equals(this.matchLabel, objRoleMatchOperationMatchLabel.matchLabel);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RoleMatchOperationMatchLabel {\n");
      sb.append("    matchLabel: ").append(toIndentedString(matchLabel)).append("\n");
        sb.append("    matchOperation: ").append(toIndentedString(matchOperation)).append("\n");
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

