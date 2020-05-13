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
 * AlertFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AlertFilter")
@VsoFinder(name = Constants.FINDER_VRO_ALERTFILTER, idAccessor = "getObjectID()")
@Service
public class AlertFilter extends AviRestResource  {
  @JsonProperty("filter_action")
  private String filterAction = null;

  @JsonProperty("filter_string")
  private String filterString = null;

  
  /**
   * filter_action of AlertFilter.
   * @return filterAction
  **/
  @ApiModelProperty(value = "filter_action of AlertFilter.")


 
  @VsoMethod  
  public String getFilterAction() {
    return filterAction;
  }
    
  @VsoMethod
  public void setFilterAction(String filterAction) {
    this.filterAction = filterAction;
  }

  
  /**
   * filter_string of AlertFilter.
   * @return filterString
  **/
  @ApiModelProperty(required = true, value = "filter_string of AlertFilter.")
  @NotNull


 
  @VsoMethod  
  public String getFilterString() {
    return filterString;
  }
    
  @VsoMethod
  public void setFilterString(String filterString) {
    this.filterString = filterString;
  }

  
  public String getObjectID() {
		return "AlertFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertFilter alertFilter = (AlertFilter) o;
    return Objects.equals(this.filterAction, alertFilter.filterAction) &&
        Objects.equals(this.filterString, alertFilter.filterString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterAction, filterString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertFilter {\n");
    
    sb.append("    filterAction: ").append(toIndentedString(filterAction)).append("\n");
    sb.append("    filterString: ").append(toIndentedString(filterString)).append("\n");
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

