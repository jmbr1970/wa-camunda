package com.sh.autonomos.core.persistence.entity;

import java.io.Serializable;

public abstract class BaseModel<ID extends Serializable> implements Serializable{
	
    private static final long serialVersionUID = 1L;
    
    /**
     * Gets the id
     * 
     * @return the id
     */
    public abstract ID getId();
    

}
