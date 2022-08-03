
# Convertidor de texto y numeros a binario. 

Este proeycto está hecho en java, utilizando el MVC, y está programado utilizando POO.

Algunas capturas del programa:
# Screenshots

Home:

![alt text](https://github.com/sabi-tech/Convertidor-Texto-Decimal-Binario/blob/de6778e43195f05cc5a988d2eb534c310e884128/src/Vista/1.png?raw=true)

Texto a binario:

![alt text](https://github.com/sabi-tech/Convertidor-Texto-Decimal-Binario/blob/812ae99d071789a099ac65c200fac0007cd0bbcd/src/Vista/2.png?raw=true)

Decimal a binario:

![alt text](https://github.com/sabi-tech/Convertidor-Texto-Decimal-Binario/blob/812ae99d071789a099ac65c200fac0007cd0bbcd/src/Vista/3.png?raw=true)

# Código importante


Clase Binario-Decimal

```java

public class ConvertidorBinarioDecimal 
{
    //Atributos
    
    private int x=0;
    private int p=0;
    //Metodos
    public void setX(int px)
    {
        this.x=px;
    }
    
    
   
    public void Decimal()
    {
        
       int c=0, exponente=0;
       p=0;
            do
            {
                c=(int) (x%10);
                p=p+c*(int) Math.pow(2, exponente);
                exponente++;
                x=x/10;
            }
            while(x>0);
      
    }
    
    public double getP()
    {
        return p;
    }
}
```

Clase Texto-Binario

```java
public class ConvertidorTextoBinario
{
    //Atributos
    
    private String x;
    private String p;
    //Metodos
    public void setX(String px)
    {
        this.x=px;
    }
    
    
   
    public void Tbinario()
    {
        
        p = "";
        for(char letra : x.toCharArray())
        {
            p += String.format("%16s", Integer.toBinaryString(letra));  
          
            /*
            coloqué %016d para que rellene con ceros hasta completar los 16 bits de los char que contienen los unicode. 
            Si pusiera %08d rellenaría con 0 hasta completar 8 bit y se escribirian espacios  
           */
        }
    }
    
    public String getP()
    {
        return p.replace("\u0020","\u0030");
    }
}
```


[MIT](https://choosealicense.com/licenses/mit/)
