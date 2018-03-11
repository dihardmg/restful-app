package com.restfulapp.restfulapp.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author : Otorus
 * @since : 3/10/18
 */
@Entity
@Data
public class Pesan {

    @Id
    @Column(name = "ID_PESAN")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotNull
    @DateTimeFormat(pattern="dd-mm-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "TGL_PESAN", nullable = false)
    private Date tglPesan;

    @Column(name = "CATATAN", nullable = false)
    private String catatan;

    @NotNull
    @DateTimeFormat(pattern="dd-mm-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "TGL_DATANG", nullable = false)
    private Date tglDatang;

    @Column(name = "TOTAL", nullable = false)
    private Double total;

}
