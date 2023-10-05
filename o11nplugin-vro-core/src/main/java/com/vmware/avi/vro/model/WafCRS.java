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
 * The WafCRS is a POJO class extends AviRestResource that used for creating
 * WafCRS.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WafCRS")
@VsoFinder(name = Constants.FINDER_VRO_WAFCRS, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WafCRS extends AviRestResource {
    @JsonProperty("allowed_request_content_type_charsets")
    @JsonInclude(Include.NON_NULL)
    private List<String> allowedRequestContentTypeCharsets = null;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description = null;

    @JsonProperty("files")
    @JsonInclude(Include.NON_NULL)
    private List<WafDataFile> files = null;

    @JsonProperty("groups")
    @JsonInclude(Include.NON_NULL)
    private List<WafRuleGroup> groups = null;

    @JsonProperty("integrity")
    @JsonInclude(Include.NON_NULL)
    private String integrity = null;

    @JsonProperty("integrity_values")
    @JsonInclude(Include.NON_NULL)
    private List<String> integrityValues = null;

    @JsonProperty("markers")
    @JsonInclude(Include.NON_NULL)
    private List<RoleFilterMatchLabel> markers = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("release_date")
    @JsonInclude(Include.NON_NULL)
    private String releaseDate = null;

    @JsonProperty("restricted_extensions")
    @JsonInclude(Include.NON_NULL)
    private List<String> restrictedExtensions = null;

    @JsonProperty("restricted_headers")
    @JsonInclude(Include.NON_NULL)
    private List<String> restrictedHeaders = null;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private String version = null;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed request content type character sets in waf.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowedRequestContentTypeCharsets
   */
  @VsoMethod
  public List<String> getAllowedRequestContentTypeCharsets() {
    return allowedRequestContentTypeCharsets;
  }

  /**
   * This is the setter method. this will set the allowedRequestContentTypeCharsets
   * Allowed request content type character sets in waf.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowedRequestContentTypeCharsets
   */
  @VsoMethod
  public void setAllowedRequestContentTypeCharsets(List<String>  allowedRequestContentTypeCharsets) {
    this.allowedRequestContentTypeCharsets = allowedRequestContentTypeCharsets;
  }

  /**
   * This is the setter method this will set the allowedRequestContentTypeCharsets
   * Allowed request content type character sets in waf.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return allowedRequestContentTypeCharsets
   */
  @VsoMethod
  public WafCRS addAllowedRequestContentTypeCharsetsItem(String allowedRequestContentTypeCharsetsItem) {
    if (this.allowedRequestContentTypeCharsets == null) {
      this.allowedRequestContentTypeCharsets = new ArrayList<String>();
    }
    this.allowedRequestContentTypeCharsets.add(allowedRequestContentTypeCharsetsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * A short description of this ruleset.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * A short description of this ruleset.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of data files used for waf rules.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return files
   */
  @VsoMethod
  public List<WafDataFile> getFiles() {
    return files;
  }

  /**
   * This is the setter method. this will set the files
   * List of data files used for waf rules.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return files
   */
  @VsoMethod
  public void setFiles(List<WafDataFile>  files) {
    this.files = files;
  }

  /**
   * This is the setter method this will set the files
   * List of data files used for waf rules.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return files
   */
  @VsoMethod
  public WafCRS addFilesItem(WafDataFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<WafDataFile>();
    }
    this.files.add(filesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Waf rules are sorted in groups based on their characterization.
   * Field introduced in 18.1.1.
   * Maximum of 64 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return groups
   */
  @VsoMethod
  public List<WafRuleGroup> getGroups() {
    return groups;
  }

  /**
   * This is the setter method. this will set the groups
   * Waf rules are sorted in groups based on their characterization.
   * Field introduced in 18.1.1.
   * Maximum of 64 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return groups
   */
  @VsoMethod
  public void setGroups(List<WafRuleGroup>  groups) {
    this.groups = groups;
  }

  /**
   * This is the setter method this will set the groups
   * Waf rules are sorted in groups based on their characterization.
   * Field introduced in 18.1.1.
   * Maximum of 64 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return groups
   */
  @VsoMethod
  public WafCRS addGroupsItem(WafRuleGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<WafRuleGroup>();
    }
    this.groups.add(groupsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Integrity protection value.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return integrity
   */
  @VsoMethod
  public String getIntegrity() {
    return integrity;
  }

  /**
   * This is the setter method to the attribute.
   * Integrity protection value.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param integrity set the integrity.
   */
  @VsoMethod
  public void setIntegrity(String  integrity) {
    this.integrity = integrity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Integrity protection values for crs.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return integrityValues
   */
  @VsoMethod
  public List<String> getIntegrityValues() {
    return integrityValues;
  }

  /**
   * This is the setter method. this will set the integrityValues
   * Integrity protection values for crs.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return integrityValues
   */
  @VsoMethod
  public void setIntegrityValues(List<String>  integrityValues) {
    this.integrityValues = integrityValues;
  }

  /**
   * This is the setter method this will set the integrityValues
   * Integrity protection values for crs.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return integrityValues
   */
  @VsoMethod
  public WafCRS addIntegrityValuesItem(String integrityValuesItem) {
    if (this.integrityValues == null) {
      this.integrityValues = new ArrayList<String>();
    }
    this.integrityValues.add(integrityValuesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * List of labels to be used for granular rbac.
   * Field introduced in 20.1.6.
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
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
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
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
   * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
   * edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return markers
   */
  @VsoMethod
  public WafCRS addMarkersItem(RoleFilterMatchLabel markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<RoleFilterMatchLabel>();
    }
    this.markers.add(markersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The name of this ruleset object.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * The name of this ruleset object.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The release date of this version in rfc 3339 / iso 8601 format.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return releaseDate
   */
  @VsoMethod
  public String getReleaseDate() {
    return releaseDate;
  }

  /**
   * This is the setter method to the attribute.
   * The release date of this version in rfc 3339 / iso 8601 format.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param releaseDate set the releaseDate.
   */
  @VsoMethod
  public void setReleaseDate(String  releaseDate) {
    this.releaseDate = releaseDate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Waf restricted file extensions.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return restrictedExtensions
   */
  @VsoMethod
  public List<String> getRestrictedExtensions() {
    return restrictedExtensions;
  }

  /**
   * This is the setter method. this will set the restrictedExtensions
   * Waf restricted file extensions.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return restrictedExtensions
   */
  @VsoMethod
  public void setRestrictedExtensions(List<String>  restrictedExtensions) {
    this.restrictedExtensions = restrictedExtensions;
  }

  /**
   * This is the setter method this will set the restrictedExtensions
   * Waf restricted file extensions.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return restrictedExtensions
   */
  @VsoMethod
  public WafCRS addRestrictedExtensionsItem(String restrictedExtensionsItem) {
    if (this.restrictedExtensions == null) {
      this.restrictedExtensions = new ArrayList<String>();
    }
    this.restrictedExtensions.add(restrictedExtensionsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Waf restricted http headers.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return restrictedHeaders
   */
  @VsoMethod
  public List<String> getRestrictedHeaders() {
    return restrictedHeaders;
  }

  /**
   * This is the setter method. this will set the restrictedHeaders
   * Waf restricted http headers.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return restrictedHeaders
   */
  @VsoMethod
  public void setRestrictedHeaders(List<String>  restrictedHeaders) {
    this.restrictedHeaders = restrictedHeaders;
  }

  /**
   * This is the setter method this will set the restrictedHeaders
   * Waf restricted http headers.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return restrictedHeaders
   */
  @VsoMethod
  public WafCRS addRestrictedHeadersItem(String restrictedHeadersItem) {
    if (this.restrictedHeaders == null) {
      this.restrictedHeaders = new ArrayList<String>();
    }
    this.restrictedHeaders.add(restrictedHeadersItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant that this object belongs to.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The version of this ruleset object.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return version
   */
  @VsoMethod
  public String getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * The version of this ruleset object.
   * Field introduced in 18.1.1.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
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
  WafCRS objWafCRS = (WafCRS) o;
  return   Objects.equals(this.uuid, objWafCRS.uuid)&&
  Objects.equals(this.version, objWafCRS.version)&&
  Objects.equals(this.releaseDate, objWafCRS.releaseDate)&&
  Objects.equals(this.description, objWafCRS.description)&&
  Objects.equals(this.groups, objWafCRS.groups)&&
  Objects.equals(this.name, objWafCRS.name)&&
  Objects.equals(this.tenantRef, objWafCRS.tenantRef)&&
  Objects.equals(this.integrity, objWafCRS.integrity)&&
  Objects.equals(this.markers, objWafCRS.markers)&&
  Objects.equals(this.files, objWafCRS.files)&&
  Objects.equals(this.restrictedExtensions, objWafCRS.restrictedExtensions)&&
  Objects.equals(this.restrictedHeaders, objWafCRS.restrictedHeaders)&&
  Objects.equals(this.allowedRequestContentTypeCharsets, objWafCRS.allowedRequestContentTypeCharsets)&&
  Objects.equals(this.integrityValues, objWafCRS.integrityValues);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WafCRS {\n");
      sb.append("    allowedRequestContentTypeCharsets: ").append(toIndentedString(allowedRequestContentTypeCharsets)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    integrity: ").append(toIndentedString(integrity)).append("\n");
        sb.append("    integrityValues: ").append(toIndentedString(integrityValues)).append("\n");
        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
        sb.append("    restrictedExtensions: ").append(toIndentedString(restrictedExtensions)).append("\n");
        sb.append("    restrictedHeaders: ").append(toIndentedString(restrictedHeaders)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

