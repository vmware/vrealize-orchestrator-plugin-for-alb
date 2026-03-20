package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.PolicySpec;
import com.vmware.avi.vro.model.RetentionSummary;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The RetentionPolicy is a POJO class extends AviRestResource that used for creating
 * RetentionPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "RetentionPolicy")
@VsoFinder(name = Constants.FINDER_VRO_RETENTIONPOLICY, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class RetentionPolicy extends AviRestResource {
    @JsonProperty("enabled")
    @JsonInclude(Include.NON_NULL)
    private Boolean enabled = true;

    @JsonProperty("history")
    @JsonInclude(Include.NON_NULL)
    private List<RetentionSummary> history;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("policy")
    @JsonInclude(Include.NON_NULL)
    private PolicySpec policy;

    @JsonProperty("summary")
    @JsonInclude(Include.NON_NULL)
    private RetentionSummary summary;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Enables the policy.
   * Field introduced in 31.1.1.
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
   * Enables the policy.
   * Field introduced in 31.1.1.
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
   * History of previous runs.
   * Field introduced in 31.1.1.
   * Maximum of 10 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return history
   */
  @VsoMethod
  public List<RetentionSummary> getHistory() {
    return history;
  }

  /**
   * This is the setter method. this will set the history
   * History of previous runs.
   * Field introduced in 31.1.1.
   * Maximum of 10 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return history
   */
  @VsoMethod
  public void setHistory(List<RetentionSummary>  history) {
    this.history = history;
  }

  /**
   * This is the setter method this will set the history
   * History of previous runs.
   * Field introduced in 31.1.1.
   * Maximum of 10 items allowed.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return history
   */
  @VsoMethod
  public RetentionPolicy addHistoryItem(RetentionSummary historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<RetentionSummary>();
    }
    this.history.add(historyItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of the policy.
   * Field introduced in 31.1.1.
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
   * Name of the policy.
   * Field introduced in 31.1.1.
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
   * Policy specification.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return policy
   */
  @VsoMethod
  public PolicySpec getPolicy() {
    return policy;
  }

  /**
   * This is the setter method to the attribute.
   * Policy specification.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param policy set the policy.
   */
  @VsoMethod
  public void setPolicy(PolicySpec policy) {
    this.policy = policy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Details of most recent run.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @return summary
   */
  @VsoMethod
  public RetentionSummary getSummary() {
    return summary;
  }

  /**
   * This is the setter method to the attribute.
   * Details of most recent run.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * @param summary set the summary.
   */
  @VsoMethod
  public void setSummary(RetentionSummary summary) {
    this.summary = summary;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Tenant uuid associated with the object.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant uuid associated with the object.
   * It is a reference to an object of type tenant.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid identifier for the policy.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid identifier for the policy.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  RetentionPolicy objRetentionPolicy = (RetentionPolicy) o;
  return   Objects.equals(this.uuid, objRetentionPolicy.uuid)&&
  Objects.equals(this.name, objRetentionPolicy.name)&&
  Objects.equals(this.summary, objRetentionPolicy.summary)&&
  Objects.equals(this.history, objRetentionPolicy.history)&&
  Objects.equals(this.enabled, objRetentionPolicy.enabled)&&
  Objects.equals(this.policy, objRetentionPolicy.policy)&&
  Objects.equals(this.tenantRef, objRetentionPolicy.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class RetentionPolicy {\n");
      sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    history: ").append(toIndentedString(history)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

