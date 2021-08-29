package com.chenyu.springcloud.entities;

import java.io.Serializable;

/**
 * ClassName:Payment
 * Package:com.chenyu.springcloud.entities
 * Description:
 *
 * @Date:2020/12/20 22:55
 * @Author:gaochenyu2012@126.com
 */
public class Payment implements Serializable {
    private Long id;
    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public Payment(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                '}';
    }
}
