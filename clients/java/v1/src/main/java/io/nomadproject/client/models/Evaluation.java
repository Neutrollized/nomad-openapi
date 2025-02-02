/*
 * Copyright (c) HashiCorp, Inc.
 * SPDX-License-Identifier: MPL-2.0
 */

/*
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.nomadproject.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.nomadproject.client.models.AllocationMetric;
import io.nomadproject.client.models.EvaluationStub;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Evaluation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Evaluation {
  public static final String SERIALIZED_NAME_ANNOTATE_PLAN = "AnnotatePlan";
  @SerializedName(SERIALIZED_NAME_ANNOTATE_PLAN)
  private Boolean annotatePlan;

  public static final String SERIALIZED_NAME_BLOCKED_EVAL = "BlockedEval";
  @SerializedName(SERIALIZED_NAME_BLOCKED_EVAL)
  private String blockedEval;

  public static final String SERIALIZED_NAME_CLASS_ELIGIBILITY = "ClassEligibility";
  @SerializedName(SERIALIZED_NAME_CLASS_ELIGIBILITY)
  private Map<String, Boolean> classEligibility = null;

  public static final String SERIALIZED_NAME_CREATE_INDEX = "CreateIndex";
  @SerializedName(SERIALIZED_NAME_CREATE_INDEX)
  private Integer createIndex;

  public static final String SERIALIZED_NAME_CREATE_TIME = "CreateTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime;

  public static final String SERIALIZED_NAME_DEPLOYMENT_I_D = "DeploymentID";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_I_D)
  private String deploymentID;

  public static final String SERIALIZED_NAME_ESCAPED_COMPUTED_CLASS = "EscapedComputedClass";
  @SerializedName(SERIALIZED_NAME_ESCAPED_COMPUTED_CLASS)
  private Boolean escapedComputedClass;

  public static final String SERIALIZED_NAME_FAILED_T_G_ALLOCS = "FailedTGAllocs";
  @SerializedName(SERIALIZED_NAME_FAILED_T_G_ALLOCS)
  private Map<String, AllocationMetric> failedTGAllocs = null;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_JOB_I_D = "JobID";
  @SerializedName(SERIALIZED_NAME_JOB_I_D)
  private String jobID;

  public static final String SERIALIZED_NAME_JOB_MODIFY_INDEX = "JobModifyIndex";
  @SerializedName(SERIALIZED_NAME_JOB_MODIFY_INDEX)
  private Integer jobModifyIndex;

  public static final String SERIALIZED_NAME_MODIFY_INDEX = "ModifyIndex";
  @SerializedName(SERIALIZED_NAME_MODIFY_INDEX)
  private Integer modifyIndex;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "ModifyTime";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private Long modifyTime;

  public static final String SERIALIZED_NAME_NAMESPACE = "Namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NEXT_EVAL = "NextEval";
  @SerializedName(SERIALIZED_NAME_NEXT_EVAL)
  private String nextEval;

  public static final String SERIALIZED_NAME_NODE_I_D = "NodeID";
  @SerializedName(SERIALIZED_NAME_NODE_I_D)
  private String nodeID;

  public static final String SERIALIZED_NAME_NODE_MODIFY_INDEX = "NodeModifyIndex";
  @SerializedName(SERIALIZED_NAME_NODE_MODIFY_INDEX)
  private Integer nodeModifyIndex;

  public static final String SERIALIZED_NAME_PREVIOUS_EVAL = "PreviousEval";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_EVAL)
  private String previousEval;

  public static final String SERIALIZED_NAME_PRIORITY = "Priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_QUEUED_ALLOCATIONS = "QueuedAllocations";
  @SerializedName(SERIALIZED_NAME_QUEUED_ALLOCATIONS)
  private Map<String, Integer> queuedAllocations = null;

  public static final String SERIALIZED_NAME_QUOTA_LIMIT_REACHED = "QuotaLimitReached";
  @SerializedName(SERIALIZED_NAME_QUOTA_LIMIT_REACHED)
  private String quotaLimitReached;

  public static final String SERIALIZED_NAME_RELATED_EVALS = "RelatedEvals";
  @SerializedName(SERIALIZED_NAME_RELATED_EVALS)
  private List<EvaluationStub> relatedEvals = null;

  public static final String SERIALIZED_NAME_SNAPSHOT_INDEX = "SnapshotIndex";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_INDEX)
  private Integer snapshotIndex;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_DESCRIPTION = "StatusDescription";
  @SerializedName(SERIALIZED_NAME_STATUS_DESCRIPTION)
  private String statusDescription;

  public static final String SERIALIZED_NAME_TRIGGERED_BY = "TriggeredBy";
  @SerializedName(SERIALIZED_NAME_TRIGGERED_BY)
  private String triggeredBy;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_WAIT = "Wait";
  @SerializedName(SERIALIZED_NAME_WAIT)
  private Long wait;

  public static final String SERIALIZED_NAME_WAIT_UNTIL = "WaitUntil";
  @SerializedName(SERIALIZED_NAME_WAIT_UNTIL)
  private OffsetDateTime waitUntil;


  public Evaluation annotatePlan(Boolean annotatePlan) {
    
    this.annotatePlan = annotatePlan;
    return this;
  }

   /**
   * Get annotatePlan
   * @return annotatePlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAnnotatePlan() {
    return annotatePlan;
  }


  public void setAnnotatePlan(Boolean annotatePlan) {
    this.annotatePlan = annotatePlan;
  }


  public Evaluation blockedEval(String blockedEval) {
    
    this.blockedEval = blockedEval;
    return this;
  }

   /**
   * Get blockedEval
   * @return blockedEval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBlockedEval() {
    return blockedEval;
  }


  public void setBlockedEval(String blockedEval) {
    this.blockedEval = blockedEval;
  }


  public Evaluation classEligibility(Map<String, Boolean> classEligibility) {
    
    this.classEligibility = classEligibility;
    return this;
  }

  public Evaluation putClassEligibilityItem(String key, Boolean classEligibilityItem) {
    if (this.classEligibility == null) {
      this.classEligibility = new HashMap<String, Boolean>();
    }
    this.classEligibility.put(key, classEligibilityItem);
    return this;
  }

   /**
   * Get classEligibility
   * @return classEligibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Boolean> getClassEligibility() {
    return classEligibility;
  }


  public void setClassEligibility(Map<String, Boolean> classEligibility) {
    this.classEligibility = classEligibility;
  }


  public Evaluation createIndex(Integer createIndex) {
    
    this.createIndex = createIndex;
    return this;
  }

   /**
   * Get createIndex
   * minimum: 0
   * maximum: 384
   * @return createIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreateIndex() {
    return createIndex;
  }


  public void setCreateIndex(Integer createIndex) {
    this.createIndex = createIndex;
  }


  public Evaluation createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public Evaluation deploymentID(String deploymentID) {
    
    this.deploymentID = deploymentID;
    return this;
  }

   /**
   * Get deploymentID
   * @return deploymentID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeploymentID() {
    return deploymentID;
  }


  public void setDeploymentID(String deploymentID) {
    this.deploymentID = deploymentID;
  }


  public Evaluation escapedComputedClass(Boolean escapedComputedClass) {
    
    this.escapedComputedClass = escapedComputedClass;
    return this;
  }

   /**
   * Get escapedComputedClass
   * @return escapedComputedClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEscapedComputedClass() {
    return escapedComputedClass;
  }


  public void setEscapedComputedClass(Boolean escapedComputedClass) {
    this.escapedComputedClass = escapedComputedClass;
  }


  public Evaluation failedTGAllocs(Map<String, AllocationMetric> failedTGAllocs) {
    
    this.failedTGAllocs = failedTGAllocs;
    return this;
  }

  public Evaluation putFailedTGAllocsItem(String key, AllocationMetric failedTGAllocsItem) {
    if (this.failedTGAllocs == null) {
      this.failedTGAllocs = new HashMap<String, AllocationMetric>();
    }
    this.failedTGAllocs.put(key, failedTGAllocsItem);
    return this;
  }

   /**
   * Get failedTGAllocs
   * @return failedTGAllocs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, AllocationMetric> getFailedTGAllocs() {
    return failedTGAllocs;
  }


  public void setFailedTGAllocs(Map<String, AllocationMetric> failedTGAllocs) {
    this.failedTGAllocs = failedTGAllocs;
  }


  public Evaluation ID(String ID) {
    
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getID() {
    return ID;
  }


  public void setID(String ID) {
    this.ID = ID;
  }


  public Evaluation jobID(String jobID) {
    
    this.jobID = jobID;
    return this;
  }

   /**
   * Get jobID
   * @return jobID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobID() {
    return jobID;
  }


  public void setJobID(String jobID) {
    this.jobID = jobID;
  }


  public Evaluation jobModifyIndex(Integer jobModifyIndex) {
    
    this.jobModifyIndex = jobModifyIndex;
    return this;
  }

   /**
   * Get jobModifyIndex
   * minimum: 0
   * maximum: 384
   * @return jobModifyIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getJobModifyIndex() {
    return jobModifyIndex;
  }


  public void setJobModifyIndex(Integer jobModifyIndex) {
    this.jobModifyIndex = jobModifyIndex;
  }


  public Evaluation modifyIndex(Integer modifyIndex) {
    
    this.modifyIndex = modifyIndex;
    return this;
  }

   /**
   * Get modifyIndex
   * minimum: 0
   * maximum: 384
   * @return modifyIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getModifyIndex() {
    return modifyIndex;
  }


  public void setModifyIndex(Integer modifyIndex) {
    this.modifyIndex = modifyIndex;
  }


  public Evaluation modifyTime(Long modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * Get modifyTime
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(Long modifyTime) {
    this.modifyTime = modifyTime;
  }


  public Evaluation namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public Evaluation nextEval(String nextEval) {
    
    this.nextEval = nextEval;
    return this;
  }

   /**
   * Get nextEval
   * @return nextEval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNextEval() {
    return nextEval;
  }


  public void setNextEval(String nextEval) {
    this.nextEval = nextEval;
  }


  public Evaluation nodeID(String nodeID) {
    
    this.nodeID = nodeID;
    return this;
  }

   /**
   * Get nodeID
   * @return nodeID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeID() {
    return nodeID;
  }


  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }


  public Evaluation nodeModifyIndex(Integer nodeModifyIndex) {
    
    this.nodeModifyIndex = nodeModifyIndex;
    return this;
  }

   /**
   * Get nodeModifyIndex
   * minimum: 0
   * maximum: 384
   * @return nodeModifyIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNodeModifyIndex() {
    return nodeModifyIndex;
  }


  public void setNodeModifyIndex(Integer nodeModifyIndex) {
    this.nodeModifyIndex = nodeModifyIndex;
  }


  public Evaluation previousEval(String previousEval) {
    
    this.previousEval = previousEval;
    return this;
  }

   /**
   * Get previousEval
   * @return previousEval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreviousEval() {
    return previousEval;
  }


  public void setPreviousEval(String previousEval) {
    this.previousEval = previousEval;
  }


  public Evaluation priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public Evaluation queuedAllocations(Map<String, Integer> queuedAllocations) {
    
    this.queuedAllocations = queuedAllocations;
    return this;
  }

  public Evaluation putQueuedAllocationsItem(String key, Integer queuedAllocationsItem) {
    if (this.queuedAllocations == null) {
      this.queuedAllocations = new HashMap<String, Integer>();
    }
    this.queuedAllocations.put(key, queuedAllocationsItem);
    return this;
  }

   /**
   * Get queuedAllocations
   * @return queuedAllocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Integer> getQueuedAllocations() {
    return queuedAllocations;
  }


  public void setQueuedAllocations(Map<String, Integer> queuedAllocations) {
    this.queuedAllocations = queuedAllocations;
  }


  public Evaluation quotaLimitReached(String quotaLimitReached) {
    
    this.quotaLimitReached = quotaLimitReached;
    return this;
  }

   /**
   * Get quotaLimitReached
   * @return quotaLimitReached
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuotaLimitReached() {
    return quotaLimitReached;
  }


  public void setQuotaLimitReached(String quotaLimitReached) {
    this.quotaLimitReached = quotaLimitReached;
  }


  public Evaluation relatedEvals(List<EvaluationStub> relatedEvals) {
    
    this.relatedEvals = relatedEvals;
    return this;
  }

  public Evaluation addRelatedEvalsItem(EvaluationStub relatedEvalsItem) {
    if (this.relatedEvals == null) {
      this.relatedEvals = new ArrayList<EvaluationStub>();
    }
    this.relatedEvals.add(relatedEvalsItem);
    return this;
  }

   /**
   * Get relatedEvals
   * @return relatedEvals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EvaluationStub> getRelatedEvals() {
    return relatedEvals;
  }


  public void setRelatedEvals(List<EvaluationStub> relatedEvals) {
    this.relatedEvals = relatedEvals;
  }


  public Evaluation snapshotIndex(Integer snapshotIndex) {
    
    this.snapshotIndex = snapshotIndex;
    return this;
  }

   /**
   * Get snapshotIndex
   * minimum: 0
   * maximum: 384
   * @return snapshotIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSnapshotIndex() {
    return snapshotIndex;
  }


  public void setSnapshotIndex(Integer snapshotIndex) {
    this.snapshotIndex = snapshotIndex;
  }


  public Evaluation status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Evaluation statusDescription(String statusDescription) {
    
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Get statusDescription
   * @return statusDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusDescription() {
    return statusDescription;
  }


  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  public Evaluation triggeredBy(String triggeredBy) {
    
    this.triggeredBy = triggeredBy;
    return this;
  }

   /**
   * Get triggeredBy
   * @return triggeredBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTriggeredBy() {
    return triggeredBy;
  }


  public void setTriggeredBy(String triggeredBy) {
    this.triggeredBy = triggeredBy;
  }


  public Evaluation type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Evaluation wait(Long wait) {
    
    this.wait = wait;
    return this;
  }

   /**
   * Get wait
   * @return wait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getWait() {
    return wait;
  }


  public void setWait(Long wait) {
    this.wait = wait;
  }


  public Evaluation waitUntil(OffsetDateTime waitUntil) {
    
    this.waitUntil = waitUntil;
    return this;
  }

   /**
   * Get waitUntil
   * @return waitUntil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getWaitUntil() {
    return waitUntil;
  }


  public void setWaitUntil(OffsetDateTime waitUntil) {
    this.waitUntil = waitUntil;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evaluation evaluation = (Evaluation) o;
    return Objects.equals(this.annotatePlan, evaluation.annotatePlan) &&
        Objects.equals(this.blockedEval, evaluation.blockedEval) &&
        Objects.equals(this.classEligibility, evaluation.classEligibility) &&
        Objects.equals(this.createIndex, evaluation.createIndex) &&
        Objects.equals(this.createTime, evaluation.createTime) &&
        Objects.equals(this.deploymentID, evaluation.deploymentID) &&
        Objects.equals(this.escapedComputedClass, evaluation.escapedComputedClass) &&
        Objects.equals(this.failedTGAllocs, evaluation.failedTGAllocs) &&
        Objects.equals(this.ID, evaluation.ID) &&
        Objects.equals(this.jobID, evaluation.jobID) &&
        Objects.equals(this.jobModifyIndex, evaluation.jobModifyIndex) &&
        Objects.equals(this.modifyIndex, evaluation.modifyIndex) &&
        Objects.equals(this.modifyTime, evaluation.modifyTime) &&
        Objects.equals(this.namespace, evaluation.namespace) &&
        Objects.equals(this.nextEval, evaluation.nextEval) &&
        Objects.equals(this.nodeID, evaluation.nodeID) &&
        Objects.equals(this.nodeModifyIndex, evaluation.nodeModifyIndex) &&
        Objects.equals(this.previousEval, evaluation.previousEval) &&
        Objects.equals(this.priority, evaluation.priority) &&
        Objects.equals(this.queuedAllocations, evaluation.queuedAllocations) &&
        Objects.equals(this.quotaLimitReached, evaluation.quotaLimitReached) &&
        Objects.equals(this.relatedEvals, evaluation.relatedEvals) &&
        Objects.equals(this.snapshotIndex, evaluation.snapshotIndex) &&
        Objects.equals(this.status, evaluation.status) &&
        Objects.equals(this.statusDescription, evaluation.statusDescription) &&
        Objects.equals(this.triggeredBy, evaluation.triggeredBy) &&
        Objects.equals(this.type, evaluation.type) &&
        Objects.equals(this.wait, evaluation.wait) &&
        Objects.equals(this.waitUntil, evaluation.waitUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotatePlan, blockedEval, classEligibility, createIndex, createTime, deploymentID, escapedComputedClass, failedTGAllocs, ID, jobID, jobModifyIndex, modifyIndex, modifyTime, namespace, nextEval, nodeID, nodeModifyIndex, previousEval, priority, queuedAllocations, quotaLimitReached, relatedEvals, snapshotIndex, status, statusDescription, triggeredBy, type, wait, waitUntil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evaluation {\n");
    sb.append("    annotatePlan: ").append(toIndentedString(annotatePlan)).append("\n");
    sb.append("    blockedEval: ").append(toIndentedString(blockedEval)).append("\n");
    sb.append("    classEligibility: ").append(toIndentedString(classEligibility)).append("\n");
    sb.append("    createIndex: ").append(toIndentedString(createIndex)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deploymentID: ").append(toIndentedString(deploymentID)).append("\n");
    sb.append("    escapedComputedClass: ").append(toIndentedString(escapedComputedClass)).append("\n");
    sb.append("    failedTGAllocs: ").append(toIndentedString(failedTGAllocs)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
    sb.append("    jobModifyIndex: ").append(toIndentedString(jobModifyIndex)).append("\n");
    sb.append("    modifyIndex: ").append(toIndentedString(modifyIndex)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    nextEval: ").append(toIndentedString(nextEval)).append("\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    nodeModifyIndex: ").append(toIndentedString(nodeModifyIndex)).append("\n");
    sb.append("    previousEval: ").append(toIndentedString(previousEval)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    queuedAllocations: ").append(toIndentedString(queuedAllocations)).append("\n");
    sb.append("    quotaLimitReached: ").append(toIndentedString(quotaLimitReached)).append("\n");
    sb.append("    relatedEvals: ").append(toIndentedString(relatedEvals)).append("\n");
    sb.append("    snapshotIndex: ").append(toIndentedString(snapshotIndex)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    triggeredBy: ").append(toIndentedString(triggeredBy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    wait: ").append(toIndentedString(wait)).append("\n");
    sb.append("    waitUntil: ").append(toIndentedString(waitUntil)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

