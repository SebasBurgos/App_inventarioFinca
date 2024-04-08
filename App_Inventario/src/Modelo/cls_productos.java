package Modelo;
public class cls_productos {
    private String var_codigoStr;
    private String var_nombreStr;
    private String var_especificacionesStr;
    private float var_precioFlt;
    private String var_TipoStr;
    private int var_existenciasInt;

    public cls_productos(String var_codigoStr, String var_nombreStr, String var_especificacionesStr, float var_precioFlt, String var_TipoStr, int var_existenciasInt) {
        this.var_codigoStr = var_codigoStr;
        this.var_nombreStr = var_nombreStr;
        this.var_especificacionesStr = var_especificacionesStr;
        this.var_precioFlt = var_precioFlt;
        this.var_TipoStr = var_TipoStr;
        this.var_existenciasInt = var_existenciasInt;
    }

    public String getVar_codigoStr() {
        return var_codigoStr;
    }

    public void setVar_codigoStr(String var_codigoStr) {
        this.var_codigoStr = var_codigoStr;
    }

    public String getVar_nombreStr() {
        return var_nombreStr;
    }

    public void setVar_nombreStr(String var_nombreStr) {
        this.var_nombreStr = var_nombreStr;
    }

    public String getVar_especificacionesStr() {
        return var_especificacionesStr;
    }

    public void setVar_especificacionesStr(String var_especificacionesStr) {
        this.var_especificacionesStr = var_especificacionesStr;
    }

    public float getVar_precioFlt() {
        return var_precioFlt;
    }

    public void setVar_precioFlt(float var_precioFlt) {
        this.var_precioFlt = var_precioFlt;
    }

    public String getVar_TipoStr() {
        return var_TipoStr;
    }

    public void setVar_TipoStr(String var_TipoStr) {
        this.var_TipoStr = var_TipoStr;
    }

    public int getVar_existenciasInt() {
        return var_existenciasInt;
    }

    public void setVar_existenciasInt(int var_existenciasInt) {
        this.var_existenciasInt = var_existenciasInt;
    }
}