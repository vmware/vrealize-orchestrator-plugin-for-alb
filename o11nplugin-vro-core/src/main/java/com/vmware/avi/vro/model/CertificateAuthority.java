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
 * The CertificateAuthority is a POJO class extends AviRestResource that used for creating
 * CertificateAuthority.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CertificateAuthority")
@VsoFinder(name = Constants.FINDER_VRO_CERTIFICATEAUTHORITY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CertificateAuthority extends AviRestResource {
    @JsonProperty("ca_ref")
    @JsonInclude(Include.NON_NULL)
    private String caRef = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;



  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type sslkeyandcertificate.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return caRef
   */
  @VsoMethod
  public String getCaRef() {
    return caRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type sslkeyandcertificate.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param caRef set the caRef.
   */
  @VsoMethod
  public void setCaRef(String  caRef) {
    this.caRef = caRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CertificateAuthority objCertificateAuthority = (CertificateAuthority) o;
  return   Objects.equals(this.name, objCertificateAuthority.name)&&
  Objects.equals(this.caRef, objCertificateAuthority.caRef);
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

