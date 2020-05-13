package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * SubJob
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SubJob")
@VsoFinder(name = Constants.FINDER_VRO_SUBJOB, idAccessor = "getObjectID()")
@Service
public class SubJob extends AviRestResource  {
  @JsonProperty("expires_at")
  private String expiresAt = null;

  @JsonProperty("metadata")
  private String metadata = null;

  @JsonProperty("type")
  private String type = null;

  
  /**
   *  Field introduced in 18.1.1.
   * @return expiresAt
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 18.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getExpiresAt() {
    return expiresAt;
  }
    
  @VsoMethod
  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  
  /**
   *  Field introduced in 18.1.1.
   * @return metadata
  **/
  @ApiModelProperty(value = " Field introduced in 18.1.1.")


 
  @VsoMethod  
  public String getMetadata() {
    return metadata;
  }
    
  @VsoMethod
  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  
  /**
   *  Enum options - JOB_TYPE_VS_FULL_LOGS, JOB_TYPE_VS_UDF, JOB_TYPE_VS_METRICS_RT, JOB_TYPE_SSL_CERT, JOB_TYPE_DEBUGVS_PKT_CAPTURE, JOB_TYPE_CONSISTENCY_CHECK, JOB_TYPE_TECHSUPPORT, JOB_TYPE_PKI_PROFILE, JOB_TYPE_NSP_RULE, JOB_TYPE_SEGROUP_METRICS_RT, JOB_TYPE_POSTGRES_STATUS, JOB_TYPE_VS_ROTATE_KEYS, JOB_TYPE_POOL_DNS, JOB_TYPE_GSLB_SERVICE, JOB_TYPE_APP_PERSISTENCE, JOB_TYPE_PROCESS_LOCKED_USER_ACCOUNTS, JOB_TYPE_SESSION, JOB_TYPE_AUTHTOKEN, JOB_TYPE_CLUSTER, JOB_TYPE_SE_SECURE_CHANNEL_CLEANUP. Field introduced in 18.1.1.
   * @return type
  **/
  @ApiModelProperty(required = true, value = " Enum options - JOB_TYPE_VS_FULL_LOGS, JOB_TYPE_VS_UDF, JOB_TYPE_VS_METRICS_RT, JOB_TYPE_SSL_CERT, JOB_TYPE_DEBUGVS_PKT_CAPTURE, JOB_TYPE_CONSISTENCY_CHECK, JOB_TYPE_TECHSUPPORT, JOB_TYPE_PKI_PROFILE, JOB_TYPE_NSP_RULE, JOB_TYPE_SEGROUP_METRICS_RT, JOB_TYPE_POSTGRES_STATUS, JOB_TYPE_VS_ROTATE_KEYS, JOB_TYPE_POOL_DNS, JOB_TYPE_GSLB_SERVICE, JOB_TYPE_APP_PERSISTENCE, JOB_TYPE_PROCESS_LOCKED_USER_ACCOUNTS, JOB_TYPE_SESSION, JOB_TYPE_AUTHTOKEN, JOB_TYPE_CLUSTER, JOB_TYPE_SE_SECURE_CHANNEL_CLEANUP. Field introduced in 18.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "SubJob";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubJob subJob = (SubJob) o;
    return Objects.equals(this.expiresAt, subJob.expiresAt) &&
        Objects.equals(this.metadata, subJob.metadata) &&
        Objects.equals(this.type, subJob.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, metadata, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubJob {\n");
    
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

