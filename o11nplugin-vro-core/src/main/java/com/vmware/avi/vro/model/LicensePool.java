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
 * The LicensePool is a POJO class extends AviRestResource that used for creating
 * LicensePool.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "LicensePool")
@VsoFinder(name = Constants.FINDER_VRO_LICENSEPOOL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class LicensePool extends AviRestResource {
    @JsonProperty("available_service_units")
    @JsonInclude(Include.NON_NULL)
    private Float availableServiceUnits;

    @JsonProperty("pool_id")
    @JsonInclude(Include.NON_NULL)
    private String poolId;

    @JsonProperty("pool_name")
    @JsonInclude(Include.NON_NULL)
    private String poolName;

    @JsonProperty("used_service_units")
    @JsonInclude(Include.NON_NULL)
    private Float usedServiceUnits;



  /**
   * This is the getter method this will return the attribute value.
   * Available service units in the pool.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return availableServiceUnits
   */
  @VsoMethod
  public Float getAvailableServiceUnits() {
    return availableServiceUnits;
  }

  /**
   * This is the setter method to the attribute.
   * Available service units in the pool.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param availableServiceUnits set the availableServiceUnits.
   */
  @VsoMethod
  public void setAvailableServiceUnits(Float  availableServiceUnits) {
    this.availableServiceUnits = availableServiceUnits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pool id.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolId
   */
  @VsoMethod
  public String getPoolId() {
    return poolId;
  }

  /**
   * This is the setter method to the attribute.
   * Pool id.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolId set the poolId.
   */
  @VsoMethod
  public void setPoolId(String  poolId) {
    this.poolId = poolId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pool name.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolName
   */
  @VsoMethod
  public String getPoolName() {
    return poolName;
  }

  /**
   * This is the setter method to the attribute.
   * Pool name.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolName set the poolName.
   */
  @VsoMethod
  public void setPoolName(String  poolName) {
    this.poolName = poolName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Used service units in the pool.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return usedServiceUnits
   */
  @VsoMethod
  public Float getUsedServiceUnits() {
    return usedServiceUnits;
  }

  /**
   * This is the setter method to the attribute.
   * Used service units in the pool.
   * Field introduced in 32.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param usedServiceUnits set the usedServiceUnits.
   */
  @VsoMethod
  public void setUsedServiceUnits(Float  usedServiceUnits) {
    this.usedServiceUnits = usedServiceUnits;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  LicensePool objLicensePool = (LicensePool) o;
  return   Objects.equals(this.poolName, objLicensePool.poolName)&&
  Objects.equals(this.poolId, objLicensePool.poolId)&&
  Objects.equals(this.availableServiceUnits, objLicensePool.availableServiceUnits)&&
  Objects.equals(this.usedServiceUnits, objLicensePool.usedServiceUnits);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class LicensePool {\n");
      sb.append("    availableServiceUnits: ").append(toIndentedString(availableServiceUnits)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    usedServiceUnits: ").append(toIndentedString(usedServiceUnits)).append("\n");
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

