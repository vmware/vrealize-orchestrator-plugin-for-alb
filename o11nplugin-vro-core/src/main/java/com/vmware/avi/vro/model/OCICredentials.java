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
 * OCICredentials
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "OCICredentials")
@VsoFinder(name = Constants.FINDER_VRO_OCICREDENTIALS, idAccessor = "getObjectID()")
@Service
public class OCICredentials extends AviRestResource  {
  @JsonProperty("fingerprint")
  private String fingerprint = null;

  @JsonProperty("key_content")
  private String keyContent = null;

  @JsonProperty("pass_phrase")
  private String passPhrase = null;

  @JsonProperty("user")
  private String user = null;

  
  /**
   * API key with respect to the Public Key. Field introduced in 18.2.1,18.1.3.
   * @return fingerprint
  **/
  @ApiModelProperty(value = "API key with respect to the Public Key. Field introduced in 18.2.1,18.1.3.")


 
  @VsoMethod  
  public String getFingerprint() {
    return fingerprint;
  }
    
  @VsoMethod
  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  
  /**
   * Private Key file (pem file) content. Field introduced in 18.2.1,18.1.3.
   * @return keyContent
  **/
  @ApiModelProperty(value = "Private Key file (pem file) content. Field introduced in 18.2.1,18.1.3.")


 
  @VsoMethod  
  public String getKeyContent() {
    return keyContent;
  }
    
  @VsoMethod
  public void setKeyContent(String keyContent) {
    this.keyContent = keyContent;
  }

  
  /**
   * Pass phrase for the key. Field introduced in 18.2.1,18.1.3.
   * @return passPhrase
  **/
  @ApiModelProperty(value = "Pass phrase for the key. Field introduced in 18.2.1,18.1.3.")


 
  @VsoMethod  
  public String getPassPhrase() {
    return passPhrase;
  }
    
  @VsoMethod
  public void setPassPhrase(String passPhrase) {
    this.passPhrase = passPhrase;
  }

  
  /**
   * Oracle Cloud Id for the User. Field introduced in 18.2.1,18.1.3.
   * @return user
  **/
  @ApiModelProperty(value = "Oracle Cloud Id for the User. Field introduced in 18.2.1,18.1.3.")


 
  @VsoMethod  
  public String getUser() {
    return user;
  }
    
  @VsoMethod
  public void setUser(String user) {
    this.user = user;
  }

  
  public String getObjectID() {
		return "OCICredentials";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OCICredentials ocICredentials = (OCICredentials) o;
    return Objects.equals(this.fingerprint, ocICredentials.fingerprint) &&
        Objects.equals(this.keyContent, ocICredentials.keyContent) &&
        Objects.equals(this.passPhrase, ocICredentials.passPhrase) &&
        Objects.equals(this.user, ocICredentials.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fingerprint, keyContent, passPhrase, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OCICredentials {\n");
    
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    keyContent: ").append(toIndentedString(keyContent)).append("\n");
    sb.append("    passPhrase: ").append(toIndentedString(passPhrase)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

