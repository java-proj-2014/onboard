/*******************************************************************************
 * Copyright [2015] [Onboard team of SERC, Peking University]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.onboard.domain.mapper.model;

import com.onboard.domain.mapper.model.common.BaseItem;

public class CompanyApplicationObject implements BaseItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_application.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_application.teamName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String teamName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_application.contactEmail
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String contactEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_application.contactName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String contactName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_application.description
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_application.teamSize
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String teamSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_application.codeHost
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String codeHost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_application.code
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String code;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_application.id
     *
     * @return the value of company_application.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_application.id
     *
     * @param id the value for company_application.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_application.teamName
     *
     * @return the value of company_application.teamName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_application.teamName
     *
     * @param teamName the value for company_application.teamName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_application.contactEmail
     *
     * @return the value of company_application.contactEmail
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_application.contactEmail
     *
     * @param contactEmail the value for company_application.contactEmail
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_application.contactName
     *
     * @return the value of company_application.contactName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_application.contactName
     *
     * @param contactName the value for company_application.contactName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_application.description
     *
     * @return the value of company_application.description
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_application.description
     *
     * @param description the value for company_application.description
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_application.teamSize
     *
     * @return the value of company_application.teamSize
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getTeamSize() {
        return teamSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_application.teamSize
     *
     * @param teamSize the value for company_application.teamSize
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setTeamSize(String teamSize) {
        this.teamSize = teamSize == null ? null : teamSize.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_application.codeHost
     *
     * @return the value of company_application.codeHost
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getCodeHost() {
        return codeHost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_application.codeHost
     *
     * @param codeHost the value for company_application.codeHost
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCodeHost(String codeHost) {
        this.codeHost = codeHost == null ? null : codeHost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_application.code
     *
     * @return the value of company_application.code
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_application.code
     *
     * @param code the value for company_application.code
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_application
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public CompanyApplicationObject(CompanyApplicationObject parent) {
        this.id = parent.getId();
        this.teamName = parent.getTeamName();
        this.contactEmail = parent.getContactEmail();
        this.contactName = parent.getContactName();
        this.description = parent.getDescription();
        this.teamSize = parent.getTeamSize();
        this.codeHost = parent.getCodeHost();
        this.code = parent.getCode();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_application
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public CompanyApplicationObject() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_application
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public CompanyApplicationObject(int id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_application
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    @Override
    public CompanyApplicationObject copy() {
        return new CompanyApplicationObject(this);
    }
}