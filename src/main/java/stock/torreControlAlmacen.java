package stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class torreControlAlmacen {


	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		//Inversion de Control
		gestionAlmacen gestor = (gestionAlmacen) context.getBean("gestionA");
		System.out.println(gestor.listarTodosProductos1().get(0).getNombre());
		System.out.println(gestor.listarTodosProductos2().get(0).getNombre());

		
	}
	
	@RequestMapping("/")public String listaProductos1(Model modelo) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		gestionAlmacen gestor = (gestionAlmacen) context.getBean("gestionA");
		
	     modelo.addAttribute("listaproductos1",gestor.listarTodosProductos1());
	      
	     return "listaproductos1"; 
	     
	     }
}
