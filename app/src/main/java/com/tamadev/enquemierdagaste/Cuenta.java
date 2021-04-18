package com.tamadev.enquemierdagaste;

public class Cuenta {
    private String _sDescripcion;
    private double _dSaldo;
    private int _iID;

    public Cuenta(String _sDescripcion, double _dSaldo, int _iID) {
        this._sDescripcion = _sDescripcion;
        this._dSaldo = _dSaldo;
        this._iID = _iID;
    }

    public Cuenta() {
    }

    public String get_sDescripcion() {
        return _sDescripcion;
    }

    public void set_sDescripcion(String _sDescripcion) {
        this._sDescripcion = _sDescripcion;
    }

    public double get_dSaldo() {
        return _dSaldo;
    }

    public void set_dSaldo(double _dSaldo) {
        this._dSaldo = _dSaldo;
    }

    public int get_iID() {
        return _iID;
    }

    public void set_iID(int _iID) {
        this._iID = _iID;
    }
}
