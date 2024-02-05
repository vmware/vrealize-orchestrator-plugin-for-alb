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
 * The HealthMonitorFtp is a POJO class extends AviRestResource that used for creating
 * HealthMonitorFtp.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HealthMonitorFtp")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORFTP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HealthMonitorFtp extends AviRestResource {
    @JsonProperty("filename")
    @JsonInclude(Include.NON_NULL)
    private String filename;

    @JsonProperty("mode")
    @JsonInclude(Include.NON_NULL)
    private String mode = "FTP_PASSIVE_MODE";

    @JsonProperty("ssl_attributes")
    @JsonInclude(Include.NON_NULL)
    private HealthMonitorSSLAttributes sslAttributes;



  /**
   * This is the getter method this will return the attribute value.
   * Filename to download with full path.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return filename
   */
  @VsoMethod
  public String getFilename() {
    return filename;
  }

  /**
   * This is the setter method to the attribute.
   * Filename to download with full path.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param filename set the filename.
   */
  @VsoMethod
  public void setFilename(String  filename) {
    this.filename = filename;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ftp data transfer process mode.
   * Enum options - FTP_PASSIVE_MODE, FTP_PORT_MODE.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "FTP_PASSIVE_MODE".
   * @return mode
   */
  @VsoMethod
  public String getMode() {
    return mode;
  }

  /**
   * This is the setter method to the attribute.
   * Ftp data transfer process mode.
   * Enum options - FTP_PASSIVE_MODE, FTP_PORT_MODE.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "FTP_PASSIVE_MODE".
   * @param mode set the mode.
   */
  @VsoMethod
  public void setMode(String  mode) {
    this.mode = mode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ssl attributes for ftps monitor.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslAttributes
   */
  @VsoMethod
  public HealthMonitorSSLAttributes getSslAttributes() {
    return sslAttributes;
  }

  /**
   * This is the setter method to the attribute.
   * Ssl attributes for ftps monitor.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
  HealthMonitorFtp objHealthMonitorFtp = (HealthMonitorFtp) o;
  return   Objects.equals(this.filename, objHealthMonitorFtp.filename)&&
  Objects.equals(this.mode, objHealthMonitorFtp.mode)&&
  Objects.equals(this.sslAttributes, objHealthMonitorFtp.sslAttributes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HealthMonitorFtp {\n");
      sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

