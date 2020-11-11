package com.example.calculator.hours.domain.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="information_service")
public class InformationService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_service")
    private Integer idService;

    @Column(name="id_technical")
    private Integer idTechnical;

    @Column(name="date_init")
    private Timestamp dateInit;

    @Column(name="date_end")
    private Timestamp dateEnd;

    @Column(name="type_services")
    private Integer typeServices;

}
