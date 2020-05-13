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
 * MetricsApiSrvDebugFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "MetricsApiSrvDebugFilter")
@VsoFinder(name = Constants.FINDER_VRO_METRICSAPISRVDEBUGFILTER, idAccessor = "getObjectID()")
@Service
public class MetricsApiSrvDebugFilter extends AviRestResource  {
  @JsonProperty("entity_ref")
  private String entityRef = null;

  
  /**
   * uuid of the entity. It is a reference to an object of type Virtualservice. Field introduced in 18.2.3.
   * @return entityRef
  **/
  @ApiModelProperty(value = "uuid of the entity. It is a reference to an object of type Virtualservice. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getEntityRef() {
    return entityRef;
  }
    
  @VsoMethod
  public void setEntityRef(String entityRef) {
    this.entityRef = entityRef;
  }

  
  public String getObjectID() {
		return "MetricsApiSrvDebugFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsApiSrvDebugFilter metricsApiSrvDebugFilter = (MetricsApiSrvDebugFilter) o;
    return Objects.equals(this.entityRef, metricsApiSrvDebugFilter.entityRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsApiSrvDebugFilter {\n");
    
    sb.append("    entityRef: ").append(toIndentedString(entityRef)).append("\n");
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

