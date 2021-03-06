/**
 * @copyright Copyright (C) DocuSign, Inc.  All rights reserved.
 *
 * This source code is intended only as a supplement to DocuSign SDK
 * and/or on-line documentation.
 * 
 * This sample is designed to demonstrate DocuSign features and is not intended
 * for production use. Code and policy for a production application must be
 * developed to meet the specific data and security requirements of the
 * application.
 *
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE.
 */
 
package com.docusign.esignature.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "width",
    "tabLabel",
    "value",
    "name",
    "pageNumber",
    "documentId",
    "yPosition",
    "xPosition"
})
public class CompanyTab {

    @JsonProperty("width")
    private String width;
    @JsonProperty("tabLabel")
    private String tabLabel;
    @JsonProperty("value")
    private String value;
    @JsonProperty("name")
    private String name;
    @JsonProperty("pageNumber")
    private String pageNumber;
    @JsonProperty("documentId")
    private String documentId;
    @JsonProperty("yPosition")
    private String yPosition;
    @JsonProperty("xPosition")
    private String xPosition;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("width")
    public String getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(String width) {
        this.width = width;
    }

    public CompanyTab withWidth(String width) {
        this.width = width;
        return this;
    }

    @JsonProperty("tabLabel")
    public String getTabLabel() {
        return tabLabel;
    }

    @JsonProperty("tabLabel")
    public void setTabLabel(String tabLabel) {
        this.tabLabel = tabLabel;
    }

    public CompanyTab withTabLabel(String tabLabel) {
        this.tabLabel = tabLabel;
        return this;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public CompanyTab withValue(String value) {
        this.value = value;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CompanyTab withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("pageNumber")
    public String getPageNumber() {
        return pageNumber;
    }

    @JsonProperty("pageNumber")
    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    public CompanyTab withPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    @JsonProperty("documentId")
    public String getDocumentId() {
        return documentId;
    }

    @JsonProperty("documentId")
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public CompanyTab withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    @JsonProperty("yPosition")
    public String getYPosition() {
        return yPosition;
    }

    @JsonProperty("yPosition")
    public void setYPosition(String yPosition) {
        this.yPosition = yPosition;
    }

    public CompanyTab withYPosition(String yPosition) {
        this.yPosition = yPosition;
        return this;
    }

    @JsonProperty("xPosition")
    public String getXPosition() {
        return xPosition;
    }

    @JsonProperty("xPosition")
    public void setXPosition(String xPosition) {
        this.xPosition = xPosition;
    }

    public CompanyTab withXPosition(String xPosition) {
        this.xPosition = xPosition;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
