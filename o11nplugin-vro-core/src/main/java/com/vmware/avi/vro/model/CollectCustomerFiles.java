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
 * The CollectCustomerFiles is a POJO class extends AviRestResource that used for creating
 * CollectCustomerFiles.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CollectCustomerFiles")
@VsoFinder(name = Constants.FINDER_VRO_COLLECTCUSTOMERFILES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CollectCustomerFiles extends AviRestResource {
    @JsonProperty("files")
    @JsonInclude(Include.NON_NULL)
    private List<ArchivePolicy> files;



  /**
   * This is the getter method this will return the attribute value.
   * Archive policy for file path to have specific threshold.tech-support will skip collection of file if file size is greater than threshold.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return files
   */
  @VsoMethod
  public List<ArchivePolicy> getFiles() {
    return files;
  }

  /**
   * This is the setter method. this will set the files
   * Archive policy for file path to have specific threshold.tech-support will skip collection of file if file size is greater than threshold.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return files
   */
  @VsoMethod
  public void setFiles(List<ArchivePolicy>  files) {
    this.files = files;
  }

  /**
   * This is the setter method this will set the files
   * Archive policy for file path to have specific threshold.tech-support will skip collection of file if file size is greater than threshold.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return files
   */
  @VsoMethod
  public CollectCustomerFiles addFilesItem(ArchivePolicy filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<ArchivePolicy>();
    }
    this.files.add(filesItem);
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
  CollectCustomerFiles objCollectCustomerFiles = (CollectCustomerFiles) o;
  return   Objects.equals(this.files, objCollectCustomerFiles.files);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CollectCustomerFiles {\n");
      sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

