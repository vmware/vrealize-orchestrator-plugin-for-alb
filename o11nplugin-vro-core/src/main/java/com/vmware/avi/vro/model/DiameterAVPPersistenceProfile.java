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
 * The DiameterAVPPersistenceProfile is a POJO class extends AviRestResource that used for creating
 * DiameterAVPPersistenceProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DiameterAVPPersistenceProfile")
@VsoFinder(name = Constants.FINDER_VRO_DIAMETERAVPPERSISTENCEPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DiameterAVPPersistenceProfile extends AviRestResource {
    @JsonProperty("avp_key_type")
    @JsonInclude(Include.NON_NULL)
    private String avpKeyType = "SESSION_ID";

    @JsonProperty("timeout")
    @JsonInclude(Include.NON_NULL)
    private Integer timeout;



  /**
   * This is the getter method this will return the attribute value.
   * Avpkey type.
   * Enum options - SESSION_ID, ORIGIN_HOST, ORIGIN_REALM, DESTINATION_HOST, DESTINATION_REALM, APPLICATION_ID.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SESSION_ID".
   * @return avpKeyType
   */
  @VsoMethod
  public String getAvpKeyType() {
    return avpKeyType;
  }

  /**
   * This is the setter method to the attribute.
   * Avpkey type.
   * Enum options - SESSION_ID, ORIGIN_HOST, ORIGIN_REALM, DESTINATION_HOST, DESTINATION_REALM, APPLICATION_ID.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "SESSION_ID".
   * @param avpKeyType set the avpKeyType.
   */
  @VsoMethod
  public void setAvpKeyType(String  avpKeyType) {
    this.avpKeyType = avpKeyType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The maximum lifetime of diameter cookie.
   * No value or 'zero' indicates no timeout.
   * Field introduced in 31.1.1.
   * Unit is sec.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return timeout
   */
  @VsoMethod
  public Integer getTimeout() {
    return timeout;
  }

  /**
   * This is the setter method to the attribute.
   * The maximum lifetime of diameter cookie.
   * No value or 'zero' indicates no timeout.
   * Field introduced in 31.1.1.
   * Unit is sec.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param timeout set the timeout.
   */
  @VsoMethod
  public void setTimeout(Integer  timeout) {
    this.timeout = timeout;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DiameterAVPPersistenceProfile objDiameterAVPPersistenceProfile = (DiameterAVPPersistenceProfile) o;
  return   Objects.equals(this.timeout, objDiameterAVPPersistenceProfile.timeout)&&
  Objects.equals(this.avpKeyType, objDiameterAVPPersistenceProfile.avpKeyType);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DiameterAVPPersistenceProfile {\n");
      sb.append("    avpKeyType: ").append(toIndentedString(avpKeyType)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

