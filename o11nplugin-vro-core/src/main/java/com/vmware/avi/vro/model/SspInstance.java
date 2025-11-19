package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.SspResources;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The SspInstance is a POJO class extends AviRestResource that used for creating
 * SspInstance.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SspInstance")
@VsoFinder(name = Constants.FINDER_VRO_SSPINSTANCE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SspInstance extends AviRestResource {
    @JsonProperty("avi_client_cert")
    @JsonInclude(Include.NON_NULL)
    private String aviClientCert;

    @JsonProperty("client_cert")
    @JsonInclude(Include.NON_NULL)
    private String clientCert;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("feature")
    @JsonInclude(Include.NON_NULL)
    private String feature;

    @JsonProperty("hostname")
    @JsonInclude(Include.NON_NULL)
    private String hostname;

    @JsonProperty("ingress_cert")
    @JsonInclude(Include.NON_NULL)
    private String ingressCert;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("resources")
    @JsonInclude(Include.NON_NULL)
    private SspResources resources;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status;

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
   * Client certificate that avi uses to authenticate with the ssp instance.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return aviClientCert
   */
  @VsoMethod
  public String getAviClientCert() {
    return aviClientCert;
  }

  /**
   * This is the setter method to the attribute.
   * Client certificate that avi uses to authenticate with the ssp instance.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param aviClientCert set the aviClientCert.
   */
  @VsoMethod
  public void setAviClientCert(String  aviClientCert) {
    this.aviClientCert = aviClientCert;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Client certificate that the ssp instance uses to authenticate with avi.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientCert
   */
  @VsoMethod
  public String getClientCert() {
    return clientCert;
  }

  /**
   * This is the setter method to the attribute.
   * Client certificate that the ssp instance uses to authenticate with avi.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientCert set the clientCert.
   */
  @VsoMethod
  public void setClientCert(String  clientCert) {
    this.clientCert = clientCert;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Description of the onboarded ssp feature instance.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Description of the onboarded ssp feature instance.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of the ssp feature instance.
   * Enum options - SSP_INTELLIGENT_ASSIST, SSP_VDLS.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return feature
   */
  @VsoMethod
  public String getFeature() {
    return feature;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the ssp feature instance.
   * Enum options - SSP_INTELLIGENT_ASSIST, SSP_VDLS.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param feature set the feature.
   */
  @VsoMethod
  public void setFeature(String  feature) {
    this.feature = feature;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Hostname of the ssp feature instance.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostname
   */
  @VsoMethod
  public String getHostname() {
    return hostname;
  }

  /**
   * This is the setter method to the attribute.
   * Hostname of the ssp feature instance.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostname set the hostname.
   */
  @VsoMethod
  public void setHostname(String  hostname) {
    this.hostname = hostname;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Ingress (server) certificate chain that the ssp endpoint uses.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ingressCert
   */
  @VsoMethod
  public String getIngressCert() {
    return ingressCert;
  }

  /**
   * This is the setter method to the attribute.
   * Ingress (server) certificate chain that the ssp endpoint uses.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ingressCert set the ingressCert.
   */
  @VsoMethod
  public void setIngressCert(String  ingressCert) {
    this.ingressCert = ingressCert;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the onboarded ssp feature instance.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the onboarded ssp feature instance.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Resources associated with the ssp feature instance.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resources
   */
  @VsoMethod
  public SspResources getResources() {
    return resources;
  }

  /**
   * This is the setter method to the attribute.
   * Resources associated with the ssp feature instance.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resources set the resources.
   */
  @VsoMethod
  public void setResources(SspResources resources) {
    this.resources = resources;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status of the ssp feature instance.
   * Enum options - SSP_STATUS_IN_PROGRESS, SSP_STATUS_ACTIVE, SSP_STATUS_CERT_UPDATE_FAILED.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Status of the ssp feature instance.
   * Enum options - SSP_STATUS_IN_PROGRESS, SSP_STATUS_ACTIVE, SSP_STATUS_CERT_UPDATE_FAILED.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant reference for the ssp object.
   * It is a reference to an object of type tenant.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant reference for the ssp object.
   * It is a reference to an object of type tenant.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
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
   * Uuid for the onboarded ssp feature instance.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid for the onboarded ssp feature instance.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
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
  SspInstance objSspInstance = (SspInstance) o;
  return   Objects.equals(this.uuid, objSspInstance.uuid)&&
  Objects.equals(this.name, objSspInstance.name)&&
  Objects.equals(this.description, objSspInstance.description)&&
  Objects.equals(this.feature, objSspInstance.feature)&&
  Objects.equals(this.status, objSspInstance.status)&&
  Objects.equals(this.hostname, objSspInstance.hostname)&&
  Objects.equals(this.ingressCert, objSspInstance.ingressCert)&&
  Objects.equals(this.clientCert, objSspInstance.clientCert)&&
  Objects.equals(this.aviClientCert, objSspInstance.aviClientCert)&&
  Objects.equals(this.resources, objSspInstance.resources)&&
  Objects.equals(this.tenantRef, objSspInstance.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SspInstance {\n");
      sb.append("    aviClientCert: ").append(toIndentedString(aviClientCert)).append("\n");
        sb.append("    clientCert: ").append(toIndentedString(clientCert)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    ingressCert: ").append(toIndentedString(ingressCert)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

