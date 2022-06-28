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
 * The AppSignatureConfig is a POJO class extends AviRestResource that used for creating
 * AppSignatureConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AppSignatureConfig")
@VsoFinder(name = Constants.FINDER_VRO_APPSIGNATURECONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AppSignatureConfig extends AviRestResource {
    @JsonProperty("app_signature_sync_interval")
    @JsonInclude(Include.NON_NULL)
    private Integer appSignatureSyncInterval;



  /**
   * This is the getter method this will return the attribute value.
   * Application signature db sync interval in minutes.
   * Allowed values are 60-10080.
   * Field introduced in 20.1.4.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Special default for essentials edition is 1440, basic edition is 1440, enterprise is 1440.
   * @return appSignatureSyncInterval
   */
  @VsoMethod
  public Integer getAppSignatureSyncInterval() {
    return appSignatureSyncInterval;
  }

  /**
   * This is the setter method to the attribute.
   * Application signature db sync interval in minutes.
   * Allowed values are 60-10080.
   * Field introduced in 20.1.4.
   * Unit is min.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Special default for essentials edition is 1440, basic edition is 1440, enterprise is 1440.
   * @param appSignatureSyncInterval set the appSignatureSyncInterval.
   */
  @VsoMethod
  public void setAppSignatureSyncInterval(Integer  appSignatureSyncInterval) {
    this.appSignatureSyncInterval = appSignatureSyncInterval;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AppSignatureConfig objAppSignatureConfig = (AppSignatureConfig) o;
  return   Objects.equals(this.appSignatureSyncInterval, objAppSignatureConfig.appSignatureSyncInterval);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AppSignatureConfig {\n");
      sb.append("    appSignatureSyncInterval: ").append(toIndentedString(appSignatureSyncInterval)).append("\n");
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

