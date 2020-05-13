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
 * SecureChannelMapping
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SecureChannelMapping")
@VsoFinder(name = Constants.FINDER_VRO_SECURECHANNELMAPPING, idAccessor = "getObjectID()")
@Service
public class SecureChannelMapping extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("ip")
  private String ip = null;

  @JsonProperty("is_controller")
  private Boolean isController = null;

  @JsonProperty("local_ip")
  private String localIp = null;

  @JsonProperty("marked_for_delete")
  private Boolean markedForDelete = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("pub_key")
  private String pubKey = null;

  @JsonProperty("pub_key_pem")
  private String pubKeyPem = null;

  @JsonProperty("status")
  private String status = "SECURE_CHANNEL_NONE";

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * ip of SecureChannelMapping.
   * @return ip
  **/
  @ApiModelProperty(value = "ip of SecureChannelMapping.")


 
  @VsoMethod  
  public String getIp() {
    return ip;
  }
    
  @VsoMethod
  public void setIp(String ip) {
    this.ip = ip;
  }

  
  /**
   * Placeholder for description of property is_controller of obj type SecureChannelMapping field type str  type boolean
   * @return isController
  **/
  @ApiModelProperty(value = "Placeholder for description of property is_controller of obj type SecureChannelMapping field type str  type boolean")


 
  @VsoMethod  
  public Boolean isIsController() {
    return isController;
  }
    
  @VsoMethod
  public void setIsController(Boolean isController) {
    this.isController = isController;
  }

  
  /**
   * local_ip of SecureChannelMapping.
   * @return localIp
  **/
  @ApiModelProperty(value = "local_ip of SecureChannelMapping.")


 
  @VsoMethod  
  public String getLocalIp() {
    return localIp;
  }
    
  @VsoMethod
  public void setLocalIp(String localIp) {
    this.localIp = localIp;
  }

  
  /**
   * Placeholder for description of property marked_for_delete of obj type SecureChannelMapping field type str  type boolean
   * @return markedForDelete
  **/
  @ApiModelProperty(value = "Placeholder for description of property marked_for_delete of obj type SecureChannelMapping field type str  type boolean")


 
  @VsoMethod  
  public Boolean isMarkedForDelete() {
    return markedForDelete;
  }
    
  @VsoMethod
  public void setMarkedForDelete(Boolean markedForDelete) {
    this.markedForDelete = markedForDelete;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
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
   * pub_key of SecureChannelMapping.
   * @return pubKey
  **/
  @ApiModelProperty(value = "pub_key of SecureChannelMapping.")


 
  @VsoMethod  
  public String getPubKey() {
    return pubKey;
  }
    
  @VsoMethod
  public void setPubKey(String pubKey) {
    this.pubKey = pubKey;
  }

  
  /**
   * pub_key_pem of SecureChannelMapping.
   * @return pubKeyPem
  **/
  @ApiModelProperty(value = "pub_key_pem of SecureChannelMapping.")


 
  @VsoMethod  
  public String getPubKeyPem() {
    return pubKeyPem;
  }
    
  @VsoMethod
  public void setPubKeyPem(String pubKeyPem) {
    this.pubKeyPem = pubKeyPem;
  }

  
  /**
   *  Enum options - SECURE_CHANNEL_NONE, SECURE_CHANNEL_CONNECTED, SECURE_CHANNEL_AUTH_SSH_SUCCESS, SECURE_CHANNEL_AUTH_SSH_FAILED, SECURE_CHANNEL_AUTH_TOKEN_SUCCESS, SECURE_CHANNEL_AUTH_TOKEN_FAILED, SECURE_CHANNEL_AUTH_ERRORS, SECURE_CHANNEL_AUTH_IGNORED.
   * @return status
  **/
  @ApiModelProperty(value = " Enum options - SECURE_CHANNEL_NONE, SECURE_CHANNEL_CONNECTED, SECURE_CHANNEL_AUTH_SSH_SUCCESS, SECURE_CHANNEL_AUTH_SSH_FAILED, SECURE_CHANNEL_AUTH_TOKEN_SUCCESS, SECURE_CHANNEL_AUTH_TOKEN_FAILED, SECURE_CHANNEL_AUTH_ERRORS, SECURE_CHANNEL_AUTH_IGNORED.")


 
  @VsoMethod  
  public String getStatus() {
    return status;
  }
    
  @VsoMethod
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "SecureChannelMapping";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecureChannelMapping secureChannelMapping = (SecureChannelMapping) o;
    return Objects.equals(this.lastModified, secureChannelMapping.lastModified) &&
        Objects.equals(this.ip, secureChannelMapping.ip) &&
        Objects.equals(this.isController, secureChannelMapping.isController) &&
        Objects.equals(this.localIp, secureChannelMapping.localIp) &&
        Objects.equals(this.markedForDelete, secureChannelMapping.markedForDelete) &&
        Objects.equals(this.name, secureChannelMapping.name) &&
        Objects.equals(this.pubKey, secureChannelMapping.pubKey) &&
        Objects.equals(this.pubKeyPem, secureChannelMapping.pubKeyPem) &&
        Objects.equals(this.status, secureChannelMapping.status) &&
        Objects.equals(this.url, secureChannelMapping.url) &&
        Objects.equals(this.uuid, secureChannelMapping.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, ip, isController, localIp, markedForDelete, name, pubKey, pubKeyPem, status, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecureChannelMapping {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    isController: ").append(toIndentedString(isController)).append("\n");
    sb.append("    localIp: ").append(toIndentedString(localIp)).append("\n");
    sb.append("    markedForDelete: ").append(toIndentedString(markedForDelete)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pubKey: ").append(toIndentedString(pubKey)).append("\n");
    sb.append("    pubKeyPem: ").append(toIndentedString(pubKeyPem)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

