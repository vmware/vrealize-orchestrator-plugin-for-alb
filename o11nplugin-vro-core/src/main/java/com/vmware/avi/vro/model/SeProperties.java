package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SeAgentProperties;
import com.vmware.avi.vro.model.SeBootupProperties;
import com.vmware.avi.vro.model.SeRuntimeProperties;
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
 * SeProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SeProperties")
@VsoFinder(name = Constants.FINDER_VRO_SEPROPERTIES, idAccessor = "getObjectID()")
@Service
public class SeProperties extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("se_agent_properties")
  private SeAgentProperties seAgentProperties = null;

  @JsonProperty("se_bootup_properties")
  private SeBootupProperties seBootupProperties = null;

  @JsonProperty("se_runtime_properties")
  private SeRuntimeProperties seRuntimeProperties = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = "default";

  
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
   * Placeholder for description of property se_agent_properties of obj type SeProperties field type str  type object
   * @return seAgentProperties
  **/
  @ApiModelProperty(value = "Placeholder for description of property se_agent_properties of obj type SeProperties field type str  type object")

  @Valid

 
  @VsoMethod  
  public SeAgentProperties getSeAgentProperties() {
    return seAgentProperties;
  }
    
  @VsoMethod
  public void setSeAgentProperties(SeAgentProperties seAgentProperties) {
    this.seAgentProperties = seAgentProperties;
  }

  
  /**
   * Placeholder for description of property se_bootup_properties of obj type SeProperties field type str  type object
   * @return seBootupProperties
  **/
  @ApiModelProperty(value = "Placeholder for description of property se_bootup_properties of obj type SeProperties field type str  type object")

  @Valid

 
  @VsoMethod  
  public SeBootupProperties getSeBootupProperties() {
    return seBootupProperties;
  }
    
  @VsoMethod
  public void setSeBootupProperties(SeBootupProperties seBootupProperties) {
    this.seBootupProperties = seBootupProperties;
  }

  
  /**
   * Placeholder for description of property se_runtime_properties of obj type SeProperties field type str  type object
   * @return seRuntimeProperties
  **/
  @ApiModelProperty(value = "Placeholder for description of property se_runtime_properties of obj type SeProperties field type str  type object")

  @Valid

 
  @VsoMethod  
  public SeRuntimeProperties getSeRuntimeProperties() {
    return seRuntimeProperties;
  }
    
  @VsoMethod
  public void setSeRuntimeProperties(SeRuntimeProperties seRuntimeProperties) {
    this.seRuntimeProperties = seRuntimeProperties;
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
		return "SeProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeProperties seProperties = (SeProperties) o;
    return Objects.equals(this.lastModified, seProperties.lastModified) &&
        Objects.equals(this.seAgentProperties, seProperties.seAgentProperties) &&
        Objects.equals(this.seBootupProperties, seProperties.seBootupProperties) &&
        Objects.equals(this.seRuntimeProperties, seProperties.seRuntimeProperties) &&
        Objects.equals(this.url, seProperties.url) &&
        Objects.equals(this.uuid, seProperties.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, seAgentProperties, seBootupProperties, seRuntimeProperties, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeProperties {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    seAgentProperties: ").append(toIndentedString(seAgentProperties)).append("\n");
    sb.append("    seBootupProperties: ").append(toIndentedString(seBootupProperties)).append("\n");
    sb.append("    seRuntimeProperties: ").append(toIndentedString(seRuntimeProperties)).append("\n");
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

