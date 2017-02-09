package com.jagan.ElasticTest.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ParserUtil {
	private static Map<String, Object> result = new HashMap<String, Object>();

	private ParserUtil() {
	}

	public static Map<String, Object> parseToMap(HashMap<String, String> fieldValueMap) {
		if (fieldValueMap == null)
			return null;
		result.clear();
		for (Entry<String, String> i : fieldValueMap.entrySet())
			result.put(i.getKey(), i.getValue());
		return result;
	}

}
