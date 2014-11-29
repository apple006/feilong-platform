/*
 * Copyright (C) 2008 feilong (venusdrogon@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.commons.core.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.feilong.commons.core.tools.json.JsonUtil;

/**
 * @author <a href="mailto:venusdrogon@163.com">金鑫</a>
 * @version 1.0 Sep 8, 2012 8:55:30 PM
 */
public class MapUtilTest{

	/** The Constant log. */
	private static final Logger	log	= LoggerFactory.getLogger(MapUtilTest.class);

	/**
	 * TestMapUtilTest.
	 */
	@Test
	public void testMapUtilTest222(){

		Map<String, String> object = new HashMap<String, String>(2);

		object.put("1", "");
		//assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link com.feilong.commons.core.util.MapUtil#getMinValue(java.util.Map, java.lang.String[])}.
	 */
	@Test
	public void testGetMinValue(){

		Map<String, Integer> object = new HashMap<String, Integer>();

		object.put("a", 3007);
		object.put("b", 3001);
		object.put("c", 3002);
		object.put("d", 3003);
		object.put("e", 3004);
		object.put("f", 3005);
		object.put("g", -1005);

		String[] keys = { "a", "b", "d", "g", "m" };
		Integer minValue = MapUtil.getMinValue(object, keys);

		log.info(minValue + "");
	}

	/**
	 * TestMapUtilTest.
	 */
	@Test
	public void testMapUtilTest(){

		Map<String, String> object = new LinkedHashMap<String, String>();

		object.put("1", "1");
		object.put("2", "2");
		object.put("3", "3");
		object.put("3", "4");
		object.put("2", "7");
		object.put("3", "6");
		object.put("4", "8");

		if (log.isDebugEnabled()){
			log.debug(JsonUtil.format(object));
		}

		//assertEquals(expected, actual);
	}
}
