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
 * The MethodMatch is a POJO class extends AviRestResource that used for creating
 * MethodMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "MethodMatch")
@VsoFinder(name = Constants.FINDER_VRO_METHODMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class MethodMatch extends AviRestResource {
    @JsonProperty("match_criteria")
    @JsonInclude(Include.NON_NULL)
    private String matchCriteria = null;

    @JsonProperty("methods")
    @JsonInclude(Include.NON_NULL)
    private List<String> methods = null;



  /**
   * This is the getter method this will return the attribute value.
   * Criterion to use for http method matching the method in the http request.
   * Enum options - IS_IN, IS_NOT_IN.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchCriteria
   */
  @VsoMethod
  public String getMatchCriteria() {
    return matchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Criterion to use for http method matching the method in the http request.
   * Enum options - IS_IN, IS_NOT_IN.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchCriteria set the matchCriteria.
   */
  @VsoMethod
  public void setMatchCriteria(String  matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure http method(s).
   * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
   * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
   * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
   * Minimum of 1 items required.
   * Maximum of 16 items allowed.
   * Allowed in basic(allowed values- http_method_get,http_method_put,http_method_post,http_method_head,http_method_options) edition,
   * essentials(allowed values- http_method_get,http_method_put,http_method_post,http_method_head,http_method_options) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return methods
   */
  @VsoMethod
  public List<String> getMethods() {
    return methods;
  }

  /**
   * This is the setter method. this will set the methods
   * Configure http method(s).
   * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
   * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
   * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
   * Minimum of 1 items required.
   * Maximum of 16 items allowed.
   * Allowed in basic(allowed values- http_method_get,http_method_put,http_method_post,http_method_head,http_method_options) edition,
   * essentials(allowed values- http_method_get,http_method_put,http_method_post,http_method_head,http_method_options) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return methods
   */
  @VsoMethod
  public void setMethods(List<String>  methods) {
    this.methods = methods;
  }

  /**
   * This is the setter method this will set the methods
   * Configure http method(s).
   * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
   * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
   * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
   * Minimum of 1 items required.
   * Maximum of 16 items allowed.
   * Allowed in basic(allowed values- http_method_get,http_method_put,http_method_post,http_method_head,http_method_options) edition,
   * essentials(allowed values- http_method_get,http_method_put,http_method_post,http_method_head,http_method_options) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return methods
   */
  @VsoMethod
  public MethodMatch addMethodsItem(String methodsItem) {
    if (this.methods == null) {
      this.methods = new ArrayList<String>();
    }
    this.methods.add(methodsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  MethodMatch objMethodMatch = (MethodMatch) o;
  return   Objects.equals(this.matchCriteria, objMethodMatch.matchCriteria)&&
  Objects.equals(this.methods, objMethodMatch.methods);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class MethodMatch {\n");
      sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
        sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
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

