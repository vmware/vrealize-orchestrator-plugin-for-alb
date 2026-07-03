package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ApiSpecInfo;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ApiSpecDetail is a POJO class extends AviRestResource that used for creating
 * ApiSpecDetail.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApiSpecDetail")
@VsoFinder(name = Constants.FINDER_VRO_APISPECDETAIL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApiSpecDetail extends AviRestResource {
    @JsonProperty("path_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> pathRefs;

    @JsonProperty("schema_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> schemaRefs;

    @JsonProperty("spec_info")
    @JsonInclude(Include.NON_NULL)
    private ApiSpecInfo specInfo;



  /**
   * This is the getter method this will return the attribute value.
   * References to apipath objects created from this specification.
   * It is a reference to an object of type apipath.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return pathRefs
   */
  @VsoMethod
  public List<String> getPathRefs() {
    return pathRefs;
  }

  /**
   * This is the setter method. this will set the pathRefs
   * References to apipath objects created from this specification.
   * It is a reference to an object of type apipath.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return pathRefs
   */
  @VsoMethod
  public void setPathRefs(List<String>  pathRefs) {
    this.pathRefs = pathRefs;
  }

  /**
   * This is the setter method this will set the pathRefs
   * References to apipath objects created from this specification.
   * It is a reference to an object of type apipath.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return pathRefs
   */
  @VsoMethod
  public ApiSpecDetail addPathRefsItem(String pathRefsItem) {
    if (this.pathRefs == null) {
      this.pathRefs = new ArrayList<String>();
    }
    this.pathRefs.add(pathRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * References to apischema objects created from this specification.
   * It is a reference to an object of type apischema.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return schemaRefs
   */
  @VsoMethod
  public List<String> getSchemaRefs() {
    return schemaRefs;
  }

  /**
   * This is the setter method. this will set the schemaRefs
   * References to apischema objects created from this specification.
   * It is a reference to an object of type apischema.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return schemaRefs
   */
  @VsoMethod
  public void setSchemaRefs(List<String>  schemaRefs) {
    this.schemaRefs = schemaRefs;
  }

  /**
   * This is the setter method this will set the schemaRefs
   * References to apischema objects created from this specification.
   * It is a reference to an object of type apischema.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return schemaRefs
   */
  @VsoMethod
  public ApiSpecDetail addSchemaRefsItem(String schemaRefsItem) {
    if (this.schemaRefs == null) {
      this.schemaRefs = new ArrayList<String>();
    }
    this.schemaRefs.add(schemaRefsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Metadata extracted from the openapi specification.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return specInfo
   */
  @VsoMethod
  public ApiSpecInfo getSpecInfo() {
    return specInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Metadata extracted from the openapi specification.
   * Field introduced in 32.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @param specInfo set the specInfo.
   */
  @VsoMethod
  public void setSpecInfo(ApiSpecInfo specInfo) {
    this.specInfo = specInfo;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ApiSpecDetail objApiSpecDetail = (ApiSpecDetail) o;
  return   Objects.equals(this.specInfo, objApiSpecDetail.specInfo)&&
  Objects.equals(this.pathRefs, objApiSpecDetail.pathRefs)&&
  Objects.equals(this.schemaRefs, objApiSpecDetail.schemaRefs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApiSpecDetail {\n");
      sb.append("    pathRefs: ").append(toIndentedString(pathRefs)).append("\n");
        sb.append("    schemaRefs: ").append(toIndentedString(schemaRefs)).append("\n");
        sb.append("    specInfo: ").append(toIndentedString(specInfo)).append("\n");
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

