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
 * The BotConfigUserAgent is a POJO class extends AviRestResource that used for creating
 * BotConfigUserAgent.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BotConfigUserAgent")
@VsoFinder(name = Constants.FINDER_VRO_BOTCONFIGUSERAGENT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BotConfigUserAgent extends AviRestResource {
    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled = true;

    @JsonProperty("use_tls_fingerprint")
    @JsonInclude(Include.NON_NULL)
    private Boolean useTlsFingerprint = true;



  /**
   * This is the getter method this will return the attribute value.
   * Whether user agent-based bot detection is enabled.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Whether user agent-based bot detection is enabled.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Whether to match the tls fingerprint observed on the request against tls fingerprints expected for the user agent.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return useTlsFingerprint
   */
  @VsoMethod
  public Boolean getUseTlsFingerprint() {
    return useTlsFingerprint;
  }

  /**
   * This is the setter method to the attribute.
   * Whether to match the tls fingerprint observed on the request against tls fingerprints expected for the user agent.
   * Field introduced in 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param useTlsFingerprint set the useTlsFingerprint.
   */
  @VsoMethod
  public void setUseTlsFingerprint(Boolean  useTlsFingerprint) {
    this.useTlsFingerprint = useTlsFingerprint;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  BotConfigUserAgent objBotConfigUserAgent = (BotConfigUserAgent) o;
  return   Objects.equals(this.enabled, objBotConfigUserAgent.enabled)&&
  Objects.equals(this.useTlsFingerprint, objBotConfigUserAgent.useTlsFingerprint);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BotConfigUserAgent {\n");
      sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    useTlsFingerprint: ").append(toIndentedString(useTlsFingerprint)).append("\n");
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

