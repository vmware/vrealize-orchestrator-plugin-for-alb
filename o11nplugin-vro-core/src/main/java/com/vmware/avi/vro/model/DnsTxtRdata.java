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
 * DnsTxtRdata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsTxtRdata")
@VsoFinder(name = Constants.FINDER_VRO_DNSTXTRDATA, idAccessor = "getObjectID()")
@Service
public class DnsTxtRdata extends AviRestResource  {
  @JsonProperty("text_str")
  private String textStr = null;

  
  /**
   * Text data associated with the FQDN. Field introduced in 20.1.1.
   * @return textStr
  **/
  @ApiModelProperty(required = true, value = "Text data associated with the FQDN. Field introduced in 20.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getTextStr() {
    return textStr;
  }
    
  @VsoMethod
  public void setTextStr(String textStr) {
    this.textStr = textStr;
  }

  
  public String getObjectID() {
		return "DnsTxtRdata";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsTxtRdata dnsTxtRdata = (DnsTxtRdata) o;
    return Objects.equals(this.textStr, dnsTxtRdata.textStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textStr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsTxtRdata {\n");
    
    sb.append("    textStr: ").append(toIndentedString(textStr)).append("\n");
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

