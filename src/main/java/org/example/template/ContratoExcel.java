package org.example.template;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ContratoExcel {

    private String contrato;
    private String licitacao;
    private String data;

    public void setContrato(String contrato){
        this.contrato = contrato;
    }

    public void setLicitacao(String licitacao){
        this.licitacao = licitacao;
    }

    public void setData(String data){
        this.data = data;
    }

    @XmlElement
    public String getContrato(){
        return contrato;
    }

    @XmlElement
    public String getLicitacao(){
        return licitacao;
    }

    @XmlElement
    public String getData(){
        return data;
    }

}
