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
 * The WarningEventDetails is a POJO class extends AviRestResource that used for creating
 * WarningEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WarningEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_WARNINGEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WarningEventDetails extends AviRestResource {
    @JsonProperty("event_data")
    @JsonInclude(Include.NON_NULL)
    private String eventData;

    @JsonProperty("warning_message")
    @JsonInclude(Include.NON_NULL)
    private String warningMessage;



  /**
   * This is the getter method this will return the attribute value.
   * Event data.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventData
   */
  @VsoMethod
  public String getEventData() {
    return eventData;
  }

  /**
   * This is the setter method to the attribute.
   * Event data.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param eventData set the eventData.
   */
  @VsoMethod
  public void setEventData(String  eventData) {
    this.eventData = eventData;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Warning message.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return warningMessage
   */
  @VsoMethod
  public String getWarningMessage() {
    return warningMessage;
  }

  /**
   * This is the setter method to the attribute.
   * Warning message.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param warningMessage set the warningMessage.
   */
  @VsoMethod
  public void setWarningMessage(String  warningMessage) {
    this.warningMessage = warningMessage;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WarningEventDetails objWarningEventDetails = (WarningEventDetails) o;
  return   Objects.equals(this.eventData, objWarningEventDetails.eventData)&&
  Objects.equals(this.warningMessage, objWarningEventDetails.warningMessage);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WarningEventDetails {\n");
      sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
        sb.append("    warningMessage: ").append(toIndentedString(warningMessage)).append("\n");
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

