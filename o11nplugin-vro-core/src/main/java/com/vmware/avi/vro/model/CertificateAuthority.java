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
 * CertificateAuthority
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CertificateAuthority")
@VsoFinder(name = Constants.FINDER_VRO_CERTIFICATEAUTHORITY, idAccessor = "getObjectID()")
@Service
public class CertificateAuthority extends AviRestResource  {
  @JsonProperty("ca_ref")
  private String caRef = null;

  @JsonProperty("name")
  private String name = null;

  
  /**
   *  It is a reference to an object of type SSLKeyAndCertificate.
   * @return caRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type SSLKeyAndCertificate.")


 
  @VsoMethod  
  public String getCaRef() {
    return caRef;
  }
    
  @VsoMethod
  public void setCaRef(String caRef) {
    this.caRef = caRef;
  }

  
  /**
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the object.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public String getObjectID() {
		return "CertificateAuthority";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateAuthority certificateAuthority = (CertificateAuthority) o;
    return Objects.equals(this.caRef, certificateAuthority.caRef) &&
        Objects.equals(this.name, certificateAuthority.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caRef, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateAuthority {\n");
    
    sb.append("    caRef: ").append(toIndentedString(caRef)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

