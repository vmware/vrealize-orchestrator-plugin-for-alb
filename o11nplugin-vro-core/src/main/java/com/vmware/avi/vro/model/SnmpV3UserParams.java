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
 * SnmpV3UserParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SnmpV3UserParams")
@VsoFinder(name = Constants.FINDER_VRO_SNMPV3USERPARAMS, idAccessor = "getObjectID()")
@Service
public class SnmpV3UserParams extends AviRestResource  {
  @JsonProperty("auth_passphrase")
  private String authPassphrase = "avinetworks";

  @JsonProperty("auth_type")
  private String authType = "SNMP_V3_AUTH_MD5";

  @JsonProperty("priv_passphrase")
  private String privPassphrase = "avinetworks";

  @JsonProperty("priv_type")
  private String privType = "SNMP_V3_PRIV_DES";

  @JsonProperty("username")
  private String username = null;

  
  /**
   * SNMP V3 authentication passphrase. Field introduced in 17.2.3.
   * @return authPassphrase
  **/
  @ApiModelProperty(value = "SNMP V3 authentication passphrase. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getAuthPassphrase() {
    return authPassphrase;
  }
    
  @VsoMethod
  public void setAuthPassphrase(String authPassphrase) {
    this.authPassphrase = authPassphrase;
  }

  
  /**
   * SNMP V3 user authentication type. Enum options - SNMP_V3_AUTH_MD5, SNMP_V3_AUTH_SHA. Field introduced in 17.2.3.
   * @return authType
  **/
  @ApiModelProperty(value = "SNMP V3 user authentication type. Enum options - SNMP_V3_AUTH_MD5, SNMP_V3_AUTH_SHA. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getAuthType() {
    return authType;
  }
    
  @VsoMethod
  public void setAuthType(String authType) {
    this.authType = authType;
  }

  
  /**
   * SNMP V3 privacy passphrase. Field introduced in 17.2.3.
   * @return privPassphrase
  **/
  @ApiModelProperty(value = "SNMP V3 privacy passphrase. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getPrivPassphrase() {
    return privPassphrase;
  }
    
  @VsoMethod
  public void setPrivPassphrase(String privPassphrase) {
    this.privPassphrase = privPassphrase;
  }

  
  /**
   * SNMP V3 privacy setting. Enum options - SNMP_V3_PRIV_DES, SNMP_V3_PRIV_AES. Field introduced in 17.2.3.
   * @return privType
  **/
  @ApiModelProperty(value = "SNMP V3 privacy setting. Enum options - SNMP_V3_PRIV_DES, SNMP_V3_PRIV_AES. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getPrivType() {
    return privType;
  }
    
  @VsoMethod
  public void setPrivType(String privType) {
    this.privType = privType;
  }

  
  /**
   * SNMP username to be used by SNMP clients for performing SNMP walk. Field introduced in 17.2.3.
   * @return username
  **/
  @ApiModelProperty(value = "SNMP username to be used by SNMP clients for performing SNMP walk. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getUsername() {
    return username;
  }
    
  @VsoMethod
  public void setUsername(String username) {
    this.username = username;
  }

  
  public String getObjectID() {
		return "SnmpV3UserParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnmpV3UserParams snmpV3UserParams = (SnmpV3UserParams) o;
    return Objects.equals(this.authPassphrase, snmpV3UserParams.authPassphrase) &&
        Objects.equals(this.authType, snmpV3UserParams.authType) &&
        Objects.equals(this.privPassphrase, snmpV3UserParams.privPassphrase) &&
        Objects.equals(this.privType, snmpV3UserParams.privType) &&
        Objects.equals(this.username, snmpV3UserParams.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authPassphrase, authType, privPassphrase, privType, username);
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

