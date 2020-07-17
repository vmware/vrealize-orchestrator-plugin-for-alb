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
 * The URIParamQuery is a POJO class extends AviRestResource that used for creating
 * URIParamQuery.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "URIParamQuery")
@VsoFinder(name = Constants.FINDER_VRO_URIPARAMQUERY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class URIParamQuery extends AviRestResource {
  @JsonProperty("add_string")
  @JsonInclude(Include.NON_NULL)
  private String addString = null;

  @JsonProperty("keep_query")
  @JsonInclude(Include.NON_NULL)
  private Boolean keepQuery = true;



  /**
   * This is the getter method this will return the attribute value.
   * Concatenate a string to the query of the incoming request uri and then use it in the request uri going to the backend server.
   * @return addString
   */
  @VsoMethod
  public String getAddString() {
    return addString;
  }

  /**
   * This is the setter method to the attribute.
   * Concatenate a string to the query of the incoming request uri and then use it in the request uri going to the backend server.
   * @param addString set the addString.
   */
  @VsoMethod
  public void setAddString(String  addString) {
    this.addString = addString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Use or drop the query of the incoming request uri in the request uri to the backend server.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return keepQuery
   */
  @VsoMethod
  public Boolean getKeepQuery() {
    return keepQuery;
  }

  /**
   * This is the setter method to the attribute.
   * Use or drop the query of the incoming request uri in the request uri to the backend server.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param keepQuery set the keepQuery.
   */
  @VsoMethod
  public void setKeepQuery(Boolean  keepQuery) {
    this.keepQuery = keepQuery;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  URIParamQuery objURIParamQuery = (URIParamQuery) o;
  return   Objects.equals(this.keepQuery, objURIParamQuery.keepQuery)&&
  Objects.equals(this.addString, objURIParamQuery.addString);
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

