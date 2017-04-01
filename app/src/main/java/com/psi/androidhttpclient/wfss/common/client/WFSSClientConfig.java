package com.psi.androidhttpclient.wfss.common.client;

import com.psi.androidhttpclient.client.model.RequestParams;

/**
 * CRClient的配置
 */
public class WFSSClientConfig {

    private static volatile WFSSConfigInterface config;

    public static String getBiiUrl(){
        return config.getUrl();
    }

    /**
     * @return 通用参数，包括headers和urlParams
     */
    public static RequestParams getCommonParams(){
//        return config.getCommonParams();
        return null;
    }



    public static void setConfig(WFSSConfigInterface param){
        config = param;
    }
}
