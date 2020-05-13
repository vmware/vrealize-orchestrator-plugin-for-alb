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
 * L4Policies
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "L4Policies")
@VsoFinder(name = Constants.FINDER_VRO_L4POLICIES, idAccessor = "getObjectID()")
@Service
public class L4Policies extends AviRestResource  {
  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("l4_policy_set_ref")
  private String l4PolicySetRef = null;

  
  /**
   * Index of the virtual service L4 policy set. Field introduced in 17.2.7.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Index of the virtual service L4 policy set. Field introduced in 17.2.7.")
  @NotNull


 
  @VsoMethod  
  public Integer getIndex() {
    return index;
  }
    
  @VsoMethod
  public void setIndex(Integer index) {
    this.index = index;
  }

  
  /**
   * ID of the virtual service L4 policy set. It is a reference to an object of type L4PolicySet. Field introduced in 17.2.7.
   * @return l4PolicySetRef
  **/
  @ApiModelProperty(required = true, value = "ID of the virtual service L4 policy set. It is a reference to an object of type L4PolicySet. Field introduced in 17.2.7.")
  @NotNull


 
  @VsoMethod  
  public String getL4PolicySetRef() {
    return l4PolicySetRef;
  }
    
  @VsoMethod
  public void setL4PolicySetRef(String l4PolicySetRef) {
    this.l4PolicySetRef = l4PolicySetRef;
  }

  
  public String getObjectID() {
		return "L4Policies";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L4Policies l4Policies = (L4Policies) o;
    return Objects.equals(this.index, l4Policies.index) &&
        Objects.equals(this.l4PolicySetRef, l4Policies.l4PolicySetRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, l4PolicySetRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L4Policies {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    l4PolicySetRef: ").append(toIndentedString(l4PolicySetRef)).append("\n");
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

