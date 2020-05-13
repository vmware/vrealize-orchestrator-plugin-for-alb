package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AuthAttributeMatch;
import com.vmware.avi.vro.model.HostHdrMatch;
import com.vmware.avi.vro.model.MethodMatch;
import com.vmware.avi.vro.model.PathMatch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * AuthorizationMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AuthorizationMatch")
@VsoFinder(name = Constants.FINDER_VRO_AUTHORIZATIONMATCH, idAccessor = "getObjectID()")
@Service
public class AuthorizationMatch extends AviRestResource  {
  @JsonProperty("attr_matches")
  @Valid
  private List<AuthAttributeMatch> attrMatches = null;

  @JsonProperty("host_hdr")
  private HostHdrMatch hostHdr = null;

  @JsonProperty("method")
  private MethodMatch method = null;

  @JsonProperty("path")
  private PathMatch path = null;

  
  public AuthorizationMatch addAttrMatchesItem(AuthAttributeMatch attrMatchesItem) {
    if (this.attrMatches == null) {
      this.attrMatches = new ArrayList<AuthAttributeMatch>();
    }
    this.attrMatches.add(attrMatchesItem);
    return this;
  }
  
  /**
   * Attributes whose values need to be matched . Field introduced in 18.2.5.
   * @return attrMatches
  **/
  @ApiModelProperty(value = "Attributes whose values need to be matched . Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public List<AuthAttributeMatch> getAttrMatches() {
    return attrMatches;
  }
    
  @VsoMethod
  public void setAttrMatches(List<AuthAttributeMatch> attrMatches) {
    this.attrMatches = attrMatches;
  }

  
  /**
   * Host header value to be matched. Field introduced in 18.2.5.
   * @return hostHdr
  **/
  @ApiModelProperty(value = "Host header value to be matched. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public HostHdrMatch getHostHdr() {
    return hostHdr;
  }
    
  @VsoMethod
  public void setHostHdr(HostHdrMatch hostHdr) {
    this.hostHdr = hostHdr;
  }

  
  /**
   * HTTP methods to be matched. Field introduced in 18.2.5.
   * @return method
  **/
  @ApiModelProperty(value = "HTTP methods to be matched. Field introduced in 18.2.5.")

  @Valid

 
  @VsoMethod  
  public MethodMatch getMethod() {
    return method;
  }
    
  @VsoMethod
  public void setMethod(MethodMatch method) {
    this.method = method;
  }

  
  /**
   * Paths/URLs to be matched. Field introduced in 18.2.5.
   * @return path
  **/
  @ApiModelProperty(value = "Paths/URLs to be matched. Field introduced in 18.2.5.")

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
		return "AuthorizationMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationMatch authorizationMatch = (AuthorizationMatch) o;
    return Objects.equals(this.attrMatches, authorizationMatch.attrMatches) &&
        Objects.equals(this.hostHdr, authorizationMatch.hostHdr) &&
        Objects.equals(this.method, authorizationMatch.method) &&
        Objects.equals(this.path, authorizationMatch.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrMatches, hostHdr, method, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationMatch {\n");
    
    sb.append("    attrMatches: ").append(toIndentedString(attrMatches)).append("\n");
    sb.append("    hostHdr: ").append(toIndentedString(hostHdr)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

