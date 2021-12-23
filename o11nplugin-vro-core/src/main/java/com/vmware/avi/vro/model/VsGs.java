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
 * The VsGs is a POJO class extends AviRestResource that used for creating
 * VsGs.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VsGs")
@VsoFinder(name = Constants.FINDER_VRO_VSGS, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VsGs extends AviRestResource {
    @JsonProperty("geodb_uuid")
    @JsonInclude(Include.NON_NULL)
    private String geodbUuid = null;

    @JsonProperty("gs_uuid")
    @JsonInclude(Include.NON_NULL)
    private String gsUuid = null;

    @JsonProperty("gslb_uuid")
    @JsonInclude(Include.NON_NULL)
    private String gslbUuid = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;

    @JsonProperty("vs_uuid")
    @JsonInclude(Include.NON_NULL)
    private String vsUuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Gslb geodb being associated using this object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return geodbUuid
   */
  @VsoMethod
  public String getGeodbUuid() {
    return geodbUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Gslb geodb being associated using this object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param geodbUuid set the geodbUuid.
   */
  @VsoMethod
  public void setGeodbUuid(String  geodbUuid) {
    this.geodbUuid = geodbUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Gslb service being associated using this object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gsUuid
   */
  @VsoMethod
  public String getGsUuid() {
    return gsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Gslb service being associated using this object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gsUuid set the gsUuid.
   */
  @VsoMethod
  public void setGsUuid(String  gsUuid) {
    this.gsUuid = gsUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Gslb being associated using this object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gslbUuid
   */
  @VsoMethod
  public String getGslbUuid() {
    return gslbUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Gslb being associated using this object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gslbUuid set the gslbUuid.
   */
  @VsoMethod
  public void setGslbUuid(String  gslbUuid) {
    this.gslbUuid = gslbUuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the vs-gs association object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the vs-gs association object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant.
   * It is a reference to an object of type tenant.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of the vs-gs association object.
   * Enum options - VSGS_TYPE_GSLB, VSGS_TYPE_GS, VSGS_TYPE_GEO_DB.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the vs-gs association object.
   * Enum options - VSGS_TYPE_GSLB, VSGS_TYPE_GS, VSGS_TYPE_GEO_DB.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
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
   * Uuid of the vs-gs association object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the vs-gs association object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtual service being associated using this object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsUuid
   */
  @VsoMethod
  public String getVsUuid() {
    return vsUuid;
  }

  /**
   * This is the setter method to the attribute.
   * Virtual service being associated using this object.
   * Field introduced in 21.1.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsUuid set the vsUuid.
   */
  @VsoMethod
  public void setVsUuid(String  vsUuid) {
    this.vsUuid = vsUuid;
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
  VsGs objVsGs = (VsGs) o;
  return   Objects.equals(this.uuid, objVsGs.uuid)&&
  Objects.equals(this.name, objVsGs.name)&&
  Objects.equals(this.type, objVsGs.type)&&
  Objects.equals(this.vsUuid, objVsGs.vsUuid)&&
  Objects.equals(this.gslbUuid, objVsGs.gslbUuid)&&
  Objects.equals(this.gsUuid, objVsGs.gsUuid)&&
  Objects.equals(this.geodbUuid, objVsGs.geodbUuid)&&
  Objects.equals(this.tenantRef, objVsGs.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VsGs {\n");
      sb.append("    geodbUuid: ").append(toIndentedString(geodbUuid)).append("\n");
        sb.append("    gsUuid: ").append(toIndentedString(gsUuid)).append("\n");
        sb.append("    gslbUuid: ").append(toIndentedString(gslbUuid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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

