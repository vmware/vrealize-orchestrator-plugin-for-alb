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
 * SSLRating
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SSLRating")
@VsoFinder(name = Constants.FINDER_VRO_SSLRATING, idAccessor = "getObjectID()")
@Service
public class SSLRating extends AviRestResource  {
  @JsonProperty("compatibility_rating")
  private String compatibilityRating = null;

  @JsonProperty("performance_rating")
  private String performanceRating = null;

  @JsonProperty("security_score")
  private String securityScore = null;

  
  /**
   *  Enum options - SSL_SCORE_NOT_SECURE, SSL_SCORE_VERY_BAD, SSL_SCORE_BAD, SSL_SCORE_AVERAGE, SSL_SCORE_GOOD, SSL_SCORE_EXCELLENT.
   * @return compatibilityRating
  **/
  @ApiModelProperty(value = " Enum options - SSL_SCORE_NOT_SECURE, SSL_SCORE_VERY_BAD, SSL_SCORE_BAD, SSL_SCORE_AVERAGE, SSL_SCORE_GOOD, SSL_SCORE_EXCELLENT.")


 
  @VsoMethod  
  public String getCompatibilityRating() {
    return compatibilityRating;
  }
    
  @VsoMethod
  public void setCompatibilityRating(String compatibilityRating) {
    this.compatibilityRating = compatibilityRating;
  }

  
  /**
   *  Enum options - SSL_SCORE_NOT_SECURE, SSL_SCORE_VERY_BAD, SSL_SCORE_BAD, SSL_SCORE_AVERAGE, SSL_SCORE_GOOD, SSL_SCORE_EXCELLENT.
   * @return performanceRating
  **/
  @ApiModelProperty(value = " Enum options - SSL_SCORE_NOT_SECURE, SSL_SCORE_VERY_BAD, SSL_SCORE_BAD, SSL_SCORE_AVERAGE, SSL_SCORE_GOOD, SSL_SCORE_EXCELLENT.")


 
  @VsoMethod  
  public String getPerformanceRating() {
    return performanceRating;
  }
    
  @VsoMethod
  public void setPerformanceRating(String performanceRating) {
    this.performanceRating = performanceRating;
  }

  
  /**
   * security_score of SSLRating.
   * @return securityScore
  **/
  @ApiModelProperty(value = "security_score of SSLRating.")


 
  @VsoMethod  
  public String getSecurityScore() {
    return securityScore;
  }
    
  @VsoMethod
  public void setSecurityScore(String securityScore) {
    this.securityScore = securityScore;
  }

  
  public String getObjectID() {
		return "SSLRating";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLRating ssLRating = (SSLRating) o;
    return Objects.equals(this.compatibilityRating, ssLRating.compatibilityRating) &&
        Objects.equals(this.performanceRating, ssLRating.performanceRating) &&
        Objects.equals(this.securityScore, ssLRating.securityScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compatibilityRating, performanceRating, securityScore);
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

