package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.WafExclusionType;
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
 * WafExcludeListEntry
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafExcludeListEntry")
@VsoFinder(name = Constants.FINDER_VRO_WAFEXCLUDELISTENTRY, idAccessor = "getObjectID()")
@Service
public class WafExcludeListEntry extends AviRestResource  {
  @JsonProperty("client_subnet")
  private IpAddrPrefix clientSubnet = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("match_element")
  private String matchElement = null;

  @JsonProperty("match_element_criteria")
  private WafExclusionType matchElementCriteria = null;

  @JsonProperty("uri_match_criteria")
  private WafExclusionType uriMatchCriteria = null;

  @JsonProperty("uri_path")
  private String uriPath = null;

  
  /**
   * Client IP Subnet to exclude for WAF rules. Field introduced in 17.2.1.
   * @return clientSubnet
  **/
  @ApiModelProperty(value = "Client IP Subnet to exclude for WAF rules. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getClientSubnet() {
    return clientSubnet;
  }
    
  @VsoMethod
  public void setClientSubnet(IpAddrPrefix clientSubnet) {
    this.clientSubnet = clientSubnet;
  }

  
  /**
   * Free-text comment about this exclusion. Field introduced in 18.2.6.
   * @return description
  **/
  @ApiModelProperty(value = "Free-text comment about this exclusion. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The match_element can be 'ARGS xxx', 'ARGS_GET xxx', 'ARGS_POST xxx', 'ARGS_NAMES xxx', 'FILES xxx', 'QUERY_STRING', 'REQUEST_BASENAME', 'REQUEST_BODY', 'REQUEST_URI', 'REQUEST_URI_RAW', 'REQUEST_COOKIES xxx', 'REQUEST_HEADERS xxx' or 'RESPONSE_HEADERS xxx'. These match_elements in the HTTP Transaction (if present) will be excluded when executing WAF Rules. Field introduced in 17.2.1.
   * @return matchElement
  **/
  @ApiModelProperty(value = "The match_element can be 'ARGS xxx', 'ARGS_GET xxx', 'ARGS_POST xxx', 'ARGS_NAMES xxx', 'FILES xxx', 'QUERY_STRING', 'REQUEST_BASENAME', 'REQUEST_BODY', 'REQUEST_URI', 'REQUEST_URI_RAW', 'REQUEST_COOKIES xxx', 'REQUEST_HEADERS xxx' or 'RESPONSE_HEADERS xxx'. These match_elements in the HTTP Transaction (if present) will be excluded when executing WAF Rules. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getMatchElement() {
    return matchElement;
  }
    
  @VsoMethod
  public void setMatchElement(String matchElement) {
    this.matchElement = matchElement;
  }

  
  /**
   * Criteria for match_element matching. Field introduced in 18.2.2.
   * @return matchElementCriteria
  **/
  @ApiModelProperty(value = "Criteria for match_element matching. Field introduced in 18.2.2.")

  @Valid

 
  @VsoMethod  
  public WafExclusionType getMatchElementCriteria() {
    return matchElementCriteria;
  }
    
  @VsoMethod
  public void setMatchElementCriteria(WafExclusionType matchElementCriteria) {
    this.matchElementCriteria = matchElementCriteria;
  }

  
  /**
   * Criteria for URI matching. Field introduced in 17.2.8.
   * @return uriMatchCriteria
  **/
  @ApiModelProperty(value = "Criteria for URI matching. Field introduced in 17.2.8.")

  @Valid

 
  @VsoMethod  
  public WafExclusionType getUriMatchCriteria() {
    return uriMatchCriteria;
  }
    
  @VsoMethod
  public void setUriMatchCriteria(WafExclusionType uriMatchCriteria) {
    this.uriMatchCriteria = uriMatchCriteria;
  }

  
  /**
   * URI Path to exclude for WAF rules. Field introduced in 17.2.1.
   * @return uriPath
  **/
  @ApiModelProperty(value = "URI Path to exclude for WAF rules. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getUriPath() {
    return uriPath;
  }
    
  @VsoMethod
  public void setUriPath(String uriPath) {
    this.uriPath = uriPath;
  }

  
  public String getObjectID() {
		return "WafExcludeListEntry";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafExcludeListEntry wafExcludeListEntry = (WafExcludeListEntry) o;
    return Objects.equals(this.clientSubnet, wafExcludeListEntry.clientSubnet) &&
        Objects.equals(this.description, wafExcludeListEntry.description) &&
        Objects.equals(this.matchElement, wafExcludeListEntry.matchElement) &&
        Objects.equals(this.matchElementCriteria, wafExcludeListEntry.matchElementCriteria) &&
        Objects.equals(this.uriMatchCriteria, wafExcludeListEntry.uriMatchCriteria) &&
        Objects.equals(this.uriPath, wafExcludeListEntry.uriPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientSubnet, description, matchElement, matchElementCriteria, uriMatchCriteria, uriPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafExcludeListEntry {\n");
    
    sb.append("    clientSubnet: ").append(toIndentedString(clientSubnet)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    matchElement: ").append(toIndentedString(matchElement)).append("\n");
    sb.append("    matchElementCriteria: ").append(toIndentedString(matchElementCriteria)).append("\n");
    sb.append("    uriMatchCriteria: ").append(toIndentedString(uriMatchCriteria)).append("\n");
    sb.append("    uriPath: ").append(toIndentedString(uriPath)).append("\n");
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

