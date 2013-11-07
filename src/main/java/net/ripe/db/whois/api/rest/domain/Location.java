package net.ripe.db.whois.api.rest.domain;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value",
    "link"
})
@XmlRootElement(name = "location")
public class Location {

    @XmlAttribute
    private String value;

    @XmlElement
    private Link link;

    public Location(final String value, final Link link) {
        this.value = value;
        this.link = link;
    }

    public Location() {
        // required no-arg constructor
    }
}
