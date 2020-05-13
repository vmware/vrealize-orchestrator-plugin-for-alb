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
 * VSDataScript
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VSDataScript")
@VsoFinder(name = Constants.FINDER_VRO_VSDATASCRIPT, idAccessor = "getObjectID()")
@Service
public class VSDataScript extends AviRestResource  {
  @JsonProperty("evt")
  private String evt = null;

  @JsonProperty("script")
  private String script = null;

  
  /**
   * Event triggering execution of datascript. Enum options - VS_DATASCRIPT_EVT_HTTP_REQ, VS_DATASCRIPT_EVT_HTTP_RESP, VS_DATASCRIPT_EVT_HTTP_RESP_DATA, VS_DATASCRIPT_EVT_HTTP_LB_FAILED, VS_DATASCRIPT_EVT_HTTP_REQ_DATA, VS_DATASCRIPT_EVT_HTTP_RESP_FAILED, VS_DATASCRIPT_EVT_HTTP_LB_DONE, VS_DATASCRIPT_EVT_TCP_CLIENT_ACCEPT, VS_DATASCRIPT_EVT_SSL_HANDSHAKE_DONE, VS_DATASCRIPT_EVT_DNS_REQ, VS_DATASCRIPT_EVT_DNS_RESP, VS_DATASCRIPT_EVT_L4_REQUEST, VS_DATASCRIPT_EVT_L4_RESPONSE, VS_DATASCRIPT_EVT_MAX.
   * @return evt
  **/
  @ApiModelProperty(required = true, value = "Event triggering execution of datascript. Enum options - VS_DATASCRIPT_EVT_HTTP_REQ, VS_DATASCRIPT_EVT_HTTP_RESP, VS_DATASCRIPT_EVT_HTTP_RESP_DATA, VS_DATASCRIPT_EVT_HTTP_LB_FAILED, VS_DATASCRIPT_EVT_HTTP_REQ_DATA, VS_DATASCRIPT_EVT_HTTP_RESP_FAILED, VS_DATASCRIPT_EVT_HTTP_LB_DONE, VS_DATASCRIPT_EVT_TCP_CLIENT_ACCEPT, VS_DATASCRIPT_EVT_SSL_HANDSHAKE_DONE, VS_DATASCRIPT_EVT_DNS_REQ, VS_DATASCRIPT_EVT_DNS_RESP, VS_DATASCRIPT_EVT_L4_REQUEST, VS_DATASCRIPT_EVT_L4_RESPONSE, VS_DATASCRIPT_EVT_MAX.")
  @NotNull


 
  @VsoMethod  
  public String getEvt() {
    return evt;
  }
    
  @VsoMethod
  public void setEvt(String evt) {
    this.evt = evt;
  }

  
  /**
   * Datascript to execute when the event triggers.
   * @return script
  **/
  @ApiModelProperty(required = true, value = "Datascript to execute when the event triggers.")
  @NotNull


 
  @VsoMethod  
  public String getScript() {
    return script;
  }
    
  @VsoMethod
  public void setScript(String script) {
    this.script = script;
  }

  
  public String getObjectID() {
		return "VSDataScript";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VSDataScript vsDataScript = (VSDataScript) o;
    return Objects.equals(this.evt, vsDataScript.evt) &&
        Objects.equals(this.script, vsDataScript.script);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evt, script);
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

