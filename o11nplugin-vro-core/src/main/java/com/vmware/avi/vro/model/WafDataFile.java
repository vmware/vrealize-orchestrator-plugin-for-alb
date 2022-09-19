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
 * The WafDataFile is a POJO class extends AviRestResource that used for creating
 * WafDataFile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafDataFile")
@VsoFinder(name = Constants.FINDER_VRO_WAFDATAFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafDataFile extends AviRestResource {
    @JsonProperty("data")
    @JsonInclude(Include.NON_NULL)
    private String data = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = "WAF_DATAFILE_PM_FROM_FILE";



  /**
   * This is the getter method this will return the attribute value.
   * Stringified waf file data.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return data
   */
  @VsoMethod
  public String getData() {
    return data;
  }

  /**
   * This is the setter method to the attribute.
   * Stringified waf file data.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param data set the data.
   */
  @VsoMethod
  public void setData(String  data) {
    this.data = data;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf data file name.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Waf data file name.
   * Field introduced in 17.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf data file type.
   * Enum options - WAF_DATAFILE_PM_FROM_FILE, WAF_DATAFILE_DTD, WAF_DATAFILE_XSD, WAF_DATAFILE_IP_MATCH_FROM_FILE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_DATAFILE_PM_FROM_FILE".
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Waf data file type.
   * Enum options - WAF_DATAFILE_PM_FROM_FILE, WAF_DATAFILE_DTD, WAF_DATAFILE_XSD, WAF_DATAFILE_IP_MATCH_FROM_FILE.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_DATAFILE_PM_FROM_FILE".
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
  WafDataFile objWafDataFile = (WafDataFile) o;
  return   Objects.equals(this.name, objWafDataFile.name)&&
  Objects.equals(this.data, objWafDataFile.data)&&
  Objects.equals(this.type, objWafDataFile.type);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafDataFile {\n");
      sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

