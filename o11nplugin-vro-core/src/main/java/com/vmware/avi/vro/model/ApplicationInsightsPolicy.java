package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ApplicationInsightsParams;
import com.vmware.avi.vro.model.ApplicationSamplingConfig;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ApplicationInsightsPolicy is a POJO class extends AviRestResource that used for creating
 * ApplicationInsightsPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApplicationInsightsPolicy")
@VsoFinder(name = Constants.FINDER_VRO_APPLICATIONINSIGHTSPOLICY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApplicationInsightsPolicy extends AviRestResource {
    @JsonProperty("application_insights_params")
    @JsonInclude(Include.NON_NULL)
    private ApplicationInsightsParams applicationInsightsParams;

    @JsonProperty("application_sampling_config")
    @JsonInclude(Include.NON_NULL)
    private ApplicationSamplingConfig applicationSamplingConfig;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("enable_application_insights")
    @JsonInclude(Include.NON_NULL)
    private Boolean enableApplicationInsights = false;

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
   * Application insights parameters to filter application learning from clients.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return applicationInsightsParams
   */
  @VsoMethod
  public ApplicationInsightsParams getApplicationInsightsParams() {
    return applicationInsightsParams;
  }

  /**
   * This is the setter method to the attribute.
   * Application insights parameters to filter application learning from clients.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param applicationInsightsParams set the applicationInsightsParams.
   */
  @VsoMethod
  public void setApplicationInsightsParams(ApplicationInsightsParams applicationInsightsParams) {
    this.applicationInsightsParams = applicationInsightsParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Application sampling configuration to control rate and volume of data ingestion for application insights that the serviceengines are expected to
   * send to the controller.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return applicationSamplingConfig
   */
  @VsoMethod
  public ApplicationSamplingConfig getApplicationSamplingConfig() {
    return applicationSamplingConfig;
  }

  /**
   * This is the setter method to the attribute.
   * Application sampling configuration to control rate and volume of data ingestion for application insights that the serviceengines are expected to
   * send to the controller.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param applicationSamplingConfig set the applicationSamplingConfig.
   */
  @VsoMethod
  public void setApplicationSamplingConfig(ApplicationSamplingConfig applicationSamplingConfig) {
    this.applicationSamplingConfig = applicationSamplingConfig;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Details of the application insights configuration.
   * Field introduced in 31.2.1.
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
   * Details of the application insights configuration.
   * Field introduced in 31.2.1.
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
   * Enable application insights, formerly called learning for this virtual service.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return enableApplicationInsights
   */
  @VsoMethod
  public Boolean getEnableApplicationInsights() {
    return enableApplicationInsights;
  }

  /**
   * This is the setter method to the attribute.
   * Enable application insights, formerly called learning for this virtual service.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param enableApplicationInsights set the enableApplicationInsights.
   */
  @VsoMethod
  public void setEnableApplicationInsights(Boolean  enableApplicationInsights) {
    this.enableApplicationInsights = enableApplicationInsights;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the application insights configuration.
   * Field introduced in 31.2.1.
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
   * The name of the application insights configuration.
   * Field introduced in 31.2.1.
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
   * Details of the tenant for the application insights configuration.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.2.1.
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
   * Details of the tenant for the application insights configuration.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.2.1.
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
   * Uuid of the application insights configuration.
   * Field introduced in 31.2.1.
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
   * Uuid of the application insights configuration.
   * Field introduced in 31.2.1.
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
  ApplicationInsightsPolicy objApplicationInsightsPolicy = (ApplicationInsightsPolicy) o;
  return   Objects.equals(this.uuid, objApplicationInsightsPolicy.uuid)&&
  Objects.equals(this.name, objApplicationInsightsPolicy.name)&&
  Objects.equals(this.description, objApplicationInsightsPolicy.description)&&
  Objects.equals(this.tenantRef, objApplicationInsightsPolicy.tenantRef)&&
  Objects.equals(this.enableApplicationInsights, objApplicationInsightsPolicy.enableApplicationInsights)&&
  Objects.equals(this.applicationInsightsParams, objApplicationInsightsPolicy.applicationInsightsParams)&&
  Objects.equals(this.applicationSamplingConfig, objApplicationInsightsPolicy.applicationSamplingConfig);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApplicationInsightsPolicy {\n");
      sb.append("    applicationInsightsParams: ").append(toIndentedString(applicationInsightsParams)).append("\n");
        sb.append("    applicationSamplingConfig: ").append(toIndentedString(applicationSamplingConfig)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enableApplicationInsights: ").append(toIndentedString(enableApplicationInsights)).append("\n");
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

