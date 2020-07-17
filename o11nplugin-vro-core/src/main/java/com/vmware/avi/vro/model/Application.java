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
 * The Application is a POJO class extends AviRestResource that used for creating
 * Application.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Application")
@VsoFinder(name = Constants.FINDER_VRO_APPLICATION, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Application extends AviRestResource {
  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;

  @JsonProperty("virtualservice_refs")
  @JsonInclude(Include.NON_NULL)
  private List<String> virtualserviceRefs = null;



  /**
   * This is the getter method this will return the attribute value.
   * User defined description for the object.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * User defined description for the object.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the object.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the object.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
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
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Unique object identifier of the object.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type virtualservice.
   * @return virtualserviceRefs
   */
  @VsoMethod
  public List<String> getVirtualserviceRefs() {
    return virtualserviceRefs;
  }

  /**
   * This is the setter method. this will set the virtualserviceRefs
   * It is a reference to an object of type virtualservice.
   * @return virtualserviceRefs
   */
  @VsoMethod
  public void setVirtualserviceRefs(List<String>  virtualserviceRefs) {
    this.virtualserviceRefs = virtualserviceRefs;
  }

  /**
   * This is the setter method this will set the virtualserviceRefs
   * It is a reference to an object of type virtualservice.
   * @return virtualserviceRefs
   */
  @VsoMethod
  public Application addVirtualserviceRefsItem(String virtualserviceRefsItem) {
    if (this.virtualserviceRefs == null) {
      this.virtualserviceRefs = new ArrayList<String>();
    }
    this.virtualserviceRefs.add(virtualserviceRefsItem);
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
  Application objApplication = (Application) o;
  return   Objects.equals(this.description, objApplication.description)&&
  Objects.equals(this.virtualserviceRefs, objApplication.virtualserviceRefs)&&
  Objects.equals(this.name, objApplication.name)&&
  Objects.equals(this.tenantRef, objApplication.tenantRef)&&
  Objects.equals(this.uuid, objApplication.uuid);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class Application {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    virtualserviceRefs: ").append(toIndentedString(virtualserviceRefs)).append("\n");
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

