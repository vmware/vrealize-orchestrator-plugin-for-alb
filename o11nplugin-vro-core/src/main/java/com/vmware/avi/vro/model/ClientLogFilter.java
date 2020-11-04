package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.StringMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ClientLogFilter is a POJO class extends AviRestResource that used for creating
 * ClientLogFilter.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ClientLogFilter")
@VsoFinder(name = Constants.FINDER_VRO_CLIENTLOGFILTER)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ClientLogFilter extends AviRestResource {
    @JsonProperty("all_headers")
    @JsonInclude(Include.NON_NULL)
    private Boolean allHeaders = false;

    @JsonProperty("client_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch clientIp = null;

    @JsonProperty("duration")
    @JsonInclude(Include.NON_NULL)
    private Integer duration = 30;

    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled = false;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("uri")
    @JsonInclude(Include.NON_NULL)
    private StringMatch uri = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property all_headers of obj type clientlogfilter field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return allHeaders
   */
  @VsoMethod
  public Boolean getAllHeaders() {
    return allHeaders;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property all_headers of obj type clientlogfilter field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param allHeaders set the allHeaders.
   */
  @VsoMethod
  public void setAllHeaders(Boolean  allHeaders) {
    this.allHeaders = allHeaders;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property client_ip of obj type clientlogfilter field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIp
   */
  @VsoMethod
  public IpAddrMatch getClientIp() {
    return clientIp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property client_ip of obj type clientlogfilter field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIp set the clientIp.
   */
  @VsoMethod
  public void setClientIp(IpAddrMatch clientIp) {
    this.clientIp = clientIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Special values are 0 - 'infinite'.
   * Unit is min.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * Special values are 0 - 'infinite'.
   * Unit is min.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property enabled of obj type clientlogfilter field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property enabled of obj type clientlogfilter field type str  type boolean.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property index of obj type clientlogfilter field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property index of obj type clientlogfilter field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property uri of obj type clientlogfilter field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uri
   */
  @VsoMethod
  public StringMatch getUri() {
    return uri;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property uri of obj type clientlogfilter field type str  type ref.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uri set the uri.
   */
  @VsoMethod
  public void setUri(StringMatch uri) {
    this.uri = uri;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ClientLogFilter objClientLogFilter = (ClientLogFilter) o;
  return   Objects.equals(this.index, objClientLogFilter.index)&&
  Objects.equals(this.name, objClientLogFilter.name)&&
  Objects.equals(this.clientIp, objClientLogFilter.clientIp)&&
  Objects.equals(this.allHeaders, objClientLogFilter.allHeaders)&&
  Objects.equals(this.uri, objClientLogFilter.uri)&&
  Objects.equals(this.enabled, objClientLogFilter.enabled)&&
  Objects.equals(this.duration, objClientLogFilter.duration);
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

