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
 * The DiskUsage is a POJO class extends AviRestResource that used for creating
 * DiskUsage.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DiskUsage")
@VsoFinder(name = Constants.FINDER_VRO_DISKUSAGE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DiskUsage extends AviRestResource {
    @JsonProperty("cntlr_disk_free")
    @JsonInclude(Include.NON_NULL)
    private List<OverallInfo> cntlrDiskFree = null;

    @JsonProperty("cntlr_disk_usage")
    @JsonInclude(Include.NON_NULL)
    private List<PartitionInfo> cntlrDiskUsage = null;

    @JsonProperty("se_disk_free")
    @JsonInclude(Include.NON_NULL)
    private List<OverallInfo> seDiskFree = null;

    @JsonProperty("se_disk_usage")
    @JsonInclude(Include.NON_NULL)
    private List<PartitionInfo> seDiskUsage = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cntlrDiskFree
   */
  @VsoMethod
  public List<OverallInfo> getCntlrDiskFree() {
    return cntlrDiskFree;
  }

  /**
   * This is the setter method. this will set the cntlrDiskFree
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cntlrDiskFree
   */
  @VsoMethod
  public void setCntlrDiskFree(List<OverallInfo>  cntlrDiskFree) {
    this.cntlrDiskFree = cntlrDiskFree;
  }

  /**
   * This is the setter method this will set the cntlrDiskFree
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cntlrDiskFree
   */
  @VsoMethod
  public DiskUsage addCntlrDiskFreeItem(OverallInfo cntlrDiskFreeItem) {
    if (this.cntlrDiskFree == null) {
      this.cntlrDiskFree = new ArrayList<OverallInfo>();
    }
    this.cntlrDiskFree.add(cntlrDiskFreeItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cntlrDiskUsage
   */
  @VsoMethod
  public List<PartitionInfo> getCntlrDiskUsage() {
    return cntlrDiskUsage;
  }

  /**
   * This is the setter method. this will set the cntlrDiskUsage
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cntlrDiskUsage
   */
  @VsoMethod
  public void setCntlrDiskUsage(List<PartitionInfo>  cntlrDiskUsage) {
    this.cntlrDiskUsage = cntlrDiskUsage;
  }

  /**
   * This is the setter method this will set the cntlrDiskUsage
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cntlrDiskUsage
   */
  @VsoMethod
  public DiskUsage addCntlrDiskUsageItem(PartitionInfo cntlrDiskUsageItem) {
    if (this.cntlrDiskUsage == null) {
      this.cntlrDiskUsage = new ArrayList<PartitionInfo>();
    }
    this.cntlrDiskUsage.add(cntlrDiskUsageItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seDiskFree
   */
  @VsoMethod
  public List<OverallInfo> getSeDiskFree() {
    return seDiskFree;
  }

  /**
   * This is the setter method. this will set the seDiskFree
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seDiskFree
   */
  @VsoMethod
  public void setSeDiskFree(List<OverallInfo>  seDiskFree) {
    this.seDiskFree = seDiskFree;
  }

  /**
   * This is the setter method this will set the seDiskFree
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seDiskFree
   */
  @VsoMethod
  public DiskUsage addSeDiskFreeItem(OverallInfo seDiskFreeItem) {
    if (this.seDiskFree == null) {
      this.seDiskFree = new ArrayList<OverallInfo>();
    }
    this.seDiskFree.add(seDiskFreeItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seDiskUsage
   */
  @VsoMethod
  public List<PartitionInfo> getSeDiskUsage() {
    return seDiskUsage;
  }

  /**
   * This is the setter method. this will set the seDiskUsage
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seDiskUsage
   */
  @VsoMethod
  public void setSeDiskUsage(List<PartitionInfo>  seDiskUsage) {
    this.seDiskUsage = seDiskUsage;
  }

  /**
   * This is the setter method this will set the seDiskUsage
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seDiskUsage
   */
  @VsoMethod
  public DiskUsage addSeDiskUsageItem(PartitionInfo seDiskUsageItem) {
    if (this.seDiskUsage == null) {
      this.seDiskUsage = new ArrayList<PartitionInfo>();
    }
    this.seDiskUsage.add(seDiskUsageItem);
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
  DiskUsage objDiskUsage = (DiskUsage) o;
  return   Objects.equals(this.cntlrDiskUsage, objDiskUsage.cntlrDiskUsage)&&
  Objects.equals(this.cntlrDiskFree, objDiskUsage.cntlrDiskFree)&&
  Objects.equals(this.seDiskUsage, objDiskUsage.seDiskUsage)&&
  Objects.equals(this.seDiskFree, objDiskUsage.seDiskFree);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DiskUsage {\n");
      sb.append("    cntlrDiskFree: ").append(toIndentedString(cntlrDiskFree)).append("\n");
        sb.append("    cntlrDiskUsage: ").append(toIndentedString(cntlrDiskUsage)).append("\n");
        sb.append("    seDiskFree: ").append(toIndentedString(seDiskFree)).append("\n");
        sb.append("    seDiskUsage: ").append(toIndentedString(seDiskUsage)).append("\n");
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

