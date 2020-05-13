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
 * ALBServicesAccountUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ALBServicesAccountUser")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESACCOUNTUSER, idAccessor = "getObjectID()")
@Service
public class ALBServicesAccountUser extends AviRestResource  {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phone")
  private String phone = null;

  
  /**
   *  Field introduced in 20.1.1.
   * @return email
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getEmail() {
    return email;
  }
    
  @VsoMethod
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   *  Field introduced in 20.1.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   *  Field introduced in 20.1.1.
   * @return phone
  **/
  @ApiModelProperty(required = true, value = " Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getPhone() {
    return phone;
  }
    
  @VsoMethod
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public String getObjectID() {
		return "ALBServicesAccountUser";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ALBServicesAccountUser alBServicesAccountUser = (ALBServicesAccountUser) o;
    return Objects.equals(this.email, alBServicesAccountUser.email) &&
        Objects.equals(this.name, alBServicesAccountUser.name) &&
        Objects.equals(this.phone, alBServicesAccountUser.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ALBServicesAccountUser {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

