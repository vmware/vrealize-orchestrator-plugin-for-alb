package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SSLClientRequestHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * SSLClientCertificateAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SSLClientCertificateAction")
@VsoFinder(name = Constants.FINDER_VRO_SSLCLIENTCERTIFICATEACTION, idAccessor = "getObjectID()")
@Service
public class SSLClientCertificateAction extends AviRestResource  {
  @JsonProperty("close_connection")
  private Boolean closeConnection = null;

  @JsonProperty("headers")
  @Valid
  private List<SSLClientRequestHeader> headers = null;

  
  /**
   * Placeholder for description of property close_connection of obj type SSLClientCertificateAction field type str  type boolean
   * @return closeConnection
  **/
  @ApiModelProperty(value = "Placeholder for description of property close_connection of obj type SSLClientCertificateAction field type str  type boolean")


 
  @VsoMethod  
  public Boolean isCloseConnection() {
    return closeConnection;
  }
    
  @VsoMethod
  public void setCloseConnection(Boolean closeConnection) {
    this.closeConnection = closeConnection;
  }

  
  public SSLClientCertificateAction addHeadersItem(SSLClientRequestHeader headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<SSLClientRequestHeader>();
    }
    this.headers.add(headersItem);
    return this;
  }
  
  /**
   * Placeholder for description of property headers of obj type SSLClientCertificateAction field type str  type object
   * @return headers
  **/
  @ApiModelProperty(value = "Placeholder for description of property headers of obj type SSLClientCertificateAction field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<SSLClientRequestHeader> getHeaders() {
    return headers;
  }
    
  @VsoMethod
  public void setHeaders(List<SSLClientRequestHeader> headers) {
    this.headers = headers;
  }

  
  public String getObjectID() {
		return "SSLClientCertificateAction";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLClientCertificateAction ssLClientCertificateAction = (SSLClientCertificateAction) o;
    return Objects.equals(this.closeConnection, ssLClientCertificateAction.closeConnection) &&
        Objects.equals(this.headers, ssLClientCertificateAction.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closeConnection, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLClientCertificateAction {\n");
    
    sb.append("    closeConnection: ").append(toIndentedString(closeConnection)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

