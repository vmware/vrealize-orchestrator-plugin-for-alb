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
 * The WafPolicyRequiredDataFile is a POJO class extends AviRestResource that used for creating
 * WafPolicyRequiredDataFile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafPolicyRequiredDataFile")
@VsoFinder(name = Constants.FINDER_VRO_WAFPOLICYREQUIREDDATAFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafPolicyRequiredDataFile extends AviRestResource {
    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the data file.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the data file.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of the data file.
   * Enum options - WAF_DATAFILE_PM_FROM_FILE, WAF_DATAFILE_DTD, WAF_DATAFILE_XSD, WAF_DATAFILE_IP_MATCH_FROM_FILE.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the data file.
   * Enum options - WAF_DATAFILE_PM_FROM_FILE, WAF_DATAFILE_DTD, WAF_DATAFILE_XSD, WAF_DATAFILE_IP_MATCH_FROM_FILE.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WafPolicyRequiredDataFile objWafPolicyRequiredDataFile = (WafPolicyRequiredDataFile) o;
  return   Objects.equals(this.name, objWafPolicyRequiredDataFile.name)&&
  Objects.equals(this.type, objWafPolicyRequiredDataFile.type);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafPolicyRequiredDataFile {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

