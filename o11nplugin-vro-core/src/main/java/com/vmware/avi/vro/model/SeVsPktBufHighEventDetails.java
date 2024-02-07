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
 * The SeVsPktBufHighEventDetails is a POJO class extends AviRestResource that used for creating
 * SeVsPktBufHighEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeVsPktBufHighEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEVSPKTBUFHIGHEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeVsPktBufHighEventDetails extends AviRestResource {
    @JsonProperty("current_value")
    @JsonInclude(Include.NON_NULL)
    private Integer currentValue;

    @JsonProperty("threshold")
    @JsonInclude(Include.NON_NULL)
    private Integer threshold;

    @JsonProperty("virtual_service")
    @JsonInclude(Include.NON_NULL)
    private String virtualService;



  /**
   * This is the getter method this will return the attribute value.
   * Current packet buffer usage of the vs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return currentValue
   */
  @VsoMethod
  public Integer getCurrentValue() {
    return currentValue;
  }

  /**
   * This is the setter method to the attribute.
   * Current packet buffer usage of the vs.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param currentValue set the currentValue.
   */
  @VsoMethod
  public void setCurrentValue(Integer  currentValue) {
    this.currentValue = currentValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Buffer usage threshold value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return threshold
   */
  @VsoMethod
  public Integer getThreshold() {
    return threshold;
  }

  /**
   * This is the setter method to the attribute.
   * Buffer usage threshold value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param threshold set the threshold.
   */
  @VsoMethod
  public void setThreshold(Integer  threshold) {
    this.threshold = threshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtual service name.
   * It is a reference to an object of type virtualservice.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return virtualService
   */
  @VsoMethod
  public String getVirtualService() {
    return virtualService;
  }

  /**
   * This is the setter method to the attribute.
   * Virtual service name.
   * It is a reference to an object of type virtualservice.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param virtualService set the virtualService.
   */
  @VsoMethod
  public void setVirtualService(String  virtualService) {
    this.virtualService = virtualService;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeVsPktBufHighEventDetails objSeVsPktBufHighEventDetails = (SeVsPktBufHighEventDetails) o;
  return   Objects.equals(this.virtualService, objSeVsPktBufHighEventDetails.virtualService)&&
  Objects.equals(this.threshold, objSeVsPktBufHighEventDetails.threshold)&&
  Objects.equals(this.currentValue, objSeVsPktBufHighEventDetails.currentValue);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeVsPktBufHighEventDetails {\n");
      sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    virtualService: ").append(toIndentedString(virtualService)).append("\n");
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

