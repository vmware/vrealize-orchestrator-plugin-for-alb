package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.OperationalStatus;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The GslbPoolRuntime is a POJO class extends AviRestResource that used for creating
 * GslbPoolRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbPoolRuntime")
@VsoFinder(name = Constants.FINDER_VRO_GSLBPOOLRUNTIME)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbPoolRuntime extends AviRestResource {
  @JsonProperty("members")
  @JsonInclude(Include.NON_NULL)
  private List<GslbPoolMemberRuntimeInfo> members = null;

  @JsonProperty("name")
  @JsonInclude(Include.NON_NULL)
  private String name = null;

  @JsonProperty("oper_status")
  @JsonInclude(Include.NON_NULL)
  private OperationalStatus operStatus = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property members of obj type gslbpoolruntime field type str  type array.
   * @return members
   */
  @VsoMethod
  public List<GslbPoolMemberRuntimeInfo> getMembers() {
    return members;
  }

  /**
   * This is the setter method. this will set the members
   * Placeholder for description of property members of obj type gslbpoolruntime field type str  type array.
   * @return members
   */
  @VsoMethod
  public void setMembers(List<GslbPoolMemberRuntimeInfo>  members) {
    this.members = members;
  }

  /**
   * This is the setter method this will set the members
   * Placeholder for description of property members of obj type gslbpoolruntime field type str  type array.
   * @return members
   */
  @VsoMethod
  public GslbPoolRuntime addMembersItem(GslbPoolMemberRuntimeInfo membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<GslbPoolMemberRuntimeInfo>();
    }
    this.members.add(membersItem);
    return this;
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
   * Gslb pool's consolidated operational status.
   * Field introduced in 18.2.3.
   * @return operStatus
   */
  @VsoMethod
  public OperationalStatus getOperStatus() {
    return operStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Gslb pool's consolidated operational status.
   * Field introduced in 18.2.3.
   * @param operStatus set the operStatus.
   */
  @VsoMethod
  public void setOperStatus(OperationalStatus operStatus) {
    this.operStatus = operStatus;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbPoolRuntime objGslbPoolRuntime = (GslbPoolRuntime) o;
  return   Objects.equals(this.operStatus, objGslbPoolRuntime.operStatus)&&
  Objects.equals(this.name, objGslbPoolRuntime.name)&&
  Objects.equals(this.members, objGslbPoolRuntime.members);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbPoolRuntime {\n");
      sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
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
