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
 * The SspResources is a POJO class extends AviRestResource that used for creating
 * SspResources.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SspResources")
@VsoFinder(name = Constants.FINDER_VRO_SSPRESOURCES)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SspResources extends AviRestResource {
    @JsonProperty("avi_client_cert_ref")
    @JsonInclude(Include.NON_NULL)
    private String aviClientCertRef;

    @JsonProperty("client_cert_auth_mapping_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String clientCertAuthMappingProfileRef;

    @JsonProperty("client_cert_auth_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String clientCertAuthProfileRef;

    @JsonProperty("client_cert_ref")
    @JsonInclude(Include.NON_NULL)
    private String clientCertRef;



  /**
   * This is the getter method this will return the attribute value.
   * Client certificate used by avi to authenticate with the ssp instance.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return aviClientCertRef
   */
  @VsoMethod
  public String getAviClientCertRef() {
    return aviClientCertRef;
  }

  /**
   * This is the setter method to the attribute.
   * Client certificate used by avi to authenticate with the ssp instance.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param aviClientCertRef set the aviClientCertRef.
   */
  @VsoMethod
  public void setAviClientCertRef(String  aviClientCertRef) {
    this.aviClientCertRef = aviClientCertRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Authmappingprofile used to setup client cert auth for the ssp instance.
   * It is a reference to an object of type authmappingprofile.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientCertAuthMappingProfileRef
   */
  @VsoMethod
  public String getClientCertAuthMappingProfileRef() {
    return clientCertAuthMappingProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Authmappingprofile used to setup client cert auth for the ssp instance.
   * It is a reference to an object of type authmappingprofile.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientCertAuthMappingProfileRef set the clientCertAuthMappingProfileRef.
   */
  @VsoMethod
  public void setClientCertAuthMappingProfileRef(String  clientCertAuthMappingProfileRef) {
    this.clientCertAuthMappingProfileRef = clientCertAuthMappingProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Authprofile used to setup client cert auth for the ssp instance.
   * It is a reference to an object of type authprofile.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientCertAuthProfileRef
   */
  @VsoMethod
  public String getClientCertAuthProfileRef() {
    return clientCertAuthProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Authprofile used to setup client cert auth for the ssp instance.
   * It is a reference to an object of type authprofile.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientCertAuthProfileRef set the clientCertAuthProfileRef.
   */
  @VsoMethod
  public void setClientCertAuthProfileRef(String  clientCertAuthProfileRef) {
    this.clientCertAuthProfileRef = clientCertAuthProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Client certificate that the ssp instance uses to authenticate with avi.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientCertRef
   */
  @VsoMethod
  public String getClientCertRef() {
    return clientCertRef;
  }

  /**
   * This is the setter method to the attribute.
   * Client certificate that the ssp instance uses to authenticate with avi.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientCertRef set the clientCertRef.
   */
  @VsoMethod
  public void setClientCertRef(String  clientCertRef) {
    this.clientCertRef = clientCertRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SspResources objSspResources = (SspResources) o;
  return   Objects.equals(this.clientCertRef, objSspResources.clientCertRef)&&
  Objects.equals(this.clientCertAuthProfileRef, objSspResources.clientCertAuthProfileRef)&&
  Objects.equals(this.clientCertAuthMappingProfileRef, objSspResources.clientCertAuthMappingProfileRef)&&
  Objects.equals(this.aviClientCertRef, objSspResources.aviClientCertRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SspResources {\n");
      sb.append("    aviClientCertRef: ").append(toIndentedString(aviClientCertRef)).append("\n");
        sb.append("    clientCertAuthMappingProfileRef: ").append(toIndentedString(clientCertAuthMappingProfileRef)).append("\n");
        sb.append("    clientCertAuthProfileRef: ").append(toIndentedString(clientCertAuthProfileRef)).append("\n");
        sb.append("    clientCertRef: ").append(toIndentedString(clientCertRef)).append("\n");
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

