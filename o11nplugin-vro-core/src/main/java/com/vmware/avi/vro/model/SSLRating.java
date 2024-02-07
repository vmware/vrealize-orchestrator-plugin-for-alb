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
 * The SSLRating is a POJO class extends AviRestResource that used for creating
 * SSLRating.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SSLRating")
@VsoFinder(name = Constants.FINDER_VRO_SSLRATING)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SSLRating extends AviRestResource {
    @JsonProperty("compatibility_rating")
    @JsonInclude(Include.NON_NULL)
    private String compatibilityRating;

    @JsonProperty("performance_rating")
    @JsonInclude(Include.NON_NULL)
    private String performanceRating;

    @JsonProperty("security_score")
    @JsonInclude(Include.NON_NULL)
    private String securityScore;



  /**
   * This is the getter method this will return the attribute value.
   * Enum options - SSL_SCORE_NOT_SECURE, SSL_SCORE_VERY_BAD, SSL_SCORE_BAD, SSL_SCORE_AVERAGE, SSL_SCORE_GOOD, SSL_SCORE_EXCELLENT.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return compatibilityRating
   */
  @VsoMethod
  public String getCompatibilityRating() {
    return compatibilityRating;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - SSL_SCORE_NOT_SECURE, SSL_SCORE_VERY_BAD, SSL_SCORE_BAD, SSL_SCORE_AVERAGE, SSL_SCORE_GOOD, SSL_SCORE_EXCELLENT.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param compatibilityRating set the compatibilityRating.
   */
  @VsoMethod
  public void setCompatibilityRating(String  compatibilityRating) {
    this.compatibilityRating = compatibilityRating;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - SSL_SCORE_NOT_SECURE, SSL_SCORE_VERY_BAD, SSL_SCORE_BAD, SSL_SCORE_AVERAGE, SSL_SCORE_GOOD, SSL_SCORE_EXCELLENT.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return performanceRating
   */
  @VsoMethod
  public String getPerformanceRating() {
    return performanceRating;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - SSL_SCORE_NOT_SECURE, SSL_SCORE_VERY_BAD, SSL_SCORE_BAD, SSL_SCORE_AVERAGE, SSL_SCORE_GOOD, SSL_SCORE_EXCELLENT.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param performanceRating set the performanceRating.
   */
  @VsoMethod
  public void setPerformanceRating(String  performanceRating) {
    this.performanceRating = performanceRating;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return securityScore
   */
  @VsoMethod
  public String getSecurityScore() {
    return securityScore;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param securityScore set the securityScore.
   */
  @VsoMethod
  public void setSecurityScore(String  securityScore) {
    this.securityScore = securityScore;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SSLRating objSSLRating = (SSLRating) o;
  return   Objects.equals(this.securityScore, objSSLRating.securityScore)&&
  Objects.equals(this.performanceRating, objSSLRating.performanceRating)&&
  Objects.equals(this.compatibilityRating, objSSLRating.compatibilityRating);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SSLRating {\n");
      sb.append("    compatibilityRating: ").append(toIndentedString(compatibilityRating)).append("\n");
        sb.append("    performanceRating: ").append(toIndentedString(performanceRating)).append("\n");
        sb.append("    securityScore: ").append(toIndentedString(securityScore)).append("\n");
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

