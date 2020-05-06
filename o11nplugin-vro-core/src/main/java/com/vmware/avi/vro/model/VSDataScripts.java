package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * VSDataScripts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "VSDataScripts")
@VsoFinder(name = Constants.FINDER_VRO_VSDATASCRIPTS, idAccessor = "getObjectID()")
@Service
public class VSDataScripts extends AviRestResource  {
  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("vs_datascript_set_ref")
  private String vsDatascriptSetRef = null;

  
  /**
   * Index of the virtual service datascript collection.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Index of the virtual service datascript collection.")
  @NotNull


 
  @VsoMethod  
  public Integer getIndex() {
    return index;
  }
    
  @VsoMethod
  public void setIndex(Integer index) {
    this.index = index;
  }

  
  /**
   * UUID of the virtual service datascript collection. It is a reference to an object of type VSDataScriptSet.
   * @return vsDatascriptSetRef
  **/
  @ApiModelProperty(required = true, value = "UUID of the virtual service datascript collection. It is a reference to an object of type VSDataScriptSet.")
  @NotNull


 
  @VsoMethod  
  public String getVsDatascriptSetRef() {
    return vsDatascriptSetRef;
  }
    
  @VsoMethod
  public void setVsDatascriptSetRef(String vsDatascriptSetRef) {
    this.vsDatascriptSetRef = vsDatascriptSetRef;
  }

  
  public String getObjectID() {
		return "VSDataScripts";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VSDataScripts vsDataScripts = (VSDataScripts) o;
    return Objects.equals(this.index, vsDataScripts.index) &&
        Objects.equals(this.vsDatascriptSetRef, vsDataScripts.vsDatascriptSetRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, vsDatascriptSetRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VSDataScripts {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    vsDatascriptSetRef: ").append(toIndentedString(vsDatascriptSetRef)).append("\n");
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

