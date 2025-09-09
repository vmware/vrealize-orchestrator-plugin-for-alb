package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ApplicationSamplingRuntime;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ApplicationInsightsState is a POJO class extends AviRestResource that used for creating
 * ApplicationInsightsState.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApplicationInsightsState")
@VsoFinder(name = Constants.FINDER_VRO_APPLICATIONINSIGHTSSTATE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApplicationInsightsState extends AviRestResource {
    @JsonProperty("application_insights_uuid")
    @JsonInclude(Include.NON_NULL)
    private String applicationInsightsUuid;

    @JsonProperty("application_sampling_runtime")
    @JsonInclude(Include.NON_NULL)
    private ApplicationSamplingRuntime applicationSamplingRuntime;

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
   * Uuid of the application insights policy.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return applicationInsightsUuid
   */
  @VsoMethod
  public String getApplicationInsightsUuid() {
    return applicationInsightsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the application insights policy.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param applicationInsightsUuid set the applicationInsightsUuid.
   */
  @VsoMethod
  public void setApplicationInsightsUuid(String  applicationInsightsUuid) {
    this.applicationInsightsUuid = applicationInsightsUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Runtime application sampling configuration to control rate and volume of data ingestion for application insights.
   * Controller updates the configuration based on the application traffic and the associated serviceengine load.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return applicationSamplingRuntime
   */
  @VsoMethod
  public ApplicationSamplingRuntime getApplicationSamplingRuntime() {
    return applicationSamplingRuntime;
  }

  /**
   * This is the setter method to the attribute.
   * Runtime application sampling configuration to control rate and volume of data ingestion for application insights.
   * Controller updates the configuration based on the application traffic and the associated serviceengine load.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param applicationSamplingRuntime set the applicationSamplingRuntime.
   */
  @VsoMethod
  public void setApplicationSamplingRuntime(ApplicationSamplingRuntime applicationSamplingRuntime) {
    this.applicationSamplingRuntime = applicationSamplingRuntime;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The name of the application insights state configuration.
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
   * The name of the application insights state configuration.
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
   * Details of the tenant for the application insights state.
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
   * Details of the tenant for the application insights state.
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
   * Uuid of the applicationinsightsstate.
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
   * Uuid of the applicationinsightsstate.
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
  ApplicationInsightsState objApplicationInsightsState = (ApplicationInsightsState) o;
  return   Objects.equals(this.uuid, objApplicationInsightsState.uuid)&&
  Objects.equals(this.name, objApplicationInsightsState.name)&&
  Objects.equals(this.applicationInsightsUuid, objApplicationInsightsState.applicationInsightsUuid)&&
  Objects.equals(this.applicationSamplingRuntime, objApplicationInsightsState.applicationSamplingRuntime)&&
  Objects.equals(this.tenantRef, objApplicationInsightsState.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApplicationInsightsState {\n");
      sb.append("    applicationInsightsUuid: ").append(toIndentedString(applicationInsightsUuid)).append("\n");
        sb.append("    applicationSamplingRuntime: ").append(toIndentedString(applicationSamplingRuntime)).append("\n");
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

