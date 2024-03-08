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
 * The InventoryConfiguration is a POJO class extends AviRestResource that used for creating
 * InventoryConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "InventoryConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_INVENTORYCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class InventoryConfiguration extends AviRestResource {
    @JsonProperty("enable_search_info")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableSearchInfo = false;



  /**
   * This is the getter method this will return the attribute value.
   * Names, ip's of vs, pool(poolgroup) servers would be searchable on cloud console.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableSearchInfo
   */
  @VsoMethod
  public Boolean getEnableSearchInfo() {
    return enableSearchInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Names, ip's of vs, pool(poolgroup) servers would be searchable on cloud console.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableSearchInfo set the enableSearchInfo.
   */
  @VsoMethod
  public void setEnableSearchInfo(Boolean  enableSearchInfo) {
    this.enableSearchInfo = enableSearchInfo;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  InventoryConfiguration objInventoryConfiguration = (InventoryConfiguration) o;
  return   Objects.equals(this.enableSearchInfo, objInventoryConfiguration.enableSearchInfo);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class InventoryConfiguration {\n");
      sb.append("    enableSearchInfo: ").append(toIndentedString(enableSearchInfo)).append("\n");
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

