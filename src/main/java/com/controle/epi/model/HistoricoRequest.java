package com.controle.epi.model;

import java.util.Date;
import java.util.List;

public class HistoricoRequest {
    private String status;
    private Date data;
    private Long funcionarioId;
    private Long setorId;
    private List<Long> epis;

    public void setEpis(List<Long> epis) {
        this.epis = epis;
    }

    public List<Long> getEpis() {
        return epis;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setFuncionarioId(Long funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public void setSetorId(Long setorId) {
        this.setorId = setorId;
    }

    public String getStatus() {
        return status;
    }

    public Date getData() {
        return data;
    }

    public Long getFuncionarioId() {
        return funcionarioId;
    }

    public Long getSetorId() {
        return setorId;
    }

}
