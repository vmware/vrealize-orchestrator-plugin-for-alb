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
 * BfdProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "BfdProfile")
@VsoFinder(name = Constants.FINDER_VRO_BFDPROFILE, idAccessor = "getObjectID()")
@Service
public class BfdProfile extends AviRestResource  {
  @JsonProperty("minrx")
  private Integer minrx = 1000;

  @JsonProperty("mintx")
  private Integer mintx = 1000;

  @JsonProperty("multi")
  private Integer multi = 3;

  
  /**
   * Default required minimum receive interval (in ms) used in BFD. Allowed values are 500-4000000. Field introduced in 20.1.1.
   * @return minrx
  **/
  @ApiModelProperty(value = "Default required minimum receive interval (in ms) used in BFD. Allowed values are 500-4000000. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getMinrx() {
    return minrx;
  }
    
  @VsoMethod
  public void setMinrx(Integer minrx) {
    this.minrx = minrx;
  }

  
  /**
   * Default desired minimum transmit interval (in ms) used in BFD. Allowed values are 500-4000000. Field introduced in 20.1.1.
   * @return mintx
  **/
  @ApiModelProperty(value = "Default desired minimum transmit interval (in ms) used in BFD. Allowed values are 500-4000000. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getMintx() {
    return mintx;
  }
    
  @VsoMethod
  public void setMintx(Integer mintx) {
    this.mintx = mintx;
  }

  
  /**
   * Default detection multiplier used in BFD. Allowed values are 3-255. Field introduced in 20.1.1.
   * @return multi
  **/
  @ApiModelProperty(value = "Default detection multiplier used in BFD. Allowed values are 3-255. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getMulti() {
    return multi;
  }
    
  @VsoMethod
  public void setMulti(Integer multi) {
    this.multi = multi;
  }

  
  public String getObjectID() {
		return "BfdProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BfdProfile bfdProfile = (BfdProfile) o;
    return Objects.equals(this.minrx, bfdProfile.minrx) &&
        Objects.equals(this.mintx, bfdProfile.mintx) &&
        Objects.equals(this.multi, bfdProfile.multi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minrx, mintx, multi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BfdProfile {\n");
    
    sb.append("    minrx: ").append(toIndentedString(minrx)).append("\n");
    sb.append("    mintx: ").append(toIndentedString(mintx)).append("\n");
    sb.append("    multi: ").append(toIndentedString(multi)).append("\n");
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

