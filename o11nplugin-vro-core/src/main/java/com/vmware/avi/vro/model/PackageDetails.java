package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.BuildInfo;
import com.vmware.avi.vro.model.PatchInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * PackageDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PackageDetails")
@VsoFinder(name = Constants.FINDER_VRO_PACKAGEDETAILS, idAccessor = "getObjectID()")
@Service
public class PackageDetails extends AviRestResource  {
  @JsonProperty("build")
  private BuildInfo build = null;

  @JsonProperty("hash")
  private String hash = null;

  @JsonProperty("patch")
  private PatchInfo patch = null;

  @JsonProperty("path")
  private String path = null;

  
  /**
   * This contains build related information. Field introduced in 18.2.6.
   * @return build
  **/
  @ApiModelProperty(value = "This contains build related information. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public BuildInfo getBuild() {
    return build;
  }
    
  @VsoMethod
  public void setBuild(BuildInfo build) {
    this.build = build;
  }

  
  /**
   * MD5 checksum over the entire package. Field introduced in 18.2.6.
   * @return hash
  **/
  @ApiModelProperty(value = "MD5 checksum over the entire package. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getHash() {
    return hash;
  }
    
  @VsoMethod
  public void setHash(String hash) {
    this.hash = hash;
  }

  
  /**
   * Patch related necessary information. Field introduced in 18.2.6.
   * @return patch
  **/
  @ApiModelProperty(value = "Patch related necessary information. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public PatchInfo getPatch() {
    return patch;
  }
    
  @VsoMethod
  public void setPatch(PatchInfo patch) {
    this.patch = patch;
  }

  
  /**
   * Path of the package in the repository. Field introduced in 18.2.6.
   * @return path
  **/
  @ApiModelProperty(value = "Path of the package in the repository. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getPath() {
    return path;
  }
    
  @VsoMethod
  public void setPath(String path) {
    this.path = path;
  }

  
  public String getObjectID() {
		return "PackageDetails";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageDetails packageDetails = (PackageDetails) o;
    return Objects.equals(this.build, packageDetails.build) &&
        Objects.equals(this.hash, packageDetails.hash) &&
        Objects.equals(this.patch, packageDetails.patch) &&
        Objects.equals(this.path, packageDetails.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(build, hash, patch, path);
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

