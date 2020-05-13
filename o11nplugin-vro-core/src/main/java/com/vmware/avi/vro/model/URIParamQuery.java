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
 * URIParamQuery
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "URIParamQuery")
@VsoFinder(name = Constants.FINDER_VRO_URIPARAMQUERY, idAccessor = "getObjectID()")
@Service
public class URIParamQuery extends AviRestResource  {
  @JsonProperty("add_string")
  private String addString = null;

  @JsonProperty("keep_query")
  private Boolean keepQuery = true;

  
  /**
   * Concatenate a string to the query of the incoming request URI and then use it in the request URI going to the backend server.
   * @return addString
  **/
  @ApiModelProperty(value = "Concatenate a string to the query of the incoming request URI and then use it in the request URI going to the backend server.")


 
  @VsoMethod  
  public String getAddString() {
    return addString;
  }
    
  @VsoMethod
  public void setAddString(String addString) {
    this.addString = addString;
  }

  
  /**
   * Use or drop the query of the incoming request URI in the request URI to the backend server.
   * @return keepQuery
  **/
  @ApiModelProperty(value = "Use or drop the query of the incoming request URI in the request URI to the backend server.")


 
  @VsoMethod  
  public Boolean isKeepQuery() {
    return keepQuery;
  }
    
  @VsoMethod
  public void setKeepQuery(Boolean keepQuery) {
    this.keepQuery = keepQuery;
  }

  
  public String getObjectID() {
		return "URIParamQuery";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    URIParamQuery urIParamQuery = (URIParamQuery) o;
    return Objects.equals(this.addString, urIParamQuery.addString) &&
        Objects.equals(this.keepQuery, urIParamQuery.keepQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addString, keepQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class URIParamQuery {\n");
    
    sb.append("    addString: ").append(toIndentedString(addString)).append("\n");
    sb.append("    keepQuery: ").append(toIndentedString(keepQuery)).append("\n");
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

