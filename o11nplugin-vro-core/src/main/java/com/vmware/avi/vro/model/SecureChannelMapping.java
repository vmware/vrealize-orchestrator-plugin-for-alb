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
 * The SecureChannelMapping is a POJO class extends AviRestResource that used for creating
 * SecureChannelMapping.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SecureChannelMapping")
@VsoFinder(name = Constants.FINDER_VRO_SECURECHANNELMAPPING, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SecureChannelMapping extends AviRestResource {
    @JsonProperty("auth_token")
    @JsonInclude(Include.NON_NULL)
    private String authToken;

    @JsonProperty("ip")
    @JsonInclude(Include.NON_NULL)
    private String ip;

    @JsonProperty("is_controller")
    @JsonInclude(Include.NON_NULL)
    private Boolean isController = false;

    @JsonProperty("local_ip")
    @JsonInclude(Include.NON_NULL)
    private String localIp;

    @JsonProperty("marked_for_delete")
    @JsonInclude(Include.NON_NULL)
    private Boolean markedForDelete = false;

    @JsonProperty("metadata")
    @JsonInclude(Include.NON_NULL)
    private List<SecureChannelMetadata> metadata;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("pub_key")
    @JsonInclude(Include.NON_NULL)
    private String pubKey;

    @JsonProperty("pub_key_pem")
    @JsonInclude(Include.NON_NULL)
    private String pubKeyPem;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status = "SECURE_CHANNEL_NONE";

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Auth_token used for se authorization.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return authToken
   */
  @VsoMethod
  public String getAuthToken() {
    return authToken;
  }

  /**
   * This is the setter method to the attribute.
   * Auth_token used for se authorization.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param authToken set the authToken.
   */
  @VsoMethod
  public void setAuthToken(String  authToken) {
    this.authToken = authToken;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip of se.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ip
   */
  @VsoMethod
  public String getIp() {
    return ip;
  }

  /**
   * This is the setter method to the attribute.
   * Ip of se.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ip set the ip.
   */
  @VsoMethod
  public void setIp(String  ip) {
    this.ip = ip;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Whether this entry used for controller.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return isController
   */
  @VsoMethod
  public Boolean getIsController() {
    return isController;
  }

  /**
   * This is the setter method to the attribute.
   * Whether this entry used for controller.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param isController set the isController.
   */
  @VsoMethod
  public void setIsController(Boolean  isController) {
    this.isController = isController;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Local ip on controller side reserved for se.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return localIp
   */
  @VsoMethod
  public String getLocalIp() {
    return localIp;
  }

  /**
   * This is the setter method to the attribute.
   * Local ip on controller side reserved for se.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param localIp set the localIp.
   */
  @VsoMethod
  public void setLocalIp(String  localIp) {
    this.localIp = localIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Whether this entry is marked for delete (first step of deletion).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return markedForDelete
   */
  @VsoMethod
  public Boolean getMarkedForDelete() {
    return markedForDelete;
  }

  /**
   * This is the setter method to the attribute.
   * Whether this entry is marked for delete (first step of deletion).
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param markedForDelete set the markedForDelete.
   */
  @VsoMethod
  public void setMarkedForDelete(Boolean  markedForDelete) {
    this.markedForDelete = markedForDelete;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Metadata associated with auth_token.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metadata
   */
  @VsoMethod
  public List<SecureChannelMetadata> getMetadata() {
    return metadata;
  }

  /**
   * This is the setter method. this will set the metadata
   * Metadata associated with auth_token.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metadata
   */
  @VsoMethod
  public void setMetadata(List<SecureChannelMetadata>  metadata) {
    this.metadata = metadata;
  }

  /**
   * This is the setter method this will set the metadata
   * Metadata associated with auth_token.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return metadata
   */
  @VsoMethod
  public SecureChannelMapping addMetadataItem(SecureChannelMetadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<SecureChannelMetadata>();
    }
    this.metadata.add(metadataItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Uuid of se.
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
   * Uuid of se.
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
   * Public key of se.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pubKey
   */
  @VsoMethod
  public String getPubKey() {
    return pubKey;
  }

  /**
   * This is the setter method to the attribute.
   * Public key of se.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pubKey set the pubKey.
   */
  @VsoMethod
  public void setPubKey(String  pubKey) {
    this.pubKey = pubKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Public key pem of se.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pubKeyPem
   */
  @VsoMethod
  public String getPubKeyPem() {
    return pubKeyPem;
  }

  /**
   * This is the setter method to the attribute.
   * Public key pem of se.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param pubKeyPem set the pubKeyPem.
   */
  @VsoMethod
  public void setPubKeyPem(String  pubKeyPem) {
    this.pubKeyPem = pubKeyPem;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Authorization status of current secure channel.
   * Enum options - SECURE_CHANNEL_NONE, SECURE_CHANNEL_CONNECTED, SECURE_CHANNEL_AUTH_SSH_SUCCESS, SECURE_CHANNEL_AUTH_SSH_FAILED,
   * SECURE_CHANNEL_AUTH_TOKEN_SUCCESS, SECURE_CHANNEL_AUTH_TOKEN_FAILED, SECURE_CHANNEL_AUTH_ERRORS, SECURE_CHANNEL_AUTH_IGNORED.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SECURE_CHANNEL_NONE".
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Authorization status of current secure channel.
   * Enum options - SECURE_CHANNEL_NONE, SECURE_CHANNEL_CONNECTED, SECURE_CHANNEL_AUTH_SSH_SUCCESS, SECURE_CHANNEL_AUTH_SSH_FAILED,
   * SECURE_CHANNEL_AUTH_TOKEN_SUCCESS, SECURE_CHANNEL_AUTH_TOKEN_FAILED, SECURE_CHANNEL_AUTH_ERRORS, SECURE_CHANNEL_AUTH_IGNORED.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SECURE_CHANNEL_NONE".
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of se.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of se.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SecureChannelMapping objSecureChannelMapping = (SecureChannelMapping) o;
  return   Objects.equals(this.uuid, objSecureChannelMapping.uuid)&&
  Objects.equals(this.name, objSecureChannelMapping.name)&&
  Objects.equals(this.localIp, objSecureChannelMapping.localIp)&&
  Objects.equals(this.ip, objSecureChannelMapping.ip)&&
  Objects.equals(this.status, objSecureChannelMapping.status)&&
  Objects.equals(this.markedForDelete, objSecureChannelMapping.markedForDelete)&&
  Objects.equals(this.isController, objSecureChannelMapping.isController)&&
  Objects.equals(this.pubKey, objSecureChannelMapping.pubKey)&&
  Objects.equals(this.pubKeyPem, objSecureChannelMapping.pubKeyPem)&&
  Objects.equals(this.metadata, objSecureChannelMapping.metadata)&&
  Objects.equals(this.authToken, objSecureChannelMapping.authToken);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SecureChannelMapping {\n");
      sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    isController: ").append(toIndentedString(isController)).append("\n");
        sb.append("    localIp: ").append(toIndentedString(localIp)).append("\n");
        sb.append("    markedForDelete: ").append(toIndentedString(markedForDelete)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pubKey: ").append(toIndentedString(pubKey)).append("\n");
        sb.append("    pubKeyPem: ").append(toIndentedString(pubKeyPem)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

