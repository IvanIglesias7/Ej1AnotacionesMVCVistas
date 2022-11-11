package stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class IndexController {
	
	@Autowired gestionAlmacen gestorTorre;

    @RequestMapping(value = "/") 
public String index(Model modelo) {
     
      modelo.addAttribute("listaproductos1",gestorTorre.listarTodosProductos1());
      
     return "listaproductos1"; 
     
     }
    
     
}
