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
 * The ErrorPageBody is a POJO class extends AviRestResource that used for creating
 * ErrorPageBody.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ErrorPageBody")
@VsoFinder(name = Constants.FINDER_VRO_ERRORPAGEBODY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ErrorPageBody extends AviRestResource {
    @JsonProperty("error_page_body")
    @JsonInclude(Include.NON_NULL)
    private String errorPageBody = null;

    @JsonProperty("format")
    @JsonInclude(Include.NON_NULL)
    private String format = "ERROR_PAGE_FORMAT_HTML";

    @JsonProperty("labels")
    @JsonInclude(Include.NON_NULL)
    private List<KeyValue> labels;

    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers = null;

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



  /**
   * This is the getter method this will return the attribute value.
   * Error page body sent to client when match.
   * Field introduced in 17.2.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorPageBody
   */
  @VsoMethod
  public String getErrorPageBody() {
    return errorPageBody;
  }

  /**
   * This is the setter method to the attribute.
   * Error page body sent to client when match.
   * Field introduced in 17.2.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorPageBody set the errorPageBody.
   */
  @VsoMethod
  public void setErrorPageBody(String  errorPageBody) {
    this.errorPageBody = errorPageBody;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Format of an error page body html or json.
   * Enum options - ERROR_PAGE_FORMAT_HTML, ERROR_PAGE_FORMAT_JSON.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ERROR_PAGE_FORMAT_HTML".
   * @return format
   */
  @VsoMethod
  public String getFormat() {
    return format;
  }

  /**
   * This is the setter method to the attribute.
   * Format of an error page body html or json.
   * Enum options - ERROR_PAGE_FORMAT_HTML, ERROR_PAGE_FORMAT_JSON.
   * Field introduced in 18.2.3.
   * Default value when not specified in API or module is interpreted by Avi Controller as "ERROR_PAGE_FORMAT_HTML".
   * @param format set the format.
   */
  @VsoMethod
  public void setFormat(String  format) {
    this.format = format;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Key value pairs for granular object access control.
   * Also allows for classification and tagging of similar objects.
   * Field deprecated in 20.1.5.
   * Field introduced in 20.1.2.
   * Maximum of 4 items allowed.
   * @return labels
   */
  @VsoMethod
  public List<KeyValue> getLabels() {
    return labels;
  }

  /**
   * This is the setter method. this will set the labels
   * Key value pairs for granular object access control.
   * Also allows for classification and tagging of similar objects.
   * Field deprecated in 20.1.5.
   * Field introduced in 20.1.2.
   * Maximum of 4 items allowed.
   * @return labels
   */
  @VsoMethod
  public void setLabels(List<KeyValue>  labels) {
    this.labels = labels;
  }

  /**
   * This is the setter method this will set the labels
   * Key value pairs for granular object access control.
   * Also allows for classification and tagging of similar objects.
   * Field deprecated in 20.1.5.
   * Field introduced in 20.1.2.
   * Maximum of 4 items allowed.
   * @return labels
   */
  @VsoMethod
  public ErrorPageBody addLabelsItem(KeyValue labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<KeyValue>();
    }
    this.labels.add(labelsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.5.
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
   * Field introduced in 20.1.5.
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
   * Field introduced in 20.1.5.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public ErrorPageBody addMarkersItem(RoleFilterMatchLabel markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markers.add(markersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Field introduced in 17.2.4.
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
   * Field introduced in 17.2.4.
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
   * Field introduced in 17.2.4.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.4.
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
  ErrorPageBody objErrorPageBody = (ErrorPageBody) o;
  return   Objects.equals(this.uuid, objErrorPageBody.uuid)&&
  Objects.equals(this.name, objErrorPageBody.name)&&
  Objects.equals(this.tenantRef, objErrorPageBody.tenantRef)&&
  Objects.equals(this.errorPageBody, objErrorPageBody.errorPageBody)&&
  Objects.equals(this.format, objErrorPageBody.format)&&
  Objects.equals(this.labels, objErrorPageBody.labels)&&
  Objects.equals(this.markers, objErrorPageBody.markers);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ErrorPageBody {\n");
      sb.append("    errorPageBody: ").append(toIndentedString(errorPageBody)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
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

