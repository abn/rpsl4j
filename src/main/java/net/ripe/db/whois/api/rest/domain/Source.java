package net.ripe.db.whois.api.rest.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "grsMirror"
})
@XmlRootElement(name = "source")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Source {

    @XmlElement(name = "grs-mirror")
    protected List<GrsMirror> grsMirror;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(required = true)
    protected String id;

    public Source(final String id) {
        this.id = id;
    }

    public Source() {
    }

    public String getId() {
        return id;
    }

    public Source setId(String value) {
        this.id = value;
        return this;
    }

    public String getName() {
        return name;
    }

    public Source setName(String value) {
        this.name = value;
        return this;
    }
}
