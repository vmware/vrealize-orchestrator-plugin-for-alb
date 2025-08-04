package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.TechSupport;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The TechSupportEvent is a POJO class extends AviRestResource that used for creating
 * TechSupportEvent.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TechSupportEvent")
@VsoFinder(name = Constants.FINDER_VRO_TECHSUPPORTEVENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TechSupportEvent extends AviRestResource {
    @JsonProperty("tech_support")
    @JsonInclude(Include.NON_NULL)
    private TechSupport techSupport;



  /**
   * This is the getter method this will return the attribute value.
   * Techsupport object.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return techSupport
   */
  @VsoMethod
  public TechSupport getTechSupport() {
    return techSupport;
  }

  /**
   * This is the setter method to the attribute.
   * Techsupport object.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param techSupport set the techSupport.
   */
  @VsoMethod
  public void setTechSupport(TechSupport techSupport) {
    this.techSupport = techSupport;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TechSupportEvent objTechSupportEvent = (TechSupportEvent) o;
  return   Objects.equals(this.techSupport, objTechSupportEvent.techSupport);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TechSupportEvent {\n");
      sb.append("    techSupport: ").append(toIndentedString(techSupport)).append("\n");
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

