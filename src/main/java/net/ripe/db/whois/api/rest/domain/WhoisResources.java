package net.ripe.db.whois.api.rest.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "link",
        "service",
        "parameters",
        "objects",
        "sources",
        "errorMessages",
        "grsSources",
        "geolocationAttributes",
        "versions",
        "termsAndConditions"
})
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@XmlRootElement(name = "whois-resources")
public class WhoisResources {
    public static final String TERMS_AND_CONDITIONS = "http://www.ripe.net/db/support/db-terms-conditions.pdf";

    private Parameters parameters;

    @XmlElement
    private Service service;
    @XmlElement(name = "objects", required = true)
    private WhoisObjects objects;
    @XmlElement(name = "sources")
    private Sources sources;
    @XmlElement(name = "grs-sources")
    private GrsSources grsSources;
    @XmlElement
    private Link link;
    @XmlElement(name = "geolocation-attributes")
    private GeolocationAttributes geolocationAttributes;
    @XmlElement(name = "errormessages")
    private ErrorMessages errorMessages;
    @XmlElement(name = "versions")
    private WhoisVersions versions;
    @XmlElement(name = "terms-and-conditions")
    private Link termsAndConditions;

    public Link getLink() {
        return link;
    }

    public WhoisResources setLink(Link value) {
        this.link = value;
        return this;
    }

    public void setErrorMessages(final List<ErrorMessage> errorMessages) {
        if (errorMessages.size() > 1) {
            Collections.sort(errorMessages);
        }
        this.errorMessages = new ErrorMessages(errorMessages);
    }

    public List<ErrorMessage> getErrorMessages() {
        return errorMessages != null ? errorMessages.getErrorMessages() : Collections.<ErrorMessage>emptyList();
    }

    public Parameters getParameters() {
        return parameters;
    }

    public WhoisResources setParameters(Parameters value) {
        this.parameters = value;
        return this;
    }

    public Service getService() {
        return service;
    }

    public WhoisResources setService(Service value) {
        this.service = value;
        return this;
    }

    public List<Source> getSources() {
        return sources != null ? sources.getSources() : Collections.<Source>emptyList();
    }

    public WhoisResources setSources(List<Source> sources) {
        this.sources = new Sources(sources);
        return this;
    }

    public List<GrsSource> getGrsSources() {
        return grsSources != null ? grsSources.getSources() : Collections.<GrsSource>emptyList();
    }

    public WhoisResources setGrsSources(List<GrsSource> grsSources) {
        this.grsSources = new GrsSources(grsSources);
        return this;
    }

    public List<WhoisObject> getWhoisObjects() {
        return objects != null ? objects.getWhoisObjects() : Collections.<WhoisObject>emptyList();
    }

    public WhoisResources setWhoisObjects(List<WhoisObject> value) {
        this.objects = new WhoisObjects(value);
        return this;
    }

    public WhoisResources setGeolocationAttributes(GeolocationAttributes geolocationAttributes) {
        this.geolocationAttributes = geolocationAttributes;
        return this;
    }

    public WhoisVersions getVersions() {
        return versions;
    }

    public WhoisResources setVersions(WhoisVersions versions) {
        this.versions = versions;
        return this;
    }

    public Link getTermsAndConditions() {
        return termsAndConditions;
    }

    public WhoisResources includeTermsAndConditions() {
        this.termsAndConditions = new Link("locator", TERMS_AND_CONDITIONS);
        return this;
    }
}
