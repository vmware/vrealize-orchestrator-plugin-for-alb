package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SeAgentProperties;
import com.vmware.avi.vro.model.SeBootupProperties;
import com.vmware.avi.vro.model.SeRuntimeProperties;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SeProperties is a POJO class extends AviRestResource that used for creating
 * SeProperties.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SeProperties")
@VsoFinder(name = Constants.FINDER_VRO_SEPROPERTIES, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SeProperties extends AviRestResource {
    @JsonProperty("se_agent_properties")
    @JsonInclude(Include.NON_NULL)
    private SeAgentProperties seAgentProperties = null;

    @JsonProperty("se_bootup_properties")
    @JsonInclude(Include.NON_NULL)
    private SeBootupProperties seBootupProperties = null;

    @JsonProperty("se_runtime_properties")
    @JsonInclude(Include.NON_NULL)
    private SeRuntimeProperties seRuntimeProperties = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = "default";



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seAgentProperties
   */
  @VsoMethod
  public SeAgentProperties getSeAgentProperties() {
    return seAgentProperties;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seAgentProperties set the seAgentProperties.
   */
  @VsoMethod
  public void setSeAgentProperties(SeAgentProperties seAgentProperties) {
    this.seAgentProperties = seAgentProperties;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seBootupProperties
   */
  @VsoMethod
  public SeBootupProperties getSeBootupProperties() {
    return seBootupProperties;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seBootupProperties set the seBootupProperties.
   */
  @VsoMethod
  public void setSeBootupProperties(SeBootupProperties seBootupProperties) {
    this.seBootupProperties = seBootupProperties;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seRuntimeProperties
   */
  @VsoMethod
  public SeRuntimeProperties getSeRuntimeProperties() {
    return seRuntimeProperties;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seRuntimeProperties set the seRuntimeProperties.
   */
  @VsoMethod
  public void setSeRuntimeProperties(SeRuntimeProperties seRuntimeProperties) {
    this.seRuntimeProperties = seRuntimeProperties;
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default".
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default".
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return "SeProperties" + "(" + uuid + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SeProperties objSeProperties = (SeProperties) o;
  return   Objects.equals(this.uuid, objSeProperties.uuid)&&
  Objects.equals(this.seBootupProperties, objSeProperties.seBootupProperties)&&
  Objects.equals(this.seRuntimeProperties, objSeProperties.seRuntimeProperties)&&
  Objects.equals(this.seAgentProperties, objSeProperties.seAgentProperties);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SeProperties {\n");
      sb.append("    seAgentProperties: ").append(toIndentedString(seAgentProperties)).append("\n");
        sb.append("    seBootupProperties: ").append(toIndentedString(seBootupProperties)).append("\n");
        sb.append("    seRuntimeProperties: ").append(toIndentedString(seRuntimeProperties)).append("\n");
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

