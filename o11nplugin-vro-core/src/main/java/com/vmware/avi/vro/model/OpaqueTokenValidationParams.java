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
 * The OpaqueTokenValidationParams is a POJO class extends AviRestResource that used for creating
 * OpaqueTokenValidationParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OpaqueTokenValidationParams")
@VsoFinder(name = Constants.FINDER_VRO_OPAQUETOKENVALIDATIONPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OpaqueTokenValidationParams extends AviRestResource {
    @JsonProperty("server_id")
    @JsonInclude(Include.NON_NULL)
    private String serverId;

    @JsonProperty("server_secret")
    @JsonInclude(Include.NON_NULL)
    private String serverSecret;



  /**
   * This is the getter method this will return the attribute value.
   * Resource server specific identifier used to validate against introspection endpoint when access token is opaque.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverId
   */
  @VsoMethod
  public String getServerId() {
    return serverId;
  }

  /**
   * This is the setter method to the attribute.
   * Resource server specific identifier used to validate against introspection endpoint when access token is opaque.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverId set the serverId.
   */
  @VsoMethod
  public void setServerId(String  serverId) {
    this.serverId = serverId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Resource server specific password/secret.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return serverSecret
   */
  @VsoMethod
  public String getServerSecret() {
    return serverSecret;
  }

  /**
   * This is the setter method to the attribute.
   * Resource server specific password/secret.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param serverSecret set the serverSecret.
   */
  @VsoMethod
  public void setServerSecret(String  serverSecret) {
    this.serverSecret = serverSecret;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OpaqueTokenValidationParams objOpaqueTokenValidationParams = (OpaqueTokenValidationParams) o;
  return   Objects.equals(this.serverId, objOpaqueTokenValidationParams.serverId)&&
  Objects.equals(this.serverSecret, objOpaqueTokenValidationParams.serverSecret);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OpaqueTokenValidationParams {\n");
      sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    serverSecret: ").append(toIndentedString(serverSecret)).append("\n");
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

