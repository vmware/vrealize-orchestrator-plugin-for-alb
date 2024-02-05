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
 * The ApiVersionDeprecated is a POJO class extends AviRestResource that used for creating
 * ApiVersionDeprecated.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApiVersionDeprecated")
@VsoFinder(name = Constants.FINDER_VRO_APIVERSIONDEPRECATED)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApiVersionDeprecated extends AviRestResource {
    @JsonProperty("api_version_used")
    @JsonInclude(Include.NON_NULL)
    private String apiVersionUsed;

    @JsonProperty("client_ip")
    @JsonInclude(Include.NON_NULL)
    private String clientIp;

    @JsonProperty("min_supported_api_version")
    @JsonInclude(Include.NON_NULL)
    private String minSupportedApiVersion;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private String path;

    @JsonProperty("user")
    @JsonInclude(Include.NON_NULL)
    private String user;



  /**
   * This is the getter method this will return the attribute value.
   * Api version used.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return apiVersionUsed
   */
  @VsoMethod
  public String getApiVersionUsed() {
    return apiVersionUsed;
  }

  /**
   * This is the setter method to the attribute.
   * Api version used.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param apiVersionUsed set the apiVersionUsed.
   */
  @VsoMethod
  public void setApiVersionUsed(String  apiVersionUsed) {
    this.apiVersionUsed = apiVersionUsed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ip address of client who sent the request.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIp
   */
  @VsoMethod
  public String getClientIp() {
    return clientIp;
  }

  /**
   * This is the setter method to the attribute.
   * Ip address of client who sent the request.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIp set the clientIp.
   */
  @VsoMethod
  public void setClientIp(String  clientIp) {
    this.clientIp = clientIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum supported api version.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return minSupportedApiVersion
   */
  @VsoMethod
  public String getMinSupportedApiVersion() {
    return minSupportedApiVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum supported api version.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param minSupportedApiVersion set the minSupportedApiVersion.
   */
  @VsoMethod
  public void setMinSupportedApiVersion(String  minSupportedApiVersion) {
    this.minSupportedApiVersion = minSupportedApiVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uri of the request.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return path
   */
  @VsoMethod
  public String getPath() {
    return path;
  }

  /**
   * This is the setter method to the attribute.
   * Uri of the request.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param path set the path.
   */
  @VsoMethod
  public void setPath(String  path) {
    this.path = path;
  }

  /**
   * This is the getter method this will return the attribute value.
   * User who sent the request.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return user
   */
  @VsoMethod
  public String getUser() {
    return user;
  }

  /**
   * This is the setter method to the attribute.
   * User who sent the request.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param user set the user.
   */
  @VsoMethod
  public void setUser(String  user) {
    this.user = user;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ApiVersionDeprecated objApiVersionDeprecated = (ApiVersionDeprecated) o;
  return   Objects.equals(this.apiVersionUsed, objApiVersionDeprecated.apiVersionUsed)&&
  Objects.equals(this.clientIp, objApiVersionDeprecated.clientIp)&&
  Objects.equals(this.path, objApiVersionDeprecated.path)&&
  Objects.equals(this.user, objApiVersionDeprecated.user)&&
  Objects.equals(this.minSupportedApiVersion, objApiVersionDeprecated.minSupportedApiVersion);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApiVersionDeprecated {\n");
      sb.append("    apiVersionUsed: ").append(toIndentedString(apiVersionUsed)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    minSupportedApiVersion: ").append(toIndentedString(minSupportedApiVersion)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

