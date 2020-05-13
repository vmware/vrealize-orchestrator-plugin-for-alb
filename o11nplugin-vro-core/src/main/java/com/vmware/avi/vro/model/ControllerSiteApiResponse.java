package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.ControllerSite;
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
 * ControllerSiteApiResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ControllerSiteApiResponse")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERSITEAPIRESPONSE, idAccessor = "getObjectID()")
@Service
public class ControllerSiteApiResponse extends AviRestResource  {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("results")
  @Valid
  private List<ControllerSite> results = new ArrayList<ControllerSite>();

  
  /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


 
  @VsoMethod  
  public Integer getCount() {
    return count;
  }
    
  @VsoMethod
  public void setCount(Integer count) {
    this.count = count;
  }

  
  public ControllerSiteApiResponse addResultsItem(ControllerSite resultsItem) {
    this.results.add(resultsItem);
    return this;
  }
  
  /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

 
  @VsoMethod  
  public List<ControllerSite> getResults() {
    return results;
  }
    
  @VsoMethod
  public void setResults(List<ControllerSite> results) {
    this.results = results;
  }

  
  public String getObjectID() {
		return "ControllerSiteApiResponse";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerSiteApiResponse controllerSiteApiResponse = (ControllerSiteApiResponse) o;
    return Objects.equals(this.count, controllerSiteApiResponse.count) &&
        Objects.equals(this.results, controllerSiteApiResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerSiteApiResponse {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

