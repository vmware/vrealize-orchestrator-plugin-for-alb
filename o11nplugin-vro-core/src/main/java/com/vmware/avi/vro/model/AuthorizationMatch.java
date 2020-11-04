package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HostHdrMatch;
import com.vmware.avi.vro.model.MethodMatch;
import com.vmware.avi.vro.model.PathMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The AuthorizationMatch is a POJO class extends AviRestResource that used for creating
 * AuthorizationMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AuthorizationMatch")
@VsoFinder(name = Constants.FINDER_VRO_AUTHORIZATIONMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AuthorizationMatch extends AviRestResource {
    @JsonProperty("attr_matches")
    @JsonInclude(Include.NON_NULL)
    private List<AuthAttributeMatch> attrMatches = null;

    @JsonProperty("host_hdr")
    @JsonInclude(Include.NON_NULL)
    private HostHdrMatch hostHdr = null;

    @JsonProperty("method")
    @JsonInclude(Include.NON_NULL)
    private MethodMatch method = null;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private PathMatch path = null;



  /**
   * This is the getter method this will return the attribute value.
   * Attributes whose values need to be matched.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attrMatches
   */
  @VsoMethod
  public List<AuthAttributeMatch> getAttrMatches() {
    return attrMatches;
  }

  /**
   * This is the setter method. this will set the attrMatches
   * Attributes whose values need to be matched.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attrMatches
   */
  @VsoMethod
  public void setAttrMatches(List<AuthAttributeMatch>  attrMatches) {
    this.attrMatches = attrMatches;
  }

  /**
   * This is the setter method this will set the attrMatches
   * Attributes whose values need to be matched.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attrMatches
   */
  @VsoMethod
  public AuthorizationMatch addAttrMatchesItem(AuthAttributeMatch attrMatchesItem) {
    if (this.attrMatches == null) {
      this.attrMatches = new ArrayList<AuthAttributeMatch>();
    }
    this.attrMatches.add(attrMatchesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Host header value to be matched.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostHdr
   */
  @VsoMethod
  public HostHdrMatch getHostHdr() {
    return hostHdr;
  }

  /**
   * This is the setter method to the attribute.
   * Host header value to be matched.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostHdr set the hostHdr.
   */
  @VsoMethod
  public void setHostHdr(HostHdrMatch hostHdr) {
    this.hostHdr = hostHdr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Http methods to be matched.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return method
   */
  @VsoMethod
  public MethodMatch getMethod() {
    return method;
  }

  /**
   * This is the setter method to the attribute.
   * Http methods to be matched.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param method set the method.
   */
  @VsoMethod
  public void setMethod(MethodMatch method) {
    this.method = method;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Paths/urls to be matched.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return path
   */
  @VsoMethod
  public PathMatch getPath() {
    return path;
  }

  /**
   * This is the setter method to the attribute.
   * Paths/urls to be matched.
   * Field introduced in 18.2.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param path set the path.
   */
  @VsoMethod
  public void setPath(PathMatch path) {
    this.path = path;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AuthorizationMatch objAuthorizationMatch = (AuthorizationMatch) o;
  return   Objects.equals(this.attrMatches, objAuthorizationMatch.attrMatches)&&
  Objects.equals(this.path, objAuthorizationMatch.path)&&
  Objects.equals(this.hostHdr, objAuthorizationMatch.hostHdr)&&
  Objects.equals(this.method, objAuthorizationMatch.method);
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

