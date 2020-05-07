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
 * HTTPPolicies
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "HTTPPolicies")
@VsoFinder(name = Constants.FINDER_VRO_HTTPPOLICIES, idAccessor = "getObjectID()")
@Service
public class HTTPPolicies extends AviRestResource  {
  @JsonProperty("http_policy_set_ref")
  private String httpPolicySetRef = null;

  @JsonProperty("index")
  private Integer index = null;

  
  /**
   * UUID of the virtual service HTTP policy collection. It is a reference to an object of type HTTPPolicySet.
   * @return httpPolicySetRef
  **/
  @ApiModelProperty(required = true, value = "UUID of the virtual service HTTP policy collection. It is a reference to an object of type HTTPPolicySet.")
  @NotNull


 
  @VsoMethod  
  public String getHttpPolicySetRef() {
    return httpPolicySetRef;
  }
    
  @VsoMethod
  public void setHttpPolicySetRef(String httpPolicySetRef) {
    this.httpPolicySetRef = httpPolicySetRef;
  }

  
  /**
   * Index of the virtual service HTTP policy collection.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Index of the virtual service HTTP policy collection.")
  @NotNull


 
  @VsoMethod  
  public Integer getIndex() {
    return index;
  }
    
  @VsoMethod
  public void setIndex(Integer index) {
    this.index = index;
  }

  
  public String getObjectID() {
		return "HTTPPolicies";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPPolicies htTPPolicies = (HTTPPolicies) o;
    return Objects.equals(this.httpPolicySetRef, htTPPolicies.httpPolicySetRef) &&
        Objects.equals(this.index, htTPPolicies.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpPolicySetRef, index);
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

