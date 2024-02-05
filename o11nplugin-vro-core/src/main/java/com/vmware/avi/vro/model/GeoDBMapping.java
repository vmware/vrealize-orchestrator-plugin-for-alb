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
 * The GeoDBMapping is a POJO class extends AviRestResource that used for creating
 * GeoDBMapping.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GeoDBMapping")
@VsoFinder(name = Constants.FINDER_VRO_GEODBMAPPING)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GeoDBMapping extends AviRestResource {
    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description;

    @JsonProperty("elements")
    @JsonInclude(Include.NON_NULL)
    private List<GeoDBMappingElement> elements;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;



  /**
   * This is the getter method this will return the attribute value.
   * Description of the mapping.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Description of the mapping.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The set of mapping elements.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return elements
   */
  @VsoMethod
  public List<GeoDBMappingElement> getElements() {
    return elements;
  }

  /**
   * This is the setter method. this will set the elements
   * The set of mapping elements.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return elements
   */
  @VsoMethod
  public void setElements(List<GeoDBMappingElement>  elements) {
    this.elements = elements;
  }

  /**
   * This is the setter method this will set the elements
   * The set of mapping elements.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return elements
   */
  @VsoMethod
  public GeoDBMapping addElementsItem(GeoDBMappingElement elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<GeoDBMappingElement>();
    }
    this.elements.add(elementsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * The unique name of the user mapping.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * The unique name of the user mapping.
   * Field introduced in 21.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GeoDBMapping objGeoDBMapping = (GeoDBMapping) o;
  return   Objects.equals(this.name, objGeoDBMapping.name)&&
  Objects.equals(this.description, objGeoDBMapping.description)&&
  Objects.equals(this.elements, objGeoDBMapping.elements);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GeoDBMapping {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

