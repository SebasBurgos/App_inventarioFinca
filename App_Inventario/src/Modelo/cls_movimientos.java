package Modelo;

public class cls_movimientos {
    private String var_codigoStr;
    private String var_nombreStr;
    private int var_tipoInt; //0 entrada , 1 salida
    private int var_cantidadInt;
    private int var_stockfinalInt;
    
    public cls_movimientos(String var_codigoInt,String var_nombreStr, int var_tipoInt, int var_cantidadInt, int var_stockfinalInt)
    {
        this.var_codigoStr = var_codigoInt;
        this.var_nombreStr = var_nombreStr;
        this.var_tipoInt = var_tipoInt;
        this.var_cantidadInt = var_cantidadInt;
        this.var_stockfinalInt = var_stockfinalInt;
    }
    
    public String getVar_codigoInt()
    {
        return var_codigoStr;
    }
    public void setVar_codigoInt(String var_codigoInt)
    {
        this.var_codigoStr = var_codigoInt;
    }
    
    public int getVar_tipoInt()
    {
        return var_tipoInt;
    }
    public void setVar_tipoInt(int var_tipoInt)
    {      
        this.var_tipoInt = var_tipoInt;
    }
    
    public int getVar_cantidadInt()
    {
        return var_cantidadInt;
    }
    public void setVar_cantidadInt(int var_cantidadInt)
    {
        this.var_cantidadInt = var_cantidadInt;
    }
    
       public String getVar_nombreStr()
    {
        return var_nombreStr;
    }
    public void setVar_nombreStr(String Var_nombreStr)
    {
        this.var_nombreStr = Var_nombreStr;
    }
    
       public int getVar_stockfinalInt()
    {
        return var_stockfinalInt;
    }
    public void setvar_stockfinalInt(int var_stockfinalInt)
    {
        this.var_stockfinalInt = var_stockfinalInt;
    }
    
    
}
