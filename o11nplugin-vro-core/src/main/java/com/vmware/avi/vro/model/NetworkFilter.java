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
 * NetworkFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NetworkFilter")
@VsoFinder(name = Constants.FINDER_VRO_NETWORKFILTER, idAccessor = "getObjectID()")
@Service
public class NetworkFilter extends AviRestResource  {
  @JsonProperty("network_ref")
  private String networkRef = null;

  @JsonProperty("server_filter")
  private String serverFilter = null;

  
  /**
   *  It is a reference to an object of type VIMgrNWRuntime.
   * @return networkRef
  **/
  @ApiModelProperty(required = true, value = " It is a reference to an object of type VIMgrNWRuntime.")
  @NotNull


 
  @VsoMethod  
  public String getNetworkRef() {
    return networkRef;
  }
    
  @VsoMethod
  public void setNetworkRef(String networkRef) {
    this.networkRef = networkRef;
  }

  
  /**
   * server_filter of NetworkFilter.
   * @return serverFilter
  **/
  @ApiModelProperty(value = "server_filter of NetworkFilter.")


 
  @VsoMethod  
  public String getServerFilter() {
    return serverFilter;
  }
    
  @VsoMethod
  public void setServerFilter(String serverFilter) {
    this.serverFilter = serverFilter;
  }

  
  public String getObjectID() {
		return "NetworkFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkFilter networkFilter = (NetworkFilter) o;
    return Objects.equals(this.networkRef, networkFilter.networkRef) &&
        Objects.equals(this.serverFilter, networkFilter.serverFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkRef, serverFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkFilter {\n");
    
    sb.append("    networkRef: ").append(toIndentedString(networkRef)).append("\n");
    sb.append("    serverFilter: ").append(toIndentedString(serverFilter)).append("\n");
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

