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
 * The UserAgentDBConfig is a POJO class extends AviRestResource that used for creating
 * UserAgentDBConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "UserAgentDBConfig")
@VsoFinder(name = Constants.FINDER_VRO_USERAGENTDBCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class UserAgentDBConfig extends AviRestResource {
    @JsonProperty("allowed_batch_size")
    @JsonInclude(Include.NON_NULL)
    private Integer allowedBatchSize = 500;



  /**
   * This is the getter method this will return the attribute value.
   * Batch query limit.
   * Allowed values are 1-500.
   * Field introduced in 21.1.1.
   * Allowed in basic(allowed values- 500) edition, essentials(allowed values- 500) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 500.
   * @return allowedBatchSize
   */
  @VsoMethod
  public Integer getAllowedBatchSize() {
    return allowedBatchSize;
  }

  /**
   * This is the setter method to the attribute.
   * Batch query limit.
   * Allowed values are 1-500.
   * Field introduced in 21.1.1.
   * Allowed in basic(allowed values- 500) edition, essentials(allowed values- 500) edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 500.
   * @param allowedBatchSize set the allowedBatchSize.
   */
  @VsoMethod
  public void setAllowedBatchSize(Integer  allowedBatchSize) {
    this.allowedBatchSize = allowedBatchSize;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  UserAgentDBConfig objUserAgentDBConfig = (UserAgentDBConfig) o;
  return   Objects.equals(this.allowedBatchSize, objUserAgentDBConfig.allowedBatchSize);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class UserAgentDBConfig {\n");
      sb.append("    allowedBatchSize: ").append(toIndentedString(allowedBatchSize)).append("\n");
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

