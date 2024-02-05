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
 * The TenantSystemConfiguration is a POJO class extends AviRestResource that used for creating
 * TenantSystemConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TenantSystemConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_TENANTSYSTEMCONFIGURATION, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TenantSystemConfiguration extends AviRestResource {
    @JsonProperty("dns_virtualservice_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> dnsVirtualserviceRefs;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Dns virtual services hosting fqdn records for applications configured within this tenant.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsVirtualserviceRefs
   */
  @VsoMethod
  public List<String> getDnsVirtualserviceRefs() {
    return dnsVirtualserviceRefs;
  }

  /**
   * This is the setter method. this will set the dnsVirtualserviceRefs
   * Dns virtual services hosting fqdn records for applications configured within this tenant.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsVirtualserviceRefs
   */
  @VsoMethod
  public void setDnsVirtualserviceRefs(List<String>  dnsVirtualserviceRefs) {
    this.dnsVirtualserviceRefs = dnsVirtualserviceRefs;
  }

  /**
   * This is the setter method this will set the dnsVirtualserviceRefs
   * Dns virtual services hosting fqdn records for applications configured within this tenant.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dnsVirtualserviceRefs
   */
  @VsoMethod
  public TenantSystemConfiguration addDnsVirtualserviceRefsItem(String dnsVirtualserviceRefsItem) {
    if (this.dnsVirtualserviceRefs == null) {
      this.dnsVirtualserviceRefs = new ArrayList<String>();
    }
    this.dnsVirtualserviceRefs.add(dnsVirtualserviceRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of the tenant system configuration object.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the tenant system configuration object.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique identifier of the tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Unique identifier of the tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant system configuration uuid.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant system configuration uuid.
   * Field introduced in 30.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TenantSystemConfiguration objTenantSystemConfiguration = (TenantSystemConfiguration) o;
  return   Objects.equals(this.uuid, objTenantSystemConfiguration.uuid)&&
  Objects.equals(this.name, objTenantSystemConfiguration.name)&&
  Objects.equals(this.tenantRef, objTenantSystemConfiguration.tenantRef)&&
  Objects.equals(this.dnsVirtualserviceRefs, objTenantSystemConfiguration.dnsVirtualserviceRefs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TenantSystemConfiguration {\n");
      sb.append("    dnsVirtualserviceRefs: ").append(toIndentedString(dnsVirtualserviceRefs)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

