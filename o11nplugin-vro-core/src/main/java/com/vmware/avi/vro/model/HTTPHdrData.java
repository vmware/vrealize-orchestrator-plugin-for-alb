package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.HTTPHdrValue;
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
 * HTTPHdrData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HTTPHdrData")
@VsoFinder(name = Constants.FINDER_VRO_HTTPHDRDATA, idAccessor = "getObjectID()")
@Service
public class HTTPHdrData extends AviRestResource  {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private HTTPHdrValue value = null;

  
  /**
   * HTTP header name.
   * @return name
  **/
  @ApiModelProperty(value = "HTTP header name.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * HTTP header value.
   * @return value
  **/
  @ApiModelProperty(value = "HTTP header value.")

  @Valid

 
  @VsoMethod  
  public HTTPHdrValue getValue() {
    return value;
  }
    
  @VsoMethod
  public void setValue(HTTPHdrValue value) {
    this.value = value;
  }

  
  public String getObjectID() {
		return "HTTPHdrData";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPHdrData htTPHdrData = (HTTPHdrData) o;
    return Objects.equals(this.name, htTPHdrData.name) &&
        Objects.equals(this.value, htTPHdrData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPHdrData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

