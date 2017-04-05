package com.niuniu.syp.niuniuweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by SYP on 2017/4/5.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;//记录省份的名称
    private int provinceCode;//记录省份的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", provinceName='" + provinceName + '\'' +
                '}';
    }
}
