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
 * The ReservedConfiguration is a POJO class extends AviRestResource that used for creating
 * ReservedConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ReservedConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_RESERVEDCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ReservedConfiguration extends AviRestResource {
    @JsonProperty("key_value_configurations")
    @JsonInclude(Include.NON_NULL)
    private List<KeyValueConfiguration> keyValueConfigurations;



  /**
   * This is the getter method this will return the attribute value.
   * List of configurations for internal purposes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return keyValueConfigurations
   */
  @VsoMethod
  public List<KeyValueConfiguration> getKeyValueConfigurations() {
    return keyValueConfigurations;
  }

  /**
   * This is the setter method. this will set the keyValueConfigurations
   * List of configurations for internal purposes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return keyValueConfigurations
   */
  @VsoMethod
  public void setKeyValueConfigurations(List<KeyValueConfiguration>  keyValueConfigurations) {
    this.keyValueConfigurations = keyValueConfigurations;
  }

  /**
   * This is the setter method this will set the keyValueConfigurations
   * List of configurations for internal purposes.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return keyValueConfigurations
   */
  @VsoMethod
  public ReservedConfiguration addKeyValueConfigurationsItem(KeyValueConfiguration keyValueConfigurationsItem) {
    if (this.keyValueConfigurations == null) {
      this.keyValueConfigurations = new ArrayList<KeyValueConfiguration>();
    }
    this.keyValueConfigurations.add(keyValueConfigurationsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ReservedConfiguration objReservedConfiguration = (ReservedConfiguration) o;
  return   Objects.equals(this.keyValueConfigurations, objReservedConfiguration.keyValueConfigurations);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ReservedConfiguration {\n");
      sb.append("    keyValueConfigurations: ").append(toIndentedString(keyValueConfigurations)).append("\n");
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

