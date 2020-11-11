package com.example.calculator.hours.domain.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="information_service")
public class InformationService {

    public Integer getIdService() {
        return idService;
    }

    public void setIdService(Integer idService) {
        this.idService = idService;
    }

    public Integer getIdTechnical() {
        return idTechnical;
    }

    public void setIdTechnical(Integer idTechnical) {
        this.idTechnical = idTechnical;
    }

    public Timestamp getDateInit() {
        return dateInit;
    }

    public void setDateInit(Timestamp dateInit) {
        this.dateInit = dateInit;
    }

    public Timestamp getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Timestamp dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Integer getTypeServices() {
        return typeServices;
    }

    public void setTypeServices(Integer typeServices) {
        this.typeServices = typeServices;
    }

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
