package au.com.jiangren.spaceshuttle.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@DiscriminatorValue("instructor")
//@PrimaryKeyJoinColumn(name = "id")
public class Instructor extends User {
    @ManyToMany
    private Set<Course> courses;
    @Column
    private BigDecimal salary;
    @Column
    private BigDecimal bonus;

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }
}
