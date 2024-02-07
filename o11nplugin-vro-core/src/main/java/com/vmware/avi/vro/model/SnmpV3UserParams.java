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
 * The SnmpV3UserParams is a POJO class extends AviRestResource that used for creating
 * SnmpV3UserParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SnmpV3UserParams")
@VsoFinder(name = Constants.FINDER_VRO_SNMPV3USERPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SnmpV3UserParams extends AviRestResource {
    @JsonProperty("auth_passphrase")
    @JsonInclude(Include.NON_NULL)
    private String authPassphrase = "avinetworks";

    @JsonProperty("auth_type")
    @JsonInclude(Include.NON_NULL)
    private String authType = "SNMP_V3_AUTH_MD5";

    @JsonProperty("priv_passphrase")
    @JsonInclude(Include.NON_NULL)
    private String privPassphrase = "avinetworks";

    @JsonProperty("priv_type")
    @JsonInclude(Include.NON_NULL)
    private String privType = "SNMP_V3_PRIV_DES";

    @JsonProperty("username")
    @JsonInclude(Include.NON_NULL)
    private String username;



  /**
   * This is the getter method this will return the attribute value.
   * Snmp v3 authentication passphrase.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "avinetworks".
   * @return authPassphrase
   */
  @VsoMethod
  public String getAuthPassphrase() {
    return authPassphrase;
  }

  /**
   * This is the setter method to the attribute.
   * Snmp v3 authentication passphrase.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "avinetworks".
   * @param authPassphrase set the authPassphrase.
   */
  @VsoMethod
  public void setAuthPassphrase(String  authPassphrase) {
    this.authPassphrase = authPassphrase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Snmp v3 user authentication type.
   * Enum options - SNMP_V3_AUTH_MD5, SNMP_V3_AUTH_SHA, SNMP_V3_AUTH_SHA_224, SNMP_V3_AUTH_SHA_256, SNMP_V3_AUTH_SHA_384, SNMP_V3_AUTH_SHA_512.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SNMP_V3_AUTH_MD5".
   * @return authType
   */
  @VsoMethod
  public String getAuthType() {
    return authType;
  }

  /**
   * This is the setter method to the attribute.
   * Snmp v3 user authentication type.
   * Enum options - SNMP_V3_AUTH_MD5, SNMP_V3_AUTH_SHA, SNMP_V3_AUTH_SHA_224, SNMP_V3_AUTH_SHA_256, SNMP_V3_AUTH_SHA_384, SNMP_V3_AUTH_SHA_512.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SNMP_V3_AUTH_MD5".
   * @param authType set the authType.
   */
  @VsoMethod
  public void setAuthType(String  authType) {
    this.authType = authType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Snmp v3 privacy passphrase.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "avinetworks".
   * @return privPassphrase
   */
  @VsoMethod
  public String getPrivPassphrase() {
    return privPassphrase;
  }

  /**
   * This is the setter method to the attribute.
   * Snmp v3 privacy passphrase.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "avinetworks".
   * @param privPassphrase set the privPassphrase.
   */
  @VsoMethod
  public void setPrivPassphrase(String  privPassphrase) {
    this.privPassphrase = privPassphrase;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Snmp v3 privacy setting.
   * Enum options - SNMP_V3_PRIV_DES, SNMP_V3_PRIV_AES.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SNMP_V3_PRIV_DES".
   * @return privType
   */
  @VsoMethod
  public String getPrivType() {
    return privType;
  }

  /**
   * This is the setter method to the attribute.
   * Snmp v3 privacy setting.
   * Enum options - SNMP_V3_PRIV_DES, SNMP_V3_PRIV_AES.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SNMP_V3_PRIV_DES".
   * @param privType set the privType.
   */
  @VsoMethod
  public void setPrivType(String  privType) {
    this.privType = privType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Snmp username to be used by snmp clients for performing snmp walk.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return username
   */
  @VsoMethod
  public String getUsername() {
    return username;
  }

  /**
   * This is the setter method to the attribute.
   * Snmp username to be used by snmp clients for performing snmp walk.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param username set the username.
   */
  @VsoMethod
  public void setUsername(String  username) {
    this.username = username;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SnmpV3UserParams objSnmpV3UserParams = (SnmpV3UserParams) o;
  return   Objects.equals(this.username, objSnmpV3UserParams.username)&&
  Objects.equals(this.authType, objSnmpV3UserParams.authType)&&
  Objects.equals(this.authPassphrase, objSnmpV3UserParams.authPassphrase)&&
  Objects.equals(this.privType, objSnmpV3UserParams.privType)&&
  Objects.equals(this.privPassphrase, objSnmpV3UserParams.privPassphrase);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SnmpV3UserParams {\n");
      sb.append("    authPassphrase: ").append(toIndentedString(authPassphrase)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    privPassphrase: ").append(toIndentedString(privPassphrase)).append("\n");
        sb.append("    privType: ").append(toIndentedString(privType)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

