package br.com.sciensa;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Cacheable
public class Cars extends PanacheEntity{

    @Column(length = 40)
    public String marca;
    
    @Column(length = 40)
    public String modelo;

    @Column(length = 40)
    public String ano;

    public Cars(){

    }
    
    public Cars(String marca,String modelo,String ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

}
