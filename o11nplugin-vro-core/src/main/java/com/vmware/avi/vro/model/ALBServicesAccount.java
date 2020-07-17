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
 * The ALBServicesAccount is a POJO class extends AviRestResource that used for creating
 * ALBServicesAccount.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ALBServicesAccount")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESACCOUNT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ALBServicesAccount extends AviRestResource {
  @JsonProperty("id")
  @JsonInclude(Include.NON_NULL)
  private String id = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("users")
  @JsonInclude(Include.NON_NULL)
  private List<ALBServicesAccountUser> users = null;



  /**
   * This is the getter method this will return the attribute value.
   * Id of an account in the customer portal.
   * Field introduced in 20.1.1.
   * @return id
   */
  @VsoMethod
  public String getId() {
    return id;
  }

  /**
   * This is the setter method to the attribute.
   * Id of an account in the customer portal.
   * Field introduced in 20.1.1.
   * @param id set the id.
   */
  @VsoMethod
  public void setId(String  id) {
    this.id = id;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Account to which the customer portal user belongs.
   * Field introduced in 20.1.1.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Account to which the customer portal user belongs.
   * Field introduced in 20.1.1.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Information about users within the account in the customer portal.
   * Field introduced in 20.1.1.
   * @return users
   */
  @VsoMethod
  public List<ALBServicesAccountUser> getUsers() {
    return users;
  }

  /**
   * This is the setter method. this will set the users
   * Information about users within the account in the customer portal.
   * Field introduced in 20.1.1.
   * @return users
   */
  @VsoMethod
  public void setUsers(List<ALBServicesAccountUser>  users) {
    this.users = users;
  }

  /**
   * This is the setter method this will set the users
   * Information about users within the account in the customer portal.
   * Field introduced in 20.1.1.
   * @return users
   */
  @VsoMethod
  public ALBServicesAccount addUsersItem(ALBServicesAccountUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<ALBServicesAccountUser>();
    }
    this.users.add(usersItem);
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
  ALBServicesAccount objALBServicesAccount = (ALBServicesAccount) o;
  return   Objects.equals(this.users, objALBServicesAccount.users)&&
  Objects.equals(this.name, objALBServicesAccount.name)&&
  Objects.equals(this.id, objALBServicesAccount.id);
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

