package by.training.jwd.task02.main;

import by.training.jwd.task02.entity.appliance.Appliance;
import by.training.jwd.task02.entity.criteria.Criteria;
import by.training.jwd.task02.service.ApplianceService;
import by.training.jwd.task02.service.ServiceFactory;
import by.training.jwd.task02.entity.criteria.SearchCriteria;

import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        List<Appliance> appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();


        Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
        criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 3);
        appliance = service.find(criteriaOven);


        criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
        criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 200);
        criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);

        appliance = service.find(criteriaOven);


        Criteria criteriaTabletPC = new Criteria(SearchCriteria.Tablet_PC.class.getSimpleName());
        criteriaTabletPC.add(SearchCriteria.Tablet_PC.COLOR.toString(), "BLUE");
        criteriaTabletPC.add(SearchCriteria.Tablet_PC.DISPLAY_INCHES.toString(), 14);

        appliance = service.find(criteriaTabletPC);
    }
}
