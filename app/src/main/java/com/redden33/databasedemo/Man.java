package com.redden33.databasedemo;

import org.litepal.crud.DataSupport;

/**
 * Created by 陈志强 on 2018/3/12.
 */

public class Man extends DataSupport {
    private String name;
    private int length;
    public void setName(String name){
        this.name = name;
    }
    public void setLength(int length){
        this.length = length;
    }
    public String getName(){
        return name;
    }
    public int getLength(){
        return length;
    }
}
