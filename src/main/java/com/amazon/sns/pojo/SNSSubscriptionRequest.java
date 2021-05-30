package com.amazon.sns.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SNSSubscriptionRequest {
    private String subscribeURL;
    private String signatureVersion;
    private String type;
    private String topicArn;
    private String message;
    private String signature;
    private String token;
    private String timestamp;
    private String signingCertURL;
    private String messageId;

    public String getSubscribeURL() {
        return subscribeURL;
    }

    public void setSubscribeURL(String subscribeURL) {
        this.subscribeURL = subscribeURL;
    }

    public String getSignatureVersion() {
        return signatureVersion;
    }

    public void setSignatureVersion(String signatureVersion) {
        this.signatureVersion = signatureVersion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTopicArn() {
        return topicArn;
    }

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSigningCertURL() {
        return signingCertURL;
    }

    public void setSigningCertURL(String signingCertURL) {
        this.signingCertURL = signingCertURL;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
}
