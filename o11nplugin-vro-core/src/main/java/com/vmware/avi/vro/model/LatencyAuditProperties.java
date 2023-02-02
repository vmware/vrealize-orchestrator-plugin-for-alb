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
 * The LatencyAuditProperties is a POJO class extends AviRestResource that used for creating
 * LatencyAuditProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LatencyAuditProperties")
@VsoFinder(name = Constants.FINDER_VRO_LATENCYAUDITPROPERTIES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LatencyAuditProperties extends AviRestResource {
    @JsonProperty("conn_est_audit_mode")
    @JsonInclude(Include.NON_NULL)
    private String connEstAuditMode = null;

    @JsonProperty("conn_est_threshold")
    @JsonInclude(Include.NON_NULL)
    private Integer connEstThreshold = null;

    @JsonProperty("latency_audit_mode")
    @JsonInclude(Include.NON_NULL)
    private String latencyAuditMode = null;

    @JsonProperty("latency_threshold")
    @JsonInclude(Include.NON_NULL)
    private Integer latencyThreshold = null;



  /**
   * This is the getter method this will return the attribute value.
   * Deprecated in 22.1.1.
   * Enum options - LATENCY_AUDIT_OFF, LATENCY_AUDIT_ON, LATENCY_AUDIT_ON_WITH_SIG.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connEstAuditMode
   */
  @VsoMethod
  public String getConnEstAuditMode() {
    return connEstAuditMode;
  }

  /**
   * This is the setter method to the attribute.
   * Deprecated in 22.1.1.
   * Enum options - LATENCY_AUDIT_OFF, LATENCY_AUDIT_ON, LATENCY_AUDIT_ON_WITH_SIG.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param connEstAuditMode set the connEstAuditMode.
   */
  @VsoMethod
  public void setConnEstAuditMode(String  connEstAuditMode) {
    this.connEstAuditMode = connEstAuditMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Deprecated in 22.1.1.
   * Field introduced in 21.1.1.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connEstThreshold
   */
  @VsoMethod
  public Integer getConnEstThreshold() {
    return connEstThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * Deprecated in 22.1.1.
   * Field introduced in 21.1.1.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param connEstThreshold set the connEstThreshold.
   */
  @VsoMethod
  public void setConnEstThreshold(Integer  connEstThreshold) {
    this.connEstThreshold = connEstThreshold;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Deprecated in 22.1.1.
   * Enum options - LATENCY_AUDIT_OFF, LATENCY_AUDIT_ON, LATENCY_AUDIT_ON_WITH_SIG.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return latencyAuditMode
   */
  @VsoMethod
  public String getLatencyAuditMode() {
    return latencyAuditMode;
  }

  /**
   * This is the setter method to the attribute.
   * Deprecated in 22.1.1.
   * Enum options - LATENCY_AUDIT_OFF, LATENCY_AUDIT_ON, LATENCY_AUDIT_ON_WITH_SIG.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param latencyAuditMode set the latencyAuditMode.
   */
  @VsoMethod
  public void setLatencyAuditMode(String  latencyAuditMode) {
    this.latencyAuditMode = latencyAuditMode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Deprecated in 22.1.1.
   * Field introduced in 21.1.1.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return latencyThreshold
   */
  @VsoMethod
  public Integer getLatencyThreshold() {
    return latencyThreshold;
  }

  /**
   * This is the setter method to the attribute.
   * Deprecated in 22.1.1.
   * Field introduced in 21.1.1.
   * Unit is milliseconds.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param latencyThreshold set the latencyThreshold.
   */
  @VsoMethod
  public void setLatencyThreshold(Integer  latencyThreshold) {
    this.latencyThreshold = latencyThreshold;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LatencyAuditProperties objLatencyAuditProperties = (LatencyAuditProperties) o;
  return   Objects.equals(this.latencyAuditMode, objLatencyAuditProperties.latencyAuditMode)&&
  Objects.equals(this.latencyThreshold, objLatencyAuditProperties.latencyThreshold)&&
  Objects.equals(this.connEstAuditMode, objLatencyAuditProperties.connEstAuditMode)&&
  Objects.equals(this.connEstThreshold, objLatencyAuditProperties.connEstThreshold);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LatencyAuditProperties {\n");
      sb.append("    connEstAuditMode: ").append(toIndentedString(connEstAuditMode)).append("\n");
        sb.append("    connEstThreshold: ").append(toIndentedString(connEstThreshold)).append("\n");
        sb.append("    latencyAuditMode: ").append(toIndentedString(latencyAuditMode)).append("\n");
        sb.append("    latencyThreshold: ").append(toIndentedString(latencyThreshold)).append("\n");
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

