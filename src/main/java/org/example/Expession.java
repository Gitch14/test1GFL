package org.example;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class Expession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "expr", nullable = false, length = 200)
    private String expr;

    @Column(name = "result", nullable = false)
    private Double result;

    public Expession(String expr, Double result) {
        this.expr = expr;
        this.result = result;
    }

    public Expession() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

}