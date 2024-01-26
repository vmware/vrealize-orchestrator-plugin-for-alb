package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.CaptureTCPFlags;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The CaptureTCP is a POJO class extends AviRestResource that used for creating
 * CaptureTCP.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "CaptureTCP")
@VsoFinder(name = Constants.FINDER_VRO_CAPTURETCP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class CaptureTCP extends AviRestResource {
    @JsonProperty("tcpflag")
    @JsonInclude(Include.NON_NULL)
    private CaptureTCPFlags tcpflag = null;



  /**
   * This is the getter method this will return the attribute value.
   * Tcp flags filter.
   * Or'ed internally and and'ed amongst each other.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tcpflag
   */
  @VsoMethod
  public CaptureTCPFlags getTcpflag() {
    return tcpflag;
  }

  /**
   * This is the setter method to the attribute.
   * Tcp flags filter.
   * Or'ed internally and and'ed amongst each other.
   * Field introduced in 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tcpflag set the tcpflag.
   */
  @VsoMethod
  public void setTcpflag(CaptureTCPFlags tcpflag) {
    this.tcpflag = tcpflag;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  CaptureTCP objCaptureTCP = (CaptureTCP) o;
  return   Objects.equals(this.tcpflag, objCaptureTCP.tcpflag);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class CaptureTCP {\n");
      sb.append("    tcpflag: ").append(toIndentedString(tcpflag)).append("\n");
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
