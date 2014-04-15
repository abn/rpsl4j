package net.ripe.db.whois.common.sso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SsoTokenTranslator {

    private final CrowdClient crowdClient;

    @Autowired
    public SsoTokenTranslator(final CrowdClient crowdClient) {
        this.crowdClient = crowdClient;
    }

    public UserSession translateSsoToken(final String ssoToken) throws CrowdClientException {
        final UserSession userSession = crowdClient.getUserSession(ssoToken);
        userSession.setUuid(crowdClient.getUuid(userSession.getUsername()));
        return userSession;
    }
}
