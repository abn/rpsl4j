package net.ripe.db.whois.api.rest.domain;

import com.google.common.collect.Lists;

import javax.annotation.concurrent.Immutable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Immutable
@XmlRootElement(name = "flags")
@XmlAccessorType(XmlAccessType.FIELD)
public class Flags {

    @XmlElement(name = "flag")
    protected List<Flag> flags;

    public Flags(final Collection<String> flags) {
        this.flags = Lists.newArrayList();
        for (String flag : flags) {
            this.flags.add(new Flag(flag));
        }
    }

    public Flags() {
        // required no-arg constructor
    }

    public List<Flag> getFlags() {
        return Collections.unmodifiableList(flags);
    }
}
