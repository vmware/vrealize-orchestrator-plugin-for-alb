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
 * The ContentLibConfig is a POJO class extends AviRestResource that used for creating
 * ContentLibConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ContentLibConfig")
@VsoFinder(name = Constants.FINDER_VRO_CONTENTLIBCONFIG)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ContentLibConfig extends AviRestResource {
  @JsonProperty("id")
  @JsonInclude(Include.NON_NULL)
  private String id = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;



  /**
   * This is the getter method this will return the attribute value.
   * Content library id.
   * Field introduced in 20.1.1.
   * @return id
   */
  @VsoMethod
  public String getId() {
    return id;
  }

  /**
   * This is the setter method to the attribute.
   * Content library id.
   * Field introduced in 20.1.1.
   * @param id set the id.
   */
  @VsoMethod
  public void setId(String  id) {
    this.id = id;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Content library name.
   * Field introduced in 20.1.1.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Content library name.
   * Field introduced in 20.1.1.
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
  ContentLibConfig objContentLibConfig = (ContentLibConfig) o;
  return   Objects.equals(this.name, objContentLibConfig.name)&&
  Objects.equals(this.id, objContentLibConfig.id);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ContentLibConfig {\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

