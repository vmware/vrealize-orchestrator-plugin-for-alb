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
 * The SecMgrDebugFocusEntry is a POJO class extends AviRestResource that used for creating
 * SecMgrDebugFocusEntry.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SecMgrDebugFocusEntry")
@VsoFinder(name = Constants.FINDER_VRO_SECMGRDEBUGFOCUSENTRY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SecMgrDebugFocusEntry extends AviRestResource {
    @JsonProperty("duration")
    @JsonInclude(Include.NON_NULL)
    private Integer duration = 60;

    @JsonProperty("max_events")
    @JsonInclude(Include.NON_NULL)
    private Integer maxEvents = 500;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("se_ref")
    @JsonInclude(Include.NON_NULL)
    private String seRef;

    @JsonProperty("stage")
    @JsonInclude(Include.NON_NULL)
    private String stage = "STAGE_ALL";

    @JsonProperty("uri")
    @JsonInclude(Include.NON_NULL)
    private String uri;

    @JsonProperty("vs_ref")
    @JsonInclude(Include.NON_NULL)
    private String vsRef;



  /**
   * This is the getter method this will return the attribute value.
   * How long this focus entry stays active before automatic expiry, in minutes (max 3h — starting conservative, may be raised later).
   * Unlike debugvirtualservicecapture.duration, 0/infinite is not allowed — every focus entry must self-expire eventually.
   * Allowed values are 1-180.
   * Field introduced in 32.1.4.
   * Unit is min.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @return duration
   */
  @VsoMethod
  public Integer getDuration() {
    return duration;
  }

  /**
   * This is the setter method to the attribute.
   * How long this focus entry stays active before automatic expiry, in minutes (max 3h — starting conservative, may be raised later).
   * Unlike debugvirtualservicecapture.duration, 0/infinite is not allowed — every focus entry must self-expire eventually.
   * Allowed values are 1-180.
   * Field introduced in 32.1.4.
   * Unit is min.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 60.
   * @param duration set the duration.
   */
  @VsoMethod
  public void setDuration(Integer  duration) {
    this.duration = duration;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Max events retained in this entry's ring buffer.
   * Mirrors debugvirtualservicecapture.num_pkts.
   * Changing this on an existing entry reallocates its buffer, discarding the trace captured so far.
   * Allowed values are 1-500.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 500.
   * @return maxEvents
   */
  @VsoMethod
  public Integer getMaxEvents() {
    return maxEvents;
  }

  /**
   * This is the setter method to the attribute.
   * Max events retained in this entry's ring buffer.
   * Mirrors debugvirtualservicecapture.num_pkts.
   * Changing this on an existing entry reallocates its buffer, discarding the trace captured so far.
   * Allowed values are 1-500.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 500.
   * @param maxEvents set the maxEvents.
   */
  @VsoMethod
  public void setMaxEvents(Integer  maxEvents) {
    this.maxEvents = maxEvents;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Unique name for this focus entry, chosen by the operator.
   * Used to create/edit, remove, and dump this entry (see 'show securitymgr stats filter stage stage_debug_focus filter focus_name <name>').
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Unique name for this focus entry, chosen by the operator.
   * Used to create/edit, remove, and dump this entry (see 'show securitymgr stats filter stage stage_debug_focus filter focus_name <name>').
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Service engine to focus on.
   * Empty = any se.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return seRef
   */
  @VsoMethod
  public String getSeRef() {
    return seRef;
  }

  /**
   * This is the setter method to the attribute.
   * Service engine to focus on.
   * Empty = any se.
   * It is a reference to an object of type serviceengine.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param seRef set the seRef.
   */
  @VsoMethod
  public void setSeRef(String  seRef) {
    this.seRef = seRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Pipeline stage to focus on.
   * Defaults to all stages.
   * Enum options - STAGE_ALL, STAGE_INGRESS, STAGE_ENDPOINT_CLASSIFICATION, STAGE_ENDPOINT_CONSOLIDATION, STAGE_CONFIG_SYNC, STAGE_LEARNING_DB_SWEEP,
   * STAGE_WAAP_HITS_POPULATOR, STAGE_DEBUG_FOCUS.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "STAGE_ALL".
   * @return stage
   */
  @VsoMethod
  public String getStage() {
    return stage;
  }

  /**
   * This is the setter method to the attribute.
   * Pipeline stage to focus on.
   * Defaults to all stages.
   * Enum options - STAGE_ALL, STAGE_INGRESS, STAGE_ENDPOINT_CLASSIFICATION, STAGE_ENDPOINT_CONSOLIDATION, STAGE_CONFIG_SYNC, STAGE_LEARNING_DB_SWEEP,
   * STAGE_WAAP_HITS_POPULATOR, STAGE_DEBUG_FOCUS.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "STAGE_ALL".
   * @param stage set the stage.
   */
  @VsoMethod
  public void setStage(String  stage) {
    this.stage = stage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uri path to focus on.
   * Empty = any uri.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uri
   */
  @VsoMethod
  public String getUri() {
    return uri;
  }

  /**
   * This is the setter method to the attribute.
   * Uri path to focus on.
   * Empty = any uri.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uri set the uri.
   */
  @VsoMethod
  public void setUri(String  uri) {
    this.uri = uri;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Virtual service to focus on.
   * Empty = any vs.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vsRef
   */
  @VsoMethod
  public String getVsRef() {
    return vsRef;
  }

  /**
   * This is the setter method to the attribute.
   * Virtual service to focus on.
   * Empty = any vs.
   * It is a reference to an object of type virtualservice.
   * Field introduced in 32.1.4.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vsRef set the vsRef.
   */
  @VsoMethod
  public void setVsRef(String  vsRef) {
    this.vsRef = vsRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SecMgrDebugFocusEntry objSecMgrDebugFocusEntry = (SecMgrDebugFocusEntry) o;
  return   Objects.equals(this.name, objSecMgrDebugFocusEntry.name)&&
  Objects.equals(this.vsRef, objSecMgrDebugFocusEntry.vsRef)&&
  Objects.equals(this.seRef, objSecMgrDebugFocusEntry.seRef)&&
  Objects.equals(this.uri, objSecMgrDebugFocusEntry.uri)&&
  Objects.equals(this.stage, objSecMgrDebugFocusEntry.stage)&&
  Objects.equals(this.duration, objSecMgrDebugFocusEntry.duration)&&
  Objects.equals(this.maxEvents, objSecMgrDebugFocusEntry.maxEvents);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SecMgrDebugFocusEntry {\n");
      sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    maxEvents: ").append(toIndentedString(maxEvents)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    vsRef: ").append(toIndentedString(vsRef)).append("\n");
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

