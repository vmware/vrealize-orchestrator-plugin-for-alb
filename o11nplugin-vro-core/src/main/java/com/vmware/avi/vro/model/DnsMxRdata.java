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
 * The DnsMxRdata is a POJO class extends AviRestResource that used for creating
 * DnsMxRdata.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsMxRdata")
@VsoFinder(name = Constants.FINDER_VRO_DNSMXRDATA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsMxRdata extends AviRestResource {
    @JsonProperty("host")
    @JsonInclude(Include.NON_NULL)
    private String host = null;

    @JsonProperty("priority")
    @JsonInclude(Include.NON_NULL)
    private Integer priority = null;



  /**
   * This is the getter method this will return the attribute value.
   * Fully qualified domain name of a mailserver.
   * The host name maps directly to one or more address records in the dns table, and must not point to any cname records (rfc 2181).
   * Field introduced in 18.2.9, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return host
   */
  @VsoMethod
  public String getHost() {
    return host;
  }

  /**
   * This is the setter method to the attribute.
   * Fully qualified domain name of a mailserver.
   * The host name maps directly to one or more address records in the dns table, and must not point to any cname records (rfc 2181).
   * Field introduced in 18.2.9, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param host set the host.
   */
  @VsoMethod
  public void setHost(String  host) {
    this.host = host;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The priority field identifies which mail server should be preferred.
   * Allowed values are 0-65535.
   * Field introduced in 18.2.9, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return priority
   */
  @VsoMethod
  public Integer getPriority() {
    return priority;
  }

  /**
   * This is the setter method to the attribute.
   * The priority field identifies which mail server should be preferred.
   * Allowed values are 0-65535.
   * Field introduced in 18.2.9, 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param priority set the priority.
   */
  @VsoMethod
  public void setPriority(Integer  priority) {
    this.priority = priority;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsMxRdata objDnsMxRdata = (DnsMxRdata) o;
  return   Objects.equals(this.priority, objDnsMxRdata.priority)&&
  Objects.equals(this.host, objDnsMxRdata.host);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DnsMxRdata {\n");
      sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

