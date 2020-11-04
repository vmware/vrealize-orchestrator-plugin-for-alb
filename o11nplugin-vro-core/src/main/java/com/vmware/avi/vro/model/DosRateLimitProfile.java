package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.DosThresholdProfile;
import com.vmware.avi.vro.model.RateLimiterProfile;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The DosRateLimitProfile is a POJO class extends AviRestResource that used for creating
 * DosRateLimitProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DosRateLimitProfile")
@VsoFinder(name = Constants.FINDER_VRO_DOSRATELIMITPROFILE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DosRateLimitProfile extends AviRestResource {
    @JsonProperty("dos_profile")
    @JsonInclude(Include.NON_NULL)
    private DosThresholdProfile dosProfile = null;

    @JsonProperty("rl_profile")
    @JsonInclude(Include.NON_NULL)
    private RateLimiterProfile rlProfile = null;



  /**
   * This is the getter method this will return the attribute value.
   * Profile for dos attack detection.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return dosProfile
   */
  @VsoMethod
  public DosThresholdProfile getDosProfile() {
    return dosProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Profile for dos attack detection.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param dosProfile set the dosProfile.
   */
  @VsoMethod
  public void setDosProfile(DosThresholdProfile dosProfile) {
    this.dosProfile = dosProfile;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Profile for connections/requests rate limiting.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rlProfile
   */
  @VsoMethod
  public RateLimiterProfile getRlProfile() {
    return rlProfile;
  }

  /**
   * This is the setter method to the attribute.
   * Profile for connections/requests rate limiting.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rlProfile set the rlProfile.
   */
  @VsoMethod
  public void setRlProfile(RateLimiterProfile rlProfile) {
    this.rlProfile = rlProfile;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DosRateLimitProfile objDosRateLimitProfile = (DosRateLimitProfile) o;
  return   Objects.equals(this.rlProfile, objDosRateLimitProfile.rlProfile)&&
  Objects.equals(this.dosProfile, objDosRateLimitProfile.dosProfile);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DosRateLimitProfile {\n");
      sb.append("    dosProfile: ").append(toIndentedString(dosProfile)).append("\n");
        sb.append("    rlProfile: ").append(toIndentedString(rlProfile)).append("\n");
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

