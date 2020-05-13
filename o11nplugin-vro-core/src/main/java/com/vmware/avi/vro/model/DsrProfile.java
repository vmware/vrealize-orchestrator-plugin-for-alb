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
 * DsrProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DsrProfile")
@VsoFinder(name = Constants.FINDER_VRO_DSRPROFILE, idAccessor = "getObjectID()")
@Service
public class DsrProfile extends AviRestResource  {
  @JsonProperty("dsr_encap_type")
  private String dsrEncapType = "ENCAP_IPINIP";

  @JsonProperty("dsr_type")
  private String dsrType = "DSR_TYPE_L3";

  
  /**
   * Encapsulation type to use when DSR is L3. Enum options - ENCAP_IPINIP. Field introduced in 18.2.3.
   * @return dsrEncapType
  **/
  @ApiModelProperty(required = true, value = "Encapsulation type to use when DSR is L3. Enum options - ENCAP_IPINIP. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getDsrEncapType() {
    return dsrEncapType;
  }
    
  @VsoMethod
  public void setDsrEncapType(String dsrEncapType) {
    this.dsrEncapType = dsrEncapType;
  }

  
  /**
   * DSR type L2/L3. Enum options - DSR_TYPE_L2, DSR_TYPE_L3. Field introduced in 18.2.3.
   * @return dsrType
  **/
  @ApiModelProperty(required = true, value = "DSR type L2/L3. Enum options - DSR_TYPE_L2, DSR_TYPE_L3. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getDsrType() {
    return dsrType;
  }
    
  @VsoMethod
  public void setDsrType(String dsrType) {
    this.dsrType = dsrType;
  }

  
  public String getObjectID() {
		return "DsrProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DsrProfile dsrProfile = (DsrProfile) o;
    return Objects.equals(this.dsrEncapType, dsrProfile.dsrEncapType) &&
        Objects.equals(this.dsrType, dsrProfile.dsrType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dsrEncapType, dsrType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DsrProfile {\n");
    
    sb.append("    dsrEncapType: ").append(toIndentedString(dsrEncapType)).append("\n");
    sb.append("    dsrType: ").append(toIndentedString(dsrType)).append("\n");
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

