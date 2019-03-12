package com.gupao.study.pattern.prototype;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author chenghu
 * @Descripion TODO
 * @Date
 * @Version 1.0
 **/
public class Order implements Serializable {

    /** 金额 */
    private BigDecimal amount;

    /** 订单状态 */
    private String orderState;

    /** 创建人 */
    private Person createPerson;

    /** 创建时间 */
    private Date createTime;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Person getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(Person createPerson) {
        this.createPerson = createPerson;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 浅拷贝
     * @param order
     * @return
     */
    public static Order shallowClone(Order order){
        Order result = new Order();
        result.setAmount(order.getAmount());
        result.setCreatePerson(order.getCreatePerson());
        result.setOrderState(order.getOrderState());
        result.setCreateTime(order.getCreateTime());
        return result;
    }

    /**
     * 深拷贝
     * @param order
     * @return
     */
    public static Order deepClone(Order order){
        Order result = null;
        try{
            FileOutputStream fos = new FileOutputStream("desDeepOrder");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(order);
            oos.flush();
            oos.close();
            fos.flush();
            fos.close();

            FileInputStream fis = new FileInputStream("desDeepOrder");
            ObjectInputStream ois = new ObjectInputStream(fis);
            result = (Order) ois.readObject();
            ois.close();
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
