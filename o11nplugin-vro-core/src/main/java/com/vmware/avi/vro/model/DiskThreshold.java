package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.RetentionAction;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DiskThreshold is a POJO class extends AviRestResource that used for creating
 * DiskThreshold.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DiskThreshold")
@VsoFinder(name = Constants.FINDER_VRO_DISKTHRESHOLD)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DiskThreshold extends AviRestResource {
    @JsonProperty("action")
    @JsonInclude(Include.NON_NULL)
    private RetentionAction action;

    @JsonProperty("filepath")
    @JsonInclude(Include.NON_NULL)
    private String filepath;

    @JsonProperty("max_disk_percent")
    @JsonInclude(Include.NON_NULL)
    private Integer maxDiskPercent;

    @JsonProperty("min_free_disk_percent")
    @JsonInclude(Include.NON_NULL)
    private Integer minFreeDiskPercent;

    @JsonProperty("retain")
    @JsonInclude(Include.NON_NULL)
    private Integer retain;



  /**
   * This is the getter method this will return the attribute value.
   * Action to trigger when policy conditions are met.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return action
   */
  @VsoMethod
  public RetentionAction getAction() {
    return action;
  }

  /**
   * This is the setter method to the attribute.
   * Action to trigger when policy conditions are met.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @param action set the action.
   */
  @VsoMethod
  public void setAction(RetentionAction action) {
    this.action = action;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Path against which disk usage is measured, user cannot modify the path.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return filepath
   */
  @VsoMethod
  public String getFilepath() {
    return filepath;
  }

  /**
   * This is the setter method to the attribute.
   * Path against which disk usage is measured, user cannot modify the path.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @param filepath set the filepath.
   */
  @VsoMethod
  public void setFilepath(String  filepath) {
    this.filepath = filepath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Trigger the action when disk usage percent exceeds on the specified path.
   * Allowed values are 1-25.
   * Field introduced in 31.1.1.
   * Unit is percent.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return maxDiskPercent
   */
  @VsoMethod
  public Integer getMaxDiskPercent() {
    return maxDiskPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Trigger the action when disk usage percent exceeds on the specified path.
   * Allowed values are 1-25.
   * Field introduced in 31.1.1.
   * Unit is percent.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param maxDiskPercent set the maxDiskPercent.
   */
  @VsoMethod
  public void setMaxDiskPercent(Integer  maxDiskPercent) {
    this.maxDiskPercent = maxDiskPercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Trigger the action when total available diskspace falls below this level.
   * Allowed values are 5-50.
   * Field introduced in 31.1.1.
   * Unit is percent.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return minFreeDiskPercent
   */
  @VsoMethod
  public Integer getMinFreeDiskPercent() {
    return minFreeDiskPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Trigger the action when total available diskspace falls below this level.
   * Allowed values are 5-50.
   * Field introduced in 31.1.1.
   * Unit is percent.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param minFreeDiskPercent set the minFreeDiskPercent.
   */
  @VsoMethod
  public void setMinFreeDiskPercent(Integer  minFreeDiskPercent) {
    this.minFreeDiskPercent = minFreeDiskPercent;
  }

  /**
   * This is the getter method this will return the attribute value.
   * When number of files at this path does not exceed this limit, skip renteion action regardless of other disk criteria.
   * Trigger the action when no other disk criteria is specified and number of files exceed the retain limit.
   * Subdirectories do not count.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return retain
   */
  @VsoMethod
  public Integer getRetain() {
    return retain;
  }

  /**
   * This is the setter method to the attribute.
   * When number of files at this path does not exceed this limit, skip renteion action regardless of other disk criteria.
   * Trigger the action when no other disk criteria is specified and number of files exceed the retain limit.
   * Subdirectories do not count.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param retain set the retain.
   */
  @VsoMethod
  public void setRetain(Integer  retain) {
    this.retain = retain;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DiskThreshold objDiskThreshold = (DiskThreshold) o;
  return   Objects.equals(this.action, objDiskThreshold.action)&&
  Objects.equals(this.filepath, objDiskThreshold.filepath)&&
  Objects.equals(this.retain, objDiskThreshold.retain)&&
  Objects.equals(this.maxDiskPercent, objDiskThreshold.maxDiskPercent)&&
  Objects.equals(this.minFreeDiskPercent, objDiskThreshold.minFreeDiskPercent);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DiskThreshold {\n");
      sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    filepath: ").append(toIndentedString(filepath)).append("\n");
        sb.append("    maxDiskPercent: ").append(toIndentedString(maxDiskPercent)).append("\n");
        sb.append("    minFreeDiskPercent: ").append(toIndentedString(minFreeDiskPercent)).append("\n");
        sb.append("    retain: ").append(toIndentedString(retain)).append("\n");
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

