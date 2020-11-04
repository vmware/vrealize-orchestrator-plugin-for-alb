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
 * The DnsCnameRdata is a POJO class extends AviRestResource that used for creating
 * DnsCnameRdata.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DnsCnameRdata")
@VsoFinder(name = Constants.FINDER_VRO_DNSCNAMERDATA)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DnsCnameRdata extends AviRestResource {
    @JsonProperty("cname")
    @JsonInclude(Include.NON_NULL)
    private String cname = null;



  /**
   * This is the getter method this will return the attribute value.
   * Canonical name.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cname
   */
  @VsoMethod
  public String getCname() {
    return cname;
  }

  /**
   * This is the setter method to the attribute.
   * Canonical name.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param cname set the cname.
   */
  @VsoMethod
  public void setCname(String  cname) {
    this.cname = cname;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DnsCnameRdata objDnsCnameRdata = (DnsCnameRdata) o;
  return   Objects.equals(this.cname, objDnsCnameRdata.cname);
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

