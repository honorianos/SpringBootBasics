package oswaldoDev.sesion01.Sesion01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "greetings")
public class GrettingsController {
    private AtomicLong counter = new AtomicLong();
    private static final String template = "Hello %s";
    @GetMapping
    public Greetings greetings(@RequestParam(value = "name",defaultValue = "World") String name) {
        return new Greetings(counter.incrementAndGet(),String.format(template,name));
    }
}
