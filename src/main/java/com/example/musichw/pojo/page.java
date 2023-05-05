package com.example.musichw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class page {

    String queryInfo;
    Integer pagenum;
    Integer pagesize;

    public String getQueryInfo() {
        return queryInfo;
    }

    public void setQueryInfo(String queryInfo) {
        this.queryInfo = queryInfo;
    }

    public Integer getPagenum() {
        return pagenum;
    }

    public void setPagenum(Integer pagenum) {
        this.pagenum = pagenum;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "page{" +
                "queryInfo='" + queryInfo + '\'' +
                ", pagenum=" + pagenum +
                ", pagesize=" + pagesize +
                '}';
    }
}
