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
 * The OpsInfo is a POJO class extends AviRestResource that used for creating
 * OpsInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OpsInfo")
@VsoFinder(name = Constants.FINDER_VRO_OPSINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OpsInfo extends AviRestResource {
    @JsonProperty("rrtoken")
    @JsonInclude(Include.NON_NULL)
    private List<String> rrtoken;



  /**
   * This is the getter method this will return the attribute value.
   * Current outstanding request-response token of the message to this site.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rrtoken
   */
  @VsoMethod
  public List<String> getRrtoken() {
    return rrtoken;
  }

  /**
   * This is the setter method. this will set the rrtoken
   * Current outstanding request-response token of the message to this site.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rrtoken
   */
  @VsoMethod
  public void setRrtoken(List<String>  rrtoken) {
    this.rrtoken = rrtoken;
  }

  /**
   * This is the setter method this will set the rrtoken
   * Current outstanding request-response token of the message to this site.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rrtoken
   */
  @VsoMethod
  public OpsInfo addRrtokenItem(String rrtokenItem) {
    if (this.rrtoken == null) {
      this.rrtoken = new ArrayList<String>();
    }
    this.rrtoken.add(rrtokenItem);
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
  OpsInfo objOpsInfo = (OpsInfo) o;
  return   Objects.equals(this.rrtoken, objOpsInfo.rrtoken);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OpsInfo {\n");
      sb.append("    rrtoken: ").append(toIndentedString(rrtoken)).append("\n");
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

