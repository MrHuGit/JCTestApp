package com.android.jc.network;

import java.util.List;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/26 17:39
 * @describe
 * @update
 */

public class InfoBean {
    /**
     * error_no : 0
     * results : [{"summary":"銆愭渤鍖楀粖鍧婏細VOCs鎺掓斁涓嶈揪鏍囦紒涓氬皢鍦�5鑷�10鏈堣惤瀹為敊宄扮敓浜с\u20ac戣繎鏃ヤ粠寤婂潑甯傚ぇ姘斿姙鑾锋倝锛岀洰鍓嶅粖鍧婂競姝ｅ湪鎸夌収鍥藉鍜屾渤鍖楃渷缁熶竴閮ㄧ讲锛屽甯傚煙鍐呮秹VOCs鎺掓斁浼佷笟杈炬爣姹℃煋娌荤悊杈炬爣鎯呭喌杩涜閫愪竴娣卞害鎺掓煡銆傚鏈寜娣卞害娌荤悊瑕佹眰瀹屾垚楂樻晥娌荤悊鐨勪紒涓氬疄鏂藉绉嬪閿欏嘲鐢熶骇绠℃帶鎺柦锛屼簬2018骞�5鏈�-10鏈堝疄鏂介敊宄扮敓浜э紝鍦ㄦ槗褰㈡垚鑷哀涓洪瑕佹薄鏌撶墿鐨勯珮娓╂椂娈典笂鍗�10锛�00-16锛�00閿欏嘲鍋滀骇銆�","total_page":"55763","is_picture":"","picture_url":"","updatetime":"2018-03-26 17:37:56","infopubldate":"2018-03-26 17:37:56","stock_code":"","object_code":"","current_page":"1","type_code":"","id":"6070356193_5","author":"","category":"","title":"","total_rows":"3","is_hot":"","stock_name":"","writer":"","media":"浼樺搧璐㈠瘜"},{"summary":"銆愬姴鍢夎偂浠斤細宸茬疮璁\u2033洖璐叕鍙歌偂浠�658涓囪偂銆戝姴鍢夎偂浠�3鏈�26鏃ユ櫄闂村叕鍛婏紝鎴嚦3鏈�26鏃ワ紝鍏徃绱鍥炶喘鑲\u2032唤658涓囪偂锛屽崰鍏徃鐩墠鎬昏偂鏈殑0.4402%銆�","total_page":"55763","is_picture":"","picture_url":"","updatetime":"2018-03-26 17:36:32","infopubldate":"2018-03-26 17:36:32","stock_code":"","object_code":"","current_page":"1","type_code":"","id":"6070356191_5","author":"","category":"","title":"","total_rows":"3","is_hot":"","stock_name":"","writer":"","media":"浼樺搧璐㈠瘜"},{"summary":"銆愭嫇閭﹁偂浠斤細2017骞村疄鐜板噣鍒╂鼎鍚屾瘮澧為暱45.55%&nbsp; &nbsp;鎷�10杞�5娲�1鍏冦\u20ac戞嫇閭﹁偂浠藉彂甯�2017骞村勾鎶ワ細瀹炵幇鍑\u20ac鍒╂鼎2.1浜垮厓锛屽悓姣斿闀�45.55%锛涙嫙10杞�5娲�1鍏冦\u20ac�","total_page":"55763","is_picture":"","picture_url":"","updatetime":"2018-03-26 17:36:32","infopubldate":"2018-03-26 17:36:32","stock_code":"","object_code":"","current_page":"1","type_code":"","id":"6070356190_5","author":"","category":"","title":"","total_rows":"3","is_hot":"","stock_name":"","writer":"","media":"浼樺搧璐㈠瘜"}]
     * dsName : ["results"]
     * error_info :
     */

    private String error_no;
    private String error_info;
    private List<ResultsBean> results;
    private List<String> dsName;

    public String getError_no() {
        return error_no;
    }

    public void setError_no(String error_no) {
        this.error_no = error_no;
    }

    public String getError_info() {
        return error_info;
    }

