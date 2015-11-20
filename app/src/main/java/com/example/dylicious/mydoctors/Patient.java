package com.example.dylicious.mydoctors;

import com.orm.SugarRecord;

/**
 * Created by dylicious on 10/21/15.
 */
public class Patient extends SugarRecord<Patient>
{
    String _patname;
    String _patmed;
    String _pattreat;
    String _patallergy;
    //String _patweight;
    //String _patheight;

    public Patient(){}

    public Patient(String patname, String patmed, String pattreat, String patallergy)
    {
        this._patname = patname;
        this._patmed = patmed;
        this._pattreat = pattreat;
        this._patallergy = patallergy;
    }

    public String getPatName ()
    {
        return this._patname;
    }

    public void setPatName(String patname)
    {
        this._patname = patname;
    }

    public String getPatMed()
    {
        return this._patmed;
    }

    public void setPatMed(String patmed)
    {
        this._patmed = patmed;
    }

    public String getPatTreat()
    {
        return this._pattreat;
    }

    public void setPatTreat(String pattreat)
    {
        this._patmed = pattreat;
    }

    public String getPatAllergy()
    {
        return this._patallergy;
    }

    public void setPatAllergy(String patallergy)
    {
        this._patallergy = patallergy;
    }
}
