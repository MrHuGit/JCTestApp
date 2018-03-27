package com.jc.framework.utils;

import android.content.Context;
import android.content.res.XmlResourceParser;

import com.jc.framework.exception.StopInstantiatedException;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/26 14:16
 * @describe
 * @update
 */

public class ResourcesUtils {
    private ResourcesUtils(){
        throw new StopInstantiatedException();
    }

    public static int getResourceId(Context context, String type, String name){
       return context.getResources().getIdentifier(name,type,PackageUtils.getPackName(context));
    }

    public static XmlResourceParser getXmlParser(Context context,String name){
        int resourceId=getResourceId(context,"xml",name);
       return context.getResources().getXml(resourceId);
    }
}
