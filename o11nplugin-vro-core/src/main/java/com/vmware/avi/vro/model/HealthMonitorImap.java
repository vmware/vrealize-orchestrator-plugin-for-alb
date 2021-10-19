package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HealthMonitorSSLAttributes;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HealthMonitorImap is a POJO class extends AviRestResource that used for creating
 * HealthMonitorImap.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HealthMonitorImap")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORIMAP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HealthMonitorImap extends AviRestResource {
    @JsonProperty("folder")
    @JsonInclude(Include.NON_NULL)
    private String folder = null;

    @JsonProperty("ssl_attributes")
    @JsonInclude(Include.NON_NULL)
    private HealthMonitorSSLAttributes sslAttributes = null;



  /**
   * This is the getter method this will return the attribute value.
   * Folder to access.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return folder
   */
  @VsoMethod
  public String getFolder() {
    return folder;
  }

  /**
   * This is the setter method to the attribute.
   * Folder to access.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param folder set the folder.
   */
  @VsoMethod
  public void setFolder(String  folder) {
    this.folder = folder;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ssl attributes for imaps monitor.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslAttributes
   */
  @VsoMethod
  public HealthMonitorSSLAttributes getSslAttributes() {
    return sslAttributes;
  }

  /**
   * This is the setter method to the attribute.
   * Ssl attributes for imaps monitor.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sslAttributes set the sslAttributes.
   */
  @VsoMethod
  public void setSslAttributes(HealthMonitorSSLAttributes sslAttributes) {
    this.sslAttributes = sslAttributes;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HealthMonitorImap objHealthMonitorImap = (HealthMonitorImap) o;
  return   Objects.equals(this.folder, objHealthMonitorImap.folder)&&
  Objects.equals(this.sslAttributes, objHealthMonitorImap.sslAttributes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HealthMonitorImap {\n");
      sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
        sb.append("    sslAttributes: ").append(toIndentedString(sslAttributes)).append("\n");
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

