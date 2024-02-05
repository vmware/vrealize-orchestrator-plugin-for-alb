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
 * The PartitionInfo is a POJO class extends AviRestResource that used for creating
 * PartitionInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PartitionInfo")
@VsoFinder(name = Constants.FINDER_VRO_PARTITIONINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PartitionInfo extends AviRestResource {
    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private String path;

    @JsonProperty("quota")
    @JsonInclude(Include.NON_NULL)
    private Integer quota;

    @JsonProperty("size")
    @JsonInclude(Include.NON_NULL)
    private Integer size;



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
   * @return quota
   */
  @VsoMethod
  public Integer getQuota() {
    return quota;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param quota set the quota.
   */
  @VsoMethod
  public void setQuota(Integer  quota) {
    this.quota = quota;
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



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PartitionInfo objPartitionInfo = (PartitionInfo) o;
  return   Objects.equals(this.path, objPartitionInfo.path)&&
  Objects.equals(this.size, objPartitionInfo.size)&&
  Objects.equals(this.quota, objPartitionInfo.quota);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PartitionInfo {\n");
      sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

