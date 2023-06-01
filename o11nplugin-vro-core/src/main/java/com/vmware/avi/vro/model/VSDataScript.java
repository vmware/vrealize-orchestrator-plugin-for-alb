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
 * The VSDataScript is a POJO class extends AviRestResource that used for creating
 * VSDataScript.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VSDataScript")
@VsoFinder(name = Constants.FINDER_VRO_VSDATASCRIPT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VSDataScript extends AviRestResource {
    @JsonProperty("evt")
    @JsonInclude(Include.NON_NULL)
    private String evt = null;

    @JsonProperty("script")
    @JsonInclude(Include.NON_NULL)
    private String script = null;



  /**
   * This is the getter method this will return the attribute value.
   * Event triggering execution of datascript.
   * Enum options - VS_DATASCRIPT_EVT_HTTP_REQ, VS_DATASCRIPT_EVT_HTTP_RESP, VS_DATASCRIPT_EVT_HTTP_RESP_DATA, VS_DATASCRIPT_EVT_HTTP_LB_FAILED,
   * VS_DATASCRIPT_EVT_HTTP_REQ_DATA, VS_DATASCRIPT_EVT_HTTP_RESP_FAILED, VS_DATASCRIPT_EVT_HTTP_LB_DONE, VS_DATASCRIPT_EVT_HTTP_AUTH,
   * VS_DATASCRIPT_EVT_HTTP_POST_AUTH, VS_DATASCRIPT_EVT_TCP_CLIENT_ACCEPT, VS_DATASCRIPT_EVT_SSL_HANDSHAKE_DONE,
   * VS_DATASCRIPT_EVT_CLIENT_SSL_PRE_CONNECT, VS_DATASCRIPT_EVT_CLIENT_SSL_CLIENT_HELLO, VS_DATASCRIPT_EVT_DNS_REQ, VS_DATASCRIPT_EVT_DNS_RESP,
   * VS_DATASCRIPT_EVT_L4_REQUEST, VS_DATASCRIPT_EVT_L4_RESPONSE, VS_DATASCRIPT_EVT_MAX.
   * Allowed in enterprise edition with any value, basic edition(allowed values- vs_datascript_evt_http_req,vs_datascript_evt_http_resp), essentials,
   * enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return evt
   */
  @VsoMethod
  public String getEvt() {
    return evt;
  }

  /**
   * This is the setter method to the attribute.
   * Event triggering execution of datascript.
   * Enum options - VS_DATASCRIPT_EVT_HTTP_REQ, VS_DATASCRIPT_EVT_HTTP_RESP, VS_DATASCRIPT_EVT_HTTP_RESP_DATA, VS_DATASCRIPT_EVT_HTTP_LB_FAILED,
   * VS_DATASCRIPT_EVT_HTTP_REQ_DATA, VS_DATASCRIPT_EVT_HTTP_RESP_FAILED, VS_DATASCRIPT_EVT_HTTP_LB_DONE, VS_DATASCRIPT_EVT_HTTP_AUTH,
   * VS_DATASCRIPT_EVT_HTTP_POST_AUTH, VS_DATASCRIPT_EVT_TCP_CLIENT_ACCEPT, VS_DATASCRIPT_EVT_SSL_HANDSHAKE_DONE,
   * VS_DATASCRIPT_EVT_CLIENT_SSL_PRE_CONNECT, VS_DATASCRIPT_EVT_CLIENT_SSL_CLIENT_HELLO, VS_DATASCRIPT_EVT_DNS_REQ, VS_DATASCRIPT_EVT_DNS_RESP,
   * VS_DATASCRIPT_EVT_L4_REQUEST, VS_DATASCRIPT_EVT_L4_RESPONSE, VS_DATASCRIPT_EVT_MAX.
   * Allowed in enterprise edition with any value, basic edition(allowed values- vs_datascript_evt_http_req,vs_datascript_evt_http_resp), essentials,
   * enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param evt set the evt.
   */
  @VsoMethod
  public void setEvt(String  evt) {
    this.evt = evt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Datascript to execute when the event triggers.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return script
   */
  @VsoMethod
  public String getScript() {
    return script;
  }

  /**
   * This is the setter method to the attribute.
   * Datascript to execute when the event triggers.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param script set the script.
   */
  @VsoMethod
  public void setScript(String  script) {
    this.script = script;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  VSDataScript objVSDataScript = (VSDataScript) o;
  return   Objects.equals(this.evt, objVSDataScript.evt)&&
  Objects.equals(this.script, objVSDataScript.script);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VSDataScript {\n");
      sb.append("    evt: ").append(toIndentedString(evt)).append("\n");
        sb.append("    script: ").append(toIndentedString(script)).append("\n");
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

