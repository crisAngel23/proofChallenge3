package co.usa.mintic.ciclo3.ciclo3.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "papeleria")
@Data
public class Papeleria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String name;
    private  Integer price;
    private String description;



}
