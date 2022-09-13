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
 * The VHMatch is a POJO class extends AviRestResource that used for creating
 * VHMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VHMatch")
@VsoFinder(name = Constants.FINDER_VRO_VHMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VHMatch extends AviRestResource {
    @JsonProperty("host")
    @JsonInclude(Include.NON_NULL)
    private String host = null;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private List<PathMatch> path = null;



  /**
   * This is the getter method this will return the attribute value.
   * Host/domain name match configuration.
   * Must be configured along with at least one path match criteria.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return host
   */
  @VsoMethod
  public String getHost() {
    return host;
  }

  /**
   * This is the setter method to the attribute.
   * Host/domain name match configuration.
   * Must be configured along with at least one path match criteria.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param host set the host.
   */
  @VsoMethod
  public void setHost(String  host) {
    this.host = host;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Resource/uri path match configuration.
   * Must be configured along with host match criteria.
   * Field introduced in 20.1.3.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return path
   */
  @VsoMethod
  public List<PathMatch> getPath() {
    return path;
  }

  /**
   * This is the setter method. this will set the path
   * Resource/uri path match configuration.
   * Must be configured along with host match criteria.
   * Field introduced in 20.1.3.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return path
   */
  @VsoMethod
  public void setPath(List<PathMatch>  path) {
    this.path = path;
  }

  /**
   * This is the setter method this will set the path
   * Resource/uri path match configuration.
   * Must be configured along with host match criteria.
   * Field introduced in 20.1.3.
   * Minimum of 1 items required.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return path
   */
  @VsoMethod
  public VHMatch addPathItem(PathMatch pathItem) {
    if (this.path == null) {
      this.path = new ArrayList<PathMatch>();
    }
    this.path.add(pathItem);
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
  VHMatch objVHMatch = (VHMatch) o;
  return   Objects.equals(this.host, objVHMatch.host)&&
  Objects.equals(this.path, objVHMatch.path);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VHMatch {\n");
      sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

