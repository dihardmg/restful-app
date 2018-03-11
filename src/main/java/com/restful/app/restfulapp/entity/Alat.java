package com.restfulapp.restfulapp.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author : Otorus
 * @since : 3/10/18
 */

@Entity
@Data
@Table(name = "ALAT")
public class Alat {

    @Id
    @Column(name = "ID_ALAT")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "HARGA", nullable = false)
    private Double harga;

    @Column(name = "NAMA", nullable = false, unique = true)
    private String nama;

}
