package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.GslbRuntime;
import com.vmware.avi.vro.model.GslbSiteRuntime;
import com.vmware.avi.vro.model.GslbThirdPartySiteRuntime;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbStatus is a POJO class extends AviRestResource that used for creating
 * GslbStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbStatus")
@VsoFinder(name = Constants.FINDER_VRO_GSLBSTATUS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbStatus extends AviRestResource {
    @JsonProperty("details")
    @JsonInclude(Include.NON_NULL)
    private List<String> details;

    @JsonProperty("gslb_runtime")
    @JsonInclude(Include.NON_NULL)
    private GslbRuntime gslbRuntime;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("site")
    @JsonInclude(Include.NON_NULL)
    private GslbSiteRuntime site;

    @JsonProperty("third_party_site")
    @JsonInclude(Include.NON_NULL)
    private GslbThirdPartySiteRuntime thirdPartySite;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return details
   */
  @VsoMethod
  public List<String> getDetails() {
    return details;
  }

  /**
   * This is the setter method. this will set the details
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return details
   */
  @VsoMethod
  public void setDetails(List<String>  details) {
    this.details = details;
  }

  /**
   * This is the setter method this will set the details
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return details
   */
  @VsoMethod
  public GslbStatus addDetailsItem(String detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<String>();
    }
    this.details.add(detailsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return gslbRuntime
   */
  @VsoMethod
  public GslbRuntime getGslbRuntime() {
    return gslbRuntime;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param gslbRuntime set the gslbRuntime.
   */
  @VsoMethod
  public void setGslbRuntime(GslbRuntime gslbRuntime) {
    this.gslbRuntime = gslbRuntime;
  }

  /**
   * This is the getter method this will return the attribute value.
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
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return site
   */
  @VsoMethod
  public GslbSiteRuntime getSite() {
    return site;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param site set the site.
   */
  @VsoMethod
  public void setSite(GslbSiteRuntime site) {
    this.site = site;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return thirdPartySite
   */
  @VsoMethod
  public GslbThirdPartySiteRuntime getThirdPartySite() {
    return thirdPartySite;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 17.2.5.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param thirdPartySite set the thirdPartySite.
   */
  @VsoMethod
  public void setThirdPartySite(GslbThirdPartySiteRuntime thirdPartySite) {
    this.thirdPartySite = thirdPartySite;
  }

  /**
   * This is the getter method this will return the attribute value.
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
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbStatus objGslbStatus = (GslbStatus) o;
  return   Objects.equals(this.uuid, objGslbStatus.uuid)&&
  Objects.equals(this.name, objGslbStatus.name)&&
  Objects.equals(this.details, objGslbStatus.details)&&
  Objects.equals(this.gslbRuntime, objGslbStatus.gslbRuntime)&&
  Objects.equals(this.site, objGslbStatus.site)&&
  Objects.equals(this.thirdPartySite, objGslbStatus.thirdPartySite);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbStatus {\n");
      sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    gslbRuntime: ").append(toIndentedString(gslbRuntime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    site: ").append(toIndentedString(site)).append("\n");
        sb.append("    thirdPartySite: ").append(toIndentedString(thirdPartySite)).append("\n");
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

