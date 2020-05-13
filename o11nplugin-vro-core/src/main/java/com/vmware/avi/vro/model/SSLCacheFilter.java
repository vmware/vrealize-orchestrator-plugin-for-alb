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
 * SSLCacheFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SSLCacheFilter")
@VsoFinder(name = Constants.FINDER_VRO_SSLCACHEFILTER, idAccessor = "getObjectID()")
@Service
public class SSLCacheFilter extends AviRestResource  {
  @JsonProperty("ssl_session_id")
  private String sslSessionId = null;

  
  /**
   * Hexadecimal representation of the SSL session ID. Field introduced in 20.1.1.
   * @return sslSessionId
  **/
  @ApiModelProperty(value = "Hexadecimal representation of the SSL session ID. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public String getSslSessionId() {
    return sslSessionId;
  }
    
  @VsoMethod
  public void setSslSessionId(String sslSessionId) {
    this.sslSessionId = sslSessionId;
  }

  
  public String getObjectID() {
		return "SSLCacheFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLCacheFilter ssLCacheFilter = (SSLCacheFilter) o;
    return Objects.equals(this.sslSessionId, ssLCacheFilter.sslSessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sslSessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLCacheFilter {\n");
    
    sb.append("    sslSessionId: ").append(toIndentedString(sslSessionId)).append("\n");
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

