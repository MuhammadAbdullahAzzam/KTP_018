/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAE.KTP1_018;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author R.O.G
 */
@Controller

public class DataController {
    
@RequestMapping("/data")
    public String getDataKTP(){
        return "database";
    }
}