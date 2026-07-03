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
 * The ApiSpecServer is a POJO class extends AviRestResource that used for creating
 * ApiSpecServer.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApiSpecServer")
@VsoFinder(name = Constants.FINDER_VRO_APISPECSERVER, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApiSpecServer extends AviRestResource {
    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";



  /**
   * This is the getter method this will return the attribute value.
   * Description of this server entry.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Description of this server entry.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }
/**
   * This is the getter method this will return the attribute value.
   * Server url or relative path.
   * May be an absolute url (e.g.
   * 'https //api.example.com/v1', 'https //api.example.com 8443/v1') or a relative path (e.g.
   * '/v1', '/').
   * When populated from an openapi spec, server url template variables are resolved to concrete urls at import time before being stored here.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Server url or relative path.
   * May be an absolute url (e.g.
   * 'https //api.example.com/v1', 'https //api.example.com 8443/v1') or a relative path (e.g.
   * '/v1', '/').
   * When populated from an openapi spec, server url template variables are resolved to concrete urls at import time before being stored here.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ApiSpecServer objApiSpecServer = (ApiSpecServer) o;
  return   Objects.equals(this.description, objApiSpecServer.description);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApiSpecServer {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

