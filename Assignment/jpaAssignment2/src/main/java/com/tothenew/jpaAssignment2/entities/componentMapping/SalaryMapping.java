package com.tothenew.jpaAssignment2.entities.componentMapping;

import javax.persistence.Embeddable;

@Embeddable
public class SalaryMapping {
    private Integer basicsalary;
    private Integer bonussalary;
    private Integer taxamount;
    private Integer specialallowancesalary;

    public Integer getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(Integer basicsalary) {
        this.basicsalary = basicsalary;
    }

    public Integer getBonussalary() {
        return bonussalary;
    }

    public void setBonussalary(Integer bonussalary) {
        this.bonussalary = bonussalary;
    }

    public Integer getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(Integer taxamount) {
        this.taxamount = taxamount;
    }

    public Integer getSpecialallowancesalary() {
        return specialallowancesalary;
    }

    public void setSpecialallowancesalary(Integer specialallowancesalary) {
        this.specialallowancesalary = specialallowancesalary;
    }
}
