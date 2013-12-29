package com.packt.pfextensions.dataModel;


import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import com.packt.pfextensions.model.Employer;

public class EmployerDataModel extends ListDataModel<Employer> implements SelectableDataModel<Employer> {  

    public EmployerDataModel() {
    }

    public EmployerDataModel(List<Employer> data) {
        super(data);
    }
    
    public Employer getRowData(String rowKey) {
        //In a real app, a more efficient way like a query by rowKey should be implemented to deal with huge data
        
        List<Employer> Employers = (List<Employer>) getWrappedData();
        
        for(Employer Employer : Employers) {
            if(Employer.getOrgname().equals(rowKey))
                return Employer;
        }
        
        return null;
    }

    public Object getRowKey(Employer Employer) {
        return Employer.getOrgname();
    }
}
                    
