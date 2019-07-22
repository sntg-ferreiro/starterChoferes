package edu.educacionit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import edu.educacionit.repository.Choferes;
import edu.educacionit.service.FiltroChoferes;

@Configuration
@ComponentScan({"edu.educacionit"})
@PropertySource("app.properties")
class AppConfig {
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer get() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    @Bean(name="filtroChoferes")
    public FiltroChoferes getChoferes(){
    	return new FiltroChoferes(new Choferes());
    	
    	
    }
}

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        FiltroChoferes filtro =
        appContext.getBean("filtroChoferes", FiltroChoferes.class);
        
        filtro.getChoferesQueLesGustaSuTrabajoSinAccidentes();
        filtro.getChoferesQueLesGustaSuTrabajoConAccidentes();
        filtro.getChoferesQueNoLesGustaSuTrabajoConAccidentes();
        filtro.getChoferesQueNoLesGustaSuTrabajoSinAccidentes();
//       String acc = System.getProperty("accidentes");
//       String tra = System.getProperty("gustaTrabajo");
//           		
//       if(acc=="0") {
//    	   if(tra=="Si") {
//    		   filtro.getChoferesQueLesGustaSuTrabajoSinAccidentes();
//    	   }else {
//    		   filtro.getChoferesQueNoLesGustaSuTrabajoSinAccidentes();
//    	   }
//       }else {
//    	   if(tra=="Si") {
//    		   filtro.getChoferesQueLesGustaSuTrabajoConAccidentes();
//    	   }else {
//    		   filtro.getChoferesQueNoLesGustaSuTrabajoConAccidentes();
//    	   }
//    	   
//       }
    }
}
  