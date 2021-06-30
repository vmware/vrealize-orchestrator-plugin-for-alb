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
 * The CertificateManagementProfile is a POJO class extends AviRestResource that used for creating
 * CertificateManagementProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CertificateManagementProfile")
@VsoFinder(name = Constants.FINDER_VRO_CERTIFICATEMANAGEMENTPROFILE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CertificateManagementProfile extends AviRestResource {
    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("run_script_ref")
    @JsonInclude(Include.NON_NULL)
    private String runScriptRef = null;

    @JsonProperty("script_params")
    @JsonInclude(Include.NON_NULL)
    private List<CustomParams> scriptParams = null;

    @JsonProperty("script_path")
    @JsonInclude(Include.NON_NULL)
    private String scriptPath;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.6.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public List<RoleFilterMatchLabel> getMarkers() {
    return markers;
  }

  /**
   * This is the setter method. this will set the markers
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.6.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public void setMarkers(List<RoleFilterMatchLabel>  markers) {
    this.markers = markers;
  }

  /**
   * This is the setter method this will set the markers
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.6.
   * Allowed in basic edition, essentials edition, enterprise edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public CertificateManagementProfile addMarkersItem(RoleFilterMatchLabel markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markers.add(markersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of the pki profile.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the pki profile.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Alert script config object for certificate management profile.
   * It is a reference to an object of type alertscriptconfig.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return runScriptRef
   */
  @VsoMethod
  public String getRunScriptRef() {
    return runScriptRef;
  }

  /**
   * This is the setter method to the attribute.
   * Alert script config object for certificate management profile.
   * It is a reference to an object of type alertscriptconfig.
   * Field introduced in 20.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param runScriptRef set the runScriptRef.
   */
  @VsoMethod
  public void setRunScriptRef(String  runScriptRef) {
    this.runScriptRef = runScriptRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property script_params of obj type certificatemanagementprofile field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scriptParams
   */
  @VsoMethod
  public List<CustomParams> getScriptParams() {
    return scriptParams;
  }

  /**
   * This is the setter method. this will set the scriptParams
   * Placeholder for description of property script_params of obj type certificatemanagementprofile field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scriptParams
   */
  @VsoMethod
  public void setScriptParams(List<CustomParams>  scriptParams) {
    this.scriptParams = scriptParams;
  }

  /**
   * This is the setter method this will set the scriptParams
   * Placeholder for description of property script_params of obj type certificatemanagementprofile field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scriptParams
   */
  @VsoMethod
  public CertificateManagementProfile addScriptParamsItem(CustomParams scriptParamsItem) {
    if (this.scriptParams == null) {
      this.scriptParams = new ArrayList<CustomParams>();
    }
    this.scriptParams.add(scriptParamsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 20.1.3.
   * @return scriptPath
   */
  @VsoMethod
  public String getScriptPath() {
    return scriptPath;
  }

  /**
   * This is the setter method to the attribute.
   * Field deprecated in 20.1.3.
   * @param scriptPath set the scriptPath.
   */
  @VsoMethod
  public void setScriptPath(String  scriptPath) {
    this.scriptPath = scriptPath;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
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
   * Unique object identifier of the object.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
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
  CertificateManagementProfile objCertificateManagementProfile = (CertificateManagementProfile) o;
  return   Objects.equals(this.uuid, objCertificateManagementProfile.uuid)&&
  Objects.equals(this.name, objCertificateManagementProfile.name)&&
  Objects.equals(this.scriptParams, objCertificateManagementProfile.scriptParams)&&
  Objects.equals(this.scriptPath, objCertificateManagementProfile.scriptPath)&&
  Objects.equals(this.runScriptRef, objCertificateManagementProfile.runScriptRef)&&
  Objects.equals(this.markers, objCertificateManagementProfile.markers)&&
  Objects.equals(this.tenantRef, objCertificateManagementProfile.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CertificateManagementProfile {\n");
      sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    runScriptRef: ").append(toIndentedString(runScriptRef)).append("\n");
        sb.append("    scriptParams: ").append(toIndentedString(scriptParams)).append("\n");
        sb.append("    scriptPath: ").append(toIndentedString(scriptPath)).append("\n");
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

