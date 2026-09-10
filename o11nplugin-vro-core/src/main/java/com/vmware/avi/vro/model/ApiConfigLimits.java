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
 * The ApiConfigLimits is a POJO class extends AviRestResource that used for creating
 * ApiConfigLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApiConfigLimits")
@VsoFinder(name = Constants.FINDER_VRO_APICONFIGLIMITS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApiConfigLimits extends AviRestResource {
    @JsonProperty("num_api_paths_per_policy")
    @JsonInclude(Include.NON_NULL)
    private Integer numApiPathsPerPolicy;

    @JsonProperty("num_api_schemas_per_policy")
    @JsonInclude(Include.NON_NULL)
    private Integer numApiSchemasPerPolicy;

    @JsonProperty("num_apis")
    @JsonInclude(Include.NON_NULL)
    private Integer numApis;

    @JsonProperty("num_schema_nesting")
    @JsonInclude(Include.NON_NULL)
    private Integer numSchemaNesting;



  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of api path definitions (unique url path patterns) that can be configured for a single api policy.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numApiPathsPerPolicy
   */
  @VsoMethod
  public Integer getNumApiPathsPerPolicy() {
    return numApiPathsPerPolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of api path definitions (unique url path patterns) that can be configured for a single api policy.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numApiPathsPerPolicy set the numApiPathsPerPolicy.
   */
  @VsoMethod
  public void setNumApiPathsPerPolicy(Integer  numApiPathsPerPolicy) {
    this.numApiPathsPerPolicy = numApiPathsPerPolicy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum number of api schema objects that can be associated with a single api policy.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numApiSchemasPerPolicy
   */
  @VsoMethod
  public Integer getNumApiSchemasPerPolicy() {
    return numApiSchemasPerPolicy;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum number of api schema objects that can be associated with a single api policy.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numApiSchemasPerPolicy set the numApiSchemasPerPolicy.
   */
  @VsoMethod
  public void setNumApiSchemasPerPolicy(Integer  numApiSchemasPerPolicy) {
    this.numApiSchemasPerPolicy = numApiSchemasPerPolicy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum total number of api endpoints allowed across the system.
   * Each apipath can have up to 7 apiendpoints.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numApis
   */
  @VsoMethod
  public Integer getNumApis() {
    return numApis;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum total number of api endpoints allowed across the system.
   * Each apipath can have up to 7 apiendpoints.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numApis set the numApis.
   */
  @VsoMethod
  public void setNumApis(Integer  numApis) {
    this.numApis = numApis;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Maximum allowed nesting depth of json schema definitions within an api policy.
   * Schema structures that exceed this depth will be rejected at config time.
   * In the datapath, json payloads with greater nesting depth will not be parsed.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return numSchemaNesting
   */
  @VsoMethod
  public Integer getNumSchemaNesting() {
    return numSchemaNesting;
  }

  /**
   * This is the setter method to the attribute.
   * Maximum allowed nesting depth of json schema definitions within an api policy.
   * Schema structures that exceed this depth will be rejected at config time.
   * In the datapath, json payloads with greater nesting depth will not be parsed.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param numSchemaNesting set the numSchemaNesting.
   */
  @VsoMethod
  public void setNumSchemaNesting(Integer  numSchemaNesting) {
    this.numSchemaNesting = numSchemaNesting;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ApiConfigLimits objApiConfigLimits = (ApiConfigLimits) o;
  return   Objects.equals(this.numApis, objApiConfigLimits.numApis)&&
  Objects.equals(this.numApiPathsPerPolicy, objApiConfigLimits.numApiPathsPerPolicy)&&
  Objects.equals(this.numApiSchemasPerPolicy, objApiConfigLimits.numApiSchemasPerPolicy)&&
  Objects.equals(this.numSchemaNesting, objApiConfigLimits.numSchemaNesting);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApiConfigLimits {\n");
      sb.append("    numApiPathsPerPolicy: ").append(toIndentedString(numApiPathsPerPolicy)).append("\n");
        sb.append("    numApiSchemasPerPolicy: ").append(toIndentedString(numApiSchemasPerPolicy)).append("\n");
        sb.append("    numApis: ").append(toIndentedString(numApis)).append("\n");
        sb.append("    numSchemaNesting: ").append(toIndentedString(numSchemaNesting)).append("\n");
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

