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
 * DnsCnameRdata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsCnameRdata")
@VsoFinder(name = Constants.FINDER_VRO_DNSCNAMERDATA, idAccessor = "getObjectID()")
@Service
public class DnsCnameRdata extends AviRestResource  {
  @JsonProperty("cname")
  private String cname = null;

  
  /**
   * Canonical name.
   * @return cname
  **/
  @ApiModelProperty(required = true, value = "Canonical name.")
  @NotNull


 
  @VsoMethod  
  public String getCname() {
    return cname;
  }
    
  @VsoMethod
  public void setCname(String cname) {
    this.cname = cname;
  }

  
  public String getObjectID() {
		return "DnsCnameRdata";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsCnameRdata dnsCnameRdata = (DnsCnameRdata) o;
    return Objects.equals(this.cname, dnsCnameRdata.cname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsCnameRdata {\n");
    
    sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
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

