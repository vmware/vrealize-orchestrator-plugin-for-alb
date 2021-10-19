package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.BotIdentification;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The BotEvaluationResult is a POJO class extends AviRestResource that used for creating
 * BotEvaluationResult.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BotEvaluationResult")
@VsoFinder(name = Constants.FINDER_VRO_BOTEVALUATIONRESULT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BotEvaluationResult extends AviRestResource {
    @JsonProperty("component")
    @JsonInclude(Include.NON_NULL)
    private String component = null;

    @JsonProperty("confidence")
    @JsonInclude(Include.NON_NULL)
    private String confidence = null;

    @JsonProperty("identification")
    @JsonInclude(Include.NON_NULL)
    private BotIdentification identification = null;

    @JsonProperty("notes")
    @JsonInclude(Include.NON_NULL)
    private List<String> notes = null;



  /**
   * This is the getter method this will return the attribute value.
   * The component of the bot module that made this evaluation.
   * Enum options - BOT_DECIDER_CONSOLIDATION, BOT_DECIDER_USER_AGENT, BOT_DECIDER_IP_REPUTATION, BOT_DECIDER_IP_NETWORK_LOCATION.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return component
   */
  @VsoMethod
  public String getComponent() {
    return component;
  }

  /**
   * This is the setter method to the attribute.
   * The component of the bot module that made this evaluation.
   * Enum options - BOT_DECIDER_CONSOLIDATION, BOT_DECIDER_USER_AGENT, BOT_DECIDER_IP_REPUTATION, BOT_DECIDER_IP_NETWORK_LOCATION.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param component set the component.
   */
  @VsoMethod
  public void setComponent(String  component) {
    this.component = component;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The confidence of this evaluation.
   * Enum options - LOW_CONFIDENCE, MEDIUM_CONFIDENCE, HIGH_CONFIDENCE.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return confidence
   */
  @VsoMethod
  public String getConfidence() {
    return confidence;
  }

  /**
   * This is the setter method to the attribute.
   * The confidence of this evaluation.
   * Enum options - LOW_CONFIDENCE, MEDIUM_CONFIDENCE, HIGH_CONFIDENCE.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param confidence set the confidence.
   */
  @VsoMethod
  public void setConfidence(String  confidence) {
    this.confidence = confidence;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The resulting bot identification.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return identification
   */
  @VsoMethod
  public BotIdentification getIdentification() {
    return identification;
  }

  /**
   * This is the setter method to the attribute.
   * The resulting bot identification.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param identification set the identification.
   */
  @VsoMethod
  public void setIdentification(BotIdentification identification) {
    this.identification = identification;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Additional notes for this result.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return notes
   */
  @VsoMethod
  public List<String> getNotes() {
    return notes;
  }

  /**
   * This is the setter method. this will set the notes
   * Additional notes for this result.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return notes
   */
  @VsoMethod
  public void setNotes(List<String>  notes) {
    this.notes = notes;
  }

  /**
   * This is the setter method this will set the notes
   * Additional notes for this result.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return notes
   */
  @VsoMethod
  public BotEvaluationResult addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
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
  BotEvaluationResult objBotEvaluationResult = (BotEvaluationResult) o;
  return   Objects.equals(this.component, objBotEvaluationResult.component)&&
  Objects.equals(this.identification, objBotEvaluationResult.identification)&&
  Objects.equals(this.confidence, objBotEvaluationResult.confidence)&&
  Objects.equals(this.notes, objBotEvaluationResult.notes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BotEvaluationResult {\n");
      sb.append("    component: ").append(toIndentedString(component)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

