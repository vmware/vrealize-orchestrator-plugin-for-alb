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
 * The OutOfBandRequestLog is a POJO class extends AviRestResource that used for creating
 * OutOfBandRequestLog.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OutOfBandRequestLog")
@VsoFinder(name = Constants.FINDER_VRO_OUTOFBANDREQUESTLOG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OutOfBandRequestLog extends AviRestResource {
    @JsonProperty("ds_req_logs")
    @JsonInclude(Include.NON_NULL)
    private List<DSRequestLog> dsReqLogs = null;



  /**
   * This is the getter method this will return the attribute value.
   * Logs for out-of-band requests sent from the datascript.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dsReqLogs
   */
  @VsoMethod
  public List<DSRequestLog> getDsReqLogs() {
    return dsReqLogs;
  }

  /**
   * This is the setter method. this will set the dsReqLogs
   * Logs for out-of-band requests sent from the datascript.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dsReqLogs
   */
  @VsoMethod
  public void setDsReqLogs(List<DSRequestLog>  dsReqLogs) {
    this.dsReqLogs = dsReqLogs;
  }

  /**
   * This is the setter method this will set the dsReqLogs
   * Logs for out-of-band requests sent from the datascript.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dsReqLogs
   */
  @VsoMethod
  public OutOfBandRequestLog addDsReqLogsItem(DSRequestLog dsReqLogsItem) {
    if (this.dsReqLogs == null) {
      this.dsReqLogs = new ArrayList<DSRequestLog>();
    }
    this.dsReqLogs.add(dsReqLogsItem);
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
  OutOfBandRequestLog objOutOfBandRequestLog = (OutOfBandRequestLog) o;
  return   Objects.equals(this.dsReqLogs, objOutOfBandRequestLog.dsReqLogs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OutOfBandRequestLog {\n");
      sb.append("    dsReqLogs: ").append(toIndentedString(dsReqLogs)).append("\n");
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

