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
 * The CloudTenantsDeleted is a POJO class extends AviRestResource that used for creating
 * CloudTenantsDeleted.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CloudTenantsDeleted")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDTENANTSDELETED)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CloudTenantsDeleted extends AviRestResource {
    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId;

    @JsonProperty("tenants")
    @JsonInclude(Include.NON_NULL)
    private List<CloudTenantCleanup> tenants;

    @JsonProperty("vtype")
    @JsonInclude(Include.NON_NULL)
    private String vtype;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenants
   */
  @VsoMethod
  public List<CloudTenantCleanup> getTenants() {
    return tenants;
  }

  /**
   * This is the setter method. this will set the tenants
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenants
   */
  @VsoMethod
  public void setTenants(List<CloudTenantCleanup>  tenants) {
    this.tenants = tenants;
  }

  /**
   * This is the setter method this will set the tenants
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenants
   */
  @VsoMethod
  public CloudTenantsDeleted addTenantsItem(CloudTenantCleanup tenantsItem) {
    if (this.tenants == null) {
      this.tenants = new ArrayList<CloudTenantCleanup>();
    }
    this.tenants.add(tenantsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vtype
   */
  @VsoMethod
  public String getVtype() {
    return vtype;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP,
   * CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vtype set the vtype.
   */
  @VsoMethod
  public void setVtype(String  vtype) {
    this.vtype = vtype;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CloudTenantsDeleted objCloudTenantsDeleted = (CloudTenantsDeleted) o;
  return   Objects.equals(this.ccId, objCloudTenantsDeleted.ccId)&&
  Objects.equals(this.vtype, objCloudTenantsDeleted.vtype)&&
  Objects.equals(this.tenants, objCloudTenantsDeleted.tenants);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CloudTenantsDeleted {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
        sb.append("    vtype: ").append(toIndentedString(vtype)).append("\n");
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

