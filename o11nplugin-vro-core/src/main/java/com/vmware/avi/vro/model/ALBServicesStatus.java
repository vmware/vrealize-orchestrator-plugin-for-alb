package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ALBServicesAssetDetails;
import com.vmware.avi.vro.model.TimeStamp;
import com.vmware.avi.vro.model.PulseServicesTenantStatus;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ALBServicesStatus is a POJO class extends AviRestResource that used for creating
 * ALBServicesStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ALBServicesStatus")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESSTATUS, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ALBServicesStatus extends AviRestResource {
    @JsonProperty("asset_details")
    @JsonInclude(Include.NON_NULL)
    private ALBServicesAssetDetails assetDetails;

    @JsonProperty("connected_at")
    @JsonInclude(Include.NON_NULL)
    private TimeStamp connectedAt;

    @JsonProperty("connectivity_status")
    @JsonInclude(Include.NON_NULL)
    private String connectivityStatus = "ALBSERVICES_CONNECTIVITY_UNKNOWN";

    @JsonProperty("error")
    @JsonInclude(Include.NON_NULL)
    private String error;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("registration_status")
    @JsonInclude(Include.NON_NULL)
    private String registrationStatus = "ALBSERVICES_REGISTRATION_UNKNOWN";

    @JsonProperty("services_health")
    @JsonInclude(Include.NON_NULL)
    private List<ServiceHealth> servicesHealth;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("tenant_status")
    @JsonInclude(Include.NON_NULL)
    private PulseServicesTenantStatus tenantStatus;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Asset details corresponding to this controller cluster, on registering with pulse.
   * Field introduced in 22.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return assetDetails
   */
  @VsoMethod
  public ALBServicesAssetDetails getAssetDetails() {
    return assetDetails;
  }

  /**
   * This is the setter method to the attribute.
   * Asset details corresponding to this controller cluster, on registering with pulse.
   * Field introduced in 22.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param assetDetails set the assetDetails.
   */
  @VsoMethod
  public void setAssetDetails(ALBServicesAssetDetails assetDetails) {
    this.assetDetails = assetDetails;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Timestamp of last successful connection.
   * Field introduced in 22.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connectedAt
   */
  @VsoMethod
  public TimeStamp getConnectedAt() {
    return connectedAt;
  }

  /**
   * This is the setter method to the attribute.
   * Timestamp of last successful connection.
   * Field introduced in 22.1.3.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param connectedAt set the connectedAt.
   */
  @VsoMethod
  public void setConnectedAt(TimeStamp connectedAt) {
    this.connectedAt = connectedAt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Connectivity status of controller with albservices.
   * Enum options - ALBSERVICES_CONNECTIVITY_UNKNOWN, ALBSERVICES_DISCONNECTED, ALBSERVICES_CONNECTED.
   * Field introduced in 18.2.6.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ALBSERVICES_CONNECTIVITY_UNKNOWN".
   * @return connectivityStatus
   */
  @VsoMethod
  public String getConnectivityStatus() {
    return connectivityStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Connectivity status of controller with albservices.
   * Enum options - ALBSERVICES_CONNECTIVITY_UNKNOWN, ALBSERVICES_DISCONNECTED, ALBSERVICES_CONNECTED.
   * Field introduced in 18.2.6.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ALBSERVICES_CONNECTIVITY_UNKNOWN".
   * @param connectivityStatus set the connectivityStatus.
   */
  @VsoMethod
  public void setConnectivityStatus(String  connectivityStatus) {
    this.connectivityStatus = connectivityStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Descriptive error message.
   * Field introduced in 18.2.6.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return error
   */
  @VsoMethod
  public String getError() {
    return error;
  }

  /**
   * This is the setter method to the attribute.
   * Descriptive error message.
   * Field introduced in 18.2.6.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param error set the error.
   */
  @VsoMethod
  public void setError(String  error) {
    this.error = error;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the albservicesstatus object.
   * Field introduced in 32.1.4.
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
   * Name of the albservicesstatus object.
   * Field introduced in 32.1.4.
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
   * Registration status of the controller with albservices.
   * Enum options - ALBSERVICES_REGISTRATION_UNKNOWN, ALBSERVICES_REGISTERED, ALBSERVICES_DEREGISTERED.
   * Field introduced in 18.2.6.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ALBSERVICES_REGISTRATION_UNKNOWN".
   * @return registrationStatus
   */
  @VsoMethod
  public String getRegistrationStatus() {
    return registrationStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Registration status of the controller with albservices.
   * Enum options - ALBSERVICES_REGISTRATION_UNKNOWN, ALBSERVICES_REGISTERED, ALBSERVICES_DEREGISTERED.
   * Field introduced in 18.2.6.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ALBSERVICES_REGISTRATION_UNKNOWN".
   * @param registrationStatus set the registrationStatus.
   */
  @VsoMethod
  public void setRegistrationStatus(String  registrationStatus) {
    this.registrationStatus = registrationStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Health of hosted services.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return servicesHealth
   */
  @VsoMethod
  public List<ServiceHealth> getServicesHealth() {
    return servicesHealth;
  }

  /**
   * This is the setter method. this will set the servicesHealth
   * Health of hosted services.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return servicesHealth
   */
  @VsoMethod
  public void setServicesHealth(List<ServiceHealth>  servicesHealth) {
    this.servicesHealth = servicesHealth;
  }

  /**
   * This is the setter method this will set the servicesHealth
   * Health of hosted services.
   * Field introduced in 20.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return servicesHealth
   */
  @VsoMethod
  public ALBServicesStatus addServicesHealthItem(ServiceHealth servicesHealthItem) {
    if (this.servicesHealth == null) {
      this.servicesHealth = new ArrayList<ServiceHealth>();
    }
    this.servicesHealth.add(servicesHealthItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Tenant uuid associated with the object.
   * It is a reference to an object of type tenant.
   * Field introduced in 30.1.1.
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
   * Tenant uuid associated with the object.
   * It is a reference to an object of type tenant.
   * Field introduced in 30.1.1.
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
   * Tenant based status information.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantStatus
   */
  @VsoMethod
  public PulseServicesTenantStatus getTenantStatus() {
    return tenantStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant based status information.
   * Field introduced in 30.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantStatus set the tenantStatus.
   */
  @VsoMethod
  public void setTenantStatus(PulseServicesTenantStatus tenantStatus) {
    this.tenantStatus = tenantStatus;
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
   * Unique identifier of customer portal status object in the database and datastore.
   * Field introduced in 18.2.6.
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
   * Unique identifier of customer portal status object in the database and datastore.
   * Field introduced in 18.2.6.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
  ALBServicesStatus objALBServicesStatus = (ALBServicesStatus) o;
  return   Objects.equals(this.uuid, objALBServicesStatus.uuid)&&
  Objects.equals(this.registrationStatus, objALBServicesStatus.registrationStatus)&&
  Objects.equals(this.connectivityStatus, objALBServicesStatus.connectivityStatus)&&
  Objects.equals(this.error, objALBServicesStatus.error)&&
  Objects.equals(this.servicesHealth, objALBServicesStatus.servicesHealth)&&
  Objects.equals(this.connectedAt, objALBServicesStatus.connectedAt)&&
  Objects.equals(this.assetDetails, objALBServicesStatus.assetDetails)&&
  Objects.equals(this.tenantRef, objALBServicesStatus.tenantRef)&&
  Objects.equals(this.tenantStatus, objALBServicesStatus.tenantStatus)&&
  Objects.equals(this.name, objALBServicesStatus.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ALBServicesStatus {\n");
      sb.append("    assetDetails: ").append(toIndentedString(assetDetails)).append("\n");
        sb.append("    connectedAt: ").append(toIndentedString(connectedAt)).append("\n");
        sb.append("    connectivityStatus: ").append(toIndentedString(connectivityStatus)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    registrationStatus: ").append(toIndentedString(registrationStatus)).append("\n");
        sb.append("    servicesHealth: ").append(toIndentedString(servicesHealth)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    tenantStatus: ").append(toIndentedString(tenantStatus)).append("\n");
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

