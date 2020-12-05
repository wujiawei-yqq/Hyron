package com.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="lianjia")
public class lianjiaDao {
    @Id
    private String id;
    @Column(name ="area_name")
    private String areaname;
    @Column(name ="url_char")
    private String urlchar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getUrlchar() {
        return urlchar;
    }

    public void setUrlchar(String urlchar) {
        this.urlchar = urlchar;
    }
}
