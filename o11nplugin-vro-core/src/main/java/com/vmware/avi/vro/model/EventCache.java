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
 * The EventCache is a POJO class extends AviRestResource that used for creating
 * EventCache.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "EventCache")
@VsoFinder(name = Constants.FINDER_VRO_EVENTCACHE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class EventCache extends AviRestResource {
  @JsonProperty("dns_state")
  @JsonInclude(Include.NON_NULL)
  private Boolean dnsState = null;

  @JsonProperty("exceptions")
  @JsonInclude(Include.NON_NULL)
  private List<String> exceptions = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property dns_state of obj type eventcache field type str  type boolean.
   * @return dnsState
   */
  @VsoMethod
  public Boolean getDnsState() {
    return dnsState;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property dns_state of obj type eventcache field type str  type boolean.
   * @param dnsState set the dnsState.
   */
  @VsoMethod
  public void setDnsState(Boolean  dnsState) {
    this.dnsState = dnsState;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cache the exception strings in the system.
   * @return exceptions
   */
  @VsoMethod
  public List<String> getExceptions() {
    return exceptions;
  }

  /**
   * This is the setter method. this will set the exceptions
   * Cache the exception strings in the system.
   * @return exceptions
   */
  @VsoMethod
  public void setExceptions(List<String>  exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * This is the setter method this will set the exceptions
   * Cache the exception strings in the system.
   * @return exceptions
   */
  @VsoMethod
  public EventCache addExceptionsItem(String exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<String>();
    }
    this.exceptions.add(exceptionsItem);
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
  EventCache objEventCache = (EventCache) o;
  return   Objects.equals(this.exceptions, objEventCache.exceptions)&&
  Objects.equals(this.dnsState, objEventCache.dnsState);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class EventCache {\n");
      sb.append("    dnsState: ").append(toIndentedString(dnsState)).append("\n");
        sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

