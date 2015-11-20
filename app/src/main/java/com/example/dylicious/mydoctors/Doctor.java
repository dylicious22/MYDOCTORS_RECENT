package com.example.dylicious.mydoctors;

import com.orm.SugarRecord;

/**
 * Created by dylicious on 10/18/15.
 */
public class Doctor extends SugarRecord<Doctor>
{
    int _id;
    String _docname;
    String _docadd;
    String _docloc;
    String _docspecialty;
    String _docnum;

    public Doctor(){}

    public Doctor(int id, String docname, String docadd, String docloc, String docspecialty, String docnum)
    {
        this._id = id;
        this._docname = docname;
        this._docadd = docadd;
        this._docloc = docloc;
        this._docspecialty = docspecialty;
        this._docnum = docnum;
    }

    public Doctor(String docname, String docadd, String docloc, String docspecialty, String docnum)
    {
        this._docname = docname;
        this._docadd = docadd;
        this._docloc = docloc;
        this._docspecialty = docspecialty;
        this._docnum = docnum;
    }

    public int getID()
    {
        return this._id;
    }

    public void setID(int id)
    {
        this._id = id;
    }

    public String getDocName()
    {
        return this._docname;
    }

    public void setDocName(String docname)
    {
        this._docname = docname;
    }

    public String getDocAdd()
    {
        return this._docadd;
    }

    public void setDocAdd(String docadd)
    {
        this._docadd = docadd;
    }

    public String getDocLoc()
    {
        return this._docloc;
    }

    public void setDocLoc(String docloc)
    {
        this._docloc = docloc;
    }

    public String getDocSpecialty()
    {
        return this._docspecialty;
    }

    public void setDocSpecialty(String docspecialty)
    {
        this._docspecialty = docspecialty;
    }

    public String getDocNum()
    {
        return this._docnum;
    }

    public void setDocNum(String docnum)
    {
        this._docnum = docnum;
    }
}
