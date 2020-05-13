package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.StringMatch;
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
 * ClientLogFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ClientLogFilter")
@VsoFinder(name = Constants.FINDER_VRO_CLIENTLOGFILTER, idAccessor = "getObjectID()")
@Service
public class ClientLogFilter extends AviRestResource  {
  @JsonProperty("all_headers")
  private Boolean allHeaders = null;

  @JsonProperty("client_ip")
  private IpAddrMatch clientIp = null;

  @JsonProperty("duration")
  private Integer duration = 30;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("uri")
  private StringMatch uri = null;

  
  /**
   * Placeholder for description of property all_headers of obj type ClientLogFilter field type str  type boolean
   * @return allHeaders
  **/
  @ApiModelProperty(value = "Placeholder for description of property all_headers of obj type ClientLogFilter field type str  type boolean")


 
  @VsoMethod  
  public Boolean isAllHeaders() {
    return allHeaders;
  }
    
  @VsoMethod
  public void setAllHeaders(Boolean allHeaders) {
    this.allHeaders = allHeaders;
  }

  
  /**
   * Placeholder for description of property client_ip of obj type ClientLogFilter field type str  type object
   * @return clientIp
  **/
  @ApiModelProperty(value = "Placeholder for description of property client_ip of obj type ClientLogFilter field type str  type object")

  @Valid

 
  @VsoMethod  
  public IpAddrMatch getClientIp() {
    return clientIp;
  }
    
  @VsoMethod
  public void setClientIp(IpAddrMatch clientIp) {
    this.clientIp = clientIp;
  }

  
  /**
   *  Special values are 0 - 'infinite'.
   * @return duration
  **/
  @ApiModelProperty(value = " Special values are 0 - 'infinite'.")


 
  @VsoMethod  
  public Integer getDuration() {
    return duration;
  }
    
  @VsoMethod
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * Placeholder for description of property enabled of obj type ClientLogFilter field type str  type boolean
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property enabled of obj type ClientLogFilter field type str  type boolean")
  @NotNull


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Number of index.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Number of index.")
  @NotNull


 
  @VsoMethod  
  public Integer getIndex() {
    return index;
  }
    
  @VsoMethod
  public void setIndex(Integer index) {
    this.index = index;
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
   * Placeholder for description of property uri of obj type ClientLogFilter field type str  type object
   * @return uri
  **/
  @ApiModelProperty(value = "Placeholder for description of property uri of obj type ClientLogFilter field type str  type object")

  @Valid

 
  @VsoMethod  
  public StringMatch getUri() {
    return uri;
  }
    
  @VsoMethod
  public void setUri(StringMatch uri) {
    this.uri = uri;
  }

  
  public String getObjectID() {
		return "ClientLogFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientLogFilter clientLogFilter = (ClientLogFilter) o;
    return Objects.equals(this.allHeaders, clientLogFilter.allHeaders) &&
        Objects.equals(this.clientIp, clientLogFilter.clientIp) &&
        Objects.equals(this.duration, clientLogFilter.duration) &&
        Objects.equals(this.enabled, clientLogFilter.enabled) &&
        Objects.equals(this.index, clientLogFilter.index) &&
        Objects.equals(this.name, clientLogFilter.name) &&
        Objects.equals(this.uri, clientLogFilter.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allHeaders, clientIp, duration, enabled, index, name, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientLogFilter {\n");
    
    sb.append("    allHeaders: ").append(toIndentedString(allHeaders)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

