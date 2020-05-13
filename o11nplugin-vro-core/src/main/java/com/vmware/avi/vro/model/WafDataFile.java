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
 * WafDataFile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafDataFile")
@VsoFinder(name = Constants.FINDER_VRO_WAFDATAFILE, idAccessor = "getObjectID()")
@Service
public class WafDataFile extends AviRestResource  {
  @JsonProperty("data")
  private String data = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = "WAF_DATAFILE_PM_FROM_FILE";

  
  /**
   * Stringified WAF File Data. Field introduced in 17.2.1.
   * @return data
  **/
  @ApiModelProperty(required = true, value = "Stringified WAF File Data. Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getData() {
    return data;
  }
    
  @VsoMethod
  public void setData(String data) {
    this.data = data;
  }

  
  /**
   * WAF Data File Name. Field introduced in 17.2.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "WAF Data File Name. Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * WAF data file type. Enum options - WAF_DATAFILE_PM_FROM_FILE, WAF_DATAFILE_DTD, WAF_DATAFILE_XSD. Field introduced in 20.1.1.
   * @return type
  **/
  @ApiModelProperty(value = "WAF data file type. Enum options - WAF_DATAFILE_PM_FROM_FILE, WAF_DATAFILE_DTD, WAF_DATAFILE_XSD. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "WafDataFile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafDataFile wafDataFile = (WafDataFile) o;
    return Objects.equals(this.data, wafDataFile.data) &&
        Objects.equals(this.name, wafDataFile.name) &&
        Objects.equals(this.type, wafDataFile.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafDataFile {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

