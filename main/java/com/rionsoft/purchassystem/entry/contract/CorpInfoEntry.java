package com.rionsoft.purchassystem.entry.contract;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CorpInfoEntry {
    private  long id;
    private String unitId;
    private String unitname;
    private String unitAddr;
    private String linkmanPhone;
    private String linkmanName;
    private String fax;
    private String eMail;
    private String bankAddr;
    private String bankId;
    private Integer num;
    private String zipCode;
    private String corpRecordUser;
}
