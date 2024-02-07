package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SeHmEventServerDetails;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SeHmEventPoolDetails is a POJO class extends AviRestResource that used for creating
 * SeHmEventPoolDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeHmEventPoolDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEHMEVENTPOOLDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeHmEventPoolDetails extends AviRestResource {
    @JsonProperty("ha_reason")
    @JsonInclude(Include.NON_NULL)
    private String haReason;

    @JsonProperty("percent_servers_up")
    @JsonInclude(Include.NON_NULL)
    private String percentServersUp;

    @JsonProperty("pool")
    @JsonInclude(Include.NON_NULL)
    private String pool;

    @JsonProperty("se_name")
    @JsonInclude(Include.NON_NULL)
    private String seName;

    @JsonProperty("server")
    @JsonInclude(Include.NON_NULL)
    private SeHmEventServerDetails server;

    @JsonProperty("src_uuid")
    @JsonInclude(Include.NON_NULL)
    private String srcUuid;

    @JsonProperty("virtual_service")
    @JsonInclude(Include.NON_NULL)
    private String virtualService;



  /**
   * This is the getter method this will return the attribute value.
   * Ha compromised reason.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return haReason
   */
  @VsoMethod
  public String getHaReason() {
    return haReason;
  }

  /**
   * This is the setter method to the attribute.
   * Ha compromised reason.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param haReason set the haReason.
   */
  @VsoMethod
  public void setHaReason(String  haReason) {
    this.haReason = haReason;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Percentage of servers up.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return percentServersUp
   */
  @VsoMethod
  public String getPercentServersUp() {
    return percentServersUp;
  }

  /**
   * This is the setter method to the attribute.
   * Percentage of servers up.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param percentServersUp set the percentServersUp.
   */
  @VsoMethod
  public void setPercentServersUp(String  percentServersUp) {
    this.percentServersUp = percentServersUp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pool name.
   * It is a reference to an object of type pool.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pool set the pool.
   */
  @VsoMethod
  public void setPool(String  pool) {
    this.pool = pool;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seName
   */
  @VsoMethod
  public String getSeName() {
    return seName;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seName set the seName.
   */
  @VsoMethod
  public void setSeName(String  seName) {
    this.seName = seName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Server details.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return server
   */
  @VsoMethod
  public SeHmEventServerDetails getServer() {
    return server;
  }

  /**
   * This is the setter method to the attribute.
   * Server details.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param server set the server.
   */
  @VsoMethod
  public void setServer(SeHmEventServerDetails server) {
    this.server = server;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the event generator.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return srcUuid
   */
  @VsoMethod
  public String getSrcUuid() {
    return srcUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the event generator.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
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
  SeHmEventPoolDetails objSeHmEventPoolDetails = (SeHmEventPoolDetails) o;
  return   Objects.equals(this.pool, objSeHmEventPoolDetails.pool)&&
  Objects.equals(this.server, objSeHmEventPoolDetails.server)&&
  Objects.equals(this.virtualService, objSeHmEventPoolDetails.virtualService)&&
  Objects.equals(this.seName, objSeHmEventPoolDetails.seName)&&
  Objects.equals(this.haReason, objSeHmEventPoolDetails.haReason)&&
  Objects.equals(this.percentServersUp, objSeHmEventPoolDetails.percentServersUp)&&
  Objects.equals(this.srcUuid, objSeHmEventPoolDetails.srcUuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeHmEventPoolDetails {\n");
      sb.append("    haReason: ").append(toIndentedString(haReason)).append("\n");
        sb.append("    percentServersUp: ").append(toIndentedString(percentServersUp)).append("\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
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

