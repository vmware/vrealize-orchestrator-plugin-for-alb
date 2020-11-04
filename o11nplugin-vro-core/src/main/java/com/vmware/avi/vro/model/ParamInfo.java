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
 * The ParamInfo is a POJO class extends AviRestResource that used for creating
 * ParamInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ParamInfo")
@VsoFinder(name = Constants.FINDER_VRO_PARAMINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ParamInfo extends AviRestResource {
    @JsonProperty("param_hits")
    @JsonInclude(Include.NON_NULL)
    private Integer paramHits = null;

    @JsonProperty("param_key")
    @JsonInclude(Include.NON_NULL)
    private String paramKey = null;

    @JsonProperty("param_size_classes")
    @JsonInclude(Include.NON_NULL)
    private List<ParamSizeClass> paramSizeClasses = null;

    @JsonProperty("param_type_classes")
    @JsonInclude(Include.NON_NULL)
    private List<ParamTypeClass> paramTypeClasses = null;



  /**
   * This is the getter method this will return the attribute value.
   * Number of hits for a param.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramHits
   */
  @VsoMethod
  public Integer getParamHits() {
    return paramHits;
  }

  /**
   * This is the setter method to the attribute.
   * Number of hits for a param.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param paramHits set the paramHits.
   */
  @VsoMethod
  public void setParamHits(Integer  paramHits) {
    this.paramHits = paramHits;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Param name.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramKey
   */
  @VsoMethod
  public String getParamKey() {
    return paramKey;
  }

  /**
   * This is the setter method to the attribute.
   * Param name.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param paramKey set the paramKey.
   */
  @VsoMethod
  public void setParamKey(String  paramKey) {
    this.paramKey = paramKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Various param size and its respective hit count.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramSizeClasses
   */
  @VsoMethod
  public List<ParamSizeClass> getParamSizeClasses() {
    return paramSizeClasses;
  }

  /**
   * This is the setter method. this will set the paramSizeClasses
   * Various param size and its respective hit count.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramSizeClasses
   */
  @VsoMethod
  public void setParamSizeClasses(List<ParamSizeClass>  paramSizeClasses) {
    this.paramSizeClasses = paramSizeClasses;
  }

  /**
   * This is the setter method this will set the paramSizeClasses
   * Various param size and its respective hit count.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramSizeClasses
   */
  @VsoMethod
  public ParamInfo addParamSizeClassesItem(ParamSizeClass paramSizeClassesItem) {
    if (this.paramSizeClasses == null) {
      this.paramSizeClasses = new ArrayList<ParamSizeClass>();
    }
    this.paramSizeClasses.add(paramSizeClassesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Various param type and its respective hit count.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramTypeClasses
   */
  @VsoMethod
  public List<ParamTypeClass> getParamTypeClasses() {
    return paramTypeClasses;
  }

  /**
   * This is the setter method. this will set the paramTypeClasses
   * Various param type and its respective hit count.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramTypeClasses
   */
  @VsoMethod
  public void setParamTypeClasses(List<ParamTypeClass>  paramTypeClasses) {
    this.paramTypeClasses = paramTypeClasses;
  }

  /**
   * This is the setter method this will set the paramTypeClasses
   * Various param type and its respective hit count.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return paramTypeClasses
   */
  @VsoMethod
  public ParamInfo addParamTypeClassesItem(ParamTypeClass paramTypeClassesItem) {
    if (this.paramTypeClasses == null) {
      this.paramTypeClasses = new ArrayList<ParamTypeClass>();
    }
    this.paramTypeClasses.add(paramTypeClassesItem);
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
  ParamInfo objParamInfo = (ParamInfo) o;
  return   Objects.equals(this.paramHits, objParamInfo.paramHits)&&
  Objects.equals(this.paramKey, objParamInfo.paramKey)&&
  Objects.equals(this.paramTypeClasses, objParamInfo.paramTypeClasses)&&
  Objects.equals(this.paramSizeClasses, objParamInfo.paramSizeClasses);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ParamInfo {\n");
      sb.append("    paramHits: ").append(toIndentedString(paramHits)).append("\n");
        sb.append("    paramKey: ").append(toIndentedString(paramKey)).append("\n");
        sb.append("    paramSizeClasses: ").append(toIndentedString(paramSizeClasses)).append("\n");
        sb.append("    paramTypeClasses: ").append(toIndentedString(paramTypeClasses)).append("\n");
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

