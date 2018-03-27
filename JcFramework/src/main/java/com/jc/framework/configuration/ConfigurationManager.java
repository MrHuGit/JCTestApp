package com.jc.framework.configuration;

import android.content.Context;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/26 15:25
 * @describe
 * @update
 */

public class ConfigurationManager {

    private ConfigurationParser mConfigurationParser;

    private ConfigurationManager(){
    }

    public static ConfigurationManager getInstance(){
        return Holder.sInstance;
    }
    private static class Holder{
        private static ConfigurationManager sInstance=new ConfigurationManager();
    }

    public void parserXml(Context context){
        mConfigurationParser=new ConfigurationParser(context);
        mConfigurationParser.parser();
    }


    public String getValue(String key){
       return mConfigurationParser.getValue(key);
    }

    public String getDescription(String key){
        return mConfigurationParser.getDescription(key);
    }
}
