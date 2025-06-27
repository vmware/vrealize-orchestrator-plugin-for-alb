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
 * The PostgresEventInfo is a POJO class extends AviRestResource that used for creating
 * PostgresEventInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PostgresEventInfo")
@VsoFinder(name = Constants.FINDER_VRO_POSTGRESEVENTINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PostgresEventInfo extends AviRestResource {
    @JsonProperty("db_name")
    @JsonInclude(Include.NON_NULL)
    private String dbName;

    @JsonProperty("event_desc")
    @JsonInclude(Include.NON_NULL)
    private String eventDesc;

    @JsonProperty("timestamp")
    @JsonInclude(Include.NON_NULL)
    private String timestamp;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the db.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dbName
   */
  @VsoMethod
  public String getDbName() {
    return dbName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the db.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dbName set the dbName.
   */
  @VsoMethod
  public void setDbName(String  dbName) {
    this.dbName = dbName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Description of the event.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventDesc
   */
  @VsoMethod
  public String getEventDesc() {
    return eventDesc;
  }

  /**
   * This is the setter method to the attribute.
   * Description of the event.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param eventDesc set the eventDesc.
   */
  @VsoMethod
  public void setEventDesc(String  eventDesc) {
    this.eventDesc = eventDesc;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp at which this event occurred.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return timestamp
   */
  @VsoMethod
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp at which this event occurred.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param timestamp set the timestamp.
   */
  @VsoMethod
  public void setTimestamp(String  timestamp) {
    this.timestamp = timestamp;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PostgresEventInfo objPostgresEventInfo = (PostgresEventInfo) o;
  return   Objects.equals(this.dbName, objPostgresEventInfo.dbName)&&
  Objects.equals(this.eventDesc, objPostgresEventInfo.eventDesc)&&
  Objects.equals(this.timestamp, objPostgresEventInfo.timestamp);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PostgresEventInfo {\n");
      sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    eventDesc: ").append(toIndentedString(eventDesc)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

