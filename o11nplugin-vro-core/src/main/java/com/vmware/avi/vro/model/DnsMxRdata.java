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
 * DnsMxRdata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsMxRdata")
@VsoFinder(name = Constants.FINDER_VRO_DNSMXRDATA, idAccessor = "getObjectID()")
@Service
public class DnsMxRdata extends AviRestResource  {
  @JsonProperty("host")
  private String host = null;

  @JsonProperty("priority")
  private Integer priority = null;

  
  /**
   * Fully qualified domain name of a mailserver . The host name maps directly to one or more address records in the DNS table, and must not point to any CNAME records (RFC 2181). Field introduced in 20.1.1.
   * @return host
  **/
  @ApiModelProperty(required = true, value = "Fully qualified domain name of a mailserver . The host name maps directly to one or more address records in the DNS table, and must not point to any CNAME records (RFC 2181). Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getHost() {
    return host;
  }
    
  @VsoMethod
  public void setHost(String host) {
    this.host = host;
  }

  
  /**
   * The priority field identifies which mail server should be preferred. Allowed values are 0-65535. Field introduced in 20.1.1.
   * @return priority
  **/
  @ApiModelProperty(required = true, value = "The priority field identifies which mail server should be preferred. Allowed values are 0-65535. Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public Integer getPriority() {
    return priority;
  }
    
  @VsoMethod
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  public String getObjectID() {
		return "DnsMxRdata";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsMxRdata dnsMxRdata = (DnsMxRdata) o;
    return Objects.equals(this.host, dnsMxRdata.host) &&
        Objects.equals(this.priority, dnsMxRdata.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsMxRdata {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

