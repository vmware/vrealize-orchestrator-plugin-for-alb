package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.ALBServicesAccountUser;
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
 * ALBServicesAccount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ALBServicesAccount")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESACCOUNT, idAccessor = "getObjectID()")
@Service
public class ALBServicesAccount extends AviRestResource  {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("users")
  @Valid
  private List<ALBServicesAccountUser> users = null;

  
  /**
   * ID of an Account in the customer portal. Field introduced in 20.1.1.
   * @return id
  **/
  @ApiModelProperty(value = "ID of an Account in the customer portal. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getId() {
    return id;
  }
    
  @VsoMethod
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Account to which the customer portal user belongs. Field introduced in 20.1.1.
   * @return name
  **/
  @ApiModelProperty(value = "Account to which the customer portal user belongs. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public ALBServicesAccount addUsersItem(ALBServicesAccountUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<ALBServicesAccountUser>();
    }
    this.users.add(usersItem);
    return this;
  }
  
  /**
   * Information about users within the account in the customer portal. Field introduced in 20.1.1.
   * @return users
  **/
  @ApiModelProperty(value = "Information about users within the account in the customer portal. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<ALBServicesAccountUser> getUsers() {
    return users;
  }
    
  @VsoMethod
  public void setUsers(List<ALBServicesAccountUser> users) {
    this.users = users;
  }

  
  public String getObjectID() {
		return "ALBServicesAccount";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ALBServicesAccount alBServicesAccount = (ALBServicesAccount) o;
    return Objects.equals(this.id, alBServicesAccount.id) &&
        Objects.equals(this.name, alBServicesAccount.name) &&
        Objects.equals(this.users, alBServicesAccount.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ALBServicesAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

