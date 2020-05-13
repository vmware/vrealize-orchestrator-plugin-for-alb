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
 * SamlIdentityProviderSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SamlIdentityProviderSettings")
@VsoFinder(name = Constants.FINDER_VRO_SAMLIDENTITYPROVIDERSETTINGS, idAccessor = "getObjectID()")
@Service
public class SamlIdentityProviderSettings extends AviRestResource  {
  @JsonProperty("metadata")
  private String metadata = null;

  
  /**
   * SAML IDP metadata. Field introduced in 17.2.3.
   * @return metadata
  **/
  @ApiModelProperty(value = "SAML IDP metadata. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public String getMetadata() {
    return metadata;
  }
    
  @VsoMethod
  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  
  public String getObjectID() {
		return "SamlIdentityProviderSettings";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlIdentityProviderSettings samlIdentityProviderSettings = (SamlIdentityProviderSettings) o;
    return Objects.equals(this.metadata, samlIdentityProviderSettings.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlIdentityProviderSettings {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

