@RestController
class Application{
    @RequestMapping(path="/")
    String home() {
        "Hello World"
    }
}
