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
 * The OverallInfo is a POJO class extends AviRestResource that used for creating
 * OverallInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OverallInfo")
@VsoFinder(name = Constants.FINDER_VRO_OVERALLINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OverallInfo extends AviRestResource {
    @JsonProperty("available")
    @JsonInclude(Include.NON_NULL)
    private Integer available = null;

    @JsonProperty("free_percent")
    @JsonInclude(Include.NON_NULL)
    private String freePercent = null;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private String path = null;

    @JsonProperty("size")
    @JsonInclude(Include.NON_NULL)
    private Integer size = null;

    @JsonProperty("used")
    @JsonInclude(Include.NON_NULL)
    private Integer used = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return available
   */
  @VsoMethod
  public Integer getAvailable() {
    return available;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param available set the available.
   */
  @VsoMethod
  public void setAvailable(Integer  available) {
    this.available = available;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return freePercent
   */
  @VsoMethod
  public String getFreePercent() {
    return freePercent;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param freePercent set the freePercent.
   */
  @VsoMethod
  public void setFreePercent(String  freePercent) {
    this.freePercent = freePercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return path
   */
  @VsoMethod
  public String getPath() {
    return path;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param path set the path.
   */
  @VsoMethod
  public void setPath(String  path) {
    this.path = path;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return size
   */
  @VsoMethod
  public Integer getSize() {
    return size;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param size set the size.
   */
  @VsoMethod
  public void setSize(Integer  size) {
    this.size = size;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return used
   */
  @VsoMethod
  public Integer getUsed() {
    return used;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param used set the used.
   */
  @VsoMethod
  public void setUsed(Integer  used) {
    this.used = used;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OverallInfo objOverallInfo = (OverallInfo) o;
  return   Objects.equals(this.path, objOverallInfo.path)&&
  Objects.equals(this.size, objOverallInfo.size)&&
  Objects.equals(this.used, objOverallInfo.used)&&
  Objects.equals(this.available, objOverallInfo.available)&&
  Objects.equals(this.freePercent, objOverallInfo.freePercent);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OverallInfo {\n");
      sb.append("    available: ").append(toIndentedString(available)).append("\n");
        sb.append("    freePercent: ").append(toIndentedString(freePercent)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

