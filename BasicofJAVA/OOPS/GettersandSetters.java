package com.suryansh.BasicofJAVA.OOPS;
import java.util.*;
public class GettersandSetters {

    public static void main(String[] args)
         {
             Penn p1 = new Penn();


             p1.setColor("red");
             System.out.println(p1.getColor());
             p1.settip(4);
             System.out.println(p1.getTip());
             p1.setColor("yellow");
             System.out.println(p1.getColor());

        }

    }

    class Penn {
        private String color;
        private int Tip;


        String getColor() {
            return this.color;
        }
        int getTip() {
            return this.Tip;
        }
        void setColor(String newcolor){
            color = newcolor;
        }

        void settip(int newtip){
            Tip = newtip;
        }
    }

    
