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
 * The VsResyncParams is a POJO class extends AviRestResource that used for creating
 * VsResyncParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VsResyncParams")
@VsoFinder(name = Constants.FINDER_VRO_VSRESYNCPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VsResyncParams extends AviRestResource {
    @JsonProperty("se_ref")
    @JsonInclude(Include.NON_NULL)
    private List<String> seRef = null;

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seRef
   */
  @VsoMethod
  public List<String> getSeRef() {
    return seRef;
  }

  /**
   * This is the setter method. this will set the seRef
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seRef
   */
  @VsoMethod
  public void setSeRef(List<String>  seRef) {
    this.seRef = seRef;
  }

  /**
   * This is the setter method this will set the seRef
   * It is a reference to an object of type serviceengine.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seRef
   */
  @VsoMethod
  public VsResyncParams addSeRefItem(String seRefItem) {
    if (this.seRef == null) {
      this.seRef = new ArrayList<String>();
    }
    this.seRef.add(seRefItem);
    return this;
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
  VsResyncParams objVsResyncParams = (VsResyncParams) o;
  return   Objects.equals(this.uuid, objVsResyncParams.uuid)&&
  Objects.equals(this.seRef, objVsResyncParams.seRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VsResyncParams {\n");
      sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
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

