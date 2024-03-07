package hello.itemservice.web.basic;

import hello.itemservice.domain.item.Item;
import hello.itemservice.repository.ItemRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/basic/items")
@RequiredArgsConstructor // DI 자동 주입
public class BasicItemController {
    private final ItemRepository itemRepository;

    @GetMapping
    public String items(Model model) {
        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "basic/items";
    }

    @GetMapping("/{itemId}")
    public String itme(@PathVariable long itemId, Model model) {
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);

        return "basic/item";
    }

    @GetMapping("/add")
    public String addForm() {
        return "basic/addForm";
    }
    //itemName=itemA&price=10000&quantity=10
//    @PostMapping("/add")
    public String addItemV1(@RequestParam String itemName,
                       @RequestParam Integer price,
                       @RequestParam Integer quantity,
                       Model model) {
        Item item = new Item();
        item.setItemName(itemName);
        item.setPrice(price);
        item.setQuantity(quantity);

        itemRepository.save(item);
        model.addAttribute("item",item);

        return "basic/addForm";
    }

//    @PostMapping("/add")
    public String addItemV2(@ModelAttribute("item") Item item ,Model model) { // 모델에트리뷰트를 사용하면 객체생성부터 객체 값 세팅 까지 알아서해줌
//  < 모델 에트리뷰트가 해줌 >
//        Item item = new Item();
//        item.setItemName(itemName);
//        item.setPrice(price);
//        item.setQuantity(quantity);
        itemRepository.save(item);
        model.addAttribute("item",item);


        return "basic/addForm";
    }
//    @PostMapping("/add")
    public String addItemV3(@ModelAttribute Item item ) { // 모델에트리뷰트를 사용하면 객체생성부터 객체 값 세팅 까지 알아서해줌
        itemRepository.save(item);
        return "basic/items/";
    }
//    @PostMapping("/add")
    public String addItemV4(@ModelAttribute("item") Item item ,Model model) { // 모델에트리뷰트를 사용하면 객체생성부터 객체 값 세팅 까지 알아서해줌

        itemRepository.save(item);
        model.addAttribute("item",item);


        return "redirect:/basic/items/" +item.getId();
    }

    @PostMapping("/add")
    public String addItemV5(@ModelAttribute("item") Item item , Model model, RedirectAttributes redirectAttributes) { // 모델에트리뷰트를 사용하면 객체생성부터 객체 값 세팅 까지 알아서해줌

        Item savedItem = itemRepository.save(item);
        model.addAttribute("item",item);
        redirectAttributes.addAttribute("itemId", savedItem.getId());
        redirectAttributes.addAttribute("status", true);

        return "redirect:/basic/items/{itemId}";
    }

    @GetMapping("/{itemId}/edit")
    public String editEdit(@PathVariable long itemId, Model model) {
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);

        return "basic/editForm";
    }
    @PostMapping("/{itemId}/edit")
    public String Edit(@PathVariable long itemId, @ModelAttribute Item item, RedirectAttributes redirectAttributes ) {
        itemRepository.update(itemId, item);
        redirectAttributes.addAttribute("itemId", item.getId());
        redirectAttributes.addAttribute("status", true);
        return "redirect:/basic/items/{itemId}"; // 리다이렉트
    }




    @PostConstruct
    public void init() {
        itemRepository.save(new Item("itemA", 10000, 10));
        itemRepository.save(new Item("itemB", 20000, 20));
    }

}
