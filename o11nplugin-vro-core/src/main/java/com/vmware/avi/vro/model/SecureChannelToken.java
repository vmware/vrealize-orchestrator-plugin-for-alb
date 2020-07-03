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
 * The SecureChannelToken is a POJO class extends AviRestResource that used for creating
 * SecureChannelToken.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SecureChannelToken")
@VsoFinder(name = Constants.FINDER_VRO_SECURECHANNELTOKEN, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SecureChannelToken extends AviRestResource {
  @JsonProperty("expiry_time")
  @JsonInclude(Include.NON_NULL)
  private Float expiryTime = null;

  @JsonProperty("metadata")
  @JsonInclude(Include.NON_NULL)
  private List<SecureChannelMetadata> metadata = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("node_uuid")
  @JsonInclude(Include.NON_NULL)
  private String nodeUuid = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Expiry time for secure channel.
   * @return expiryTime
   */
  @VsoMethod
  public Float getExpiryTime() {
    return expiryTime;
  }

  /**
   * This is the setter method to the attribute.
   * Expiry time for secure channel.
   * @param expiryTime set the expiryTime.
   */
  @VsoMethod
  public void setExpiryTime(Float  expiryTime) {
    this.expiryTime = expiryTime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property metadata of obj type securechanneltoken field type str  type array.
   * @return metadata
   */
  @VsoMethod
  public List<SecureChannelMetadata> getMetadata() {
    return metadata;
  }

  /**
   * This is the setter method. this will set the metadata
   * Placeholder for description of property metadata of obj type securechanneltoken field type str  type array.
   * @return metadata
   */
  @VsoMethod
  public void setMetadata(List<SecureChannelMetadata>  metadata) {
    this.metadata = metadata;
  }

  /**
   * This is the setter method this will set the metadata
   * Placeholder for description of property metadata of obj type securechanneltoken field type str  type array.
   * @return metadata
   */
  @VsoMethod
  public SecureChannelToken addMetadataItem(SecureChannelMetadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<SecureChannelMetadata>();
    }
    this.metadata.add(metadataItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique object identifier of node.
   * @return nodeUuid
   */
  @VsoMethod
  public String getNodeUuid() {
    return nodeUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of node.
   * @param nodeUuid set the nodeUuid.
   */
  @VsoMethod
  public void setNodeUuid(String  nodeUuid) {
    this.nodeUuid = nodeUuid;
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
   * Unique object identifier of the object.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
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
  SecureChannelToken objSecureChannelToken = (SecureChannelToken) o;
  return   Objects.equals(this.nodeUuid, objSecureChannelToken.nodeUuid)&&
  Objects.equals(this.expiryTime, objSecureChannelToken.expiryTime)&&
  Objects.equals(this.uuid, objSecureChannelToken.uuid)&&
  Objects.equals(this.name, objSecureChannelToken.name)&&
  Objects.equals(this.metadata, objSecureChannelToken.metadata);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SecureChannelToken {\n");
      sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeUuid: ").append(toIndentedString(nodeUuid)).append("\n");
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
