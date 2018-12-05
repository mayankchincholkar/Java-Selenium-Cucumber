package com.cucumber.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;


public class ReadLocatorJson {
    private static Logger logger = Logger.getLogger(ReadLocatorJson.class.getName());
    private static final String fileLocation = "./resources/locators/locators.json";

    public static String getLocatorValue(String key) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(fileLocation));
        JSONObject jsonObject = (JSONObject) obj;
        String name = (String) jsonObject.get(key);
        logger.info(name);
        return name;
    }
}
