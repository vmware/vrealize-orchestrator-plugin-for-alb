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
 * The ZombieApiClassificationSettings is a POJO class extends AviRestResource that used for creating
 * ZombieApiClassificationSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ZombieApiClassificationSettings")
@VsoFinder(name = Constants.FINDER_VRO_ZOMBIEAPICLASSIFICATIONSETTINGS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ZombieApiClassificationSettings extends AviRestResource {
    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled = true;

    @JsonProperty("inspection_interval_unit")
    @JsonInclude(Include.NON_NULL)
    private String inspectionIntervalUnit = "INTERVAL_DAYS";

    @JsonProperty("inspection_interval_value")
    @JsonInclude(Include.NON_NULL)
    private Integer inspectionIntervalValue = 30;

    @JsonProperty("min_percent")
    @JsonInclude(Include.NON_NULL)
    private Float minPercent = 1.0f;



  /**
   * This is the getter method this will return the attribute value.
   * Enables zombie api classification.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return enabled
   */
  @VsoMethod
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * This is the setter method to the attribute.
   * Enables zombie api classification.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param enabled set the enabled.
   */
  @VsoMethod
  public void setEnabled(Boolean  enabled) {
    this.enabled = enabled;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Time unit for the zombie inspection interval.
   * Enum options - INTERVAL_MINUTES, INTERVAL_HOURS, INTERVAL_DAYS.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "INTERVAL_DAYS".
   * @return inspectionIntervalUnit
   */
  @VsoMethod
  public String getInspectionIntervalUnit() {
    return inspectionIntervalUnit;
  }

  /**
   * This is the setter method to the attribute.
   * Time unit for the zombie inspection interval.
   * Enum options - INTERVAL_MINUTES, INTERVAL_HOURS, INTERVAL_DAYS.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "INTERVAL_DAYS".
   * @param inspectionIntervalUnit set the inspectionIntervalUnit.
   */
  @VsoMethod
  public void setInspectionIntervalUnit(String  inspectionIntervalUnit) {
    this.inspectionIntervalUnit = inspectionIntervalUnit;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Duration of the zombie inspection interval in the specified time unit.
   * An endpoint whose traffic falls below the zombie threshold for this duration is classified as zombie.
   * Allowed values are 1-365.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @return inspectionIntervalValue
   */
  @VsoMethod
  public Integer getInspectionIntervalValue() {
    return inspectionIntervalValue;
  }

  /**
   * This is the setter method to the attribute.
   * Duration of the zombie inspection interval in the specified time unit.
   * An endpoint whose traffic falls below the zombie threshold for this duration is classified as zombie.
   * Allowed values are 1-365.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 30.
   * @param inspectionIntervalValue set the inspectionIntervalValue.
   */
  @VsoMethod
  public void setInspectionIntervalValue(Integer  inspectionIntervalValue) {
    this.inspectionIntervalValue = inspectionIntervalValue;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Per-api throughput percentage threshold relative to the aggregated throughput below which apis are designated as zombie.
   * Allowed values are 0-100.
   * Field introduced in 32.1.4.
   * Unit is percent.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.0f.
   * @return minPercent
   */
  @VsoMethod
  public Float getMinPercent() {
    return minPercent;
  }

  /**
   * This is the setter method to the attribute.
   * Per-api throughput percentage threshold relative to the aggregated throughput below which apis are designated as zombie.
   * Allowed values are 0-100.
   * Field introduced in 32.1.4.
   * Unit is percent.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.0f.
   * @param minPercent set the minPercent.
   */
  @VsoMethod
  public void setMinPercent(Float  minPercent) {
    this.minPercent = minPercent;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ZombieApiClassificationSettings objZombieApiClassificationSettings = (ZombieApiClassificationSettings) o;
  return   Objects.equals(this.enabled, objZombieApiClassificationSettings.enabled)&&
  Objects.equals(this.minPercent, objZombieApiClassificationSettings.minPercent)&&
  Objects.equals(this.inspectionIntervalUnit, objZombieApiClassificationSettings.inspectionIntervalUnit)&&
  Objects.equals(this.inspectionIntervalValue, objZombieApiClassificationSettings.inspectionIntervalValue);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ZombieApiClassificationSettings {\n");
      sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    inspectionIntervalUnit: ").append(toIndentedString(inspectionIntervalUnit)).append("\n");
        sb.append("    inspectionIntervalValue: ").append(toIndentedString(inspectionIntervalValue)).append("\n");
        sb.append("    minPercent: ").append(toIndentedString(minPercent)).append("\n");
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

