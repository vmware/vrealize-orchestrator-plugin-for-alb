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
 * The HTTPPolicies is a POJO class extends AviRestResource that used for creating
 * HTTPPolicies.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HTTPPolicies")
@VsoFinder(name = Constants.FINDER_VRO_HTTPPOLICIES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HTTPPolicies extends AviRestResource {
    @JsonProperty("http_policy_set_ref")
    @JsonInclude(Include.NON_NULL)
    private String httpPolicySetRef = null;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index = null;



  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the virtual service http policy collection.
   * It is a reference to an object of type httppolicyset.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return httpPolicySetRef
   */
  @VsoMethod
  public String getHttpPolicySetRef() {
    return httpPolicySetRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the virtual service http policy collection.
   * It is a reference to an object of type httppolicyset.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param httpPolicySetRef set the httpPolicySetRef.
   */
  @VsoMethod
  public void setHttpPolicySetRef(String  httpPolicySetRef) {
    this.httpPolicySetRef = httpPolicySetRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Index of the virtual service http policy collection.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Index of the virtual service http policy collection.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HTTPPolicies objHTTPPolicies = (HTTPPolicies) o;
  return   Objects.equals(this.index, objHTTPPolicies.index)&&
  Objects.equals(this.httpPolicySetRef, objHTTPPolicies.httpPolicySetRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HTTPPolicies {\n");
      sb.append("    httpPolicySetRef: ").append(toIndentedString(httpPolicySetRef)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

