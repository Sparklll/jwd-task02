package by.training.jwd.task02.dao;

import by.training.jwd.task02.entity.appliance.Appliance;
import by.training.jwd.task02.entity.criteria.Criteria;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria) throws IOException;
}
