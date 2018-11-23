/*
 * @cond LICENSE
 * ######################################################################################
 * # Creative Commons BY SA                                                             #
 * #                                                                                    #
 * # Authored by Jörg Müller 2019                                                       #
 * ######################################################################################
 * @endcond
 */


/**
 * Test Mainmethode für hierarchische Typenvererbung
 * demonstriert Vewrwendung von instanceof und Casting bei Klassen mit Vererbung
 */

public class CMain
{
 

    public static void main( String[] p_args )
        {
        CAuto auto1 = new CSuv("gelb", "golf", 5, 160, false);
        CAuto auto2 = new CAuto("gruen", "VW", 5, 180);
        IFahrzeug fox = auto2;
        IFahrzeug jeep;
        jeep = auto1;
        jeep.schalte(5);
        System.out.println(auto1.getGang());
        fox.schalte(3);
        System.out.println(auto2.getGang());
        

     // nutze diese Methode für die weiteren Teile der Aufgabe
    }
}
