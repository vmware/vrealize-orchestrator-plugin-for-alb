package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SamlIdentityProviderSettings;
import com.vmware.avi.vro.model.SamlServiceProviderSettings;
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
 * SamlSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SamlSettings")
@VsoFinder(name = Constants.FINDER_VRO_SAMLSETTINGS, idAccessor = "getObjectID()")
@Service
public class SamlSettings extends AviRestResource  {
  @JsonProperty("idp")
  private SamlIdentityProviderSettings idp = null;

  @JsonProperty("sp")
  private SamlServiceProviderSettings sp = null;

  
  /**
   * Configure remote Identity provider settings. Field introduced in 17.2.3.
   * @return idp
  **/
  @ApiModelProperty(value = "Configure remote Identity provider settings. Field introduced in 17.2.3.")

  @Valid

 
  @VsoMethod  
  public SamlIdentityProviderSettings getIdp() {
    return idp;
  }
    
  @VsoMethod
  public void setIdp(SamlIdentityProviderSettings idp) {
    this.idp = idp;
  }

  
  /**
   * Configure service provider settings for the Controller. Field introduced in 17.2.3.
   * @return sp
  **/
  @ApiModelProperty(required = true, value = "Configure service provider settings for the Controller. Field introduced in 17.2.3.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public SamlServiceProviderSettings getSp() {
    return sp;
  }
    
  @VsoMethod
  public void setSp(SamlServiceProviderSettings sp) {
    this.sp = sp;
  }

  
  public String getObjectID() {
		return "SamlSettings";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlSettings samlSettings = (SamlSettings) o;
    return Objects.equals(this.idp, samlSettings.idp) &&
        Objects.equals(this.sp, samlSettings.sp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idp, sp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlSettings {\n");
    
    sb.append("    idp: ").append(toIndentedString(idp)).append("\n");
    sb.append("    sp: ").append(toIndentedString(sp)).append("\n");
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

