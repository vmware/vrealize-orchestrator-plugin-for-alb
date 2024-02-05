package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.HealthMonitorSSLAttributes;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The HealthMonitorLdap is a POJO class extends AviRestResource that used for creating
 * HealthMonitorLdap.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "HealthMonitorLdap")
@VsoFinder(name = Constants.FINDER_VRO_HEALTHMONITORLDAP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class HealthMonitorLdap extends AviRestResource {
    @JsonProperty("attributes")
    @JsonInclude(Include.NON_NULL)
    private String attributes;

    @JsonProperty("base_dn")
    @JsonInclude(Include.NON_NULL)
    private String baseDn;

    @JsonProperty("filter")
    @JsonInclude(Include.NON_NULL)
    private String filter;

    @JsonProperty("scope")
    @JsonInclude(Include.NON_NULL)
    private String scope;

    @JsonProperty("ssl_attributes")
    @JsonInclude(Include.NON_NULL)
    private HealthMonitorSSLAttributes sslAttributes;



  /**
   * This is the getter method this will return the attribute value.
   * Attributes which will be retrieved.
   * Commas can be used to delimit more than one attributes (example- cn,address,email).
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return attributes
   */
  @VsoMethod
  public String getAttributes() {
    return attributes;
  }

  /**
   * This is the setter method to the attribute.
   * Attributes which will be retrieved.
   * Commas can be used to delimit more than one attributes (example- cn,address,email).
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param attributes set the attributes.
   */
  @VsoMethod
  public void setAttributes(String  attributes) {
    this.attributes = attributes;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Dn(distinguished name) of a directory entry.
   * Which will be starting point of the search.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return baseDn
   */
  @VsoMethod
  public String getBaseDn() {
    return baseDn;
  }

  /**
   * This is the setter method to the attribute.
   * Dn(distinguished name) of a directory entry.
   * Which will be starting point of the search.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param baseDn set the baseDn.
   */
  @VsoMethod
  public void setBaseDn(String  baseDn) {
    this.baseDn = baseDn;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Filter to search entries in specified scope.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return filter
   */
  @VsoMethod
  public String getFilter() {
    return filter;
  }

  /**
   * This is the setter method to the attribute.
   * Filter to search entries in specified scope.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param filter set the filter.
   */
  @VsoMethod
  public void setFilter(String  filter) {
    this.filter = filter;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Search scope which can be base, one, sub.
   * Enum options - LDAP_BASE_MODE, LDAP_ONE_MODE, LDAP_SUB_MODE.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scope
   */
  @VsoMethod
  public String getScope() {
    return scope;
  }

  /**
   * This is the setter method to the attribute.
   * Search scope which can be base, one, sub.
   * Enum options - LDAP_BASE_MODE, LDAP_ONE_MODE, LDAP_SUB_MODE.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param scope set the scope.
   */
  @VsoMethod
  public void setScope(String  scope) {
    this.scope = scope;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ssl attributes for ldaps monitor.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslAttributes
   */
  @VsoMethod
  public HealthMonitorSSLAttributes getSslAttributes() {
    return sslAttributes;
  }

  /**
   * This is the setter method to the attribute.
   * Ssl attributes for ldaps monitor.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sslAttributes set the sslAttributes.
   */
  @VsoMethod
  public void setSslAttributes(HealthMonitorSSLAttributes sslAttributes) {
    this.sslAttributes = sslAttributes;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  HealthMonitorLdap objHealthMonitorLdap = (HealthMonitorLdap) o;
  return   Objects.equals(this.baseDn, objHealthMonitorLdap.baseDn)&&
  Objects.equals(this.attributes, objHealthMonitorLdap.attributes)&&
  Objects.equals(this.scope, objHealthMonitorLdap.scope)&&
  Objects.equals(this.filter, objHealthMonitorLdap.filter)&&
  Objects.equals(this.sslAttributes, objHealthMonitorLdap.sslAttributes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class HealthMonitorLdap {\n");
      sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    baseDn: ").append(toIndentedString(baseDn)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    sslAttributes: ").append(toIndentedString(sslAttributes)).append("\n");
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

