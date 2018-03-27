package com.jc.framework.configuration;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;

import com.jc.framework.utils.ResourcesUtils;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/26 14:09
 * @describe
 * @update
 */

public class ConfigurationParser {
    private final static String CONFIG_NAME = "jc_framework_configuration";
    private final Set<SystemConfigBean> mConfigBeanSets;
    private final Context mContext;

    protected ConfigurationParser(Context context) {
        mContext = context;
        mConfigBeanSets = new HashSet<>();
    }

    protected void parser() {
        XmlResourceParser xmlParser = ResourcesUtils.getXmlParser(this.mContext, CONFIG_NAME);
        mConfigBeanSets.clear();
        try {
            int eventType = xmlParser.getEventType();
            SystemConfigBean bean = null;
            while (eventType != XmlPullParser.END_DOCUMENT) {
                String tagName ;
                switch (eventType) {
                    case XmlPullParser.START_TAG:
                         tagName = xmlParser.getName();
                        if ("item".equals(tagName)) {
                            bean = new SystemConfigBean();
                            bean.setDescription(xmlParser.getAttributeValue(null,"description"));
                            bean.setDescription(xmlParser.getAttributeValue(null,"key"));
                            bean.setDescription(xmlParser.getAttributeValue(null,"value"));
                        }
                        break;

                    case XmlPullParser.END_TAG:
                        tagName = xmlParser.getName();
                        if ("item".equals(tagName)) {
                            mConfigBeanSets.add(bean);
                        }
                        break;
                    default:
                        break;

                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }

    }

    public String getValue(String key){
        if (TextUtils.isEmpty(key)){
            return null;
        }
        for (SystemConfigBean bean:mConfigBeanSets){
            if (key.equals(bean.getKey())){
                return bean.getValue();
            }
        }
        return null;
    }

    public String getDescription(String key){
        if (TextUtils.isEmpty(key)){
            return null;
        }
        for (SystemConfigBean bean:mConfigBeanSets){
            if (key.equals(bean.getKey())){
                return bean.getDescription();
            }
        }
        return null;
    }


}