    public void setError_info(String error_info) {
        this.error_info = error_info;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public List<String> getDsName() {
        return dsName;
    }

    public void setDsName(List<String> dsName) {
        this.dsName = dsName;
    }

    public static class ResultsBean {
        /**
         * summary : 銆愭渤鍖楀粖鍧婏細VOCs鎺掓斁涓嶈揪鏍囦紒涓氬皢鍦�5鑷�10鏈堣惤瀹為敊宄扮敓浜с€戣繎鏃ヤ粠寤婂潑甯傚ぇ姘斿姙鑾锋倝锛岀洰鍓嶅粖鍧婂競姝ｅ湪鎸夌収鍥藉鍜屾渤鍖楃渷缁熶竴閮ㄧ讲锛屽甯傚煙鍐呮秹VOCs鎺掓斁浼佷笟杈炬爣姹℃煋娌荤悊杈炬爣鎯呭喌杩涜閫愪竴娣卞害鎺掓煡銆傚鏈寜娣卞害娌荤悊瑕佹眰瀹屾垚楂樻晥娌荤悊鐨勪紒涓氬疄鏂藉绉嬪閿欏嘲鐢熶骇绠℃帶鎺柦锛屼簬2018骞�5鏈�-10鏈堝疄鏂介敊宄扮敓浜э紝鍦ㄦ槗褰㈡垚鑷哀涓洪瑕佹薄鏌撶墿鐨勯珮娓╂椂娈典笂鍗�10锛�00-16锛�00閿欏嘲鍋滀骇銆�
         * total_page : 55763
         * is_picture :
         * picture_url :
         * updatetime : 2018-03-26 17:37:56
         * infopubldate : 2018-03-26 17:37:56
         * stock_code :
         * object_code :
         * current_page : 1
         * type_code :
         * id : 6070356193_5
         * author :
         * category :
         * title :
         * total_rows : 3
         * is_hot :
         * stock_name :
         * writer :
         * media : 浼樺搧璐㈠瘜
         */

        private String summary;
        private String total_page;
        private String is_picture;
        private String picture_url;
        private String updatetime;
        private String infopubldate;
        private String stock_code;
        private String object_code;
        private String current_page;
        private String type_code;
        private String id;
        private String author;
        private String category;
        private String title;
        private String total_rows;
        private String is_hot;
        private String stock_name;
        private String writer;
        private String media;

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getTotal_page() {
            return total_page;
        }

        public void setTotal_page(String total_page) {
            this.total_page = total_page;
        }

        public String getIs_picture() {
            return is_picture;
        }

        public void setIs_picture(String is_picture) {
            this.is_picture = is_picture;
        }

        public String getPicture_url() {
            return picture_url;
        }

        public void setPicture_url(String picture_url) {
            this.picture_url = picture_url;
        }

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
        }

        public String getInfopubldate() {
            return infopubldate;
        }

        public void setInfopubldate(String infopubldate) {
            this.infopubldate = infopubldate;
        }

        public String getStock_code() {
            return stock_code;
        }

        public void setStock_code(String stock_code) {
            this.stock_code = stock_code;
        }

        public String getObject_code() {
            return object_code;
        }

        public void setObject_code(String object_code) {
            this.object_code = object_code;
        }

        public String getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(String current_page) {
            this.current_page = current_page;
        }

        public String getType_code() {
            return type_code;
        }

        public void setType_code(String type_code) {
            this.type_code = type_code;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTotal_rows() {
            return total_rows;
        }

        public void setTotal_rows(String total_rows) {
            this.total_rows = total_rows;
        }

        public String getIs_hot() {
            return is_hot;
        }

        public void setIs_hot(String is_hot) {
            this.is_hot = is_hot;
        }

        public String getStock_name() {
            return stock_name;
        }

        public void setStock_name(String stock_name) {
            this.stock_name = stock_name;
        }

        public String getWriter() {
            return writer;
        }

        public void setWriter(String writer) {
            this.writer = writer;
        }

        public String getMedia() {
            return media;
        }

        public void setMedia(String media) {
            this.media = media;
        }
    }
    /*http://118.31.130.42:9901/servlet/json?curpage=1&catalogid=4&rowofpage=3&funcNo=200002*/


}
