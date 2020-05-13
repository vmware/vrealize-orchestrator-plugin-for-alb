package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.ALBServicesAccount;
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
 * ALBServicesUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ALBServicesUser")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESUSER, idAccessor = "getObjectID()")
@Service
public class ALBServicesUser extends AviRestResource  {
  @JsonProperty("account_id")
  private String accountId = null;

  @JsonProperty("account_name")
  private String accountName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("managed_accounts")
  @Valid
  private List<ALBServicesAccount> managedAccounts = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phone")
  private String phone = null;

  
  /**
   * ID of primary account of the portal user. Field introduced in 20.1.1.
   * @return accountId
  **/
  @ApiModelProperty(value = "ID of primary account of the portal user. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getAccountId() {
    return accountId;
  }
    
  @VsoMethod
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  
  /**
   * Name of primary account of the portal user. Field introduced in 20.1.1.
   * @return accountName
  **/
  @ApiModelProperty(value = "Name of primary account of the portal user. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getAccountName() {
    return accountName;
  }
    
  @VsoMethod
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  
  /**
   * Email ID of the portal user. Field introduced in 20.1.1.
   * @return email
  **/
  @ApiModelProperty(required = true, value = "Email ID of the portal user. Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getEmail() {
    return email;
  }
    
  @VsoMethod
  public void setEmail(String email) {
    this.email = email;
  }

  
  public ALBServicesUser addManagedAccountsItem(ALBServicesAccount managedAccountsItem) {
    if (this.managedAccounts == null) {
      this.managedAccounts = new ArrayList<ALBServicesAccount>();
    }
    this.managedAccounts.add(managedAccountsItem);
    return this;
  }
  
  /**
   * Information about all the accounts managed by user in the customer portal. Field introduced in 20.1.1.
   * @return managedAccounts
  **/
  @ApiModelProperty(value = "Information about all the accounts managed by user in the customer portal. Field introduced in 20.1.1.")

  @Valid

 
  @VsoMethod  
  public List<ALBServicesAccount> getManagedAccounts() {
    return managedAccounts;
  }
    
  @VsoMethod
  public void setManagedAccounts(List<ALBServicesAccount> managedAccounts) {
    this.managedAccounts = managedAccounts;
  }

  
  /**
   * Name of the portal user. Field introduced in 20.1.1.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the portal user. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Phone number of the user. Field introduced in 20.1.1.
   * @return phone
  **/
  @ApiModelProperty(value = "Phone number of the user. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getPhone() {
    return phone;
  }
    
  @VsoMethod
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public String getObjectID() {
		return "ALBServicesUser";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ALBServicesUser alBServicesUser = (ALBServicesUser) o;
    return Objects.equals(this.accountId, alBServicesUser.accountId) &&
        Objects.equals(this.accountName, alBServicesUser.accountName) &&
        Objects.equals(this.email, alBServicesUser.email) &&
        Objects.equals(this.managedAccounts, alBServicesUser.managedAccounts) &&
        Objects.equals(this.name, alBServicesUser.name) &&
        Objects.equals(this.phone, alBServicesUser.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, email, managedAccounts, name, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ALBServicesUser {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    managedAccounts: ").append(toIndentedString(managedAccounts)).append("\n");
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

