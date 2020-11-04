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
 * The WafPSMLocationMatch is a POJO class extends AviRestResource that used for creating
 * WafPSMLocationMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafPSMLocationMatch")
@VsoFinder(name = Constants.FINDER_VRO_WAFPSMLOCATIONMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafPSMLocationMatch extends AviRestResource {
    @JsonProperty("host")
    @JsonInclude(Include.NON_NULL)
    private HostHdrMatch host = null;

    @JsonProperty("methods")
    @JsonInclude(Include.NON_NULL)
    private MethodMatch methods = null;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private PathMatch path = null;



  /**
   * This is the getter method this will return the attribute value.
   * Apply the rules only to requests that match the specified host header.
   * If this is not set, the host header will not be checked.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return host
   */
  @VsoMethod
  public HostHdrMatch getHost() {
    return host;
  }

  /**
   * This is the setter method to the attribute.
   * Apply the rules only to requests that match the specified host header.
   * If this is not set, the host header will not be checked.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param host set the host.
   */
  @VsoMethod
  public void setHost(HostHdrMatch host) {
    this.host = host;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Apply the rules only to requests that have the specified methods.
   * If this is not set, the method will not be checked.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return methods
   */
  @VsoMethod
  public MethodMatch getMethods() {
    return methods;
  }

  /**
   * This is the setter method to the attribute.
   * Apply the rules only to requests that have the specified methods.
   * If this is not set, the method will not be checked.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param methods set the methods.
   */
  @VsoMethod
  public void setMethods(MethodMatch methods) {
    this.methods = methods;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Apply the rules only to requests that match the specified uri.
   * If this is not set, the path will not be checked.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return path
   */
  @VsoMethod
  public PathMatch getPath() {
    return path;
  }

  /**
   * This is the setter method to the attribute.
   * Apply the rules only to requests that match the specified uri.
   * If this is not set, the path will not be checked.
   * Field introduced in 18.2.3.
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
  WafPSMLocationMatch objWafPSMLocationMatch = (WafPSMLocationMatch) o;
  return   Objects.equals(this.methods, objWafPSMLocationMatch.methods)&&
  Objects.equals(this.path, objWafPSMLocationMatch.path)&&
  Objects.equals(this.host, objWafPSMLocationMatch.host);
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

