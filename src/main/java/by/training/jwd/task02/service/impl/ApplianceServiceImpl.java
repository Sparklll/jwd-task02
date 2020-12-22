package by.training.jwd.task02.service.impl;

import by.training.jwd.task02.dao.ApplianceDAO;
import by.training.jwd.task02.dao.DAOFactory;
import by.training.jwd.task02.entity.appliance.Appliance;
import by.training.jwd.task02.entity.criteria.Criteria;
import by.training.jwd.task02.service.ApplianceService;
import by.training.jwd.task02.service.validation.Validator;

import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		List<Appliance> appliance = applianceDAO.find(criteria);

		return appliance;
	}
}

