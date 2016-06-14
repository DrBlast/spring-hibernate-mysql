package org.krams.tutorial.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by DrBlast on 14.06.2016.
 */
@Entity
@Table(name = "Payments")
public class Payments implements Serializable {


    private static final long serialVersionUID = -5527566248002296012L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "house_id")
    private Houses house_payment;


    @Column(name = "payment_date")
    private Date payment_date;

    @Column(name = "amount", nullable = false, precision = 10, scale = 2, columnDefinition = "float default 0.0")
    private Float amount;

    @Column(name = "dept", nullable = false, precision = 10, scale = 2, columnDefinition = "float default 0.0")
    private Float dept;

    @Column(name = "fine", nullable = false, precision = 10, scale = 2, columnDefinition = "float default 0.0")
    private Float fine;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((house_payment == null) ? 0 : house_payment.hashCode());
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        result = prime * result + ((dept == null) ? 0 : dept.hashCode());
        result = prime * result + ((fine == null) ? 0 : fine.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payments that = (Payments) o;
        if (id.equals(that.id)) return false;
        if (house_payment.equals(that.house_payment)) return false;
        if (amount.equals(that.amount)) return false;
        if (dept.equals(that.dept)) return false;
        return !fine.equals(that.fine);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public void setDept(Float dept) {
        this.dept = dept;
    }

    public void setFine(Float fine) {
        this.fine = fine;
    }



    public Float getAmount() {
        return amount;
    }

    public Float getDept() {
        return dept;
    }

    public Float getFine() {
        return fine;
    }

    public Houses getHouse_payment() {
        return house_payment;
    }

    public void setHouse_payment(Houses house) {
        this.house_payment = house;
    }
}
