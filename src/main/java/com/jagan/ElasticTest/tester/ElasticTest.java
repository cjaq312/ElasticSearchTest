package com.jagan.ElasticTest.tester;

import java.util.HashMap;

import com.jagan.ElasticTest.cluster.ClusterDAOImpl;
import com.jagan.ElasticTest.utils.*;

public class ElasticTest {

	public static void main(String[] args) {

		ClusterDAOImpl dao = ClusterDAOImpl.getInstance();
		HashMap<String, String> fieldValueMap = new HashMap<String, String>();
		fieldValueMap.put("name1", "value1");
		fieldValueMap.put("name2", "value2");
		fieldValueMap.put("name3", "value3");
		boolean result = false;
//		result = dao.putRecord("product", "retaler", "4", ParserUtil.parseToMap(fieldValueMap));
		

	}	

}
