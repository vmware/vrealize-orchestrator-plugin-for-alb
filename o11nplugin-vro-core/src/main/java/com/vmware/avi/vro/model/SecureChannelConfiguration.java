package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * SecureChannelConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SecureChannelConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_SECURECHANNELCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class SecureChannelConfiguration extends AviRestResource  {
  @JsonProperty("bypass_secure_channel_must_checks")
  private Boolean bypassSecureChannelMustChecks = null;

  @JsonProperty("sslkeyandcertificate_refs")
  @Valid
  private List<String> sslkeyandcertificateRefs = null;

  
  /**
   * Boolean that allows force update of secure channel certificate. Field introduced in 18.2.5.
   * @return bypassSecureChannelMustChecks
  **/
  @ApiModelProperty(value = "Boolean that allows force update of secure channel certificate. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isBypassSecureChannelMustChecks() {
    return bypassSecureChannelMustChecks;
  }
    
  @VsoMethod
  public void setBypassSecureChannelMustChecks(Boolean bypassSecureChannelMustChecks) {
    this.bypassSecureChannelMustChecks = bypassSecureChannelMustChecks;
  }

  
  public SecureChannelConfiguration addSslkeyandcertificateRefsItem(String sslkeyandcertificateRefsItem) {
    if (this.sslkeyandcertificateRefs == null) {
      this.sslkeyandcertificateRefs = new ArrayList<String>();
    }
    this.sslkeyandcertificateRefs.add(sslkeyandcertificateRefsItem);
    return this;
  }
  
  /**
   * Certificate for secure channel. Leave list empty to use system default certs. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 18.1.4, 18.2.1.
   * @return sslkeyandcertificateRefs
  **/
  @ApiModelProperty(value = "Certificate for secure channel. Leave list empty to use system default certs. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 18.1.4, 18.2.1.")


 
  @VsoMethod  
  public List<String> getSslkeyandcertificateRefs() {
    return sslkeyandcertificateRefs;
  }
    
  @VsoMethod
  public void setSslkeyandcertificateRefs(List<String> sslkeyandcertificateRefs) {
    this.sslkeyandcertificateRefs = sslkeyandcertificateRefs;
  }

  
  public String getObjectID() {
		return "SecureChannelConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecureChannelConfiguration secureChannelConfiguration = (SecureChannelConfiguration) o;
    return Objects.equals(this.bypassSecureChannelMustChecks, secureChannelConfiguration.bypassSecureChannelMustChecks) &&
        Objects.equals(this.sslkeyandcertificateRefs, secureChannelConfiguration.sslkeyandcertificateRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bypassSecureChannelMustChecks, sslkeyandcertificateRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecureChannelConfiguration {\n");
    
    sb.append("    bypassSecureChannelMustChecks: ").append(toIndentedString(bypassSecureChannelMustChecks)).append("\n");
    sb.append("    sslkeyandcertificateRefs: ").append(toIndentedString(sslkeyandcertificateRefs)).append("\n");
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

