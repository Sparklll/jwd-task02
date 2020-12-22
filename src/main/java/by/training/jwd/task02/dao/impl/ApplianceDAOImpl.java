package by.training.jwd.task02.dao.impl;

import by.training.jwd.task02.dao.ApplianceDAO;
import by.training.jwd.task02.entity.appliance.Appliance;
import by.training.jwd.task02.entity.criteria.Criteria;
import by.training.jwd.task02.entity.db.ApplianceRecord;
import by.training.jwd.task02.service.appliance.ApplianceFilter;
import by.training.jwd.task02.service.appliance.ApplianceReader;

import java.io.*;
import java.net.URL;
import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO {
	private final String DB_NAME = "appliances_db.txt";
	URL resource = ApplianceDAOImpl.class.getClassLoader().getResource(DB_NAME);
	File dbFile = new File(resource.getFile());


	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {
		try(BufferedReader databaseReader = new BufferedReader(new FileReader(dbFile))){

			ApplianceReader applianceReader = new ApplianceReader(databaseReader);
			ApplianceFilter applianceFilter = ApplianceFilter.getInstance();
			List<Appliance> findedAppliances = new ArrayList<>();


			while(applianceReader.hasNext()) {
				ApplianceRecord applianceRecord = applianceReader.next();
				boolean isRecordMatchCriteria = applianceFilter.isRecordMatchCriteria(applianceRecord, criteria);
				if(isRecordMatchCriteria) {
					Appliance appliance = applianceRecord.getAppliance();
					findedAppliances.add(appliance);
				}
			}

			return findedAppliances;
		}
	}
}