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
 * CloudConnectorUserTestParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "CloudConnectorUserTestParams")
@VsoFinder(name = Constants.FINDER_VRO_CLOUDCONNECTORUSERTESTPARAMS, idAccessor = "getObjectID()")
@Service
public class CloudConnectorUserTestParams extends AviRestResource  {
  @JsonProperty("host")
  private String host = null;

  
  /**
   * host of CloudConnectorUserTestParams.
   * @return host
  **/
  @ApiModelProperty(value = "host of CloudConnectorUserTestParams.")


 
  @VsoMethod  
  public String getHost() {
    return host;
  }
    
  @VsoMethod
  public void setHost(String host) {
    this.host = host;
  }

  
  public String getObjectID() {
		return "CloudConnectorUserTestParams";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudConnectorUserTestParams cloudConnectorUserTestParams = (CloudConnectorUserTestParams) o;
    return Objects.equals(this.host, cloudConnectorUserTestParams.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudConnectorUserTestParams {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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

