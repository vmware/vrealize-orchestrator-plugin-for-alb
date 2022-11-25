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
 * The ALBServicesUser is a POJO class extends AviRestResource that used for creating
 * ALBServicesUser.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ALBServicesUser")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESUSER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ALBServicesUser extends AviRestResource {
    @JsonProperty("account_id")
    @JsonInclude(Include.NON_NULL)
    private String accountId = null;

    @JsonProperty("account_name")
    @JsonInclude(Include.NON_NULL)
    private String accountName = null;

    @JsonProperty("email")
    @JsonInclude(Include.NON_NULL)
    private String email = null;

    @JsonProperty("managed_accounts")
    @JsonInclude(Include.NON_NULL)
    private List<ALBServicesAccount> managedAccounts = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("phone")
    @JsonInclude(Include.NON_NULL)
    private String phone = null;



  /**
   * This is the getter method this will return the attribute value.
   * Id of primary account of the portal user.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return accountId
   */
  @VsoMethod
  public String getAccountId() {
    return accountId;
  }

  /**
   * This is the setter method to the attribute.
   * Id of primary account of the portal user.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param accountId set the accountId.
   */
  @VsoMethod
  public void setAccountId(String  accountId) {
    this.accountId = accountId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of primary account of the portal user.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return accountName
   */
  @VsoMethod
  public String getAccountName() {
    return accountName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of primary account of the portal user.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param accountName set the accountName.
   */
  @VsoMethod
  public void setAccountName(String  accountName) {
    this.accountName = accountName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Email id of the portal user.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return email
   */
  @VsoMethod
  public String getEmail() {
    return email;
  }

  /**
   * This is the setter method to the attribute.
   * Email id of the portal user.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param email set the email.
   */
  @VsoMethod
  public void setEmail(String  email) {
    this.email = email;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Information about all the accounts managed by user in the customer portal.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return managedAccounts
   */
  @VsoMethod
  public List<ALBServicesAccount> getManagedAccounts() {
    return managedAccounts;
  }

  /**
   * This is the setter method. this will set the managedAccounts
   * Information about all the accounts managed by user in the customer portal.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return managedAccounts
   */
  @VsoMethod
  public void setManagedAccounts(List<ALBServicesAccount>  managedAccounts) {
    this.managedAccounts = managedAccounts;
  }

  /**
   * This is the setter method this will set the managedAccounts
   * Information about all the accounts managed by user in the customer portal.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return managedAccounts
   */
  @VsoMethod
  public ALBServicesUser addManagedAccountsItem(ALBServicesAccount managedAccountsItem) {
    if (this.managedAccounts == null) {
      this.managedAccounts = new ArrayList<ALBServicesAccount>();
    }
    this.managedAccounts.add(managedAccountsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of the portal user.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the portal user.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Phone number of the user.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return phone
   */
  @VsoMethod
  public String getPhone() {
    return phone;
  }

  /**
   * This is the setter method to the attribute.
   * Phone number of the user.
   * Field introduced in 20.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param phone set the phone.
   */
  @VsoMethod
  public void setPhone(String  phone) {
    this.phone = phone;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ALBServicesUser objALBServicesUser = (ALBServicesUser) o;
  return   Objects.equals(this.name, objALBServicesUser.name)&&
  Objects.equals(this.email, objALBServicesUser.email)&&
  Objects.equals(this.accountName, objALBServicesUser.accountName)&&
  Objects.equals(this.accountId, objALBServicesUser.accountId)&&
  Objects.equals(this.managedAccounts, objALBServicesUser.managedAccounts)&&
  Objects.equals(this.phone, objALBServicesUser.phone);
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

