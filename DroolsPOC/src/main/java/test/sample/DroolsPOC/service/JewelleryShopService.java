package test.sample.DroolsPOC.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.sample.DroolsPOC.models.Product;

@Service
public class JewelleryShopService {

    private final KieContainer kieContainer;

    @Autowired
    public JewelleryShopService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public Product getProductDiscount(Product product) {
        //get the stateful session
        KieSession kieSession = kieContainer.newKieSession("ksession-rules");
        kieSession.insert(product);
        kieSession.fireAllRules();
        kieSession.dispose();
        return product;
    }
}
