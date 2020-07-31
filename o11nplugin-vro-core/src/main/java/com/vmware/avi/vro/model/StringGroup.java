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
 * The StringGroup is a POJO class extends AviRestResource that used for creating
 * StringGroup.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "StringGroup")
@VsoFinder(name = Constants.FINDER_VRO_STRINGGROUP, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class StringGroup extends AviRestResource {
  @JsonProperty("description")
  @JsonInclude(Include.NON_NULL)
  private String description = null;

  @JsonProperty("kv")
  @JsonInclude(Include.NON_NULL)
  private List<KeyValue> kv = null;

  @JsonProperty("longest_match")
  @JsonInclude(Include.NON_NULL)
  private Boolean longestMatch = false;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("tenant_ref")
  @JsonInclude(Include.NON_NULL)
  private String tenantRef = null;

  @JsonProperty("type")
  @JsonInclude(Include.NON_NULL)
  private String type = "SG_TYPE_STRING";

  @JsonProperty("url")
  @JsonInclude(Include.NON_NULL)
  private String url = "url";

  @JsonProperty("uuid")
  @JsonInclude(Include.NON_NULL)
  private String uuid = null;



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
   * Configure key value in the string group.
   * @return kv
   */
  @VsoMethod
  public List<KeyValue> getKv() {
    return kv;
  }

  /**
   * This is the setter method. this will set the kv
   * Configure key value in the string group.
   * @return kv
   */
  @VsoMethod
  public void setKv(List<KeyValue>  kv) {
    this.kv = kv;
  }

  /**
   * This is the setter method this will set the kv
   * Configure key value in the string group.
   * @return kv
   */
  @VsoMethod
  public StringGroup addKvItem(KeyValue kvItem) {
    if (this.kv == null) {
      this.kv = new ArrayList<KeyValue>();
    }
    this.kv.add(kvItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enable the longest match, default is the shortest match.
   * Field introduced in 18.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return longestMatch
   */
  @VsoMethod
  public Boolean getLongestMatch() {
    return longestMatch;
  }

  /**
   * This is the setter method to the attribute.
   * Enable the longest match, default is the shortest match.
   * Field introduced in 18.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param longestMatch set the longestMatch.
   */
  @VsoMethod
  public void setLongestMatch(Boolean  longestMatch) {
    this.longestMatch = longestMatch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the string group.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the string group.
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
   * Type of stringgroup.
   * Enum options - SG_TYPE_STRING, SG_TYPE_KEYVAL.
   * Default value when not specified in API or module is interpreted by Avi Controller as SG_TYPE_STRING.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of stringgroup.
   * Enum options - SG_TYPE_STRING, SG_TYPE_KEYVAL.
   * Default value when not specified in API or module is interpreted by Avi Controller as SG_TYPE_STRING.
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
   * Uuid of the string group.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the string group.
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
  StringGroup objStringGroup = (StringGroup) o;
  return   Objects.equals(this.uuid, objStringGroup.uuid)&&
  Objects.equals(this.name, objStringGroup.name)&&
  Objects.equals(this.kv, objStringGroup.kv)&&
  Objects.equals(this.type, objStringGroup.type)&&
  Objects.equals(this.longestMatch, objStringGroup.longestMatch)&&
  Objects.equals(this.description, objStringGroup.description)&&
  Objects.equals(this.tenantRef, objStringGroup.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class StringGroup {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    kv: ").append(toIndentedString(kv)).append("\n");
        sb.append("    longestMatch: ").append(toIndentedString(longestMatch)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

