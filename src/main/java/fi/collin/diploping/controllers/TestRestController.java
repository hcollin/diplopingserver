package fi.collin.diploping.controllers;

import fi.collin.diploping.models.TestRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestRestController {

    @RequestMapping("/test")
    public TestRest test(@RequestParam(name="name", defaultValue="Matti") String name) {
        return new TestRest("Matti");
    }
}
