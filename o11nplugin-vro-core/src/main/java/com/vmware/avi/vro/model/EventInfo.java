package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.TimeStamp;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The EventInfo is a POJO class extends AviRestResource that used for creating
 * EventInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "EventInfo")
@VsoFinder(name = Constants.FINDER_VRO_EVENTINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class EventInfo extends AviRestResource {
    @JsonProperty("msg")
    @JsonInclude(Include.NON_NULL)
    private List<String> msg;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("timestamp")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp timestamp;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return msg
   */
  @VsoMethod
  public List<String> getMsg() {
    return msg;
  }

  /**
   * This is the setter method. this will set the msg
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return msg
   */
  @VsoMethod
  public void setMsg(List<String>  msg) {
    this.msg = msg;
  }

  /**
   * This is the setter method this will set the msg
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return msg
   */
  @VsoMethod
  public EventInfo addMsgItem(String msgItem) {
    if (this.msg == null) {
      this.msg = new ArrayList<String>();
    }
    this.msg.add(msgItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Event creation time.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return timestamp
   */
  @VsoMethod
  public TimeStamp getTimestamp() {
    return timestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Event creation time.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param timestamp set the timestamp.
   */
  @VsoMethod
  public void setTimestamp(TimeStamp timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  EventInfo objEventInfo = (EventInfo) o;
  return   Objects.equals(this.uuid, objEventInfo.uuid)&&
  Objects.equals(this.name, objEventInfo.name)&&
  Objects.equals(this.msg, objEventInfo.msg)&&
  Objects.equals(this.timestamp, objEventInfo.timestamp);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class EventInfo {\n");
      sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

