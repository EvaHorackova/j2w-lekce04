package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Lekce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller()
@RequestMapping("/lekce")
public class LekceController {

  private final List <Lekce> seznamLekci = List.of (
          new Lekce("Lekce 1", "1.10.2023", "15:00", "Praha"),
          new Lekce("Lekce 2", "5.10.2023", "16:00", "Brno"),
          new Lekce("Lekce 3", "10.10.2023", "17:00", "Ostrava"),
          new Lekce("Lekce 4", "15.10.2023", "18:00", "Plzeň"),
          new Lekce("Lekce 5", "20.10.2023", "19:00", "České Budějovice")
  );

  @GetMapping("/")
  public ModelAndView zobrazSeznamLekci() {
    ModelAndView result = new ModelAndView("/lekce/index");
    result.addObject ("lekce", seznamLekci);
    return result;
  }
}