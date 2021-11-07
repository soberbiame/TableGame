package com.fzu.xxl;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingStyle;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class ModernArtMoney {

    public int[] paintingvalue = new int[5];
    public int flag = 0;

    public int[] paintingValue(char fcolor,char scolor,char tcolor) {
        switch(fcolor)
        {   case 'R':   paintingvalue[0] += 30;this.flag = 0;break;
            case 'O':   paintingvalue[1] += 30;this.flag = 1;break;
            case 'Y':   paintingvalue[2] += 30;this.flag = 2;break;
            case 'B':   paintingvalue[3] += 30;this.flag = 3;break;
            case 'G':   paintingvalue[4] += 30;this.flag = 4;break;
            case 'N':   break;
            default :   break;  }
        switch(scolor)
        {   case 'R':   paintingvalue[0] += 20;this.flag = 0;break;
            case 'O':   paintingvalue[1] += 20;this.flag = 1;break;
            case 'Y':   paintingvalue[2] += 20;this.flag = 2;break;
            case 'B':   paintingvalue[3] += 20;this.flag = 3;break;
            case 'G':   paintingvalue[4] += 20;this.flag = 4;break;
            case 'N':   break;
            default :   break; }
        switch(tcolor)
        {   case 'R':   paintingvalue[0] += 10;this.flag = 0;break;
            case 'O':   paintingvalue[1] += 10;this.flag = 1;break;
            case 'Y':   paintingvalue[2] += 10;this.flag = 2;break;
            case 'B':   paintingvalue[3] += 10;this.flag = 3;break;
            case 'G':   paintingvalue[4] += 10;this.flag = 4;break;
            case 'N':   break;
            default :   break;}

        return paintingvalue;
    }


public static void main(String arg[]){

    ModernArtMoney enter = new ModernArtMoney();
    enter.paintingValue('R','O','G');
    for(int i = 0;i < enter.paintingvalue.length;i++)
    {
        System.out.println(enter.paintingvalue[i]+"\t");
    }
}
}
