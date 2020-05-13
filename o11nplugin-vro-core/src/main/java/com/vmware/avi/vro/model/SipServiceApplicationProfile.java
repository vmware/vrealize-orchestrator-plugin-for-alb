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
 * SipServiceApplicationProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SipServiceApplicationProfile")
@VsoFinder(name = Constants.FINDER_VRO_SIPSERVICEAPPLICATIONPROFILE, idAccessor = "getObjectID()")
@Service
public class SipServiceApplicationProfile extends AviRestResource  {
  @JsonProperty("transaction_timeout")
  private Integer transactionTimeout = 32;

  
  /**
   * SIP transaction timeout in seconds. Allowed values are 2-512. Field introduced in 17.2.8, 18.1.3, 18.2.1.
   * @return transactionTimeout
  **/
  @ApiModelProperty(value = "SIP transaction timeout in seconds. Allowed values are 2-512. Field introduced in 17.2.8, 18.1.3, 18.2.1.")


 
  @VsoMethod  
  public Integer getTransactionTimeout() {
    return transactionTimeout;
  }
    
  @VsoMethod
  public void setTransactionTimeout(Integer transactionTimeout) {
    this.transactionTimeout = transactionTimeout;
  }

  
  public String getObjectID() {
		return "SipServiceApplicationProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SipServiceApplicationProfile sipServiceApplicationProfile = (SipServiceApplicationProfile) o;
    return Objects.equals(this.transactionTimeout, sipServiceApplicationProfile.transactionTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipServiceApplicationProfile {\n");
    
    sb.append("    transactionTimeout: ").append(toIndentedString(transactionTimeout)).append("\n");
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

