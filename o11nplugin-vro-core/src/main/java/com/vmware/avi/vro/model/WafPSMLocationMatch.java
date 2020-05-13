package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HostHdrMatch;
import com.vmware.avi.vro.model.MethodMatch;
import com.vmware.avi.vro.model.PathMatch;
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
 * WafPSMLocationMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafPSMLocationMatch")
@VsoFinder(name = Constants.FINDER_VRO_WAFPSMLOCATIONMATCH, idAccessor = "getObjectID()")
@Service
public class WafPSMLocationMatch extends AviRestResource  {
  @JsonProperty("host")
  private HostHdrMatch host = null;

  @JsonProperty("methods")
  private MethodMatch methods = null;

  @JsonProperty("path")
  private PathMatch path = null;

  
  /**
   * Apply the rules only to requests that match the specified Host header. If this is not set, the host header will not be checked. Field introduced in 18.2.3.
   * @return host
  **/
  @ApiModelProperty(value = "Apply the rules only to requests that match the specified Host header. If this is not set, the host header will not be checked. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public HostHdrMatch getHost() {
    return host;
  }
    
  @VsoMethod
  public void setHost(HostHdrMatch host) {
    this.host = host;
  }

  
  /**
   * Apply the rules only to requests that have the specified methods. If this is not set, the method will not be checked. Field introduced in 18.2.3.
   * @return methods
  **/
  @ApiModelProperty(value = "Apply the rules only to requests that have the specified methods. If this is not set, the method will not be checked. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public MethodMatch getMethods() {
    return methods;
  }
    
  @VsoMethod
  public void setMethods(MethodMatch methods) {
    this.methods = methods;
  }

  
  /**
   * Apply the rules only to requests that match the specified URI. If this is not set, the path will not be checked. Field introduced in 18.2.3.
   * @return path
  **/
  @ApiModelProperty(value = "Apply the rules only to requests that match the specified URI. If this is not set, the path will not be checked. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public PathMatch getPath() {
    return path;
  }
    
  @VsoMethod
  public void setPath(PathMatch path) {
    this.path = path;
  }

  
  public String getObjectID() {
		return "WafPSMLocationMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafPSMLocationMatch wafPSMLocationMatch = (WafPSMLocationMatch) o;
    return Objects.equals(this.host, wafPSMLocationMatch.host) &&
        Objects.equals(this.methods, wafPSMLocationMatch.methods) &&
        Objects.equals(this.path, wafPSMLocationMatch.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, methods, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafPSMLocationMatch {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

