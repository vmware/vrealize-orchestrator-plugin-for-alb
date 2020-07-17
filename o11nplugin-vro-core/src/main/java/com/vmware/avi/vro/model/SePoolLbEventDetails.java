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
 * The SePoolLbEventDetails is a POJO class extends AviRestResource that used for creating
 * SePoolLbEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SePoolLbEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEPOOLLBEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SePoolLbEventDetails extends AviRestResource {
  @JsonProperty("failure_code")
  @JsonInclude(Include.NON_NULL)
  private String failureCode = null;

  @JsonProperty("pool")
  @JsonInclude(Include.NON_NULL)
  private String pool = null;

  @JsonProperty("reason")
  @JsonInclude(Include.NON_NULL)
  private String reason = null;

  @JsonProperty("src_uuid")
  @JsonInclude(Include.NON_NULL)
  private String srcUuid = null;

  @JsonProperty("virtual_service")
  @JsonInclude(Include.NON_NULL)
  private String virtualService = null;



  /**
   * This is the getter method this will return the attribute value.
   * Reason code for load balancing failure.
   * Enum options - PERSISTENT_SERVER_INVALID, PERSISTENT_SERVER_DOWN, SRVR_DOWN, ADD_PENDING, SLOW_START_MAX_CONN, MAX_CONN, NO_LPORT, SUSPECT_STATE,
   * MAX_CONN_RATE, CAPEST_RAND_MAX_CONN, GET_NEXT.
   * @return failureCode
   */
  @VsoMethod
  public String getFailureCode() {
    return failureCode;
  }

  /**
   * This is the setter method to the attribute.
   * Reason code for load balancing failure.
   * Enum options - PERSISTENT_SERVER_INVALID, PERSISTENT_SERVER_DOWN, SRVR_DOWN, ADD_PENDING, SLOW_START_MAX_CONN, MAX_CONN, NO_LPORT, SUSPECT_STATE,
   * MAX_CONN_RATE, CAPEST_RAND_MAX_CONN, GET_NEXT.
   * @param failureCode set the failureCode.
   */
  @VsoMethod
  public void setFailureCode(String  failureCode) {
    this.failureCode = failureCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pool name.
   * It is a reference to an object of type pool.
   * @return pool
   */
  @VsoMethod
  public String getPool() {
    return pool;
  }

  /**
   * This is the setter method to the attribute.
   * Pool name.
   * It is a reference to an object of type pool.
   * @param pool set the pool.
   */
  @VsoMethod
  public void setPool(String  pool) {
    this.pool = pool;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Reason for load balancing failure.
   * @return reason
   */
  @VsoMethod
  public String getReason() {
    return reason;
  }

  /**
   * This is the setter method to the attribute.
   * Reason for load balancing failure.
   * @param reason set the reason.
   */
  @VsoMethod
  public void setReason(String  reason) {
    this.reason = reason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of event generator.
   * @return srcUuid
   */
  @VsoMethod
  public String getSrcUuid() {
    return srcUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of event generator.
   * @param srcUuid set the srcUuid.
   */
  @VsoMethod
  public void setSrcUuid(String  srcUuid) {
    this.srcUuid = srcUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtual service name.
   * It is a reference to an object of type virtualservice.
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
  SePoolLbEventDetails objSePoolLbEventDetails = (SePoolLbEventDetails) o;
  return   Objects.equals(this.srcUuid, objSePoolLbEventDetails.srcUuid)&&
  Objects.equals(this.virtualService, objSePoolLbEventDetails.virtualService)&&
  Objects.equals(this.reason, objSePoolLbEventDetails.reason)&&
  Objects.equals(this.failureCode, objSePoolLbEventDetails.failureCode)&&
  Objects.equals(this.pool, objSePoolLbEventDetails.pool);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SePoolLbEventDetails {\n");
      sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    srcUuid: ").append(toIndentedString(srcUuid)).append("\n");
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

