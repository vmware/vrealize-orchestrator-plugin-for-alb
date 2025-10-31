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
 * The AvailabilityZone is a POJO class extends AviRestResource that used for creating
 * AvailabilityZone.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AvailabilityZone")
@VsoFinder(name = Constants.FINDER_VRO_AVAILABILITYZONE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AvailabilityZone extends AviRestResource {
    @JsonProperty("az_clusters")
    @JsonInclude(Include.NON_NULL)
    private List<AZCluster> azClusters;

    @JsonProperty("az_datastores")
    @JsonInclude(Include.NON_NULL)
    private List<AZDatastore> azDatastores;

    @JsonProperty("az_hosts")
    @JsonInclude(Include.NON_NULL)
    private List<AZHost> azHosts;

    @JsonProperty("cloud_ref")
    @JsonInclude(Include.NON_NULL)
    private String cloudRef;

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

    @JsonProperty("vsphere_zones")
    @JsonInclude(Include.NON_NULL)
    private List<VSphereZone> vsphereZones;



  /**
   * This is the getter method this will return the attribute value.
   * Group of clusters belongs to the az.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return azClusters
   */
  @VsoMethod
  public List<AZCluster> getAzClusters() {
    return azClusters;
  }

  /**
   * This is the setter method. this will set the azClusters
   * Group of clusters belongs to the az.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return azClusters
   */
  @VsoMethod
  public void setAzClusters(List<AZCluster>  azClusters) {
    this.azClusters = azClusters;
  }

  /**
   * This is the setter method this will set the azClusters
   * Group of clusters belongs to the az.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return azClusters
   */
  @VsoMethod
  public AvailabilityZone addAzClustersItem(AZCluster azClustersItem) {
    if (this.azClusters == null) {
      this.azClusters = new ArrayList<AZCluster>();
    }
    this.azClusters.add(azClustersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Group of datastores associated with the az.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return azDatastores
   */
  @VsoMethod
  public List<AZDatastore> getAzDatastores() {
    return azDatastores;
  }

  /**
   * This is the setter method. this will set the azDatastores
   * Group of datastores associated with the az.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return azDatastores
   */
  @VsoMethod
  public void setAzDatastores(List<AZDatastore>  azDatastores) {
    this.azDatastores = azDatastores;
  }

  /**
   * This is the setter method this will set the azDatastores
   * Group of datastores associated with the az.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return azDatastores
   */
  @VsoMethod
  public AvailabilityZone addAzDatastoresItem(AZDatastore azDatastoresItem) {
    if (this.azDatastores == null) {
      this.azDatastores = new ArrayList<AZDatastore>();
    }
    this.azDatastores.add(azDatastoresItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Group of hosts associated with the az.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return azHosts
   */
  @VsoMethod
  public List<AZHost> getAzHosts() {
    return azHosts;
  }

  /**
   * This is the setter method. this will set the azHosts
   * Group of hosts associated with the az.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return azHosts
   */
  @VsoMethod
  public void setAzHosts(List<AZHost>  azHosts) {
    this.azHosts = azHosts;
  }

  /**
   * This is the setter method this will set the azHosts
   * Group of hosts associated with the az.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return azHosts
   */
  @VsoMethod
  public AvailabilityZone addAzHostsItem(AZHost azHostsItem) {
    if (this.azHosts == null) {
      this.azHosts = new ArrayList<AZHost>();
    }
    this.azHosts.add(azHostsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Availability zone belongs to cloud.
   * It is a reference to an object of type cloud.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cloudRef
   */
  @VsoMethod
  public String getCloudRef() {
    return cloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * Availability zone belongs to cloud.
   * It is a reference to an object of type cloud.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cloudRef set the cloudRef.
   */
  @VsoMethod
  public void setCloudRef(String  cloudRef) {
    this.cloudRef = cloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Availabilty zone where vcenter list belongs to.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Availabilty zone where vcenter list belongs to.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Availabilityzone belongs to tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Availabilityzone belongs to tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
   * Availability zone config uuid.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Availability zone config uuid.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Vsphere zone associated with the az.
   * Field introduced in 32.1.1.
   * Maximum of 1 items allowed.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsphereZones
   */
  @VsoMethod
  public List<VSphereZone> getVsphereZones() {
    return vsphereZones;
  }

  /**
   * This is the setter method. this will set the vsphereZones
   * Vsphere zone associated with the az.
   * Field introduced in 32.1.1.
   * Maximum of 1 items allowed.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsphereZones
   */
  @VsoMethod
  public void setVsphereZones(List<VSphereZone>  vsphereZones) {
    this.vsphereZones = vsphereZones;
  }

  /**
   * This is the setter method this will set the vsphereZones
   * Vsphere zone associated with the az.
   * Field introduced in 32.1.1.
   * Maximum of 1 items allowed.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsphereZones
   */
  @VsoMethod
  public AvailabilityZone addVsphereZonesItem(VSphereZone vsphereZonesItem) {
    if (this.vsphereZones == null) {
      this.vsphereZones = new ArrayList<VSphereZone>();
    }
    this.vsphereZones.add(vsphereZonesItem);
    return this;
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
  AvailabilityZone objAvailabilityZone = (AvailabilityZone) o;
  return   Objects.equals(this.uuid, objAvailabilityZone.uuid)&&
  Objects.equals(this.name, objAvailabilityZone.name)&&
  Objects.equals(this.tenantRef, objAvailabilityZone.tenantRef)&&
  Objects.equals(this.cloudRef, objAvailabilityZone.cloudRef)&&
  Objects.equals(this.azClusters, objAvailabilityZone.azClusters)&&
  Objects.equals(this.azHosts, objAvailabilityZone.azHosts)&&
  Objects.equals(this.azDatastores, objAvailabilityZone.azDatastores)&&
  Objects.equals(this.vsphereZones, objAvailabilityZone.vsphereZones);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AvailabilityZone {\n");
      sb.append("    azClusters: ").append(toIndentedString(azClusters)).append("\n");
        sb.append("    azDatastores: ").append(toIndentedString(azDatastores)).append("\n");
        sb.append("    azHosts: ").append(toIndentedString(azHosts)).append("\n");
        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vsphereZones: ").append(toIndentedString(vsphereZones)).append("\n");
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

