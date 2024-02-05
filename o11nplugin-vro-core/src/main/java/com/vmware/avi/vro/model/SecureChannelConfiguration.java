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
 * The SecureChannelConfiguration is a POJO class extends AviRestResource that used for creating
 * SecureChannelConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SecureChannelConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_SECURECHANNELCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SecureChannelConfiguration extends AviRestResource {
    @JsonProperty("sslkeyandcertificate_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> sslkeyandcertificateRefs;



  /**
   * This is the getter method this will return the attribute value.
   * Certificate for secure channel.
   * Leave list empty to use system default certs.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 18.1.4, 18.2.1.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslkeyandcertificateRefs
   */
  @VsoMethod
  public List<String> getSslkeyandcertificateRefs() {
    return sslkeyandcertificateRefs;
  }

  /**
   * This is the setter method. this will set the sslkeyandcertificateRefs
   * Certificate for secure channel.
   * Leave list empty to use system default certs.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 18.1.4, 18.2.1.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslkeyandcertificateRefs
   */
  @VsoMethod
  public void setSslkeyandcertificateRefs(List<String>  sslkeyandcertificateRefs) {
    this.sslkeyandcertificateRefs = sslkeyandcertificateRefs;
  }

  /**
   * This is the setter method this will set the sslkeyandcertificateRefs
   * Certificate for secure channel.
   * Leave list empty to use system default certs.
   * It is a reference to an object of type sslkeyandcertificate.
   * Field introduced in 18.1.4, 18.2.1.
   * Maximum of 1 items allowed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sslkeyandcertificateRefs
   */
  @VsoMethod
  public SecureChannelConfiguration addSslkeyandcertificateRefsItem(String sslkeyandcertificateRefsItem) {
    if (this.sslkeyandcertificateRefs == null) {
      this.sslkeyandcertificateRefs = new ArrayList<String>();
    }
    this.sslkeyandcertificateRefs.add(sslkeyandcertificateRefsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SecureChannelConfiguration objSecureChannelConfiguration = (SecureChannelConfiguration) o;
  return   Objects.equals(this.sslkeyandcertificateRefs, objSecureChannelConfiguration.sslkeyandcertificateRefs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SecureChannelConfiguration {\n");
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

