package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.WafExclusionType;
import com.vmware.avi.vro.model.WafExclusionType;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The WafExcludeListEntry is a POJO class extends AviRestResource that used for creating
 * WafExcludeListEntry.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafExcludeListEntry")
@VsoFinder(name = Constants.FINDER_VRO_WAFEXCLUDELISTENTRY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafExcludeListEntry extends AviRestResource {
    @JsonProperty("client_subnet")
    @JsonInclude(Include.NON_NULL)
    private IpAddrPrefix clientSubnet = null;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description = null;

    @JsonProperty("match_element")
    @JsonInclude(Include.NON_NULL)
    private String matchElement = null;

    @JsonProperty("match_element_criteria")
    @JsonInclude(Include.NON_NULL)
    private WafExclusionType matchElementCriteria = null;

    @JsonProperty("uri_match_criteria")
    @JsonInclude(Include.NON_NULL)
    private WafExclusionType uriMatchCriteria = null;

    @JsonProperty("uri_path")
    @JsonInclude(Include.NON_NULL)
    private String uriPath = null;



  /**
   * This is the getter method this will return the attribute value.
   * Client ip subnet to exclude for waf rules.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientSubnet
   */
  @VsoMethod
  public IpAddrPrefix getClientSubnet() {
    return clientSubnet;
  }

  /**
   * This is the setter method to the attribute.
   * Client ip subnet to exclude for waf rules.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientSubnet set the clientSubnet.
   */
  @VsoMethod
  public void setClientSubnet(IpAddrPrefix clientSubnet) {
    this.clientSubnet = clientSubnet;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Free-text comment about this exclusion.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Free-text comment about this exclusion.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The match_element can be 'args xxx', 'args_get xxx', 'args_post xxx', 'args_names xxx', 'files xxx', 'query_string', 'request_basename',
   * 'request_body', 'request_uri', 'request_uri_raw', 'request_cookies xxx', 'request_headers xxx', 'response_headers xxx' or xml xxx.
   * These match_elements in the http transaction (if present) will be excluded when executing waf rules.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchElement
   */
  @VsoMethod
  public String getMatchElement() {
    return matchElement;
  }

  /**
   * This is the setter method to the attribute.
   * The match_element can be 'args xxx', 'args_get xxx', 'args_post xxx', 'args_names xxx', 'files xxx', 'query_string', 'request_basename',
   * 'request_body', 'request_uri', 'request_uri_raw', 'request_cookies xxx', 'request_headers xxx', 'response_headers xxx' or xml xxx.
   * These match_elements in the http transaction (if present) will be excluded when executing waf rules.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchElement set the matchElement.
   */
  @VsoMethod
  public void setMatchElement(String  matchElement) {
    this.matchElement = matchElement;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Criteria for match_element matching.
   * Field introduced in 18.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchElementCriteria
   */
  @VsoMethod
  public WafExclusionType getMatchElementCriteria() {
    return matchElementCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Criteria for match_element matching.
   * Field introduced in 18.2.2.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchElementCriteria set the matchElementCriteria.
   */
  @VsoMethod
  public void setMatchElementCriteria(WafExclusionType matchElementCriteria) {
    this.matchElementCriteria = matchElementCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Criteria for uri matching.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uriMatchCriteria
   */
  @VsoMethod
  public WafExclusionType getUriMatchCriteria() {
    return uriMatchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Criteria for uri matching.
   * Field introduced in 17.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uriMatchCriteria set the uriMatchCriteria.
   */
  @VsoMethod
  public void setUriMatchCriteria(WafExclusionType uriMatchCriteria) {
    this.uriMatchCriteria = uriMatchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uri path to exclude for waf rules.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uriPath
   */
  @VsoMethod
  public String getUriPath() {
    return uriPath;
  }

  /**
   * This is the setter method to the attribute.
   * Uri path to exclude for waf rules.
   * Field introduced in 17.2.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uriPath set the uriPath.
   */
  @VsoMethod
  public void setUriPath(String  uriPath) {
    this.uriPath = uriPath;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WafExcludeListEntry objWafExcludeListEntry = (WafExcludeListEntry) o;
  return   Objects.equals(this.clientSubnet, objWafExcludeListEntry.clientSubnet)&&
  Objects.equals(this.uriPath, objWafExcludeListEntry.uriPath)&&
  Objects.equals(this.matchElement, objWafExcludeListEntry.matchElement)&&
  Objects.equals(this.uriMatchCriteria, objWafExcludeListEntry.uriMatchCriteria)&&
  Objects.equals(this.matchElementCriteria, objWafExcludeListEntry.matchElementCriteria)&&
  Objects.equals(this.description, objWafExcludeListEntry.description);
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

