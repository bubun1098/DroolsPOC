package test.sample.backwardChain.drools.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.sample.backwardChain.drools.models.Location;
import test.sample.backwardChain.drools.models.ResponseMessage;

import java.util.List;

@Service

public class LocationService {
    private final KieContainer kieContainer;

   @Autowired
    public LocationService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public ResponseMessage getLocationService(List loc) {
        //get the stateful session
        KieSession kieSession = kieContainer.newKieSession("ksession-rules");
        for (int index=0; index< loc.size(); index++ ) {
            kieSession.insert(loc.get(index));
        }
        kieSession.fireAllRules();
        kieSession.dispose();

        return new ResponseMessage("200","Operation Successful");
    }
}
