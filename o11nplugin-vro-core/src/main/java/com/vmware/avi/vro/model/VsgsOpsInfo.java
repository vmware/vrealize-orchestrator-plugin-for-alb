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
 * The VsgsOpsInfo is a POJO class extends AviRestResource that used for creating
 * VsgsOpsInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VsgsOpsInfo")
@VsoFinder(name = Constants.FINDER_VRO_VSGSOPSINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VsgsOpsInfo extends AviRestResource {
    @JsonProperty("dnsvs_uuid")
    @JsonInclude(Include.NON_NULL)
    private String dnsvsUuid;

    @JsonProperty("ops")
    @JsonInclude(Include.NON_NULL)
    private String ops;

    @JsonProperty("timestamp")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp timestamp;



  /**
   * This is the getter method this will return the attribute value.
   * Dnsvs uuid associated with the object(gslb, gslbservice, gslbgeodb).
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsvsUuid
   */
  @VsoMethod
  public String getDnsvsUuid() {
    return dnsvsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Dnsvs uuid associated with the object(gslb, gslbservice, gslbgeodb).
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dnsvsUuid set the dnsvsUuid.
   */
  @VsoMethod
  public void setDnsvsUuid(String  dnsvsUuid) {
    this.dnsvsUuid = dnsvsUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vsgs operation type, changed or deleted.
   * Enum options - GSLB_OBJECT_CHANGED, GSLB_OBJECT_UNCHANGED, GSLB_OBJECT_DELETE.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ops
   */
  @VsoMethod
  public String getOps() {
    return ops;
  }

  /**
   * This is the setter method to the attribute.
   * Vsgs operation type, changed or deleted.
   * Enum options - GSLB_OBJECT_CHANGED, GSLB_OBJECT_UNCHANGED, GSLB_OBJECT_DELETE.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ops set the ops.
   */
  @VsoMethod
  public void setOps(String  ops) {
    this.ops = ops;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp for vsgs cud operation.
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
   * Timestamp for vsgs cud operation.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param timestamp set the timestamp.
   */
  @VsoMethod
  public void setTimestamp(TimeStamp timestamp) {
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
  VsgsOpsInfo objVsgsOpsInfo = (VsgsOpsInfo) o;
  return   Objects.equals(this.ops, objVsgsOpsInfo.ops)&&
  Objects.equals(this.dnsvsUuid, objVsgsOpsInfo.dnsvsUuid)&&
  Objects.equals(this.timestamp, objVsgsOpsInfo.timestamp);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VsgsOpsInfo {\n");
      sb.append("    dnsvsUuid: ").append(toIndentedString(dnsvsUuid)).append("\n");
        sb.append("    ops: ").append(toIndentedString(ops)).append("\n");
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

