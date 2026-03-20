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
 * The UsageMeteringEventDetails is a POJO class extends AviRestResource that used for creating
 * UsageMeteringEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UsageMeteringEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_USAGEMETERINGEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UsageMeteringEventDetails extends AviRestResource {
    @JsonProperty("clouds")
    @JsonInclude(Include.NON_NULL)
    private List<UsageMeteringCloud> clouds;

    @JsonProperty("message")
    @JsonInclude(Include.NON_NULL)
    private String message;

    @JsonProperty("trigger")
    @JsonInclude(Include.NON_NULL)
    private String trigger;



  /**
   * This is the getter method this will return the attribute value.
   * Details of the clouds involved in the task.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clouds
   */
  @VsoMethod
  public List<UsageMeteringCloud> getClouds() {
    return clouds;
  }

  /**
   * This is the setter method. this will set the clouds
   * Details of the clouds involved in the task.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clouds
   */
  @VsoMethod
  public void setClouds(List<UsageMeteringCloud>  clouds) {
    this.clouds = clouds;
  }

  /**
   * This is the setter method this will set the clouds
   * Details of the clouds involved in the task.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clouds
   */
  @VsoMethod
  public UsageMeteringEventDetails addCloudsItem(UsageMeteringCloud cloudsItem) {
    if (this.clouds == null) {
      this.clouds = new ArrayList<UsageMeteringCloud>();
    }
    this.clouds.add(cloudsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Additional info about the task.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return message
   */
  @VsoMethod
  public String getMessage() {
    return message;
  }

  /**
   * This is the setter method to the attribute.
   * Additional info about the task.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param message set the message.
   */
  @VsoMethod
  public void setMessage(String  message) {
    this.message = message;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Trigger for the task.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return trigger
   */
  @VsoMethod
  public String getTrigger() {
    return trigger;
  }

  /**
   * This is the setter method to the attribute.
   * Trigger for the task.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param trigger set the trigger.
   */
  @VsoMethod
  public void setTrigger(String  trigger) {
    this.trigger = trigger;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  UsageMeteringEventDetails objUsageMeteringEventDetails = (UsageMeteringEventDetails) o;
  return   Objects.equals(this.trigger, objUsageMeteringEventDetails.trigger)&&
  Objects.equals(this.message, objUsageMeteringEventDetails.message)&&
  Objects.equals(this.clouds, objUsageMeteringEventDetails.clouds);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class UsageMeteringEventDetails {\n");
      sb.append("    clouds: ").append(toIndentedString(clouds)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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

