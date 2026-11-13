package calculadora_ci.controller;

import calculadora_ci.service.CalculadoraService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    private final CalculadoraService service;

    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    @GetMapping("/somar")
    public int somar(@RequestParam int a,
                     @RequestParam int b) {

        return service.somar(a, b);
    }

    @GetMapping("/subtrair")
    public int subtrair(@RequestParam int a,
                        @RequestParam int b) {

        return service.subtrair(a, b);
    }

    @GetMapping("/multiplicar")
    public int multiplicar(@RequestParam int a,
                           @RequestParam int b) {

        return service.multiplicar(a, b);
    }

    @GetMapping("/dividir")
    public int dividir(@RequestParam int a,
                       @RequestParam int b) {

        return service.dividir(a, b);
    }

}
