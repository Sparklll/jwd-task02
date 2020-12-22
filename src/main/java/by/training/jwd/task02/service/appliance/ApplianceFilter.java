package by.training.jwd.task02.service.appliance;

import by.training.jwd.task02.entity.criteria.Criteria;
import by.training.jwd.task02.entity.db.ApplianceRecord;

import java.util.HashMap;
import java.util.Map;


public class ApplianceFilter {
    private static ApplianceFilter instance;

    private ApplianceFilter() {

    }

    public static ApplianceFilter getInstance() {
        if (instance == null) {
            instance = new ApplianceFilter();
        }
        return instance;
    }

    public boolean isRecordMatchCriteria(ApplianceRecord applianceRecord, Criteria criteria) {
        boolean isMatching = false;
        if (applianceRecord.getApplianceType().toUpperCase()
                .equals(criteria.getGroupSearchName().toUpperCase())) {
            isMatching = true;
            HashMap<String, String> applianceParameters = applianceRecord.getApplianceParameters();

            for (Map.Entry<String, Object> criteriaEntry : criteria.getCriteria().entrySet()) {
                String param = criteriaEntry.getKey();
                String paramValue = criteriaEntry.getValue().toString();

                if (!applianceParameters.containsKey(param)
                        || !applianceParameters.get(param).equals(paramValue)) {
                    isMatching = false;
                }
            }
        }
        return isMatching;
    }
}
