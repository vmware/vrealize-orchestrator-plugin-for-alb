package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.AppLearningConfidenceOverride;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The PositiveSecurityParams is a POJO class extends AviRestResource that used for creating
 * PositiveSecurityParams.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PositiveSecurityParams")
@VsoFinder(name = Constants.FINDER_VRO_POSITIVESECURITYPARAMS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PositiveSecurityParams extends AviRestResource {
    @JsonProperty("confidence_override")
    @JsonInclude(Include.NON_NULL)
    private AppLearningConfidenceOverride confidenceOverride;

    @JsonProperty("max_params")
    @JsonInclude(Include.NON_NULL)
    private Integer maxParams = 100;

    @JsonProperty("max_uris")
    @JsonInclude(Include.NON_NULL)
    private Integer maxUris = 500;

    @JsonProperty("min_confidence")
    @JsonInclude(Include.NON_NULL)
    private String minConfidence = "CONFIDENCE_VERY_HIGH";

    @JsonProperty("min_hits_to_program")
    @JsonInclude(Include.NON_NULL)
    private Integer minHitsToProgram = 10000;



  /**
   * This is the getter method this will return the attribute value.
   * Configure thresholds for the confidence labels defined by applearningconfidencelabel.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return confidenceOverride
   */
  @VsoMethod
  public AppLearningConfidenceOverride getConfidenceOverride() {
    return confidenceOverride;
  }

  /**
   * This is the setter method to the attribute.
   * Configure thresholds for the confidence labels defined by applearningconfidencelabel.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param confidenceOverride set the confidenceOverride.
   */
  @VsoMethod
  public void setConfidenceOverride(AppLearningConfidenceOverride confidenceOverride) {
    this.confidenceOverride = confidenceOverride;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of parameters per uri programmed for an application.
   * Allowed values are 10-1000.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @return maxParams
   */
  @VsoMethod
  public Integer getMaxParams() {
    return maxParams;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of parameters per uri programmed for an application.
   * Allowed values are 10-1000.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 100.
   * @param maxParams set the maxParams.
   */
  @VsoMethod
  public void setMaxParams(Integer  maxParams) {
    this.maxParams = maxParams;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of uris programmed for an application.
   * Allowed values are 10-10000.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 500.
   * @return maxUris
   */
  @VsoMethod
  public Integer getMaxUris() {
    return maxUris;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of uris programmed for an application.
   * Allowed values are 10-10000.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 500.
   * @param maxUris set the maxUris.
   */
  @VsoMethod
  public void setMaxUris(Integer  maxUris) {
    this.maxUris = maxUris;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum confidence label required for positive security rule updates.
   * Enum options - CONFIDENCE_VERY_HIGH, CONFIDENCE_HIGH, CONFIDENCE_PROBABLE, CONFIDENCE_LOW, CONFIDENCE_NONE.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "CONFIDENCE_VERY_HIGH".
   * @return minConfidence
   */
  @VsoMethod
  public String getMinConfidence() {
    return minConfidence;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum confidence label required for positive security rule updates.
   * Enum options - CONFIDENCE_VERY_HIGH, CONFIDENCE_HIGH, CONFIDENCE_PROBABLE, CONFIDENCE_LOW, CONFIDENCE_NONE.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "CONFIDENCE_VERY_HIGH".
   * @param minConfidence set the minConfidence.
   */
  @VsoMethod
  public void setMinConfidence(String  minConfidence) {
    this.minConfidence = minConfidence;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Minimum number of occurances required for a param to qualify for programming into a psm rule.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @return minHitsToProgram
   */
  @VsoMethod
  public Integer getMinHitsToProgram() {
    return minHitsToProgram;
  }

  /**
   * This is the setter method to the attribute.
   * Minimum number of occurances required for a param to qualify for programming into a psm rule.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 10000.
   * @param minHitsToProgram set the minHitsToProgram.
   */
  @VsoMethod
  public void setMinHitsToProgram(Integer  minHitsToProgram) {
    this.minHitsToProgram = minHitsToProgram;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PositiveSecurityParams objPositiveSecurityParams = (PositiveSecurityParams) o;
  return   Objects.equals(this.maxUris, objPositiveSecurityParams.maxUris)&&
  Objects.equals(this.maxParams, objPositiveSecurityParams.maxParams)&&
  Objects.equals(this.minHitsToProgram, objPositiveSecurityParams.minHitsToProgram)&&
  Objects.equals(this.minConfidence, objPositiveSecurityParams.minConfidence)&&
  Objects.equals(this.confidenceOverride, objPositiveSecurityParams.confidenceOverride);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class PositiveSecurityParams {\n");
      sb.append("    confidenceOverride: ").append(toIndentedString(confidenceOverride)).append("\n");
        sb.append("    maxParams: ").append(toIndentedString(maxParams)).append("\n");
        sb.append("    maxUris: ").append(toIndentedString(maxUris)).append("\n");
        sb.append("    minConfidence: ").append(toIndentedString(minConfidence)).append("\n");
        sb.append("    minHitsToProgram: ").append(toIndentedString(minHitsToProgram)).append("\n");
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

