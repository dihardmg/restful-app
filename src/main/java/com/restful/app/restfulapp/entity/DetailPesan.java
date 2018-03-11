package com.restfulapp.restfulapp.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author : Otorus
 * @since : 3/10/18
 */

@Entity
@Data
@Table(name = "DETAIL_PESAN")
public class DetailPesan {
    @Id
    @Column(name = "ID_DETAIL_PESAN")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ID_ALAT", nullable = false)
    private Alat alat;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ID_PESAN", nullable = false)
    private Pesan pesan;

    @NotNull
    @Min(0)
    @Column(name = "JUMLAH", nullable = false)
    private int jumlah;

    @Column(name = "DISKON", nullable = false)
    private Double diskon;


}
