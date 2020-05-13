package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SecureChannelMetadata;
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
 * SecureChannelToken
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SecureChannelToken")
@VsoFinder(name = Constants.FINDER_VRO_SECURECHANNELTOKEN, idAccessor = "getObjectID()")
@Service
public class SecureChannelToken extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("expiry_time")
  private Double expiryTime = null;

  @JsonProperty("metadata")
  @Valid
  private List<SecureChannelMetadata> metadata = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("node_uuid")
  private String nodeUuid = null;

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
   * Expiry time for secure channel.
   * @return expiryTime
  **/
  @ApiModelProperty(value = "Expiry time for secure channel.")


 
  @VsoMethod  
  public Double getExpiryTime() {
    return expiryTime;
  }
    
  @VsoMethod
  public void setExpiryTime(Double expiryTime) {
    this.expiryTime = expiryTime;
  }

  
  public SecureChannelToken addMetadataItem(SecureChannelMetadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<SecureChannelMetadata>();
    }
    this.metadata.add(metadataItem);
    return this;
  }
  
  /**
   * Placeholder for description of property metadata of obj type SecureChannelToken field type str  type object
   * @return metadata
  **/
  @ApiModelProperty(value = "Placeholder for description of property metadata of obj type SecureChannelToken field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<SecureChannelMetadata> getMetadata() {
    return metadata;
  }
    
  @VsoMethod
  public void setMetadata(List<SecureChannelMetadata> metadata) {
    this.metadata = metadata;
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
   * Unique object identifier of node.
   * @return nodeUuid
  **/
  @ApiModelProperty(value = "Unique object identifier of node.")


 
  @VsoMethod  
  public String getNodeUuid() {
    return nodeUuid;
  }
    
  @VsoMethod
  public void setNodeUuid(String nodeUuid) {
    this.nodeUuid = nodeUuid;
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
		return "SecureChannelToken";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecureChannelToken secureChannelToken = (SecureChannelToken) o;
    return Objects.equals(this.lastModified, secureChannelToken.lastModified) &&
        Objects.equals(this.expiryTime, secureChannelToken.expiryTime) &&
        Objects.equals(this.metadata, secureChannelToken.metadata) &&
        Objects.equals(this.name, secureChannelToken.name) &&
        Objects.equals(this.nodeUuid, secureChannelToken.nodeUuid) &&
        Objects.equals(this.url, secureChannelToken.url) &&
        Objects.equals(this.uuid, secureChannelToken.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, expiryTime, metadata, name, nodeUuid, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecureChannelToken {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeUuid: ").append(toIndentedString(nodeUuid)).append("\n");
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

