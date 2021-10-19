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
 * The CustomIpamDnsProfile is a POJO class extends AviRestResource that used for creating
 * CustomIpamDnsProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CustomIpamDnsProfile")
@VsoFinder(name = Constants.FINDER_VRO_CUSTOMIPAMDNSPROFILE, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CustomIpamDnsProfile extends AviRestResource {
    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("script_params")
    @JsonInclude(Include.NON_NULL)
    private List<CustomParams> scriptParams = null;

    @JsonProperty("script_uri")
    @JsonInclude(Include.NON_NULL)
    private String scriptUri = null;

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
   * Name of the custom ipam dns profile.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the custom ipam dns profile.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Parameters that are always passed to the ipam/dns script.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scriptParams
   */
  @VsoMethod
  public List<CustomParams> getScriptParams() {
    return scriptParams;
  }

  /**
   * This is the setter method. this will set the scriptParams
   * Parameters that are always passed to the ipam/dns script.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scriptParams
   */
  @VsoMethod
  public void setScriptParams(List<CustomParams>  scriptParams) {
    this.scriptParams = scriptParams;
  }

  /**
   * This is the setter method this will set the scriptParams
   * Parameters that are always passed to the ipam/dns script.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scriptParams
   */
  @VsoMethod
  public CustomIpamDnsProfile addScriptParamsItem(CustomParams scriptParamsItem) {
    if (this.scriptParams == null) {
      this.scriptParams = new ArrayList<CustomParams>();
    }
    this.scriptParams.add(scriptParamsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Script uri of form controller //ipamdnsscripts/<file-name>, file-name must have a .py extension and conform to pep8 naming convention.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return scriptUri
   */
  @VsoMethod
  public String getScriptUri() {
    return scriptUri;
  }

  /**
   * This is the setter method to the attribute.
   * Script uri of form controller //ipamdnsscripts/<file-name>, file-name must have a .py extension and conform to pep8 naming convention.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param scriptUri set the scriptUri.
   */
  @VsoMethod
  public void setScriptUri(String  scriptUri) {
    this.scriptUri = scriptUri;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Field introduced in 17.1.1.
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
   * Field introduced in 17.1.1.
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
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.1.1.
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
  CustomIpamDnsProfile objCustomIpamDnsProfile = (CustomIpamDnsProfile) o;
  return   Objects.equals(this.uuid, objCustomIpamDnsProfile.uuid)&&
  Objects.equals(this.name, objCustomIpamDnsProfile.name)&&
  Objects.equals(this.scriptUri, objCustomIpamDnsProfile.scriptUri)&&
  Objects.equals(this.scriptParams, objCustomIpamDnsProfile.scriptParams)&&
  Objects.equals(this.tenantRef, objCustomIpamDnsProfile.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CustomIpamDnsProfile {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scriptParams: ").append(toIndentedString(scriptParams)).append("\n");
        sb.append("    scriptUri: ").append(toIndentedString(scriptUri)).append("\n");
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

