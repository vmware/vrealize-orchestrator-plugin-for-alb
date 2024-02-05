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
 * The ServiceAuthConfiguration is a POJO class extends AviRestResource that used for creating
 * ServiceAuthConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ServiceAuthConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_SERVICEAUTHCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ServiceAuthConfiguration extends AviRestResource {
    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index;

    @JsonProperty("service_auth_mapping_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String serviceAuthMappingProfileRef;

    @JsonProperty("service_auth_profile_ref")
    @JsonInclude(Include.NON_NULL)
    private String serviceAuthProfileRef;



  /**
   * This is the getter method this will return the attribute value.
   * Index used for maintaining order of serviceauthconfiguration.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Index used for maintaining order of serviceauthconfiguration.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the authmappingprofile(set of auth mapping rules) to be assigned to a user on successful match.
   * It is a reference to an object of type authmappingprofile.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceAuthMappingProfileRef
   */
  @VsoMethod
  public String getServiceAuthMappingProfileRef() {
    return serviceAuthMappingProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the authmappingprofile(set of auth mapping rules) to be assigned to a user on successful match.
   * It is a reference to an object of type authmappingprofile.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceAuthMappingProfileRef set the serviceAuthMappingProfileRef.
   */
  @VsoMethod
  public void setServiceAuthMappingProfileRef(String  serviceAuthMappingProfileRef) {
    this.serviceAuthMappingProfileRef = serviceAuthMappingProfileRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the service auth profile.
   * It is a reference to an object of type serviceauthprofile.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serviceAuthProfileRef
   */
  @VsoMethod
  public String getServiceAuthProfileRef() {
    return serviceAuthProfileRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the service auth profile.
   * It is a reference to an object of type serviceauthprofile.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serviceAuthProfileRef set the serviceAuthProfileRef.
   */
  @VsoMethod
  public void setServiceAuthProfileRef(String  serviceAuthProfileRef) {
    this.serviceAuthProfileRef = serviceAuthProfileRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ServiceAuthConfiguration objServiceAuthConfiguration = (ServiceAuthConfiguration) o;
  return   Objects.equals(this.index, objServiceAuthConfiguration.index)&&
  Objects.equals(this.serviceAuthProfileRef, objServiceAuthConfiguration.serviceAuthProfileRef)&&
  Objects.equals(this.serviceAuthMappingProfileRef, objServiceAuthConfiguration.serviceAuthMappingProfileRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ServiceAuthConfiguration {\n");
      sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    serviceAuthMappingProfileRef: ").append(toIndentedString(serviceAuthMappingProfileRef)).append("\n");
        sb.append("    serviceAuthProfileRef: ").append(toIndentedString(serviceAuthProfileRef)).append("\n");
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

