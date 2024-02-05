package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.BuildInfo;
import com.vmware.avi.vro.model.PatchInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The PackageDetails is a POJO class extends AviRestResource that used for creating
 * PackageDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PackageDetails")
@VsoFinder(name = Constants.FINDER_VRO_PACKAGEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PackageDetails extends AviRestResource {
    @JsonProperty("build")
    @JsonInclude(Include.NON_NULL)
    private BuildInfo build;

    @JsonProperty("hash")
    @JsonInclude(Include.NON_NULL)
    private String hash;

    @JsonProperty("patch")
    @JsonInclude(Include.NON_NULL)
    private PatchInfo patch;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private String path;



  /**
   * This is the getter method this will return the attribute value.
   * This contains build related information.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return build
   */
  @VsoMethod
  public BuildInfo getBuild() {
    return build;
  }

  /**
   * This is the setter method to the attribute.
   * This contains build related information.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param build set the build.
   */
  @VsoMethod
  public void setBuild(BuildInfo build) {
    this.build = build;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Md5 checksum over the entire package.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hash
   */
  @VsoMethod
  public String getHash() {
    return hash;
  }

  /**
   * This is the setter method to the attribute.
   * Md5 checksum over the entire package.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hash set the hash.
   */
  @VsoMethod
  public void setHash(String  hash) {
    this.hash = hash;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Patch related necessary information.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return patch
   */
  @VsoMethod
  public PatchInfo getPatch() {
    return patch;
  }

  /**
   * This is the setter method to the attribute.
   * Patch related necessary information.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param patch set the patch.
   */
  @VsoMethod
  public void setPatch(PatchInfo patch) {
    this.patch = patch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Path of the package in the repository.
   * Field introduced in 18.2.6.
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
   * Path of the package in the repository.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param path set the path.
   */
  @VsoMethod
  public void setPath(String  path) {
    this.path = path;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PackageDetails objPackageDetails = (PackageDetails) o;
  return   Objects.equals(this.path, objPackageDetails.path)&&
  Objects.equals(this.build, objPackageDetails.build)&&
  Objects.equals(this.hash, objPackageDetails.hash)&&
  Objects.equals(this.patch, objPackageDetails.patch);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PackageDetails {\n");
      sb.append("    build: ").append(toIndentedString(build)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
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

