package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * BuildInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "BuildInfo")
@VsoFinder(name = Constants.FINDER_VRO_BUILDINFO, idAccessor = "getObjectID()")
@Service
public class BuildInfo extends AviRestResource  {
  @JsonProperty("build_no")
  private Integer buildNo = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("min_version")
  private String minVersion = null;

  @JsonProperty("patch_version")
  private String patchVersion = null;

  @JsonProperty("product")
  private String product = null;

  @JsonProperty("product_name")
  private String productName = null;

  @JsonProperty("tag")
  private String tag = null;

  @JsonProperty("version")
  private String version = null;

  
  /**
   * Build number for easy identification. Field introduced in 18.2.6.
   * @return buildNo
  **/
  @ApiModelProperty(value = "Build number for easy identification. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getBuildNo() {
    return buildNo;
  }
    
  @VsoMethod
  public void setBuildNo(Integer buildNo) {
    this.buildNo = buildNo;
  }

  
  /**
   * Date when the package created. Field introduced in 18.2.6.
   * @return date
  **/
  @ApiModelProperty(value = "Date when the package created. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getDate() {
    return date;
  }
    
  @VsoMethod
  public void setDate(String date) {
    this.date = date;
  }

  
  /**
   * Min version of the image. Field introduced in 18.2.6.
   * @return minVersion
  **/
  @ApiModelProperty(value = "Min version of the image. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getMinVersion() {
    return minVersion;
  }
    
  @VsoMethod
  public void setMinVersion(String minVersion) {
    this.minVersion = minVersion;
  }

  
  /**
   * Patch version of the image. Field introduced in 18.2.6.
   * @return patchVersion
  **/
  @ApiModelProperty(value = "Patch version of the image. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getPatchVersion() {
    return patchVersion;
  }
    
  @VsoMethod
  public void setPatchVersion(String patchVersion) {
    this.patchVersion = patchVersion;
  }

  
  /**
   * Product type. Field introduced in 18.2.6.
   * @return product
  **/
  @ApiModelProperty(value = "Product type. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getProduct() {
    return product;
  }
    
  @VsoMethod
  public void setProduct(String product) {
    this.product = product;
  }

  
  /**
   * Product Name. Field introduced in 18.2.6.
   * @return productName
  **/
  @ApiModelProperty(value = "Product Name. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getProductName() {
    return productName;
  }
    
  @VsoMethod
  public void setProductName(String productName) {
    this.productName = productName;
  }

  
  /**
   * Tag related to the package. Field introduced in 18.2.6.
   * @return tag
  **/
  @ApiModelProperty(value = "Tag related to the package. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getTag() {
    return tag;
  }
    
  @VsoMethod
  public void setTag(String tag) {
    this.tag = tag;
  }

  
  /**
   * Major version of the image. Field introduced in 18.2.6.
   * @return version
  **/
  @ApiModelProperty(value = "Major version of the image. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getVersion() {
    return version;
  }
    
  @VsoMethod
  public void setVersion(String version) {
    this.version = version;
  }

  
  public String getObjectID() {
		return "BuildInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildInfo buildInfo = (BuildInfo) o;
    return Objects.equals(this.buildNo, buildInfo.buildNo) &&
        Objects.equals(this.date, buildInfo.date) &&
        Objects.equals(this.minVersion, buildInfo.minVersion) &&
        Objects.equals(this.patchVersion, buildInfo.patchVersion) &&
        Objects.equals(this.product, buildInfo.product) &&
        Objects.equals(this.productName, buildInfo.productName) &&
        Objects.equals(this.tag, buildInfo.tag) &&
        Objects.equals(this.version, buildInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildNo, date, minVersion, patchVersion, product, productName, tag, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildInfo {\n");
    
    sb.append("    buildNo: ").append(toIndentedString(buildNo)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
    sb.append("    patchVersion: ").append(toIndentedString(patchVersion)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

