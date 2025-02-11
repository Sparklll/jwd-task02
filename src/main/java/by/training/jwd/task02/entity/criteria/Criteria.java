package by.training.jwd.task02.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {
	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	public Map<String, Object> getCriteria() {
		return criteria;
	}

	public void setCriteria(Map<String, Object> criteria) {
		this.criteria = criteria;
	}




	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
}
