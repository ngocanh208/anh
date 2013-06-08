/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import play.mvc.Controller;

/**
 *
 * @author NgocAnh
 */
public class demo extends Controller{
    public static void demo1()
    {
        render();
    }
    
    public static void vidu1(){
        render();
    }
    public static void demo2()
    {
        render();
    }
    public static void demo3()
    {
        render();
    }
    public static void trangchu()
    {
        render();
    }
    public static void thongtincanhan()
    {
        render();
    }
    public static void thaydoimatkhau()
    {
        render();
    }
    public static void ketquahoctap()
    {
        render();
    }
    public static void header()
    {
        render();
    }
    public static void layout()
    {
        render();
    }
    public static void add(int name)
    {
         name +=1;
                 
                
        if(name==0){
            render();
        }
        render(name);
    }
    //may tinh
    public static void maytinh()
    {
        render();
    }
    public static void delete(String text)
    {
        text=null;
        render();
    }
    public static void tich()
    {
        int t1,t2;
        
    }
}
