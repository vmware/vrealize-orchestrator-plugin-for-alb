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
 * HdrPersistenceProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HdrPersistenceProfile")
@VsoFinder(name = Constants.FINDER_VRO_HDRPERSISTENCEPROFILE, idAccessor = "getObjectID()")
@Service
public class HdrPersistenceProfile extends AviRestResource  {
  @JsonProperty("prst_hdr_name")
  private String prstHdrName = null;

  
  /**
   * Header name for custom header persistence.
   * @return prstHdrName
  **/
  @ApiModelProperty(value = "Header name for custom header persistence.")


 
  @VsoMethod  
  public String getPrstHdrName() {
    return prstHdrName;
  }
    
  @VsoMethod
  public void setPrstHdrName(String prstHdrName) {
    this.prstHdrName = prstHdrName;
  }

  
  public String getObjectID() {
		return "HdrPersistenceProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HdrPersistenceProfile hdrPersistenceProfile = (HdrPersistenceProfile) o;
    return Objects.equals(this.prstHdrName, hdrPersistenceProfile.prstHdrName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prstHdrName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HdrPersistenceProfile {\n");
    
    sb.append("    prstHdrName: ").append(toIndentedString(prstHdrName)).append("\n");
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

