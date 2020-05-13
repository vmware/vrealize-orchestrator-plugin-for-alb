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
 * ProtocolParser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ProtocolParser")
@VsoFinder(name = Constants.FINDER_VRO_PROTOCOLPARSER, idAccessor = "getObjectID()")
@Service
public class ProtocolParser extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parser_code")
  private String parserCode = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

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
   * Description of the protocol parser. Field introduced in 18.2.3.
   * @return description
  **/
  @ApiModelProperty(value = "Description of the protocol parser. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Name of the protocol parser. Field introduced in 18.2.3.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the protocol parser. Field introduced in 18.2.3.")
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
   * Command script provided inline. Field introduced in 18.2.3.
   * @return parserCode
  **/
  @ApiModelProperty(required = true, value = "Command script provided inline. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getParserCode() {
    return parserCode;
  }
    
  @VsoMethod
  public void setParserCode(String parserCode) {
    this.parserCode = parserCode;
  }

  
  /**
   * Tenant UUID of the protocol parser. It is a reference to an object of type Tenant. Field introduced in 18.2.3.
   * @return tenantRef
  **/
  @ApiModelProperty(value = "Tenant UUID of the protocol parser. It is a reference to an object of type Tenant. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
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
   * UUID of the protocol parser. Field introduced in 18.2.3.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the protocol parser. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "ProtocolParser";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtocolParser protocolParser = (ProtocolParser) o;
    return Objects.equals(this.lastModified, protocolParser.lastModified) &&
        Objects.equals(this.description, protocolParser.description) &&
        Objects.equals(this.name, protocolParser.name) &&
        Objects.equals(this.parserCode, protocolParser.parserCode) &&
        Objects.equals(this.tenantRef, protocolParser.tenantRef) &&
        Objects.equals(this.url, protocolParser.url) &&
        Objects.equals(this.uuid, protocolParser.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, description, name, parserCode, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtocolParser {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parserCode: ").append(toIndentedString(parserCode)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

