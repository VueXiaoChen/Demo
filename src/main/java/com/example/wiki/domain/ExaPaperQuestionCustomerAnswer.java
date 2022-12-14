package com.example.wiki.domain;

import java.util.Date;

public class ExaPaperQuestionCustomerAnswer {
    private Integer id;

    private Integer questionId;

    private Integer examPaperId;

    private Integer examPaperAnswerId;

    private Integer questionType;

    private Integer subjectId;

    private Integer customerScore;

    private Integer questionScore;

    private Integer questionTextContentId;

    private String answer;

    private Integer textContentId;

    private Boolean doRight;

    private Integer createUser;

    private Date createTime;

    private Integer itemOrder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getExamPaperId() {
        return examPaperId;
    }

    public void setExamPaperId(Integer examPaperId) {
        this.examPaperId = examPaperId;
    }

    public Integer getExamPaperAnswerId() {
        return examPaperAnswerId;
    }

    public void setExamPaperAnswerId(Integer examPaperAnswerId) {
        this.examPaperAnswerId = examPaperAnswerId;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getCustomerScore() {
        return customerScore;
    }

    public void setCustomerScore(Integer customerScore) {
        this.customerScore = customerScore;
    }

    public Integer getQuestionScore() {
        return questionScore;
    }

    public void setQuestionScore(Integer questionScore) {
        this.questionScore = questionScore;
    }

    public Integer getQuestionTextContentId() {
        return questionTextContentId;
    }

    public void setQuestionTextContentId(Integer questionTextContentId) {
        this.questionTextContentId = questionTextContentId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getTextContentId() {
        return textContentId;
    }

    public void setTextContentId(Integer textContentId) {
        this.textContentId = textContentId;
    }

    public Boolean getDoRight() {
        return doRight;
    }

    public void setDoRight(Boolean doRight) {
        this.doRight = doRight;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(Integer itemOrder) {
        this.itemOrder = itemOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", questionId=").append(questionId);
        sb.append(", examPaperId=").append(examPaperId);
        sb.append(", examPaperAnswerId=").append(examPaperAnswerId);
        sb.append(", questionType=").append(questionType);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", customerScore=").append(customerScore);
        sb.append(", questionScore=").append(questionScore);
        sb.append(", questionTextContentId=").append(questionTextContentId);
        sb.append(", answer=").append(answer);
        sb.append(", textContentId=").append(textContentId);
        sb.append(", doRight=").append(doRight);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", itemOrder=").append(itemOrder);
        sb.append("]");
        return sb.toString();
    }
}