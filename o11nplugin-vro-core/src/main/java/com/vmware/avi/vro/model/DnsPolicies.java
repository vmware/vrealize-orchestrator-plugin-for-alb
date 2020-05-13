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
 * DnsPolicies
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsPolicies")
@VsoFinder(name = Constants.FINDER_VRO_DNSPOLICIES, idAccessor = "getObjectID()")
@Service
public class DnsPolicies extends AviRestResource  {
  @JsonProperty("dns_policy_ref")
  private String dnsPolicyRef = null;

  @JsonProperty("index")
  private Integer index = null;

  
  /**
   * UUID of the dns policy. It is a reference to an object of type DnsPolicy. Field introduced in 17.1.1.
   * @return dnsPolicyRef
  **/
  @ApiModelProperty(required = true, value = "UUID of the dns policy. It is a reference to an object of type DnsPolicy. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getDnsPolicyRef() {
    return dnsPolicyRef;
  }
    
  @VsoMethod
  public void setDnsPolicyRef(String dnsPolicyRef) {
    this.dnsPolicyRef = dnsPolicyRef;
  }

  
  /**
   * Index of the dns policy. Field introduced in 17.1.1.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Index of the dns policy. Field introduced in 17.1.1.")
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
		return "DnsPolicies";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsPolicies dnsPolicies = (DnsPolicies) o;
    return Objects.equals(this.dnsPolicyRef, dnsPolicies.dnsPolicyRef) &&
        Objects.equals(this.index, dnsPolicies.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsPolicyRef, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsPolicies {\n");
    
    sb.append("    dnsPolicyRef: ").append(toIndentedString(dnsPolicyRef)).append("\n");
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

