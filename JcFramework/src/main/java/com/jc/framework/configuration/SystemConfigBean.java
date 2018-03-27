package com.jc.framework.configuration;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/26 13:52
 * @describe
 * @update
 */

public class SystemConfigBean {
    private String key;
    private String value;
    private String description;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SystemConfigBean bean = (SystemConfigBean) o;

        if (!key.equals(bean.key)) {
            return false;
        }
        return value.equals(bean.value) && description.equals(bean.description);
    }

    @Override
    public int hashCode() {
        int result = key.hashCode();
        result = 31 * result + value.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }
}
