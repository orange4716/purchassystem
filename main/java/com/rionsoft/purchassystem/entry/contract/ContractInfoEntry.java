package com.rionsoft.purchassystem.entry.contract;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ContractInfoEntry {
    private long id;
    private String contractName;
    private String signDate;
    private String unitId;
    private String unitName;
    private BigDecimal contractValue;
    private char isPrePay;
    private BigDecimal firstPercent;
    private BigDecimal secondPercent;
    private BigDecimal thirdPercent;
    private String payEndtime;
    private String userName;
    private String logiName;
}
