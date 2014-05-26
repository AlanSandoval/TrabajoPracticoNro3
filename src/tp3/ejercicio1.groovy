/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3

/**
 *
 * @author AlanSandoval
 */

    def list=["pol","a","b","ab","dedc"]
    //Ascendendte
    //list.sort{a,b->a.size()==b.size()?a<=>b:a.size()<=>b.size()}
    // pregunto si a=b, si es igual pregunto si a>b, y depende del resultado sale a o b
   
    //Descendente
    list.sort{a,b-> a.size()==b.size()?a<=>b:b.size()<=>a.size()}
    list.each{println it}
	


