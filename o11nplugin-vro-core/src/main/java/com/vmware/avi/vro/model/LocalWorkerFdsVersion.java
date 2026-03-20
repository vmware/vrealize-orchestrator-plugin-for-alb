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
 * The LocalWorkerFdsVersion is a POJO class extends AviRestResource that used for creating
 * LocalWorkerFdsVersion.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LocalWorkerFdsVersion")
@VsoFinder(name = Constants.FINDER_VRO_LOCALWORKERFDSVERSION, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LocalWorkerFdsVersion extends AviRestResource {
    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = "default";

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("timeline")
    @JsonInclude(Include.NON_NULL)
    private String timeline;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private Integer version = 0;



  /**
   * This is the getter method this will return the attribute value.
   * Default glw fds version name.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default".
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Default glw fds version name.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default".
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.1.1.
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
   * Uuid of the tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.1.1.
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
   * Fds timeline maintained by glw.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return timeline
   */
  @VsoMethod
  public String getTimeline() {
    return timeline;
  }

  /**
   * This is the setter method to the attribute.
   * Fds timeline maintained by glw.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param timeline set the timeline.
   */
  @VsoMethod
  public void setTimeline(String  timeline) {
    this.timeline = timeline;
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
   * Default glw fds version uuid.
   * Field introduced in 31.1.1.
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
   * Default glw fds version uuid.
   * Field introduced in 31.1.1.
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
   * Fds version maintained by glw.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @return version
   */
  @VsoMethod
  public Integer getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Fds version maintained by glw.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 0.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(Integer  version) {
    this.version = version;
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
  LocalWorkerFdsVersion objLocalWorkerFdsVersion = (LocalWorkerFdsVersion) o;
  return   Objects.equals(this.uuid, objLocalWorkerFdsVersion.uuid)&&
  Objects.equals(this.name, objLocalWorkerFdsVersion.name)&&
  Objects.equals(this.version, objLocalWorkerFdsVersion.version)&&
  Objects.equals(this.timeline, objLocalWorkerFdsVersion.timeline)&&
  Objects.equals(this.tenantRef, objLocalWorkerFdsVersion.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LocalWorkerFdsVersion {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

