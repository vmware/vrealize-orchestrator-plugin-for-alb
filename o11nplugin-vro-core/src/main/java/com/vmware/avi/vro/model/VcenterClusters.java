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
 * VcenterClusters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VcenterClusters")
@VsoFinder(name = Constants.FINDER_VRO_VCENTERCLUSTERS, idAccessor = "getObjectID()")
@Service
public class VcenterClusters extends AviRestResource  {
  @JsonProperty("cluster_refs")
  @Valid
  private List<String> clusterRefs = null;

  @JsonProperty("include")
  private Boolean include = null;

  
  public VcenterClusters addClusterRefsItem(String clusterRefsItem) {
    if (this.clusterRefs == null) {
      this.clusterRefs = new ArrayList<String>();
    }
    this.clusterRefs.add(clusterRefsItem);
    return this;
  }
  
  /**
   *  It is a reference to an object of type VIMgrClusterRuntime.
   * @return clusterRefs
  **/
  @ApiModelProperty(value = " It is a reference to an object of type VIMgrClusterRuntime.")


 
  @VsoMethod  
  public List<String> getClusterRefs() {
    return clusterRefs;
  }
    
  @VsoMethod
  public void setClusterRefs(List<String> clusterRefs) {
    this.clusterRefs = clusterRefs;
  }

  
  /**
   * Placeholder for description of property include of obj type VcenterClusters field type str  type boolean
   * @return include
  **/
  @ApiModelProperty(value = "Placeholder for description of property include of obj type VcenterClusters field type str  type boolean")


 
  @VsoMethod  
  public Boolean isInclude() {
    return include;
  }
    
  @VsoMethod
  public void setInclude(Boolean include) {
    this.include = include;
  }

  
  public String getObjectID() {
		return "VcenterClusters";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VcenterClusters vcenterClusters = (VcenterClusters) o;
    return Objects.equals(this.clusterRefs, vcenterClusters.clusterRefs) &&
        Objects.equals(this.include, vcenterClusters.include);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterRefs, include);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VcenterClusters {\n");
    
    sb.append("    clusterRefs: ").append(toIndentedString(clusterRefs)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
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

