package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The AutoTuneSendInterval is a POJO class extends AviRestResource that used for creating
 * AutoTuneSendInterval.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AutoTuneSendInterval")
@VsoFinder(name = Constants.FINDER_VRO_AUTOTUNESENDINTERVAL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AutoTuneSendInterval extends AviRestResource {
    @JsonProperty("auto_tune_send_interval_timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer autoTuneSendIntervalTimeout = 300;

    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled = true;



  /**
   * This is the getter method this will return the attribute value.
   * Time period to check if the send interval is valid.
   * Allowed values are 100-3600.
   * Field introduced in 30.2.5, 31.2.1.
   * Unit is sec.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return autoTuneSendIntervalTimeout
   */
  @VsoMethod
  public Integer getAutoTuneSendIntervalTimeout() {
    return autoTuneSendIntervalTimeout;
  }

  /**
   * This is the setter method to the attribute.
   * Time period to check if the send interval is valid.
   * Allowed values are 100-3600.
   * Field introduced in 30.2.5, 31.2.1.
   * Unit is sec.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param autoTuneSendIntervalTimeout set the autoTuneSendIntervalTimeout.
   */
  @VsoMethod
  public void setAutoTuneSendIntervalTimeout(Integer  autoTuneSendIntervalTimeout) {
    this.autoTuneSendIntervalTimeout = autoTuneSendIntervalTimeout;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Set the flag to enable auto tune send interval.
   * Field introduced in 30.2.5, 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Set the flag to enable auto tune send interval.
   * Field introduced in 30.2.5, 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AutoTuneSendInterval objAutoTuneSendInterval = (AutoTuneSendInterval) o;
  return   Objects.equals(this.enabled, objAutoTuneSendInterval.enabled)&&
  Objects.equals(this.autoTuneSendIntervalTimeout, objAutoTuneSendInterval.autoTuneSendIntervalTimeout);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AutoTuneSendInterval {\n");
      sb.append("    autoTuneSendIntervalTimeout: ").append(toIndentedString(autoTuneSendIntervalTimeout)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

