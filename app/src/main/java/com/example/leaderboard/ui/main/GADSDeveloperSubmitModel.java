package com.example.leaderboard.ui.main;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GADSDeveloperSubmitModel {

    @SerializedName("entry.1877115667")
    @Expose
    private String firstName;
    @SerializedName("entry.2006916086")
    @Expose
    private String lastName;
    @SerializedName("entry.1824927963")
    @Expose
    private String emailAddress;
    @SerializedName("entry.284483984")
    @Expose
    private String gitHubProjectLink;

    /**
     * No args constructor for use in serialization
     *
     */
    public GADSDeveloperSubmitModel() {
    }


    public GADSDeveloperSubmitModel(String firstName, String lastName, String emailAddress, String gitHubProjectLink) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.gitHubProjectLink = gitHubProjectLink;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getGitHubProjectLink() {
        return gitHubProjectLink;
    }

    public void setGitHubProjectLink(String gitHubProjectLink) {
        this.gitHubProjectLink = gitHubProjectLink;
    }

    @Override
    public String toString() {
        return "GADSDeveloperSubmitModel{" +
                "entry.1877115667='" + firstName + '\'' +
                ", entry.2006916086='" + lastName + '\'' +
                ", entry.1824927963='" + emailAddress + '\'' +
                ", entry.284483984='" + gitHubProjectLink + '\'' +
                '}';
    }
}