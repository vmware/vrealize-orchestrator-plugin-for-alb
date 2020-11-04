package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.ALBServicesUser;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ALBServicesCase is a POJO class extends AviRestResource that used for creating
 * ALBServicesCase.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ALBServicesCase")
@VsoFinder(name = Constants.FINDER_VRO_ALBSERVICESCASE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ALBServicesCase extends AviRestResource {
    @JsonProperty("asset_id")
    @JsonInclude(Include.NON_NULL)
    private String assetId = null;

    @JsonProperty("case_attachments")
    @JsonInclude(Include.NON_NULL)
    private List<ALBServicesCaseAttachment> caseAttachments = null;

    @JsonProperty("case_created_by")
    @JsonInclude(Include.NON_NULL)
    private String caseCreatedBy = null;

    @JsonProperty("case_number")
    @JsonInclude(Include.NON_NULL)
    private String caseNumber = null;

    @JsonProperty("case_status")
    @JsonInclude(Include.NON_NULL)
    private String caseStatus = null;

    @JsonProperty("contact_info")
    @JsonInclude(Include.NON_NULL)
    private ALBServicesUser contactInfo = null;

    @JsonProperty("created_date")
    @JsonInclude(Include.NON_NULL)
    private String createdDate = null;

    @JsonProperty("custom_tag")
    @JsonInclude(Include.NON_NULL)
    private String customTag = null;

    @JsonProperty("deployment_environment")
    @JsonInclude(Include.NON_NULL)
    private String deploymentEnvironment = null;

    @JsonProperty("description")
    @JsonInclude(Include.NON_NULL)
    private String description = null;

    @JsonProperty("email")
    @JsonInclude(Include.NON_NULL)
    private String email = null;

    @JsonProperty("environment")
    @JsonInclude(Include.NON_NULL)
    private String environment = null;

    @JsonProperty("fr_business_justification")
    @JsonInclude(Include.NON_NULL)
    private String frBusinessJustification = null;

    @JsonProperty("fr_current_solution")
    @JsonInclude(Include.NON_NULL)
    private String frCurrentSolution = null;

    @JsonProperty("fr_timing")
    @JsonInclude(Include.NON_NULL)
    private String frTiming = null;

    @JsonProperty("fr_use_cases")
    @JsonInclude(Include.NON_NULL)
    private String frUseCases = null;

    @JsonProperty("id")
    @JsonInclude(Include.NON_NULL)
    private String id = null;

    @JsonProperty("last_modified_date")
    @JsonInclude(Include.NON_NULL)
    private String lastModifiedDate = null;

    @JsonProperty("patch_version")
    @JsonInclude(Include.NON_NULL)
    private String patchVersion = null;

    @JsonProperty("severity")
    @JsonInclude(Include.NON_NULL)
    private String severity = null;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status = null;

    @JsonProperty("subject")
    @JsonInclude(Include.NON_NULL)
    private String subject = null;

    @JsonProperty("time")
    @JsonInclude(Include.NON_NULL)
    private String time = null;

    @JsonProperty("type")
    @JsonInclude(Include.NON_NULL)
    private String type = null;

    @JsonProperty("version")
    @JsonInclude(Include.NON_NULL)
    private String version = null;



  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return assetId
   */
  @VsoMethod
  public String getAssetId() {
    return assetId;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param assetId set the assetId.
   */
  @VsoMethod
  public void setAssetId(String  assetId) {
    this.assetId = assetId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return caseAttachments
   */
  @VsoMethod
  public List<ALBServicesCaseAttachment> getCaseAttachments() {
    return caseAttachments;
  }

  /**
   * This is the setter method. this will set the caseAttachments
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return caseAttachments
   */
  @VsoMethod
  public void setCaseAttachments(List<ALBServicesCaseAttachment>  caseAttachments) {
    this.caseAttachments = caseAttachments;
  }

  /**
   * This is the setter method this will set the caseAttachments
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return caseAttachments
   */
  @VsoMethod
  public ALBServicesCase addCaseAttachmentsItem(ALBServicesCaseAttachment caseAttachmentsItem) {
    if (this.caseAttachments == null) {
      this.caseAttachments = new ArrayList<ALBServicesCaseAttachment>();
    }
    this.caseAttachments.add(caseAttachmentsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return caseCreatedBy
   */
  @VsoMethod
  public String getCaseCreatedBy() {
    return caseCreatedBy;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param caseCreatedBy set the caseCreatedBy.
   */
  @VsoMethod
  public void setCaseCreatedBy(String  caseCreatedBy) {
    this.caseCreatedBy = caseCreatedBy;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return caseNumber
   */
  @VsoMethod
  public String getCaseNumber() {
    return caseNumber;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param caseNumber set the caseNumber.
   */
  @VsoMethod
  public void setCaseNumber(String  caseNumber) {
    this.caseNumber = caseNumber;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return caseStatus
   */
  @VsoMethod
  public String getCaseStatus() {
    return caseStatus;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param caseStatus set the caseStatus.
   */
  @VsoMethod
  public void setCaseStatus(String  caseStatus) {
    this.caseStatus = caseStatus;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Contact information associated to particular case.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return contactInfo
   */
  @VsoMethod
  public ALBServicesUser getContactInfo() {
    return contactInfo;
  }

  /**
   * This is the setter method to the attribute.
   * Contact information associated to particular case.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param contactInfo set the contactInfo.
   */
  @VsoMethod
  public void setContactInfo(ALBServicesUser contactInfo) {
    this.contactInfo = contactInfo;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return createdDate
   */
  @VsoMethod
  public String getCreatedDate() {
    return createdDate;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param createdDate set the createdDate.
   */
  @VsoMethod
  public void setCreatedDate(String  createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return customTag
   */
  @VsoMethod
  public String getCustomTag() {
    return customTag;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param customTag set the customTag.
   */
  @VsoMethod
  public void setCustomTag(String  customTag) {
    this.customTag = customTag;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return deploymentEnvironment
   */
  @VsoMethod
  public String getDeploymentEnvironment() {
    return deploymentEnvironment;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param deploymentEnvironment set the deploymentEnvironment.
   */
  @VsoMethod
  public void setDeploymentEnvironment(String  deploymentEnvironment) {
    this.deploymentEnvironment = deploymentEnvironment;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return description
   */
  @VsoMethod
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param description set the description.
   */
  @VsoMethod
  public void setDescription(String  description) {
    this.description = description;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Email of the point of contact for a particular support case.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return email
   */
  @VsoMethod
  public String getEmail() {
    return email;
  }

  /**
   * This is the setter method to the attribute.
   * Email of the point of contact for a particular support case.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param email set the email.
   */
  @VsoMethod
  public void setEmail(String  email) {
    this.email = email;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return environment
   */
  @VsoMethod
  public String getEnvironment() {
    return environment;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param environment set the environment.
   */
  @VsoMethod
  public void setEnvironment(String  environment) {
    this.environment = environment;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Business justification for a feature request.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return frBusinessJustification
   */
  @VsoMethod
  public String getFrBusinessJustification() {
    return frBusinessJustification;
  }

  /**
   * This is the setter method to the attribute.
   * Business justification for a feature request.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param frBusinessJustification set the frBusinessJustification.
   */
  @VsoMethod
  public void setFrBusinessJustification(String  frBusinessJustification) {
    this.frBusinessJustification = frBusinessJustification;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Current solution/workaround for a feature request.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return frCurrentSolution
   */
  @VsoMethod
  public String getFrCurrentSolution() {
    return frCurrentSolution;
  }

  /**
   * This is the setter method to the attribute.
   * Current solution/workaround for a feature request.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param frCurrentSolution set the frCurrentSolution.
   */
  @VsoMethod
  public void setFrCurrentSolution(String  frCurrentSolution) {
    this.frCurrentSolution = frCurrentSolution;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Expected date of delivery for a feature request in yyyy-mm-dd format.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return frTiming
   */
  @VsoMethod
  public String getFrTiming() {
    return frTiming;
  }

  /**
   * This is the setter method to the attribute.
   * Expected date of delivery for a feature request in yyyy-mm-dd format.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param frTiming set the frTiming.
   */
  @VsoMethod
  public void setFrTiming(String  frTiming) {
    this.frTiming = frTiming;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Possible use cases for a feature request.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return frUseCases
   */
  @VsoMethod
  public String getFrUseCases() {
    return frUseCases;
  }

  /**
   * This is the setter method to the attribute.
   * Possible use cases for a feature request.
   * Field introduced in 20.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param frUseCases set the frUseCases.
   */
  @VsoMethod
  public void setFrUseCases(String  frUseCases) {
    this.frUseCases = frUseCases;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return id
   */
  @VsoMethod
  public String getId() {
    return id;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param id set the id.
   */
  @VsoMethod
  public void setId(String  id) {
    this.id = id;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lastModifiedDate
   */
  @VsoMethod
  public String getLastModifiedDate() {
    return lastModifiedDate;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lastModifiedDate set the lastModifiedDate.
   */
  @VsoMethod
  public void setLastModifiedDate(String  lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return patchVersion
   */
  @VsoMethod
  public String getPatchVersion() {
    return patchVersion;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param patchVersion set the patchVersion.
   */
  @VsoMethod
  public void setPatchVersion(String  patchVersion) {
    this.patchVersion = patchVersion;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return severity
   */
  @VsoMethod
  public String getSeverity() {
    return severity;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param severity set the severity.
   */
  @VsoMethod
  public void setSeverity(String  severity) {
    this.severity = severity;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subject
   */
  @VsoMethod
  public String getSubject() {
    return subject;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subject set the subject.
   */
  @VsoMethod
  public void setSubject(String  subject) {
    this.subject = subject;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return time
   */
  @VsoMethod
  public String getTime() {
    return time;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param time set the time.
   */
  @VsoMethod
  public void setTime(String  time) {
    this.time = time;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return version
   */
  @VsoMethod
  public String getVersion() {
    return version;
  }

  /**
   * This is the setter method to the attribute.
   * Field introduced in 18.2.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param version set the version.
   */
  @VsoMethod
  public void setVersion(String  version) {
    this.version = version;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ALBServicesCase objALBServicesCase = (ALBServicesCase) o;
  return   Objects.equals(this.assetId, objALBServicesCase.assetId)&&
  Objects.equals(this.id, objALBServicesCase.id)&&
  Objects.equals(this.caseNumber, objALBServicesCase.caseNumber)&&
  Objects.equals(this.caseStatus, objALBServicesCase.caseStatus)&&
  Objects.equals(this.subject, objALBServicesCase.subject)&&
  Objects.equals(this.caseCreatedBy, objALBServicesCase.caseCreatedBy)&&
  Objects.equals(this.createdDate, objALBServicesCase.createdDate)&&
  Objects.equals(this.lastModifiedDate, objALBServicesCase.lastModifiedDate)&&
  Objects.equals(this.status, objALBServicesCase.status)&&
  Objects.equals(this.version, objALBServicesCase.version)&&
  Objects.equals(this.patchVersion, objALBServicesCase.patchVersion)&&
  Objects.equals(this.description, objALBServicesCase.description)&&
  Objects.equals(this.type, objALBServicesCase.type)&&
  Objects.equals(this.environment, objALBServicesCase.environment)&&
  Objects.equals(this.deploymentEnvironment, objALBServicesCase.deploymentEnvironment)&&
  Objects.equals(this.severity, objALBServicesCase.severity)&&
  Objects.equals(this.time, objALBServicesCase.time)&&
  Objects.equals(this.customTag, objALBServicesCase.customTag)&&
  Objects.equals(this.caseAttachments, objALBServicesCase.caseAttachments)&&
  Objects.equals(this.email, objALBServicesCase.email)&&
  Objects.equals(this.contactInfo, objALBServicesCase.contactInfo)&&
  Objects.equals(this.frUseCases, objALBServicesCase.frUseCases)&&
  Objects.equals(this.frCurrentSolution, objALBServicesCase.frCurrentSolution)&&
  Objects.equals(this.frBusinessJustification, objALBServicesCase.frBusinessJustification)&&
  Objects.equals(this.frTiming, objALBServicesCase.frTiming);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ALBServicesCase {\n");
      sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    caseAttachments: ").append(toIndentedString(caseAttachments)).append("\n");
        sb.append("    caseCreatedBy: ").append(toIndentedString(caseCreatedBy)).append("\n");
        sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
        sb.append("    caseStatus: ").append(toIndentedString(caseStatus)).append("\n");
        sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    customTag: ").append(toIndentedString(customTag)).append("\n");
        sb.append("    deploymentEnvironment: ").append(toIndentedString(deploymentEnvironment)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    frBusinessJustification: ").append(toIndentedString(frBusinessJustification)).append("\n");
        sb.append("    frCurrentSolution: ").append(toIndentedString(frCurrentSolution)).append("\n");
        sb.append("    frTiming: ").append(toIndentedString(frTiming)).append("\n");
        sb.append("    frUseCases: ").append(toIndentedString(frUseCases)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
        sb.append("    patchVersion: ").append(toIndentedString(patchVersion)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

