package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * WafPositiveSecurityModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafPositiveSecurityModel")
@VsoFinder(name = Constants.FINDER_VRO_WAFPOSITIVESECURITYMODEL, idAccessor = "getObjectID()")
@Service
public class WafPositiveSecurityModel extends AviRestResource  {
  @JsonProperty("group_refs")
  @Valid
  private List<String> groupRefs = null;

  
  public WafPositiveSecurityModel addGroupRefsItem(String groupRefsItem) {
    if (this.groupRefs == null) {
      this.groupRefs = new ArrayList<String>();
    }
    this.groupRefs.add(groupRefsItem);
    return this;
  }
  
  /**
   * These groups should be used to separate different levels of concern. The order of the groups matters, one group may mark parts of the request as valid, so that subsequent groups will not check these parts. It is a reference to an object of type WafPolicyPSMGroup. Field introduced in 18.2.3.
   * @return groupRefs
  **/
  @ApiModelProperty(value = "These groups should be used to separate different levels of concern. The order of the groups matters, one group may mark parts of the request as valid, so that subsequent groups will not check these parts. It is a reference to an object of type WafPolicyPSMGroup. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public List<String> getGroupRefs() {
    return groupRefs;
  }
    
  @VsoMethod
  public void setGroupRefs(List<String> groupRefs) {
    this.groupRefs = groupRefs;
  }

  
  public String getObjectID() {
		return "WafPositiveSecurityModel";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafPositiveSecurityModel wafPositiveSecurityModel = (WafPositiveSecurityModel) o;
    return Objects.equals(this.groupRefs, wafPositiveSecurityModel.groupRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafPositiveSecurityModel {\n");
    
    sb.append("    groupRefs: ").append(toIndentedString(groupRefs)).append("\n");
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

