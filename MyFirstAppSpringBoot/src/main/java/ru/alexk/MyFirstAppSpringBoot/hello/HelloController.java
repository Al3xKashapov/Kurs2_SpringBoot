package ru.alexk.MyFirstAppSpringBoot.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!" , name);
    }

    //1. Создайте GET-метод updateArrayList(String s), который по url “/update-array”
    //    принимает аргумент и записывает его в ArrayList<String >, реализуйте логику -
    //    если это первый вызов метода, то создается пустой ArrayList, если он не пустой, то туда записывается значение.

    private ArrayList<String> arrayList = new ArrayList<>();

    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam String s) {
        arrayList.add(s);
        return "Value added to ArrayList: " + s;
    }

    //2. Создайте GET метод showArrayList(), который по url “/show-array” возвращается
    //    все элементы хранящиеся в ArrayList <String >, созданном в п. 1

    @GetMapping("/show-array")
    public List<String> showArrayList() {
        return arrayList;
    }

    //3. Создайте GET-метод updateHashMap(String s), который по url “/update-map”
    //    принимает аргумент и записывает его в HashMap< Integer, String>, реализуйте логику -
    //    если это первый вызов метода, то создается пустой HashMap, если он не пустой, то туда записывается значение.

    private HashMap<Integer, String> hashMap = new HashMap<>();
    private int mapCounter = 0;

    @GetMapping("/update-map")
    public String updateHashMap(@RequestParam String s) {
        hashMap.put(mapCounter++, s);
        return "Value added to HashMap: " + s;
    }

    //4. Создайте GET метод showHashMap (), который по url “/show-map”
    //    возвращается все элементы хранящиеся в HashMap<Integer, String>, созданном в п. 3

    @GetMapping("/show-map")
    public HashMap<Integer, String> showHashMap() {
        return hashMap;
    }

    //5. Создайте GET метод showAllLenght (), который по url “/show-all-lenght”
    //    возвращает текст, в котором указано количество элементов в ArrayList и HashMap

    @GetMapping("/show-all-length")
    public String showAllLength() {
        return "ArrayList size: " + arrayList.size() + ", HashMap size: " + hashMap.size();
    }
}
