package com.tothenew.jpaAssignment2.entities.singleTable;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name = "vtype",discriminatorType = DiscriminatorType.STRING)
public abstract class MahindraSingle {
    @Id
    private  Integer id;
    private  Integer amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
